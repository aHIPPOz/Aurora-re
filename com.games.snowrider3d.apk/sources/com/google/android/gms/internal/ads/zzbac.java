package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbac extends Thread {
    private final zzazt zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final Object zzc = new Object();
    private final int zzf = ((Long) zzbev.zzd.zze()).intValue();
    private final int zzg = ((Long) zzbev.zza.zze()).intValue();
    private final int zzh = ((Long) zzbev.zze.zze()).intValue();
    private final int zzi = ((Long) zzbev.zzc.zze()).intValue();
    private final int zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzak)).intValue();
    private final int zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzal)).intValue();
    private final int zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzam)).intValue();
    private final int zze = ((Long) zzbev.zzf.zze()).intValue();
    private final String zzm = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzao);
    private final boolean zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzap)).booleanValue();
    private final boolean zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzaq)).booleanValue();

    public zzbac() {
        zzazt zzaztVar = new zzazt();
        this.zzd = zzaztVar;
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzar)).booleanValue();
        setName("ContentFetchTask");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            Context zzb = com.google.android.gms.ads.internal.zzv.zzb().zzb();
            if (zzb != null) {
                ActivityManager activityManager = (ActivityManager) zzb.getSystemService("activity");
                KeyguardManager keyguardManager = (KeyguardManager) zzb.getSystemService("keyguard");
                if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) zzb.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                try {
                                    Activity zza = com.google.android.gms.ads.internal.zzv.zzb().zza();
                                    if (zza == null) {
                                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: no activity. Sleeping.");
                                        zze();
                                    } else {
                                        View view = null;
                                        try {
                                            if (zza.getWindow() != null && zza.getWindow().getDecorView() != null) {
                                                view = zza.getWindow().getDecorView().findViewById(16908290);
                                            }
                                        } catch (Exception e) {
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "ContentFetchTask.extractContent");
                                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed getting root view of activity. Content not extracted.");
                                        }
                                        if (view != null) {
                                            view.post(new zzazy(this, view));
                                        }
                                    }
                                } catch (InterruptedException e2) {
                                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", e2);
                                } catch (Exception e3) {
                                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", e3);
                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "ContentFetchTask.run");
                                }
                            }
                        }
                    }
                }
            }
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchTask: sleeping");
            zze();
            Thread.sleep(this.zze * 1000);
            Object obj = this.zzc;
            synchronized (obj) {
                while (this.zzb) {
                    try {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    final zzbab zza(View view, zzazs zzazsVar) {
        if (view == null) {
            return new zzbab(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if (!(view instanceof TextView) || (view instanceof EditText)) {
            if (!(view instanceof WebView) || (view instanceof zzcfg)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        zzbab zza = zza(viewGroup.getChildAt(i3), zzazsVar);
                        i += zza.zza;
                        i2 += zza.zzb;
                    }
                    return new zzbab(this, i, i2);
                }
                return new zzbab(this, 0, 0);
            }
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzbab(this, 0, 0);
            }
            zzazsVar.zzf();
            webView.post(new zzbaa(this, zzazsVar, webView, globalVisibleRect));
            return new zzbab(this, 0, 1);
        }
        CharSequence text = ((TextView) view).getText();
        if (!TextUtils.isEmpty(text)) {
            zzazsVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbab(this, 1, 0);
        }
        return new zzbab(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r10 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(android.view.View r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzazs r0 = new com.google.android.gms.internal.ads.zzazs     // Catch: java.lang.Exception -> L7b
            int r1 = r9.zzf     // Catch: java.lang.Exception -> L7b
            int r2 = r9.zzg     // Catch: java.lang.Exception -> L7b
            int r3 = r9.zzh     // Catch: java.lang.Exception -> L7b
            int r4 = r9.zzi     // Catch: java.lang.Exception -> L7b
            int r5 = r9.zzj     // Catch: java.lang.Exception -> L7b
            int r6 = r9.zzk     // Catch: java.lang.Exception -> L7b
            int r7 = r9.zzl     // Catch: java.lang.Exception -> L7b
            boolean r8 = r9.zzo     // Catch: java.lang.Exception -> L7b
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7b
            com.google.android.gms.internal.ads.zzazx r1 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> L7b
            android.content.Context r1 = r1.zzb()     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L4f
            java.lang.String r2 = r9.zzm     // Catch: java.lang.Exception -> L7b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L7b
            if (r3 != 0) goto L4f
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.Exception -> L7b
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzan     // Catch: java.lang.Exception -> L7b
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Exception -> L7b
            java.lang.Object r4 = r5.zzb(r4)     // Catch: java.lang.Exception -> L7b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L7b
            java.lang.String r5 = "id"
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L7b
            int r1 = r3.getIdentifier(r4, r5, r1)     // Catch: java.lang.Exception -> L7b
            java.lang.Object r1 = r10.getTag(r1)     // Catch: java.lang.Exception -> L7b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L4f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L7b
            if (r1 != 0) goto L74
        L4f:
            com.google.android.gms.internal.ads.zzbab r10 = r9.zza(r10, r0)     // Catch: java.lang.Exception -> L7b
            r0.zzj()     // Catch: java.lang.Exception -> L7b
            int r1 = r10.zza     // Catch: java.lang.Exception -> L7b
            if (r1 != 0) goto L5e
            int r1 = r10.zzb     // Catch: java.lang.Exception -> L7b
            if (r1 == 0) goto L74
        L5e:
            int r10 = r10.zzb     // Catch: java.lang.Exception -> L7b
            if (r10 != 0) goto L69
            int r10 = r0.zzb()     // Catch: java.lang.Exception -> L7b
            if (r10 == 0) goto L74
            goto L6b
        L69:
            if (r10 != 0) goto L75
        L6b:
            com.google.android.gms.internal.ads.zzazt r10 = r9.zzd     // Catch: java.lang.Exception -> L7b
            boolean r10 = r10.zzc(r0)     // Catch: java.lang.Exception -> L7b
            if (r10 != 0) goto L74
            goto L75
        L74:
            return
        L75:
            com.google.android.gms.internal.ads.zzazt r10 = r9.zzd     // Catch: java.lang.Exception -> L7b
            r10.zza(r0)     // Catch: java.lang.Exception -> L7b
            return
        L7b:
            r0 = move-exception
            r10 = r0
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r10)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzbzs r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbac.zzb(android.view.View):void");
    }

    public final void zzc(zzazs zzazsVar, WebView webView, String str, boolean z) {
        zzazs zzazsVar2;
        zzazsVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzazsVar2 = zzazsVar;
                    zzazsVar2.zzi(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    zzazsVar.zzi(title + "\n" + optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzazsVar2 = zzazsVar;
                }
            } else {
                zzazsVar2 = zzazsVar;
            }
            if (!zzazsVar2.zzl()) {
                return;
            }
            this.zzd.zzb(zzazsVar2);
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            if (this.zza) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
