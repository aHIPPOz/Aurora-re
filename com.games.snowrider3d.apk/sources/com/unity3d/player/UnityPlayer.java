package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.player.a.AbstractC0054j;
import com.unity3d.player.a.AbstractC0061q;
import com.unity3d.player.a.C0053i;
import com.unity3d.player.a.C0063t;
import com.unity3d.player.a.C0065v;
import com.unity3d.player.a.EnumC0058n;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.fmod.FmodAndroidAudioManager;
/* loaded from: classes2.dex */
public abstract class UnityPlayer implements IUnityPlayerLifecycleEvents {
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME = "unity.auto-set-game-state";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    public static Context currentContext;
    Activity mActivity;
    Context mContext;
    private EnumC0058n mContextType;
    private int mInitialScreenOrientation;
    int mNaturalOrientation;
    boolean mQuitting;
    private com.unity3d.player.a.W mVideoPlayerProxy;
    private ClipboardManager m_ClipboardManager;
    private FrameLayout m_FrameLayout;
    private HashMap m_PermissionRequests;
    private com.unity3d.player.a.H m_SplashScreen;
    TelephonyManager m_TelephonyManager;
    protected IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Configuration prevConfig;
    Handler mHandler = new Handler();
    private boolean mIsFullscreen = true;
    com.unity3d.player.a.O mState = new com.unity3d.player.a.O();
    private OrientationEventListener mOrientationListener = null;
    boolean m_AddPhoneCallListener = false;
    C0095o0 m_PhoneCallListener = new C0095o0(this);
    private GoogleARCoreApi m_ARCoreApi = null;
    private C0089l0 m_FakeListener = new C0089l0();
    private Camera2Wrapper m_Camera2Wrapper = null;
    private HFPStatus m_HFPStatus = null;
    private AudioVolumeHandler m_AudioVolumeHandler = null;
    private OrientationLockListener m_OrientationLockListener = null;
    private FmodAndroidAudioManager m_FmodAndroidAudioManager = null;
    private com.unity3d.player.a.r m_NetworkConnectivity = null;
    private C0065v m_OnBackPressedDispatcher = null;
    private com.unity3d.player.a.M m_Cursor = null;
    private UnityAccessibilityDelegate m_AccessibilityDelegate = null;
    private final ConcurrentLinkedQueue m_MainThreadJobs = new ConcurrentLinkedQueue();
    private Thread m_UIThread = Thread.currentThread();

    private void developmentPlayerInitialize() {
    }

    private final native void initJni(Context context, int i);

    private final native void nativeApplicationUnload();

    private final native void nativeHidePreservedContent();

    private final native boolean nativeInjectEvent(InputEvent inputEvent, int i);

    public final native boolean nativeIsAutorotationOn();

    public final native void nativeMuteMasterAudio(boolean z);

    public static native void nativeSetLaunchURL(String str);

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private final native void nativeViewPaddingChanged(int i, int i2, int i3, int i4, int i5);

    public static native void permissionResponseToNative(long j, boolean z);

    abstract void cleanupResourcesForDestroy();

    public abstract SurfaceView getSurfaceView();

    public abstract View getView();

    abstract boolean handleFocus(boolean z);

    abstract void hidePreservedContent();

    public abstract void onOrientationChanged(int i, int i2);

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public abstract boolean runningOnMainThread();

    public abstract void setMainSurfaceViewAspectRatio(float f);

    public static void UnitySendMessage(String str, String str2, String str3) {
        byte[] bytes;
        if (!com.unity3d.player.a.O.e) {
            AbstractC0061q.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
            return;
        }
        if (str3 == null) {
            bytes = null;
        } else {
            try {
                bytes = str3.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return;
            }
        }
        nativeUnitySendMessage(str, str2, bytes);
    }

    public void dispatchFrameLayoutPadding() {
        if (!com.unity3d.player.a.O.e) {
            return;
        }
        FrameLayout frameLayout = getFrameLayout();
        nativeViewPaddingChanged(0, frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
    }

    private static void unloadNative() {
        if (!com.unity3d.player.a.O.e) {
            return;
        }
        if (NativeLoader.unload()) {
            com.unity3d.player.a.O.e = false;
            return;
        }
        throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
    }

    public boolean injectEvent(InputEvent inputEvent, int i) {
        if (!com.unity3d.player.a.O.e) {
            return false;
        }
        return nativeInjectEvent(inputEvent, i);
    }

    public void invokeOnMainThread(Runnable runnable) {
        if (!com.unity3d.player.a.O.e) {
            return;
        }
        if (runningOnUIThread() || !runningOnMainThread()) {
            this.m_MainThreadJobs.add(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean isNativeInitialized() {
        return com.unity3d.player.a.O.e && this.mState.d;
    }

    private boolean supportsWindowInsetController() {
        return PlatformSupport.RED_VELVET_CAKE_SUPPORT;
    }

    /* loaded from: classes2.dex */
    public abstract class a implements Runnable {
        public abstract void a();

        public a() {
            UnityPlayer.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!UnityPlayer.this.isFinishing()) {
                a();
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    EnumC0058n getContextType() {
        return this.mContextType;
    }

    public UnityPlayer(Context context, EnumC0058n enumC0058n, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        String str;
        this.mInitialScreenOrientation = -1;
        this.m_UnityPlayerLifecycleEvents = null;
        this.mContext = context;
        this.mContextType = enumC0058n;
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        String unityNativeLibraryPath = getUnityNativeLibraryPath(context);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof com.unity3d.player.a.N) {
            com.unity3d.player.a.N n = (com.unity3d.player.a.N) defaultUncaughtExceptionHandler;
            int i = -1;
            int i2 = -1;
            while (true) {
                int indexOf = unityNativeLibraryPath.indexOf(47, i + 1);
                if (indexOf == -1) {
                    break;
                }
                i2 = i;
                i = indexOf;
            }
            if (i2 < 0) {
                str = "Unknown";
            } else {
                str = unityNativeLibraryPath.substring(i2 + 1);
            }
            n.b = str;
        }
        currentContext = context;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.mActivity = activity;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
        }
    }

    public void initialize(FrameLayout frameLayout) {
        this.m_FrameLayout = frameLayout;
        EarlyEnableFullScreenIfEnabled();
        Configuration configuration = getFrameLayout().getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && getSplashEnabled()) {
            com.unity3d.player.a.H h = new com.unity3d.player.a.H(this.mContext, AbstractC0054j.b(3)[getSplashMode()]);
            this.m_SplashScreen = h;
            this.m_FrameLayout.addView(h);
            this.m_FrameLayout.bringChildToFront(this.m_SplashScreen);
        }
        preloadJavaPlugins();
        String loadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!com.unity3d.player.a.O.e) {
            AbstractC0061q.Log(6, "Your hardware does not support this application.");
            AlertDialog create = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new DialogInterface$OnClickListenerC0071c0(this)).setMessage("Your hardware does not support this application.\n\n" + loadNative + "\n\n Press OK to quit.").create();
            create.setCancelable(false);
            create.show();
            return;
        }
        initJni(this.mContext, this.mContextType.a);
        this.mState.d = true;
        this.mQuitting = false;
        developmentPlayerInitialize();
        hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_Cursor = new com.unity3d.player.a.M(this);
        FmodAndroidAudioManager fmodAndroidAudioManager = FmodAndroidAudioManager.getInstance();
        this.m_FmodAndroidAudioManager = fmodAndroidAudioManager;
        fmodAndroidAudioManager.setActivity(this.mActivity);
        this.m_OnBackPressedDispatcher = C0100r.a(getContext(), 1, new RunnableC0073d0(this));
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        this.m_Window = activity.getWindow();
    }

    private int getNaturalOrientation(int i) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i == 2) {
            return 0;
        }
        return ((rotation == 1 || rotation == 3) && i == 1) ? 0 : 1;
    }

    protected void toggleGyroscopeSensor(boolean z) {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z) {
            sensorManager.registerListener(this.m_FakeListener, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.m_FakeListener);
        }
    }

    private String GetGlViewContentDescription(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", TypedValues.Custom.S_STRING, context.getPackageName()));
    }

    public void disableStaticSplashScreen() {
        runOnUiThread(new RunnableC0075e0(this));
    }

    private void EarlyEnableFullScreenIfEnabled() {
        Activity activity = this.mActivity;
        if (activity != null && activity.getWindow() != null && (getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false))) {
            applyWindowUIChanges(true);
        }
        DisplayCutoutSupport.setLayoutCutoutMode(this.mActivity);
    }

    private boolean isWindowTranslucent() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public void applySurfaceViewSettings(SurfaceView surfaceView) {
        if (isWindowTranslucent()) {
            surfaceView.getHolder().setFormat(-3);
            surfaceView.setZOrderOnTop(true);
            return;
        }
        surfaceView.getHolder().setFormat(-1);
    }

    public void finish() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.finish();
    }

    void runOnAnonymousThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void runOnUiThread(Runnable runnable) {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void postOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void newIntent(Intent intent) {
        setLaunchURL(intent.getData());
    }

    public void destroy() {
        Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.closeCamera2();
            this.m_Camera2Wrapper = null;
        }
        HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.b();
            this.m_HFPStatus = null;
        }
        FmodAndroidAudioManager fmodAndroidAudioManager = this.m_FmodAndroidAudioManager;
        if (fmodAndroidAudioManager != null) {
            fmodAndroidAudioManager.setActivity(null);
        }
        com.unity3d.player.a.r rVar = this.m_NetworkConnectivity;
        if (rVar != null) {
            rVar.a();
            this.m_NetworkConnectivity = null;
        }
        C0065v c0065v = this.m_OnBackPressedDispatcher;
        if (c0065v != null) {
            c0065v.unregisterOnBackPressedCallback();
            this.m_OnBackPressedDispatcher = null;
        }
        this.mQuitting = true;
        if (!this.mState.c) {
            setupUnityToBePaused();
        }
        cleanupResourcesForDestroy();
        unloadNative();
    }

    public void kill() {
        AbstractC0061q.Log(4, "Quitting process");
        Process.killProcess(Process.myPid());
    }

    public void onStop() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBePaused();
    }

    public void onStart() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBeResumed();
    }

    public void onPause() {
        MultiWindowSupport.saveMultiWindowMode(this.mActivity);
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        setupUnityToBePaused();
    }

    public void onResume() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity) || MultiWindowSupport.isMultiWindowModeChangedToTrue(this.mActivity)) {
            setupUnityToBeResumed();
        }
    }

    public void pause() {
        setupUnityToBePaused();
    }

    public void setupUnityToBePaused() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        com.unity3d.player.a.W w = this.mVideoPlayerProxy;
        if (w != null) {
            w.e.lock();
            W0 w0 = w.f;
            if (w0 != null) {
                if (w.g == 0) {
                    w0.cancelOnPrepare();
                } else if (w.i) {
                    boolean z = w0.t;
                    w.h = z;
                    if (!z) {
                        w0.pause();
                    }
                }
            }
            w.e.unlock();
        }
        AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            C0053i c0053i = audioVolumeHandler.a;
            if (c0053i.c != null) {
                c0053i.a.getContentResolver().unregisterContentObserver(c0053i.c);
                c0053i.c = null;
            }
            audioVolumeHandler.a = null;
            this.m_AudioVolumeHandler = null;
        }
        OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            com.unity3d.player.a.J j = orientationLockListener.a;
            if (j.b != null) {
                j.a.getContentResolver().unregisterContentObserver(j.b);
                j.b = null;
            }
            orientationLockListener.a = null;
            this.m_OrientationLockListener = null;
        }
        C0065v c0065v = this.m_OnBackPressedDispatcher;
        if (c0065v != null) {
            c0065v.c = c0065v.a != null;
            c0065v.unregisterOnBackPressedCallback();
        }
        if (canPauseUnity()) {
            pauseUnity();
        }
    }

    protected boolean canPauseUnity() {
        com.unity3d.player.a.O o = this.mState;
        return o.b || !o.c;
    }

    public void pauseUnity() {
        com.unity3d.player.a.O o = this.mState;
        o.b = false;
        o.c = true;
    }

    protected boolean canResumeUnity() {
        Activity activity = this.mActivity;
        boolean isInMultiWindowMode = activity != null ? MultiWindowSupport.isInMultiWindowMode(activity) : false;
        com.unity3d.player.a.O o = this.mState;
        if (!com.unity3d.player.a.O.e) {
            o.getClass();
        } else if ((isInMultiWindowMode || o.a) && !o.c && !o.b) {
            return true;
        }
        return false;
    }

    public void resumeUnity() {
        this.mState.b = true;
    }

    public void resume() {
        setupUnityToBeResumed();
    }

    protected void setupUnityToBeResumed() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.c = false;
        com.unity3d.player.a.W w = this.mVideoPlayerProxy;
        if (w != null) {
            w.e.lock();
            W0 w0 = w.f;
            if (w0 != null && w.i && !w.h) {
                w0.start();
            }
            w.e.unlock();
        }
        if (canResumeUnity()) {
            resumeUnity();
        }
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && com.unity3d.player.a.O.e) {
            this.m_OrientationLockListener = new OrientationLockListener(this.mContext);
        }
        C0065v c0065v = this.m_OnBackPressedDispatcher;
        if (c0065v == null || !c0065v.c) {
            return;
        }
        c0065v.registerOnBackPressedCallback();
    }

    public void shutdown() {
        this.mState.d = false;
    }

    public void unload() {
        nativeApplicationUnload();
    }

    protected boolean skipPermissionsDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    private void requestUserAuthorization(String str, long j) {
        Activity activity;
        if (str == null || str.isEmpty() || (activity = this.mActivity) == null) {
            return;
        }
        UnityPermissions.requestUserPermissions(activity, new String[]{str}, j != 0 ? new C0093n0(j, this) : null);
    }

    public synchronized void addPermissionRequest(PermissionRequest permissionRequest) {
        Integer valueOf;
        if (this.m_PermissionRequests == null) {
            this.m_PermissionRequests = new HashMap();
        }
        int i = 1;
        while (true) {
            valueOf = Integer.valueOf(i);
            if (!this.m_PermissionRequests.containsKey(valueOf)) {
                break;
            }
            i++;
        }
        this.m_PermissionRequests.put(valueOf, permissionRequest);
        if (this.m_PermissionRequests.size() == 1) {
            requestPermissionsFromActivity(permissionRequest.getPermissionNames(), i);
        }
    }

    public void requestPermissionsFromActivity(String[] strArr, int i) {
        this.mActivity.requestPermissions(strArr, i);
    }

    public synchronized void triggerNextPermissionRequest() {
        Iterator it;
        HashMap hashMap = this.m_PermissionRequests;
        if (hashMap == null || (it = hashMap.entrySet().iterator()) == null || !it.hasNext()) {
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        requestPermissionsFromActivity(((PermissionRequest) entry.getValue()).getPermissionNames(), ((Integer) entry.getKey()).intValue());
    }

    public synchronized void permissionResponse(Activity activity, int i, String[] strArr, int[] iArr) {
        int i2;
        if (this.m_PermissionRequests != null) {
            Integer valueOf = Integer.valueOf(i);
            PermissionRequest permissionRequest = (PermissionRequest) this.m_PermissionRequests.get(valueOf);
            if (permissionRequest != null) {
                this.m_PermissionRequests.remove(valueOf);
                String[] permissionNames = permissionRequest.getPermissionNames();
                int[] iArr2 = new int[permissionNames.length];
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    String str = strArr[i3];
                    int i4 = 0;
                    while (true) {
                        if (i4 >= permissionNames.length) {
                            i4 = -1;
                            break;
                        } else if (str.equals(permissionNames[i4])) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        AbstractC0061q.Log(6, "Permission not found in request: " + str);
                    } else {
                        if (iArr[i3] == 0) {
                            i2 = 1;
                        } else {
                            if (Build.VERSION.SDK_INT < 30 && !UnityPermissions.shouldShowRequestPermissionRationale(activity, str)) {
                                i2 = 3;
                            }
                            i2 = 2;
                        }
                        iArr2[i4] = i2;
                    }
                }
                invokeOnMainThread(new RunnableC0077f0(permissionRequest, permissionNames, iArr2));
                triggerNextPermissionRequest();
            }
        }
    }

    protected int getNetworkConnectivity() {
        com.unity3d.player.a.r rVar = this.m_NetworkConnectivity;
        if (rVar != null) {
            return rVar.b();
        }
        if (PlatformSupport.NOUGAT_SUPPORT) {
            this.m_NetworkConnectivity = new C0063t(this.mContext);
        } else {
            this.m_NetworkConnectivity = new com.unity3d.player.a.r(this.mContext);
        }
        return this.m_NetworkConnectivity.b();
    }

    public void setAccessibilityDelegate(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.m_AccessibilityDelegate = unityAccessibilityDelegate;
    }

    public void configurationChanged(Configuration configuration) {
        int diff = this.prevConfig.diff(configuration);
        if ((diff & 256) != 0 || (diff & 1024) != 0 || (diff & 2048) != 0 || (diff & 128) != 0) {
            nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration);
        com.unity3d.player.a.W w = this.mVideoPlayerProxy;
        if (w != null) {
            w.e.lock();
            W0 w0 = w.f;
            if (w0 != null) {
                w0.updateVideoLayout();
            }
            w.e.unlock();
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.m_AccessibilityDelegate;
        if (unityAccessibilityDelegate != null) {
            unityAccessibilityDelegate.a(configuration);
        }
    }

    public void windowFocusChanged(boolean z) {
        this.mState.a = z;
        if (handleFocus(z) && canResumeUnity()) {
            resumeUnity();
        }
    }

    protected boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    static {
        com.unity3d.player.a.N n = new com.unity3d.player.a.N();
        synchronized (n) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == n) {
                return;
            }
            n.a = defaultUncaughtExceptionHandler;
            n.b = "Unknown";
            Thread.setDefaultUncaughtExceptionHandler(n);
        }
    }

    private static String logLoadLibMainError(String str, String str2) {
        String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        AbstractC0061q.Log(6, str3);
        return str3;
    }

    private static void preloadJavaPlugins() {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
        } catch (ClassNotFoundException unused) {
        } catch (LinkageError e) {
            AbstractC0061q.Log(6, "Java class preloading failed: " + e.getMessage());
        }
    }

    private static String loadNative(String str) {
        String str2 = str + "/libmain.so";
        try {
            try {
                try {
                    System.load(str2);
                } catch (SecurityException e) {
                    return logLoadLibMainError(str2, e.toString());
                }
            } catch (UnsatisfiedLinkError e2) {
                return logLoadLibMainError(str2, e2.toString());
            }
        } catch (UnsatisfiedLinkError unused) {
            System.loadLibrary("main");
        }
        if (NativeLoader.load(str)) {
            com.unity3d.player.a.O.e = true;
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        AbstractC0061q.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
        return "NativeLoader.load failure, Unity libraries were not loaded.";
    }

    private static String getUnityNativeLibraryPath(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    protected void setClipboardText(String str) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    protected String getClipboardText() {
        ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.mContext).toString() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    protected String getLaunchURL() {
        Uri data;
        Activity activity = this.mActivity;
        if (activity == null || (data = activity.getIntent().getData()) == null) {
            return null;
        }
        return data.toString();
    }

    void setLaunchURL(Uri uri) {
        invokeOnMainThread(new RunnableC0079g0(uri != null ? uri.toString() : null));
    }

    protected boolean initializeGoogleAr() {
        if (this.m_ARCoreApi != null || this.mActivity == null || !getARCoreEnabled()) {
            return false;
        }
        GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
        this.m_ARCoreApi = googleARCoreApi;
        googleARCoreApi.initializeARCore(this.mActivity);
        if (this.mState.c) {
            return false;
        }
        this.m_ARCoreApi.resumeARCore();
        return false;
    }

    protected boolean showVideoPlayer(String str, int i, int i2, int i3, boolean z, int i4, int i5) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new com.unity3d.player.a.W(this);
        }
        com.unity3d.player.a.W w = this.mVideoPlayerProxy;
        Context context = this.mContext;
        C0081h0 c0081h0 = new C0081h0(this);
        w.e.lock();
        w.c = c0081h0;
        w.b = context;
        w.d.drainPermits();
        w.g = 2;
        w.runOnUiThread(new com.unity3d.player.a.S(w, str, i, i2, i3, z, i4, i5));
        boolean z2 = false;
        try {
            w.e.unlock();
            w.d.acquire();
            w.e.lock();
            if (w.g != 2) {
                z2 = true;
            }
        } catch (InterruptedException unused) {
        }
        w.runOnUiThread(new com.unity3d.player.a.T(w));
        if (z2 && w.g != 3) {
            w.runOnUiThread(new com.unity3d.player.a.U(w));
        } else {
            w.runOnUiThread(new com.unity3d.player.a.V(w));
        }
        w.e.unlock();
        if (z2) {
            runOnUiThread(new RunnableC0083i0(this));
        }
        return z2;
    }

    protected boolean isUaaLUseCase() {
        String callingPackage;
        Activity activity = this.mActivity;
        return (activity == null || (callingPackage = activity.getCallingPackage()) == null || !callingPackage.equals(this.mContext.getPackageName())) ? false : true;
    }

    protected int getUaaLLaunchProcessType() {
        String processName = getProcessName();
        return (processName == null || processName.equals(this.mContext.getPackageName())) ? 0 : 1;
    }

    private String getProcessName() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }

    private ActivityInfo getActivityInfo() {
        return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
    }

    public boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean getLaunchFullscreen() {
        try {
            return getApplicationInfo().metaData.getBoolean(LAUNCH_FULLSCREEN);
        } catch (Exception unused) {
            return false;
        }
    }

    protected int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (Exception unused) {
            return 0;
        }
    }

    boolean getAutoSetGameStateEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    boolean shouldSetGameState() {
        return PlatformSupport.TIRAMISU_SUPPORT && this.mActivity != null && !isUaaLUseCase() && getAutoSetGameStateEnabled() && UnityGameManager.getGameManager(currentContext) != null;
    }

    boolean getAutoReportFullyDrawnEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean shouldReportFullyDrawn() {
        if (this.mActivity == null) {
            return false;
        }
        return getAutoReportFullyDrawnEnabled();
    }

    public void reportFullyDrawn() {
        this.mActivity.reportFullyDrawn();
    }

    protected void disableLogger() {
        AbstractC0061q.a = true;
    }

    public boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mQuitting = activity.isFinishing();
        }
        return this.mQuitting;
    }

    private void hideStatusBar() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    public boolean injectEvent(InputEvent inputEvent) {
        return injectEvent(inputEvent, 0);
    }

    private void swapViews(View view, View view2) {
        boolean z;
        ViewParent parent;
        if (!this.mState.c) {
            setupUnityToBePaused();
            z = true;
        } else {
            z = false;
        }
        FrameLayout frameLayout = getFrameLayout();
        if (view != null && (parent = view.getParent()) != frameLayout) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            frameLayout.addView(view);
            frameLayout.bringChildToFront(view);
            view.setVisibility(0);
        }
        if (view2 != null && view2.getParent() == frameLayout) {
            view2.setVisibility(8);
            frameLayout.removeView(view2);
        }
        if (z) {
            setupUnityToBeResumed();
        }
    }

    public boolean addViewToPlayer(View view, boolean z) {
        View view2 = getView();
        swapViews(view, z ? view2 : null);
        FrameLayout frameLayout = getFrameLayout();
        boolean z2 = true;
        boolean z3 = view.getParent() == frameLayout;
        boolean z4 = z && view2.getParent() == null;
        boolean z5 = view2.getParent() == frameLayout;
        if (!z3 || (!z4 && !z5)) {
            z2 = false;
        }
        if (!z2) {
            if (!z3) {
                AbstractC0061q.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z4 && !z5) {
                AbstractC0061q.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z2;
    }

    public void removeViewFromPlayer(View view) {
        View view2 = getView();
        swapViews(view2, view);
        boolean z = true;
        boolean z2 = view.getParent() == null;
        if (view2.getParent() != getFrameLayout()) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                AbstractC0061q.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
            }
            if (z) {
                return;
            }
            AbstractC0061q.Log(6, "removeViewFromPlayer: Failure adding old view to hierarchy");
        }
    }

    public void reportError(String str, String str2) {
        AbstractC0061q.Log(6, str + ": " + str2);
    }

    public String getNetworkProxySettings(String str) {
        String str2;
        String str3;
        if (str.startsWith("http:")) {
            str2 = "http.proxyHost";
            str3 = "http.proxyPort";
        } else {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        String property = System.getProperties().getProperty(str2);
        if (property != null && !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(property)) {
            StringBuilder sb = new StringBuilder(property);
            String property2 = System.getProperties().getProperty(str3);
            if (property2 != null && !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(property2)) {
                sb.append(":").append(property2);
            }
            String property3 = System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(property3)) {
                sb.append('\n').append(property3);
            }
            return sb.toString();
        }
        return null;
    }

    public boolean startOrientationListener(int i) {
        if (this.mOrientationListener != null) {
            AbstractC0061q.Log(5, "Orientation Listener already started.");
            return false;
        }
        C0085j0 c0085j0 = new C0085j0(this, this.mContext, i);
        this.mOrientationListener = c0085j0;
        if (c0085j0.canDetectOrientation()) {
            this.mOrientationListener.enable();
            return true;
        }
        AbstractC0061q.Log(5, "Orientation Listener cannot detect orientation.");
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            AbstractC0061q.Log(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    public void invokeOnMainThread(a aVar) {
        if (isFinishing()) {
            return;
        }
        invokeOnMainThread((Runnable) aVar);
    }

    public void executeMainThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.m_MainThreadJobs.poll();
            if (runnable != null) {
                runnable.run();
            } else {
                return;
            }
        }
    }

    protected String getKeyboardLayout() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.mContext.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String a2 = AbstractC0098q.a(currentInputMethodSubtype);
        if (a2 != null && !a2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            return a2;
        }
        String mode = currentInputMethodSubtype.getMode();
        return mode + " " + currentInputMethodSubtype.getExtraValue();
    }

    private boolean runningOnUIThread() {
        return Thread.currentThread() == this.m_UIThread;
    }

    public FrameLayout getFrameLayout() {
        return this.m_FrameLayout;
    }

    String getState() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mState.toString() + "\n");
        sb.append(String.format("m_AudioVolumeHandler = %b", this.m_AudioVolumeHandler).concat("\n"));
        sb.append(String.format("m_OrientationLockListener = %b", this.m_OrientationLockListener).concat("\n"));
        return sb.toString();
    }

    private void requestPointerCapture() {
        com.unity3d.player.a.M m = this.m_Cursor;
        m.getClass();
        if (!PlatformSupport.OREO_SUPPORT) {
            return;
        }
        m.a.runOnUiThread(new com.unity3d.player.a.K(m));
    }

    private void releasePointerCapture() {
        com.unity3d.player.a.M m = this.m_Cursor;
        m.getClass();
        if (!PlatformSupport.OREO_SUPPORT) {
            return;
        }
        m.a.runOnUiThread(new com.unity3d.player.a.L(m));
    }

    private void setBackButtonLeavesApp(boolean z) {
        C0065v c0065v = this.m_OnBackPressedDispatcher;
        if (c0065v != null) {
            if (!z) {
                c0065v.registerOnBackPressedCallback();
            } else {
                c0065v.unregisterOnBackPressedCallback();
            }
        }
    }

    private void setScreenBrightness(float f) {
        float max = Math.max(0.04f, f);
        if (this.m_Window == null || getScreenBrightness() == max) {
            return;
        }
        runOnUiThread(new RunnableC0087k0(this, max));
    }

    private float getScreenBrightness() {
        Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        float f = window.getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        int i = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness", 255);
        return PlatformSupport.PIE_SUPPORT ? (float) Math.max(0.0d, Math.min(1.0d, ((Math.log(i) * 19.811d) - 9.411d) / 100.0d)) : i / 255.0f;
    }

    private void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new X(this));
    }

    private void applyWindowUIChanges(boolean z) {
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        runOnUiThread(new Y(this, z));
    }

    private void applyWindowInsets() {
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        runOnUiThread(new Z(this));
    }

    private void startActivityIndicator(int i) {
        postOnUiThread(new RunnableC0067a0(this, i));
    }

    private void stopActivityIndicator() {
        postOnUiThread(new RunnableC0069b0());
    }
}
