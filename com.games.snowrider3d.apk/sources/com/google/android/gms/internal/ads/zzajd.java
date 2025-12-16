package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzajd implements zzadv {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzz zzb;
    private long zzA;
    private long zzB;
    private zzajc zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzady zzI;
    private zzafb[] zzJ;
    private zzafb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzakr zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final zzen zzi;
    private final byte[] zzj;
    private final zzen zzk;
    private final zzags zzl;
    private final zzen zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfz zzp;
    private final zzadj zzq;
    private zzfyq zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzen zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzx zzxVar = new zzx();
        zzxVar.zzah("application/x-emsg");
        zzb = zzxVar.zzan();
    }

    @Deprecated
    public zzajd() {
        this(zzakr.zza, 32, null, null, zzfyq.zzn(), null);
    }

    private static int zzg(int i) throws zzaz {
        if (i >= 0) {
            return i;
        }
        throw zzaz.zza("Unexpected negative value: " + i, null);
    }

    private static Pair zzh(zzen zzenVar, long j) throws zzaz {
        long j2;
        long j3;
        zzen zzenVar2 = zzenVar;
        zzenVar2.zzL(8);
        int zza2 = zzaix.zza(zzenVar2.zzg());
        zzenVar2.zzM(4);
        long zzu = zzenVar2.zzu();
        if (zza2 == 0) {
            j3 = zzenVar2.zzu();
            j2 = zzenVar2.zzu();
        } else {
            j3 = zzenVar2.zzw();
            j2 = zzenVar2.zzw();
        }
        long j4 = j + j2;
        long zzu2 = zzex.zzu(j3, 1000000L, zzu, RoundingMode.DOWN);
        zzenVar2.zzM(2);
        int zzq = zzenVar2.zzq();
        int[] iArr = new int[zzq];
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        long[] jArr3 = new long[zzq];
        long j5 = j4;
        long j6 = zzu2;
        int i = 0;
        while (i < zzq) {
            int zzg = zzenVar2.zzg();
            if ((Integer.MIN_VALUE & zzg) == 0) {
                long zzu3 = zzenVar2.zzu();
                iArr[i] = zzg & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j6;
                j3 += zzu3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long zzu4 = zzex.zzu(j3, 1000000L, zzu, RoundingMode.DOWN);
                jArr4[i] = zzu4 - jArr5[i];
                zzenVar2.zzM(4);
                j5 += iArr[i];
                i++;
                zzenVar2 = zzenVar;
                zzq = zzq;
                j6 = zzu4;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw zzaz.zza("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(zzu2), new zzadi(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzs zzj(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzj(java.util.List):com.google.android.gms.internal.ads.zzs");
    }

    private final void zzk() {
        this.zzs = 0;
        this.zzv = 0;
    }

    private static void zzl(zzen zzenVar, int i, zzajr zzajrVar) throws zzaz {
        zzenVar.zzL(i + 8);
        int zzg = zzenVar.zzg();
        int i2 = zzaix.zza;
        if ((zzg & 1) != 0) {
            throw zzaz.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzg & 2) != 0;
        int zzp = zzenVar.zzp();
        if (zzp == 0) {
            Arrays.fill(zzajrVar.zzl, 0, zzajrVar.zze, false);
            return;
        }
        int i3 = zzajrVar.zze;
        if (zzp != i3) {
            throw zzaz.zza("Senc sample count " + zzp + " is different from fragment sample count" + i3, null);
        }
        Arrays.fill(zzajrVar.zzl, 0, zzp, z);
        zzajrVar.zza(zzenVar.zza());
        zzen zzenVar2 = zzajrVar.zzn;
        zzenVar.zzH(zzenVar2.zzN(), 0, zzenVar2.zzd());
        zzenVar2.zzL(0);
        zzajrVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0356, code lost:
        if ((com.google.android.gms.internal.ads.zzex.zzu(r40, 1000000, r7.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzex.zzu(r2[0], 1000000, r7.zzc, java.math.RoundingMode.DOWN)) < r7.zze) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06cc, code lost:
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06cf, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzm(long r55) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzm(long):void");
    }

    private static final zzaiy zzn(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaiy) sparseArray.valueAt(0);
        }
        zzaiy zzaiyVar = (zzaiy) sparseArray.get(i);
        zzaiyVar.getClass();
        return zzaiyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x020b, code lost:
        if (((r11 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020d, code lost:
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
        r17 = r7;
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0215, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0216, code lost:
        r31.zzH = r2;
        r8.zzr(r15, r5);
        r31.zzE += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0220, code lost:
        if (r5 <= 0) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0224, code lost:
        if (r31.zzG != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022d, code lost:
        if (com.google.android.gms.internal.ads.zzfv.zzj(r3, 4, r5, r4.zzg) == false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022f, code lost:
        r31.zzG = r19;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023d, code lost:
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024e, code lost:
        throw com.google.android.gms.internal.ads.zzaz.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024f, code lost:
        r28 = r2;
        r17 = r7;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0258, code lost:
        if (r31.zzH == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025a, code lost:
        r2 = r31.zzi;
        r2.zzI(r5);
        r32.zzi(r2.zzN(), 0, r31.zzF);
        r8.zzr(r2, r31.zzF);
        r5 = r31.zzF;
        r7 = com.google.android.gms.internal.ads.zzfv.zzc(r2.zzN(), r2.zzd());
        r2.zzL(0);
        r2.zzK(r7);
        r7 = r4.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0287, code lost:
        if (r7 != (-1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0289, code lost:
        r7 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028f, code lost:
        if (r7.zza() == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0291, code lost:
        r7.zze(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0295, code lost:
        r9 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029b, code lost:
        if (r9.zza() == r7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029d, code lost:
        r9.zze(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a0, code lost:
        r7 = r31.zzp;
        r7.zzb(r12, r2);
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ad, code lost:
        if ((r28.zza() & 4) == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02af, code lost:
        r7.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b3, code lost:
        r20 = 4;
        r5 = r8.zzf(r32, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ba, code lost:
        r31.zzE += r5;
        r31.zzF -= r5;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02cd, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d1, code lost:
        r1 = r28.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02d7, code lost:
        if (r31.zzG != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d9, code lost:
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
        r22 = r1;
        r1 = r28.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e2, code lost:
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e4, code lost:
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e9, code lost:
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02eb, code lost:
        r8.zzt(r12, r22, r31.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f8, code lost:
        r1 = r31.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02fe, code lost:
        if (r1.isEmpty() != false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0300, code lost:
        r1 = (com.google.android.gms.internal.ads.zzajb) r1.removeFirst();
        r2 = r31.zzy;
        r7 = r1.zzc;
        r31.zzy = r2 - r7;
        r2 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0311, code lost:
        if (r1.zzb == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0313, code lost:
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0315, code lost:
        r4 = r2;
        r1 = r31.zzJ;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031a, code lost:
        if (r10 >= r2) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x031c, code lost:
        r1[r10].zzt(r4, 1, r7, r31.zzy, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x032c, code lost:
        if (r28.zzl() != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x032e, code lost:
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0331, code lost:
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0332, code lost:
        r31.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0336, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        r10 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r31.zzs != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r31.zzD = r2.zzb();
        r4 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (java.util.Objects.equals(r4, r10) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
        java.util.Objects.equals(r4, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r31.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r2.zzf >= r2.zzi) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
        r32.zzk(r31.zzD);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r4 = r2.zzb;
        r6 = r4.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if (r1 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
        r6.zzM(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
        if (r4.zzb(r2.zzf) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
        r6.zzM(r6.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (r2.zzl() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
        if (r2.zzd.zza.zzh != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
        r31.zzD -= 8;
        r32.zzk(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
        r31.zzE = r2.zzc(r31.zzD, 7);
        r4 = r31.zzD;
        r12 = r31.zzk;
        com.google.android.gms.internal.ads.zzacy.zzc(r4, r12);
        r2.zza.zzr(r12, 7);
        r4 = r31.zzE + 7;
        r31.zzE = r4;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
        r8 = 0;
        r4 = r2.zzc(r31.zzD, 0);
        r31.zzE = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013d, code lost:
        r31.zzD += r4;
        r31.zzs = 4;
        r31.zzF = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
        r4 = r2.zzd.zza;
        r8 = r2.zza;
        r12 = r2.zze();
        r14 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (r14 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
        r4 = r31.zzE;
        r5 = r31.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
        if (r4 >= r5) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015a, code lost:
        r31.zzE += r8.zzf(r32, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016a, code lost:
        r15 = r31.zzh;
        r3 = r15.zzN();
        r3[0] = 0;
        r3[1] = 0;
        r3[r17] = 0;
        r7 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
        if (r31.zzE >= r31.zzD) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
        r5 = r31.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
        if (r5 != 0) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0189, code lost:
        if (r31.zzK.length > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018d, code lost:
        if (r31.zzG != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0193, code lost:
        r5 = com.google.android.gms.internal.ads.zzfv.zzb(r4.zzg);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a2, code lost:
        if ((r14 + r5) <= (r31.zzD - r31.zzE)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a4, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a5, code lost:
        r32.zzi(r3, r7, r14 + r5);
        r15.zzL(0);
        r9 = r15.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b2, code lost:
        if (r9 < 0) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b4, code lost:
        r31.zzF = r9 - r5;
        r9 = r31.zzg;
        r9.zzL(0);
        r8.zzr(r9, 4);
        r31.zzE += 4;
        r31.zzD += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cd, code lost:
        if (r31.zzK.length <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cf, code lost:
        if (r5 <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d1, code lost:
        r9 = r4.zzg;
        r11 = r3[4];
        r2 = com.google.android.gms.internal.ads.zzfv.zza;
        r2 = r9.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dd, code lost:
        if (java.util.Objects.equals(r2, r10) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e7, code lost:
        if (com.google.android.gms.internal.ads.zzay.zzg(r9.zzk, r10) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ea, code lost:
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f0, code lost:
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f5, code lost:
        if ((r11 & com.google.common.base.Ascii.US) == 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fb, code lost:
        if (java.util.Objects.equals(r2, "video/hevc") != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0203, code lost:
        if (com.google.android.gms.internal.ads.zzay.zzg(r9.zzk, "video/hevc") == false) goto L104;
     */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r32, com.google.android.gms.internal.ads.zzaer r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ List zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zze(zzady zzadyVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzadyVar = new zzaku(zzadyVar, this.zzc);
        }
        this.zzI = zzadyVar;
        zzk();
        zzafb[] zzafbVarArr = new zzafb[2];
        this.zzJ = zzafbVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzafbVarArr[0] = this.zzI.zzw(100, 5);
            i = 1;
            i3 = TypedValues.TYPE_TARGET;
        } else {
            i = 0;
        }
        zzafb[] zzafbVarArr2 = (zzafb[]) zzex.zzQ(this.zzJ, i);
        this.zzJ = zzafbVarArr2;
        for (zzafb zzafbVar : zzafbVarArr2) {
            zzafbVar.zzm(zzb);
        }
        List list = this.zze;
        this.zzK = new zzafb[list.size()];
        while (i4 < this.zzK.length) {
            zzafb zzw = this.zzI.zzw(i3, 3);
            zzw.zzm((zzz) list.get(i4));
            this.zzK[i4] = zzw;
            i4++;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzajc) sparseArray.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzc();
        this.zzz = j2;
        this.zzn.clear();
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        zzaey zza2 = zzajo.zza(zzadwVar);
        this.zzr = zza2 != null ? zzfyq.zzo(zza2) : zzfyq.zzn();
        return zza2 == null;
    }

    public zzajd(zzakr zzakrVar, int i, zzeu zzeuVar, zzajp zzajpVar, List list, zzafb zzafbVar) {
        this.zzc = zzakrVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzags();
        this.zzm = new zzen(16);
        this.zzg = new zzen(zzfv.zza);
        this.zzh = new zzen(6);
        this.zzi = new zzen();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzen(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzfyq.zzn();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzady.zza;
        this.zzJ = new zzafb[0];
        this.zzK = new zzafb[0];
        this.zzp = new zzfz(new zzfy() { // from class: com.google.android.gms.internal.ads.zzaja
            @Override // com.google.android.gms.internal.ads.zzfy
            public final void zza(long j, zzen zzenVar) {
                zzadh.zza(j, zzenVar, zzajd.this.zzK);
            }
        });
        this.zzq = new zzadj();
        this.zzM = -1L;
    }
}
