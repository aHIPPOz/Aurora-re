package com.unity3d.player.a;

import android.view.ViewTreeObserver;
/* loaded from: classes2.dex */
public final class E implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ com.unity3d.player.D a;

    public E(com.unity3d.player.D d) {
        this.a = d;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
    }
}
