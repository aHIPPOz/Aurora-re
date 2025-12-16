package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzflk {
    private boolean zza;

    public final void zza(Context context) {
        zzfni.zzc(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfmq.zzb().zzd(context);
            zzfmh.zza().zzd(context);
            zzfnd.zzb(context);
            zzfne.zzd(context);
            zzfnh.zza(context);
            zzfmn.zzb().zzc(context);
            zzfmg.zza().zzd(context);
            zzfms.zza().zze(context);
        }
    }

    public final boolean zzb() {
        return this.zza;
    }
}
