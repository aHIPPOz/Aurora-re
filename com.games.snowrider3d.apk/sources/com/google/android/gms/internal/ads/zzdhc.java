package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdhc implements zzhgr {
    private final zzhha zza;

    private zzdhc(zzhha zzhhaVar) {
        this.zza = zzhhaVar;
    }

    public static zzdhc zza(zzhha zzhhaVar) {
        return new zzdhc(zzhhaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdgz) this.zza).zzc().zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzhgz.zzb(set);
        return set;
    }
}
