package com.unity3d.player;

import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public final class S0 implements Runnable {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    public S0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.A a;
        com.unity3d.player.a.A a2;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        a = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.z zVar = a.b;
        if (zVar != null && zVar.getParent() != null) {
            frameLayout.removeView(a.b);
        }
        a2 = this.a.m_PersistentUnitySurface;
        a2.b = null;
    }
}
