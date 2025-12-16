package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgck extends zzgdd implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        boolean z = true;
        boolean isCancelled = isCancelled() | (listenableFuture == null);
        if (obj != null) {
            z = false;
        }
        if (isCancelled || z) {
            return;
        }
        this.zza = null;
        if (!listenableFuture.isCancelled()) {
            try {
                try {
                    Object zze = zze(obj, zzgdn.zzp(listenableFuture));
                    this.zzb = null;
                    zzf(zze);
                    return;
                } catch (Throwable th) {
                    try {
                        zzgeg.zza(th);
                        zzd(th);
                        return;
                    } finally {
                        this.zzb = null;
                    }
                }
            } catch (Error e) {
                zzd(e);
                return;
            } catch (CancellationException unused) {
                cancel(false);
                return;
            } catch (ExecutionException e2) {
                zzd(e2.getCause());
                return;
            } catch (Exception e3) {
                zzd(e3);
                return;
            }
        }
        zzn(listenableFuture);
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final String zza() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (obj == null) {
            if (zza == null) {
                return null;
            }
            return str.concat(zza);
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    protected final void zzb() {
        zzl(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2) throws Exception;

    abstract void zzf(Object obj);

    public zzgck(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }
}
