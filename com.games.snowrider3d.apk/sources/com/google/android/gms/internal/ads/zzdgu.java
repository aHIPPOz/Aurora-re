package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzdgu implements zzcrd {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhhg zzd;
    private final zzdje zze;

    public zzdgu(Map map, Map map2, Map map3, zzhhg zzhhgVar, zzdje zzdjeVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhhgVar;
        this.zze = zzdjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrd
    public final zzedm zza(int i, String str) {
        zzedm zzedmVar;
        zzedm zzedmVar2 = (zzedm) this.zza.get(str);
        if (zzedmVar2 != null) {
            return zzedmVar2;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzefv zzefvVar = (zzefv) this.zzc.get(str);
            if (zzefvVar != null) {
                return new zzedn(zzefvVar, new zzfve() { // from class: com.google.android.gms.internal.ads.zzcrf
                    @Override // com.google.android.gms.internal.ads.zzfve
                    public final Object apply(Object obj) {
                        return new zzcri((List) obj);
                    }
                });
            }
            zzedmVar = (zzedm) this.zzb.get(str);
            if (zzedmVar == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzedmVar = ((zzcrd) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzedn(zzedmVar, new zzfve() { // from class: com.google.android.gms.internal.ads.zzcrg
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                return new zzcri((zzcra) obj);
            }
        });
    }
}
