package com.unity3d.player;

import com.unity3d.player.a.AbstractC0047c;
import com.unity3d.player.a.AbstractC0061q;
/* renamed from: com.unity3d.player.a0 */
/* loaded from: classes2.dex */
public final class RunnableC0067a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC0067a0(UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.b;
            AbstractC0047c.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.a);
        } catch (Exception e) {
            AbstractC0061q.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
