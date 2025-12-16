package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdrm implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdrm(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzdrm zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzdrm(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzdrl zzb() {
        return new zzdrl((zzbcc) this.zza.zzb(), ((zzhgv) this.zzb).zzb());
    }
}
