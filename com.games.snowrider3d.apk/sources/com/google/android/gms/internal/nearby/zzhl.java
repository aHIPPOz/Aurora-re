package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzhl implements OnFailureListener {
    public static final /* synthetic */ zzhl zza = new zzhl();

    private /* synthetic */ zzhl() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.w("NearbyConnections", "Failed to start discovery.", exc);
    }
}
