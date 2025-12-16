package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.unity3d.player.AbstractC0112x;
/* loaded from: classes2.dex */
public final class G extends EditText {
    public final /* synthetic */ AbstractC0112x a;
    public final /* synthetic */ com.unity3d.player.D b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(com.unity3d.player.D d, Context context, AbstractC0112x abstractC0112x) {
        super(context);
        this.b = d;
        this.a = abstractC0112x;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C0065v c0065v;
        C0064u c0064u;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (c0065v = this.b.h.e) != null && (c0064u = c0065v.a) != null && (runnable = c0064u.a) != null) {
                runnable.run();
            }
            return true;
        } else if (i == 84) {
            return true;
        } else {
            if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
                AbstractC0112x abstractC0112x = this.a;
                abstractC0112x.a(abstractC0112x.a(), false);
                return true;
            } else if (i == 111 && keyEvent.getAction() == 0) {
                AbstractC0112x abstractC0112x2 = this.a;
                abstractC0112x2.a(abstractC0112x2.a(), true);
                return true;
            } else {
                return super.onKeyPreIme(i, keyEvent);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.a.e();
        }
    }
}
