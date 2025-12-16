package com.unity3d.player;
/* loaded from: classes2.dex */
public final class X implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public X(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setupUnityToBePaused();
        this.a.windowFocusChanged(false);
        this.a.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
    }
}
