package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbun;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes.dex */
public final class zzu implements zze {
    private final Context zza;
    private final String zzb;
    private String zzc;

    public zzu(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzc(String str) throws MalformedURLException {
        Throwable e;
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e2) {
            e = e2;
            zze(str, e);
        } catch (MalformedURLException e3) {
            e = e3;
            zze(str, e);
        } catch (URISyntaxException e4) {
            zze(str, e4);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zze)).booleanValue()) {
                url = zzd(str);
            }
        }
        if (url == null) {
            zzo.zze("Falling back to direct new URL(\"" + str + "\") constructor.");
            return new URL(str);
        }
        return url;
    }

    private final URL zzd(String str) {
        URL url;
        Throwable e;
        try {
            zzo.zze("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String obj = uri.toString();
                zzo.zze("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"" + str + "\" -> encoded URI: " + obj);
                return url;
            } catch (IllegalArgumentException e2) {
                e = e2;
                zze(str, e);
                return url;
            } catch (MalformedURLException e3) {
                e = e3;
                zze(str, e);
                return url;
            } catch (URISyntaxException e4) {
                e = e4;
                zze(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e5) {
            e = e5;
            url = null;
        }
    }

    private final void zze(String str, Throwable th) {
        String message = th.getMessage();
        zzo.zzj("Error while parsing ping URL: " + str + ". " + message);
        zzbun.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((float) ((Integer) zzbd.zzc().zzb(zzbde.zznf)).intValue()) / 100.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide() != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[RETURN] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.zzu.zza(java.lang.String):com.google.android.gms.ads.internal.util.client.zzt");
    }

    public final String zzb() {
        return this.zzc;
    }
}
