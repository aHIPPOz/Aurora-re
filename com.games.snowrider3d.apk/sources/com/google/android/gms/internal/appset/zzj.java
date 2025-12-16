package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.util.DefaultClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long zza = this.zza.zza();
        if (zza == -1 || DefaultClock.getInstance().currentTimeMillis() <= zza) {
            return;
        }
        context = this.zza.zzb;
        zzl.zze(context);
    }
}
