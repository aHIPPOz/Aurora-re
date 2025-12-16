package com.unity3d.player;

import java.util.concurrent.Semaphore;
/* renamed from: com.unity3d.player.s0 */
/* loaded from: classes2.dex */
public final class RunnableC0103s0 implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ Semaphore c;
    public final /* synthetic */ UnityPlayerForActivityOrService d;
    public final /* synthetic */ UnityPlayerForActivityOrService e;

    public RunnableC0103s0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.e = unityPlayerForActivityOrService;
        this.c = semaphore;
        this.d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0112x abstractC0112x;
        AbstractC0112x abstractC0112x2;
        abstractC0112x = this.e.mSoftInput;
        if (abstractC0112x != null) {
            this.d.setOnHandleFocusListener(new C0099q0(this));
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.e;
            abstractC0112x2 = unityPlayerForActivityOrService.mSoftInput;
            abstractC0112x2.g = new C0101r0(this);
            unityPlayerForActivityOrService.dismissSoftInput();
        }
    }
}
