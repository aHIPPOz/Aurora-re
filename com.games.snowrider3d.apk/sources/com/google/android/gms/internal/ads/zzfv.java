package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfv {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        zzdd.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i - 3;
        } else if (i3 <= 1 || !zArr[1] || bArr[i] != 1) {
            if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
                int i4 = i2 - 1;
                int i5 = i + 2;
                while (i5 < i4) {
                    byte b = bArr[i5];
                    if ((b & 254) == 0) {
                        int i6 = i5 - 2;
                        if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                            zzi(zArr);
                            return i6;
                        }
                        i5 = i6;
                    }
                    i5 += 3;
                }
                zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
                zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
                if (bArr[i4] == 0) {
                    z = true;
                }
                zArr[2] = z;
                return i2;
            }
            zzi(zArr);
            return i - 1;
        } else {
            zzi(zArr);
            return i - 2;
        }
    }

    public static int zzb(zzz zzzVar) {
        String str = zzzVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || zzay.zzg(zzzVar.zzk, "video/hevc")) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cf  */
    /* JADX WARN: Type inference failed for: r26v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfp zzd(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.zzfs r39) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzd(byte[], int, int, com.google.android.gms.internal.ads.zzfs):com.google.android.gms.internal.ads.zzfp");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfs zze(byte[] r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfs");
    }

    public static zzft zzf(byte[] bArr, int i, int i2) {
        zzfw zzfwVar = new zzfw(bArr, 4, i2);
        int zzc2 = zzfwVar.zzc();
        int zzc3 = zzfwVar.zzc();
        zzfwVar.zze();
        return new zzft(zzc2, zzc3, zzfwVar.zzh());
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfu zzg(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzg(byte[], int, int):com.google.android.gms.internal.ads.zzfu");
    }

    public static String zzh(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = zzfyq.zzd;
                zzfyn zzfynVar = new zzfyn();
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int zza2 = zza(bArr, i3, length2, zArr);
                    if (zza2 != length2) {
                        zzfynVar.zzf(Integer.valueOf(zza2));
                    }
                    i3 = zza2 + 3;
                }
                zzfyq zzi = zzfynVar.zzi();
                for (int i4 = 0; i4 < zzi.size(); i4++) {
                    if (((Integer) zzi.get(i4)).intValue() + 3 < length) {
                        zzfw zzfwVar = new zzfw(bArr, ((Integer) zzi.get(i4)).intValue() + 3, length);
                        zzfj zzm = zzm(zzfwVar);
                        if (zzm.zza == 33 && zzm.zzb == 0) {
                            zzfwVar.zzf(4);
                            int zza3 = zzfwVar.zza(3);
                            zzfwVar.zze();
                            zzfk zzn = zzn(zzfwVar, true, zza3, null);
                            return zzdk.zzd(zzn.zza, zzn.zzb, zzn.zzc, zzn.zzd, zzn.zze, zzn.zzf);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzj(byte[] bArr, int i, int i2, zzz zzzVar) {
        String str = zzzVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) != 0) {
                return true;
            }
            int i3 = b & Ascii.US;
            return (i3 == 1 || i3 == 9 || i3 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzfj zzm = zzm(new zzfw(bArr, 4, i2 + 4));
            int i4 = zzm.zza;
            if (i4 == 35) {
                return false;
            }
            return (i4 <= 14 && i4 % 2 == 0 && zzm.zzc == zzzVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    private static int zzk(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 == 1) {
            i5 = 2;
        }
        return i - (i5 * (i3 + i4));
    }

    private static int zzl(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    private static zzfj zzm(zzfw zzfwVar) {
        zzfwVar.zze();
        return new zzfj(zzfwVar.zza(6), zzfwVar.zza(6), zzfwVar.zza(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfk zzn(com.google.android.gms.internal.ads.zzfw r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzfk r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L3c
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r0.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.zzh()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
            goto L49
        L3c:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
        L49:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zza(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.zzh()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzf(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L79:
            com.google.android.gms.internal.ads.zzfk r11 = new com.google.android.gms.internal.ads.zzfk
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfv.zzn(com.google.android.gms.internal.ads.zzfw, boolean, int, com.google.android.gms.internal.ads.zzfk):com.google.android.gms.internal.ads.zzfk");
    }

    private static void zzo(zzfw zzfwVar) {
        int zzc2 = zzfwVar.zzc() + 1;
        zzfwVar.zzf(8);
        for (int i = 0; i < zzc2; i++) {
            zzfwVar.zzc();
            zzfwVar.zzc();
            zzfwVar.zze();
        }
        zzfwVar.zzf(20);
    }

    public static int zzc(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}
