package com.unity3d.player;

import android.content.DialogInterface;
/* renamed from: com.unity3d.player.c0 */
/* loaded from: classes2.dex */
public final class DialogInterface$OnClickListenerC0071c0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UnityPlayer a;

    public DialogInterface$OnClickListenerC0071c0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
