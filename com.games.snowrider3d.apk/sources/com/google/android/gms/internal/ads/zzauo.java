package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzauo implements PackageManager.OnChecksumsReadyListener {
    final zzgeh zza = zzgeh.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    zzgeh zzgehVar = this.zza;
                    zzgbd zzf = zzgbd.zzi().zzf();
                    byte[] value = apkChecksum.getValue();
                    zzgehVar.zzc(zzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }
}
