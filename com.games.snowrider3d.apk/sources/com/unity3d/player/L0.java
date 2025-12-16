package com.unity3d.player;

import android.view.ViewGroup;
import com.unity3d.player.a.C0050f;
/* loaded from: classes2.dex */
public final class L0 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public L0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, float f) {
        this.b = unityPlayerForActivityOrService;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T view = this.b.getView();
        if (view != null) {
            float f = this.a;
            C0050f c0050f = view.a;
            c0050f.a = f;
            ViewGroup.LayoutParams layoutParams = c0050f.getLayoutParams();
            if (f <= 0.0f) {
                layoutParams.width = -1;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            c0050f.setLayoutParams(layoutParams);
        }
    }
}
