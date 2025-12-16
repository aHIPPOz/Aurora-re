package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzavu;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzu zza;

    public /* synthetic */ zzr(zzu zzuVar, zzt zztVar) {
        Objects.requireNonNull(zzuVar);
        this.zza = zzuVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        WebView webView;
        WebView webView2;
        zzu zzuVar = this.zza;
        String str = (String) obj;
        webView = zzuVar.zzf;
        if (webView == null || str == null) {
            return;
        }
        webView2 = zzuVar.zzf;
        webView2.loadUrl(str);
    }

    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        Throwable e;
        Future future;
        try {
            zzu zzuVar = this.zza;
            future = zzuVar.zzc;
            zzuVar.zzh = (zzavu) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        } catch (ExecutionException e3) {
            e = e3;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        } catch (TimeoutException e4) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
        return this.zza.zzq();
    }
}
