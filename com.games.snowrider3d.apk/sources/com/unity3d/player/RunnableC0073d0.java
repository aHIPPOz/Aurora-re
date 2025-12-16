package com.unity3d.player;

import android.os.SystemClock;
import android.view.KeyEvent;
/* renamed from: com.unity3d.player.d0 */
/* loaded from: classes2.dex */
public final class RunnableC0073d0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0073d0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(uptimeMillis, uptimeMillis, 0, 4, 1, 0, -1, 0, 0, 257);
        KeyEvent keyEvent2 = new KeyEvent(uptimeMillis, 1 + uptimeMillis, 1, 4, 1, 0, -1, 0, 0, 257);
        this.a.getActivity().dispatchKeyEvent(keyEvent);
        this.a.getActivity().dispatchKeyEvent(keyEvent2);
    }
}
