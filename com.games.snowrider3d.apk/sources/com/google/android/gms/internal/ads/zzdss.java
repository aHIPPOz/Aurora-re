package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public class zzdss {
    protected final Context zzb;
    protected final Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final CsiUrlBuilder zzf;
    protected final Map zza = new HashMap();
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference(new Bundle());
    protected final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcj)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzco)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhh)).booleanValue();

    public zzdss(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        String str = (String) zzbey.zza.zze();
        this.zzc = executor;
        this.zzd = zzuVar;
        this.zzf = csiUrlBuilder;
        this.zzb = context;
    }

    private final void zza(Map map) {
        if (map == null || map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkW);
            this.zzj.set(com.google.android.gms.ads.internal.util.zzad.zza(this.zzb, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdsq
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    r0.zzj.set(com.google.android.gms.ads.internal.util.zzad.zzb(zzdss.this.zzb, str));
                }
            }));
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    private final void zzh(Map map, boolean z) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty paramMap.");
            return;
        }
        zza(map);
        final String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (!this.zze) {
            return;
        }
        if (z && !this.zzg) {
            return;
        }
        if (parseBoolean && !this.zzh) {
            return;
        }
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsp
            @Override // java.lang.Runnable
            public final void run() {
                zzdss.this.zzd.zza(generateUrl);
            }
        });
    }

    public final String zzb(Map map) {
        return this.zzf.generateUrl(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty paramMap.");
            return;
        }
        zza(map);
        final String generateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznA)).booleanValue() && !this.zze) {
            return;
        }
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsr
            @Override // java.lang.Runnable
            public final void run() {
                zzdss.this.zzd.zza(generateUrl);
            }
        });
    }

    public final void zzf(Map map) {
        zzh(map, true);
    }

    public final void zzg(Map map) {
        zzh(map, false);
    }
}
