package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzboa implements zzcao {
    final /* synthetic */ zzboc zza;

    public zzboa(zzboc zzbocVar) {
        Objects.requireNonNull(zzbocVar);
        this.zza = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcao
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzboh zzbohVar;
        zzboj zzbojVar = (zzboj) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbohVar = this.zza.zzb;
        zzbohVar.zzd();
    }
}
