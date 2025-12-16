package com.unity3d.player;

import android.view.accessibility.CaptioningManager;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class Q extends CaptioningManager.CaptioningChangeListener {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public Q(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        CaptioningManager captioningManager;
        CaptioningManager captioningManager2;
        this.a = unityAccessibilityDelegate;
        captioningManager = unityAccessibilityDelegate.e;
        captioningManager.addCaptioningChangeListener(this);
        captioningManager2 = unityAccessibilityDelegate.e;
        onEnabledChanged(captioningManager2.isEnabled());
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onEnabledChanged(boolean z) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        unityPlayer = this.a.a;
        Objects.requireNonNull(unityPlayer);
        P p = new P(unityPlayer, z);
        unityPlayer2 = this.a.a;
        unityPlayer2.invokeOnMainThread((Runnable) p);
    }

    public void cleanup() {
        CaptioningManager captioningManager;
        captioningManager = this.a.e;
        captioningManager.removeCaptioningChangeListener(this);
    }
}
