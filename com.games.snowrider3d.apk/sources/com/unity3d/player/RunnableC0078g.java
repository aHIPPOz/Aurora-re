package com.unity3d.player;
/* renamed from: com.unity3d.player.g */
/* loaded from: classes2.dex */
public final class RunnableC0078g implements Runnable {
    public final IAssetPackManagerStatusQueryCallback a;
    public final long b;
    public final String[] c;
    public final int[] d;
    public final int[] e;

    public RunnableC0078g(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, String[] strArr, int[] iArr, int[] iArr2) {
        this.a = iAssetPackManagerStatusQueryCallback;
        this.b = j;
        this.c = strArr;
        this.d = iArr;
        this.e = iArr2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onStatusResult(this.b, this.c, this.d, this.e);
    }
}
