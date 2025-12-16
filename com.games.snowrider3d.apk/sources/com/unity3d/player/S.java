package com.unity3d.player;

import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0050f;
/* loaded from: classes2.dex */
public final class S implements SurfaceHolder.Callback {
    public final /* synthetic */ T a;

    public S(T t) {
        this.a = t;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        T t = this.a;
        com.unity3d.player.a.A a = t.c;
        FrameLayout frameLayout = t.b.getFrameLayout();
        com.unity3d.player.a.z zVar = a.b;
        if (zVar == null || zVar.getParent() != null) {
            return;
        }
        frameLayout.addView(a.b);
        frameLayout.bringChildToFront(a.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        T t = this.a;
        com.unity3d.player.a.A a = t.c;
        C0050f c0050f = t.a;
        a.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && a.a != null) {
            if (a.b == null) {
                a.b = new com.unity3d.player.a.z(a, a.a);
            }
            a.b.a(c0050f);
        }
        this.a.b.updateGLDisplay(0, null);
    }
}
