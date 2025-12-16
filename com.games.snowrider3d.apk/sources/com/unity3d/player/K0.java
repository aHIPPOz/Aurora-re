package com.unity3d.player;

import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public final class K0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public K0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T view = this.a.getView();
        if (view != null) {
            com.unity3d.player.a.A a = view.c;
            FrameLayout frameLayout = view.b.getFrameLayout();
            com.unity3d.player.a.z zVar = a.b;
            if (zVar != null && zVar.getParent() != null) {
                frameLayout.removeView(a.b);
            }
            view.c.b = null;
        }
    }
}
