package com.unity3d.player;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.unity3d.player.a.C0050f;
/* loaded from: classes2.dex */
public final class T extends FrameLayout {
    public final C0050f a;
    public final UnityPlayerForActivityOrService b;
    public final com.unity3d.player.a.A c;

    public T(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(unityPlayerForActivityOrService.getContext());
        Context context = unityPlayerForActivityOrService.getContext();
        this.c = new com.unity3d.player.a.A(context);
        this.b = unityPlayerForActivityOrService;
        C0050f c0050f = new C0050f(unityPlayerForActivityOrService);
        this.a = c0050f;
        c0050f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        unityPlayerForActivityOrService.applySurfaceViewSettings(c0050f);
        c0050f.getHolder().addCallback(new S(this));
        c0050f.setFocusable(true);
        c0050f.setFocusableInTouchMode(true);
        c0050f.setContentDescription(context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", TypedValues.Custom.S_STRING, context.getPackageName())));
        addView(c0050f, new FrameLayout.LayoutParams(-1, -1, 17));
    }
}
