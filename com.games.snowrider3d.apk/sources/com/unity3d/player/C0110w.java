package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;
/* renamed from: com.unity3d.player.w */
/* loaded from: classes2.dex */
public final class C0110w implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC0112x a;

    public C0110w(AbstractC0112x abstractC0112x) {
        this.a = abstractC0112x;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC0112x abstractC0112x = this.a;
            abstractC0112x.a(abstractC0112x.a(), false);
        }
        return false;
    }
}
