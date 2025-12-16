package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdyb {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzche zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfcw zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhu zzi;
    private final zzdsd zzj;
    private final zzfjy zzk;
    private final zzcyy zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbvy zzq;

    public zzdyb(zzche zzcheVar, Context context, VersionInfoParcel versionInfoParcel, zzfcw zzfcwVar, Executor executor, String str, zzfhu zzfhuVar, zzdsd zzdsdVar, zzbvy zzbvyVar, zzeag zzeagVar, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, zzcyy zzcyyVar) {
        this.zzb = zzcheVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfcwVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhuVar;
        zzcheVar.zzw();
        this.zzj = zzdsdVar;
        this.zzq = zzbvyVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjyVar;
        this.zzl = zzcyyVar;
    }

    public static /* synthetic */ ListenableFuture zzb(zzdyb zzdybVar, List list, Exception exc) {
        zzehf zzehfVar;
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzehfVar = new zzehf(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzehf) {
            zzehfVar = (zzehf) exc;
        } else {
            zzehfVar = new zzehf(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzehfVar.getMessage() == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzehfVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zzf = zzfwe.zzb(zzfva.zzc(':')).zzf(message);
                    if (zzf.size() == 2) {
                        message = (String) zzf.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfju.zzc(zzfju.zzc((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            zzdybVar.zzk.zze(arrayList, null);
        }
        return zzgdn.zzg(zzehfVar);
    }

    public static /* synthetic */ ListenableFuture zzc(zzdyb zzdybVar, JSONObject jSONObject) {
        zzfck zzfckVar = new zzfck(zzdybVar.zze);
        String jSONObject2 = jSONObject.toString();
        return zzgdn.zzh(new zzfcn(zzfckVar, zzfcm.zza(new StringReader(jSONObject2), zzdybVar.zzp)));
    }

    public static /* synthetic */ ListenableFuture zzd(zzdyb zzdybVar, zzbom zzbomVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            zzdybVar.zzj.zza().putLong(zzdrr.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        }
        return zzbomVar.zzb(jSONObject);
    }

    public static /* synthetic */ String zzf(zzdyb zzdybVar, zzead zzeadVar) {
        zzdybVar.zzi(zzdrr.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzht)).intValue()) {
                    zzead zzeadVar2 = zzeadVar;
                    zzeae zza2 = new zzeaf(zzdybVar.zzc, zzdybVar.zzd.afmaVersion, zzdybVar.zzq, Binder.getCallingUid()).zza(zzeadVar);
                    zzeae zzeaeVar = zza2;
                    int i3 = zza2.zza;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhu)).booleanValue()) {
                        zzdybVar.zzj.zzd("fr", String.valueOf(i));
                    }
                    if (i3 == 200) {
                        zzdybVar.zzi(zzdrr.RENDERING_ADSTRING_TYPE2_FETCH_END);
                        return zza2.zzc;
                    }
                    i++;
                    i2 = i3;
                } else {
                    throw new zzehf(1, "Received HTTP error code from ad server:" + i2);
                }
            } catch (Exception e) {
                throw new zzehf(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture zzg(java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyb.zzg(java.lang.String, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    private final String zzh(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
            return str;
        }
    }

    private final void zzi(zzdrr zzdrrVar) {
        Bundle zza2 = this.zzj.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhu)).booleanValue()) {
            zza2.putLong(zzdrrVar.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } catch (JSONException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x022e, code lost:
        if (r5.zzg(r1, r2, r4) == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ec A[Catch: all -> 0x0244, TryCatch #1 {, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00b1, B:29:0x00cb, B:30:0x00e2, B:31:0x00f8, B:33:0x0104, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:43:0x012d, B:45:0x013a, B:46:0x0151, B:48:0x0159, B:49:0x016f, B:52:0x0178, B:53:0x017d, B:55:0x0188, B:58:0x0190, B:61:0x019e, B:62:0x01b4, B:64:0x01c9, B:65:0x01dc, B:68:0x01ec, B:69:0x01f6, B:70:0x0201, B:73:0x0215, B:75:0x021b, B:76:0x0228, B:78:0x022a, B:80:0x0230, B:81:0x0233), top: B:104:0x0080, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6 A[Catch: all -> 0x0244, TryCatch #1 {, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00b1, B:29:0x00cb, B:30:0x00e2, B:31:0x00f8, B:33:0x0104, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:43:0x012d, B:45:0x013a, B:46:0x0151, B:48:0x0159, B:49:0x016f, B:52:0x0178, B:53:0x017d, B:55:0x0188, B:58:0x0190, B:61:0x019e, B:62:0x01b4, B:64:0x01c9, B:65:0x01dc, B:68:0x01ec, B:69:0x01f6, B:70:0x0201, B:73:0x0215, B:75:0x021b, B:76:0x0228, B:78:0x022a, B:80:0x0230, B:81:0x0233), top: B:104:0x0080, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b A[Catch: all -> 0x0244, TryCatch #1 {, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00b1, B:29:0x00cb, B:30:0x00e2, B:31:0x00f8, B:33:0x0104, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:43:0x012d, B:45:0x013a, B:46:0x0151, B:48:0x0159, B:49:0x016f, B:52:0x0178, B:53:0x017d, B:55:0x0188, B:58:0x0190, B:61:0x019e, B:62:0x01b4, B:64:0x01c9, B:65:0x01dc, B:68:0x01ec, B:69:0x01f6, B:70:0x0201, B:73:0x0215, B:75:0x021b, B:76:0x0228, B:78:0x022a, B:80:0x0230, B:81:0x0233), top: B:104:0x0080, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a A[Catch: all -> 0x0244, TryCatch #1 {, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00b1, B:29:0x00cb, B:30:0x00e2, B:31:0x00f8, B:33:0x0104, B:35:0x010c, B:37:0x0112, B:40:0x011b, B:43:0x012d, B:45:0x013a, B:46:0x0151, B:48:0x0159, B:49:0x016f, B:52:0x0178, B:53:0x017d, B:55:0x0188, B:58:0x0190, B:61:0x019e, B:62:0x01b4, B:64:0x01c9, B:65:0x01dc, B:68:0x01ec, B:69:0x01f6, B:70:0x0201, B:73:0x0215, B:75:0x021b, B:76:0x0228, B:78:0x022a, B:80:0x0230, B:81:0x0233), top: B:104:0x0080, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zze() {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyb.zze():com.google.common.util.concurrent.ListenableFuture");
    }
}
