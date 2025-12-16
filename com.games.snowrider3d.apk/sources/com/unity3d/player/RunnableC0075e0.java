package com.unity3d.player;

import android.widget.FrameLayout;
/* renamed from: com.unity3d.player.e0 */
/* loaded from: classes2.dex */
public final class RunnableC0075e0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0075e0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.H h;
        FrameLayout frameLayout = this.a.getFrameLayout();
        h = this.a.m_SplashScreen;
        frameLayout.removeView(h);
        this.a.m_SplashScreen = null;
    }
}
