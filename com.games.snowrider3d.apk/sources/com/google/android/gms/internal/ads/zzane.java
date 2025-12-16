package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzane implements zzamz {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaor zzb;
    private zzand zzg;
    private long zzh;
    private String zzi;
    private zzafb zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzanc zze = new zzanc(128);
    private long zzl = -9223372036854775807L;
    private final zzanr zzf = new zzanr(178, 128);
    private final zzen zzc = new zzen();

    public zzane(zzaor zzaorVar, String str) {
        this.zzb = zzaorVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r19) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzane.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzady zzadyVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzi = zzaonVar.zzb();
        this.zzj = zzadyVar.zzw(zzaonVar.zza(), 2);
        this.zzg = new zzand(this.zzj);
        this.zzb.zzc(zzadyVar, zzaonVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
        zzdd.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        zzfv.zzi(this.zzd);
        this.zze.zzb();
        zzand zzandVar = this.zzg;
        if (zzandVar != null) {
            zzandVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}
