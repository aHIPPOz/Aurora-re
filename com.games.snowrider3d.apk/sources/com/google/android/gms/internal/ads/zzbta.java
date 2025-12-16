package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbta extends zzbhs {
    final /* synthetic */ zzbtd zza;

    public /* synthetic */ zzbta(zzbtd zzbtdVar, zzbtc zzbtcVar) {
        Objects.requireNonNull(zzbtdVar);
        this.zza = zzbtdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zze(zzbhj zzbhjVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbtd zzbtdVar = this.zza;
        onCustomClickListener = zzbtdVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbtdVar.zzb;
        zzf = zzbtdVar.zzf(zzbhjVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
