package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcbw implements Runnable {
    public zzcbw(zzcby zzcbyVar) {
        Objects.requireNonNull(zzcbyVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
