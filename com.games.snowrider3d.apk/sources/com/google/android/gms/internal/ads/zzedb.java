package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzedb implements zzedc {
    public static /* synthetic */ zzedh zzc(String str, String str2, String str3, zzedd zzeddVar, String str4, WebView webView, String str5, String str6, zzede zzedeVar) {
        zzfly zza = zzfly.zza("Google", str2);
        zzflx zzp = zzp("javascript");
        zzflq zzn = zzn(zzeddVar.toString());
        zzflx zzflxVar = zzflx.NONE;
        if (zzp == zzflxVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            String valueOf = String.valueOf(String.valueOf(zzeddVar));
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else {
            zzflx zzp2 = zzp(str4);
            if (zzn != zzflq.VIDEO || zzp2 != zzflxVar) {
                zzfln zzb = zzfln.zzb(zza, webView, str5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                return new zzedh(zzfll.zza(zzflm.zza(zzn, zzo(zzedeVar.toString()), zzp, zzp2, true), zzb), zzb);
            }
            String valueOf2 = String.valueOf(str4);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        }
    }

    public static /* synthetic */ zzedh zzd(String str, String str2, String str3, String str4, zzedd zzeddVar, WebView webView, String str5, String str6, zzede zzedeVar) {
        zzfly zza = zzfly.zza(str, str2);
        zzflx zzp = zzp("javascript");
        zzflx zzp2 = zzp(str4);
        zzflq zzn = zzn(zzeddVar.toString());
        zzflx zzflxVar = zzflx.NONE;
        if (zzp == zzflxVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            String valueOf = String.valueOf(String.valueOf(zzeddVar));
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else if (zzn != zzflq.VIDEO || zzp2 != zzflxVar) {
            zzfln zzc = zzfln.zzc(zza, webView, str5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return new zzedh(zzfll.zza(zzflm.zza(zzn, zzo(zzedeVar.toString()), zzp, zzp2, true), zzc), zzc);
        } else {
            String valueOf2 = String.valueOf(str4);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        }
    }

    private static zzflq zzn(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return zzflq.NATIVE_DISPLAY;
            }
            if (c == 2) {
                return zzflq.VIDEO;
            }
            return null;
        }
        return zzflq.HTML_DISPLAY;
    }

    private static zzflt zzo(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                return zzflt.DEFINED_BY_JAVASCRIPT;
            }
            if (c == 2) {
                return zzflt.ONE_PIXEL;
            }
            return zzflt.UNSPECIFIED;
        }
        return zzflt.BEGIN_TO_RENDER;
    }

    private static zzflx zzp(String str) {
        if ("native".equals(str)) {
            return zzflx.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzflx.JAVASCRIPT;
        }
        return zzflx.NONE;
    }

    private static final Object zzq(zzeda zzedaVar) {
        try {
            return zzedaVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final zzedh zza(String str, WebView webView, String str2, String str3, String str4, zzede zzedeVar, zzedd zzeddVar, String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
            return null;
        }
        return (zzedh) zzq(new zzeda("Google", str, "javascript", zzeddVar, str4, webView, str5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzedeVar) { // from class: com.google.android.gms.internal.ads.zzecq
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzedd zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzede zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

            {
                this.zzb = str;
                this.zzd = zzeddVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzedeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeda
            public final Object zza() {
                return zzedb.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final zzedh zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzede zzedeVar, zzedd zzeddVar, String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
            return null;
        }
        return (zzedh) zzq(new zzeda(str5, str, "javascript", str4, zzeddVar, webView, str6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzedeVar) { // from class: com.google.android.gms.internal.ads.zzect
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzedd zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzede zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

            {
                this.zzd = str4;
                this.zze = zzeddVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzedeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeda
            public final Object zza() {
                return zzedb.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final zzflw zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z) {
        return (zzflw) zzq(new zzeda(webView, true) { // from class: com.google.android.gms.internal.ads.zzecy
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeda
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                return zzflw.zzb(zzfly.zza("Google", i + "." + i2), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final String zzf(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue()) {
            return null;
        }
        return (String) zzq(new zzeda() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // com.google.android.gms.internal.ads.zzeda
            public final Object zza() {
                return "a.1.5.2-google_20241009";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzg(final zzfll zzfllVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecp
            @Override // java.lang.Runnable
            public final void run() {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
                    return;
                }
                zzfll.this.zzb(view, zzfls.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzh(final zzflw zzflwVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecv
            @Override // java.lang.Runnable
            public final void run() {
                zzflw.this.zzf(view, zzfls.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzi(final zzfll zzfllVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // java.lang.Runnable
            public final void run() {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
                    return;
                }
                zzfll.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzj(final zzfll zzfllVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // java.lang.Runnable
            public final void run() {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
                    return;
                }
                zzfll.this.zzd(view);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzk(final zzfll zzfllVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
            return;
        }
        Objects.requireNonNull(zzfllVar);
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // java.lang.Runnable
            public final void run() {
                zzfll.this.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final boolean zzl(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfz)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzeda() { // from class: com.google.android.gms.internal.ads.zzecu
            @Override // com.google.android.gms.internal.ads.zzeda
            public final Object zza() {
                if (zzflj.zzb()) {
                    return true;
                }
                zzflj.zza(context);
                return Boolean.valueOf(zzflj.zzb());
            }
        });
        return bool != null && bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzm(final zzflw zzflwVar, final zzcfx zzcfxVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // java.lang.Runnable
            public final void run() {
                zzflw.this.zzg(zzcfxVar);
            }
        });
    }
}
