package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;
/* renamed from: com.unity3d.player.a.t */
/* loaded from: classes2.dex */
public final class C0063t extends r {
    public int b;
    public final C0062s c;

    public C0063t(Context context) {
        super(context);
        this.b = 0;
        C0062s c0062s = new C0062s(this);
        this.c = c0062s;
        if (this.a == null) {
            return;
        }
        this.b = super.b();
        this.a.registerDefaultNetworkCallback(c0062s);
    }

    @Override // com.unity3d.player.a.r
    public final int b() {
        return this.b;
    }

    @Override // com.unity3d.player.a.r
    public final void a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }
}
