package com.unity3d.player;
/* renamed from: com.unity3d.player.f0 */
/* loaded from: classes2.dex */
public final class RunnableC0077f0 implements Runnable {
    public final /* synthetic */ PermissionRequest a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int[] c;

    public RunnableC0077f0(PermissionRequest permissionRequest, String[] strArr, int[] iArr) {
        this.a = permissionRequest;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.permissionResponse(this.b, this.c);
    }
}
