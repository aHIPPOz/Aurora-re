package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzo implements RemoteCall {
    public static final /* synthetic */ zzo zza = new zzo();

    private /* synthetic */ zzo() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        int i = zzax.zza;
        zzel zzelVar = new zzel();
        zzelVar.zza(new zzao((TaskCompletionSource) obj2));
        ((zzdr) ((zzn) obj).getService()).zzq(zzelVar.zzb());
    }
}
