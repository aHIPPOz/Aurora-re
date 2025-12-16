package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdwv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdwv(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3, zzhha zzhhaVar4) {
        this.zza = zzhhaVar3;
        this.zzb = zzhhaVar4;
    }

    public static zzdwv zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3, zzhha zzhhaVar4) {
        return new zzdwv(zzhhaVar, zzhhaVar2, zzhhaVar3, zzhhaVar4);
    }

    /* renamed from: zza */
    public final zzdwu zzb() {
        return new zzdwu(zzfga.zzc(), zzffu.zzc(), ((zzdxi) this.zza).zzb(), zzhgq.zza(this.zzb));
    }
}
