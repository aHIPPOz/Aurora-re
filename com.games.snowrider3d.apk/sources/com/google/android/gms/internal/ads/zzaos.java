package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzaos implements zzaot {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzady zzc;
    private final zzafb zzd;
    private final zzaow zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzen zzh;
    private final int zzi;
    private final zzz zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaos(zzady zzadyVar, zzafb zzafbVar, zzaow zzaowVar) throws zzaz {
        this.zzc = zzadyVar;
        this.zzd = zzafbVar;
        this.zze = zzaowVar;
        int max = Math.max(1, zzaowVar.zzc / 10);
        this.zzi = max;
        zzen zzenVar = new zzen(zzaowVar.zzf);
        zzenVar.zzk();
        int zzk = zzenVar.zzk();
        this.zzf = zzk;
        int i = zzaowVar.zzb;
        int i2 = (((zzaowVar.zzd - (i * 4)) * 8) / (zzaowVar.zze * i)) + 1;
        if (zzk != i2) {
            throw zzaz.zza("Expected frames per block: " + i2 + "; got: " + zzk, null);
        }
        String str = zzex.zza;
        int i3 = ((max + zzk) - 1) / zzk;
        this.zzg = new byte[zzaowVar.zzd * i3];
        this.zzh = new zzen(i3 * (zzk + zzk) * i);
        int i4 = ((zzaowVar.zzc * zzaowVar.zzd) * 8) / zzk;
        zzx zzxVar = new zzx();
        zzxVar.zzah("audio/raw");
        zzxVar.zzC(i4);
        zzxVar.zzac(i4);
        zzxVar.zzX((max + max) * i);
        zzxVar.zzD(zzaowVar.zzb);
        zzxVar.zzai(zzaowVar.zzc);
        zzxVar.zzab(2);
        this.zzj = zzxVar.zzan();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        long j = this.zzl;
        long j2 = this.zzn;
        int zze = zze(i);
        this.zzd.zzt(j + zzex.zzu(j2, 1000000L, this.zze.zzc, roundingMode), 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zza(int i, long j) {
        zzaoz zzaozVar = new zzaoz(this.zze, this.zzf, i, j);
        this.zzc.zzP(zzaozVar);
        zzafb zzafbVar = this.zzd;
        zzafbVar.zzm(this.zzj);
        zzafbVar.zzl(zzaozVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadw r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaos.zzc(com.google.android.gms.internal.ads.zzadw, long):boolean");
    }
}
