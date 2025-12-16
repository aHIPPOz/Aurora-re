package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdmc {
    private final Context zza;
    private final zzdli zzb;
    private final zzavu zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbcc zzf;
    private final Executor zzg;
    private final zzbge zzh;
    private final zzdmu zzi;
    private final zzdpj zzj;
    private final ScheduledExecutorService zzk;
    private final zzdoe zzl;
    private final zzdsj zzm;
    private final zzfjy zzn;
    private final zzeca zzo;
    private final zzecl zzp;
    private final zzfda zzq;
    private final zzdsd zzr;

    public zzdmc(Context context, zzdli zzdliVar, zzavu zzavuVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbcc zzbccVar, Executor executor, zzfcw zzfcwVar, zzdmu zzdmuVar, zzdpj zzdpjVar, ScheduledExecutorService scheduledExecutorService, zzdsj zzdsjVar, zzfjy zzfjyVar, zzeca zzecaVar, zzdoe zzdoeVar, zzecl zzeclVar, zzfda zzfdaVar, zzdsd zzdsdVar) {
        this.zza = context;
        this.zzb = zzdliVar;
        this.zzc = zzavuVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbccVar;
        this.zzg = executor;
        this.zzh = zzfcwVar.zzi;
        this.zzi = zzdmuVar;
        this.zzj = zzdpjVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsjVar;
        this.zzn = zzfjyVar;
        this.zzo = zzecaVar;
        this.zzl = zzdoeVar;
        this.zzp = zzeclVar;
        this.zzq = zzfdaVar;
        this.zzr = zzdsdVar;
    }

    public static /* synthetic */ zzbfz zza(zzdmc zzdmcVar, JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzs = zzs(jSONObject, "bg_color");
        Integer zzs2 = zzs(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbfz(optString, list, zzs, zzs2, num, optInt3 + optInt2, zzdmcVar.zzh.zze, optBoolean);
    }

    public static /* synthetic */ ListenableFuture zzb(zzdmc zzdmcVar, String str, zzbya zzbyaVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) {
        com.google.android.gms.ads.internal.zzv.zzB();
        Context context = zzdmcVar.zza;
        zzecl zzeclVar = zzdmcVar.zzp;
        zzcfg zza = zzcft.zza(context, zzchd.zza(), "native-omid", false, false, zzdmcVar.zzc, null, zzdmcVar.zzd, null, null, zzdmcVar.zze, zzdmcVar.zzf, null, null, zzeclVar, zzdmcVar.zzq, zzdmcVar.zzm);
        final zzcaj zza2 = zzcaj.zza(zza);
        zza.zzN().zzC(new zzcgw() { // from class: com.google.android.gms.internal.ads.zzdlt
            @Override // com.google.android.gms.internal.ads.zzcgw
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcaj.this.zzb();
            }
        });
        zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznP)).booleanValue()) {
            if (zzbyaVar != null) {
                zza.zzN().zzL(zzbyaVar);
            }
            zza.zzN().zzD(zzbVar);
        }
        return zza2;
    }

    public static /* synthetic */ ListenableFuture zzc(zzdmc zzdmcVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfca zzfcaVar, zzfcd zzfcdVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbya zzbyaVar, String str, String str2, Object obj) {
        zzcfg zza = zzdmcVar.zzj.zza(zzrVar, zzfcaVar, zzfcdVar);
        final zzcaj zza2 = zzcaj.zza(zza);
        zzdob zzb = zzdmcVar.zzl.zzb();
        zzcgy zzN = zza.zzN();
        zzbcv zzbcvVar = zzbde.zznP;
        zzN.zzX(zzb, zzb, zzb, zzb, zzb, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbcvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzdmcVar.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbcvVar)).booleanValue() ? null : zzbyaVar, zzdmcVar.zzo, zzdmcVar.zzn, zzdmcVar.zzm, null, zzb, null, null, null, null);
        zza.zzag("/getNativeAdViewSignals", zzbke.zzs);
        zza.zzag("/getNativeClickMeta", zzbke.zzt);
        zza.zzN().zzG(true);
        zza.zzN().zzC(new zzcgw() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzcgw
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcaj zzcajVar = zzcaj.this;
                if (z) {
                    zzcajVar.zzb();
                    return;
                }
                zzcajVar.zzd(new zzehf(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zza.zzae(str, str2, null);
        return zza2;
    }

    public static final com.google.android.gms.ads.internal.client.zzfa zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfyq.zzn();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfyq.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzfa zzt = zzt(optJSONArray.optJSONObject(i));
            if (zzt != null) {
                arrayList.add(zzt);
            }
        }
        return zzfyq.zzl(arrayList);
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, Object obj) {
        return zzgdn.zzf(listenableFuture, Exception.class, new zzgcu(null) { // from class: com.google.android.gms.internal.ads.zzdlu
            @Override // com.google.android.gms.internal.ads.zzgcu
            public final ListenableFuture zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzgdn.zzh(null);
            }
        }, zzcaf.zzg);
    }

    private static ListenableFuture zzo(boolean z, final ListenableFuture listenableFuture, Object obj) {
        if (z) {
            return zzgdn.zzn(listenableFuture, new zzgcu() { // from class: com.google.android.gms.internal.ads.zzdlw
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj2) {
                    return obj2 != null ? ListenableFuture.this : zzgdn.zzg(new zzehf(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcaf.zzg);
        }
        return zzn(listenableFuture, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture zzp(org.json.JSONObject r14, boolean r15, com.google.android.gms.internal.ads.zzdrr r16) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L8
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgdn.zzh(r0)
            return r14
        L8:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzek
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzel
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L55
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzem
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            java.lang.String r6 = r14.getString(r5)     // Catch: org.json.JSONException -> L50
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L50
        L50:
            int r4 = r4 + 1
            goto L45
        L53:
            r12 = r1
            goto L56
        L55:
            r12 = r0
        L56:
            java.lang.String r1 = "url"
            java.lang.String r3 = r14.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L6a
            if (r12 == 0) goto L65
            goto L6a
        L65:
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgdn.zzh(r0)
            return r14
        L6a:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzcx
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L93
            if (r16 == 0) goto L93
            com.google.android.gms.internal.ads.zzdsd r1 = r13.zzr
            android.os.Bundle r1 = r1.zza()
            java.lang.String r2 = r16.zza()
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzv.zzD()
            long r4 = r4.currentTimeMillis()
            r1.putLong(r2, r4)
        L93:
            java.lang.String r1 = "scale"
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r14.optDouble(r1, r4)
            java.lang.String r1 = "is_transparent"
            r2 = 1
            boolean r1 = r14.optBoolean(r1, r2)
            java.lang.String r2 = "width"
            r6 = -1
            int r10 = r14.optInt(r2, r6)
            java.lang.String r2 = "height"
            int r7 = r14.optInt(r2, r6)
            if (r15 != 0) goto Ld3
            if (r12 == 0) goto Lb6
            r8 = r4
            r6 = r10
            goto Ld5
        Lb6:
            com.google.android.gms.internal.ads.zzdli r2 = r13.zzb
            com.google.common.util.concurrent.ListenableFuture r1 = r2.zzb(r3, r4, r1)
            com.google.android.gms.internal.ads.zzdls r2 = new com.google.android.gms.internal.ads.zzdls
            r6 = r10
            r2.<init>()
            java.util.concurrent.Executor r3 = r13.zzg
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzm(r1, r2, r3)
            java.lang.String r2 = "require"
            boolean r14 = r14.optBoolean(r2)
            com.google.common.util.concurrent.ListenableFuture r14 = zzo(r14, r1, r0)
            return r14
        Ld3:
            r6 = r10
            r8 = r4
        Ld5:
            com.google.android.gms.internal.ads.zzbgc r5 = new com.google.android.gms.internal.ads.zzbgc
            r10 = r6
            r6 = 0
            android.net.Uri r14 = android.net.Uri.parse(r3)
            r11 = r7
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12)
            com.google.common.util.concurrent.ListenableFuture r14 = com.google.android.gms.internal.ads.zzgdn.zzh(r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmc.zzp(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzdrr):com.google.common.util.concurrent.ListenableFuture");
    }

    private final ListenableFuture zzq(JSONArray jSONArray, boolean z, boolean z2, zzdrr zzdrrVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgdn.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrrVar.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzp(jSONArray.optJSONObject(i), z, null));
        }
        return zzgdn.zzm(zzgdn.zzd(arrayList), new zzfve() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbgc zzbgcVar : (List) obj) {
                    if (zzbgcVar != null) {
                        arrayList2.add(zzbgcVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzr(JSONObject jSONObject, zzfca zzfcaVar, zzfcd zzfcdVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbya zzbyaVar) {
        final ListenableFuture zze = this.zzi.zze(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfcaVar, zzfcdVar, zzm(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzbyaVar);
        return zzgdn.zzn(zze, new zzgcu() { // from class: com.google.android.gms.internal.ads.zzdlv
            @Override // com.google.android.gms.internal.ads.zzgcu
            public final ListenableFuture zza(Object obj) {
                zzcfg zzcfgVar = (zzcfg) obj;
                if (zzcfgVar == null || zzcfgVar.zzq() == null) {
                    throw new zzehf(1, "Retrieve video view in html5 ad response failed.");
                }
                return ListenableFuture.this;
            }
        }, zzcaf.zzg);
    }

    private static Integer zzs(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzfa zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            return new com.google.android.gms.ads.internal.client.zzfa(optString, optString2);
        }
        return null;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdrr zzdrrVar) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgdn.zzh(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzo(optJSONObject.optBoolean("require"), zzgdn.zzm(zzq(optJSONArray, false, true, zzdrrVar), new zzfve() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                return zzdmc.zza(zzdmc.this, optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str, zzdrr zzdrrVar) {
        return zzp(jSONObject.optJSONObject(str), this.zzh.zzb, zzdrrVar);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str, zzdrr zzdrrVar) {
        zzbge zzbgeVar = this.zzh;
        return zzq(jSONObject.optJSONArray("images"), zzbgeVar.zzb, zzbgeVar.zzd, zzdrrVar);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzfca zzfcaVar, final zzfcd zzfcdVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbya zzbyaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkw)).booleanValue()) {
            return zzgdn.zzh(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgdn.zzh(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgdn.zzh(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzek)).booleanValue()) {
            if (optJSONObject.has((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzel))) {
                return zzgdn.zzh(null);
            }
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzm = zzm(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (!TextUtils.isEmpty(optString2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
                this.zzr.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
            }
            final ListenableFuture zzn = zzgdn.zzn(zzgdn.zzh(null), new zzgcu() { // from class: com.google.android.gms.internal.ads.zzdlz
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj) {
                    return zzdmc.zzc(zzdmc.this, zzm, zzfcaVar, zzfcdVar, zzbVar, zzbyaVar, optString, optString2, obj);
                }
            }, zzcaf.zzf);
            return zzgdn.zzn(zzn, new zzgcu() { // from class: com.google.android.gms.internal.ads.zzdlq
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj) {
                    if (((zzcfg) obj) != null) {
                        return ListenableFuture.this;
                    }
                    throw new zzehf(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcaf.zzg);
        }
        return zzgdn.zzh(null);
    }

    public final ListenableFuture zzh(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        }
        zzcak zzcakVar = new zzcak();
        zzgdn.zzr(listenableFuture, new zzdmb(this, zzcakVar), zzcaf.zzf);
        return zzcakVar;
    }

    public final ListenableFuture zzi(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbya zzbyaVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgdn.zzh(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzgdn.zzh(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzgdn.zzh(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
        }
        return zzgdn.zzn(zzgdn.zzh(null), new zzgcu() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzgcu
            public final ListenableFuture zza(Object obj) {
                return zzdmc.zzb(zzdmc.this, optString, zzbyaVar, zzbVar, obj);
            }
        }, zzcaf.zzf);
    }

    public final ListenableFuture zzj(JSONObject jSONObject, zzfca zzfcaVar, zzfcd zzfcdVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbya zzbyaVar) {
        ListenableFuture listenableFuture;
        zzdmc zzdmcVar;
        boolean z = false;
        JSONObject zzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (zzh == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzgdn.zzh(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkv)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzgdn.zzh(null);
                }
            } else if (!z) {
                listenableFuture = this.zzi.zzd(optJSONObject, zzbVar, zzbyaVar);
                zzdmcVar = this;
                return zzn(zzgdn.zzo(listenableFuture, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzec)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
            }
            zzdmcVar = this;
            listenableFuture = zzdmcVar.zzr(optJSONObject, zzfcaVar, zzfcdVar, zzbVar, zzbyaVar);
            return zzn(zzgdn.zzo(listenableFuture, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzec)).intValue(), TimeUnit.SECONDS, zzdmcVar.zzk), null);
        }
        return zzr(zzh, zzfcaVar, zzfcdVar, zzbVar, zzbyaVar);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzm(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}
