package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzlf {
    private final zzmo zzc;
    private final zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzix zzh;
    private zzlc zzi;
    private zzlc zzj;
    private zzlc zzk;
    private zzlc zzl;
    private zzlc zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzkk zzr;
    private final zzbj zza = new zzbj();
    private final zzbk zzb = new zzbk();
    private List zzq = new ArrayList();

    public zzlf(zzmo zzmoVar, zzdt zzdtVar, zzkk zzkkVar, zzix zzixVar) {
        this.zzc = zzmoVar;
        this.zzd = zzdtVar;
        this.zzr = zzkkVar;
        this.zzh = zzixVar;
    }

    private final int zzA(zzbl zzblVar) {
        zzbl zzblVar2;
        zzlc zzlcVar = this.zzi;
        if (zzlcVar == null) {
            return 0;
        }
        int zza = zzblVar.zza(zzlcVar.zzb);
        while (true) {
            zzblVar2 = zzblVar;
            zza = zzblVar2.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlcVar.getClass();
                if (zzlcVar.zzg() == null || zzlcVar.zzg.zzh) {
                    break;
                }
                zzlcVar = zzlcVar.zzg();
            }
            zzlc zzg = zzlcVar.zzg();
            if (zza == -1 || zzg == null || zzblVar2.zza(zzg.zzb) != zza) {
                break;
            }
            zzlcVar = zzg;
            zzblVar = zzblVar2;
        }
        int zza2 = zza(zzlcVar);
        zzlcVar.zzg = zzp(zzblVar2, zzlcVar.zzg);
        return zza2;
    }

    private final long zzB(zzbl zzblVar, Object obj, int i) {
        zzbj zzbjVar = this.zza;
        zzblVar.zzn(obj, zzbjVar);
        zzbjVar.zzg(i);
        long j = zzbjVar.zzg.zza(i).zzh;
        return 0L;
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlc zzlcVar = (zzlc) this.zzq.get(i);
            if (zzlcVar.zzb.equals(obj)) {
                return zzlcVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzld zzD(zzbl zzblVar, zzlc zzlcVar, long j) {
        long j2;
        zzbl zzblVar2;
        zzbj zzbjVar;
        zzbk zzbkVar;
        long j3;
        long j4;
        Object obj;
        zzbl zzblVar3;
        long j5;
        zzld zzldVar = zzlcVar.zzg;
        long zze = zzlcVar.zze();
        long j6 = zzldVar.zze;
        long j7 = (zze + j6) - j;
        if (zzldVar.zzh) {
            zzvh zzvhVar = zzldVar.zza;
            Object obj2 = zzvhVar.zza;
            int zza = zzblVar.zza(obj2);
            int i = this.zzf;
            boolean z = this.zzg;
            zzbk zzbkVar2 = this.zzb;
            zzbj zzbjVar2 = this.zza;
            long j8 = 0;
            int zzi = zzblVar.zzi(zza, zzbjVar2, zzbkVar2, i, z);
            if (zzi == -1) {
                return null;
            }
            int i2 = zzblVar.zzd(zzi, zzbjVar2, true).zzc;
            Object obj3 = zzbjVar2.zzb;
            obj3.getClass();
            long j9 = zzvhVar.zzd;
            if (zzblVar.zze(i2, zzbkVar2, 0L).zzn == zzi) {
                Pair zzm = zzblVar.zzm(zzbkVar2, zzbjVar2, i2, -9223372036854775807L, Math.max(0L, j7));
                if (zzm == null) {
                    return null;
                }
                Object obj4 = zzm.first;
                long longValue = ((Long) zzm.second).longValue();
                zzlc zzg = zzlcVar.zzg();
                if (zzg == null || !zzg.zzb.equals(obj4)) {
                    long zzC = zzC(obj4);
                    if (zzC == -1) {
                        zzC = this.zze;
                        this.zze = 1 + zzC;
                    }
                    j5 = zzC;
                } else {
                    j5 = zzg.zzg.zza.zzd;
                }
                zzblVar3 = zzblVar;
                zzbkVar = zzbkVar2;
                zzbjVar = zzbjVar2;
                j4 = longValue;
                obj = obj4;
                j3 = j5;
                j8 = -9223372036854775807L;
            } else {
                zzblVar3 = zzblVar;
                zzbjVar = zzbjVar2;
                zzbkVar = zzbkVar2;
                obj = obj3;
                j4 = 0;
                j3 = j9;
            }
            zzvh zzH = zzH(zzblVar3, obj, j4, j3, zzbkVar, zzbjVar);
            long j10 = j4;
            zzbj zzbjVar3 = zzbjVar;
            if (j8 != -9223372036854775807L && zzldVar.zzc != -9223372036854775807L) {
                zzblVar3.zzn(obj2, zzbjVar3).zzb();
                int i3 = zzbjVar3.zzg.zzd;
            }
            return zzE(zzblVar3, zzH, j8, j10);
        }
        zzvh zzvhVar2 = zzldVar.zza;
        Object obj5 = zzvhVar2.zza;
        zzbj zzbjVar4 = this.zza;
        zzblVar.zzn(obj5, zzbjVar4);
        boolean z2 = zzldVar.zzg;
        if (zzvhVar2.zzb()) {
            int i4 = zzvhVar2.zzb;
            if (zzbjVar4.zza(i4) == -1) {
                return null;
            }
            int zza2 = zzbjVar4.zzg.zza(i4).zza(zzvhVar2.zzc);
            if (zza2 < 0) {
                return zzF(zzblVar, obj5, i4, zza2, zzldVar.zzc, zzvhVar2.zzd, false);
            }
            long j11 = zzldVar.zzc;
            if (j11 == -9223372036854775807L) {
                Pair zzm2 = zzblVar.zzm(this.zzb, zzbjVar4, zzbjVar4.zzc, -9223372036854775807L, Math.max(0L, j7));
                zzblVar2 = zzblVar;
                if (zzm2 == null) {
                    return null;
                }
                j11 = ((Long) zzm2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                zzblVar2 = zzblVar;
                j2 = j11;
            }
            zzB(zzblVar2, obj5, i4);
            return zzG(zzblVar2, obj5, Math.max(0L, j11), j2, zzvhVar2.zzd, false);
        }
        int i5 = zzvhVar2.zze;
        if (i5 != -1) {
            zzbjVar4.zzj(i5);
        }
        int zze2 = zzbjVar4.zze(i5);
        zzbjVar4.zzk(i5);
        if (zze2 == zzbjVar4.zza(i5)) {
            zzB(zzblVar, obj5, i5);
            return zzG(zzblVar, obj5, 0L, j6, zzvhVar2.zzd, false);
        }
        return zzF(zzblVar, obj5, i5, zze2, j6, zzvhVar2.zzd, false);
    }

    private final zzld zzE(zzbl zzblVar, zzvh zzvhVar, long j, long j2) {
        Object obj = zzvhVar.zza;
        zzblVar.zzn(obj, this.zza);
        if (zzvhVar.zzb()) {
            return zzF(zzblVar, obj, zzvhVar.zzb, zzvhVar.zzc, j, zzvhVar.zzd, false);
        }
        return zzG(zzblVar, obj, j2, j, zzvhVar.zzd, false);
    }

    private final zzld zzF(zzbl zzblVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzvh zzvhVar = new zzvh(obj, i, i2, j2);
        Object obj2 = zzvhVar.zza;
        int i3 = zzvhVar.zzb;
        int i4 = zzvhVar.zzc;
        zzbj zzbjVar = this.zza;
        long zzf = zzblVar.zzn(obj2, zzbjVar).zzf(i3, i4);
        if (i2 == zzbjVar.zze(i)) {
            zzbjVar.zzh();
        }
        zzbjVar.zzk(i3);
        long j3 = 0;
        if (zzf != -9223372036854775807L && zzf <= 0) {
            j3 = Math.max(0L, (-1) + zzf);
        }
        return new zzld(zzvhVar, j3, j, -9223372036854775807L, zzf, false, false, false, false, false);
    }

    private final zzld zzG(zzbl zzblVar, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzbj zzbjVar = this.zza;
        zzblVar.zzn(obj, zzbjVar);
        int zzc = zzbjVar.zzc(j7);
        if (zzc == -1) {
            zzbjVar.zzb();
        } else {
            zzbjVar.zzk(zzc);
        }
        zzvh zzvhVar = new zzvh(obj, j3, zzc);
        boolean zzL = zzL(zzvhVar);
        boolean zzK = zzK(zzblVar, zzvhVar);
        boolean zzJ = zzJ(zzblVar, zzvhVar, zzL);
        if (zzc != -1) {
            zzbjVar.zzk(zzc);
        }
        if (zzc != -1) {
            zzbjVar.zzj(zzc);
        }
        if (zzc != -1) {
            zzbjVar.zzg(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbjVar.zzd;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzld(zzvhVar, j7, j2, j6, j5, false, false, zzL, zzK, zzJ);
    }

    private static zzvh zzH(zzbl zzblVar, Object obj, long j, long j2, zzbk zzbkVar, zzbj zzbjVar) {
        zzblVar.zzn(obj, zzbjVar);
        zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L);
        zzblVar.zza(obj);
        zzbjVar.zzb();
        zzblVar.zzn(obj, zzbjVar);
        int zzd = zzbjVar.zzd(j);
        if (zzd == -1) {
            return new zzvh(obj, j2, zzbjVar.zzc(j));
        }
        return new zzvh(obj, zzd, zzbjVar.zze(zzd), j2);
    }

    private final void zzI() {
        int i = zzfyq.zzd;
        final zzfyn zzfynVar = new zzfyn();
        for (zzlc zzlcVar = this.zzi; zzlcVar != null; zzlcVar = zzlcVar.zzg()) {
            zzfynVar.zzf(zzlcVar.zzg.zza);
        }
        zzlc zzlcVar2 = this.zzj;
        final zzvh zzvhVar = zzlcVar2 == null ? null : zzlcVar2.zzg.zza;
        this.zzd.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // java.lang.Runnable
            public final void run() {
                zzlf.this.zzc.zzU(zzfynVar.zzi(), zzvhVar);
            }
        });
    }

    private final boolean zzJ(zzbl zzblVar, zzvh zzvhVar, boolean z) {
        int zza = zzblVar.zza(zzvhVar.zza);
        zzbj zzbjVar = this.zza;
        int i = zzblVar.zzd(zza, zzbjVar, false).zzc;
        zzbk zzbkVar = this.zzb;
        return !zzblVar.zze(i, zzbkVar, 0L).zzi && zzblVar.zzi(zza, zzbjVar, zzbkVar, this.zzf, this.zzg) == -1 && z;
    }

    private final boolean zzK(zzbl zzblVar, zzvh zzvhVar) {
        if (!zzL(zzvhVar)) {
            return false;
        }
        Object obj = zzvhVar.zza;
        return zzblVar.zze(zzblVar.zzn(obj, this.zza).zzc, this.zzb, 0L).zzo == zzblVar.zza(obj);
    }

    private static final boolean zzL(zzvh zzvhVar) {
        return !zzvhVar.zzb() && zzvhVar.zze == -1;
    }

    public final int zza(zzlc zzlcVar) {
        zzdd.zzb(zzlcVar);
        int i = 0;
        if (zzlcVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlcVar;
        while (zzlcVar.zzg() != null) {
            zzlcVar = zzlcVar.zzg();
            zzlcVar.getClass();
            if (zzlcVar == this.zzj) {
                zzlc zzlcVar2 = this.zzi;
                this.zzj = zzlcVar2;
                this.zzk = zzlcVar2;
                i = 3;
            }
            if (zzlcVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlcVar.zzo();
            this.zzn--;
        }
        zzlc zzlcVar3 = this.zzl;
        zzlcVar3.getClass();
        zzlcVar3.zzp(null);
        zzI();
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:
        return zza(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzbl r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.zzlc r2 = r0.zzi
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto La6
            com.google.android.gms.internal.ads.zzld r5 = r2.zzg
            if (r3 != 0) goto L15
            com.google.android.gms.internal.ads.zzld r3 = r0.zzp(r1, r5)
            r6 = r18
            goto L30
        L15:
            r6 = r18
            com.google.android.gms.internal.ads.zzld r8 = r0.zzD(r1, r3, r6)
            if (r8 == 0) goto La1
            long r9 = r5.zzb
            long r11 = r8.zzb
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto La1
            com.google.android.gms.internal.ads.zzvh r9 = r5.zza
            com.google.android.gms.internal.ads.zzvh r10 = r8.zza
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto La1
            r3 = r8
        L30:
            long r8 = r5.zzc
            com.google.android.gms.internal.ads.zzld r8 = r3.zza(r8)
            r2.zzg = r8
            long r8 = r5.zze
            long r10 = r3.zze
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L98
            r2.zzr()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L57
        L52:
            long r12 = r2.zze()
            long r10 = r10 + r12
        L57:
            com.google.android.gms.internal.ads.zzlc r1 = r0.zzj
            r12 = -9223372036854775808
            r3 = 1
            if (r2 != r1) goto L6c
            com.google.android.gms.internal.ads.zzld r1 = r2.zzg
            boolean r1 = r1.zzg
            int r1 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = r3
            goto L6d
        L6c:
            r1 = r4
        L6d:
            com.google.android.gms.internal.ads.zzlc r14 = r0.zzk
            if (r2 != r14) goto L7b
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 == 0) goto L79
            int r10 = (r22 > r10 ? 1 : (r22 == r10 ? 0 : -1))
            if (r10 < 0) goto L7b
        L79:
            r10 = r3
            goto L7c
        L7b:
            r10 = r4
        L7c:
            int r2 = r0.zza(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L8a
            long r8 = r5.zzd
            r8 = r6
        L8a:
            if (r1 == 0) goto L92
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L91
            goto L92
        L91:
            r4 = r3
        L92:
            if (r10 == 0) goto L97
            r1 = r4 | 2
            return r1
        L97:
            return r4
        L98:
            com.google.android.gms.internal.ads.zzlc r3 = r2.zzg()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        La1:
            int r1 = r0.zza(r3)
            return r1
        La6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzb(com.google.android.gms.internal.ads.zzbl, long, long, long):int");
    }

    public final int zzc(zzbl zzblVar, int i) {
        this.zzf = i;
        return zzA(zzblVar);
    }

    public final int zzd(zzbl zzblVar, boolean z) {
        this.zzg = z;
        return zzA(zzblVar);
    }

    public final zzlc zze() {
        zzlc zzlcVar = this.zzi;
        if (zzlcVar == null) {
            return null;
        }
        if (zzlcVar == this.zzj) {
            this.zzj = zzlcVar.zzg();
        }
        if (zzlcVar == this.zzk) {
            this.zzk = zzlcVar.zzg();
        }
        zzlcVar.zzo();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzlc zzlcVar2 = this.zzi;
            this.zzo = zzlcVar2.zzb;
            this.zzp = zzlcVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzI();
        return this.zzi;
    }

    public final zzlc zzf() {
        zzlc zzlcVar = this.zzk;
        zzdd.zzb(zzlcVar);
        this.zzk = zzlcVar.zzg();
        zzI();
        zzlc zzlcVar2 = this.zzk;
        zzdd.zzb(zzlcVar2);
        return zzlcVar2;
    }

    public final zzlc zzg() {
        zzlc zzlcVar = this.zzk;
        zzlc zzlcVar2 = this.zzj;
        if (zzlcVar == zzlcVar2) {
            zzdd.zzb(zzlcVar2);
            this.zzk = zzlcVar2.zzg();
        }
        zzlc zzlcVar3 = this.zzj;
        zzdd.zzb(zzlcVar3);
        this.zzj = zzlcVar3.zzg();
        zzI();
        zzlc zzlcVar4 = this.zzj;
        zzdd.zzb(zzlcVar4);
        return zzlcVar4;
    }

    public final zzlc zzi() {
        return this.zzl;
    }

    public final zzlc zzj() {
        return this.zzi;
    }

    public final zzlc zzk(zzvf zzvfVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlc zzlcVar = (zzlc) this.zzq.get(i);
            if (zzlcVar.zza == zzvfVar) {
                return zzlcVar;
            }
        }
        return null;
    }

    public final zzlc zzl() {
        return this.zzm;
    }

    public final zzlc zzm() {
        return this.zzk;
    }

    public final zzlc zzn() {
        return this.zzj;
    }

    public final zzld zzo(long j, zzls zzlsVar) {
        zzlc zzlcVar = this.zzl;
        return zzlcVar == null ? zzE(zzlsVar.zza, zzlsVar.zzb, zzlsVar.zzc, zzlsVar.zzs) : zzD(zzlsVar.zza, zzlcVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzld zzp(com.google.android.gms.internal.ads.zzbl r19, com.google.android.gms.internal.ads.zzld r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzvh r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzK(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbj r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L33
            int r1 = r3.zze
            if (r1 != r4) goto L2e
            goto L33
        L2e:
            r5.zzg(r1)
            r10 = r6
            goto L34
        L33:
            r10 = r8
        L34:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L48
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzf(r1, r6)
        L42:
            r16 = r10
            r9 = r6
            r7 = r16
            goto L52
        L48:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4f
            r9 = r6
            r7 = r9
            goto L52
        L4f:
            long r6 = r5.zzd
            goto L42
        L52:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L5e
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L65
        L5e:
            int r1 = r3.zze
            if (r1 == r4) goto L65
            r5.zzk(r1)
        L65:
            com.google.android.gms.internal.ads.zzld r1 = new com.google.android.gms.internal.ads.zzld
            r5 = r3
            long r3 = r2.zzb
            r11 = r5
            long r5 = r2.zzc
            boolean r2 = r2.zzf
            r2 = r11
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzp(com.google.android.gms.internal.ads.zzbl, com.google.android.gms.internal.ads.zzld):com.google.android.gms.internal.ads.zzld");
    }

    public final zzvh zzq(zzbl zzblVar, Object obj, long j) {
        long zzC;
        int zza;
        zzbj zzbjVar = this.zza;
        int i = zzblVar.zzn(obj, zzbjVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zza = zzblVar.zza(obj2)) == -1 || zzblVar.zzd(zza, zzbjVar, false).zzc != i) {
            zzlc zzlcVar = this.zzi;
            while (true) {
                if (zzlcVar == null) {
                    zzlc zzlcVar2 = this.zzi;
                    while (true) {
                        if (zzlcVar2 != null) {
                            int zza2 = zzblVar.zza(zzlcVar2.zzb);
                            if (zza2 != -1 && zzblVar.zzd(zza2, zzbjVar, false).zzc == i) {
                                zzC = zzlcVar2.zzg.zza.zzd;
                                break;
                            }
                            zzlcVar2 = zzlcVar2.zzg();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else if (zzlcVar.zzb.equals(obj)) {
                    zzC = zzlcVar.zzg.zza.zzd;
                    break;
                } else {
                    zzlcVar = zzlcVar.zzg();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzblVar.zzn(obj, zzbjVar);
        int i2 = zzbjVar.zzc;
        zzbk zzbkVar = this.zzb;
        zzblVar.zze(i2, zzbkVar, 0L);
        Object obj3 = obj;
        for (int zza3 = zzblVar.zza(obj); zza3 >= zzbkVar.zzn; zza3--) {
            zzblVar.zzd(zza3, zzbjVar, true);
            zzbjVar.zzb();
            if (zzbjVar.zzd(zzbjVar.zzd) != -1) {
                Object obj4 = zzbjVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzH(zzblVar, obj3, j, j2, zzbkVar, zzbjVar);
    }

    public final void zzs() {
        if (this.zzn == 0) {
            return;
        }
        zzlc zzlcVar = this.zzi;
        zzdd.zzb(zzlcVar);
        this.zzo = zzlcVar.zzb;
        this.zzp = zzlcVar.zzg.zza.zzd;
        while (zzlcVar != null) {
            zzlcVar.zzo();
            zzlcVar = zzlcVar.zzg();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzI();
    }

    public final void zzt() {
        zzlc zzlcVar = this.zzm;
        if (zzlcVar == null || zzlcVar.zzt()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzlc zzlcVar2 = (zzlc) this.zzq.get(i);
                if (!zzlcVar2.zzt()) {
                    this.zzm = zzlcVar2;
                    return;
                }
            }
        }
    }

    public final void zzu(long j) {
        zzlc zzlcVar = this.zzl;
        if (zzlcVar != null) {
            zzlcVar.zzn(j);
        }
    }

    public final void zzv() {
        if (!this.zzq.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.zzq.size(); i++) {
                ((zzlc) this.zzq.get(i)).zzo();
            }
            this.zzq = arrayList;
            this.zzm = null;
            zzt();
        }
    }

    public final void zzw(zzbl zzblVar, zzix zzixVar) {
        this.zzh = zzixVar;
        long j = zzixVar.zzb;
        zzv();
    }

    public final boolean zzx(zzvf zzvfVar) {
        zzlc zzlcVar = this.zzl;
        return zzlcVar != null && zzlcVar.zza == zzvfVar;
    }

    public final boolean zzy(zzvf zzvfVar) {
        zzlc zzlcVar = this.zzm;
        return zzlcVar != null && zzlcVar.zza == zzvfVar;
    }

    public final boolean zzz() {
        zzlc zzlcVar = this.zzl;
        if (zzlcVar != null) {
            return !zzlcVar.zzg.zzj && zzlcVar.zzs() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzlc zzh(zzld zzldVar) {
        zzlc zzlcVar;
        zzlc zzlcVar2 = this.zzl;
        long zze = zzlcVar2 == null ? 1000000000000L : (zzlcVar2.zze() + zzlcVar2.zzg.zze) - zzldVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlcVar = null;
                break;
            }
            zzld zzldVar2 = ((zzlc) this.zzq.get(i)).zzg;
            long j = zzldVar2.zze;
            long j2 = zzldVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzldVar2.zzb == zzldVar.zzb && zzldVar2.zza.equals(zzldVar.zza)) {
                zzlcVar = (zzlc) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlcVar == null) {
            zzlcVar = zzkt.zzg(this.zzr.zza, zzldVar, zze);
        } else {
            zzlcVar.zzg = zzldVar;
            zzlcVar.zzq(zze);
        }
        zzlc zzlcVar3 = this.zzl;
        if (zzlcVar3 != null) {
            zzlcVar3.zzp(zzlcVar);
        } else {
            this.zzi = zzlcVar;
            this.zzj = zzlcVar;
            this.zzk = zzlcVar;
        }
        this.zzo = null;
        this.zzl = zzlcVar;
        this.zzn++;
        zzI();
        return zzlcVar;
    }
}
