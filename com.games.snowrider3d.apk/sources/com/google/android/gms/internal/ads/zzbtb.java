package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbtb extends zzbhv {
    final /* synthetic */ zzbtd zza;

    public /* synthetic */ zzbtb(zzbtd zzbtdVar, zzbtc zzbtcVar) {
        Objects.requireNonNull(zzbtdVar);
        this.zza = zzbtdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze(zzbhj zzbhjVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbtd zzbtdVar = this.zza;
        onCustomFormatAdLoadedListener = zzbtdVar.zza;
        zzf = zzbtdVar.zzf(zzbhjVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
