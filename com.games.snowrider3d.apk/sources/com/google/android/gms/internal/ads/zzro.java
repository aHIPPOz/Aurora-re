package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzro implements zzqo {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzrf zzA;
    private zzbb zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzf zzU;
    private zzpp zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private Looper zzZ;
    private long zzaa;
    private long zzab;
    private Handler zzac;
    private Context zzad;
    private boolean zzae;
    private final zzre zzaf;
    private final zzqu zzag;
    private final Context zzd;
    private final zzqt zze;
    private final zzry zzf;
    private final zzcr zzg;
    private final zzrx zzh;
    private final zzfyq zzi;
    private final zzqs zzj;
    private final ArrayDeque zzk;
    private zzrm zzl;
    private final zzri zzm;
    private final zzri zzn;
    private final int zzo;
    private zzph zzp;
    private zzql zzq;
    private zzrd zzr;
    private zzrd zzs;
    private zzck zzt;
    private AudioTrack zzu;
    private zzpj zzv;
    private zzpo zzw;
    private zzrh zzx;
    private zze zzy;
    private zzrf zzz;

    public static /* synthetic */ void zzH(zzro zzroVar) {
        if (zzroVar.zzab >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzrs) zzroVar.zzq).zza.zzn = true;
            zzroVar.zzab = 0L;
        }
    }

    public static /* synthetic */ void zzJ(AudioTrack audioTrack, final zzql zzqlVar, Handler handler, final zzqi zzqiVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqlVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqg zzqgVar;
                        zzqgVar = ((zzrs) zzql.this).zza.zzc;
                        zzqgVar.zzr(zzqiVar);
                    }
                });
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzqlVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqg zzqgVar;
                        zzqgVar = ((zzrs) zzql.this).zza.zzc;
                        zzqgVar.zzr(zzqiVar);
                    }
                });
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzM() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    public final long zzN() {
        zzrd zzrdVar = this.zzs;
        return zzrdVar.zzc == 0 ? this.zzD / zzrdVar.zzb : this.zzE;
    }

    public final long zzO() {
        zzrd zzrdVar = this.zzs;
        if (zzrdVar.zzc == 0) {
            long j = this.zzF;
            long j2 = zzrdVar.zzd;
            String str = zzex.zza;
            return ((j + j2) - 1) / j2;
        }
        return this.zzG;
    }

    private final AudioTrack zzP(zzrd zzrdVar) throws zzqk {
        Context context;
        try {
            int i = this.zzT;
            int i2 = this.zzo;
            Context context2 = null;
            if (i2 != -1 && (context = this.zzd) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.zzad == null) {
                    this.zzad = context.createDeviceContext(i2);
                }
                context2 = this.zzad;
                i = 0;
            }
            return zzae(zzrdVar.zza(), this.zzy, i, zzrdVar.zza, context2);
        } catch (zzqk e) {
            zzql zzqlVar = this.zzq;
            if (zzqlVar != null) {
                zzqlVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzQ(long j) {
        zzbb zzbbVar;
        boolean z;
        zzqg zzqgVar;
        if (zzad()) {
            zzre zzreVar = this.zzaf;
            zzbbVar = this.zzB;
            zzreVar.zzc(zzbbVar);
        } else {
            zzbbVar = zzbb.zza;
        }
        zzbb zzbbVar2 = zzbbVar;
        this.zzB = zzbbVar2;
        if (zzad()) {
            zzre zzreVar2 = this.zzaf;
            z = this.zzC;
            zzreVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzrf(zzbbVar2, Math.max(0L, j), zzex.zzt(zzO(), this.zzs.zze), null));
        zzZ();
        zzql zzqlVar = this.zzq;
        if (zzqlVar != null) {
            boolean z2 = this.zzC;
            zzqgVar = ((zzrs) zzqlVar).zza.zzc;
            zzqgVar.zzy(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzR(long r8) throws com.google.android.gms.internal.ads.zzqn {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzO
            if (r8 != 0) goto L6
            goto Lb6
        L6:
            com.google.android.gms.internal.ads.zzri r8 = r7.zzn
            boolean r9 = r8.zzc()
            if (r9 != 0) goto Lb6
            java.nio.ByteBuffer r9 = r7.zzO
            int r9 = r9.remaining()
            android.media.AudioTrack r0 = r7.zzu
            java.nio.ByteBuffer r1 = r7.zzO
            r2 = 1
            int r0 = r0.write(r1, r9, r2)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.zzW = r3
            r3 = 0
            r1 = 0
            if (r0 >= 0) goto L6d
            r9 = -6
            if (r0 == r9) goto L32
            r9 = -32
            if (r0 != r9) goto L30
            goto L32
        L30:
            r2 = r1
            goto L46
        L32:
            long r5 = r7.zzO()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3b
            goto L46
        L3b:
            android.media.AudioTrack r9 = r7.zzu
            boolean r9 = zzac(r9)
            if (r9 == 0) goto L30
            r7.zzS()
        L46:
            com.google.android.gms.internal.ads.zzqn r9 = new com.google.android.gms.internal.ads.zzqn
            com.google.android.gms.internal.ads.zzrd r1 = r7.zzs
            com.google.android.gms.internal.ads.zzz r1 = r1.zza
            r9.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzql r0 = r7.zzq
            if (r0 == 0) goto L56
            r0.zza(r9)
        L56:
            boolean r0 = r9.zzb
            if (r0 == 0) goto L69
            android.content.Context r0 = r7.zzd
            if (r0 != 0) goto L5f
            goto L69
        L5f:
            com.google.android.gms.internal.ads.zzpj r8 = com.google.android.gms.internal.ads.zzpj.zza
            r7.zzv = r8
            com.google.android.gms.internal.ads.zzpo r0 = r7.zzw
            r0.zzg(r8)
            throw r9
        L69:
            r8.zzb(r9)
            return
        L6d:
            r8.zza()
            android.media.AudioTrack r8 = r7.zzu
            boolean r8 = zzac(r8)
            if (r8 == 0) goto L8c
            long r5 = r7.zzG
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L80
            r7.zzY = r1
        L80:
            boolean r8 = r7.zzS
            if (r8 == 0) goto L8c
            com.google.android.gms.internal.ads.zzql r8 = r7.zzq
            if (r8 == 0) goto L8c
            if (r0 >= r9) goto L8c
            com.google.android.gms.internal.ads.zzrs r8 = (com.google.android.gms.internal.ads.zzrs) r8
        L8c:
            com.google.android.gms.internal.ads.zzrd r8 = r7.zzs
            int r8 = r8.zzc
            if (r8 != 0) goto L98
            long r3 = r7.zzF
            long r5 = (long) r0
            long r3 = r3 + r5
            r7.zzF = r3
        L98:
            if (r0 != r9) goto Lb6
            if (r8 == 0) goto Lb3
            java.nio.ByteBuffer r8 = r7.zzO
            java.nio.ByteBuffer r9 = r7.zzM
            if (r8 != r9) goto La3
            goto La4
        La3:
            r2 = r1
        La4:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            long r8 = r7.zzG
            int r0 = r7.zzH
            long r0 = (long) r0
            int r2 = r7.zzN
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.zzG = r8
        Lb3:
            r8 = 0
            r7.zzO = r8
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzR(long):void");
    }

    private final void zzS() {
        if (this.zzs.zzc == 1) {
            this.zzX = true;
        }
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzT() {
        Context context;
        if (this.zzw == null && (context = this.zzd) != null) {
            this.zzZ = Looper.myLooper();
            zzpo zzpoVar = new zzpo(context, new zzqy(this), this.zzy, this.zzV);
            this.zzw = zzpoVar;
            this.zzv = zzpoVar.zzc();
        }
        this.zzv.getClass();
    }

    private final void zzU() {
        if (!this.zzQ) {
            this.zzQ = true;
            this.zzj.zzb(zzO());
            if (zzac(this.zzu)) {
                this.zzR = false;
            }
            this.zzu.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0 = r2.zzM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r0.hasRemaining() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        r2.zzt.zze(r2.zzM);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzV(long r3) throws com.google.android.gms.internal.ads.zzqn {
        /*
            r2 = this;
            r2.zzR(r3)
            java.nio.ByteBuffer r0 = r2.zzO
            if (r0 == 0) goto L8
            goto L4b
        L8:
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L41
        L10:
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L4b
        L18:
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L2f
            r2.zzX(r0)
            r2.zzR(r3)
            java.nio.ByteBuffer r0 = r2.zzO
            if (r0 == 0) goto L18
            goto L4b
        L2f:
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L4b
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzck r0 = r2.zzt
            java.nio.ByteBuffer r1 = r2.zzM
            r0.zze(r1)
            goto L10
        L41:
            java.nio.ByteBuffer r0 = r2.zzM
            if (r0 == 0) goto L4b
            r2.zzX(r0)
            r2.zzR(r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzV(long):void");
    }

    private final void zzW(zzbb zzbbVar) {
        zzrf zzrfVar = new zzrf(zzbbVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzab()) {
            this.zzz = zzrfVar;
        } else {
            this.zzA = zzrfVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzX(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzX(java.nio.ByteBuffer):void");
    }

    private final void zzY() {
        if (zzab()) {
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzZ() {
        zzck zzckVar = this.zzs.zzi;
        this.zzt = zzckVar;
        zzckVar.zzc();
    }

    private final boolean zzaa() throws zzqn {
        if (!this.zzt.zzh()) {
            zzR(Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzd();
        zzV(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzO;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean zzab() {
        return this.zzu != null;
    }

    private static boolean zzac(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzad() {
        zzrd zzrdVar = this.zzs;
        if (zzrdVar.zzc == 0) {
            int i = zzrdVar.zza.zzI;
            return true;
        }
        return false;
    }

    private static final AudioTrack zzae(zzqi zzqiVar, zze zzeVar, int i, zzz zzzVar, Context context) throws zzqk {
        Exception exc;
        zzz zzzVar2;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzeVar.zza().zza).setAudioFormat(zzex.zzx(zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza)).setTransferMode(1).setBufferSizeInBytes(zzqiVar.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    sessionId.setOffloadedPlayback(zzqiVar.zzd);
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    exc = e;
                    zzzVar2 = zzzVar;
                    throw new zzqk(0, zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza, zzqiVar.zze, zzzVar2, zzqiVar.zzd, exc);
                }
            }
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqk(state, zzqiVar.zzb, zzqiVar.zzc, zzqiVar.zza, zzqiVar.zze, zzzVar, zzqiVar.zzd, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            zzzVar2 = zzzVar;
            exc = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean zzA() {
        if (zzab()) {
            return this.zzP && !zzz();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean zzB(zzz zzzVar) {
        return zza(zzzVar) != 0;
    }

    public final void zzK(zzpj zzpjVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzZ;
        if (looper != myLooper) {
            String str = "null";
            String name = looper == null ? str : looper.getThread().getName();
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + str + ") is not the playback looper (" + name + ")");
        }
        zzpj zzpjVar2 = this.zzv;
        if (zzpjVar2 == null || zzpjVar.equals(zzpjVar2)) {
            return;
        }
        this.zzv = zzpjVar;
        zzql zzqlVar = this.zzq;
        if (zzqlVar == null) {
            return;
        }
        ((zzrs) zzqlVar).zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final int zza(zzz zzzVar) {
        zzT();
        if (!"audio/raw".equals(zzzVar.zzo)) {
            return this.zzv.zzb(zzzVar, this.zzy) != null ? 2 : 0;
        }
        int i = zzzVar.zzI;
        if (zzex.zzK(i)) {
            return i != 2 ? 1 : 2;
        }
        zzea.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final long zzb() {
        if (!zzab()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.zzu;
        zzrd zzrdVar = this.zzs;
        if (zzrdVar.zzc == 0) {
            return zzex.zzt(audioTrack.getBufferSizeInFrames(), zzrdVar.zze);
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int zza2 = zzadz.zza(zzrdVar.zzg);
        zzdd.zzf(zza2 != -2147483647);
        return zzex.zzu(bufferSizeInFrames, 1000000L, zza2, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final long zzc(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzab() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zza(), zzex.zzt(zzO(), this.zzs.zze));
        while (true) {
            arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || min < ((zzrf) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzA = (zzrf) arrayDeque.remove();
        }
        zzrf zzrfVar = this.zzA;
        long j2 = min - zzrfVar.zzc;
        long zzq = zzex.zzq(j2, zzrfVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zza2 = this.zzaf.zza(j2);
            zzrf zzrfVar2 = this.zzA;
            j = zzrfVar2.zzb + zza2;
            zzrfVar2.zzd = zza2 - zzq;
        } else {
            zzrf zzrfVar3 = this.zzA;
            j = zzrfVar3.zzb + zzq + zzrfVar3.zzd;
        }
        long zzb2 = this.zzaf.zzb();
        long zzt = j + zzex.zzt(zzb2, this.zzs.zze);
        long j3 = this.zzaa;
        if (zzb2 > j3) {
            long zzt2 = zzex.zzt(zzb2 - j3, this.zzs.zze);
            this.zzaa = zzb2;
            this.zzab += zzt2;
            if (this.zzac == null) {
                this.zzac = new Handler(Looper.myLooper());
            }
            this.zzac.removeCallbacksAndMessages(null);
            this.zzac.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                @Override // java.lang.Runnable
                public final void run() {
                    zzro.zzH(zzro.this);
                }
            }, 100L);
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzbb zzd() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzps zze(zzz zzzVar) {
        return this.zzX ? zzps.zza : this.zzag.zza(zzzVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzf(zzz zzzVar, int i, int[] iArr) throws zzqj {
        int i2;
        int i3;
        zzck zzckVar;
        int i4;
        int i5;
        int i6;
        int i7;
        zzT();
        if ("audio/raw".equals(zzzVar.zzo)) {
            int i8 = zzzVar.zzI;
            zzdd.zzd(zzex.zzK(i8));
            int i9 = zzzVar.zzG;
            i5 = zzex.zzk(i8) * i9;
            zzfyn zzfynVar = new zzfyn();
            zzfynVar.zzh(this.zzi);
            zzfynVar.zzf(this.zzg);
            zzfynVar.zzg(this.zzaf.zze());
            zzckVar = new zzck(zzfynVar.zzi());
            if (zzckVar.equals(this.zzt)) {
                zzckVar = this.zzt;
            }
            this.zzf.zzq(zzzVar.zzJ, zzzVar.zzK);
            this.zze.zzo(iArr);
            try {
                zzcl zza2 = zzckVar.zza(new zzcl(zzzVar.zzH, i9, i8));
                int i10 = zza2.zzd;
                i4 = zza2.zzb;
                int i11 = zza2.zzc;
                int zzi = zzex.zzi(i11);
                int zzk = zzex.zzk(i10) * i11;
                i2 = 0;
                i7 = zzi;
                i3 = i10;
                i6 = zzk;
            } catch (zzcm e) {
                throw new zzqj(e, zzzVar);
            }
        } else {
            zzckVar = new zzck(zzfyq.zzn());
            i4 = zzzVar.zzH;
            zzps zzpsVar = zzps.zza;
            Pair zzb2 = this.zzv.zzb(zzzVar, this.zzy);
            if (zzb2 == null) {
                throw new zzqj("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzzVar))), zzzVar);
            }
            int intValue = ((Integer) zzb2.first).intValue();
            i2 = 2;
            i5 = -1;
            i7 = ((Integer) zzb2.second).intValue();
            i3 = intValue;
            i6 = -1;
        }
        int i12 = i4;
        if (i3 == 0) {
            throw new zzqj("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzzVar), zzzVar);
        } else if (i7 == 0) {
            throw new zzqj("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzzVar), zzzVar);
        } else {
            int i13 = zzzVar.zzj;
            if ("audio/vnd.dts.hd;profile=lbr".equals(zzzVar.zzo) && i13 == -1) {
                i13 = 768000;
            }
            int i14 = i13;
            int minBufferSize = AudioTrack.getMinBufferSize(i12, i7, i3);
            zzdd.zzf(minBufferSize != -2);
            int i15 = i6 != -1 ? i6 : 1;
            int i16 = i3;
            int zzb3 = zzrq.zzb(minBufferSize, i16, i2, i15, i12, i14);
            int i17 = i15;
            this.zzX = false;
            zzrd zzrdVar = new zzrd(zzzVar, i5, i2, i6, i12, i7, i16, (((Math.max(minBufferSize, zzb3) + i17) - 1) / i17) * i17, zzckVar, false, false, false);
            if (zzab()) {
                this.zzr = zzrdVar;
            } else {
                this.zzs = zzrdVar;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzg() {
        if (zzab()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzY = false;
            this.zzH = 0;
            this.zzA = new zzrf(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzp();
            zzZ();
            zzqs zzqsVar = this.zzj;
            if (zzqsVar.zzh()) {
                this.zzu.pause();
            }
            if (zzac(this.zzu)) {
                zzrm zzrmVar = this.zzl;
                zzrmVar.getClass();
                zzrmVar.zzb(this.zzu);
            }
            final zzqi zza2 = this.zzs.zza();
            zzrd zzrdVar = this.zzr;
            if (zzrdVar != null) {
                this.zzs = zzrdVar;
                this.zzr = null;
            }
            zzqsVar.zzc();
            zzrh zzrhVar = this.zzx;
            if (zzrhVar != null) {
                zzrhVar.zzb();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzql zzqlVar = this.zzq;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    String str = zzex.zza;
                    zzb = Executors.newSingleThreadScheduledExecutor(new ThreadFactory("ExoPlayer:AudioTrackReleaseThread") { // from class: com.google.android.gms.internal.ads.zzew
                        public final /* synthetic */ String zza = "ExoPlayer:AudioTrackReleaseThread";

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            String str2 = zzex.zza;
                            return new Thread(runnable, this.zza);
                        }
                    });
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzro.zzJ(audioTrack, zzqlVar, handler, zza2);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzaa = 0L;
        this.zzab = 0L;
        Handler handler2 = this.zzac;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzh() {
        this.zzI = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzi() {
        this.zzS = false;
        if (zzab()) {
            if (!this.zzj.zzk() && !zzac(this.zzu)) {
                return;
            }
            this.zzu.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzj() {
        this.zzS = true;
        if (zzab()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzk() throws zzqn {
        if (this.zzP || !zzab() || !zzaa()) {
            return;
        }
        zzU();
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzl() {
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzm() {
        zzg();
        zzfyq zzfyqVar = this.zzi;
        int size = zzfyqVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcn) zzfyqVar.get(i)).zzf();
        }
        this.zzg.zzf();
        this.zzh.zzf();
        zzck zzckVar = this.zzt;
        if (zzckVar != null) {
            zzckVar.zzf();
        }
        this.zzS = false;
        this.zzX = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzn(zze zzeVar) {
        if (this.zzy.equals(zzeVar)) {
            return;
        }
        this.zzy = zzeVar;
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzh(zzeVar);
        }
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzo(int i) {
        zzqg zzqgVar;
        zztb zztbVar;
        zztb zztbVar2;
        if (this.zzT != i) {
            this.zzT = i;
            zzg();
            zzql zzqlVar = this.zzq;
            if (zzqlVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 35) {
                zzru zzruVar = ((zzrs) zzqlVar).zza;
                zztbVar = zzruVar.zze;
                if (zztbVar != null) {
                    zztbVar2 = zzruVar.zze;
                    zztbVar2.zzd(i);
                }
            }
            zzqgVar = ((zzrs) zzqlVar).zza.zzc;
            zzqgVar.zzo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzp(zzf zzfVar) {
        if (this.zzU.equals(zzfVar)) {
            return;
        }
        if (this.zzu != null) {
            int i = this.zzU.zza;
        }
        this.zzU = zzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzq(zzdj zzdjVar) {
        this.zzj.zze(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzr(zzql zzqlVar) {
        this.zzq = zzqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzs(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzac(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzt(zzbb zzbbVar) {
        float f = zzbbVar.zzb;
        String str = zzex.zza;
        this.zzB = new zzbb(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzbbVar.zzc, 8.0f)));
        zzW(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzu(zzph zzphVar) {
        this.zzp = zzphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzw(boolean z) {
        this.zzC = z;
        zzW(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzx(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzY();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026a  */
    @Override // com.google.android.gms.internal.ads.zzqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzy(java.nio.ByteBuffer r31, long r32, int r34) throws com.google.android.gms.internal.ads.zzqk, com.google.android.gms.internal.ads.zzqn {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzro.zzy(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean zzz() {
        if (zzab()) {
            return (Build.VERSION.SDK_INT < 29 || !this.zzu.isOffloadedPlayback() || !this.zzR) && this.zzj.zzg(zzO());
        }
        return false;
    }

    public /* synthetic */ zzro(zzrc zzrcVar, zzrn zzrnVar) {
        Context context;
        Context context2;
        zzre zzreVar;
        zzqu zzquVar;
        Context context3;
        Context context4;
        Context context5;
        context = zzrcVar.zza;
        if (context == null) {
            context2 = null;
        } else {
            context5 = zzrcVar.zza;
            context2 = context5.getApplicationContext();
        }
        this.zzd = context2;
        this.zzy = zze.zza;
        this.zzv = context2 != null ? null : zzrcVar.zzb;
        zzreVar = zzrcVar.zzf;
        this.zzaf = zzreVar;
        zzquVar = zzrcVar.zzg;
        zzquVar.getClass();
        this.zzag = zzquVar;
        this.zzj = new zzqs(new zzrj(this, null));
        zzqt zzqtVar = new zzqt();
        this.zze = zzqtVar;
        zzry zzryVar = new zzry();
        this.zzf = zzryVar;
        this.zzg = new zzcr();
        this.zzh = new zzrx();
        this.zzi = zzfyq.zzp(zzryVar, zzqtVar);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzU = new zzf(0, 0.0f);
        zzbb zzbbVar = zzbb.zza;
        this.zzA = new zzrf(zzbbVar, 0L, 0L, null);
        this.zzB = zzbbVar;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzri();
        this.zzn = new zzri();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34) {
            context3 = zzrcVar.zza;
            if (context3 != null) {
                context4 = zzrcVar.zza;
                int deviceId = context4.getDeviceId();
                if (deviceId != 0 && deviceId != -1) {
                    i = deviceId;
                }
            }
        }
        this.zzo = i;
        this.zzae = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        this.zzV = audioDeviceInfo == null ? null : new zzpp(audioDeviceInfo);
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzi(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzqz.zza(audioTrack, this.zzV);
        }
    }
}
