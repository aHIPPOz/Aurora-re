package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzazu implements Runnable {
    final /* synthetic */ zzazv zza;

    public zzazu(zzazv zzazvVar) {
        Objects.requireNonNull(zzazvVar);
        this.zza = zzazvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzazw> list;
        zzazv zzazvVar = this.zza;
        obj = zzazvVar.zzc;
        synchronized (obj) {
            z = zzazvVar.zzd;
            if (z) {
                z2 = zzazvVar.zze;
                if (z2) {
                    zzazvVar.zzd = false;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("App went background");
                    list = zzazvVar.zzf;
                    for (zzazw zzazwVar : list) {
                        try {
                            zzazwVar.zza(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                        }
                    }
                }
            }
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground");
        }
    }
}
