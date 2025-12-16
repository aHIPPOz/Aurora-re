package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* loaded from: classes.dex */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        /* loaded from: classes.dex */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        /* loaded from: classes.dex */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    @ResultIgnorabilityUnspecified
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        long j;
        Throwable th;
        VersionPolicy.SelectionResult selectModule;
        int i;
        DynamiteModule dynamiteModule;
        Boolean bool;
        DynamiteModule dynamiteModule2;
        IObjectWrapper iObjectWrapper;
        zzr zzrVar;
        Boolean valueOf;
        IObjectWrapper iObjectWrapper2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = zzg;
            zzn zznVar = (zzn) threadLocal.get();
            zzn zznVar2 = new zzn(null);
            threadLocal.set(zznVar2);
            ThreadLocal threadLocal2 = zzh;
            long longValue = ((Long) threadLocal2.get()).longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                selectModule = versionPolicy.selectModule(context, str, zzi);
                i = selectModule.localVersion;
                j = longValue;
            } catch (Throwable th2) {
                th = th2;
                j = longValue;
            }
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i + " and remote module " + str + ":" + selectModule.remoteVersion);
                int i2 = selectModule.selection;
                if (i2 != 0) {
                    if (i2 == -1) {
                        if (selectModule.localVersion != 0) {
                            i2 = -1;
                        }
                    }
                    if (i2 != 1 || selectModule.remoteVersion != 0) {
                        if (i2 == -1) {
                            dynamiteModule = zzc(applicationContext, str);
                        } else if (i2 != 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                        } else {
                            try {
                                int i3 = selectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (!zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool == null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar == null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zzn zznVar3 = (zzn) threadLocal.get();
                                        if (zznVar3 == null || zznVar3.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = zznVar3.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            valueOf = Boolean.valueOf(zze >= 2);
                                        }
                                        if (valueOf.booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            iObjectWrapper2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            iObjectWrapper2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper2);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule2 = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        zzq zzg2 = zzg(context);
                                        if (zzg2 == null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        int zze2 = zzg2.zze();
                                        if (zze2 >= 3) {
                                            zzn zznVar4 = (zzn) threadLocal.get();
                                            if (zznVar4 == null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapper = zzg2.zzi(ObjectWrapper.wrap(context), str, i3, ObjectWrapper.wrap(zznVar4.zza));
                                        } else if (zze2 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapper = zzg2.zzj(ObjectWrapper.wrap(context), str, i3);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapper = zzg2.zzh(ObjectWrapper.wrap(context), str, i3);
                                        }
                                        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                                        if (unwrap == null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule2 = new DynamiteModule((Context) unwrap);
                                    }
                                    dynamiteModule = dynamiteModule2;
                                } catch (RemoteException e) {
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th3) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th3);
                                    throw new LoadingException("Failed to load remote module.", th3, null);
                                }
                            } catch (LoadingException e3) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                                int i4 = selectModule.localVersion;
                                if (i4 == 0 || versionPolicy.selectModule(context, str, new zzo(i4, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                }
                                dynamiteModule = zzc(applicationContext, str);
                            }
                        }
                        if (j == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(Long.valueOf(j));
                        }
                        Cursor cursor2 = zznVar2.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        zzg.set(zznVar);
                        return dynamiteModule;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
            } catch (Throwable th4) {
                th = th4;
                if (j == 0) {
                    zzh.remove();
                } else {
                    zzh.set(Long.valueOf(j));
                }
                Cursor cursor3 = zznVar2.zza;
                if (cursor3 != null) {
                    cursor3.close();
                }
                zzg.set(zznVar);
                throw th;
            }
        }
        throw new LoadingException("null application Context", null);
    }

    public static int zza(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String obj = e.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzd(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!zzf(context)) {
                            return 0;
                        } else {
                            if (zzd || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int zzb2 = zzb(context, str, z, true);
                                    String str2 = zzc;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader zza2 = zzb.zza();
                                        if (zza2 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = zzc;
                                                Preconditions.checkNotNull(str3);
                                                zza2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = zzc;
                                                Preconditions.checkNotNull(str4);
                                                zza2 = new zzc(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        zzd(zza2);
                                        declaredField.set(null, zza2);
                                        zzb = Boolean.TRUE;
                                        return zzb2;
                                    }
                                    return zzb2;
                                } catch (LoadingException unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        zzb = bool;
                    }
                }
                if (!bool.booleanValue()) {
                    zzq zzg2 = zzg(context);
                    if (zzg2 != null) {
                        try {
                            try {
                                int zze2 = zzg2.zze();
                                if (zze2 >= 3) {
                                    zzn zznVar = (zzn) zzg.get();
                                    if (zznVar == null || (cursor = zznVar.zza) == null) {
                                        Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzg2.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                        if (cursor3 != null) {
                                            try {
                                                if (cursor3.moveToFirst()) {
                                                    int i2 = cursor3.getInt(0);
                                                    if (i2 <= 0 || !zze(cursor3)) {
                                                        cursor2 = cursor3;
                                                    }
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    i = i2;
                                                }
                                            } catch (RemoteException e2) {
                                                remoteException = e2;
                                                cursor2 = cursor3;
                                                String message = remoteException.getMessage();
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                return i;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor2 = cursor3;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    } else {
                                        i = cursor.getInt(0);
                                    }
                                } else if (zze2 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                    i = zzg2.zzg(ObjectWrapper.wrap(context), str, z);
                                } else {
                                    Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                    i = zzg2.zzf(ObjectWrapper.wrap(context), str, z);
                                }
                            } catch (RemoteException e3) {
                                remoteException = e3;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    return i;
                }
                try {
                    return zzb(context, str, z, false);
                } catch (LoadingException e4) {
                    String message2 = e4.getMessage();
                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                    return 0;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (!Boolean.TRUE.equals(null) && !Boolean.TRUE.equals(zzf)) {
            boolean z = false;
            if (zzf == null) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
                if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                zzf = valueOf;
                z = valueOf.booleanValue();
                if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                    Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                    zzd = true;
                }
            }
            if (!z) {
                Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
            }
            return z;
        }
        return true;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context getModuleContext() {
        return this.zzj;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
