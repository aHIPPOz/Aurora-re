package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzvc extends zzxm {
    private final boolean zzb;
    private final zzbk zzc;
    private final zzbj zzd;
    private zzva zze;
    private zzuz zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzvc(zzvj zzvjVar, boolean z) {
        super(zzvjVar);
        boolean z2;
        if (z) {
            zzvjVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbk();
        this.zzd = new zzbj();
        zzvjVar.zzM();
        this.zze = zzva.zzq(zzvjVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 == null || !obj.equals(zzva.zzc)) {
            return obj;
        }
        obj3 = this.zze.zze;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzuz zzuzVar = this.zzf;
        int zza = this.zze.zza(zzuzVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zzva zzvaVar = this.zze;
        zzbj zzbjVar = this.zzd;
        zzvaVar.zzd(zza, zzbjVar, false);
        long j2 = zzbjVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzuzVar.zzs(j);
        return true;
    }

    public final zzbl zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    protected final zzvh zzD(zzvh zzvhVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zzvhVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zzva.zzc;
            }
        }
        return zzvhVar.zza(obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r6 != 0) goto L19;
     */
    @Override // com.google.android.gms.internal.ads.zzxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzE(com.google.android.gms.internal.ads.zzbl r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzva r0 = r11.zze
            com.google.android.gms.internal.ads.zzva r12 = r0.zzp(r12)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzuz r12 = r11.zzf
            if (r12 == 0) goto L97
            long r2 = r12.zzn()
            r11.zzL(r2)
            goto L97
        L1a:
            boolean r0 = r12.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r11.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzva r0 = r11.zze
            com.google.android.gms.internal.ads.zzva r12 = r0.zzp(r12)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbk.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzva.zzc
            com.google.android.gms.internal.ads.zzva r12 = com.google.android.gms.internal.ads.zzva.zzr(r12, r0, r2)
        L33:
            r11.zze = r12
            goto L97
        L36:
            com.google.android.gms.internal.ads.zzbk r3 = r11.zzc
            r0 = 0
            r4 = 0
            r12.zze(r0, r3, r4)
            java.lang.Object r8 = r3.zzb
            com.google.android.gms.internal.ads.zzuz r2 = r11.zzf
            if (r2 == 0) goto L5d
            long r6 = r2.zzq()
            com.google.android.gms.internal.ads.zzva r9 = r11.zze
            com.google.android.gms.internal.ads.zzbj r10 = r11.zzd
            com.google.android.gms.internal.ads.zzvh r2 = r2.zza
            java.lang.Object r2 = r2.zza
            r9.zzn(r2, r10)
            com.google.android.gms.internal.ads.zzva r2 = r11.zze
            r2.zze(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r6 = r4
        L5e:
            com.google.android.gms.internal.ads.zzbj r4 = r11.zzd
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.zzl(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.zzi
            if (r12 == 0) goto L7b
            com.google.android.gms.internal.ads.zzva r12 = r11.zze
            com.google.android.gms.internal.ads.zzva r12 = r12.zzp(r2)
            goto L7f
        L7b:
            com.google.android.gms.internal.ads.zzva r12 = com.google.android.gms.internal.ads.zzva.zzr(r2, r8, r0)
        L7f:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzuz r12 = r11.zzf
            if (r12 == 0) goto L97
            boolean r0 = r11.zzL(r3)
            if (r0 == 0) goto L97
            com.google.android.gms.internal.ads.zzvh r12 = r12.zza
            java.lang.Object r0 = r12.zza
            java.lang.Object r0 = r11.zzK(r0)
            com.google.android.gms.internal.ads.zzvh r1 = r12.zza(r0)
        L97:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzva r12 = r11.zze
            r11.zzo(r12)
            if (r1 == 0) goto Lae
            com.google.android.gms.internal.ads.zzuz r12 = r11.zzf
            r12.getClass()
            r0 = r12
            com.google.android.gms.internal.ads.zzuz r0 = (com.google.android.gms.internal.ads.zzuz) r0
            r12.zzr(r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvc.zzE(com.google.android.gms.internal.ads.zzbl):void");
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB(null, ((zzxm) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        ((zzuz) zzvfVar).zzt();
        if (zzvfVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzH */
    public final zzuz zzI(zzvh zzvhVar, zzzm zzzmVar, long j) {
        zzuz zzuzVar = new zzuz(zzvhVar, zzzmVar, j);
        zzuzVar.zzu(this.zza);
        if (this.zzh) {
            zzuzVar.zzr(zzvhVar.zza(zzK(zzvhVar.zza)));
            return zzuzVar;
        }
        this.zzf = zzuzVar;
        if (!this.zzg) {
            this.zzg = true;
            zzB(null, ((zzxm) this).zza);
        }
        return zzuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzug
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvj
    public final void zzt(zzap zzapVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzxi(this.zze.zzb, zzapVar));
        } else {
            this.zze = zzva.zzq(zzapVar);
        }
        this.zza.zzt(zzapVar);
    }
}
