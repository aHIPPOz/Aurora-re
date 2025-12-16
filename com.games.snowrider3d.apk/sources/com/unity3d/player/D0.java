package com.unity3d.player;

import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class D0 implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public D0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore) {
        this.b = unityPlayerForActivityOrService;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.shutdown();
        this.a.release();
    }
}
