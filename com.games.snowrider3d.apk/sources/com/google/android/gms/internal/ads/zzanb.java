package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzanb implements zzamz {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzafb zzc;
    private final zzaor zzd;
    private final String zze;
    private final zzen zzf;
    private final zzanr zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzana zzi = new zzana(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzanb(zzaor zzaorVar, String str) {
        zzen zzenVar;
        this.zzd = zzaorVar;
        this.zze = str;
        if (zzaorVar != null) {
            this.zzg = new zzanr(178, 128);
            zzenVar = new zzen();
        } else {
            zzenVar = null;
            this.zzg = null;
        }
        this.zzf = zzenVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r22) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanb.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzady zzadyVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzb = zzaonVar.zzb();
        this.zzc = zzadyVar.zzw(zzaonVar.zza(), 2);
        zzaor zzaorVar = this.zzd;
        if (zzaorVar != null) {
            zzaorVar.zzc(zzadyVar, zzaonVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
        zzdd.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            this.zzc.zzt(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        zzfv.zzi(this.zzh);
        this.zzi.zzb();
        zzanr zzanrVar = this.zzg;
        if (zzanrVar != null) {
            zzanrVar.zzb();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }
}
