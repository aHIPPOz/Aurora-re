package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgel extends zzgdd {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    public static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgel zzgelVar = new zzgel(listenableFuture);
        zzgei zzgeiVar = new zzgei(zzgelVar);
        zzgelVar.zzb = scheduledExecutorService.schedule(zzgeiVar, j, timeUnit);
        listenableFuture.addListener(zzgeiVar, zzgdb.INSTANCE);
        return zzgelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture != null) {
            String str = "inputFuture=[" + listenableFuture.toString() + "]";
            if (scheduledFuture == null) {
                return str;
            }
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay <= 0) {
                return str;
            }
            return str + ", remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    protected final void zzb() {
        zzl(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    private zzgel(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }
}
