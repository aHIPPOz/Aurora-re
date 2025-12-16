package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcmc implements zzclg {
    private final CookieManager zza;

    public zzcmc(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzv.zzs().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzclg
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbc);
            String cookie = cookieManager.getCookie(str);
            if (cookie == null) {
                return;
            }
            List zzf = zzfwe.zzb(zzfva.zzc(';')).zzf(cookie);
            for (int i = 0; i < zzf.size(); i++) {
                Iterator it = zzfwe.zzb(zzfva.zzc('=')).zzd((String) zzf.get(i)).iterator();
                it.getClass();
                if (it.hasNext()) {
                    cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzaO))));
                } else {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbc), str2);
    }
}
