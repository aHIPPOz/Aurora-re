package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzffs implements zzhgr {
    public static zzffs zza() {
        return zzffr.zza;
    }

    public static zzgdy zzc() {
        zzgdy zzgdyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfZ)).booleanValue()) {
            zzgdyVar = zzcaf.zzc;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfY)).booleanValue()) {
                zzgdyVar = zzcaf.zza;
            } else {
                zzgdyVar = zzcaf.zzf;
            }
        }
        zzhgz.zzb(zzgdyVar);
        return zzgdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
