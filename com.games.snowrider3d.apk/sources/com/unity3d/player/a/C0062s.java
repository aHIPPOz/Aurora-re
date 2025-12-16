package com.unity3d.player.a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* renamed from: com.unity3d.player.a.s */
/* loaded from: classes2.dex */
public final class C0062s extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0063t a;

    public C0062s(C0063t c0063t) {
        this.a = c0063t;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasTransport(0)) {
            this.a.b = 1;
        } else {
            this.a.b = 2;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        this.a.b = 0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.a.b = 0;
    }
}
