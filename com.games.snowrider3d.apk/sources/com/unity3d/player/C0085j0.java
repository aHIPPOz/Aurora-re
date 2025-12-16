package com.unity3d.player;

import android.content.Context;
import android.view.OrientationEventListener;
/* renamed from: com.unity3d.player.j0 */
/* loaded from: classes2.dex */
public final class C0085j0 extends OrientationEventListener {
    public final /* synthetic */ UnityPlayer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085j0(UnityPlayer unityPlayer, Context context, int i) {
        super(context, i);
        this.a = unityPlayer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        UnityPlayer unityPlayer = this.a;
        unityPlayer.onOrientationChanged(unityPlayer.mNaturalOrientation, i);
    }
}
