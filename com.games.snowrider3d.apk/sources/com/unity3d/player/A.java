package com.unity3d.player;
/* loaded from: classes2.dex */
public final class A implements Runnable {
    public final /* synthetic */ C a;

    public A(C c) {
        this.a = c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.e();
    }
}
