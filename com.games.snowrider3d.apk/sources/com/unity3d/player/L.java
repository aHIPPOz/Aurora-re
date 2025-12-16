package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class L extends UnityPlayer.a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(UnityPlayer unityPlayer, int i) {
        super();
        this.b = i;
        Objects.requireNonNull(unityPlayer);
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        UnityAccessibilityDelegate.onNodeDismissed(this.b);
    }
}
