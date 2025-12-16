package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbaj extends zzbae {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbae
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int zza = zzbai.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr = allocate.array();
        } else {
            if (length >= 5) {
                bArr2 = new byte[length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zza2 = zzbai.zza(split[i2]);
                    bArr2[i2] = (byte) ((zza2 >> 24) ^ (((zza2 & 255) ^ ((zza2 >> 8) & 255)) ^ ((zza2 >> 16) & 255)));
                }
            } else {
                bArr2 = new byte[length + length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int zza3 = zzbai.zza(split[i3]);
                    int i4 = (zza3 >> 16) ^ ((char) zza3);
                    byte b = (byte) i4;
                    byte b2 = (byte) (i4 >> 8);
                    int i5 = i3 + i3;
                    bArr2[i5] = new byte[]{b, b2}[0];
                    bArr2[i5 + 1] = b2;
                }
            }
            bArr = bArr2;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArr);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(digest, 0, bArr3, 0, i);
            return bArr3;
        }
    }
}
