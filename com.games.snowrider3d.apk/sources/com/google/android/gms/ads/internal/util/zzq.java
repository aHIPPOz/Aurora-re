package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzq extends BroadcastReceiver {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzr zzrVar) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.zza.zzf = true;
        } else if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
        } else {
            this.zza.zzf = false;
        }
    }
}
