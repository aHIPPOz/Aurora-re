package com.unity3d.player;

import android.view.SurfaceView;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.player.UnityAccessibilityDelegate;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class O implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    public O(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        this.a = unityAccessibilityDelegate;
        accessibilityManager = unityAccessibilityDelegate.c;
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager2 = unityAccessibilityDelegate.c;
        accessibilityManager2.addTouchExplorationStateChangeListener(this);
        accessibilityManager3 = unityAccessibilityDelegate.c;
        if (accessibilityManager3.isEnabled()) {
            onAccessibilityStateChanged(true);
        }
    }

    public void cleanup() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        accessibilityManager = this.a.c;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager2 = this.a.c;
        accessibilityManager2.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        SurfaceView surfaceView4;
        AccessibilityManager accessibilityManager;
        if (z) {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.a;
            surfaceView3 = unityAccessibilityDelegate.b;
            surfaceView3.setAccessibilityDelegate(unityAccessibilityDelegate);
            surfaceView4 = this.a.b;
            surfaceView4.setWillNotDraw(false);
            accessibilityManager = this.a.c;
            onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            return;
        }
        surfaceView = this.a.b;
        surfaceView.setAccessibilityDelegate(null);
        surfaceView2 = this.a.b;
        surfaceView2.setWillNotDraw(true);
        onTouchExplorationStateChanged(false);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        AccessibilityManager accessibilityManager;
        boolean z2;
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        SurfaceView surfaceView;
        SurfaceView surfaceView2;
        accessibilityManager = this.a.c;
        boolean z3 = accessibilityManager.isEnabled() && z;
        if (z3) {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.a;
            surfaceView2 = unityAccessibilityDelegate.b;
            surfaceView2.setOnHoverListener(new UnityAccessibilityDelegate.a());
        } else {
            surfaceView = this.a.b;
            surfaceView.setOnHoverListener(null);
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.a;
        z2 = unityAccessibilityDelegate2.i;
        if (z2 == z3) {
            return;
        }
        unityAccessibilityDelegate2.i = z3;
        unityPlayer = unityAccessibilityDelegate2.a;
        Objects.requireNonNull(unityPlayer);
        N n = new N(unityPlayer, z3);
        unityPlayer2 = this.a.a;
        unityPlayer2.invokeOnMainThread((Runnable) n);
    }
}
