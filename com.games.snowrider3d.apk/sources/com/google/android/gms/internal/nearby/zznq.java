package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.StatusCallback;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
final class zznq extends zznp {
    final /* synthetic */ boolean zza;

    public zznq(zznr zznrVar, boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((StatusCallback) obj).onPermissionChanged(this.zza);
    }
}
