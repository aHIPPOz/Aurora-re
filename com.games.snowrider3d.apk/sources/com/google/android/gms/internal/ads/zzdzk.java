package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdzk implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdzk(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar2;
        this.zzb = zzhhaVar3;
    }

    public static zzdzk zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzdzk(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    /* renamed from: zza */
    public final zzdzj zzb() {
        return new zzdzj(zzffu.zzc(), ((zzdyp) this.zza).zzb(), zzhgq.zza(this.zzb));
    }
}
