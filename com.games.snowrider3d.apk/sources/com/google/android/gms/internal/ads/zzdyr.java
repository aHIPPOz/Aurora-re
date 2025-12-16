package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdyr implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdyr(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzdyr zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzdyr(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzdyq zzb() {
        return new zzdyq(((zzchl) this.zza).zza(), (zzbyo) this.zzb.zzb());
    }
}
