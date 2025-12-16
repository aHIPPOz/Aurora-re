package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC0047c;
import com.unity3d.player.a.AbstractC0061q;
/* renamed from: com.unity3d.player.b0 */
/* loaded from: classes2.dex */
public final class RunnableC0069b0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC0047c.b;
            if (progressBar == null) {
                return;
            }
            if (AbstractC0047c.c != null) {
                ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(AbstractC0047c.b);
                    viewGroup.removeView(AbstractC0047c.c);
                }
                AbstractC0047c.b = null;
                AbstractC0047c.c = null;
            }
            AbstractC0047c.d = -1;
        } catch (Exception e) {
            AbstractC0061q.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
