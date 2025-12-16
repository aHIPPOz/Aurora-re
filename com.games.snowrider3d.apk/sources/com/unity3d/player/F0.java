package com.unity3d.player;

import android.content.res.Configuration;
/* loaded from: classes2.dex */
public final class F0 implements Runnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public F0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Configuration configuration) {
        this.b = unityPlayerForActivityOrService;
        this.a = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.nativeConfigurationChanged(this.a);
    }
}
