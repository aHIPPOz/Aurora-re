package com.unity3d.player;
/* loaded from: classes2.dex */
public final class Y implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayer b;

    public Y(UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.b;
        X0.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.a, DisplayCutoutSupport.getDisplayCutoutSupport(this.b.mActivity));
        this.b.dispatchFrameLayoutPadding();
    }
}
