package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzqs {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private zzdj zzG;
    boolean zza;
    private final zzqr zzb;
    private final long[] zzc;
    private AudioTrack zzd;
    private int zze;
    private zzqq zzf;
    private int zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private Method zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzqs(zzqr zzqrVar) {
        this.zzb = zzqrVar;
        try {
            Class[] clsArr = null;
            this.zzo = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzD = -9223372036854775807L;
        this.zzC = -9223372036854775807L;
        this.zzG = zzdj.zza;
    }

    private final long zzl() {
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, zzo());
        }
        long zzb = this.zzG.zzb();
        if (zzb - this.zzt >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzu <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.zzz == -9223372036854775807L) {
                            this.zzz = zzb;
                        }
                    }
                    this.zzz = -9223372036854775807L;
                }
                if (this.zzu > playbackHeadPosition) {
                    this.zzv++;
                }
                this.zzu = playbackHeadPosition;
            }
            this.zzt = zzb;
        }
        return this.zzu + this.zzF + (this.zzv << 32);
    }

    private final long zzm(long j) {
        long j2;
        if (this.zzx != 0) {
            j2 = zzex.zzq(j + this.zzm, this.zzi);
        } else if (this.zzy != -9223372036854775807L) {
            j2 = zzex.zzt(zzo(), this.zzg);
        } else {
            j2 = zzn();
        }
        long max = Math.max(0L, j2 - this.zzp);
        return this.zzy != -9223372036854775807L ? Math.min(zzex.zzt(this.zzB, this.zzg), max) : max;
    }

    private final long zzn() {
        return zzex.zzt(zzl(), this.zzg);
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzA;
        }
        return this.zzA + zzex.zzp(zzex.zzq(zzex.zzs(this.zzG.zzb()) - this.zzy, this.zzi), this.zzg);
    }

    private final void zzp() {
        this.zzm = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzn = 0L;
        this.zzC = -9223372036854775807L;
        this.zzD = -9223372036854775807L;
        this.zzj = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqs.zza():long");
    }

    public final void zzb(long j) {
        this.zzA = zzl();
        this.zzy = zzex.zzs(this.zzG.zzb());
        this.zzB = j;
    }

    public final void zzc() {
        zzp();
        this.zzd = null;
        this.zzf = null;
    }

    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        this.zzd = audioTrack;
        this.zze = i3;
        this.zzf = new zzqq(audioTrack, this.zzb);
        this.zzg = audioTrack.getSampleRate();
        boolean zzK = zzex.zzK(i);
        this.zzr = zzK;
        this.zzh = zzK ? zzex.zzt(i3 / i2, this.zzg) : -9223372036854775807L;
        this.zzu = 0L;
        this.zzv = 0L;
        this.zzE = false;
        this.zzF = 0L;
        this.zzq = false;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzs = 0L;
        this.zzp = 0L;
        this.zzi = 1.0f;
        this.zzl = 0;
        this.zzk = -9223372036854775807L;
        this.zza = z2;
    }

    public final void zze(zzdj zzdjVar) {
        this.zzG = zzdjVar;
    }

    public final void zzf() {
        if (this.zzy != -9223372036854775807L) {
            this.zzy = zzex.zzs(this.zzG.zzb());
        }
        this.zzk = zzn();
        zzqq zzqqVar = this.zzf;
        zzqqVar.getClass();
        zzqqVar.zzc();
    }

    public final boolean zzg(long j) {
        return j > zzex.zzp(zza(), this.zzg);
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzz != -9223372036854775807L && j > 0 && this.zzG.zzb() - this.zzz >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        audioTrack.getPlayState();
        AudioTrack audioTrack2 = this.zzd;
        audioTrack2.getClass();
        int underrunCount = audioTrack2.getUnderrunCount();
        boolean z = underrunCount > this.zzl;
        this.zzl = underrunCount;
        if (z) {
            this.zzb.zze(this.zze, zzex.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzp();
        if (this.zzy == -9223372036854775807L) {
            zzqq zzqqVar = this.zzf;
            zzqqVar.getClass();
            zzqqVar.zzc();
            return true;
        }
        this.zzA = zzl();
        return false;
    }
}
