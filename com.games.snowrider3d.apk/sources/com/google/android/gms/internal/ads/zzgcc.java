package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzgcb;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgcc<V> extends zzger implements ListenableFuture<V> {
    private static final zza zzbi;
    static final Object zze = new Object();
    static final zzgdw zzf = new zzgdw(zzgcb.class);
    static final boolean zzg;
    volatile zzgcb.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public abstract class zza {
        /* synthetic */ zza(zzgcg zzgcgVar) {
        }

        abstract zzgcb.zzd zza(zzgcc zzgccVar, zzgcb.zzd zzdVar);

        abstract zze zzb(zzgcc zzgccVar, zze zzeVar);

        abstract void zzc(zze zzeVar, zze zzeVar2);

        abstract void zzd(zze zzeVar, Thread thread);

        abstract boolean zze(zzgcc zzgccVar, zzgcb.zzd zzdVar, zzgcb.zzd zzdVar2);

        abstract boolean zzf(zzgcc zzgccVar, Object obj, Object obj2);

        abstract boolean zzg(zzgcc zzgccVar, zze zzeVar, zze zzeVar2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgcc<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgcc.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgcc<?>, zzgcb.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgcc.class, zzgcb.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgcc<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgcc.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(zzgcg zzgcgVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final zzgcb.zzd zza(zzgcc zzgccVar, zzgcb.zzd zzdVar) {
            return zzd.getAndSet(zzgccVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final zze zzb(zzgcc zzgccVar, zze zzeVar) {
            return zzc.getAndSet(zzgccVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final void zzd(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zze(zzgcc zzgccVar, zzgcb.zzd zzdVar, zzgcb.zzd zzdVar2) {
            return zzgcd.zza(zzd, zzgccVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zzf(zzgcc zzgccVar, Object obj, Object obj2) {
            return zzgcd.zza(zze, zzgccVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zzg(zzgcc zzgccVar, zze zzeVar, zze zzeVar2) {
            return zzgcd.zza(zzc, zzgccVar, zzeVar, zzeVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(zzgcg zzgcgVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final zzgcb.zzd zza(zzgcc zzgccVar, zzgcb.zzd zzdVar) {
            zzgcb.zzd zzdVar2;
            synchronized (zzgccVar) {
                zzdVar2 = zzgccVar.listenersField;
                if (zzdVar2 != zzdVar) {
                    zzgccVar.listenersField = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final zze zzb(zzgcc zzgccVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgccVar) {
                zzeVar2 = zzgccVar.waitersField;
                if (zzeVar2 != zzeVar) {
                    zzgccVar.waitersField = zzeVar;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zze(zzgcc zzgccVar, zzgcb.zzd zzdVar, zzgcb.zzd zzdVar2) {
            synchronized (zzgccVar) {
                if (zzgccVar.listenersField == zzdVar) {
                    zzgccVar.listenersField = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zzf(zzgcc zzgccVar, Object obj, Object obj2) {
            synchronized (zzgccVar) {
                if (zzgccVar.valueField == obj) {
                    zzgccVar.valueField = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zzg(zzgcc zzgccVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgccVar) {
                if (zzgccVar.waitersField == zzeVar) {
                    zzgccVar.waitersField = zzeVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.ads.zzgcf
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        Field[] declaredFields;
                        int i = zzgcc.zzd.zzg;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzgcc.class.getDeclaredField("waitersField"));
                zzb = unsafe.objectFieldOffset(zzgcc.class.getDeclaredField("listenersField"));
                zzd = unsafe.objectFieldOffset(zzgcc.class.getDeclaredField("valueField"));
                zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(zzgcg zzgcgVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final zzgcb.zzd zza(zzgcc zzgccVar, zzgcb.zzd zzdVar) {
            zzgcb.zzd zzdVar2;
            do {
                zzdVar2 = zzgccVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgccVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final zze zzb(zzgcc zzgccVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgccVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzgccVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final void zzd(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zze(zzgcc zzgccVar, zzgcb.zzd zzdVar, zzgcb.zzd zzdVar2) {
            return zzgce.zza(zza, zzgccVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zzf(zzgcc zzgccVar, Object obj, Object obj2) {
            return zzgce.zza(zza, zzgccVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgcc.zza
        final boolean zzg(zzgcc zzgccVar, zze zzeVar, zze zzeVar2) {
            return zzgce.zza(zza, zzgccVar, zzc, zzeVar, zzeVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    /* loaded from: classes2.dex */
    public final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze() {
            zzgcc.zzs(this, Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzg = z;
        String property = System.getProperty("java.runtime.name", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(null);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(null);
                    th = null;
                    th2 = e;
                } catch (Error | Exception e2) {
                    th = e2;
                    th2 = e;
                    zzcVar = new zzc(null);
                }
            }
        } else {
            try {
                zzcVar = new zzb(null);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(null);
            }
        }
        th = null;
        th2 = null;
        zzbi = zzcVar;
        if (th != null) {
            zzgdw zzgdwVar = zzf;
            zzgdwVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgdwVar.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbi.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static /* synthetic */ void zzs(zze zzeVar, Thread thread) {
        zzbi.zzd(zzeVar, thread);
    }

    public static boolean zzv(zzgcc zzgccVar, Object obj, Object obj2) {
        return zzbi.zzf(zzgccVar, obj, obj2);
    }

    public final zzgcb.zzd zzp(zzgcb.zzd zzdVar) {
        return zzbi.zza(this, zzdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        r0 = r6.valueField;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        if ((r4 & com.google.android.gms.internal.ads.zzgcb.zzm(r0)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
        return com.google.android.gms.internal.ads.zzgcb.zzh(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        zza(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        throw new java.lang.InterruptedException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzq() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L67
            java.lang.Object r0 = r6.valueField
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r2
        Lf:
            boolean r4 = com.google.android.gms.internal.ads.zzgcb.zzm(r0)
            r3 = r3 & r4
            if (r3 == 0) goto L1b
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgcb.zzh(r0)
            return r0
        L1b:
            com.google.android.gms.internal.ads.zzgcc$zze r0 = r6.waitersField
            com.google.android.gms.internal.ads.zzgcc$zze r3 = com.google.android.gms.internal.ads.zzgcc.zze.zza
            if (r0 == r3) goto L5c
            com.google.android.gms.internal.ads.zzgcc$zze r3 = new com.google.android.gms.internal.ads.zzgcc$zze
            r3.<init>()
        L26:
            com.google.android.gms.internal.ads.zzgcc$zza r4 = com.google.android.gms.internal.ads.zzgcc.zzbi
            r4.zzc(r3, r0)
            boolean r0 = r4.zzg(r6, r0, r3)
            if (r0 == 0) goto L56
        L31:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4d
            java.lang.Object r0 = r6.valueField
            if (r0 == 0) goto L40
            r4 = r1
            goto L41
        L40:
            r4 = r2
        L41:
            boolean r5 = com.google.android.gms.internal.ads.zzgcb.zzm(r0)
            r4 = r4 & r5
            if (r4 == 0) goto L31
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgcb.zzh(r0)
            return r0
        L4d:
            r6.zza(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L56:
            com.google.android.gms.internal.ads.zzgcc$zze r0 = r6.waitersField
            com.google.android.gms.internal.ads.zzgcc$zze r4 = com.google.android.gms.internal.ads.zzgcc.zze.zza
            if (r0 != r4) goto L26
        L5c:
            java.lang.Object r0 = r6.valueField
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgcb.zzh(r0)
            return r0
        L67:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcc.zzq():java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, java.lang.Math.min(r4, 2147483647999999999L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (java.lang.Thread.interrupted() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r4 = r18.valueField;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        if ((r5 & com.google.android.gms.internal.ads.zzgcb.zzm(r4)) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        return com.google.android.gms.internal.ads.zzgcb.zzh(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        zza(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        zza(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        throw new java.lang.InterruptedException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzr(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcc.zzr(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void zzt() {
        for (zze zzb2 = zzbi.zzb(this, zze.zza); zzb2 != null; zzb2 = zzb2.next) {
            Thread thread = zzb2.thread;
            if (thread != null) {
                zzb2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean zzu(zzgcb.zzd zzdVar, zzgcb.zzd zzdVar2) {
        return zzbi.zze(this, zzdVar, zzdVar2);
    }
}
