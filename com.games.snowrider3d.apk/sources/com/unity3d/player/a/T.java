package com.unity3d.player.a;
/* loaded from: classes2.dex */
public final class T implements Runnable {
    public final /* synthetic */ W a;

    public T(W w) {
        this.a = w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.onPause();
    }
}
