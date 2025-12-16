package com.unity3d.player;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class E implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ UnityAccessibilityDelegate b;

    public E(UnityAccessibilityDelegate unityAccessibilityDelegate, Semaphore semaphore) {
        this.b = unityAccessibilityDelegate;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccessibilityManager accessibilityManager;
        CaptioningManager captioningManager;
        try {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.b;
            accessibilityManager = unityAccessibilityDelegate.c;
            if (accessibilityManager != null) {
                unityAccessibilityDelegate.d = new O(unityAccessibilityDelegate);
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.b;
            captioningManager = unityAccessibilityDelegate2.e;
            if (captioningManager != null) {
                unityAccessibilityDelegate2.f = new Q(this.b);
            }
        } finally {
            this.a.release();
        }
    }
}
