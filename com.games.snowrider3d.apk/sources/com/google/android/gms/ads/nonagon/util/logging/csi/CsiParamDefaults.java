package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzfwg;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.zzr();
        map.put("device", zzs.zzs());
        map.put("app", this.zzb);
        zzv.zzr();
        Context context = this.zza;
        String str = "0";
        map.put("is_lite_sdk", true != zzs.zzF(context) ? str : "1");
        zzbcv zzbcvVar = zzbde.zza;
        List zzb = zzbd.zza().zzb();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhc)).booleanValue()) {
            zzb.addAll(zzv.zzp().zzi().zzg().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlM)).booleanValue()) {
            zzv.zzr();
            if (true == zzs.zzC(context)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjQ)).booleanValue()) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcC)).booleanValue()) {
                return;
            }
            map.put("plugin", zzfwg.zzc(zzv.zzp().zzn()));
        }
    }
}
