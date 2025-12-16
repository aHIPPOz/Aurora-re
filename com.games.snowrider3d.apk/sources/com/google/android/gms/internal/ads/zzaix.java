package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaix {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);

    static {
        String str = zzex.zza;
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    public static zzav zzb(zzfc zzfcVar) {
        zzfa zzfaVar;
        zzfd zzb2 = zzfcVar.zzb(1751411826);
        zzfd zzb3 = zzfcVar.zzb(1801812339);
        zzfd zzb4 = zzfcVar.zzb(1768715124);
        if (zzb2 != null && zzb3 != null && zzb4 != null && zzi(zzb2.zza) == 1835299937) {
            zzen zzenVar = zzb3.zza;
            zzenVar.zzL(12);
            int zzg = zzenVar.zzg();
            String[] strArr = new String[zzg];
            for (int i = 0; i < zzg; i++) {
                int zzg2 = zzenVar.zzg();
                zzenVar.zzM(4);
                strArr[i] = zzenVar.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzen zzenVar2 = zzb4.zza;
            zzenVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzenVar2.zza() > 8) {
                int zzc = zzenVar2.zzc() + zzenVar2.zzg();
                int zzg3 = zzenVar2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzea.zzf("BoxParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    while (true) {
                        int zzc2 = zzenVar2.zzc();
                        if (zzc2 >= zzc) {
                            zzfaVar = null;
                            break;
                        }
                        int zzg4 = zzenVar2.zzg();
                        if (zzenVar2.zzg() != 1684108385) {
                            zzenVar2.zzL(zzc2 + zzg4);
                        } else {
                            int zzg5 = zzenVar2.zzg();
                            int zzg6 = zzenVar2.zzg();
                            int i2 = zzg4 - 16;
                            byte[] bArr = new byte[i2];
                            zzenVar2.zzH(bArr, 0, i2);
                            zzfaVar = new zzfa(str, bArr, zzg6, zzg5);
                            break;
                        }
                    }
                    if (zzfaVar != null) {
                        arrayList.add(zzfaVar);
                    }
                }
                zzenVar2.zzL(zzc);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    public static zzav zzc(zzfd zzfdVar) {
        int i;
        zzen zzenVar = zzfdVar.zza;
        zzenVar.zzL(8);
        zzav zzavVar = new zzav(-9223372036854775807L, new zzau[0]);
        while (zzenVar.zza() >= 8) {
            int zzc = zzenVar.zzc();
            int zzg = zzenVar.zzg() + zzc;
            int zzg2 = zzenVar.zzg();
            zzav zzavVar2 = null;
            if (zzg2 == 1835365473) {
                zzenVar.zzL(zzc);
                zzenVar.zzM(8);
                zzg(zzenVar);
                while (true) {
                    if (zzenVar.zzc() >= zzg) {
                        break;
                    }
                    int zzc2 = zzenVar.zzc();
                    int zzg3 = zzenVar.zzg() + zzc2;
                    if (zzenVar.zzg() != 1768715124) {
                        zzenVar.zzL(zzg3);
                    } else {
                        zzenVar.zzL(zzc2);
                        zzenVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzenVar.zzc() < zzg3) {
                            zzau zza2 = zzajf.zza(zzenVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzavVar2 = new zzav(arrayList);
                        }
                    }
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (zzg2 == 1936553057) {
                zzenVar.zzL(zzc);
                zzenVar.zzM(12);
                while (true) {
                    if (zzenVar.zzc() >= zzg) {
                        break;
                    }
                    int zzc3 = zzenVar.zzc();
                    int zzg4 = zzenVar.zzg();
                    if (zzenVar.zzg() != 1935766900) {
                        zzenVar.zzL(zzc3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzenVar.zzM(4);
                        int i2 = -1;
                        int i3 = 0;
                        for (int i4 = 0; i4 < 2; i4++) {
                            int zzm = zzenVar.zzm();
                            int zzm2 = zzenVar.zzm();
                            if (zzm == 0) {
                                i2 = zzm2;
                            } else if (zzm == 1) {
                                i3 = zzm2;
                            }
                        }
                        if (i2 == 12) {
                            i = 240;
                        } else if (i2 == 13) {
                            i = 120;
                        } else {
                            if (i2 == 21 && zzenVar.zza() >= 8 && zzenVar.zzc() + 8 <= zzg) {
                                int zzg5 = zzenVar.zzg();
                                int zzg6 = zzenVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    i = zzenVar.zzn();
                                }
                            }
                            i = -2147483647;
                        }
                        if (i != -2147483647) {
                            zzavVar2 = new zzav(-9223372036854775807L, new zzahp(i, i3));
                        }
                    }
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (zzg2 == -1451722374) {
                zzavVar = zzavVar.zzd(zzm(zzenVar));
            }
            zzenVar.zzL(zzg);
        }
        return zzavVar;
    }

    public static zzfh zzd(zzen zzenVar) {
        long j;
        long j2;
        zzenVar.zzL(8);
        if (zza(zzenVar.zzg()) == 0) {
            j2 = zzenVar.zzu();
            j = zzenVar.zzu();
        } else {
            j2 = zzenVar.zzt();
            j = zzenVar.zzt();
        }
        return new zzfh(j2, j, zzenVar.zzu());
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzajs zze(com.google.android.gms.internal.ads.zzajp r45, com.google.android.gms.internal.ads.zzfc r46, com.google.android.gms.internal.ads.zzaej r47) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zze(com.google.android.gms.internal.ads.zzajp, com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaej):com.google.android.gms.internal.ads.zzajs");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
        r21 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0b75  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0d66  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0e10 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzfc r78, com.google.android.gms.internal.ads.zzaej r79, long r80, com.google.android.gms.internal.ads.zzs r82, boolean r83, boolean r84, com.google.android.gms.internal.ads.zzfve r85) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 3610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zzf(com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaej, long, com.google.android.gms.internal.ads.zzs, boolean, boolean, com.google.android.gms.internal.ads.zzfve):java.util.List");
    }

    public static void zzg(zzen zzenVar) {
        int zzc = zzenVar.zzc();
        zzenVar.zzM(4);
        if (zzenVar.zzg() != 1751411826) {
            zzc += 4;
        }
        zzenVar.zzL(zzc);
    }

    private static int zzh(zzen zzenVar) {
        int zzm = zzenVar.zzm();
        int i = zzm & WorkQueueKt.MASK;
        while ((zzm & 128) == 128) {
            zzm = zzenVar.zzm();
            i = (i << 7) | (zzm & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzi(zzen zzenVar) {
        zzenVar.zzL(16);
        return zzenVar.zzg();
    }

    private static Pair zzj(zzen zzenVar, int i, int i2) throws zzaz {
        Pair pair;
        Integer num;
        zzajq zzajqVar;
        int i3;
        int i4;
        boolean z;
        Integer num2;
        int zzc = zzenVar.zzc();
        while (zzc - i < i2) {
            zzenVar.zzL(zzc);
            int zzg = zzenVar.zzg();
            boolean z2 = true;
            zzadz.zzc(zzg > 0, "childAtomSize must be positive");
            if (zzenVar.zzg() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = 0;
                int i7 = -1;
                Integer num3 = null;
                String str = null;
                while (i5 - zzc < zzg) {
                    zzenVar.zzL(i5);
                    int zzg2 = zzenVar.zzg();
                    int zzg3 = zzenVar.zzg();
                    if (zzg3 == 1718775137) {
                        num3 = Integer.valueOf(zzenVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzenVar.zzM(4);
                        str = zzenVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i7 = i5;
                        i6 = zzg2;
                    }
                    i5 += zzg2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzadz.zzc(num3 != null, "frma atom is mandatory");
                    zzadz.zzc(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num3;
                            zzajqVar = null;
                            break;
                        }
                        zzenVar.zzL(i8);
                        int zzg4 = zzenVar.zzg();
                        if (zzenVar.zzg() == 1952804451) {
                            int zza2 = zza(zzenVar.zzg());
                            zzenVar.zzM(1);
                            if (zza2 == 0) {
                                zzenVar.zzM(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzm = zzenVar.zzm();
                                i3 = zzm & 15;
                                i4 = (zzm & 240) >> 4;
                            }
                            if (zzenVar.zzm() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int zzm2 = zzenVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzenVar.zzH(bArr2, 0, 16);
                            if (z && zzm2 == 0) {
                                int zzm3 = zzenVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzenVar.zzH(bArr3, 0, zzm3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzajqVar = new zzajq(z, str, zzm2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzg4;
                        }
                    }
                    if (zzajqVar == null) {
                        z2 = false;
                    }
                    zzadz.zzc(z2, "tenc atom is mandatory");
                    String str2 = zzex.zza;
                    pair = Pair.create(num, zzajqVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            zzc += zzg;
        }
        return null;
    }

    private static zzk zzk(zzen zzenVar) {
        zzi zziVar = new zzi();
        byte[] zzN = zzenVar.zzN();
        zzem zzemVar = new zzem(zzN, zzN.length);
        zzemVar.zzl(zzenVar.zzc() * 8);
        zzemVar.zzo(1);
        int zzd = zzemVar.zzd(8);
        for (int i = 0; i < zzd; i++) {
            zzemVar.zzo(1);
            int zzd2 = zzemVar.zzd(8);
            for (int i2 = 0; i2 < zzd2; i2++) {
                zzemVar.zzn(6);
                boolean zzp = zzemVar.zzp();
                zzemVar.zzm();
                zzemVar.zzo(11);
                zzemVar.zzn(4);
                int zzd3 = zzemVar.zzd(4) + 8;
                zziVar.zzf(zzd3);
                zziVar.zza(zzd3);
                zzemVar.zzo(1);
                if (zzp) {
                    int zzd4 = zzemVar.zzd(8);
                    int zzd5 = zzemVar.zzd(8);
                    zzemVar.zzo(1);
                    boolean zzp2 = zzemVar.zzp();
                    zziVar.zzc(zzk.zza(zzd4));
                    zziVar.zzb(true != zzp2 ? 2 : 1);
                    zziVar.zzd(zzk.zzb(zzd5));
                }
            }
        }
        return zziVar.zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (r6 == 1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzk zzl(com.google.android.gms.internal.ads.zzen r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zzl(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzk");
    }

    private static zzav zzm(zzen zzenVar) {
        short zzE = zzenVar.zzE();
        zzenVar.zzM(2);
        String zzB = zzenVar.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzfg(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzail zzn(zzen zzenVar, int i) {
        zzenVar.zzL(i + 8);
        zzenVar.zzM(4);
        return new zzail(zzenVar.zzu(), zzenVar.zzu());
    }

    private static zzain zzo(zzen zzenVar, int i) {
        zzenVar.zzL(i + 12);
        zzenVar.zzM(1);
        zzh(zzenVar);
        zzenVar.zzM(2);
        int zzm = zzenVar.zzm();
        if ((zzm & 128) != 0) {
            zzenVar.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzenVar.zzM(zzenVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzenVar.zzM(2);
        }
        zzenVar.zzM(1);
        zzh(zzenVar);
        String zzd = zzay.zzd(zzenVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzain(zzd, null, -1L, -1L);
        }
        zzenVar.zzM(4);
        long zzu = zzenVar.zzu();
        long zzu2 = zzenVar.zzu();
        zzenVar.zzM(1);
        int zzh = zzh(zzenVar);
        long j = zzu2;
        byte[] bArr = new byte[zzh];
        zzenVar.zzH(bArr, 0, zzh);
        if (j <= 0) {
            j = -1;
        }
        return new zzain(zzd, bArr, j, zzu > 0 ? zzu : -1L);
    }

    private static ByteBuffer zzp() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x016a, code lost:
        if (r11 == (-1)) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzq(com.google.android.gms.internal.ads.zzen r29, int r30, int r31, int r32, int r33, java.lang.String r34, boolean r35, com.google.android.gms.internal.ads.zzs r36, com.google.android.gms.internal.ads.zzais r37, int r38) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaix.zzq(com.google.android.gms.internal.ads.zzen, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.zzais, int):void");
    }
}
