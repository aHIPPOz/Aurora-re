package com.unity3d.player;

import android.app.Activity;
/* renamed from: com.unity3d.player.i0 */
/* loaded from: classes2.dex */
public final class RunnableC0083i0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0083i0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean nativeIsAutorotationOn;
        UnityPlayer unityPlayer;
        Activity activity;
        int i;
        nativeIsAutorotationOn = this.a.nativeIsAutorotationOn();
        if (!nativeIsAutorotationOn || (activity = (unityPlayer = this.a).mActivity) == null) {
            return;
        }
        i = unityPlayer.mInitialScreenOrientation;
        activity.setRequestedOrientation(i);
    }
}
