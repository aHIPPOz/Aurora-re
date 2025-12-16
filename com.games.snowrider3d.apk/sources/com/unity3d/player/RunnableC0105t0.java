package com.unity3d.player;

import android.widget.EditText;
/* renamed from: com.unity3d.player.t0 */
/* loaded from: classes2.dex */
public final class RunnableC0105t0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0105t0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0112x abstractC0112x;
        String str;
        EditText editText;
        abstractC0112x = this.b.mSoftInput;
        if (abstractC0112x == null || (str = this.a) == null || (editText = abstractC0112x.c) == null) {
            return;
        }
        editText.setText(str);
        abstractC0112x.c.setSelection(str.length());
    }
}
