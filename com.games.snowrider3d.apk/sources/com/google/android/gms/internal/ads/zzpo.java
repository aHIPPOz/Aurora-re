package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzpo {
    private final Context zza;
    private final Handler zzb;
    private final zzpk zzc = new zzpk(this, null);
    private final BroadcastReceiver zzd = new zzpm(this, null);
    private final zzpl zze;
    private zzpj zzf;
    private zzpp zzg;
    private zze zzh;
    private boolean zzi;
    private final zzqy zzj;

    public zzpo(Context context, zzqy zzqyVar, zze zzeVar, zzpp zzppVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqyVar;
        this.zzh = zzeVar;
        this.zzg = zzppVar;
        zzpl zzplVar = null;
        Handler handler = new Handler(zzex.zzz(), null);
        this.zzb = handler;
        Uri zza = zzpj.zza();
        this.zze = zza != null ? new zzpl(this, handler, applicationContext.getContentResolver(), zza) : zzplVar;
    }

    public final void zzk(zzpj zzpjVar) {
        if (!this.zzi || zzpjVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzpjVar;
        this.zzj.zza.zzK(zzpjVar);
    }

    public final void zzg(zzpj zzpjVar) {
        zzk(zzpjVar);
    }

    public final void zzh(zze zzeVar) {
        this.zzh = zzeVar;
        zzk(zzpj.zzc(this.zza, zzeVar, this.zzg));
    }

    public final void zzi(AudioDeviceInfo audioDeviceInfo) {
        zzpp zzppVar = this.zzg;
        zzpp zzppVar2 = null;
        if (Objects.equals(audioDeviceInfo, zzppVar == null ? null : zzppVar.zza)) {
            return;
        }
        if (audioDeviceInfo != null) {
            zzppVar2 = new zzpp(audioDeviceInfo);
        }
        this.zzg = zzppVar2;
        zzk(zzpj.zzc(this.zza, this.zzh, zzppVar2));
    }

    public final void zzj() {
        if (!this.zzi) {
            return;
        }
        this.zzf = null;
        zzpk zzpkVar = this.zzc;
        if (zzpkVar != null) {
            zzcj.zzc(this.zza).unregisterAudioDeviceCallback(zzpkVar);
        }
        this.zza.unregisterReceiver(this.zzd);
        zzpl zzplVar = this.zze;
        if (zzplVar != null) {
            zzplVar.zzb();
        }
        this.zzi = false;
    }

    public final zzpj zzc() {
        if (this.zzi) {
            zzpj zzpjVar = this.zzf;
            zzpjVar.getClass();
            return zzpjVar;
        }
        this.zzi = true;
        zzpl zzplVar = this.zze;
        if (zzplVar != null) {
            zzplVar.zza();
        }
        zzpk zzpkVar = this.zzc;
        if (zzpkVar != null) {
            Context context = this.zza;
            zzcj.zzc(context).registerAudioDeviceCallback(zzpkVar, this.zzb);
        }
        Context context2 = this.zza;
        zzpj zzd = zzpj.zzd(context2, context2.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }
}
