package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdrp implements zzcza, zzcxm, zzcwb, zzdep {
    private final zzdsd zza;
    private final zzdso zzb;
    private final int zzc;

    public zzdrp(zzdsd zzdsdVar, zzdso zzdsoVar, int i) {
        this.zza = zzdsdVar;
        this.zzb = zzdsoVar;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    private final void zzd(Bundle bundle, zzfyq zzfyqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdrr.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        zzdsd zzdsdVar = this.zza;
        zzdsdVar.zzc();
        String str = "0";
        if (bundle.containsKey("ls")) {
            zzdsdVar.zzd("ls", true != bundle.getBoolean("ls") ? str : "1");
        }
        int size = zzfyqVar.size();
        for (int i = 0; i < size; i++) {
            zzdrs zzdrsVar = (zzdrs) zzfyqVar.get(i);
            long j = bundle.getLong(zzdrsVar.zza().zza(), -1L);
            long j2 = bundle.getLong(zzdrsVar.zzb().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdsdVar.zzd(zzdrsVar.zzc(), String.valueOf(j2 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhN)).booleanValue()) {
            return;
        }
        if (bundle.containsKey("sod_h")) {
            if (true == bundle.getBoolean("sod_h")) {
                str = "1";
            }
            zzdsdVar.zzd("sod_h", str);
        }
        if (!bundle.containsKey("cmr")) {
            return;
        }
        zzdsdVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
    }

    @Override // com.google.android.gms.internal.ads.zzcwb
    public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdsd zzdsdVar = this.zza;
        zzdsdVar.zzb().put("action", "ftl");
        zzdsdVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdsdVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhv)).booleanValue()) {
            zzdsdVar.zzd("emsg", zzeVar.zzb);
        }
        this.zzb.zzg(zzdsdVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcza
    public final void zzdn(zzbvq zzbvqVar) {
        this.zza.zzf(zzbvqVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcza
    public final void zzdo(zzfcn zzfcnVar) {
        this.zza.zze(zzfcnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zzdep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrp.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdep
    public final void zzf(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhg)).booleanValue()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhN)).booleanValue()) {
            this.zza.zzb().put("sgw", String.valueOf(this.zzc));
        }
        zzdsd zzdsdVar = this.zza;
        zzdsdVar.zzb().put("action", "sgf");
        zzdsdVar.zzd("sgf_reason", str);
        this.zzb.zzg(zzdsdVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcxm
    public final void zzu() {
        zzdsd zzdsdVar = this.zza;
        zzdsdVar.zzb().put("action", "loaded");
        zzd(zzdsdVar.zza(), zzdrs.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmZ)).booleanValue()) {
            zzdsdVar.zzb().put("mafe", true != WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzg(zzdsdVar.zzb());
    }
}
