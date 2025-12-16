package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhh extends zzgc {
    private final Context zza;
    private zzgo zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhh(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    private static int zzk(String str) throws zzhg {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhg("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgo zzgoVar) throws zzhg {
        Resources resources;
        int i;
        String str;
        Uri normalizeScheme = zzgoVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                i = zzk(pathSegments.get(0));
            } else {
                int size = pathSegments.size();
                throw new zzhg("rawresource:// URI must have exactly one path element, found " + size);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                str = context.getPackageName();
            } else {
                str = normalizeScheme.getHost();
            }
            if (str.equals(context.getPackageName())) {
                resources = context.getResources();
            } else {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(str);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhg("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                i = zzk(path);
            } else {
                i = resources.getIdentifier(str + ":" + path, "raw", null);
                if (i == 0) {
                    throw new zzhg("Resource not found.", null, 2005);
                }
            }
        } else {
            String scheme = normalizeScheme.getScheme();
            throw new zzhg("Unsupported URI scheme (" + scheme + "). Only android.resource is supported.", null, PointerIconCompat.TYPE_WAIT);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new zzhg("Resource is compressed: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, 2000);
            }
            return openRawResourceFd;
        } catch (Resources.NotFoundException e2) {
            throw new zzhg(null, e2, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzhg {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhg(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzex.zza;
        InputStream inputStream2 = inputStream;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zze != -1) {
                throw new zzhg("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws zzhg {
        long j;
        this.zzb = zzgoVar;
        zzi(zzgoVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzgoVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0) {
            try {
                if (zzgoVar.zze > length) {
                    throw new zzhg(null, null, 2008);
                }
            } catch (zzhg e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhg(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j2 = zzgoVar.zze;
        long skip = fileInputStream.skip(startOffset + j2) - startOffset;
        if (skip != j2) {
            throw new zzhg(null, null, 2008);
        }
        if (i == 0) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.zze = j;
                if (j < 0) {
                    throw new zzhg(null, null, 2008);
                }
            }
        } else {
            j = length - skip;
            this.zze = j;
            if (j < 0) {
                throw new zzgk(2008);
            }
        }
        long j3 = zzgoVar.zzf;
        int i2 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        if (i2 != 0) {
            this.zze = j == -1 ? j3 : Math.min(j, j3);
        }
        this.zzf = true;
        zzj(zzgoVar);
        return i2 != 0 ? j3 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        zzgo zzgoVar = this.zzb;
        if (zzgoVar != null) {
            return zzgoVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzhg {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzd;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e) {
                    throw new zzhg(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new zzhg(null, e2, 2000);
            }
        } finally {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzh();
            }
        }
    }
}
