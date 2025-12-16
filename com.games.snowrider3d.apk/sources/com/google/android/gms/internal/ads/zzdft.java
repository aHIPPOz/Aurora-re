package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdft implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdft(zzdff zzdffVar, zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzdft zzc(zzdff zzdffVar, zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzdft(zzdffVar, zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzbyk zzb() {
        return new zzbyk(((zzchl) this.zza).zza(), ((zzcvp) this.zzb).zzc().zzf);
    }
}
