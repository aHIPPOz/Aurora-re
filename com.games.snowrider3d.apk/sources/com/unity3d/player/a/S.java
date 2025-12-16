package com.unity3d.player.a;

import android.widget.FrameLayout;
import com.unity3d.player.W0;
/* loaded from: classes2.dex */
public final class S implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ W h;

    public S(W w, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        this.h = w;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W w = this.h;
        if (w.f != null) {
            AbstractC0061q.Log(5, "Video already playing");
            W w2 = this.h;
            w2.g = 2;
            w2.d.release();
            return;
        }
        W w3 = this.h;
        w.f = new W0(w3.b, w3.a, this.a, this.b, this.c, this.d, this.e, this.f, this.g, new Q(this));
        W w4 = this.h;
        if (w4.f == null) {
            return;
        }
        FrameLayout frameLayout = w4.a.getFrameLayout();
        frameLayout.bringToFront();
        frameLayout.addView(this.h.f);
    }
}
