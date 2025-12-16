package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdyv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdyv(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar3;
    }

    public static zzdyv zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzdyv(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    /* renamed from: zza */
    public final zzdyu zzb() {
        return new zzdyu(((zzhgy) this.zza).zzd(), zzffu.zzc(), ((zzcyz) this.zzb).zzb());
    }
}
