package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzkt implements Handler.Callback, zzve, zzzc, zzlq, zzik, zzlu, zzia, zzabp {
    private static final long zza = zzex.zzv(WorkRequest.MIN_BACKOFF_MILLIS);
    private boolean zzB;
    private boolean zzC;
    private zzkr zzD;
    private zzls zzE;
    private zzkq zzF;
    private boolean zzG;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzO;
    private int zzP;
    private zzkr zzQ;
    private long zzR;
    private long zzS;
    private int zzT;
    private boolean zzU;
    private zzin zzV;
    private zzix zzX;
    private boolean zzZ;
    private final zzjj zzab;
    private final zzig zzac;
    private final zzzd zze;
    private final zzze zzf;
    private final zzkx zzg;
    private final zzzl zzh;
    private final zzdt zzi;
    private final zzlt zzj;
    private final Looper zzk;
    private final zzbk zzl;
    private final zzbj zzm;
    private final long zzn;
    private final zzil zzo;
    private final ArrayList zzp;
    private final zzdj zzq;
    private final zzlf zzr;
    private final zzlr zzs;
    private final long zzt;
    private final zzph zzu;
    private final zzmo zzv;
    private final zzdt zzw;
    private final boolean zzx;
    private final zzib zzy;
    private zzmi zzz;
    private long zzY = -9223372036854775807L;
    private int zzM = 0;
    private boolean zzN = false;
    private boolean zzH = false;
    private float zzaa = 1.0f;
    private zzmh zzA = zzmh.zza;
    private long zzW = -9223372036854775807L;
    private long zzK = -9223372036854775807L;
    private final zzmd[] zzc = new zzmd[2];
    private final boolean[] zzd = new boolean[2];
    private final zzmf[] zzb = new zzmf[2];

    public zzkt(Context context, zzma[] zzmaVarArr, zzma[] zzmaVarArr2, zzzd zzzdVar, zzze zzzeVar, zzkx zzkxVar, zzzl zzzlVar, int i, boolean z, zzmo zzmoVar, zzmi zzmiVar, zzig zzigVar, long j, boolean z2, boolean z3, Looper looper, zzdj zzdjVar, zzjj zzjjVar, zzph zzphVar, zzlt zzltVar, zzix zzixVar, final zzabp zzabpVar) {
        this.zzab = zzjjVar;
        this.zze = zzzdVar;
        this.zzf = zzzeVar;
        this.zzg = zzkxVar;
        this.zzh = zzzlVar;
        int i2 = 0;
        this.zzz = zzmiVar;
        this.zzac = zzigVar;
        this.zzt = j;
        this.zzq = zzdjVar;
        this.zzu = zzphVar;
        this.zzX = zzixVar;
        this.zzv = zzmoVar;
        this.zzn = zzkxVar.zzb(zzphVar);
        zzkxVar.zzg(zzphVar);
        zzbl zzblVar = zzbl.zza;
        this.zzE = zzls.zzh(zzzeVar);
        this.zzF = new zzkq(this.zzE);
        int length = zzmaVarArr.length;
        zzmc zze = zzzdVar.zze();
        boolean z4 = false;
        while (true) {
            int length2 = zzmaVarArr.length;
            if (i2 < 2) {
                zzmaVarArr[i2].zzw(i2, zzphVar, zzdjVar);
                this.zzc[i2] = zzmaVarArr[i2].zzn();
                this.zzc[i2].zzM(zze);
                zzma zzmaVar = zzmaVarArr2[i2];
                if (zzmaVar != null) {
                    zzmaVar.zzw(i2, zzphVar, zzdjVar);
                    z4 = true;
                }
                this.zzb[i2] = new zzmf(zzmaVarArr[i2], zzmaVarArr2[i2], i2);
                i2++;
            } else {
                this.zzx = z4;
                this.zzo = new zzil(this, zzdjVar);
                this.zzp = new ArrayList();
                this.zzl = new zzbk();
                this.zzm = new zzbj();
                zzzdVar.zzr(this, zzzlVar);
                this.zzU = true;
                zzdt zzd = zzdjVar.zzd(looper, null);
                this.zzw = zzd;
                this.zzr = new zzlf(zzmoVar, zzd, new zzkk(this), zzixVar);
                this.zzs = new zzlr(this, zzmoVar, zzd, zzphVar);
                zzlt zzltVar2 = new zzlt(null);
                this.zzj = zzltVar2;
                Looper zza2 = zzltVar2.zza();
                this.zzk = zza2;
                zzdt zzd2 = zzdjVar.zzd(zza2, this);
                this.zzi = zzd2;
                this.zzy = new zzib(context, zza2, this);
                zzd2.zzc(35, new zzabp() { // from class: com.google.android.gms.internal.ads.zzkl
                    @Override // com.google.android.gms.internal.ads.zzabp
                    public final void zzcT(long j2, long j3, zzz zzzVar, MediaFormat mediaFormat) {
                        zzkt.this.zzcT(j2, j3, zzzVar, mediaFormat);
                    }
                }).zza();
                return;
            }
        }
    }

    private final long zzA(zzlc zzlcVar) {
        if (zzlcVar == null) {
            return 0L;
        }
        long zze = zzlcVar.zze();
        if (zzlcVar.zze) {
            int i = 0;
            while (true) {
                zzmf[] zzmfVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmfVarArr[i].zzK(zzlcVar)) {
                    long zze2 = zzmfVarArr[i].zze(zzlcVar);
                    if (zze2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zze = Math.max(zze2, zze);
                }
                i++;
            }
        }
        return zze;
    }

    private final long zzB() {
        return zzC(this.zzE.zzq);
    }

    private final long zzC(long j) {
        zzlc zzi = this.zzr.zzi();
        if (zzi == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzR - zzi.zze()));
    }

    private final long zzD(zzvh zzvhVar, long j, boolean z) throws zzin {
        zzlf zzlfVar = this.zzr;
        return zzE(zzvhVar, j, zzlfVar.zzj() != zzlfVar.zzn(), z);
    }

    private final long zzE(zzvh zzvhVar, long j, boolean z, boolean z2) throws zzin {
        zzan();
        zzav(false, true);
        if (z2 || this.zzE.zze == 3) {
            zzaj(2);
        }
        zzlf zzlfVar = this.zzr;
        zzlc zzj = zzlfVar.zzj();
        zzlc zzlcVar = zzj;
        while (zzlcVar != null && !zzvhVar.equals(zzlcVar.zzg.zza)) {
            zzlcVar = zzlcVar.zzg();
        }
        if (z || zzj != zzlcVar || (zzlcVar != null && zzlcVar.zze() + j < 0)) {
            zzK();
            if (zzlcVar != null) {
                while (zzlfVar.zzj() != zzlcVar) {
                    zzlfVar.zze();
                }
                zzlfVar.zza(zzlcVar);
                zzlcVar.zzq(1000000000000L);
                zzM();
                zzlcVar.zzh = true;
            }
        }
        zzJ();
        if (zzlcVar != null) {
            zzlfVar.zza(zzlcVar);
            if (!zzlcVar.zze) {
                zzlcVar.zzg = zzlcVar.zzg.zzb(j);
            } else if (zzlcVar.zzf) {
                zzvf zzvfVar = zzlcVar.zza;
                j = zzvfVar.zze(j);
                zzvfVar.zzh(j - this.zzn, false);
            }
            zzac(j);
            zzT();
        } else {
            zzlfVar.zzs();
            zzac(j);
        }
        zzP(false);
        this.zzi.zzj(2);
        return j;
    }

    private final Pair zzF(zzbl zzblVar) {
        long j = 0;
        if (zzblVar.zzo()) {
            return Pair.create(zzls.zzi(), 0L);
        }
        int zzg = zzblVar.zzg(this.zzN);
        zzbk zzbkVar = this.zzl;
        zzbj zzbjVar = this.zzm;
        Pair zzl = zzblVar.zzl(zzbkVar, zzbjVar, zzg, -9223372036854775807L);
        zzvh zzq = this.zzr.zzq(zzblVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzq.zzb()) {
            zzblVar.zzn(zzq.zza, zzbjVar);
            if (zzq.zzc == zzbjVar.zze(zzq.zzb)) {
                zzbjVar.zzh();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzq, Long.valueOf(j));
    }

    private static Pair zzG(zzbl zzblVar, zzkr zzkrVar, boolean z, int i, boolean z2, zzbk zzbkVar, zzbj zzbjVar) {
        Pair zzl;
        zzbl zzblVar2;
        zzbl zzblVar3 = zzkrVar.zza;
        if (zzblVar.zzo()) {
            return null;
        }
        if (true == zzblVar3.zzo()) {
            zzblVar3 = zzblVar;
        }
        try {
            zzl = zzblVar3.zzl(zzbkVar, zzbjVar, zzkrVar.zzb, zzkrVar.zzc);
            zzblVar2 = zzblVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!zzblVar.equals(zzblVar2)) {
            if (zzblVar.zza(zzl.first) != -1) {
                if (zzblVar2.zzn(zzl.first, zzbjVar).zzf && zzblVar2.zze(zzbjVar.zzc, zzbkVar, 0L).zzn == zzblVar2.zza(zzl.first)) {
                    return zzblVar.zzl(zzbkVar, zzbjVar, zzblVar.zzn(zzl.first, zzbjVar).zzc, zzkrVar.zzc);
                }
            } else {
                int zzd = zzd(zzbkVar, zzbjVar, i, z2, zzl.first, zzblVar2, zzblVar);
                if (zzd != -1) {
                    return zzblVar.zzl(zzbkVar, zzbjVar, zzd, -9223372036854775807L);
                }
                return null;
            }
        }
        return zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce A[EDGE_INSN: B:64:0x00ce->B:50:0x00ce ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzls zzH(com.google.android.gms.internal.ads.zzvh r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzH(com.google.android.gms.internal.ads.zzvh, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzls");
    }

    private final void zzI() throws zzin {
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i < 2) {
                zzmfVarArr[i].zzv(this.zzB ? this.zzA : null);
                i++;
            } else {
                return;
            }
        }
    }

    private final void zzJ() {
        if (!this.zzx || !zzaw()) {
            return;
        }
        zzmf[] zzmfVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            int zza2 = zzmfVar.zza();
            zzmfVar.zzg(this.zzo);
            this.zzP -= zza2 - zzmfVar.zza();
        }
        this.zzY = -9223372036854775807L;
    }

    private final void zzK() throws zzin {
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                this.zzY = -9223372036854775807L;
                return;
            }
            int zza2 = zzmfVarArr[i].zza();
            zzmfVarArr[i].zzf(this.zzo);
            zzX(i, false);
            this.zzP -= zza2;
            i++;
        }
    }

    private final void zzL(zzlc zzlcVar, int i, boolean z, long j) throws zzin {
        zzmf zzmfVar = this.zzb[i];
        if (zzmfVar.zzL()) {
            return;
        }
        boolean z2 = zzlcVar == this.zzr.zzj();
        zzze zzi = zzlcVar.zzi();
        zzme zzmeVar = zzi.zzb[i];
        zzyw zzywVar = zzi.zzc[i];
        boolean z3 = zzaA() && this.zzE.zze == 3;
        boolean z4 = !z && z3;
        this.zzP++;
        zzmfVar.zzh(zzmeVar, zzywVar, zzlcVar.zzc[i], this.zzR, z4, z2, j, zzlcVar.zze(), zzlcVar.zzg.zza, this.zzo);
        zzmfVar.zzj(11, new zzkm(this), zzlcVar);
        if (!z3 || !z2) {
            return;
        }
        zzmfVar.zzA();
    }

    private final void zzM() throws zzin {
        zzN(new boolean[2], this.zzr.zzn().zzf());
    }

    private final void zzN(boolean[] zArr, long j) throws zzin {
        zzmf[] zzmfVarArr;
        long j2;
        zzlc zzn = this.zzr.zzn();
        zzze zzi = zzn.zzi();
        int i = 0;
        while (true) {
            zzmfVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i)) {
                zzmfVarArr[i].zzq();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (!zzi.zzb(i2) || zzmfVarArr[i2].zzK(zzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzL(zzn, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void zzO(IOException iOException, int i) {
        zzlf zzlfVar = this.zzr;
        zzin zzc = zzin.zzc(iOException, i);
        zzlc zzj = zzlfVar.zzj();
        if (zzj != null) {
            zzc = zzc.zza(zzj.zzg.zza);
        }
        zzea.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzam(false, false);
        this.zzE = this.zzE.zze(zzc);
    }

    private final void zzP(boolean z) {
        long j;
        zzlc zzi = this.zzr.zzi();
        zzvh zzvhVar = zzi == null ? this.zzE.zzb : zzi.zzg.zza;
        boolean equals = this.zzE.zzk.equals(zzvhVar);
        if (!equals) {
            this.zzE = this.zzE.zzb(zzvhVar);
        }
        zzls zzlsVar = this.zzE;
        if (zzi == null) {
            j = zzlsVar.zzs;
        } else {
            j = zzi.zzc();
        }
        zzlsVar.zzq = j;
        this.zzE.zzr = zzB();
        if ((!equals || z) && zzi != null && zzi.zze) {
            zzap(zzi.zzg.zza, zzi.zzh(), zzi.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0270 A[Catch: all -> 0x0332, TryCatch #0 {all -> 0x0332, blocks: (B:134:0x026c, B:135:0x0270, B:137:0x0273, B:144:0x028b, B:146:0x0293, B:148:0x029b, B:150:0x02a5, B:151:0x02b0, B:152:0x02b5), top: B:212:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0369 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b4  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzQ(com.google.android.gms.internal.ads.zzbl r29, boolean r30) throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzQ(com.google.android.gms.internal.ads.zzbl, boolean):void");
    }

    private final void zzR(zzbb zzbbVar, boolean z) throws zzin {
        zzS(zzbbVar, zzbbVar.zzb, true, z);
    }

    private final void zzS(zzbb zzbbVar, float f, boolean z, boolean z2) throws zzin {
        int i;
        if (z) {
            if (z2) {
                this.zzF.zza(1);
            }
            zzls zzlsVar = this.zzE;
            zzbl zzblVar = zzlsVar.zza;
            zzvh zzvhVar = zzlsVar.zzb;
            long j = zzlsVar.zzc;
            long j2 = zzlsVar.zzd;
            int i2 = zzlsVar.zze;
            zzin zzinVar = zzlsVar.zzf;
            boolean z3 = zzlsVar.zzg;
            zzxk zzxkVar = zzlsVar.zzh;
            zzze zzzeVar = zzlsVar.zzi;
            List list = zzlsVar.zzj;
            zzvh zzvhVar2 = zzlsVar.zzk;
            boolean z4 = zzlsVar.zzl;
            int i3 = zzlsVar.zzm;
            int i4 = zzlsVar.zzn;
            long j3 = zzlsVar.zzq;
            long j4 = zzlsVar.zzr;
            long j5 = zzlsVar.zzs;
            long j6 = zzlsVar.zzt;
            boolean z5 = zzlsVar.zzp;
            this.zzE = new zzls(zzblVar, zzvhVar, j, j2, i2, zzinVar, z3, zzxkVar, zzzeVar, list, zzvhVar2, z4, i3, i4, zzbbVar, j3, j4, j5, j6, false);
        }
        float f2 = zzbbVar.zzb;
        zzlc zzj = this.zzr.zzj();
        while (true) {
            i = 0;
            if (zzj == null) {
                break;
            }
            zzyw[] zzywVarArr = zzj.zzi().zzc;
            int length = zzywVarArr.length;
            while (i < length) {
                zzyw zzywVar = zzywVarArr[i];
                i++;
            }
            zzj = zzj.zzg();
        }
        zzmf[] zzmfVarArr = this.zzb;
        while (i < 2) {
            zzmfVarArr[i].zzu(f, f2);
            i++;
        }
    }

    private final void zzT() {
        long j;
        long j2;
        zzlf zzlfVar = this.zzr;
        boolean z = false;
        if (zzaC(zzlfVar.zzi())) {
            zzlc zzi = zzlfVar.zzi();
            long zzC = zzC(zzi.zzd());
            if (zzi == zzlfVar.zzj()) {
                j2 = this.zzR;
                j = zzi.zze();
            } else {
                j2 = this.zzR - zzi.zze();
                j = zzi.zzg.zzb;
            }
            zzkw zzkwVar = new zzkw(this.zzu, this.zzE.zza, zzi.zzg.zza, j2 - j, zzC, this.zzo.zzc().zzb, this.zzE.zzl, this.zzJ, zzaB(this.zzE.zza, zzi.zzg.zza) ? this.zzac.zzb() : -9223372036854775807L, this.zzK);
            zzkx zzkxVar = this.zzg;
            boolean zzh = zzkxVar.zzh(zzkwVar);
            zzlc zzj = zzlfVar.zzj();
            if (zzh || !zzj.zze || zzC >= 500000 || this.zzn <= 0) {
                z = zzh;
            } else {
                zzj.zza.zzh(this.zzE.zzs, false);
                z = zzkxVar.zzh(zzkwVar);
            }
        }
        this.zzL = z;
        if (z) {
            zzlc zzi2 = zzlfVar.zzi();
            zzi2.getClass();
            zzky zzkyVar = new zzky();
            zzkyVar.zze(this.zzR - zzi2.zze());
            zzkyVar.zzf(this.zzo.zzc().zzb);
            zzkyVar.zzd(this.zzK);
            zzi2.zzk(new zzla(zzkyVar, null));
        }
        zzao();
    }

    private final void zzU() {
        zzlf zzlfVar = this.zzr;
        zzlfVar.zzt();
        zzlc zzl = zzlfVar.zzl();
        if (zzl != null) {
            if (zzl.zzd && !zzl.zze) {
                return;
            }
            zzvf zzvfVar = zzl.zza;
            if (zzvfVar.zzp()) {
                return;
            }
            if (!this.zzg.zzi(this.zzE.zza, zzl.zzg.zza, zzl.zze ? zzvfVar.zzb() : 0L)) {
                return;
            }
            if (!zzl.zzd) {
                zzl.zzm(this, zzl.zzg.zzb);
                return;
            }
            zzky zzkyVar = new zzky();
            zzkyVar.zze(this.zzR - zzl.zze());
            zzkyVar.zzf(this.zzo.zzc().zzb);
            zzkyVar.zzd(this.zzK);
            zzl.zzk(new zzla(zzkyVar, null));
        }
    }

    private final void zzV() {
        boolean z;
        this.zzF.zzb(this.zzE);
        z = this.zzF.zze;
        if (z) {
            zzjj zzjjVar = this.zzab;
            zzjjVar.zza.zzab(this.zzF);
            this.zzF = new zzkq(this.zzE);
        }
    }

    private final void zzW(int i) throws IOException, zzin {
        zzmf zzmfVar = this.zzb[i];
        try {
            zzlc zzj = this.zzr.zzj();
            if (zzj == null) {
                throw null;
            }
            zzlc zzlcVar = zzj;
            zzmfVar.zzn(zzj);
        } catch (IOException | RuntimeException e) {
            zzmfVar.zzb();
            throw e;
        }
    }

    private final void zzX(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzw.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // java.lang.Runnable
                public final void run() {
                    r0.zzv.zzJ(r1, zzkt.this.zzb[i].zzb(), z);
                }
            });
        }
    }

    private final void zzY() throws zzin {
        int i;
        zzkt zzktVar;
        boolean z;
        zzil zzilVar = this.zzo;
        float f = zzilVar.zzc().zzb;
        zzlf zzlfVar = this.zzr;
        zzlc zzj = zzlfVar.zzj();
        zzlc zzn = zzlfVar.zzn();
        zzze zzzeVar = null;
        boolean z2 = true;
        while (zzj != null && zzj.zze) {
            zzls zzlsVar = this.zzE;
            zzze zzj2 = zzj.zzj(f, zzlsVar.zza, zzlsVar.zzl);
            zzze zzzeVar2 = zzj == zzlfVar.zzj() ? zzj2 : zzzeVar;
            zzze zzi = zzj.zzi();
            boolean z3 = false;
            if (zzi != null) {
                zzyw[] zzywVarArr = zzj2.zzc;
                if (zzi.zzc.length == zzywVarArr.length) {
                    for (int i2 = 0; i2 < zzywVarArr.length; i2++) {
                        if (zzj2.zza(zzi, i2)) {
                        }
                    }
                    if (zzj != zzn) {
                        z3 = true;
                    }
                    z2 &= z3;
                    zzj = zzj.zzg();
                    zzzeVar = zzzeVar2;
                }
            }
            if (z2) {
                zzlc zzj3 = zzlfVar.zzj();
                int zza2 = zzlfVar.zza(zzj3) & 1;
                zzmf[] zzmfVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzzeVar2.getClass();
                long zzb = zzj3.zzb(zzzeVar2, this.zzE.zzs, 1 == zza2, zArr);
                zzls zzlsVar2 = this.zzE;
                if (zzlsVar2.zze == 4 || zzb == zzlsVar2.zzs) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                zzls zzlsVar3 = this.zzE;
                boolean z4 = z;
                i = 2;
                zzktVar = this;
                zzktVar.zzE = zzH(zzlsVar3.zzb, zzb, zzlsVar3.zzc, zzlsVar3.zzd, z3, 5);
                if (z3) {
                    zzktVar.zzac(zzb);
                }
                zzktVar.zzJ();
                boolean[] zArr2 = new boolean[2];
                for (int i3 = z4; i3 < 2; i3++) {
                    int zza3 = zzmfVarArr[i3].zza();
                    zArr2[i3] = zzmfVarArr[i3].zzL();
                    zzmfVarArr[i3].zzk(zzj3.zzc[i3], zzilVar, zzktVar.zzR, zArr[i3]);
                    if (zza3 - zzmfVarArr[i3].zza() > 0) {
                        zzktVar.zzX(i3, z4);
                    }
                    zzktVar.zzP -= zza3 - zzmfVarArr[i3].zza();
                }
                zzktVar.zzN(zArr2, zzktVar.zzR);
                zzj3.zzh = true;
            } else {
                zzktVar = this;
                i = 2;
                zzlfVar.zza(zzj);
                if (zzj.zze) {
                    long max = Math.max(zzj.zzg.zzb, zzktVar.zzR - zzj.zze());
                    if (zzktVar.zzx && zzktVar.zzaw() && zzlfVar.zzm() == zzj) {
                        zzktVar.zzJ();
                    }
                    zzj.zza(zzj2, max, false);
                }
            }
            zzktVar.zzP(true);
            if (zzktVar.zzE.zze == 4) {
                return;
            }
            zzktVar.zzT();
            zzktVar.zzat();
            zzktVar.zzi.zzj(i);
            return;
        }
    }

    private final void zzZ() throws zzin {
        zzY();
        zzaf(true);
    }

    private final boolean zzaA() {
        zzls zzlsVar = this.zzE;
        return zzlsVar.zzl && zzlsVar.zzn == 0;
    }

    private final boolean zzaB(zzbl zzblVar, zzvh zzvhVar) {
        if (!zzvhVar.zzb() && !zzblVar.zzo()) {
            int i = zzblVar.zzn(zzvhVar.zza, this.zzm).zzc;
            zzbk zzbkVar = this.zzl;
            zzblVar.zze(i, zzbkVar, 0L);
            if (zzbkVar.zzb() && zzbkVar.zzi && zzbkVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzaC(zzlc zzlcVar) {
        if (zzlcVar != null) {
            try {
                if (!zzlcVar.zze) {
                    zzlcVar.zza.zzi();
                } else {
                    zzwz[] zzwzVarArr = zzlcVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzwz zzwzVar = zzwzVarArr[i];
                        if (zzwzVar != null) {
                            zzwzVar.zzd();
                        }
                    }
                }
                if (zzlcVar.zzd() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static final void zzaD(zzlw zzlwVar) throws zzin {
        zzlwVar.zzi();
        try {
            zzlwVar.zzc().zzv(zzlwVar.zza(), zzlwVar.zzg());
        } finally {
            zzlwVar.zzh(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        if (r2.equals(r34.zzE.zzb) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaa(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzaa(boolean, boolean, boolean, boolean):void");
    }

    private final void zzab() {
        zzlc zzj = this.zzr.zzj();
        boolean z = false;
        if (zzj != null && zzj.zzg.zzi && this.zzH) {
            z = true;
        }
        this.zzI = z;
    }

    private final void zzac(long j) throws zzin {
        zzlf zzlfVar;
        zzyw[] zzywVarArr;
        zzlc zzj = this.zzr.zzj();
        long zze = j + (zzj == null ? 1000000000000L : zzj.zze());
        this.zzR = zze;
        this.zzo.zzf(zze);
        zzmf[] zzmfVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmfVarArr[i].zzr(zzj, this.zzR);
        }
        for (zzlc zzj2 = zzlfVar.zzj(); zzj2 != null; zzj2 = zzj2.zzg()) {
            for (zzyw zzywVar : zzj2.zzi().zzc) {
            }
        }
    }

    private final void zzad(zzbl zzblVar, zzbl zzblVar2) {
        if (!zzblVar.zzo() || !zzblVar2.zzo()) {
            ArrayList arrayList = this.zzp;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                zzkp zzkpVar = (zzkp) arrayList.get(size);
                Object obj = zzkpVar.zzb;
                zzlw zzlwVar = zzkpVar.zza;
                String str = zzex.zza;
                throw null;
            }
            Collections.sort(arrayList);
        }
    }

    private final void zzae(long j) {
        long j2 = 1000;
        if (!zzax()) {
            if (this.zzE.zze != 3 || zzaA()) {
                j2 = zza;
            }
        } else {
            if (this.zzE.zze != 3) {
                j2 = zza;
            }
            if (zzaA()) {
                zzmf[] zzmfVarArr = this.zzb;
                for (int i = 0; i < 2; i++) {
                    j2 = Math.min(j2, zzex.zzv(zzmfVarArr[i].zzd(this.zzR, this.zzS)));
                }
                zzlf zzlfVar = this.zzr;
                zzlc zzg = zzlfVar.zzj() != null ? zzlfVar.zzj().zzg() : null;
                if (zzg != null) {
                    if (((float) this.zzR) + (((float) zzex.zzs(j2)) * this.zzE.zzo.zzb) >= ((float) zzg.zzf())) {
                        j2 = Math.min(j2, zza);
                    }
                }
            }
        }
        this.zzi.zzk(2, j + j2);
    }

    private final void zzaf(boolean z) throws zzin {
        zzvh zzvhVar = this.zzr.zzj().zzg.zza;
        long zzE = zzE(zzvhVar, this.zzE.zzs, true, false);
        if (zzE != this.zzE.zzs) {
            zzls zzlsVar = this.zzE;
            this.zzE = zzH(zzvhVar, zzE, zzlsVar.zzc, zzlsVar.zzd, z, 5);
        }
    }

    private final void zzag(zzkr zzkrVar, boolean z) throws zzin {
        long j;
        long j2;
        long j3;
        zzvh zzvhVar;
        boolean z2;
        boolean z3;
        long j4;
        long j5;
        zzvh zzvhVar2;
        Throwable th;
        boolean z4;
        long j6;
        long j7;
        zzvh zzvhVar3;
        long j8;
        zzls zzlsVar;
        int i;
        this.zzF.zza(z ? 1 : 0);
        if (this.zzC) {
            this.zzD = zzkrVar;
            return;
        }
        zzbl zzblVar = this.zzE.zza;
        int i2 = this.zzM;
        boolean z5 = this.zzN;
        zzbk zzbkVar = this.zzl;
        zzbj zzbjVar = this.zzm;
        Pair zzG = zzG(zzblVar, zzkrVar, true, i2, z5, zzbkVar, zzbjVar);
        boolean z6 = false;
        if (zzG == null) {
            Pair zzF = zzF(this.zzE.zza);
            zzvhVar = (zzvh) zzF.first;
            j3 = ((Long) zzF.second).longValue();
            z2 = !this.zzE.zza.zzo();
            j2 = -9223372036854775807L;
            j = 0;
        } else {
            Object obj = zzG.first;
            j3 = ((Long) zzG.second).longValue();
            int i3 = (zzkrVar.zzc > (-9223372036854775807L) ? 1 : (zzkrVar.zzc == (-9223372036854775807L) ? 0 : -1));
            j2 = i3 == 0 ? -9223372036854775807L : j3;
            j = 0;
            zzvhVar = this.zzr.zzq(this.zzE.zza, obj, j3);
            if (zzvhVar.zzb()) {
                this.zzE.zza.zzn(zzvhVar.zza, zzbjVar);
                if (zzbjVar.zze(zzvhVar.zzb) == zzvhVar.zzc) {
                    zzbjVar.zzh();
                }
                z2 = true;
                j3 = 0;
            } else {
                z2 = i3 == 0;
            }
        }
        try {
            if (this.zzE.zza.zzo()) {
                this.zzQ = zzkrVar;
            } else if (zzG == null) {
                if (this.zzE.zze != 1) {
                    zzaj(4);
                }
                zzaa(false, true, false, true);
            } else {
                if (zzvhVar.equals(this.zzE.zzb)) {
                    zzlc zzj = this.zzr.zzj();
                    if (zzj == null || !zzj.zze || j3 == j) {
                        j8 = j3;
                    } else {
                        zzvf zzvfVar = zzj.zza;
                        long j9 = zzbkVar.zzm;
                        if (this.zzB && j9 != -9223372036854775807L) {
                            Double d = this.zzA.zzc;
                        }
                        j8 = zzvfVar.zza(j3, this.zzz);
                    }
                    if (zzex.zzv(j8) == zzex.zzv(this.zzE.zzs) && ((i = (zzlsVar = this.zzE).zze) == 2 || i == 3)) {
                        j3 = zzlsVar.zzs;
                    }
                } else {
                    j8 = j3;
                }
                this.zzC = this.zzB;
                long zzD = zzD(zzvhVar, j8, this.zzE.zze == 4);
                if (j3 != zzD) {
                    z6 = true;
                }
                boolean z7 = z2 | z6;
                try {
                    zzls zzlsVar2 = this.zzE;
                    zzbl zzblVar2 = zzlsVar2.zza;
                    zzvh zzvhVar4 = zzvhVar;
                    long j10 = j2;
                    try {
                        zzau(zzblVar2, zzvhVar4, zzblVar2, zzlsVar2.zzb, j10, true);
                        zzvhVar3 = zzvhVar4;
                        j6 = j10;
                        j7 = zzD;
                        z4 = z7;
                        this.zzE = zzH(zzvhVar3, j7, j6, j7, z4, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        zzvhVar2 = zzvhVar4;
                        j4 = j10;
                        j5 = zzD;
                        z3 = z7;
                        this.zzE = zzH(zzvhVar2, j5, j4, j5, z3, 2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zzvhVar2 = zzvhVar;
                    j4 = j2;
                }
            }
            z4 = z2;
            zzvhVar3 = zzvhVar;
            j7 = j3;
            j6 = j2;
            this.zzE = zzH(zzvhVar3, j7, j6, j7, z4, 2);
        } catch (Throwable th4) {
            th = th4;
            zzvhVar2 = zzvhVar;
            j4 = j2;
            z3 = z2;
            j5 = j3;
        }
    }

    private final void zzah(zzbb zzbbVar) {
        this.zzi.zzg(16);
        this.zzo.zzg(zzbbVar);
    }

    private final void zzai(boolean z, int i, boolean z2, int i2) throws zzin {
        this.zzF.zza(z2 ? 1 : 0);
        zzar(z, i, i2);
    }

    private final void zzaj(int i) {
        zzls zzlsVar = this.zzE;
        if (zzlsVar.zze != i) {
            if (i != 2) {
                this.zzW = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = zzlsVar.zzp;
            }
            this.zzE = this.zzE.zzf(i);
        }
    }

    private final void zzak(float f) throws zzin {
        this.zzaa = f;
        float zza2 = f * this.zzy.zza();
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i < 2) {
                zzmfVarArr[i].zzz(zza2);
                i++;
            } else {
                return;
            }
        }
    }

    private final void zzal() throws zzin {
        zzlc zzj = this.zzr.zzj();
        if (zzj == null) {
            return;
        }
        zzze zzi = zzj.zzi();
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzi.zzb(i)) {
                zzmfVarArr[i].zzA();
            }
            i++;
        }
    }

    private final void zzam(boolean z, boolean z2) {
        zzaa(z || !this.zzO, false, true, false);
        this.zzF.zza(z2 ? 1 : 0);
        this.zzg.zze(this.zzu);
        this.zzy.zzb(this.zzE.zzl, 1);
        zzaj(1);
    }

    private final void zzan() throws zzin {
        this.zzo.zzi();
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i < 2) {
                zzmfVarArr[i].zzC();
                i++;
            } else {
                return;
            }
        }
    }

    private final void zzao() {
        zzlc zzi = this.zzr.zzi();
        boolean z = true;
        if (!this.zzL && (zzi == null || !zzi.zza.zzp())) {
            z = false;
        }
        zzls zzlsVar = this.zzE;
        if (z != zzlsVar.zzg) {
            this.zzE = zzlsVar.zza(z);
        }
    }

    private final void zzap(zzvh zzvhVar, zzxk zzxkVar, zzze zzzeVar) {
        long j;
        long j2;
        zzlf zzlfVar = this.zzr;
        zzlc zzi = zzlfVar.zzi();
        zzi.getClass();
        if (zzi == zzlfVar.zzj()) {
            j2 = this.zzR;
            j = zzi.zze();
        } else {
            j2 = this.zzR - zzi.zze();
            j = zzi.zzg.zzb;
        }
        this.zzg.zzf(new zzkw(this.zzu, this.zzE.zza, zzvhVar, j2 - j, zzC(zzi.zzc()), this.zzo.zzc().zzb, this.zzE.zzl, this.zzJ, zzaB(this.zzE.zza, zzi.zzg.zza) ? this.zzac.zzb() : -9223372036854775807L, this.zzK), zzxkVar, zzzeVar.zzc);
    }

    private final void zzaq() throws zzin {
        zzls zzlsVar = this.zzE;
        zzar(zzlsVar.zzl, zzlsVar.zzn, zzlsVar.zzm);
    }

    private final void zzar(boolean z, int i, int i2) throws zzin {
        zzas(z, this.zzy.zzb(z, this.zzE.zze), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzas(boolean r5, int r6, int r7, int r8) throws com.google.android.gms.internal.ads.zzin {
        /*
            r4 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r5 == 0) goto La
            if (r6 == r0) goto L9
            r5 = r1
            goto Lb
        L9:
            r6 = r0
        La:
            r5 = r2
        Lb:
            r3 = 2
            if (r6 != r0) goto L10
            r8 = r3
            goto L13
        L10:
            if (r8 != r3) goto L13
            r8 = r1
        L13:
            if (r6 != 0) goto L17
            r7 = r1
            goto L1a
        L17:
            if (r7 != r1) goto L1a
            r7 = r2
        L1a:
            com.google.android.gms.internal.ads.zzls r6 = r4.zzE
            boolean r0 = r6.zzl
            if (r0 != r5) goto L28
            int r0 = r6.zzn
            if (r0 != r7) goto L28
            int r0 = r6.zzm
            if (r0 == r8) goto L7f
        L28:
            com.google.android.gms.internal.ads.zzls r5 = r6.zzd(r5, r8, r7)
            r4.zzE = r5
            r4.zzav(r2, r2)
            com.google.android.gms.internal.ads.zzlf r5 = r4.zzr
            com.google.android.gms.internal.ads.zzlc r6 = r5.zzj()
        L37:
            if (r6 == 0) goto L4d
            com.google.android.gms.internal.ads.zzze r7 = r6.zzi()
            com.google.android.gms.internal.ads.zzyw[] r7 = r7.zzc
            int r8 = r7.length
            r0 = r2
        L41:
            if (r0 >= r8) goto L48
            r1 = r7[r0]
            int r0 = r0 + 1
            goto L41
        L48:
            com.google.android.gms.internal.ads.zzlc r6 = r6.zzg()
            goto L37
        L4d:
            boolean r6 = r4.zzaA()
            if (r6 != 0) goto L63
            r4.zzan()
            r4.zzat()
            com.google.android.gms.internal.ads.zzls r6 = r4.zzE
            boolean r6 = r6.zzp
            long r6 = r4.zzR
            r5.zzu(r6)
            return
        L63:
            com.google.android.gms.internal.ads.zzls r5 = r4.zzE
            int r5 = r5.zze
            r6 = 3
            if (r5 != r6) goto L78
            com.google.android.gms.internal.ads.zzil r5 = r4.zzo
            r5.zzh()
            r4.zzal()
            com.google.android.gms.internal.ads.zzdt r5 = r4.zzi
            r5.zzj(r3)
            return
        L78:
            if (r5 != r3) goto L7f
            com.google.android.gms.internal.ads.zzdt r5 = r4.zzi
            r5.zzj(r3)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzas(boolean, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[LOOP:0: B:30:0x00a9->B:37:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c6 -> B:30:0x00a9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzat() throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzat():void");
    }

    private final void zzau(zzbl zzblVar, zzvh zzvhVar, zzbl zzblVar2, zzvh zzvhVar2, long j, boolean z) throws zzin {
        if (!zzaB(zzblVar, zzvhVar)) {
            zzbb zzbbVar = zzvhVar.zzb() ? zzbb.zza : this.zzE.zzo;
            if (this.zzo.zzc().equals(zzbbVar)) {
                return;
            }
            zzah(zzbbVar);
            zzS(this.zzE.zzo, zzbbVar.zzb, false, false);
            return;
        }
        Object obj = zzvhVar.zza;
        zzbj zzbjVar = this.zzm;
        int i = zzblVar.zzn(obj, zzbjVar).zzc;
        zzbk zzbkVar = this.zzl;
        zzblVar.zze(i, zzbkVar, 0L);
        zzig zzigVar = this.zzac;
        zzaj zzajVar = zzbkVar.zzj;
        String str = zzex.zza;
        zzigVar.zzd(zzajVar);
        if (j != -9223372036854775807L) {
            zzigVar.zze(zzz(zzblVar, obj, j));
            return;
        }
        if (Objects.equals(!zzblVar2.zzo() ? zzblVar2.zze(zzblVar2.zzn(zzvhVar2.zza, zzbjVar).zzc, zzbkVar, 0L).zzb : null, zzbkVar.zzb) && !z) {
            return;
        }
        zzigVar.zze(-9223372036854775807L);
    }

    private final void zzav(boolean z, boolean z2) {
        this.zzJ = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzK = j;
    }

    private final boolean zzaw() {
        if (!this.zzx) {
            return false;
        }
        zzmf[] zzmfVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmfVarArr[i].zzI()) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzax() {
        if (this.zzB) {
            boolean z = this.zzA.zzg;
            return true;
        }
        return false;
    }

    private final boolean zzay() {
        zzlc zzj = this.zzr.zzj();
        long j = zzj.zzg.zze;
        if (zzj.zze) {
            return j == -9223372036854775807L || this.zzE.zzs < j || !zzaA();
        }
        return false;
    }

    private static boolean zzaz(zzls zzlsVar, zzbj zzbjVar) {
        zzvh zzvhVar = zzlsVar.zzb;
        zzbl zzblVar = zzlsVar.zza;
        return zzblVar.zzo() || zzblVar.zzn(zzvhVar.zza, zzbjVar).zzf;
    }

    static int zzd(zzbk zzbkVar, zzbj zzbjVar, int i, boolean z, Object obj, zzbl zzblVar, zzbl zzblVar2) {
        zzbk zzbkVar2 = zzbkVar;
        zzbl zzblVar3 = zzblVar;
        Object obj2 = zzblVar3.zze(zzblVar3.zzn(obj, zzbjVar).zzc, zzbkVar, 0L).zzb;
        for (int i2 = 0; i2 < zzblVar2.zzc(); i2++) {
            if (zzblVar2.zze(i2, zzbkVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zza2 = zzblVar3.zza(obj);
        int zzb = zzblVar3.zzb();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= zzb || i3 != -1) {
                break;
            }
            zzbl zzblVar4 = zzblVar3;
            int zzi = zzblVar4.zzi(zza2, zzbjVar, zzbkVar2, i, z);
            if (zzi == -1) {
                i3 = -1;
                break;
            }
            i3 = zzblVar2.zza(zzblVar4.zzf(zzi));
            i4++;
            zzblVar3 = zzblVar4;
            zza2 = zzi;
            zzbkVar2 = zzbkVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return zzblVar2.zzd(i3, zzbjVar, false).zzc;
    }

    public static /* synthetic */ zzlc zzg(zzkt zzktVar, zzld zzldVar, long j) {
        zzzm zzk = zzktVar.zzg.zzk();
        long j2 = zzktVar.zzX.zzb;
        zzze zzzeVar = zzktVar.zzf;
        zzlr zzlrVar = zzktVar.zzs;
        return new zzlc(zzktVar.zzc, j, zzktVar.zze, zzk, zzlrVar, zzldVar, zzzeVar, -9223372036854775807L);
    }

    public static /* synthetic */ void zzh(zzkt zzktVar, zzlw zzlwVar) {
        try {
            zzaD(zzlwVar);
        } catch (zzin e) {
            zzea.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzz(zzbl zzblVar, Object obj, long j) {
        long j2;
        int i = zzblVar.zzn(obj, this.zzm).zzc;
        zzbk zzbkVar = this.zzl;
        zzblVar.zze(i, zzbkVar, 0L);
        if (zzbkVar.zzf == -9223372036854775807L || !zzbkVar.zzb() || !zzbkVar.zzi) {
            return -9223372036854775807L;
        }
        long j3 = zzbkVar.zzg;
        String str = zzex.zza;
        if (j3 == -9223372036854775807L) {
            j2 = System.currentTimeMillis();
        } else {
            j2 = j3 + SystemClock.elapsedRealtime();
        }
        return zzex.zzs(j2 - zzbkVar.zzf) - j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:185|664|186|663|(3:661|188|(1:190)(20:191|(1:206)(5:195|(2:197|198)(2:199|(1:201))|202|(1:204)|205)|207|(1:209)(1:210)|211|(1:247)(2:227|(2:229|(2:230|(3:232|(2:239|682)(2:238|683)|240)(16:681|241|(2:243|(1:245))|249|(14:252|(3:671|254|(1:256)(11:257|(2:259|(2:260|(2:262|(1:264)(1:684))(3:685|265|(8:274|275|276|(8:284|(3:288|(3:290|(2:292|(2:686|296))(1:688)|297)|687)|298|(1:300)|691|301|(1:303)|307)|304|(1:306)|692|307))))(1:308)|342|(2:349|(2:350|(1:352)(2:697|(4:354|(3:356|(2:360|699)|361)|698|362))))|363|(4:(1:378)|379|(10:381|(2:383|(2:385|(8:389|392|(3:396|(1:398)|709)|399|(1:401)|402|(2:403|(3:405|(2:407|711)(1:712)|408))|409)))(1:390)|391|392|(4:394|396|(0)|709)|399|(0)|402|(3:403|(1:1)(0)|408)|409)(3:703|410|411)|364)|366|412|666|417|(3:419|(2:422|(2:424|425)(18:427|428|(2:430|(2:431|(3:433|(3:435|436|715)(8:437|438|439|440|(1:445)(1:444)|446|(1:450)(1:449)|(2:452|714)(1:716))|453)(2:713|454)))(1:455)|456|(4:464|(1:466)|467|(10:469|520|(2:522|(2:523|(3:525|(2:527|720)(1:721)|528)(3:719|529|(7:537|(1:539)(2:540|(1:542)(2:543|544))|546|(1:551)(1:550)|552|(1:561)|562))))|545|546|(1:548)|551|552|(1:554)(1:561)|562))|470|(2:472|(1:474)(1:(13:477|(7:479|(1:481)(1:482)|483|(1:488)(1:487)|489|(1:494)(1:493)|(1:497))|499|(1:501)|520|(0)|545|546|(0)|551|552|(0)(0)|562)(1:476)))|502|(2:504|(2:506|(4:508|510|(4:512|(4:514|(1:516)|718|517)|717|518)|519))(0))|520|(0)|545|546|(0)|551|552|(0)(0)|562))(1:421)|605)))|323|(3:327|(3:329|(4:334|(1:339)(1:338)|340|694)|341)|693)|342|(4:344|346|349|(3:350|(0)(0)|352))|363|(9:367|369|371|373|375|(0)|379|(0)(0)|364)|704|366|412|666|417|(0))|251|342|(0)|363|(1:364)|704|366|412|666|417|(0))))(1:246))|248|249|(0)|251|342|(0)|363|(1:364)|704|366|412|666|417|(0)))|416|666|417|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x09b1, code lost:
        if (r6 != false) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x09de, code lost:
        if (r7 == false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0aa1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0aa6, code lost:
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0ac6, code lost:
        r12 = r17;
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0b91, code lost:
        if (r2 != null) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0b99, code lost:
        r2 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0ba8, code lost:
        zzT();
        r41.zzi.zzj(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0bb6, code lost:
        r2.addSuppressed(r0);
        r0 = r41.zzV;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0bc0, code lost:
        r2 = r41.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0bca, code lost:
        if (r2.zzj() != r2.zzn()) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0bd4, code lost:
        if (r2.zzj() != r2.zzn()) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0bd6, code lost:
        r2.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0bda, code lost:
        r2 = r2.zzj();
        r2.getClass();
        zzV();
        r2 = r2.zzg;
        r3 = r2.zza;
        r3 = r2.zzb;
        r41.zzE = zzH(r3, r3, r2.zzc, r3, true, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0c0d, code lost:
        com.google.android.gms.internal.ads.zzea.zzg(r11, "Recoverable renderer error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0c14, code lost:
        if (r41.zzV == null) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0c16, code lost:
        r41.zzV = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0c18, code lost:
        r2 = r41.zzi;
        r2.zzl(r2.zzc(25, r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0587 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TRY_LEAVE, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06f8 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0712 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, LOOP:10: B:350:0x070e->B:352:0x0712, LOOP_END, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0764 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0784 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0790 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07f6 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, LOOP:13: B:397:0x07f4->B:398:0x07f6, LOOP_END, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0804 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0814 A[Catch: zzin -> 0x085b, RuntimeException -> 0x0a9f, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #15 {RuntimeException -> 0x0a9f, blocks: (B:198:0x0497, B:199:0x049d, B:201:0x04a3, B:202:0x04ae, B:204:0x04b4, B:205:0x04b9, B:207:0x04bf, B:209:0x04c3, B:210:0x04d1, B:211:0x04d4, B:213:0x04d8, B:215:0x04dc, B:217:0x04e0, B:219:0x04e6, B:221:0x04ec, B:223:0x04f2, B:225:0x04f8, B:227:0x0500, B:229:0x050a, B:230:0x0510, B:232:0x0514, B:234:0x051a, B:236:0x0522, B:238:0x052a, B:240:0x0547, B:241:0x054c, B:243:0x0559, B:245:0x0567, B:249:0x057b, B:252:0x0587, B:262:0x05a0, B:267:0x05b1, B:271:0x05c3, B:276:0x0604, B:278:0x060b, B:280:0x060f, B:282:0x0615, B:284:0x061f, B:286:0x0623, B:290:0x062a, B:292:0x0630, B:294:0x064d, B:297:0x0656, B:298:0x0659, B:300:0x0660, B:301:0x0668, B:303:0x066e, B:306:0x067c, B:323:0x06b5, B:325:0x06bf, B:327:0x06c3, B:329:0x06c8, B:332:0x06d1, B:334:0x06d7, B:338:0x06e5, B:340:0x06ec, B:341:0x06ef, B:342:0x06f2, B:344:0x06f8, B:346:0x06fe, B:349:0x0703, B:350:0x070e, B:352:0x0712, B:356:0x0737, B:358:0x073d, B:360:0x0745, B:361:0x074d, B:362:0x0750, B:364:0x0759, B:367:0x0764, B:369:0x0768, B:371:0x076e, B:373:0x0774, B:375:0x077e, B:378:0x0784, B:379:0x0787, B:381:0x0790, B:383:0x07a5, B:385:0x07ae, B:387:0x07b6, B:392:0x07c0, B:394:0x07eb, B:396:0x07f1, B:398:0x07f6, B:399:0x07fe, B:401:0x0804, B:402:0x0807, B:403:0x0810, B:405:0x0814, B:407:0x081a, B:408:0x081f, B:411:0x0827, B:412:0x0828, B:417:0x0840, B:422:0x084c, B:425:0x0856, B:428:0x085f, B:430:0x086b, B:431:0x0885, B:433:0x0889, B:435:0x0891, B:438:0x089b), top: B:663:0x046a }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a76 A[Catch: RuntimeException -> 0x0ac3, zzin -> 0x0ac5, IOException -> 0x0af9, zzuh -> 0x0b00, zzgk -> 0x0b07, zzaz -> 0x0b0e, zzsa -> 0x0b24, TryCatch #36 {zzin -> 0x0ac5, RuntimeException -> 0x0ac3, blocks: (B:440:0x089f, B:442:0x08a6, B:446:0x08af, B:452:0x08bf, B:453:0x08c2, B:455:0x08d0, B:456:0x08db, B:458:0x08e1, B:462:0x08e9, B:464:0x08f1, B:466:0x08f5, B:467:0x0900, B:469:0x0906, B:470:0x090f, B:472:0x0915, B:474:0x0919, B:477:0x0923, B:479:0x0927, B:481:0x0939, B:483:0x0944, B:485:0x094e, B:489:0x0957, B:491:0x0961, B:497:0x096c, B:499:0x09b3, B:501:0x09bf, B:502:0x09cc, B:504:0x09d3, B:506:0x09d7, B:510:0x09e0, B:512:0x09ef, B:514:0x09f5, B:516:0x09ff, B:517:0x0a04, B:518:0x0a09, B:519:0x0a0e, B:520:0x0a11, B:523:0x0a18, B:525:0x0a1c, B:527:0x0a24, B:528:0x0a27, B:529:0x0a2a, B:531:0x0a30, B:533:0x0a39, B:535:0x0a43, B:537:0x0a49, B:539:0x0a4f, B:540:0x0a56, B:543:0x0a64, B:544:0x0a6b, B:545:0x0a6c, B:546:0x0a70, B:548:0x0a76, B:552:0x0a80, B:559:0x0a93, B:561:0x0a97, B:562:0x0a9a, B:570:0x0aa9, B:574:0x0ab4), top: B:670:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a8b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a8c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0b91 A[LOOP:19: B:627:0x0b91->B:630:0x0b99, LOOP_START, PHI: r2 
      PHI: (r2v24 com.google.android.gms.internal.ads.zzlc) = (r2v22 com.google.android.gms.internal.ads.zzlc), (r2v25 com.google.android.gms.internal.ads.zzlc) binds: [B:626:0x0b8e, B:630:0x0b99] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0732 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0826 A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r42) {
        /*
            Method dump skipped, instructions count: 3210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public final void zza(int i) {
        this.zzi.zzd(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public final void zzb(float f) {
        this.zzi.zzj(34);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzc(zzbb zzbbVar) {
        this.zzi.zzc(16, zzbbVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzcT(long j, long j2, zzz zzzVar, MediaFormat mediaFormat) {
        if (this.zzC) {
            this.zzi.zzb(37).zza();
        }
    }

    public final Looper zze() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzj(zzxb zzxbVar) {
        this.zzi.zzc(9, (zzvf) zzxbVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzk() {
        zzdt zzdtVar = this.zzi;
        zzdtVar.zzg(2);
        zzdtVar.zzj(22);
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzl(zzvf zzvfVar) {
        this.zzi.zzc(8, zzvfVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzm() {
        this.zzi.zzj(10);
    }

    public final void zzn() {
        this.zzi.zzb(29).zza();
    }

    public final void zzo(zzbl zzblVar, int i, long j) {
        this.zzi.zzc(3, new zzkr(zzblVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzp(zzlw zzlwVar) {
        if (this.zzG || !this.zzk.getThread().isAlive()) {
            zzea.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlwVar.zzh(false);
            return;
        }
        this.zzi.zzc(14, zzlwVar).zza();
    }

    public final void zzq(zze zzeVar, boolean z) {
        this.zzi.zze(31, 0, 0, zzeVar).zza();
    }

    public final void zzr(boolean z, int i, int i2) {
        this.zzi.zzd(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzs(zzmh zzmhVar) {
        this.zzi.zzc(38, zzmhVar).zza();
    }

    public final void zzt(float f) {
        this.zzi.zzc(32, Float.valueOf(f)).zza();
    }

    public final void zzu() {
        this.zzi.zzb(6).zza();
    }

    public final boolean zzw() {
        if (this.zzG || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzG = true;
        zzdm zzdmVar = new zzdm(this.zzq);
        this.zzi.zzc(7, zzdmVar).zza();
        return zzdmVar.zzc(this.zzt);
    }

    public final boolean zzx(Object obj, long j) {
        if (this.zzG || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdm zzdmVar = new zzdm(this.zzq);
        this.zzi.zzc(30, new Pair(obj, zzdmVar)).zza();
        if (j == -9223372036854775807L) {
            return true;
        }
        return zzdmVar.zzc(j);
    }

    public final void zzy(List list, int i, long j, zzxc zzxcVar) {
        this.zzi.zzc(17, new zzkn(list, zzxcVar, i, j, null)).zza();
    }
}
