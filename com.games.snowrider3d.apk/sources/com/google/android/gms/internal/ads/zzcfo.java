package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzcfo extends WebViewClient implements zzcgy {
    public static final /* synthetic */ int zzb = 0;
    private zzdsj zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzecl zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbya zza;
    private final zzcfg zzc;
    private final zzbcc zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcgw zzi;
    private zzcgx zzj;
    private zzbiv zzk;
    private zzbix zzl;
    private zzded zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbst zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzr = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzbso zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfW)).split(",")));

    public zzcfo(zzcfg zzcfgVar, zzbcc zzbccVar, boolean z, zzbst zzbstVar, zzbso zzbsoVar, zzecl zzeclVar) {
        this.zzd = zzbccVar;
        this.zzc = zzcfgVar;
        this.zzs = z;
        this.zzx = zzbstVar;
        this.zzG = zzeclVar;
    }

    private static WebResourceResponse zzY() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzaY)).booleanValue()) {
            return new WebResourceResponse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzZ(String str, Map map) throws IOException {
        Throwable th;
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i2 = zzfra.zzb;
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.util.zzs zzr = com.google.android.gms.ads.internal.zzv.zzr();
                try {
                    zzcfg zzcfgVar = this.zzc;
                    zzr.zzg(zzcfgVar.getContext(), zzcfgVar.zzm().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zzc(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zze(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Protocol is null");
                        webResourceResponse = zzY();
                        break;
                    }
                    if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unsupported scheme: " + protocol);
                        webResourceResponse = zzY();
                        break;
                    }
                    String str2 = "Redirecting to " + headerField;
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze(str2);
                    httpURLConnection.disconnect();
                    url = url2;
                } catch (Throwable th2) {
                    th = th2;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            com.google.android.gms.ads.internal.zzv.zzr();
            com.google.android.gms.ads.internal.zzv.zzr();
            String contentType = httpURLConnection.getContentType();
            boolean isEmpty = TextUtils.isEmpty(contentType);
            String str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            String trim = isEmpty ? str3 : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzv.zzr();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i6 = 1;
                    while (true) {
                        if (i6 >= split.length) {
                            break;
                        }
                        if (split[i6].trim().startsWith("charset")) {
                            String[] split2 = split[i6].trim().split("=");
                            if (split2.length > 1) {
                                str3 = split2[1].trim();
                                break;
                            }
                        }
                        i6++;
                    }
                }
            }
            String str4 = str3;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzv.zzs().zzb(trim, str4, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbkf) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    public final void zzac(final View view, final zzbya zzbyaVar, final int i) {
        if (!zzbyaVar.zzi() || i <= 0) {
            return;
        }
        zzbyaVar.zzg(view);
        if (!zzbyaVar.zzi()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfh
            @Override // java.lang.Runnable
            public final void run() {
                zzcfo.this.zzac(view, zzbyaVar, i - 1);
            }
        }, 100L);
    }

    private static final boolean zzad(zzcfg zzcfgVar) {
        return zzcfgVar.zzD() != null && zzcfgVar.zzD().zzb();
    }

    private static final boolean zzae(boolean z, zzcfg zzcfgVar) {
        return z && !zzcfgVar.zzO().zzi() && !zzcfgVar.zzU().equals("interstitial_mb");
    }

    public static /* synthetic */ void zzh(zzcfo zzcfoVar) {
        zzcfg zzcfgVar = zzcfoVar.zzc;
        zzcfgVar.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzcfgVar.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            return;
        }
        zzn(parse);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            zzcfg zzcfgVar = this.zzc;
            if (zzcfgVar.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzcfgVar.zzX();
                return;
            }
            this.zzB = true;
            zzcgx zzcgxVar = this.zzj;
            if (zzcgxVar != null) {
                zzcgxVar.zza();
                this.zzj = null;
            }
            zzk();
            zzcfg zzcfgVar2 = this.zzc;
            if (zzcfgVar2.zzL() == null) {
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmq)).booleanValue()) {
                return;
            }
            zzcfgVar2.zzL().zzG(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case WorkQueueKt.MASK /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbya zzbyaVar = this.zza;
                        if (zzbyaVar != null) {
                            zzbyaVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzded zzdedVar = this.zzm;
                    if (zzdedVar != null) {
                        zzdedVar.zzdf();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcfg zzcfgVar = this.zzc;
            if (!zzcfgVar.zzG().willNotDraw()) {
                try {
                    zzavu zzI = zzcfgVar.zzI();
                    zzfda zzS = zzcfgVar.zzS();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmu)).booleanValue() || zzS == null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            parse = zzI.zza(parse, zzcfgVar.getContext(), (View) zzcfgVar, zzcfgVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        parse = zzS.zza(parse, zzcfgVar.getContext(), (View) zzcfgVar, zzcfgVar.zzi());
                    }
                } catch (zzavv unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzc()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcfg zzcfgVar2 = this.zzc;
                    if (zzcfgVar2 == null) {
                        str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        str2 = zzcfgVar2.zzr();
                    }
                    zzv(zzcVar, true, false, str2);
                } else {
                    zzbVar.zzb(str);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            zzn(parse);
        }
        return true;
    }

    public final void zzA(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcfg zzcfgVar = this.zzc;
        boolean zzaF = zzcfgVar.zzaF();
        boolean zzae = zzae(zzaF, zzcfgVar);
        boolean z4 = true;
        if (!zzae && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzae ? null : this.zzg;
        zzcfn zzcfnVar = zzaF ? null : new zzcfn(zzcfgVar, this.zzh);
        zzbiv zzbivVar = this.zzk;
        zzecl zzeclVar = null;
        zzbix zzbixVar = this.zzl;
        boolean z5 = z4;
        zzcfn zzcfnVar2 = zzcfnVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzm = zzcfgVar.zzm();
        zzded zzdedVar = z5 ? null : this.zzm;
        if (zzad(zzcfgVar)) {
            zzeclVar = this.zzG;
        }
        zzy(new AdOverlayInfoParcel(zzaVar, zzcfnVar2, zzbivVar, zzbixVar, zzadVar, zzcfgVar, z, i, str, zzm, zzdedVar, zzeclVar, z3));
    }

    public final void zzB(String str, zzbkf zzbkfVar) {
        synchronized (this.zzf) {
            HashMap hashMap = this.zze;
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                hashMap.put(str, list);
            }
            list.add(zzbkfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzC(zzcgw zzcgwVar) {
        this.zzi = zzcgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzD(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzE(int i, int i2) {
        zzbso zzbsoVar = this.zzz;
        if (zzbsoVar != null) {
            zzbsoVar.zze(i, i2);
        }
    }

    public final void zzF(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzH(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzI() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcaf.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfi
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfo.zzh(zzcfo.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzJ(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzK(zzcgx zzcgxVar) {
        this.zzj = zzcgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzL(zzbya zzbyaVar) {
        this.zza = zzbyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzM(zzcmq zzcmqVar, zzeca zzecaVar, zzfjy zzfjyVar) {
        zzQ("/click");
        if (zzecaVar == null || zzfjyVar == null) {
            zzded zzdedVar = this.zzm;
            zzbkf zzbkfVar = zzbke.zza;
            zzB("/click", new zzbjd(zzdedVar, zzcmqVar));
            return;
        }
        zzB("/click", new zzfde(this.zzm, zzcmqVar, zzfjyVar, zzecaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzN(zzcmq zzcmqVar) {
        zzQ("/click");
        zzded zzdedVar = this.zzm;
        zzbkf zzbkfVar = zzbke.zza;
        zzB("/click", new zzbjd(zzdedVar, zzcmqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzO(zzcmq zzcmqVar, zzeca zzecaVar, zzdsj zzdsjVar) {
        zzQ("/open");
        zzB("/open", new zzbkr(this.zzy, this.zzz, zzecaVar, zzdsjVar, zzcmqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzP(zzfca zzfcaVar) {
        zzcfg zzcfgVar = this.zzc;
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcfgVar.getContext())) {
            zzQ("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbkl(zzcfgVar.getContext(), zzfcaVar.zzaw));
        }
    }

    public final void zzQ(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzR(String str, zzbkf zzbkfVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbkfVar);
        }
    }

    public final void zzS(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbkf> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbkf zzbkfVar : list) {
                if (predicate.apply(zzbkfVar)) {
                    arrayList.add(zzbkfVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzT() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzU() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzV() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzW() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzX(com.google.android.gms.ads.internal.client.zza zzaVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbix zzbixVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, zzbki zzbkiVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbsv zzbsvVar, zzbya zzbyaVar, final zzeca zzecaVar, final zzfjy zzfjyVar, zzdsj zzdsjVar, zzbkz zzbkzVar, zzded zzdedVar, zzbky zzbkyVar, zzbks zzbksVar, zzbkg zzbkgVar, zzcmq zzcmqVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbyaVar, null) : zzbVar;
        zzcfg zzcfgVar = this.zzc;
        this.zzz = new zzbso(zzcfgVar, zzbsvVar);
        this.zza = zzbyaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbf)).booleanValue()) {
            zzB("/adMetadata", new zzbiu(zzbivVar));
        }
        if (zzbixVar != null) {
            zzB("/appEvent", new zzbiw(zzbixVar));
        }
        zzB("/backButton", zzbke.zzj);
        zzB("/refresh", zzbke.zzk);
        zzB("/canOpenApp", zzbke.zzb);
        zzB("/canOpenURLs", zzbke.zza);
        zzB("/canOpenIntents", zzbke.zzc);
        zzB("/close", zzbke.zzd);
        zzB("/customClose", zzbke.zze);
        zzB("/instrument", zzbke.zzn);
        zzB("/delayPageLoaded", zzbke.zzp);
        zzB("/delayPageClosed", zzbke.zzq);
        zzB("/getLocationInfo", zzbke.zzr);
        zzB("/log", zzbke.zzg);
        zzB("/mraid", new zzbkm(zzbVar2, this.zzz, zzbsvVar));
        zzbst zzbstVar = this.zzx;
        if (zzbstVar != null) {
            zzB("/mraidLoaded", zzbstVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbkr(zzbVar3, this.zzz, zzecaVar, zzdsjVar, zzcmqVar));
        zzB("/precache", new zzcdo());
        zzB("/touch", zzbke.zzi);
        zzB("/video", zzbke.zzl);
        zzB("/videoMeta", zzbke.zzm);
        if (zzecaVar == null || zzfjyVar == null) {
            zzB("/click", new zzbjd(zzdedVar, zzcmqVar));
            zzB("/httpTrack", zzbke.zzf);
        } else {
            zzB("/click", new zzfde(zzdedVar, zzcmqVar, zzfjyVar, zzecaVar));
            zzB("/httpTrack", new zzbkf() { // from class: com.google.android.gms.internal.ads.zzfdf
                @Override // com.google.android.gms.internal.ads.zzbkf
                public final void zza(Object obj, Map map) {
                    zzcex zzcexVar = (zzcex) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfca zzD = zzcexVar.zzD();
                    if (zzD == null || zzD.zzai) {
                        zzfcd zzR = ((zzcgj) zzcexVar).zzR();
                        if (zzR == null) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                            return;
                        }
                        zzecaVar.zzd(new zzecc(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis(), zzR.zzb, str, 2));
                        return;
                    }
                    zzfjy.this.zzd(str, zzD.zzax, null, null);
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcfgVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcfgVar.zzD() != null) {
                hashMap = zzcfgVar.zzD().zzaw;
            }
            zzB("/logScionEvent", new zzbkl(zzcfgVar.getContext(), hashMap));
        }
        if (zzbkiVar != null) {
            zzB("/setInterstitialProperties", new zzbkh(zzbkiVar));
        }
        if (zzbkzVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjp)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkzVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjI)).booleanValue() && zzbkyVar != null) {
            zzB("/shareSheet", zzbkyVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjN)).booleanValue() && zzbksVar != null) {
            zzB("/inspectorOutOfContextTest", zzbksVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjS)).booleanValue() && zzbkgVar != null) {
            zzB("/inspectorStorage", zzbkgVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlV)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbke.zzu);
            zzB("/presentPlayStoreOverlay", zzbke.zzv);
            zzB("/expandPlayStoreOverlay", zzbke.zzw);
            zzB("/collapsePlayStoreOverlay", zzbke.zzx);
            zzB("/closePlayStoreOverlay", zzbke.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzdB)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbke.zzA);
            zzB("/resetPAID", zzbke.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmp)).booleanValue() && zzcfgVar.zzD() != null && zzcfgVar.zzD().zzar) {
            zzB("/writeToLocalStorage", zzbke.zzB);
            zzB("/clearLocalStorageKeys", zzbke.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbivVar;
        this.zzl = zzbixVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdedVar;
        this.zzA = zzdsjVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: NoClassDefFoundError -> 0x02b1, Exception | NoClassDefFoundError -> 0x02b3, TRY_ENTER, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b3, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:27:0x00d3, B:28:0x00df, B:38:0x013e, B:39:0x0162, B:57:0x01a3, B:66:0x01ec, B:67:0x0211, B:68:0x0237, B:69:0x0238, B:71:0x0242, B:73:0x0248, B:75:0x027b, B:79:0x0287, B:82:0x0297, B:84:0x029d, B:86:0x02ab), top: B:95:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e1 A[Catch: all -> 0x01c7, TryCatch #2 {all -> 0x01c7, blocks: (B:53:0x017f, B:55:0x0191, B:56:0x0198, B:62:0x01cf, B:64:0x01e1, B:65:0x01e8), top: B:92:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238 A[Catch: NoClassDefFoundError -> 0x02b1, Exception | NoClassDefFoundError -> 0x02b3, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b3, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:27:0x00d3, B:28:0x00df, B:38:0x013e, B:39:0x0162, B:57:0x01a3, B:66:0x01ec, B:67:0x0211, B:68:0x0237, B:69:0x0238, B:71:0x0242, B:73:0x0248, B:75:0x027b, B:79:0x0287, B:82:0x0297, B:84:0x029d, B:86:0x02ab), top: B:95:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0287 A[Catch: NoClassDefFoundError -> 0x02b1, Exception | NoClassDefFoundError -> 0x02b3, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b3, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:27:0x00d3, B:28:0x00df, B:38:0x013e, B:39:0x0162, B:57:0x01a3, B:66:0x01ec, B:67:0x0211, B:68:0x0237, B:69:0x0238, B:71:0x0242, B:73:0x0248, B:75:0x027b, B:79:0x0287, B:82:0x0297, B:84:0x029d, B:86:0x02ab), top: B:95:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029d A[Catch: NoClassDefFoundError -> 0x02b1, Exception | NoClassDefFoundError -> 0x02b3, TryCatch #11 {Exception | NoClassDefFoundError -> 0x02b3, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:27:0x00d3, B:28:0x00df, B:38:0x013e, B:39:0x0162, B:57:0x01a3, B:66:0x01ec, B:67:0x0211, B:68:0x0237, B:69:0x0238, B:71:0x0242, B:73:0x0248, B:75:0x027b, B:79:0x0287, B:82:0x0297, B:84:0x029d, B:86:0x02ab), top: B:95:0x000c }] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfo.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzdH() {
        zzded zzdedVar = this.zzm;
        if (zzdedVar != null) {
            zzdedVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzdf() {
        zzded zzdedVar = this.zzm;
        if (zzdedVar != null) {
            zzdedVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzdsj zze() {
        return this.zzA;
    }

    public final void zzk() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcc)).booleanValue()) {
                zzcfg zzcfgVar = this.zzc;
                if (zzcfgVar.zzl() != null) {
                    zzbdl.zza(zzcfgVar.zzl().zza(), zzcfgVar.zzk(), "awfllc");
                }
            }
            zzcgw zzcgwVar = this.zzi;
            if (this.zzC || this.zzo) {
                z = false;
            }
            zzcgwVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzl() {
        zzbya zzbyaVar = this.zza;
        if (zzbyaVar != null) {
            zzbyaVar.zzf();
            this.zza = null;
        }
        zzab();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbso zzbsoVar = this.zzz;
            if (zzbsoVar != null) {
                zzbsoVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    public final void zzm(boolean z) {
        this.zzE = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzn(Uri uri) {
        final String str;
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(String.valueOf(uri))));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgV)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zzg() == null) {
                return;
            }
            if (path == null || path.length() < 2) {
                str = "null";
            } else {
                str = path.substring(1);
            }
            zzcaf.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcfo.zzb;
                    com.google.android.gms.ads.internal.zzv.zzp().zzg().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfV)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzfX)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgdn.zzr(com.google.android.gms.ads.internal.zzv.zzr().zzb(uri), new zzcfm(this, list, path, uri), zzcaf.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzQ(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzo() {
        zzbcc zzbccVar = this.zzd;
        if (zzbccVar != null) {
            zzbccVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = GamesActivityResultCodes.RESULT_APP_MISCONFIGURED;
        this.zzq = "Page loaded delay cancel.";
        zzk();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzp() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzq() {
        this.zzD--;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzr(int i, int i2, boolean z) {
        zzbst zzbstVar = this.zzx;
        if (zzbstVar != null) {
            zzbstVar.zzb(i, i2);
        }
        zzbso zzbsoVar = this.zzz;
        if (zzbsoVar != null) {
            zzbsoVar.zzd(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzs() {
        zzbya zzbyaVar = this.zza;
        if (zzbyaVar != null) {
            zzcfg zzcfgVar = this.zzc;
            WebView zzG = zzcfgVar.zzG();
            if (!ViewCompat.isAttachedToWindow(zzG)) {
                zzab();
                zzcfl zzcflVar = new zzcfl(this, zzbyaVar);
                this.zzH = zzcflVar;
                ((View) zzcfgVar).addOnAttachStateChangeListener(zzcflVar);
                return;
            }
            zzac(zzG, zzbyaVar, 10);
        }
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        zzcfg zzcfgVar = this.zzc;
        boolean zzaF = zzcfgVar.zzaF();
        boolean z4 = false;
        boolean z5 = zzae(zzaF, zzcfgVar) || z2;
        if (z5 || !z) {
            z3 = zzaF;
            z4 = true;
        } else {
            z3 = zzaF;
        }
        zzded zzdedVar = null;
        com.google.android.gms.ads.internal.client.zza zzaVar = z5 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = z3 ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzm = zzcfgVar.zzm();
        if (!z4) {
            zzdedVar = this.zzm;
        }
        zzy(new AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzadVar, zzm, zzcfgVar, zzdedVar, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzecl zzeclVar = this.zzG;
        zzcfg zzcfgVar = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcfgVar, zzcfgVar.zzm(), str, str2, 14, zzeclVar));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzded zzdedVar;
        zzecl zzeclVar;
        int i2;
        boolean z3;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        zzcfg zzcfgVar = this.zzc;
        boolean zzae = zzae(zzcfgVar.zzaF(), zzcfgVar);
        boolean z4 = true;
        if (!zzae && z2) {
            z4 = false;
        }
        if (zzae) {
            zzaVar = null;
            zzdedVar = null;
        } else {
            zzaVar = this.zzg;
            zzdedVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzecl zzeclVar2 = zzdedVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzm = zzcfgVar.zzm();
        zzded zzdedVar2 = z4 ? zzeclVar2 : this.zzm;
        if (zzad(zzcfgVar)) {
            zzeclVar = this.zzG;
            z3 = z;
            i2 = i;
            zzaVar2 = zzaVar;
        } else {
            zzeclVar = zzeclVar2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        zzy(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcfgVar, z3, i2, zzm, zzdedVar2, zzeclVar));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbso zzbsoVar = this.zzz;
        boolean zzf = zzbsoVar != null ? zzbsoVar.zzf() : false;
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzf, this.zzA);
        zzbya zzbyaVar = this.zza;
        if (zzbyaVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbyaVar.zzh(str);
        }
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzcfg zzcfgVar = this.zzc;
        boolean zzaF = zzcfgVar.zzaF();
        boolean zzae = zzae(zzaF, zzcfgVar);
        boolean z3 = true;
        if (!zzae && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzae ? null : this.zzg;
        zzcfn zzcfnVar = zzaF ? null : new zzcfn(zzcfgVar, this.zzh);
        zzbiv zzbivVar = this.zzk;
        zzecl zzeclVar = null;
        zzbix zzbixVar = this.zzl;
        boolean z4 = z3;
        zzcfn zzcfnVar2 = zzcfnVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel zzm = zzcfgVar.zzm();
        zzded zzdedVar = z4 ? null : this.zzm;
        if (zzad(zzcfgVar)) {
            zzeclVar = this.zzG;
        }
        zzy(new AdOverlayInfoParcel(zzaVar, zzcfnVar2, zzbivVar, zzbixVar, zzadVar, zzcfgVar, z, i, str, str2, zzm, zzdedVar, zzeclVar));
    }
}
