package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbde;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzcb {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzcb(Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        Map map = this.zza;
        if (map.containsKey(str)) {
            return;
        }
        if (Objects.equals(str, "__default__")) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        } else {
            sharedPreferences = this.zzc.getSharedPreferences(str, 0);
        }
        zzca zzcaVar = new zzca(this, str);
        map.put(str, zzcaVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkQ)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        Map zzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkV));
        for (String str : zzw.keySet()) {
            zzb(str);
        }
        zzd(new zzbz(zzw));
    }

    final synchronized void zzd(zzbz zzbzVar) {
        this.zzb.add(zzbzVar);
    }
}
