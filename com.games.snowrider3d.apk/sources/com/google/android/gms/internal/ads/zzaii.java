package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzaii {
    public final zzaen zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaii(zzaen zzaenVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new zzaen(zzaenVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzaii zzb(zzaen zzaenVar, zzen zzenVar) {
        long[] jArr;
        int i;
        int i2;
        int zzg = zzenVar.zzg();
        int zzp = (zzg & 1) != 0 ? zzenVar.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzenVar.zzu() : -1L;
        if ((zzg & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = zzenVar.zzm();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((zzg & 8) != 0) {
            zzenVar.zzM(4);
        }
        if (zzenVar.zza() >= 24) {
            zzenVar.zzM(21);
            int zzo = zzenVar.zzo();
            i = zzo & 4095;
            i2 = zzo >> 12;
        } else {
            i2 = -1;
            i = -1;
        }
        return new zzaii(zzaenVar, zzp, zzu, jArr2, i2, i);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzaen zzaenVar = this.zza;
        return zzex.zzt((j * zzaenVar.zzg) - 1, zzaenVar.zzd);
    }
}
