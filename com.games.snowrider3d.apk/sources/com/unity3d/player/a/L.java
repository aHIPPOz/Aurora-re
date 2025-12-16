package com.unity3d.player.a;
/* loaded from: classes2.dex */
public final class L implements Runnable {
    public final /* synthetic */ M a;

    public L(M m) {
        this.a = m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().releasePointerCapture();
    }
}
