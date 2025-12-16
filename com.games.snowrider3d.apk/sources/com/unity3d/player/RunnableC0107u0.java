package com.unity3d.player;

import android.text.InputFilter;
import android.widget.EditText;
/* renamed from: com.unity3d.player.u0 */
/* loaded from: classes2.dex */
public final class RunnableC0107u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0107u0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i) {
        this.b = unityPlayerForActivityOrService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0112x abstractC0112x;
        abstractC0112x = this.b.mSoftInput;
        if (abstractC0112x != null) {
            int i = this.a;
            EditText editText = abstractC0112x.c;
            if (editText == null) {
                return;
            }
            if (i > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }
}
