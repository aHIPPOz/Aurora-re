package com.unity3d.player;

import com.google.android.gms.tasks.OnSuccessListener;
/* renamed from: com.unity3d.player.e */
/* loaded from: classes2.dex */
public final class C0074e implements OnSuccessListener {
    public final IAssetPackManagerMobileDataConfirmationCallback a;
    public final UnityPlayer b;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback = this.a;
        if (iAssetPackManagerMobileDataConfirmationCallback != null) {
            this.b.invokeOnMainThread(new RunnableC0072d(iAssetPackManagerMobileDataConfirmationCallback, num.intValue() == -1));
        }
    }

    public C0074e(UnityPlayer unityPlayer, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
    }
}
