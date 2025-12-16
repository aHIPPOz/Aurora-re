package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzv {
    private final zzdso zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhe)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhf)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhj)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhi)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzt(this));

    public zzv(zzdso zzdsoVar) {
        this.zzh = zzdsoVar;
    }

    public static /* synthetic */ void zzd(zzv zzvVar, zzdsd zzdsdVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzvVar.zzj(zzdsdVar, arrayDeque, TypedValues.TransitionType.S_TO);
        zzvVar.zzj(zzdsdVar, arrayDeque2, "of");
    }

    private final synchronized void zzi(final zzdsd zzdsdVar) {
        if (!this.zzc) {
            return;
        }
        ArrayDeque arrayDeque = this.zzg;
        final ArrayDeque clone = arrayDeque.clone();
        arrayDeque.clear();
        ArrayDeque arrayDeque2 = this.zzf;
        final ArrayDeque clone2 = arrayDeque2.clone();
        arrayDeque2.clear();
        zzcaf.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.lang.Runnable
            public final void run() {
                zzv.zzd(zzv.this, zzdsdVar, clone, clone2);
            }
        });
    }

    private final void zzj(zzdsd zzdsdVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsdVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final synchronized void zzk() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdsd zzdsdVar) {
        zzu zzuVar = (zzu) this.zze.get(str);
        zzdsdVar.zzb().put("request_id", str);
        if (zzuVar != null) {
            zzdsdVar.zzb().put("mhit", "true");
            return zzuVar.zzb;
        }
        zzdsdVar.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void zze(String str, String str2, zzdsd zzdsdVar) {
        this.zze.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdsdVar);
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar != null) {
            Set set = zzuVar.zzc;
            set.add(str2);
            return set.size() < i;
        }
        return false;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar != null) {
            if (zzuVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
