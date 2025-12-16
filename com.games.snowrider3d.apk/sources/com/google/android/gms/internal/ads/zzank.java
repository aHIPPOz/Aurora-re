package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzank implements zzamz {
    private final String zza;
    private final int zzb;
    private final zzen zzd;
    private final zzem zze;
    private zzafb zzf;
    private String zzg;
    private zzz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;
    private final String zzc = "video/mp2t";
    private long zzm = -9223372036854775807L;

    public zzank(String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzen zzenVar = new zzen(1024);
        this.zzd = zzenVar;
        byte[] zzN = zzenVar.zzN();
        this.zze = new zzem(zzN, zzN.length);
    }

    private final int zzf(zzem zzemVar) throws zzaz {
        int zza = zzemVar.zza();
        zzacp zzb = zzacr.zzb(zzemVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zza - zzemVar.zza();
    }

    private static long zzg(zzem zzemVar) {
        return zzemVar.zzd((zzemVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x015a, code lost:
        if (r14.zzn == false) goto L85;
     */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r15) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzank.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzady zzadyVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzf = zzadyVar.zzw(zzaonVar.zza(), 1);
        this.zzg = zzaonVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }
}
