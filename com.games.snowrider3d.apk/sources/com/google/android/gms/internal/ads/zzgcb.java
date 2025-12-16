package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgcb<V> extends zzgcc<V> {

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgcc.zzg) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zza(false, null);
            zza = new zza(true, null);
        }

        zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public final class zzb<V> implements Runnable {
        final zzgcb<V> zza;
        final ListenableFuture<? extends V> zzb;

        zzb(zzgcb zzgcbVar, ListenableFuture listenableFuture) {
            this.zza = zzgcbVar;
            this.zzb = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (!zzgcc.zzv(this.zza, this, zzgcb.zze(this.zzb))) {
                return;
            }
            zzgcb.zzx(this.zza, false);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgcb.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        static final zzc zzb = new zzc(new Throwable("Failure.exception is unexpectedly null.") { // from class: com.google.android.gms.internal.ads.zzgcb.zzc.2
            {
                super("Failure.exception is unexpectedly null.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzc;

        zzc(Throwable th) {
            th.getClass();
            this.zzc = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public interface zze<V> extends ListenableFuture<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public abstract class zzf<V> extends zzgcb<V> implements zze<V> {
    }

    public static Object zze(ListenableFuture listenableFuture) {
        Throwable zzi;
        if (listenableFuture instanceof zze) {
            Object obj = ((zzgcb) listenableFuture).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    if (th != null) {
                        obj = new zza(false, th);
                    } else {
                        obj = zza.zzb;
                    }
                }
            }
            return Objects.requireNonNull(obj);
        } else if (!(listenableFuture instanceof zzger) || (zzi = ((zzger) listenableFuture).zzi()) == null) {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!zzg) & isCancelled) {
                return Objects.requireNonNull(zza.zzb);
            }
            try {
                Object zzf2 = zzf(listenableFuture);
                if (!isCancelled) {
                    return zzf2 == null ? zze : zzf2;
                }
                String valueOf = String.valueOf(listenableFuture);
                return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (Error | Exception e) {
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e2));
                }
                return new zza(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e3));
                }
                return new zzc(e3.getCause());
            }
        } else {
            return new zzc(zzi);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object zzh(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            Throwable th2 = ((zzc) obj).zzc;
            if (th2 != null) {
                throw new ExecutionException(th2);
            }
            zzf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
            throw new ExecutionException(zzc.zzb.zzc);
        } else if (obj != zze) {
            return obj;
        } else {
            return null;
        }
    }

    public static boolean zzm(Object obj) {
        return !(obj instanceof zzb);
    }

    private final void zzw(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public static void zzx(zzgcb zzgcbVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            zzgcbVar.zzt();
            if (z) {
                zzgcbVar.zzk();
            }
            zzgcbVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zzp = zzgcbVar.zzp(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzp != null) {
                zzd zzdVar4 = zzp.next;
                zzp.next = zzdVar3;
                zzdVar3 = zzp;
                zzp = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Runnable runnable2 = (Runnable) Objects.requireNonNull(runnable);
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgcbVar = zzbVar.zza;
                    if (zzgcbVar.valueField == zzbVar && zzv(zzgcbVar, zzbVar, zze(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    zzy(runnable2, (Executor) Objects.requireNonNull(zzdVar3.zzc));
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzf.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfvp.zzc(runnable, "Runnable was null.");
        zzfvp.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listenersField) == zzd.zza) {
            zzy(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzu(zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listenersField;
        } while (zzdVar != zzd.zza);
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object obj;
        zza zzaVar;
        Object obj2 = this.valueField;
        if ((obj2 instanceof zzb) || (obj2 == null)) {
            if (zzg) {
                obj = new zza(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    zzaVar = zza.zza;
                } else {
                    zzaVar = zza.zzb;
                }
                obj = Objects.requireNonNull(zzaVar);
            }
            zzgcb<V> zzgcbVar = this;
            boolean z2 = false;
            while (true) {
                if (zzv(zzgcbVar, obj2, obj)) {
                    zzx(zzgcbVar, z);
                    if (!(obj2 instanceof zzb)) {
                        break;
                    }
                    ListenableFuture<? extends V> listenableFuture = ((zzb) obj2).zzb;
                    if (listenableFuture instanceof zze) {
                        zzgcbVar = (zzgcb) listenableFuture;
                        obj2 = zzgcbVar.valueField;
                        if (!(obj2 == null) && !(obj2 instanceof zzb)) {
                            return true;
                        }
                        z2 = true;
                    } else {
                        listenableFuture.cancel(z);
                        break;
                    }
                } else {
                    obj2 = zzgcbVar.valueField;
                    if (zzm(obj2)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return zzq();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzm(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (!isDone()) {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((zzb) obj).zzb;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    zzgeg.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    str = zzfwg.zza(zza());
                } catch (Throwable th2) {
                    zzgeg.zzb(th2);
                    str = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzw(sb);
            }
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public String zza() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    protected void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zze;
        }
        if (zzv(this, null, obj)) {
            zzx(this, false);
            return true;
        }
        return false;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (zzv(this, null, new zzc(th))) {
            zzx(this, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzger
    public final Throwable zzi() {
        if (this instanceof zze) {
            Object obj = this.valueField;
            if (!(obj instanceof zzc)) {
                return null;
            }
            return ((zzc) obj).zzc;
        }
        return null;
    }

    protected void zzk() {
    }

    public final void zzl(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzo());
        }
    }

    public final boolean zzo() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzr(j, timeUnit);
    }

    public final boolean zzn(ListenableFuture listenableFuture) {
        zzc zzcVar;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!zzv(this, null, zze(listenableFuture))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, listenableFuture);
            if (zzv(this, null, zzbVar)) {
                try {
                    listenableFuture.addListener(zzbVar, zzgdb.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzv(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).zzc);
        }
        return false;
    }
}
