package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcri implements zzehc {
    public final List zza;

    public zzcri(zzcra zzcraVar) {
        this.zza = Collections.singletonList(zzgdn.zzh(zzcraVar));
    }

    public zzcri(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final void zzr() {
        for (ListenableFuture listenableFuture : this.zza) {
            zzgdn.zzr(listenableFuture, new zzcrh(this), zzgef.zzc());
        }
    }
}
