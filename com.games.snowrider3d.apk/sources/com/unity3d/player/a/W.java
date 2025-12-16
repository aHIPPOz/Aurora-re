package com.unity3d.player.a;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.C0081h0;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.W0;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes2.dex */
public final class W {
    public final UnityPlayer a;
    public C0081h0 c;
    public Context b = null;
    public final Semaphore d = new Semaphore(0);
    public final ReentrantLock e = new ReentrantLock();
    public W0 f = null;
    public int g = 2;
    public boolean h = false;
    public boolean i = false;

    public W(UnityPlayer unityPlayer) {
        this.a = null;
        this.a = unityPlayer;
    }

    public void runOnUiThread(Runnable runnable) {
        Context context = this.b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            AbstractC0061q.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
