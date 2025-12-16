package com.unity3d.player;

import android.content.Context;
import android.widget.EditText;
/* loaded from: classes2.dex */
public final class D extends AbstractC0112x {
    public DialogC0115z h;

    @Override // com.unity3d.player.AbstractC0112x
    public final void a(boolean z) {
        this.d = z;
        this.h.a(z);
    }

    public D(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }

    @Override // com.unity3d.player.AbstractC0112x
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        DialogC0115z dialogC0115z = new DialogC0115z(this.a, this.b);
        this.h = dialogC0115z;
        dialogC0115z.a(this, z5, z6);
        this.h.setOnDismissListener(new com.unity3d.player.a.D(this));
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        a(z5);
        this.b.getFrameLayout().getViewTreeObserver().addOnGlobalLayoutListener(new com.unity3d.player.a.E(this));
        this.c.requestFocus();
        this.h.setOnCancelListener(new com.unity3d.player.a.F(this));
    }

    public void reportSoftInputArea() {
        if (this.h.isShowing()) {
            this.b.reportSoftInputArea(this.h.a());
        }
    }

    @Override // com.unity3d.player.AbstractC0112x
    public final void d() {
        this.h.show();
    }

    @Override // com.unity3d.player.AbstractC0112x
    public final void b() {
        this.h.dismiss();
    }

    @Override // com.unity3d.player.AbstractC0112x
    public EditText createEditText(AbstractC0112x abstractC0112x) {
        return new com.unity3d.player.a.G(this, this.a, abstractC0112x);
    }
}
