package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcnv implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcnv(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar3;
    }

    public static zzcnv zza(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzcnv(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzcnn zzcnnVar = (zzcnn) this.zza.zzb();
        zzgdy zzc = zzffu.zzc();
        if (((JSONObject) this.zzb.zzb()) == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzddv(zzcnnVar, zzc));
        }
        zzhgz.zzb(set);
        return set;
    }
}
