package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzmn extends zzml {
    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ int zza(Object obj) {
        return ((zzmm) obj).zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzmm) obj).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ Object zzc(Object obj) {
        return ((zzkc) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        zzmm zzmmVar = (zzmm) obj2;
        return zzmmVar.equals(zzmm.zzc()) ? obj : zzmm.zzd((zzmm) obj, zzmmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ Object zze() {
        return zzmm.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, long j) {
        ((zzmm) obj).zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final void zzg(Object obj) {
        ((zzkc) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzkc) obj).zzc = (zzmm) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzml
    public final /* synthetic */ void zzi(Object obj, zznd zzndVar) throws IOException {
        ((zzmm) obj).zzi(zzndVar);
    }
}
