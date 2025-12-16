package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzzp implements zzzl, zzhj {
    public static final zzfyq zza = zzfyq.zzr(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zzfyq zzb = zzfyq.zzr(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zzfyq zzc = zzfyq.zzr(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final zzfyq zzd = zzfyq.zzr(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final zzfyq zze = zzfyq.zzr(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final zzfyq zzf = zzfyq.zzr(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static zzzp zzg;
    private final Context zzh;
    private final zzfyt zzi;
    private final zzzj zzj;
    private final zzaaf zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private String zzt;

    public static /* synthetic */ void zzi(zzzp zzzpVar, int i) {
        zzzpVar.zzl(i);
    }

    private final long zzj(int i) {
        long j;
        zzfyt zzfytVar = this.zzi;
        Long l = (Long) zzfytVar.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) zzfytVar.get(0);
        } else if (l.longValue() == -9223372036854775807L) {
            int[] zzn = zzn(zzfwg.zzc(this.zzt));
            if (i != 2) {
                if (i == 3) {
                    j = ((Long) zzb.get(zzn[1])).longValue();
                } else if (i == 4) {
                    j = ((Long) zzc.get(zzn[2])).longValue();
                } else if (i == 5) {
                    j = ((Long) zzd.get(zzn[3])).longValue();
                } else if (i != 7) {
                    if (i != 9) {
                        j = i != 10 ? 1000000L : ((Long) zze.get(zzn[4])).longValue();
                    } else {
                        j = ((Long) zzf.get(zzn[5])).longValue();
                    }
                }
                l = Long.valueOf(j);
            }
            j = ((Long) zza.get(zzn[0])).longValue();
            l = Long.valueOf(j);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void zzk(int i, long j, long j2) {
        long j3;
        int i2;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.zzr) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.zzr = j2;
        this.zzj.zzb(i2, j3, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0007, code lost:
        if (r8.zzt == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzl(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.zzs     // Catch: java.lang.Throwable -> L7e
            if (r0 != r9) goto Lf
            java.lang.String r0 = r8.zzt     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L7b
            goto Lf
        La:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L81
        Lf:
            r8.zzs = r9     // Catch: java.lang.Throwable -> L7e
            r0 = 1
            if (r9 == r0) goto L7b
            if (r9 == 0) goto L7b
            r0 = 8
            if (r9 != r0) goto L1b
            goto L7b
        L1b:
            java.lang.String r0 = r8.zzt     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L4c
            android.content.Context r0 = r8.zzh     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L3e
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.Throwable -> La
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto L3e
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfuv.zzb(r0)     // Catch: java.lang.Throwable -> La
            goto L4a
        L3e:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfuv.zzb(r0)     // Catch: java.lang.Throwable -> La
        L4a:
            r8.zzt = r0     // Catch: java.lang.Throwable -> La
        L4c:
            long r0 = r8.zzj(r9)     // Catch: java.lang.Throwable -> L7e
            r8.zzq = r0     // Catch: java.lang.Throwable -> L7e
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7e
            int r9 = r8.zzl     // Catch: java.lang.Throwable -> L7e
            if (r9 <= 0) goto L60
            long r2 = r8.zzm     // Catch: java.lang.Throwable -> La
            long r2 = r0 - r2
            int r9 = (int) r2
            goto L61
        L60:
            r9 = 0
        L61:
            r3 = r9
            long r4 = r8.zzn     // Catch: java.lang.Throwable -> L7e
            long r6 = r8.zzq     // Catch: java.lang.Throwable -> L7e
            r2 = r8
            r2.zzk(r3, r4, r6)     // Catch: java.lang.Throwable -> L83
            r2.zzm = r0     // Catch: java.lang.Throwable -> L83
            r0 = 0
            r2.zzn = r0     // Catch: java.lang.Throwable -> L83
            r2.zzp = r0     // Catch: java.lang.Throwable -> L83
            r2.zzo = r0     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzaaf r9 = r2.zzk     // Catch: java.lang.Throwable -> L83
            r9.zzc()     // Catch: java.lang.Throwable -> L83
            monitor-exit(r8)
            return
        L7b:
            r2 = r8
            monitor-exit(r8)
            return
        L7e:
            r0 = move-exception
            r2 = r8
        L80:
            r9 = r0
        L81:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L83
            throw r9
        L83:
            r0 = move-exception
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzl(int):void");
    }

    private static boolean zzm(zzgo zzgoVar, boolean z) {
        return z && !zzgoVar.zzb(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0167, code lost:
        if (r3.equals("WF") != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0171, code lost:
        if (r3.equals("VU") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a5, code lost:
        if (r3.equals("VE") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01af, code lost:
        if (r3.equals("VC") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b9, code lost:
        if (r3.equals("VA") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fb, code lost:
        if (r3.equals("UA") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0221, code lost:
        if (r3.equals("TV") != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0239, code lost:
        if (r3.equals("TR") != false) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x025f, code lost:
        if (r3.equals("TM") != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0269, code lost:
        if (r3.equals("TL") != false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0273, code lost:
        if (r3.equals("TJ") != false) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x027d, code lost:
        if (r3.equals("TH") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0295, code lost:
        if (r3.equals("TD") != false) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ad, code lost:
        if (r3.equals("SZ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02b7, code lost:
        if (r3.equals("SY") != false) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02c1, code lost:
        if (r3.equals("SX") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02e7, code lost:
        if (r3.equals("SS") != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x031b, code lost:
        if (r3.equals("SM") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0325, code lost:
        if (r3.equals("SL") != false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x033d, code lost:
        if (r3.equals("SJ") != false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0347, code lost:
        if (r3.equals("SI") != false) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0351, code lost:
        if (r3.equals("SH") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0369, code lost:
        if (r3.equals("SE") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0373, code lost:
        if (r3.equals("SD") != false) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x037d, code lost:
        if (r3.equals("SC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0387, code lost:
        if (r3.equals("SB") != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x038e, code lost:
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r3.equals("CI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03f7, code lost:
        if (r3.equals("PY") != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x040f, code lost:
        if (r3.equals("PT") != false) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0435, code lost:
        if (r3.equals("PM") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0469, code lost:
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x048f, code lost:
        if (r3.equals("PA") != false) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04b5, code lost:
        if (r3.equals("NU") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04bf, code lost:
        if (r3.equals("NR") != false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r3.equals("CG") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x04f3, code lost:
        if (r3.equals("NI") != false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x050b, code lost:
        if (r3.equals("NF") != false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0515, code lost:
        if (r3.equals("NE") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x051f, code lost:
        if (r3.equals("NC") != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0526, code lost:
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x053b, code lost:
        if (r3.equals("MZ") != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0542, code lost:
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x058f, code lost:
        if (r3.equals("MT") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0599, code lost:
        if (r3.equals("MS") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x05a3, code lost:
        if (r3.equals("MR") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x05bb, code lost:
        if (r3.equals("MP") != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x05c2, code lost:
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x05e5, code lost:
        if (r3.equals("MM") != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x05ef, code lost:
        if (r3.equals("ML") != false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0607, code lost:
        if (r3.equals("MH") != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x060e, code lost:
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0615, code lost:
        if (r3.equals("MG") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0649, code lost:
        if (r3.equals("MC") != false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0661, code lost:
        if (r3.equals("LY") != false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x066b, code lost:
        if (r3.equals("LV") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0691, code lost:
        if (r3.equals("LS") != false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0698, code lost:
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x069f, code lost:
        if (r3.equals("LR") != false) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x06a9, code lost:
        if (r3.equals("LK") != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06b0, code lost:
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x06b7, code lost:
        if (r3.equals("LI") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x06f9, code lost:
        if (r3.equals("KY") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0703, code lost:
        if (r3.equals("KW") != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x071b, code lost:
        if (r3.equals("KN") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0725, code lost:
        if (r3.equals("KM") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x072c, code lost:
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0733, code lost:
        if (r3.equals("KI") != false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
        if (r3.equals("BQ") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0775, code lost:
        if (r3.equals("JO") != false) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x078d, code lost:
        if (r3.equals("JE") != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x07a5, code lost:
        if (r3.equals("IS") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x07e7, code lost:
        if (r3.equals("IM") != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x081b, code lost:
        if (r3.equals("HU") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0825, code lost:
        if (r3.equals("HT") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x082f, code lost:
        if (r3.equals("HR") != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0836, code lost:
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0891, code lost:
        if (r3.equals("GQ") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x08b7, code lost:
        if (r3.equals("GM") != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x08be, code lost:
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x08c5, code lost:
        if (r3.equals("GL") != false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x08cc, code lost:
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x08d3, code lost:
        if (r3.equals("GI") != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x08da, code lost:
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x096d, code lost:
        if (r3.equals("FK") != false) goto L640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cd, code lost:
        if (r3.equals("BL") != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0974, code lost:
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x09b3, code lost:
        if (r3.equals("ER") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x09ba, code lost:
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x09c1, code lost:
        if (r3.equals("EG") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x09c8, code lost:
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x09cf, code lost:
        if (r3.equals("EE") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x09d6, code lost:
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x09eb, code lost:
        if (r3.equals("DZ") != false) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x09f2, code lost:
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x09f9, code lost:
        if (r3.equals("DO") != false) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0a00, code lost:
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0a07, code lost:
        if (r3.equals("DM") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0a1f, code lost:
        if (r3.equals("DJ") != false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
        if (r3.equals("AT") != false) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x0a53, code lost:
        if (r3.equals("CX") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0a5d, code lost:
        if (r3.equals("CW") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0a75, code lost:
        if (r3.equals("CU") != false) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0a7c, code lost:
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0a83, code lost:
        if (r3.equals("CR") != false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0a8a, code lost:
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0aad, code lost:
        if (r3.equals("CM") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0ab4, code lost:
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x0abb, code lost:
        if (r3.equals("CL") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x0ac2, code lost:
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x0ac9, code lost:
        if (r3.equals("CK") != false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0ad3, code lost:
        if (r3.equals("CD") != false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0ada, code lost:
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x0ae1, code lost:
        if (r3.equals("CA") != false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x0ae8, code lost:
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0b0b, code lost:
        if (r3.equals("BI") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x0b12, code lost:
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0b27, code lost:
        if (r3.equals("BG") != false) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0b2e, code lost:
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0b35, code lost:
        if (r3.equals("BF") != false) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0b3c, code lost:
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0b5f, code lost:
        if (r3.equals("AZ") != false) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0b66, code lost:
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b7b, code lost:
        if (r3.equals("AI") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x0b84, code lost:
        if (r3.equals("AG") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x0b8b, code lost:
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0b92, code lost:
        if (r3.equals("AF") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x0b99, code lost:
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0bae, code lost:
        if (r3.equals("AD") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010b, code lost:
        if (r3.equals("AQ") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0bb7, code lost:
        if (r3.equals("BZ") != false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0bbe, code lost:
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0bd3, code lost:
        if (r3.equals("BB") != false) goto L810;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bda, code lost:
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0be1, code lost:
        if (r3.equals("BA") != false) goto L814;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x0be8, code lost:
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0bef, code lost:
        if (r3.equals("AX") != false) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bf6, code lost:
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0115, code lost:
        if (r3.equals("ZW") != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0c0b, code lost:
        if (r3.equals("AM") != false) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0c12, code lost:
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013b, code lost:
        if (r3.equals("YT") != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0145, code lost:
        if (r3.equals("YE") != false) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015d, code lost:
        if (r3.equals("WS") != false) goto L352;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] zzn(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzn(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final synchronized void zza(zzgj zzgjVar, zzgo zzgoVar, boolean z, int i) {
        if (!zzm(zzgoVar, z)) {
            return;
        }
        this.zzn += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r10.zzp >= 524288) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zzhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzgj r11, com.google.android.gms.internal.ads.zzgo r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = zzm(r12, r13)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.zzl     // Catch: java.lang.Throwable -> L73
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            com.google.android.gms.internal.ads.zzdd.zzf(r11)     // Catch: java.lang.Throwable -> L73
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L73
            long r0 = r10.zzm     // Catch: java.lang.Throwable -> L73
            long r0 = r11 - r0
            long r2 = r10.zzo     // Catch: java.lang.Throwable -> L73
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L73
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L73
            long r2 = r2 + r0
            r10.zzo = r2     // Catch: java.lang.Throwable -> L73
            long r0 = r10.zzp     // Catch: java.lang.Throwable -> L73
            long r2 = r10.zzn     // Catch: java.lang.Throwable -> L73
            long r0 = r0 + r2
            r10.zzp = r0     // Catch: java.lang.Throwable -> L73
            if (r5 <= 0) goto L6a
            float r13 = (float) r2     // Catch: java.lang.Throwable -> L73
            com.google.android.gms.internal.ads.zzaaf r0 = r10.zzk     // Catch: java.lang.Throwable -> L73
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L73
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L73
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L73
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r13 = r13 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L73
            float r13 = r13 / r2
            r0.zzb(r1, r13)     // Catch: java.lang.Throwable -> L73
            long r1 = r10.zzo     // Catch: java.lang.Throwable -> L73
            r3 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L52
            long r1 = r10.zzp     // Catch: java.lang.Throwable -> L4e
            r3 = 524288(0x80000, double:2.590327E-318)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L5b
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L76
        L52:
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r0.zza(r13)     // Catch: java.lang.Throwable -> L73
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L73
            r10.zzq = r0     // Catch: java.lang.Throwable -> L73
        L5b:
            long r6 = r10.zzn     // Catch: java.lang.Throwable -> L73
            long r8 = r10.zzq     // Catch: java.lang.Throwable -> L73
            r4 = r10
            r4.zzk(r5, r6, r8)     // Catch: java.lang.Throwable -> L78
            r4.zzm = r11     // Catch: java.lang.Throwable -> L78
            r11 = 0
            r4.zzn = r11     // Catch: java.lang.Throwable -> L78
            goto L6b
        L6a:
            r4 = r10
        L6b:
            int r11 = r4.zzl     // Catch: java.lang.Throwable -> L78
            int r11 = r11 + (-1)
            r4.zzl = r11     // Catch: java.lang.Throwable -> L78
            monitor-exit(r10)
            return
        L73:
            r0 = move-exception
            r4 = r10
        L75:
            r11 = r0
        L76:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            throw r11
        L78:
            r0 = move-exception
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzb(com.google.android.gms.internal.ads.zzgj, com.google.android.gms.internal.ads.zzgo, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzc(zzgj zzgjVar, zzgo zzgoVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final synchronized void zzd(zzgj zzgjVar, zzgo zzgoVar, boolean z) {
        if (!zzm(zzgoVar, z)) {
            return;
        }
        if (this.zzl == 0) {
            this.zzm = SystemClock.elapsedRealtime();
        }
        this.zzl++;
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final zzhj zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzg(zzzk zzzkVar) {
        this.zzj.zzc(zzzkVar);
    }

    /* synthetic */ zzzp(Context context, Map map, int i, zzdj zzdjVar, boolean z, zzzo zzzoVar) {
        this.zzh = context == null ? null : context.getApplicationContext();
        this.zzi = zzfyt.zzc(map);
        this.zzj = new zzzj();
        this.zzk = new zzaaf(2000);
        if (context == null) {
            this.zzs = 0;
            this.zzq = 1000000L;
            return;
        }
        zzel zzb2 = zzel.zzb(context);
        int zza2 = zzb2.zza();
        this.zzs = zza2;
        this.zzq = zzj(zza2);
        zzb2.zzf(new zzzn(this), zzde.zza());
    }

    public static synchronized zzzp zzh(Context context) {
        zzzp zzzpVar;
        synchronized (zzzp.class) {
            if (zzg == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                zzdj zzdjVar = zzdj.zza;
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                hashMap.put(2, -9223372036854775807L);
                hashMap.put(3, -9223372036854775807L);
                hashMap.put(4, -9223372036854775807L);
                hashMap.put(5, -9223372036854775807L);
                hashMap.put(10, -9223372036854775807L);
                hashMap.put(9, -9223372036854775807L);
                hashMap.put(7, -9223372036854775807L);
                zzg = new zzzp(applicationContext, hashMap, 2000, zzdjVar, true, null);
            }
            zzzpVar = zzg;
        }
        return zzzpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzf(Handler handler, zzzk zzzkVar) {
        zzzkVar.getClass();
        this.zzj.zza(handler, zzzkVar);
    }
}
