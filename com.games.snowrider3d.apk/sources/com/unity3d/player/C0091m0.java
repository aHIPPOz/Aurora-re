package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
/* renamed from: com.unity3d.player.m0 */
/* loaded from: classes2.dex */
public final class C0091m0 extends UnityPlayer.a {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0093n0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091m0(C0093n0 c0093n0, boolean z) {
        super();
        this.c = c0093n0;
        this.b = z;
    }

    @Override // com.unity3d.player.UnityPlayer.a
    public final void a() {
        UnityPlayer.permissionResponseToNative(this.c.a, this.b);
    }
}
