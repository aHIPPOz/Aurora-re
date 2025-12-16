package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzdkt implements zzgdj {
    final /* synthetic */ zzdku zza;

    public zzdkt(zzdku zzdkuVar) {
        Objects.requireNonNull(zzdkuVar);
        this.zza = zzdkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    /* renamed from: zzc */
    public final void zzb(List list) {
        try {
            zzcfg zzcfgVar = (zzcfg) list.get(0);
            if (zzcfgVar == null) {
                return;
            }
            this.zza.zzb(zzcfgVar);
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfH)).booleanValue()) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "omid native display exp");
        }
    }
}
