package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzmf {
    private final zzma zza;
    private final int zzb;
    private final zzma zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmf(zzma zzmaVar, zzma zzmaVar2, int i) {
        this.zza = zzmaVar;
        this.zzb = i;
        this.zzc = zzmaVar2;
    }

    private final int zzM(zzma zzmaVar, zzlc zzlcVar, zzze zzzeVar, zzil zzilVar) throws zzin {
        if (zzmaVar != null && zzU(zzmaVar)) {
            zzma zzmaVar2 = this.zza;
            boolean z = zzmaVar != zzmaVar2;
            if ((zzmaVar != zzmaVar2 || !zzT()) && (zzmaVar != this.zzc || !zzV())) {
                zzwz zzq = zzmaVar.zzq();
                zzwz[] zzwzVarArr = zzlcVar.zzc;
                int i = this.zzb;
                zzwz zzwzVar = zzwzVarArr[i];
                boolean zzb = zzzeVar.zzb(i);
                if (zzb && zzq == zzwzVar) {
                    return 1;
                }
                if (!zzmaVar.zzS()) {
                    zzz[] zzW = zzW(zzzeVar.zzc[i]);
                    zzwz zzwzVar2 = zzwzVarArr[i];
                    zzwzVar2.getClass();
                    zzmaVar.zzI(zzW, zzwzVar2, zzlcVar.zzf(), zzlcVar.zze(), zzlcVar.zzg.zza);
                    return 3;
                } else if (!zzmaVar.zzX()) {
                    return 0;
                } else {
                    zzO(zzmaVar, zzilVar);
                    if (!zzb || zzI()) {
                        zzQ(!z);
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    private final zzma zzN(zzlc zzlcVar) {
        if (zzlcVar != null) {
            int i = this.zzb;
            zzwz[] zzwzVarArr = zzlcVar.zzc;
            if (zzwzVarArr[i] != null) {
                zzma zzmaVar = this.zza;
                zzwz zzq = zzmaVar.zzq();
                zzwz zzwzVar = zzwzVarArr[i];
                if (zzq == zzwzVar) {
                    return zzmaVar;
                }
                zzma zzmaVar2 = this.zzc;
                if (zzmaVar2 != null && zzmaVar2.zzq() == zzwzVar) {
                    return zzmaVar2;
                }
            }
        }
        return null;
    }

    private final void zzO(zzma zzmaVar, zzil zzilVar) {
        boolean z = true;
        if (this.zza != zzmaVar && this.zzc != zzmaVar) {
            z = false;
        }
        zzdd.zzf(z);
        if (!zzU(zzmaVar)) {
            return;
        }
        zzilVar.zzd(zzmaVar);
        zzX(zzmaVar);
        zzmaVar.zzs();
    }

    private final void zzP(zzma zzmaVar, zzwz zzwzVar, zzil zzilVar, long j, boolean z) throws zzin {
        if (zzU(zzmaVar)) {
            if (zzwzVar != zzmaVar.zzq()) {
                zzO(zzmaVar, zzilVar);
            } else if (!z) {
            } else {
                zzmaVar.zzK(j);
            }
        }
    }

    private final void zzQ(boolean z) {
        if (z) {
            if (!this.zze) {
                return;
            }
            this.zza.zzJ();
            this.zze = false;
        } else if (!this.zzf) {
        } else {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzJ();
            this.zzf = false;
        }
    }

    private final boolean zzS(zzlc zzlcVar, zzma zzmaVar) {
        if (zzmaVar == null) {
            return true;
        }
        zzwz[] zzwzVarArr = zzlcVar.zzc;
        int i = this.zzb;
        zzwz zzwzVar = zzwzVarArr[i];
        if (zzmaVar.zzq() != null) {
            if (zzmaVar.zzq() == zzwzVar) {
                if (zzwzVar != null && !zzmaVar.zzR()) {
                    zzlcVar.zzg();
                    boolean z = zzlcVar.zzg.zzg;
                }
            }
            zzlc zzg = zzlcVar.zzg();
            return zzg != null && zzg.zzc[i] == zzmaVar.zzq();
        }
        return true;
    }

    private final boolean zzT() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private static boolean zzU(zzma zzmaVar) {
        return zzmaVar.zzcU() != 0;
    }

    private final boolean zzV() {
        return this.zzd == 3;
    }

    private static zzz[] zzW(zzyw zzywVar) {
        int zzh = zzywVar != null ? zzywVar.zzh() : 0;
        zzz[] zzzVarArr = new zzz[zzh];
        for (int i = 0; i < zzh; i++) {
            zzywVar.getClass();
            zzzVarArr[i] = zzywVar.zza(i);
        }
        return zzzVarArr;
    }

    private static final void zzX(zzma zzmaVar) {
        if (zzmaVar.zzcU() == 2) {
            zzmaVar.zzQ();
        }
    }

    private static final void zzY(zzma zzmaVar, long j) {
        zzmaVar.zzL();
        if (!(zzmaVar instanceof zzxo)) {
            return;
        }
        zzxo zzxoVar = (zzxo) zzmaVar;
        throw null;
    }

    public final void zzA() throws zzin {
        zzma zzmaVar = this.zza;
        if (zzmaVar.zzcU() != 1 || this.zzd == 4) {
            zzma zzmaVar2 = this.zzc;
            if (zzmaVar2 == null || zzmaVar2.zzcU() != 1 || this.zzd == 3) {
                return;
            }
            zzmaVar2.zzP();
            return;
        }
        zzmaVar.zzP();
    }

    public final void zzB() {
        int i;
        zzdd.zzf(!zzI());
        if (zzU(this.zza)) {
            i = 3;
        } else {
            zzma zzmaVar = this.zzc;
            i = (zzmaVar == null || !zzU(zzmaVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final void zzC() {
        zzma zzmaVar = this.zza;
        if (zzU(zzmaVar)) {
            zzX(zzmaVar);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzU(zzmaVar2)) {
            return;
        }
        zzX(zzmaVar2);
    }

    public final boolean zzD(zzlc zzlcVar) {
        zzma zzN = zzN(zzlcVar);
        return zzN == null || zzN.zzR() || zzN.zzY() || zzN.zzX();
    }

    public final boolean zzE(zzlc zzlcVar) {
        return zzS(zzlcVar, this.zza) && zzS(zzlcVar, this.zzc);
    }

    public final boolean zzF(zzlc zzlcVar) {
        zzma zzN = zzN(zzlcVar);
        zzN.getClass();
        return zzN.zzR();
    }

    public final boolean zzG() {
        return this.zzc != null;
    }

    public final boolean zzH() {
        zzma zzmaVar = this.zza;
        boolean zzX = zzU(zzmaVar) ? zzmaVar.zzX() : true;
        zzma zzmaVar2 = this.zzc;
        return (zzmaVar2 == null || !zzU(zzmaVar2)) ? zzX : zzX & zzmaVar2.zzX();
    }

    public final boolean zzI() {
        return zzT() || zzV();
    }

    public final boolean zzJ(zzlc zzlcVar) {
        return (zzT() && zzN(zzlcVar) == this.zza) || (zzV() && zzN(zzlcVar) == this.zzc);
    }

    public final boolean zzK(zzlc zzlcVar) {
        return zzN(zzlcVar) != null;
    }

    public final boolean zzL() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzU(this.zza);
        }
        zzma zzmaVar = this.zzc;
        zzmaVar.getClass();
        return zzU(zzmaVar);
    }

    public final int zza() {
        zzma zzmaVar = this.zzc;
        boolean zzU = zzU(this.zza);
        int i = 0;
        if (zzmaVar != null && zzU(zzmaVar)) {
            i = 1;
        }
        return (zzU ? 1 : 0) + i;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(zzlc zzlcVar, zzze zzzeVar, zzil zzilVar) throws zzin {
        int zzM = zzM(this.zza, zzlcVar, zzzeVar, zzilVar);
        return zzM == 1 ? zzM(this.zzc, zzlcVar, zzzeVar, zzilVar) : zzM;
    }

    public final long zzd(long j, long j2) {
        zzma zzmaVar = this.zza;
        long zzf = zzU(zzmaVar) ? zzmaVar.zzf(j, j2) : Long.MAX_VALUE;
        zzma zzmaVar2 = this.zzc;
        return (zzmaVar2 == null || !zzU(zzmaVar2)) ? zzf : Math.min(zzf, zzmaVar2.zzf(j, j2));
    }

    public final long zze(zzlc zzlcVar) {
        return ((zzma) Objects.requireNonNull(zzN(zzlcVar))).zzh();
    }

    public final void zzf(zzil zzilVar) throws zzin {
        zzO(this.zza, zzilVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            boolean z = zzU(zzmaVar) && this.zzd != 3;
            zzO(zzmaVar, zzilVar);
            zzQ(false);
            if (z) {
                zzR(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzh(zzme zzmeVar, zzyw zzywVar, zzwz zzwzVar, long j, boolean z, boolean z2, long j2, long j3, zzvh zzvhVar, zzil zzilVar) throws zzin {
        zzz[] zzW = zzW(zzywVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzma zzmaVar = this.zza;
            zzmaVar.zzt(zzmeVar, zzW, zzwzVar, j, z, z2, j2, j3, zzvhVar);
            zzilVar.zze(zzmaVar);
            return;
        }
        this.zzf = true;
        zzma zzmaVar2 = this.zzc;
        zzmaVar2.getClass();
        zzmaVar2.zzt(zzmeVar, zzW, zzwzVar, j, z, z2, j2, j3, zzvhVar);
        zzilVar.zze(zzmaVar2);
    }

    public final void zzi() {
        zzma zzmaVar = this.zza;
        if (zzU(zzmaVar)) {
            zzmaVar.zzu();
            return;
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzU(zzmaVar2)) {
            return;
        }
        zzmaVar2.zzu();
    }

    public final void zzj(int i, Object obj, zzlc zzlcVar) throws zzin {
        zzma zzN = zzN(zzlcVar);
        zzN.getClass();
        zzN.zzv(11, obj);
    }

    public final void zzk(zzwz zzwzVar, zzil zzilVar, long j, boolean z) throws zzin {
        zzP(this.zza, zzwzVar, zzilVar, j, z);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzP(zzmaVar, zzwzVar, zzilVar, j, z);
        }
    }

    public final void zzl() throws zzin {
        int i = this.zzd;
        int i2 = 0;
        if (i != 3 && i != 4) {
            if (i != 2) {
                return;
            }
            this.zzd = 0;
            return;
        }
        zzR(i == 4);
        if (this.zzd != 4) {
            i2 = 1;
        }
        this.zzd = i2;
    }

    public final void zzm(zzze zzzeVar, zzze zzzeVar2, long j) {
        int i;
        int i2 = this.zzb;
        boolean zzb = zzzeVar.zzb(i2);
        boolean zzb2 = zzzeVar2.zzb(i2);
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null || (i = this.zzd) == 3 || (i == 0 && zzU(this.zza))) {
            zzmaVar = this.zza;
        }
        if (!zzb || zzmaVar.zzS()) {
            return;
        }
        zzb();
        zzme zzmeVar = zzzeVar.zzb[i2];
        zzme zzmeVar2 = zzzeVar2.zzb[i2];
        if (zzb2 && Objects.equals(zzmeVar2, zzmeVar) && !zzI()) {
            return;
        }
        zzY(zzmaVar, j);
    }

    public final void zzn(zzlc zzlcVar) throws IOException {
        zzma zzN = zzN(zzlcVar);
        zzN.getClass();
        zzN.zzx();
    }

    public final void zzo() {
        this.zza.zzH();
        this.zze = false;
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzH();
            this.zzf = false;
        }
    }

    public final void zzp(long j, long j2) throws zzin {
        zzma zzmaVar = this.zza;
        if (zzU(zzmaVar)) {
            zzmaVar.zzW(j, j2);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzU(zzmaVar2)) {
            return;
        }
        zzmaVar2.zzW(j, j2);
    }

    public final void zzq() {
        if (!zzU(this.zza)) {
            zzQ(true);
        }
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null || zzU(zzmaVar)) {
            return;
        }
        zzQ(false);
    }

    public final void zzr(zzlc zzlcVar, long j) throws zzin {
        zzma zzN = zzN(zzlcVar);
        if (zzN != null) {
            zzN.zzK(j);
        }
    }

    public final void zzs(long j) {
        int i;
        zzma zzmaVar = this.zza;
        if (zzU(zzmaVar) && (i = this.zzd) != 4 && i != 2) {
            zzY(zzmaVar, j);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzU(zzmaVar2) || this.zzd == 3) {
            return;
        }
        zzY(zzmaVar2, j);
    }

    public final void zzt(zzlc zzlcVar, long j) {
        zzma zzN = zzN(zzlcVar);
        zzN.getClass();
        zzY(zzN, j);
    }

    public final void zzu(float f, float f2) throws zzin {
        this.zza.zzN(f, f2);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzN(f, f2);
        }
    }

    public final void zzv(zzmh zzmhVar) throws zzin {
        this.zza.zzv(18, zzmhVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzv(18, zzmhVar);
        }
    }

    public final void zzw(zzbl zzblVar) {
        this.zza.zzO(zzblVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzO(zzblVar);
        }
    }

    public final void zzx(zzabp zzabpVar) throws zzin {
        if (zzb() != 2) {
            return;
        }
        this.zza.zzv(7, zzabpVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null) {
            return;
        }
        zzmaVar.zzv(7, zzabpVar);
    }

    public final void zzy(Object obj) throws zzin {
        if (zzb() != 2) {
            return;
        }
        int i = this.zzd;
        if (i == 4 || i == 1) {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzv(1, obj);
            return;
        }
        this.zza.zzv(1, obj);
    }

    public final void zzz(float f) throws zzin {
        if (zzb() != 1) {
            return;
        }
        zzma zzmaVar = this.zza;
        Float valueOf = Float.valueOf(f);
        zzmaVar.zzv(2, valueOf);
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null) {
            return;
        }
        zzmaVar2.zzv(2, valueOf);
    }

    private final void zzR(boolean z) throws zzin {
        if (z) {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzv(17, this.zza);
            return;
        }
        zzma zzmaVar2 = this.zza;
        zzma zzmaVar3 = this.zzc;
        zzmaVar3.getClass();
        zzmaVar2.zzv(17, zzmaVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(com.google.android.gms.internal.ads.zzil r8) {
        /*
            r7 = this;
            boolean r0 = r7.zzI()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r7.zzd
            r1 = 0
            r2 = 4
            r3 = 1
            if (r0 == r2) goto L15
            r4 = 2
            if (r0 != r4) goto L13
            r0 = r4
            goto L15
        L13:
            r4 = r1
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 == 0) goto L1b
            com.google.android.gms.internal.ads.zzma r5 = r7.zza
            goto L23
        L1b:
            com.google.android.gms.internal.ads.zzma r5 = r7.zzc
            r5.getClass()
            r6 = r5
            com.google.android.gms.internal.ads.zzma r6 = (com.google.android.gms.internal.ads.zzma) r6
        L23:
            r7.zzO(r5, r8)
            r7.zzQ(r4)
            if (r0 != r2) goto L2c
            r1 = r3
        L2c:
            r7.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmf.zzg(com.google.android.gms.internal.ads.zzil):void");
    }
}
