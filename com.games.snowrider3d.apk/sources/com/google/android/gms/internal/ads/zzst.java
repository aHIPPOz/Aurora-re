package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzst implements zztg {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf = new AtomicReference();
    private final zzdm zzg;
    private boolean zzh;

    public zzst(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzst r10, android.os.Message r11) {
        /*
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L5b
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r0)
            goto L77
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L77
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r11)
            goto L77
        L32:
            com.google.android.gms.internal.ads.zzdm r10 = r10.zzg
            r10.zzf()
            goto L77
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzss r11 = (com.google.android.gms.internal.ads.zzss) r11
            int r4 = r11.zza
            int r0 = r11.zzb
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzst.zzb     // Catch: java.lang.RuntimeException -> L54
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L54
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L51
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            goto L76
        L51:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.RuntimeException -> L54
        L54:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r0)
            goto L76
        L5b:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzss r11 = (com.google.android.gms.internal.ads.zzss) r11
            int r4 = r11.zza
            int r0 = r11.zzb
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L70
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L70
            goto L76
        L70:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzsq.zza(r10, r2, r0)
        L76:
            r2 = r11
        L77:
            if (r2 == 0) goto L85
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.zzst.zza
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L81
            throw r11
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zza(com.google.android.gms.internal.ads.zzst, android.os.Message):void");
    }

    private static zzss zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (!arrayDeque.isEmpty()) {
                return (zzss) arrayDeque.removeFirst();
            }
            return new zzss();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler != null) {
                    Handler handler2 = handler;
                    handler.removeCallbacksAndMessages(null);
                    zzdm zzdmVar = this.zzg;
                    zzdmVar.zzd();
                    Handler handler3 = this.zze;
                    if (handler3 != null) {
                        Handler handler4 = handler3;
                        handler3.obtainMessage(3).sendToTarget();
                        zzdmVar.zza();
                        return;
                    }
                    throw null;
                }
                throw null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzss zzi = zzi();
        zzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        String str = zzex.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zze(int i, int i2, zzhp zzhpVar, long j, int i3) {
        zzc();
        zzss zzi = zzi();
        zzi.zza(i, 0, 0, j, i3);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzhpVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhpVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhpVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzhpVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzhpVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzhpVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhpVar.zzg, zzhpVar.zzh));
        Handler handler = this.zze;
        String str = zzex.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        String str = zzex.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final void zzh() {
        if (!this.zzh) {
            HandlerThread handlerThread = this.zzd;
            handlerThread.start();
            this.zze = new zzsr(this, handlerThread.getLooper());
            this.zzh = true;
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
