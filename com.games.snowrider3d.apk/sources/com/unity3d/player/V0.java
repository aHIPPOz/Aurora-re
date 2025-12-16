package com.unity3d.player;
/* loaded from: classes2.dex */
public final class V0 implements Runnable {
    public final W0 a;
    public boolean b = false;

    public V0(W0 w0) {
        this.a = w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (!this.b) {
            int i = W0.A;
            this.a.cancelOnPrepare();
        }
    }
}
