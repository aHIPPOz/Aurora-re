package com.unity3d.player.a;

import android.app.Activity;
import android.app.Dialog;
import android.window.OnBackInvokedDispatcher;
/* renamed from: com.unity3d.player.a.e */
/* loaded from: classes2.dex */
public abstract class AbstractC0049e {
    public static OnBackInvokedDispatcher a(Object obj) {
        if (obj instanceof Activity) {
            return ((Activity) obj).getOnBackInvokedDispatcher();
        }
        if (obj instanceof Dialog) {
            return ((Dialog) obj).getOnBackInvokedDispatcher();
        }
        throw new IllegalArgumentException("Unsupported context type when getting '" + obj.getClass().getName() + "' OnBackInvokedDispatcher");
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, C0048d c0048d) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, c0048d);
    }

    public static void a(OnBackInvokedDispatcher onBackInvokedDispatcher, C0048d c0048d) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(c0048d);
    }
}
