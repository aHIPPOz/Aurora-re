package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdt {
    private final Map zzb;
    private final List zza = new LinkedList();
    private final Object zzc = new Object();

    public zzbdt(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbdq zzf() {
        return new zzbdq(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime(), null, null);
    }

    public final zzbds zza() {
        zzbds zzbdsVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcc)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            List<zzbdq> list = this.zza;
            for (zzbdq zzbdqVar : list) {
                long zza = zzbdqVar.zza();
                String zzc = zzbdqVar.zzc();
                zzbdq zzb = zzbdqVar.zzb();
                if (zzb != null && zza > 0) {
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza - zzb.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append('+');
                            sb2.append(zzc);
                        }
                    }
                }
            }
            list.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbdsVar = new zzbds(sb.toString(), str);
        }
        return zzbdsVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbdt zzbdtVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbdj zzg;
        if (!TextUtils.isEmpty(str2) && (zzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) != null) {
            synchronized (this.zzc) {
                zzbdp zza = zzg.zza(str);
                Map map = this.zzb;
                map.put(str, zza.zza((String) map.get(str), str2));
            }
        }
    }

    public final boolean zze(zzbdq zzbdqVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbdq(j, strArr[0], zzbdqVar));
        }
        return true;
    }
}
