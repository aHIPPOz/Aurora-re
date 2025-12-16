package com.unity3d.player;
/* loaded from: classes2.dex */
public final class T0 implements Runnable {
    public final /* synthetic */ W0 a;

    public T0(W0 w0) {
        this.a = w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroyPlayer();
        this.a.a(3);
    }
}
