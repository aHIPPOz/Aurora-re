package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzvb extends zzbl {
    private final zzap zzb;

    public zzvb(zzap zzapVar) {
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zza(Object obj) {
        return obj == zzva.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i, zzbj zzbjVar, boolean z) {
        Object obj = null;
        Integer num = z ? 0 : null;
        if (z) {
            obj = zzva.zzc;
        }
        zzbjVar.zzi(num, obj, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final zzbk zze(int i, zzbk zzbkVar, long j) {
        zzbkVar.zza(zzbk.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbkVar.zzk = true;
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final Object zzf(int i) {
        return zzva.zzc;
    }
}
