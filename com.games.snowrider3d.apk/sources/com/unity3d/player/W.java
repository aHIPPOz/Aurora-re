package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes2.dex */
public final class W extends Thread {
    public final UnityPlayerForActivityOrService a;
    public Handler c;
    public int h;
    public int i;
    public final CountDownLatch b = new CountDownLatch(1);
    public boolean d = false;
    public boolean e = false;
    public int f = 2;
    public int g = 0;
    public int j = 5;

    public W(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("UnityMain");
        Looper.prepare();
        this.c = new Handler(Looper.myLooper(), new U(this));
        this.b.countDown();
        Looper.loop();
    }
}
