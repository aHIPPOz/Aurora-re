package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcpv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzcpv(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
        this.zzc = zzhhaVar3;
    }

    public static zzcpv zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzcpv(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    /* renamed from: zza */
    public final zzcpu zzb() {
        return new zzcpu(((zzcpq) this.zza).zza(), (zzdsj) this.zzb.zzb(), ((zzcrr) this.zzc).zzc());
    }
}
