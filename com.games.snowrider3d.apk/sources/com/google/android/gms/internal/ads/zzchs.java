package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzchs implements zzhgr {
    private final zzhha zza;

    private zzchs(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
    }

    public static zzchs zza(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzchs(zzhhaVar, zzhhaVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzdup zzdupVar = (zzdup) this.zza.zzb();
        zzgdy zzc = zzffu.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbP)).booleanValue()) {
            set = Collections.singleton(new zzddv(zzdupVar, zzc));
        } else {
            set = Collections.emptySet();
        }
        zzhgz.zzb(set);
        return set;
    }
}
