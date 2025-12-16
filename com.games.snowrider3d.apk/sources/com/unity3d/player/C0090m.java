package com.unity3d.player;

import android.graphics.SurfaceTexture;
/* renamed from: com.unity3d.player.m */
/* loaded from: classes2.dex */
public final class C0090m implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0094o a;

    public C0090m(C0094o c0094o) {
        this.a = c0094o;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.a.a).a(surfaceTexture);
    }
}
