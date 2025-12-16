package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbxv implements zzbya {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhdk zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxx zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxv(Context context, VersionInfoParcel versionInfoParcel, zzbxx zzbxxVar, String str, zzbxw zzbxwVar) {
        Preconditions.checkNotNull(zzbxxVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxxVar;
        for (String str2 : zzbxxVar.zze) {
            this.zzk.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhdk zzc2 = zzhfm.zzc();
        zzc2.zzn(9);
        if (str != null) {
            zzc2.zzj(str);
            zzc2.zzh(str);
        }
        zzhdl zzc3 = zzhdm.zzc();
        String str3 = this.zzi.zza;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        zzc2.zzg((zzhdm) zzc3.zzbr());
        zzhfa zzc4 = zzhfb.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str4 = versionInfoParcel.afmaVersion;
        if (str4 != null) {
            zzc4.zza(str4);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhfb) zzc4.zzbr());
        this.zzd = zzc2;
    }

    public static /* synthetic */ ListenableFuture zzb(zzbxv zzbxvVar, Map map) {
        int length;
        zzhey zzheyVar;
        ListenableFuture zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = zzbxvVar.zzj;
                        synchronized (obj) {
                            length = optJSONArray.length();
                            synchronized (obj) {
                                zzheyVar = (zzhey) zzbxvVar.zze.get(str);
                            }
                        }
                        if (zzheyVar == null) {
                            zzbxz.zza("Cannot find the corresponding resource object for " + str);
                        } else {
                            boolean z = false;
                            for (int i = 0; i < length; i++) {
                                zzheyVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            boolean z2 = zzbxvVar.zza;
                            if (length > 0) {
                                z = true;
                            }
                            zzbxvVar.zza = z | z2;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbfm.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgdn.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (zzbxvVar.zza) {
            synchronized (zzbxvVar.zzj) {
                zzbxvVar.zzd.zzn(10);
            }
        }
        boolean z3 = zzbxvVar.zza;
        if ((!z3 || !zzbxvVar.zzi.zzg) && ((!zzbxvVar.zzm || !zzbxvVar.zzi.zzf) && (z3 || !zzbxvVar.zzi.zzd))) {
            return zzgdn.zzh(null);
        }
        synchronized (zzbxvVar.zzj) {
            for (zzhey zzheyVar2 : zzbxvVar.zze.values()) {
                zzbxvVar.zzd.zzc((zzhez) zzheyVar2.zzbr());
            }
            zzhdk zzhdkVar = zzbxvVar.zzd;
            zzhdkVar.zza(zzbxvVar.zzf);
            zzhdkVar.zzb(zzbxvVar.zzg);
            if (zzbxz.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzhdkVar.zzl() + "\n  clickUrl: " + zzhdkVar.zzk() + "\n  resources: \n");
                for (zzhez zzhezVar : zzhdkVar.zzm()) {
                    sb.append("    [");
                    sb.append(zzhezVar.zzc());
                    sb.append("] ");
                    sb.append(zzhezVar.zzg());
                }
                zzbxz.zza(sb.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbo(zzbxvVar.zzh).zzb(1, zzbxvVar.zzi.zzb, null, ((zzhfm) zzhdkVar.zzbr()).zzaV());
            if (zzbxz.zzb()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxs
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = zzbxv.zzb;
                        zzbxz.zza("Pinged SB successfully.");
                    }
                }, zzcaf.zza);
            }
            zzm = zzgdn.zzm(zzb2, new zzfve() { // from class: com.google.android.gms.internal.ads.zzbxt
                @Override // com.google.android.gms.internal.ads.zzfve
                public final Object apply(Object obj2) {
                    String str2 = (String) obj2;
                    int i3 = zzbxv.zzb;
                    return null;
                }
            }, zzcaf.zzg);
        }
        return zzm;
    }

    public static /* synthetic */ void zzd(zzbxv zzbxvVar, Bitmap bitmap) {
        zzgxx zzt = zzgxz.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (zzbxvVar.zzj) {
            zzhdk zzhdkVar = zzbxvVar.zzd;
            zzhes zzc2 = zzheu.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhdkVar.zzi((zzheu) zzc2.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbya
    public final zzbxx zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbya
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzhey) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhey zzd = zzhez.zzd();
            int zza = zzhex.zza(i);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(linkedHashMap.size());
            zzd.zzd(str);
            zzhdx zzc2 = zzhea.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhdv zzc3 = zzhdw.zzc();
                        zzc3.zza(zzgxz.zzw(str2));
                        zzc3.zzb(zzgxz.zzw(str3));
                        zzc2.zza((zzhdw) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhea) zzc2.zzbr());
            linkedHashMap.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbya
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzh = zzgdn.zzh(Collections.emptyMap());
            zzgcu zzgcuVar = new zzgcu() { // from class: com.google.android.gms.internal.ads.zzbxq
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj) {
                    return zzbxv.zzb(zzbxv.this, (Map) obj);
                }
            };
            zzgdy zzgdyVar = zzcaf.zzg;
            ListenableFuture zzn = zzgdn.zzn(zzh, zzgcuVar, zzgdyVar);
            ListenableFuture zzo = zzgdn.zzo(zzn, 10L, TimeUnit.SECONDS, zzcaf.zzd);
            zzgdn.zzr(zzn, new zzbxu(this, zzo), zzgdyVar);
            zzc.add(zzo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxx r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L85
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L85
            com.google.android.gms.ads.internal.zzv.zzr()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L73
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2d
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2d
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2d
            if (r3 == 0) goto L26
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2d
            goto L27
        L26:
            r3 = r1
        L27:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2b
            goto L36
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            r2 = move-exception
            r3 = r1
        L2f:
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r2)
        L36:
            if (r3 != 0) goto L72
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            if (r2 == 0) goto L61
            if (r3 != 0) goto L45
            goto L61
        L45:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L69
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L69
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L69
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L69
            r1 = r4
            goto L73
        L61:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.RuntimeException -> L69
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r8)     // Catch: java.lang.RuntimeException -> L69
            goto L73
        L69:
            r8 = move-exception
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r8)
            goto L73
        L72:
            r1 = r3
        L73:
            if (r1 != 0) goto L7b
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxz.zza(r8)
            return
        L7b:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxr r8 = new com.google.android.gms.internal.ads.zzbxr
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxv.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbya
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbya
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
