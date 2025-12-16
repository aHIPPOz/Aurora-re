package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhcj {
    private static final zzhcg zza;

    static {
        if (zzhce.zzA() && zzhce.zzB()) {
            int i = zzgxm.zza;
        }
        zza = new zzhch();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
        } else if (i3 == 1) {
            return zzj(b, bArr[i]);
        } else {
            if (i3 == 2) {
                return zzk(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzd(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcj.zzd(java.lang.String, byte[], int, int):int");
    }

    public static int zze(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new zzhci(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int zzf(int i, byte[] bArr, int i2, int i3) {
        return zza.zza(i, bArr, i2, i3);
    }

    public static String zzg(ByteBuffer byteBuffer, int i, int i2) throws zzgzw {
        zzhcg zzhcgVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhcgVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        } else if (byteBuffer.isDirect()) {
            return zzhch.zzc(byteBuffer, i, i2);
        } else {
            return zzhcg.zzc(byteBuffer, i, i2);
        }
    }

    public static String zzh(byte[] bArr, int i, int i2) throws zzgzw {
        return zza.zzb(bArr, i, i2);
    }

    public static boolean zzi(byte[] bArr, int i, int i2) {
        return zza.zza(0, bArr, i, i2) == 0;
    }

    public static int zzj(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int zzk(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
