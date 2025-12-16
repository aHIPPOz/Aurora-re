package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzflv implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzflw zza;

    public zzflv(zzflw zzflwVar) {
        Objects.requireNonNull(zzflwVar);
        this.zza = zzflwVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfli.zza.booleanValue();
                    return;
                } else {
                    zzflw.zzc(this.zza, string2);
                    return;
                }
            }
            zzflw.zze(this.zza, string2);
        } catch (JSONException e) {
            zzfnf.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
