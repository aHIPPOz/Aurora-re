package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
/* loaded from: classes2.dex */
public final class B extends EditText {
    public final /* synthetic */ AbstractC0112x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Context context, AbstractC0112x abstractC0112x) {
        super(context);
        this.a = abstractC0112x;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC0112x abstractC0112x = this.a;
                abstractC0112x.a(abstractC0112x.a(), false);
            }
            return true;
        } else if (i == 84) {
            return true;
        } else {
            if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
                AbstractC0112x abstractC0112x2 = this.a;
                abstractC0112x2.a(abstractC0112x2.a(), false);
                return true;
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            AbstractC0112x abstractC0112x = this.a;
            abstractC0112x.a(abstractC0112x.a(), false);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }
}
