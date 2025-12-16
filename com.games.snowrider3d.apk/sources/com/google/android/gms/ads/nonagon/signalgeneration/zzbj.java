package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdxp;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzhgr;
import com.google.android.gms.internal.ads.zzhha;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzbj implements zzhgr {
    private final zzhha zza;

    private zzbj(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar2;
    }

    public static zzbj zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzbj(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzbi zzb() {
        return new zzbi(zzffu.zzc(), ((zzdxp) this.zza).zzb());
    }
}
