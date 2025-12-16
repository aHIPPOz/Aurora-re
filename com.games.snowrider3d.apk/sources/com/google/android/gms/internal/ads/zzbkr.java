package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbkr implements zzbkf {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdsj zzb;
    private final zzbso zzd;
    private final zzeca zze;
    private final zzcmq zzf;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg = null;
    private final zzgdy zzh = zzcaf.zzg;

    public zzbkr(com.google.android.gms.ads.internal.zzb zzbVar, zzbso zzbsoVar, zzeca zzecaVar, zzdsj zzdsjVar, zzcmq zzcmqVar) {
        this.zza = zzbVar;
        this.zzd = zzbsoVar;
        this.zze = zzecaVar;
        this.zzb = zzdsjVar;
        this.zzf = zzcmqVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            return "c".equalsIgnoreCase(str) ? 14 : -1;
        }
        return -1;
    }

    static Uri zzc(Context context, zzavu zzavuVar, Uri uri, View view, Activity activity, zzfda zzfdaVar) {
        if (zzavuVar != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmu)).booleanValue() && zzfdaVar != null) {
                    if (zzavuVar.zze(uri)) {
                        return zzfdaVar.zza(uri, context, view, activity);
                    }
                } else if (zzavuVar.zze(uri)) {
                    return zzavuVar.zza(uri, context, view, activity);
                }
            } catch (zzavv unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error adding click uptime parameter to url: ".concat(valueOf), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        Map map2 = map;
        zzcfg zzcfgVar = (zzcfg) zzaVar;
        zzfca zzD = zzcfgVar.zzD();
        zzfcd zzR = zzcfgVar.zzR();
        boolean z3 = false;
        if (zzD == null || zzR == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            z = false;
        } else {
            str3 = zzR.zzb;
            z = zzD.zzb();
        }
        boolean z4 = !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlg)).booleanValue() || !map2.containsKey("sc") || !((String) map2.get("sc")).equals("0");
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzng)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfgVar.zzaF()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzcgq) zzaVar).zzaL(zzf(map2), zzb(map2), z4);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z6 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmq)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcgq) zzaVar).zzaN(zzf(map2), zzb(map2), str, z4, z6);
            } else {
                ((zzcgq) zzaVar).zzaM(zzf(map2), zzb(map2), (String) map2.get("html"), (String) map2.get("baseurl"), z4);
            }
        } else {
            Intent intent = null;
            if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
                Context context = zzcfgVar.getContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeY)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                    zzm(10);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeT)).booleanValue()) {
                        int i2 = zzbed.zza;
                        String packageName = CustomTabsClient.getPackageName(context, null);
                        if (packageName != null && !context.getPackageName().equals(packageName)) {
                            z3 = true;
                        }
                    } else {
                        z3 = zzbef.zzg(context);
                    }
                    if (!z3) {
                        zzm(4);
                    } else {
                        zzk(true);
                        if (TextUtils.isEmpty(str)) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot open browser with null or empty url");
                            zzm(7);
                            return;
                        }
                        Uri zzd = zzd(zzc(zzcfgVar.getContext(), zzcfgVar.zzI(), Uri.parse(str), zzcfgVar.zzF(), zzcfgVar.zzi(), zzcfgVar.zzS()));
                        if (z && this.zze != null && zzl(zzaVar, zzcfgVar.getContext(), zzd.toString(), str3)) {
                            return;
                        }
                        this.zzg = new zzbko(this);
                        ((zzcgq) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4, z5, str3);
                        return;
                    }
                }
                map2.put("use_first_package", "true");
                map2.put("use_running_process", "true");
                zzj(zzaVar, map2, z, str3, z4, z5);
            } else if (!"app".equalsIgnoreCase(str2) || !"true".equalsIgnoreCase((String) map2.get("system_browser"))) {
                com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
                String str4 = str3;
                boolean z7 = z5;
                boolean z8 = z;
                if ("open_app".equalsIgnoreCase(str2)) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zziE)).booleanValue()) {
                        return;
                    }
                    zzk(true);
                    String str5 = (String) map2.get("p");
                    if (str5 == null) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing from open app action.");
                        return;
                    } else if (z8 && this.zze != null && zzl(zzaVar2, zzcfgVar.getContext(), str5, str4)) {
                        return;
                    } else {
                        PackageManager packageManager = zzcfgVar.getContext().getPackageManager();
                        if (packageManager == null) {
                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                        if (launchIntentForPackage == null) {
                            return;
                        }
                        ((zzcgq) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z4, z7, str4);
                        return;
                    }
                }
                zzk(true);
                String str6 = (String) map2.get("intent_url");
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        intent = Intent.parseUri(str6, 0);
                    } catch (URISyntaxException e) {
                        String valueOf = String.valueOf(str6);
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the url: ".concat(valueOf), e);
                    }
                }
                if (intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri zzd2 = zzd(zzc(zzcfgVar.getContext(), zzcfgVar.zzI(), data, zzcfgVar.zzF(), zzcfgVar.zzi(), zzcfgVar.zzS()));
                        if (!TextUtils.isEmpty(intent.getType())) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zziF)).booleanValue()) {
                                intent.setDataAndType(zzd2, intent.getType());
                            }
                        }
                        intent.setData(zzd2);
                    }
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzja)).booleanValue() || !"intent_async".equalsIgnoreCase(str2) || !map2.containsKey("event_id")) {
                    obj = "event_id";
                    z2 = false;
                } else {
                    obj = "event_id";
                    z2 = true;
                }
                HashMap hashMap = new HashMap();
                if (z2) {
                    boolean z9 = z4;
                    obj2 = obj;
                    zzbkp zzbkpVar = new zzbkp(this, z9, zzaVar2, hashMap, map2);
                    zzaVar2 = zzaVar2;
                    map2 = map2;
                    this.zzg = zzbkpVar;
                } else {
                    boolean z10 = z4;
                    obj2 = obj;
                    z3 = z10;
                }
                if (intent != null) {
                    if (!z8 || this.zze == null || !zzl(zzaVar2, zzcfgVar.getContext(), intent.getData().toString(), str4)) {
                        ((zzcgq) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z3, z7, str4);
                        return;
                    } else if (!z2) {
                        return;
                    } else {
                        hashMap.put((String) map2.get(obj2), true);
                        ((zzbna) zzaVar2).zzd("openIntentAsync", hashMap);
                        return;
                    }
                }
                String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcfgVar.getContext(), zzcfgVar.zzI(), Uri.parse(str), zzcfgVar.zzF(), zzcfgVar.zzi(), zzcfgVar.zzS())).toString() : str;
                if (!z8 || this.zze == null || !zzl(zzaVar2, zzcfgVar.getContext(), uri, str4)) {
                    ((zzcgq) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get("i"), uri, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzg), z3, z7, str4);
                } else if (!z2) {
                } else {
                    hashMap.put((String) map2.get(obj2), true);
                    ((zzbna) zzaVar2).zzd("openIntentAsync", hashMap);
                }
            } else {
                zzj(zzaVar, map2, z, str3, z4, z5);
            }
        }
    }

    private final void zzi(Context context, String str, String str2) {
        zzeca zzecaVar = this.zze;
        zzecaVar.zzc(str);
        zzdsj zzdsjVar = this.zzb;
        if (zzdsjVar != null) {
            zzecl.zzp(context, zzdsjVar, zzecaVar, str, "dialog_not_shown", zzfyt.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
        if (com.google.android.gms.internal.ads.zzbkq.zzc(r13, r8, r9, r10, r11) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkr.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z) {
        zzbso zzbsoVar = this.zzd;
        if (zzbsoVar != null) {
            zzbsoVar.zzb(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zziU)).booleanValue() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (r5 != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkr.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void zzm(int i) {
        zzdsj zzdsjVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeS)).booleanValue() || (zzdsjVar = this.zzb) == null) {
            return;
        }
        zzdsi zza = zzdsjVar.zza();
        zza.zzb("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzb("cct_open_status", str);
        zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ListenableFuture listenableFuture;
        zzcmq zzcmqVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcfg zzcfgVar = (zzcfg) zzaVar;
        if (zzcfgVar.zzD() != null) {
            hashMap = zzcfgVar.zzD().zzaw;
        }
        String zzc = zzbyq.zzc(str, zzcfgVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() || (zzcmqVar = this.zzf) == null || !zzcmq.zzj(zzc)) {
                listenableFuture = zzgdn.zzh(zzc);
            } else {
                listenableFuture = zzcmqVar.zze(zzc, com.google.android.gms.ads.internal.client.zzbb.zze());
            }
            zzgdn.zzr(listenableFuture, new zzbkn(this, map, zzaVar, str2), this.zzh);
            return;
        }
        zzbVar.zzb(zzc);
    }
}
