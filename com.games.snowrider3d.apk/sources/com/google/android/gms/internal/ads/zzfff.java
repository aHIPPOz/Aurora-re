package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfff {
    private final zzfej zza;
    private final zzffd zzb;
    private final zzfef zzc;
    private zzffl zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfff(zzfej zzfejVar, zzfef zzfefVar, zzffd zzffdVar) {
        this.zza = zzfejVar;
        this.zzc = zzfefVar;
        this.zzb = zzffdVar;
        zzfefVar.zzb(new zzffa(this));
    }

    public static /* synthetic */ void zzc(zzfff zzfffVar) {
        synchronized (zzfffVar) {
            zzfffVar.zzf = 1;
            zzfffVar.zzh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        r3 = new com.google.android.gms.internal.ads.zzffl(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zzd(new com.google.android.gms.internal.ads.zzffb(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzh() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzgy     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzbzm r0 = r0.zzg()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.zzh()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L26
            goto L2d
        L26:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L6c
            r0.clear()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r4)
            return
        L2d:
            boolean r0 = r4.zzi()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6a
        L33:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L6c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L6a
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzffe r0 = (com.google.android.gms.internal.ads.zzffe) r0     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L55
            com.google.android.gms.internal.ads.zzfet r1 = r0.zza()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzfej r1 = r4.zza     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzfet r2 = r0.zza()     // Catch: java.lang.Throwable -> L6c
            boolean r1 = r1.zze(r2)     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L33
        L55:
            com.google.android.gms.internal.ads.zzfej r1 = r4.zza     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzffd r2 = r4.zzb     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzffl r3 = new com.google.android.gms.internal.ads.zzffl     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L6c
            r4.zze = r3     // Catch: java.lang.Throwable -> L6c
            com.google.android.gms.internal.ads.zzffb r1 = new com.google.android.gms.internal.ads.zzffb     // Catch: java.lang.Throwable -> L6c
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6c
            r3.zzd(r1)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r4)
            return
        L6a:
            monitor-exit(r4)
            return
        L6c:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfff.zzh():void");
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized ListenableFuture zza(zzffe zzffeVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzc(zzffeVar);
    }

    public final synchronized void zzf(zzffe zzffeVar) {
        this.zzd.add(zzffeVar);
    }
}
