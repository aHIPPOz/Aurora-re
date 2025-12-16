package com.unity3d.player;

import java.util.Set;
/* renamed from: com.unity3d.player.b */
/* loaded from: classes2.dex */
public final class RunnableC0068b implements Runnable {
    public final Set a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;

    public RunnableC0068b(Set set, String str, int i, long j, long j2, int i2, int i3) {
        this.a = set;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback : this.a) {
            iAssetPackManagerDownloadStatusCallback.onStatusUpdate(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
