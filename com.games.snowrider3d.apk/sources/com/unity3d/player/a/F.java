package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.M0;
/* loaded from: classes2.dex */
public final class F implements DialogInterface.OnCancelListener {
    public final /* synthetic */ com.unity3d.player.D a;

    public F(com.unity3d.player.D d) {
        this.a = d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        M0 m0 = this.a.f;
        if (m0 != null) {
            m0.a();
        }
    }
}
