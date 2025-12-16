package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzflb implements Runnable {
    final /* synthetic */ zzfld zza;

    public zzflb(zzfld zzfldVar) {
        Objects.requireNonNull(zzfldVar);
        this.zza = zzfldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI();
    }
}
