package com.unity3d.player;
/* renamed from: com.unity3d.player.v0 */
/* loaded from: classes2.dex */
public final class RunnableC0109v0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0109v0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        this.b = unityPlayerForActivityOrService;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0112x abstractC0112x;
        abstractC0112x = this.b.mSoftInput;
        if (abstractC0112x != null) {
            abstractC0112x.a(this.a);
        }
    }
}
