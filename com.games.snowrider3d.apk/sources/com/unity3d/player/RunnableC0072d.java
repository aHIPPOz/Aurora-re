package com.unity3d.player;
/* renamed from: com.unity3d.player.d */
/* loaded from: classes2.dex */
public final class RunnableC0072d implements Runnable {
    public final IAssetPackManagerMobileDataConfirmationCallback a;
    public final boolean b;

    public RunnableC0072d(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onMobileDataConfirmationResult(this.b);
    }
}
