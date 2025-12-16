package com.unity3d.player.a;

import android.window.OnBackInvokedCallback;
/* renamed from: com.unity3d.player.a.d */
/* loaded from: classes2.dex */
public final class C0048d implements OnBackInvokedCallback {
    public final /* synthetic */ C0064u a;

    public C0048d(C0064u c0064u) {
        this.a = c0064u;
    }

    public final void onBackInvoked() {
        Runnable runnable = this.a.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
