package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzahe {
    public static final zzahc zza = new Object() { // from class: com.google.android.gms.internal.ads.zzahc
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzav zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzahc r13, com.google.android.gms.internal.ads.zzagq r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahe.zza(byte[], int, com.google.android.gms.internal.ads.zzahc, com.google.android.gms.internal.ads.zzagq):com.google.android.gms.internal.ads.zzav");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i3 = zzd + 1;
            if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            } else {
                return length;
            }
        }
    }

    private static int zze(zzen zzenVar, int i) {
        byte[] zzN = zzenVar.zzN();
        int zzc = zzenVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < zzc + i) {
                if ((zzN[i2] & 255) == 255 && zzN[i3] == 0) {
                    System.arraycopy(zzN, i2 + 2, zzN, i3, (i - (i2 - zzc)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    private static zzfyq zzf(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfyq.zzo(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        int i3 = zzfyq.zzd;
        zzfyn zzfynVar = new zzfyn();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfynVar.zzf(new String(bArr, i2, zzc - i2, zzi(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfyq zzi = zzfynVar.zzi();
        return zzi.isEmpty() ? zzfyq.zzo(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : zzi;
    }

    private static String zzg(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : new String(bArr, i, i2 - i, charset);
    }

    private static String zzh(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzj(com.google.android.gms.internal.ads.zzen r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.zzc()
        L8:
            int r3 = r1.zza()     // Catch: java.lang.Throwable -> La8
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La4
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r1.zzg()     // Catch: java.lang.Throwable -> La8
            long r8 = r1.zzu()     // Catch: java.lang.Throwable -> La8
            int r10 = r1.zzq()     // Catch: java.lang.Throwable -> La8
            goto L2c
        L22:
            int r7 = r1.zzo()     // Catch: java.lang.Throwable -> La8
            int r8 = r1.zzo()     // Catch: java.lang.Throwable -> La8
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            goto La4
        L38:
            r7 = 4
            if (r0 != r7) goto L68
            if (r24 != 0) goto L68
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L48
        L45:
            r4 = r6
            goto La4
        L48:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L68:
            if (r0 != r7) goto L78
            r3 = r10 & 64
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r4 = r6
        L70:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8a
        L78:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L80
            r3 = r4
            goto L81
        L80:
            r3 = r6
        L81:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L8a
        L86:
            r4 = r6
            goto L8a
        L88:
            r3 = r6
            r4 = r3
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La8
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L94
            goto L45
        L94:
            int r3 = r1.zza()     // Catch: java.lang.Throwable -> La8
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9e
            goto L45
        L9e:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La8
            r1.zzM(r3)     // Catch: java.lang.Throwable -> La8
            goto L8
        La4:
            r1.zzL(r2)
            return r4
        La8:
            r0 = move-exception
            r1.zzL(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahe.zzj(com.google.android.gms.internal.ads.zzen, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzex.zzb;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0287, code lost:
        if (r9 == 67) goto L148;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0500  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzahf zzl(int r33, com.google.android.gms.internal.ads.zzen r34, boolean r35, int r36, com.google.android.gms.internal.ads.zzahc r37) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahe.zzl(int, com.google.android.gms.internal.ads.zzen, boolean, int, com.google.android.gms.internal.ads.zzahc):com.google.android.gms.internal.ads.zzahf");
    }

    private static Charset zzi(int i) {
        if (i != 1) {
            if (i == 2) {
                return StandardCharsets.UTF_16BE;
            }
            if (i == 3) {
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.ISO_8859_1;
        }
        return StandardCharsets.UTF_16;
    }
}
