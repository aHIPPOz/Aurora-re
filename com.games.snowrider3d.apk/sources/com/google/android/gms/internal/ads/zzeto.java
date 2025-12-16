package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeto implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeto(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar3;
    }

    public static zzeto zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzeto(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    /* renamed from: zza */
    public final zzetm zzb() {
        return new zzetm((zzbyo) this.zza.zzb(), zzffu.zzc(), ((zzchl) this.zzb).zza());
    }
}
