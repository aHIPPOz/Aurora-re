package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzajw implements zzakc {
    private final zzakb zza;
    private final long zzb;
    private final long zzc;
    private final zzakh zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajw(zzakh zzakhVar, long j, long j2, long j3, long j4, boolean z) {
        zzdd.zzd(j >= 0 && j2 > j);
        this.zzd = zzakhVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzakb();
    }

    @Override // com.google.android.gms.internal.ads.zzakc
    public final /* bridge */ /* synthetic */ zzaeu zze() {
        if (this.zzf != 0) {
            return new zzaju(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzakc
    public final void zzg(long j) {
        String str = zzex.zza;
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzakc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzd(com.google.android.gms.internal.ads.zzadw r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajw.zzd(com.google.android.gms.internal.ads.zzadw):long");
    }
}
