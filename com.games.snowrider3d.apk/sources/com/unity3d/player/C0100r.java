package com.unity3d.player;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.player.a.AbstractC0049e;
import com.unity3d.player.a.C0048d;
import com.unity3d.player.a.C0065v;
/* renamed from: com.unity3d.player.r */
/* loaded from: classes2.dex */
public final class C0100r extends C0065v {
    public C0048d d = null;
    public final OnBackInvokedDispatcher e;
    public final int f;

    public C0100r(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, Runnable runnable) {
        super(runnable);
        this.f = i;
        this.e = onBackInvokedDispatcher;
    }

    public static C0065v a(Object obj, int i, Runnable runnable) {
        C0065v c0065v;
        if (PlatformSupport.TIRAMISU_SUPPORT && ((obj instanceof Activity) || (obj instanceof Dialog))) {
            c0065v = new C0100r(AbstractC0049e.a(obj), i, runnable);
        } else {
            c0065v = new C0065v(runnable);
        }
        c0065v.registerOnBackPressedCallback();
        return c0065v;
    }

    @Override // com.unity3d.player.a.C0065v
    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        super.registerOnBackPressedCallback();
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            return;
        }
        C0048d c0048d = new C0048d(this.a);
        this.d = c0048d;
        AbstractC0049e.a(this.e, this.f, c0048d);
    }

    @Override // com.unity3d.player.a.C0065v
    public void unregisterOnBackPressedCallback() {
        if (this.a != null) {
            if (PlatformSupport.TIRAMISU_SUPPORT) {
                AbstractC0049e.a(this.e, this.d);
                this.d = null;
            }
            super.unregisterOnBackPressedCallback();
        }
    }
}
