package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public final class C extends AbstractC0112x {
    public boolean h = false;
    public Handler i;
    public A j;

    @Override // com.unity3d.player.AbstractC0112x
    public final boolean c() {
        return false;
    }

    public C(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC0112x
    public final void d() {
        if (this.h) {
            return;
        }
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.addView(this.c);
        frameLayout.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new A(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }

    @Override // com.unity3d.player.AbstractC0112x
    public final void b() {
        A a;
        Handler handler = this.i;
        if (handler != null && (a = this.j) != null) {
            handler.removeCallbacks(a);
        }
        this.b.getFrameLayout().removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC0112x
    public EditText createEditText(AbstractC0112x abstractC0112x) {
        return new B(this.a, abstractC0112x);
    }

    @Override // com.unity3d.player.AbstractC0112x
    public final void a(boolean z) {
        this.d = z;
        if (z) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
        }
        this.c.invalidate();
        this.c.requestLayout();
    }
}
