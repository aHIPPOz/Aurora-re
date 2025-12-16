package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
final class zzhch extends zzhcg {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0080, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhch.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final String zzb(byte[] bArr, int i, int i2) throws zzgzw {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!zzhcf.zzd(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (zzhcf.zzd(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (zzhcf.zzd(b3)) {
                        i++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (zzhcf.zzf(b2)) {
                    if (i7 < i4) {
                        i3 = i6 + 1;
                        i += 2;
                        zzhcf.zzc(b2, bArr[i7], cArr, i6);
                    } else {
                        throw new zzgzw("Protocol message had invalid UTF-8.");
                    }
                } else if (zzhcf.zze(b2)) {
                    if (i7 < i4 - 1) {
                        i3 = i6 + 1;
                        int i8 = i + 2;
                        i += 3;
                        zzhcf.zzb(b2, bArr[i7], bArr[i8], cArr, i6);
                    } else {
                        throw new zzgzw("Protocol message had invalid UTF-8.");
                    }
                } else if (i7 < i4 - 2) {
                    int i9 = i + 3;
                    i += 4;
                    zzhcf.zza(b2, bArr[i7], bArr[i + 2], bArr[i9], cArr, i6);
                    i6 += 2;
                } else {
                    throw new zzgzw("Protocol message had invalid UTF-8.");
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }
}
