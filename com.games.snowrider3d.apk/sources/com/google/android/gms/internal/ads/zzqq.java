package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzqq {
    private final zzqp zza;
    private final int zzb;
    private final zzqr zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqq(AudioTrack audioTrack, zzqr zzqrVar) {
        this.zza = new zzqp(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqrVar;
        zzh(0);
    }

    private final long zzf(long j, float f) {
        zzqp zzqpVar = this.zza;
        return zzg(zzqpVar.zza(), zzqpVar.zzb(), j, f);
    }

    private final long zzg(long j, long j2, long j3, float f) {
        return zzex.zzt(j, this.zzb) + zzex.zzq(j3 - j2, f);
    }

    private final void zzh(int i) {
        this.zzd = i;
        long j = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.zzf = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        } else {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    public final long zza(long j, float f) {
        return zzf(j, f);
    }

    public final void zzb(long j, float f, long j2) {
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzqp zzqpVar = this.zza;
        boolean zzc = zzqpVar.zzc();
        if (zzc) {
            long zzb = zzqpVar.zzb();
            long zzf = zzf(j, f);
            if (Math.abs(zzb - j) > 5000000) {
                this.zzc.zzd(zzqpVar.zza(), zzb, j, j2);
                zzh(4);
            } else if (Math.abs(zzf - j2) > 5000000) {
                this.zzc.zzc(zzqpVar.zza(), zzb, j, j2);
                zzh(4);
            } else if (this.zzd == 4) {
                zzh(0);
            }
        }
        int i = this.zzd;
        if (i == 0) {
            if (!zzc) {
                if (j - this.zze <= 500000) {
                    return;
                }
                zzh(3);
            } else if (zzqpVar.zzb() < this.zze) {
            } else {
                this.zzh = zzqpVar.zza();
                this.zzi = zzqpVar.zzb();
                zzh(1);
            }
        } else if (i != 1) {
            if (i == 2) {
                if (zzc) {
                    return;
                }
                zzh(0);
            } else if (i != 3 || !zzc) {
            } else {
                zzh(0);
            }
        } else if (zzc) {
            long zza = zzqpVar.zza();
            long j3 = this.zzh;
            if (zza > j3) {
                if (Math.abs(zzf(j, f) - zzg(j3, this.zzi, j, f)) < 1000) {
                    zzh(2);
                    return;
                }
            }
            if (j - this.zze > 2000000) {
                zzh(3);
                return;
            }
            this.zzh = zzqpVar.zza();
            this.zzi = zzqpVar.zzb();
        } else {
            zzh(0);
        }
    }

    public final void zzc() {
        zzh(0);
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }
}
