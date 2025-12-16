package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdxi implements zzhgr {
    private final zzhha zza;

    private zzdxi(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
    }

    public static zzdxi zza(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzdxi(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zzc */
    public final zzdye zzb() {
        return new zzdye((Context) this.zza.zzb(), zzffu.zzc());
    }
}
