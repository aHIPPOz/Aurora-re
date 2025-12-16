package com.unity3d.player.a;
/* renamed from: com.unity3d.player.a.v */
/* loaded from: classes2.dex */
public class C0065v {
    public final Runnable b;
    public C0064u a = null;
    public boolean c = true;

    public C0065v(Runnable runnable) {
        this.b = runnable;
    }

    public void unregisterOnBackPressedCallback() {
        this.a = null;
    }

    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        this.a = new C0064u(this.b);
    }
}
