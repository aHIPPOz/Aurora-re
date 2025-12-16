package com.unity3d.player;

import android.view.View;
import android.view.WindowInsets;
/* loaded from: classes2.dex */
public final class C0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public C0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.invokeOnMainThread((Runnable) new C0097p0(this, windowInsets));
        return windowInsets;
    }
}
