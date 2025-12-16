package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzyf extends zzyp implements Comparable {
    private final int zze;
    private final int zzf = this.zzd.zza();

    public zzyf(int i, zzbm zzbmVar, int i2, zzyi zzyiVar, int i3) {
        super(i, zzbmVar, i2);
        this.zze = zzmb.zza(i3, zzyiVar.zzR) ? 1 : 0;
    }

    /* renamed from: zza */
    public final int compareTo(zzyf zzyfVar) {
        return Integer.compare(this.zzf, zzyfVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        zzyf zzyfVar = (zzyf) zzypVar;
        return false;
    }
}
