package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgg extends zzgc {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgg(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgf {
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
                throw new zzgf(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        String str = zzex.zza;
        FileInputStream fileInputStream2 = fileInputStream;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
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
    public final long zzb(zzgo zzgoVar) throws zzgf {
        int i;
        IOException e;
        AssetFileDescriptor assetFileDescriptor;
        long j;
        try {
            try {
                Uri normalizeScheme = zzgoVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzgoVar);
                if (Objects.equals(normalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = assetFileDescriptor;
                if (assetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new zzgf(new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme)), 2000);
                    } catch (IOException e2) {
                        e = e2;
                        throw new zzgf(e, true != (e instanceof FileNotFoundException) ? i : 2005);
                    }
                }
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && zzgoVar.zze > length) {
                    throw new zzgf(null, 2008);
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j2 = zzgoVar.zze;
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new zzgf(null, 2008);
                }
                if (i2 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.zze = j;
                        if (j < 0) {
                            throw new zzgf(null, 2008);
                        }
                    }
                } else {
                    j = length - skip;
                    this.zze = j;
                    if (j < 0) {
                        throw new zzgf(null, 2008);
                    }
                }
                long j3 = zzgoVar.zzf;
                int i3 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                if (i3 != 0) {
                    this.zze = j == -1 ? j3 : Math.min(j, j3);
                }
                this.zzf = true;
                zzj(zzgoVar);
                return i3 != 0 ? j3 : this.zze;
            } catch (zzgf e3) {
                throw e3;
            }
        } catch (IOException e4) {
            e = e4;
            i = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzgf {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e) {
                    throw new zzgf(e, 2000);
                }
            } catch (IOException e2) {
                throw new zzgf(e2, 2000);
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
