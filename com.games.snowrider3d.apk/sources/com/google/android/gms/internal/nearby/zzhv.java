package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzhv implements RemoteCall {
    public static final /* synthetic */ zzhv zza = new zzhv();

    private /* synthetic */ zzhv() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        int i = zzih.zza;
        ((zzgy) obj).zzD();
        ((TaskCompletionSource) obj2).setResult(true);
    }
}
