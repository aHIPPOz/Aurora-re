package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdov implements zzhgr {
    private final zzhha zza;

    private zzdov(zzhha zzhhaVar) {
        this.zza = zzhhaVar;
    }

    public static zzdov zza(zzhha zzhhaVar) {
        return new zzdov(zzhhaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbcj.zza.EnumC0004zza enumC0004zza;
        if (((zzcvp) this.zza).zzc().zzo.zza == 3) {
            enumC0004zza = zzbcj.zza.EnumC0004zza.REWARDED_INTERSTITIAL;
        } else {
            enumC0004zza = zzbcj.zza.EnumC0004zza.REWARD_BASED_VIDEO_AD;
        }
        zzhgz.zzb(enumC0004zza);
        return enumC0004zza;
    }
}
