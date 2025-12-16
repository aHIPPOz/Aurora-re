package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzclp implements zzclg {
    private final zzedk zza;

    public zzclp(zzedk zzedkVar) {
        this.zza = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclg
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkQ)).booleanValue()) {
            return;
        }
        zzgde zzgdeVar = (zzgde) zzgdn.zzf(zzgde.zzw(this.zza.zza(true)), Throwable.class, new zzgcu() { // from class: com.google.android.gms.internal.ads.zzclo
            @Override // com.google.android.gms.internal.ads.zzgcu
            public final ListenableFuture zza(Object obj) {
                Throwable th = (Throwable) obj;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkR)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                }
                return zzgdn.zzh(new GetTopicsResponse(zzfyq.zzn()));
            }
        }, zzcaf.zza);
    }
}
