package com.unity3d.player;

import com.unity3d.player.a.AbstractC0061q;
/* loaded from: classes2.dex */
public final class I0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public I0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.a;
        z = unityPlayerForActivityOrService.mMainDisplayOverride;
        if (z) {
            unityPlayerForActivityOrService.getFrameLayout().removeView(this.a.getView());
        } else if (unityPlayerForActivityOrService.getView().getParent() == null) {
            this.a.getFrameLayout().addView(this.a.getView());
        } else {
            AbstractC0061q.Log(5, "Couldn't add view, because it's already assigned to another parent");
        }
    }
}
