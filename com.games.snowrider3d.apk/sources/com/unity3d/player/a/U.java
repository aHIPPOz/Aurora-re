package com.unity3d.player.a;

import com.unity3d.player.W0;
/* loaded from: classes2.dex */
public final class U implements Runnable {
    public final /* synthetic */ W a;

    public U(W w) {
        this.a = w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W w = this.a;
        W0 w0 = w.f;
        if (w0 != null) {
            w.a.addViewToPlayer(w0, true);
            W w2 = this.a;
            w2.i = true;
            w2.f.requestFocus();
        }
    }
}
