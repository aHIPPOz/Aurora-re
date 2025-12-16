package com.unity3d.player;
/* loaded from: classes2.dex */
public final class Z implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public Z(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.a;
        X0.a(unityPlayer.mActivity, unityPlayer.getFrameLayout());
        this.a.dispatchFrameLayoutPadding();
    }
}
