package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* loaded from: classes2.dex */
public class r {
    public final ConnectivityManager a;

    public void a() {
    }

    public r(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = connectivityManager;
        if (connectivityManager == null) {
            AbstractC0061q.Log(6, "NetworkConnectivity: ConnectivityManager not found");
        }
    }

    public int b() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = this.a.getNetworkCapabilities(activeNetwork)) == null) {
            return 0;
        }
        return networkCapabilities.hasTransport(0) ? 1 : 2;
    }
}
