package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzfna extends WebViewClient {
    final /* synthetic */ zzfnc zza;

    public zzfna(zzfnc zzfncVar) {
        Objects.requireNonNull(zzfncVar);
        this.zza = zzfncVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        Log.w("NativeBridge", "WebView renderer gone: " + obj + "for WebView: " + valueOf);
        zzfnc zzfncVar = this.zza;
        if (zzfncVar.zza() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfncVar.zzn(null);
        }
        webView.destroy();
        return true;
    }
}
