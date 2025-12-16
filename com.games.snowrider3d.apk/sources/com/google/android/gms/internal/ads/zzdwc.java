package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdwc extends AdListener {
    final /* synthetic */ zzdwf zza;

    public zzdwc(zzdwf zzdwfVar) {
        Objects.requireNonNull(zzdwfVar);
        this.zza = zzdwfVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdwf zzdwfVar = this.zza;
        zzk = zzdwf.zzk(loadAdError);
        zzdwfVar.zzl(zzk);
    }
}
