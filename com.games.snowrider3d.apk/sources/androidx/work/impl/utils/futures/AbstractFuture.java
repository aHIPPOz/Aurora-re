package androidx.work.impl.utils.futures;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class AbstractFuture<V> implements ListenableFuture<V> {
    static final AtomicHelper ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile Listener listeners;
    volatile Object value;
    volatile Waiter waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(AbstractFuture.class.getName());

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    static {
        AtomicHelper atomicHelper;
        Throwable th;
        try {
            atomicHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            atomicHelper = new SynchronizedHelper();
        }
        ATOMIC_HELPER = atomicHelper;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    /* loaded from: classes.dex */
    public static final class Waiter {
        static final Waiter TOMBSTONE = new Waiter(false);
        volatile Waiter next;
        volatile Thread thread;

        Waiter(boolean unused) {
        }

        Waiter() {
            AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }

        void setNext(Waiter next) {
            AbstractFuture.ATOMIC_HELPER.putNext(this, next);
        }

        void unpark() {
            Thread thread = this.thread;
            if (thread != null) {
                this.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void removeWaiter(Waiter node) {
        node.thread = null;
        while (true) {
            Waiter waiter = this.waiters;
            if (waiter == Waiter.TOMBSTONE) {
                return;
            }
            Waiter waiter2 = null;
            while (waiter != null) {
                Waiter waiter3 = waiter.next;
                if (waiter.thread != null) {
                    waiter2 = waiter;
                } else if (waiter2 != null) {
                    waiter2.next = waiter3;
                    if (waiter2.thread == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.casWaiters(this, waiter, waiter3)) {
                    break;
                }
                waiter = waiter3;
            }
            return;
        }
    }

    /* loaded from: classes.dex */
    public static final class Listener {
        static final Listener TOMBSTONE = new Listener(null, null);
        final Executor executor;
        Listener next;
        final Runnable task;

        Listener(Runnable task, Executor executor) {
            this.task = task;
            this.executor = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class Failure {
        static final Failure FALLBACK_INSTANCE = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        Failure(Throwable exception) {
            this.exception = (Throwable) AbstractFuture.checkNotNull(exception);
        }
    }

    /* loaded from: classes.dex */
    public static final class Cancellation {
        static final Cancellation CAUSELESS_CANCELLED;
        static final Cancellation CAUSELESS_INTERRUPTED;
        final Throwable cause;
        final boolean wasInterrupted;

        static {
            if (AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
                return;
            }
            CAUSELESS_CANCELLED = new Cancellation(false, null);
            CAUSELESS_INTERRUPTED = new Cancellation(true, null);
        }

        Cancellation(boolean wasInterrupted, Throwable cause) {
            this.wasInterrupted = wasInterrupted;
            this.cause = cause;
        }
    }

    /* loaded from: classes.dex */
    public static final class SetFuture<V> implements Runnable {
        final ListenableFuture<? extends V> future;
        final AbstractFuture<V> owner;

        SetFuture(AbstractFuture<V> owner, ListenableFuture<? extends V> future) {
            this.owner = owner;
            this.future = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.owner.value != this) {
                return;
            }
            if (!AbstractFuture.ATOMIC_HELPER.casValue(this.owner, this, AbstractFuture.getFutureValue(this.future))) {
                return;
            }
            AbstractFuture.complete(this.owner);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r19.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r5 & (!(r4 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        return getDoneValue(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= androidx.work.impl.utils.futures.AbstractFuture.SPIN_THRESHOLD_NANOS) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        removeWaiter(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        removeWaiter(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r4 & (!(r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return getDoneValue(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        removeWaiter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L1a:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r6.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r3 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r0 == r3) goto L5a
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r3 = new androidx.work.impl.utils.futures.AbstractFuture$Waiter
            r3.<init>()
        L25:
            r3.setNext(r0)
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r4 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r0 = r4.casWaiters(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L4b:
            r6.removeWaiter(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r0 = r6.waiters
            androidx.work.impl.utils.futures.AbstractFuture$Waiter r4 = androidx.work.impl.utils.futures.AbstractFuture.Waiter.TOMBSTONE
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = r6.getDoneValue(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) obj).cause);
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).exception);
        }
        if (obj != NULL) {
            return obj;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof Cancellation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = androidx.work.impl.utils.futures.AbstractFuture.GENERATE_CANCELLATION_CAUSES
            if (r3 == 0) goto L1f
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r3 = new androidx.work.impl.utils.futures.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r3 = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED
            goto L26
        L24:
            androidx.work.impl.utils.futures.AbstractFuture$Cancellation r3 = androidx.work.impl.utils.futures.AbstractFuture.Cancellation.CAUSELESS_CANCELLED
        L26:
            r4 = r7
            r5 = r2
        L28:
            androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper r6 = androidx.work.impl.utils.futures.AbstractFuture.ATOMIC_HELPER
            boolean r6 = r6.casValue(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.interruptTask()
        L35:
            complete(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            if (r4 == 0) goto L58
            androidx.work.impl.utils.futures.AbstractFuture$SetFuture r0 = (androidx.work.impl.utils.futures.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.future
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L55
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4d
            r5 = r1
            goto L4e
        L4d:
            r5 = r2
        L4e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = r1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.SetFuture
            if (r6 != 0) goto L28
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof Cancellation) && ((Cancellation) obj).wasInterrupted;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        checkNotNull(listener);
        checkNotNull(executor);
        Listener listener2 = this.listeners;
        if (listener2 != Listener.TOMBSTONE) {
            Listener listener3 = new Listener(listener, executor);
            do {
                listener3.next = listener2;
                if (ATOMIC_HELPER.casListeners(this, listener2, listener3)) {
                    return;
                }
                listener2 = this.listeners;
            } while (listener2 != Listener.TOMBSTONE);
            executeListener(listener, executor);
        }
        executeListener(listener, executor);
    }

    public boolean set(V value) {
        if (value == null) {
            value = (V) NULL;
        }
        if (ATOMIC_HELPER.casValue(this, null, value)) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable throwable) {
        if (ATOMIC_HELPER.casValue(this, null, new Failure((Throwable) checkNotNull(throwable)))) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(ListenableFuture<? extends V> future) {
        Failure failure;
        checkNotNull(future);
        Object obj = this.value;
        if (obj == null) {
            if (future.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, null, getFutureValue(future))) {
                    return false;
                }
                complete(this);
                return true;
            }
            SetFuture setFuture = new SetFuture(this, future);
            if (ATOMIC_HELPER.casValue(this, null, setFuture)) {
                try {
                    future.addListener(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.FALLBACK_INSTANCE;
                    }
                    ATOMIC_HELPER.casValue(this, setFuture, failure);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof Cancellation) {
            future.cancel(((Cancellation) obj).wasInterrupted);
        }
        return false;
    }

    static Object getFutureValue(ListenableFuture<?> future) {
        if (future instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) future).value;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.wasInterrupted ? cancellation.cause != null ? new Cancellation(false, cancellation.cause) : Cancellation.CAUSELESS_CANCELLED : obj;
        }
        boolean isCancelled = future.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return Cancellation.CAUSELESS_CANCELLED;
        }
        try {
            Object uninterruptibly = getUninterruptibly(future);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e));
            }
            return new Cancellation(false, e);
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.AbstractFuture<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.AbstractFuture] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture<V>] */
    static void complete(AbstractFuture<?> future) {
        Listener listener = null;
        while (true) {
            future.releaseWaiters();
            future.afterDone();
            Listener clearListeners = future.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                Runnable runnable = clearListeners.task;
                if (runnable instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable;
                    future = setFuture.owner;
                    if (future.value == setFuture) {
                        if (ATOMIC_HELPER.casValue(future, setFuture, getFutureValue(setFuture.future))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, clearListeners.executor);
                }
                clearListeners = listener;
            }
            return;
        }
    }

    final void maybePropagateCancellationTo(Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        Waiter waiter;
        do {
            waiter = this.waiters;
        } while (!ATOMIC_HELPER.casWaiters(this, waiter, Waiter.TOMBSTONE));
        while (waiter != null) {
            waiter.unpark();
            waiter = waiter.next;
        }
    }

    private Listener clearListeners(Listener onto) {
        Listener listener;
        do {
            listener = this.listeners;
        } while (!ATOMIC_HELPER.casListeners(this, listener, Listener.TOMBSTONE));
        Listener listener2 = onto;
        Listener listener3 = listener;
        while (listener3 != null) {
            Listener listener4 = listener3.next;
            listener3.next = listener2;
            listener2 = listener3;
            listener3 = listener4;
        }
        return listener2;
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(append);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                append.append("PENDING, info=[").append(str).append("]");
            } else if (isDone()) {
                addDoneString(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    protected String pendingToString() {
        Object obj = this.value;
        if (obj instanceof SetFuture) {
            return "setFuture=[" + userObjectToString(((SetFuture) obj).future) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private void addDoneString(StringBuilder builder) {
        try {
            builder.append("SUCCESS, result=[").append(userObjectToString(getUninterruptibly(this))).append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e) {
            builder.append("UNKNOWN, cause=[").append(e.getClass()).append(" thrown from get()]");
        } catch (ExecutionException e2) {
            builder.append("FAILURE, cause=[").append(e2.getCause()).append("]");
        }
    }

    private String userObjectToString(Object o) {
        if (o == this) {
            return "this future";
        }
        return String.valueOf(o);
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AtomicHelper {
        abstract boolean casListeners(AbstractFuture<?> future, Listener expect, Listener update);

        abstract boolean casValue(AbstractFuture<?> future, Object expect, Object update);

        abstract boolean casWaiters(AbstractFuture<?> future, Waiter expect, Waiter update);

        abstract void putNext(Waiter waiter, Waiter newValue);

        abstract void putThread(Waiter waiter, Thread newValue);

        private AtomicHelper() {
        }
    }

    /* loaded from: classes.dex */
    private static final class SafeAtomicHelper extends AtomicHelper {
        final AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> waitersUpdater, AtomicReferenceFieldUpdater<AbstractFuture, Listener> listenersUpdater, AtomicReferenceFieldUpdater<AbstractFuture, Object> valueUpdater) {
            super();
            this.waiterThreadUpdater = waiterThreadUpdater;
            this.waiterNextUpdater = waiterNextUpdater;
            this.waitersUpdater = waitersUpdater;
            this.listenersUpdater = listenersUpdater;
            this.valueUpdater = valueUpdater;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putThread(Waiter waiter, Thread newValue) {
            this.waiterThreadUpdater.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter newValue) {
            this.waiterNextUpdater.lazySet(waiter, newValue);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> future, Waiter expect, Waiter update) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.waitersUpdater, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> future, Listener expect, Listener update) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.listenersUpdater, future, expect, update);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> future, Object expect, Object update) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.valueUpdater, future, expect, update);
        }
    }

    /* loaded from: classes.dex */
    private static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putThread(Waiter waiter, Thread newValue) {
            waiter.thread = newValue;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter newValue) {
            waiter.next = newValue;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> future, Waiter expect, Waiter update) {
            synchronized (future) {
                if (future.waiters == expect) {
                    future.waiters = update;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> future, Listener expect, Listener update) {
            synchronized (future) {
                if (future.listeners == expect) {
                    future.listeners = update;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> future, Object expect, Object update) {
            synchronized (future) {
                if (future.value == expect) {
                    future.value = update;
                    return true;
                }
                return false;
            }
        }
    }

    private static CancellationException cancellationExceptionWithCause(String message, Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    static <T> T checkNotNull(T reference) {
        reference.getClass();
        return reference;
    }
}
