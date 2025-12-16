package com.unity3d.player.a;

import com.unity3d.player.C0081h0;
import com.unity3d.player.W0;
/* loaded from: classes2.dex */
public final class P implements Runnable {
    public final /* synthetic */ Q a;

    public P(Q q) {
        this.a = q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W w = this.a.a.h;
        W0 w0 = w.f;
        if (w0 != null) {
            w.a.removeViewFromPlayer(w0);
            w.i = false;
            w.f.destroyPlayer();
            w.f = null;
            C0081h0 c0081h0 = w.c;
            if (c0081h0 != null) {
                c0081h0.a();
            }
        }
        this.a.a.h.a.onResume();
    }
}
