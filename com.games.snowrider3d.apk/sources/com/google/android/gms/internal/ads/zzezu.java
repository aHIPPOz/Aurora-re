package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzezu implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzezu(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
        this.zzc = zzhhaVar3;
    }

    public static zzezu zzc(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzezu(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    /* renamed from: zza */
    public final zzezr zzb() {
        zzbzm zzbzmVar;
        zzezr zzezrVar;
        Context context = (Context) this.zza.zzb();
        zzfef zzfefVar = (zzfef) this.zzb.zzb();
        zzfex zzfexVar = (zzfex) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgA)).booleanValue()) {
            zzbzmVar = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        } else {
            zzbzmVar = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzh();
        }
        boolean z = false;
        if (zzbzmVar != null && zzbzmVar.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgC)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgz)).booleanValue() || z) {
                zzfew zza = zzfexVar.zza(zzfen.Rewarded, context, zzfefVar, new zzeyv(new zzeys()));
                zzezh zzezhVar = new zzezh(new zzezg());
                zzfej zzfejVar = zza.zza;
                zzgdy zzgdyVar = zzcaf.zza;
                zzezrVar = new zzeyx(zzezhVar, new zzezd(zzfejVar, zzgdyVar), zza.zzb, zzfejVar.zza().zzf, zzgdyVar);
                return zzezrVar;
            }
        }
        zzezrVar = new zzezg();
        return zzezrVar;
    }
}
