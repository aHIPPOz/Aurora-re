package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfmh extends zzfmk {
    private static final zzfmh zzb = new zzfmh();

    private zzfmh() {
    }

    public static zzfmh zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmk
    public final void zzb(boolean z) {
        for (zzflp zzflpVar : zzfmi.zza().zzc()) {
            zzflpVar.zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmk
    public final boolean zzc() {
        for (zzflp zzflpVar : zzfmi.zza().zzb()) {
            View zzf = zzflpVar.zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
