package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzrn implements RemoteCall {
    public static final /* synthetic */ zzrn zza = new zzrn();

    private /* synthetic */ zzrn() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        zzqs zzqsVar = (zzqs) obj;
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
