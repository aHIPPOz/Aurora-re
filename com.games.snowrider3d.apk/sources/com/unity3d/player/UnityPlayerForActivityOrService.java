package com.unity3d.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.Surface;
import android.view.WindowInsets;
import com.unity3d.player.a.AbstractC0061q;
import com.unity3d.player.a.AbstractC0066w;
import com.unity3d.player.a.C0050f;
import com.unity3d.player.a.C0059o;
import com.unity3d.player.a.EnumC0058n;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class UnityPlayerForActivityOrService extends UnityPlayer {
    private boolean mMainDisplayOverride;
    private AbstractC0066w mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private AbstractC0112x mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private W m_MainThread;

    private final native boolean nativeDone();

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeMemoryUsageChanged(int i);

    public final native void nativeOnApplyWindowInsets(WindowInsets windowInsets);

    public final native boolean nativePause();

    public final native void nativeRecreateGfxState(int i, Surface surface);

    public final native void nativeReportKeyboardConfigChanged();

    public final native void nativeResume();

    public final native void nativeSendSurfaceChangedEvent();

    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    public final native void nativeSetInputSelection(int i, int i2);

    public final native void nativeSetInputString(String str);

    public final native void nativeSetKeyboardIsVisible(boolean z);

    public final native void nativeSoftInputCanceled();

    public final native void nativeSoftInputClosed();

    public final native void nativeSoftInputLostFocus();

    public final native void nativeConfigurationChanged(Configuration configuration);

    public final native void nativeFocusChanged(boolean z);

    public final native void nativeOrientationChanged(int i, int i2);

    public final native boolean nativeRender();

    public void onTrimMemory(MemoryUsage memoryUsage) {
        if (!com.unity3d.player.a.O.e) {
            return;
        }
        nativeMemoryUsageChanged(memoryUsage.value);
    }

    /* loaded from: classes2.dex */
    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);
        
        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i) {
            this.value = i;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }

        public static void setTimeoutForAll(int i) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }
    }

    /* loaded from: classes2.dex */
    public enum MemoryUsage {
        Low(1),
        Medium(2),
        High(3),
        Critical(4);
        
        public final int value;

        MemoryUsage(int i) {
            this.value = i;
        }
    }

    public UnityPlayerForActivityOrService(Context context) {
        this(context, null);
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        super(context, EnumC0058n.b, iUnityPlayerLifecycleEvents);
        W w = new W(this);
        this.m_MainThread = w;
        this.mMainDisplayOverride = false;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        w.start();
        C0059o c0059o = new C0059o(context, this);
        c0059o.setOnApplyWindowInsetsListener(new C0(this));
        initialize(c0059o);
        W w2 = this.m_MainThread;
        w2.getClass();
        try {
            w2.b.await();
        } catch (InterruptedException e) {
            AbstractC0061q.Log(6, "UnityMainThread was interrupted:" + e.toString());
        }
    }

    public void setOnHandleFocusListener(AbstractC0066w abstractC0066w) {
        this.mOnHandleFocusListener = abstractC0066w;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void configurationChanged(Configuration configuration) {
        super.configurationChanged(configuration);
        if (!isNativeInitialized()) {
            return;
        }
        invokeOnMainThread(new F0(this, new Configuration(configuration)));
    }

    public void sendSurfaceChangedEvent() {
        if (!isNativeInitialized()) {
            return;
        }
        Message.obtain(this.m_MainThread.c, new G0(this)).sendToTarget();
    }

    public void updateGLDisplay(int i, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    private boolean updateDisplayInternal(int i, Surface surface) {
        if (!isNativeInitialized()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        H0 h0 = new H0(this, i, surface, semaphore);
        if (i != 0) {
            h0.run();
        } else if (surface == null) {
            W w = this.m_MainThread;
            Message.obtain(w.c, 2269, V.d).sendToTarget();
            Message.obtain(w.c, h0).sendToTarget();
        } else {
            W w2 = this.m_MainThread;
            Message.obtain(w2.c, h0).sendToTarget();
            Message.obtain(w2.c, 2269, V.e).sendToTarget();
        }
        if (surface != null || i != 0) {
            return true;
        }
        try {
            SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            AbstractC0061q.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            AbstractC0061q.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    public boolean displayChanged(int i, Surface surface) {
        if (i == 0) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new I0(this));
        }
        return updateDisplayInternal(i, surface);
    }

    private void raiseFocusListener(boolean z) {
        AbstractC0066w abstractC0066w = this.mOnHandleFocusListener;
        if (abstractC0066w != null) {
            RunnableC0103s0 runnableC0103s0 = ((C0099q0) abstractC0066w).a;
            runnableC0103s0.b = true;
            if (!runnableC0103s0.a) {
                return;
            }
            runnableC0103s0.c.release();
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    boolean handleFocus(boolean z) {
        AbstractC0112x abstractC0112x;
        V v;
        W w;
        if (this.mState.d && ((abstractC0112x = this.mSoftInput) == null || abstractC0112x.c())) {
            if (z) {
                w = this.m_MainThread;
                v = V.g;
            } else {
                w = this.m_MainThread;
                v = V.f;
            }
            Message.obtain(w.c, 2269, v).sendToTarget();
            raiseFocusListener(z);
            return true;
        }
        raiseFocusListener(z);
        return false;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread(new J0(this));
        W w = this.m_MainThread;
        Message.obtain(w.c, 2269, V.b).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    void hidePreservedContent() {
        runOnUiThread(new K0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f) {
        runOnUiThread(new L0(this, f));
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        return Thread.currentThread() == this.m_MainThread;
    }

    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new N0(this, this, str, i, z, z2, z3, z4, str2, i2, z5, z6, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                return;
            }
            AbstractC0061q.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (InterruptedException unused) {
            AbstractC0061q.Log(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * Math.max(1.0f, Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", 0.0f)));
    }

    public void dismissSoftInput() {
        AbstractC0112x abstractC0112x = this.mSoftInput;
        if (abstractC0112x != null) {
            abstractC0112x.b();
            nativeReportKeyboardConfigChanged();
        }
    }

    protected void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        reportSoftInputArea(new Rect());
        reportSoftInputIsVisible(false);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dismissSoftInput();
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new RunnableC0103s0(this, semaphore, this));
        try {
            if (!semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                AbstractC0061q.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
            }
        } catch (InterruptedException unused) {
            AbstractC0061q.Log(6, "UI thread got interrupted while waiting softinput hiding operation.");
        } finally {
            this.mSoftInput = null;
        }
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC0105t0(this, str));
    }

    protected void setCharacterLimit(int i) {
        runOnUiThread(new RunnableC0107u0(this, i));
    }

    protected void setHideInputField(boolean z) {
        runOnUiThread(new RunnableC0109v0(this, z));
    }

    protected void setSelection(int i, int i2) {
        runOnUiThread(new RunnableC0111w0(this, i, i2));
    }

    public void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        invokeOnMainThread((Runnable) new C0113x0(this, z, str, i));
    }

    public void reportSoftInputSelection(int i, int i2) {
        invokeOnMainThread((Runnable) new y0(this, i, i2));
    }

    public void reportSoftInputArea(Rect rect) {
        invokeOnMainThread((Runnable) new z0(this, rect));
    }

    public void reportSoftInputIsVisible(boolean z) {
        invokeOnMainThread((Runnable) new A0(this, z));
    }

    public boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    @Override // com.unity3d.player.UnityPlayer
    void cleanupResourcesForDestroy() {
        W w = this.m_MainThread;
        Message.obtain(w.c, 2269, V.c).sendToTarget();
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (com.unity3d.player.a.O.e) {
            getFrameLayout().removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
    }

    public void queueDestroy() {
        AbstractC0061q.Log(4, "Queue Destroy");
        runOnUiThread(new B0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void pauseUnity() {
        Runnable runnable;
        super.pauseUnity();
        reportSoftInputStr(null, 1, true);
        com.unity3d.player.a.O o = this.mState;
        o.b = false;
        o.c = true;
        if (com.unity3d.player.a.O.e) {
            Semaphore semaphore = new Semaphore(0);
            if (isFinishing()) {
                runnable = new D0(this, semaphore);
            } else {
                runnable = new E0(this, semaphore);
            }
            W w = this.m_MainThread;
            Message.obtain(w.c, 2269, V.a).sendToTarget();
            Message.obtain(w.c, runnable).sendToTarget();
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    AbstractC0061q.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                AbstractC0061q.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    public void shutdown() {
        this.mProcessKillRequested = nativeDone();
        super.shutdown();
    }

    @Override // com.unity3d.player.UnityPlayer
    public void onOrientationChanged(int i, int i2) {
        W w = this.m_MainThread;
        w.h = this.mNaturalOrientation;
        w.i = i2;
        Message.obtain(w.c, 2269, V.i).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public T getView() {
        return ((C0059o) getFrameLayout()).b;
    }

    @Override // com.unity3d.player.UnityPlayer
    public C0050f getSurfaceView() {
        return getView().a;
    }
}
