package com.unity3d.player.a;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
public final class D implements DialogInterface.OnDismissListener {
    public final /* synthetic */ com.unity3d.player.D a;

    public D(com.unity3d.player.D d) {
        this.a = d;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
