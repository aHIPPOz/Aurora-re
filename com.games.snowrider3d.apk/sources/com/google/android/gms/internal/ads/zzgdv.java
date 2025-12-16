package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgdv extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgdt(null);
    private static final Runnable zzb = new zzgdt(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgds zzgdsVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (runnable instanceof zzgds) {
                zzgdsVar = (zzgds) runnable;
            } else if (runnable != zzb) {
                break;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzgdsVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean zzg = zzg();
        if (!zzg) {
            try {
                obj = zza();
            } catch (Throwable th) {
                try {
                    zzgeg.zza(th);
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zzd(th);
                    return;
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zze(null);
                    throw th2;
                }
            }
        }
        if (!compareAndSet(currentThread, zza)) {
            zzc(currentThread);
        }
        if (zzg) {
            return;
        }
        zze(obj);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzgds) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    abstract Object zza() throws Exception;

    abstract String zzb();

    abstract void zzd(Throwable th);

    abstract void zze(Object obj);

    abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgds zzgdsVar = new zzgds(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (!compareAndSet(runnable, zzgdsVar)) {
                return;
            }
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(zza)) != zzb) {
                    return;
                }
                LockSupport.unpark(thread);
            } catch (Throwable th) {
                if (((Runnable) getAndSet(zza)) == zzb) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }
}
