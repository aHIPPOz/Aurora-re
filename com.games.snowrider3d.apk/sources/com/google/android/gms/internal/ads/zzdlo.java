package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdlo implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdlo(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3, zzhha zzhhaVar4) {
        this.zza = zzhhaVar2;
        this.zzb = zzhhaVar3;
        this.zzc = zzhhaVar4;
    }

    public static zzdlo zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3, zzhha zzhhaVar4) {
        return new zzdlo(zzhhaVar, zzhhaVar2, zzhhaVar3, zzhhaVar4);
    }

    /* renamed from: zza */
    public final zzdln zzb() {
        return new zzdln(zzffu.zzc(), ((zzdmd) this.zza).zzb(), ((zzdmi) this.zzb).zzb(), (zzdsd) this.zzc.zzb());
    }
}
