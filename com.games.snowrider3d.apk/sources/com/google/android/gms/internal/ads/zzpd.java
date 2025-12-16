package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzpd implements zzmr, zzpe {
    private boolean zzA;
    private final Context zza;
    private final zzpf zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzba zzo;
    private zzpc zzp;
    private zzpc zzq;
    private zzpc zzr;
    private zzz zzs;
    private zzz zzt;
    private zzz zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzde.zza();
    private final zzbk zzf = new zzbk();
    private final zzbj zzg = new zzbj();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpd(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzow zzowVar = new zzow(zzow.zza);
        this.zzc = zzowVar;
        zzowVar.zzh(this);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzA(zzbl zzblVar, zzvh zzvhVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzvhVar == null || (zza = zzblVar.zza(zzvhVar.zza)) == -1) {
            return;
        }
        zzbj zzbjVar = this.zzg;
        int i = 0;
        zzblVar.zzd(zza, zzbjVar, false);
        zzbk zzbkVar = this.zzf;
        zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L);
        zzak zzakVar = zzbkVar.zzd.zzb;
        int i2 = 2;
        if (zzakVar != null) {
            int zzo = zzex.zzo(zzakVar.zza);
            i = zzo != 0 ? zzo != 1 ? zzo != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        long j = zzbkVar.zzm;
        if (j != -9223372036854775807L && !zzbkVar.zzk && !zzbkVar.zzi && !zzbkVar.zzb()) {
            builder.setMediaDurationMillis(zzex.zzv(j));
        }
        if (true != zzbkVar.zzb()) {
            i2 = 1;
        }
        builder.setPlaybackType(i2);
        this.zzA = true;
    }

    private final void zzB(long j, zzz zzzVar, int i) {
        if (Objects.equals(this.zzs, zzzVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzzVar;
        zzC(1, j, zzzVar, i2);
    }

    private final void zzC(int i, long j, zzz zzzVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzzVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzzVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzzVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzzVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzzVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzzVar.zzv;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzzVar.zzw;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzzVar.zzG;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzzVar.zzH;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzzVar.zzd;
            if (str4 != null) {
                String str5 = zzex.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzzVar.zzz;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzox
            @Override // java.lang.Runnable
            public final void run() {
                zzpd.this.zzd.reportTrackChangeEvent(build);
            }
        });
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzD(zzpc zzpcVar) {
        if (zzpcVar != null) {
            return zzpcVar.zzc.equals(this.zzc.zze());
        }
        return false;
    }

    public static zzpd zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzpd(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzw(int i) {
        switch (zzex.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzx() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzk.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics build = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    zzpd.this.zzd.reportPlaybackMetrics(build);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private final void zzy(long j, zzz zzzVar, int i) {
        if (Objects.equals(this.zzt, zzzVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzzVar;
        zzC(0, j, zzzVar, i2);
    }

    private final void zzz(long j, zzz zzzVar, int i) {
        if (Objects.equals(this.zzu, zzzVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzzVar;
        zzC(2, j, zzzVar, i2);
    }

    public final LogSessionId zza() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zze(zzmp zzmpVar, zzz zzzVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzf(zzmp zzmpVar, int i, long j, long j2) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar != null) {
            String zzf = this.zzc.zzf(zzmpVar.zzb, zzvhVar);
            HashMap hashMap = this.zzi;
            Long l = (Long) hashMap.get(zzf);
            HashMap hashMap2 = this.zzh;
            Long l2 = (Long) hashMap2.get(zzf);
            long j3 = 0;
            hashMap.put(zzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            if (l2 != null) {
                j3 = l2.longValue();
            }
            hashMap2.put(zzf, Long.valueOf(j3 + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzg(zzmp zzmpVar, zzvd zzvdVar) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar == null) {
            return;
        }
        zzz zzzVar = zzvdVar.zzb;
        zzzVar.getClass();
        zzpc zzpcVar = new zzpc(zzzVar, 0, this.zzc.zzf(zzmpVar.zzb, zzvhVar));
        int i = zzvdVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzpcVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzpcVar;
                return;
            }
        }
        this.zzp = zzpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzh(zzmp zzmpVar, int i, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ee, code lost:
        if (r12 != 1) goto L130;
     */
    @Override // com.google.android.gms.internal.ads.zzmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.ads.zzbh r21, com.google.android.gms.internal.ads.zzmq r22) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpd.zzi(com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzmq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzj(zzmp zzmpVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzk(zzmp zzmpVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzl(zzmp zzmpVar, zzba zzbaVar) {
        this.zzo = zzbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzm(zzmp zzmpVar, zzbf zzbfVar, zzbf zzbfVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzn(zzmp zzmpVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzo(zzmp zzmpVar, zzid zzidVar) {
        this.zzx += zzidVar.zzg;
        this.zzy += zzidVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzp(zzmp zzmpVar, zzz zzzVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzq(zzmp zzmpVar, zzcd zzcdVar) {
        zzpc zzpcVar = this.zzp;
        if (zzpcVar != null) {
            zzz zzzVar = zzpcVar.zza;
            if (zzzVar.zzw != -1) {
                return;
            }
            zzx zzb = zzzVar.zzb();
            zzb.zzam(zzcdVar.zzb);
            zzb.zzQ(zzcdVar.zzc);
            this.zzp = new zzpc(zzb.zzan(), 0, zzpcVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzu(zzmp zzmpVar, String str) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            zzx();
            this.zzj = str;
            this.zzk = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0-alpha01");
            zzA(zzmpVar.zzb, zzvhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzv(zzmp zzmpVar, String str, boolean z) {
        zzvh zzvhVar = zzmpVar.zzd;
        if ((zzvhVar == null || !zzvhVar.zzb()) && str.equals(this.zzj)) {
            zzx();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }
}
