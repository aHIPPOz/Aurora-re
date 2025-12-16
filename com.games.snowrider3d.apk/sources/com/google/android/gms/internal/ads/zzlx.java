package com.google.android.gms.internal.ads;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzlx extends zzuv {
    private final zzbk zzc = new zzbk();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlx(zzly zzlyVar, zzbl zzblVar) {
        super(zzblVar);
        Objects.requireNonNull(zzlyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i, zzbj zzbjVar, boolean z) {
        zzbl zzblVar = this.zzb;
        zzbj zzd = zzblVar.zzd(i, zzbjVar, z);
        if (zzblVar.zze(zzd.zzc, this.zzc, 0L).zzb()) {
            Object obj = zzbjVar.zza;
            Object obj2 = zzbjVar.zzb;
            int i2 = zzbjVar.zzc;
            long j = zzbjVar.zzd;
            long j2 = zzbjVar.zze;
            zzd.zzi(obj, obj2, i2, j, 0L, zzb.zza, true);
            return zzd;
        }
        zzd.zzf = true;
        return zzd;
    }
}
