package com.unity3d.player;
/* renamed from: com.unity3d.player.v */
/* loaded from: classes2.dex */
public final class RunnableC0108v implements Runnable {
    public final long a;
    public final long b;

    public RunnableC0108v(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!ReflectionHelper.beginProxyCall(this.a)) {
            return;
        }
        try {
            ReflectionHelper.nativeProxyFinalize(this.b);
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }
}
