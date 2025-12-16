package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzch extends BroadcastReceiver {
    final /* synthetic */ zzci zza;

    public zzch(zzci zzciVar) {
        Objects.requireNonNull(zzciVar);
        this.zza = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
