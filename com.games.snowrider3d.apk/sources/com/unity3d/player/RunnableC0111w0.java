package com.unity3d.player;

import android.widget.EditText;
/* renamed from: com.unity3d.player.w0 */
/* loaded from: classes2.dex */
public final class RunnableC0111w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    public RunnableC0111w0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i, int i2) {
        this.c = unityPlayerForActivityOrService;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0112x abstractC0112x;
        int i;
        abstractC0112x = this.c.mSoftInput;
        if (abstractC0112x != null) {
            int i2 = this.a;
            int i3 = this.b;
            EditText editText = abstractC0112x.c;
            if (editText == null || editText.getText().length() < (i = i3 + i2)) {
                return;
            }
            abstractC0112x.c.setSelection(i2, i);
        }
    }
}
