package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgdk implements Runnable {
    final Future zza;
    final zzgdj zzb;

    public zzgdk(Future future, zzgdj zzgdjVar) {
        this.zza = future;
        this.zzb = zzgdjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if (!(future instanceof zzger) || (zza = zzges.zza((zzger) future)) == null) {
            try {
                this.zzb.zzb(zzgdn.zzp(future));
                return;
            } catch (ExecutionException e) {
                this.zzb.zza(e.getCause());
                return;
            } catch (Throwable th) {
                this.zzb.zza(th);
                return;
            }
        }
        this.zzb.zza(zza);
    }

    public final String toString() {
        zzfvj zza = zzfvl.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
