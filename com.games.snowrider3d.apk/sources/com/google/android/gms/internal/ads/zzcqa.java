package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcqa implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcqa(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        this.zza = zzhhaVar2;
        this.zzb = zzhhaVar3;
    }

    public static zzcqa zza(zzhha zzhhaVar, zzhha zzhhaVar2, zzhha zzhhaVar3) {
        return new zzcqa(zzhhaVar, zzhhaVar2, zzhhaVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    public final /* synthetic */ Object zzb() {
        boolean booleanValue = Boolean.valueOf(zzcpy.zza()).booleanValue();
        zzegt zzb = ((zzegu) this.zza).zzb();
        zzeit zzb2 = ((zzeiu) this.zzb).zzb();
        if (true != booleanValue) {
            zzb = zzb2;
        }
        return zzb;
    }
}
