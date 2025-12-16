package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzaou implements zzaot {
    private final zzady zza;
    private final zzafb zzb;
    private final zzaow zzc;
    private final zzz zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaou(zzady zzadyVar, zzafb zzafbVar, zzaow zzaowVar, String str, int i) throws zzaz {
        this.zza = zzadyVar;
        this.zzb = zzafbVar;
        this.zzc = zzaowVar;
        int i2 = zzaowVar.zzb * zzaowVar.zze;
        int i3 = zzaowVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzaz.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzaowVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzx zzxVar = new zzx();
        zzxVar.zzG("audio/wav");
        zzxVar.zzah(str);
        zzxVar.zzC(i6);
        zzxVar.zzac(i6);
        zzxVar.zzX(max);
        zzxVar.zzD(zzaowVar.zzb);
        zzxVar.zzai(zzaowVar.zzc);
        zzxVar.zzab(i);
        this.zzd = zzxVar.zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zza(int i, long j) {
        zzaoz zzaozVar = new zzaoz(this.zzc, 1, i, j);
        this.zza.zzP(zzaozVar);
        zzafb zzafbVar = this.zzb;
        zzafbVar.zzm(this.zzd);
        zzafbVar.zzl(zzaozVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final boolean zzc(zzadw zzadwVar, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                break;
            }
            int zzf = this.zzb.zzf(zzadwVar, (int) Math.min(i3 - i2, j2), true);
            if (zzf == -1) {
                j2 = 0;
            } else {
                this.zzg += zzf;
                j2 -= zzf;
            }
        }
        zzaow zzaowVar = this.zzc;
        int i4 = this.zzg;
        int i5 = zzaowVar.zzd;
        int i6 = i4 / i5;
        if (i6 > 0) {
            int i7 = i6 * i5;
            int i8 = this.zzg - i7;
            this.zzb.zzt(this.zzf + zzex.zzu(this.zzh, 1000000L, zzaowVar.zzc, RoundingMode.DOWN), 1, i7, i8, null);
            this.zzh += i6;
            this.zzg = i8;
        }
        return i <= 0;
    }
}
