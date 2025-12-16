package com.unity3d.player;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public final class O0 implements SurfaceHolder.Callback {
    public final /* synthetic */ UnityPlayerForGameActivity a;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public O0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.a = unityPlayerForGameActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        com.unity3d.player.a.A a;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        a = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.z zVar = a.b;
        if (zVar == null || zVar.getParent() != null) {
            return;
        }
        frameLayout.addView(a.b);
        frameLayout.bringChildToFront(a.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        com.unity3d.player.a.A a;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.a;
        a = unityPlayerForGameActivity.m_PersistentUnitySurface;
        SurfaceView surfaceView = unityPlayerForGameActivity.m_SurfaceView;
        a.getClass();
        if (!PlatformSupport.NOUGAT_SUPPORT || a.a == null) {
            return;
        }
        if (a.b == null) {
            a.b = new com.unity3d.player.a.z(a, a.a);
        }
        a.b.a(surfaceView);
    }
}
