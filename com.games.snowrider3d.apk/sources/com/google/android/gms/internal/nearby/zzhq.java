package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzhq implements RemoteCall {
    public static final /* synthetic */ zzhq zza = new zzhq();

    private /* synthetic */ zzhq() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        zzgy zzgyVar = (zzgy) obj;
        int i = zzih.zza;
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
