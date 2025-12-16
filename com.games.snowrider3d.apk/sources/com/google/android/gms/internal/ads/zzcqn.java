package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcqn implements zzcxm, zzcws {
    private final Context zza;
    private final zzcfg zzb;
    private final zzfca zzc;
    private final VersionInfoParcel zzd;
    private zzedh zze;
    private boolean zzf;
    private final zzedf zzg;

    public zzcqn(Context context, zzcfg zzcfgVar, zzfca zzfcaVar, VersionInfoParcel versionInfoParcel, zzedf zzedfVar) {
        this.zza = context;
        this.zzb = zzcfgVar;
        this.zzc = zzfcaVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzedfVar;
    }

    private final synchronized void zza() {
        zzcfg zzcfgVar;
        zzedd zzeddVar;
        zzede zzedeVar;
        zzede zzedeVar2;
        zzfca zzfcaVar = this.zzc;
        if (zzfcaVar.zzT && (zzcfgVar = this.zzb) != null) {
            if (com.google.android.gms.ads.internal.zzv.zzC().zzl(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfcz zzfczVar = zzfcaVar.zzV;
                String zza = zzfczVar.zza();
                if (zzfczVar.zzc() == 1) {
                    zzeddVar = zzedd.VIDEO;
                    zzedeVar = zzede.DEFINED_BY_JAVASCRIPT;
                } else {
                    int i = zzfcaVar.zze;
                    zzedd zzeddVar2 = zzedd.HTML_DISPLAY;
                    if (i == 1) {
                        zzedeVar2 = zzede.ONE_PIXEL;
                    } else {
                        zzedeVar2 = zzede.BEGIN_TO_RENDER;
                    }
                    zzedeVar = zzedeVar2;
                    zzeddVar = zzeddVar2;
                }
                zzedh zza2 = com.google.android.gms.ads.internal.zzv.zzC().zza(str, zzcfgVar.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", zza, zzedeVar, zzeddVar, zzfcaVar.zzal);
                this.zze = zza2;
                if (zza2 != null) {
                    zzfll zza3 = zza2.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfB)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzC().zzj(zza3, zzcfgVar.zzG());
                        for (View view : zzcfgVar.zzV()) {
                            com.google.android.gms.ads.internal.zzv.zzC().zzg(zza3, view);
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzC().zzj(zza3, zzcfgVar.zzF());
                    }
                    zzcfgVar.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzv.zzC().zzk(zza3);
                    this.zzf = true;
                    zzcfgVar.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcws
    public final synchronized void zzt() {
        zzcfg zzcfgVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcfgVar = this.zzb) == null) {
            return;
        }
        zzcfgVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzcxm
    public final synchronized void zzu() {
        if (zzb()) {
            this.zzg.zzc();
        } else if (this.zzf) {
        } else {
            zza();
        }
    }
}
