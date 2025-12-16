package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbbs extends zzcak {
    final /* synthetic */ zzbby zza;

    public zzbbs(zzbby zzbbyVar) {
        Objects.requireNonNull(zzbbyVar);
        this.zza = zzbbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcak, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzbby.zze(this.zza);
        return super.cancel(z);
    }
}
