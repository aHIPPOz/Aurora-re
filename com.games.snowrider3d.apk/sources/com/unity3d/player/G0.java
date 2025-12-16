package com.unity3d.player;
/* loaded from: classes2.dex */
public final class G0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public G0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.nativeSendSurfaceChangedEvent();
    }
}
