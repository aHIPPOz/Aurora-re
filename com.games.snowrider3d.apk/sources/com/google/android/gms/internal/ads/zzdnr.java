package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdnr implements zzgdj {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    public zzdnr(zzdny zzdnyVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdnyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcfg) obj).zzd(this.zza, this.zzb);
    }
}
