package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzqu {
    private final Context zza;
    private Boolean zzb;

    public zzqu() {
        this(null);
    }

    public zzqu(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzps zza(zzz zzzVar, zze zzeVar) {
        int i;
        boolean z;
        zzzVar.getClass();
        zzeVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzzVar.zzH) == -1) {
            return zzps.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zzc(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            z = this.zzb.booleanValue();
        }
        String str = zzzVar.zzo;
        str.getClass();
        int zza = zzay.zza(str, zzzVar.zzk);
        if (zza == 0 || Build.VERSION.SDK_INT < zzex.zzh(zza)) {
            return zzps.zza;
        }
        int zzi = zzex.zzi(zzzVar.zzG);
        if (zzi != 0) {
            try {
                AudioFormat zzx = zzex.zzx(i, zzi, zza);
                if (Build.VERSION.SDK_INT >= 31) {
                    int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(zzx, zzeVar.zza().zza);
                    if (playbackOffloadSupport == 0) {
                        return zzps.zza;
                    }
                    zzpq zzpqVar = new zzpq();
                    if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                        z2 = true;
                    }
                    zzpqVar.zza(true);
                    zzpqVar.zzb(z2);
                    zzpqVar.zzc(z);
                    return zzpqVar.zzd();
                } else if (!AudioManager.isOffloadedPlaybackSupported(zzx, zzeVar.zza().zza)) {
                    return zzps.zza;
                } else {
                    zzpq zzpqVar2 = new zzpq();
                    zzpqVar2.zza(true);
                    zzpqVar2.zzc(z);
                    return zzpqVar2.zzd();
                }
            } catch (IllegalArgumentException unused) {
                return zzps.zza;
            }
        }
        return zzps.zza;
    }
}
