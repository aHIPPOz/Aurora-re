package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzp implements RemoteCall {
    public static final /* synthetic */ zzp zza = new zzp();

    private /* synthetic */ zzp() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzex zzexVar = new zzex();
        zzexVar.zza(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzt(zzexVar.zzb());
    }
}
