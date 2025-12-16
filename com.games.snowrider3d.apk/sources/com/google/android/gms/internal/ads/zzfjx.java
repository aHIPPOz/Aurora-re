package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfjx implements zzgdj {
    final /* synthetic */ zzfhj zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzcyi zzc;
    final /* synthetic */ zzfjy zzd;

    public zzfjx(zzfjy zzfjyVar, zzfhj zzfhjVar, zzfhu zzfhuVar, zzcyi zzcyiVar) {
        this.zza = zzfhjVar;
        this.zzb = zzfhuVar;
        this.zzc = zzcyiVar;
        Objects.requireNonNull(zzfjyVar);
        this.zzd = zzfjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        zzfhx zzfhxVar;
        zzfhj zzfhjVar = this.zza;
        if (zzfhjVar == null) {
            return;
        }
        zzfhjVar.zzg(false);
        zzfhu zzfhuVar = this.zzb;
        if (zzfhuVar == null) {
            zzfhxVar = this.zzd.zzf;
            zzfhxVar.zzc(zzfhjVar.zzm());
            return;
        }
        zzfhuVar.zza(zzfhjVar);
        zzfhuVar.zzh();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    @Override // com.google.android.gms.internal.ads.zzgdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjx.zzb(java.lang.Object):void");
    }
}
