package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class J extends UnityPlayer.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ M c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m, UnityPlayer unityPlayer, int i) {
        super();
        this.c = m;
        this.b = i;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        boolean onNodeSelected;
        onNodeSelected = UnityAccessibilityDelegate.onNodeSelected(this.b);
        if (onNodeSelected) {
            this.c.a.sendEventForVirtualViewId(this.b, 1);
        }
    }
}
