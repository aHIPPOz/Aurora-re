package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdvd {
    private final zzdun zza;
    private final zzdpw zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdvd(zzdun zzdunVar, zzdpw zzdpwVar) {
        this.zza = zzdunVar;
        this.zzb = zzdpwVar;
    }

    public final void zzd(List list) {
        String str;
        boolean z;
        zzdpv zza;
        zzbse zzbseVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbmd zzbmdVar = (zzbmd) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjL)).booleanValue()) {
                    zzdpv zza2 = this.zzb.zza(zzbmdVar.zza);
                    if (zza2 != null && (zzbseVar = zza2.zzc) != null) {
                        str = zzbseVar.toString();
                    }
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                } else {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjM)).booleanValue() && (zza = this.zzb.zza(zzbmdVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbmdVar.zza;
                    list2.add(new zzdvc(str3, str2, this.zzb.zzb(str3), zzbmdVar.zzb ? 1 : 0, zzbmdVar.zzd, zzbmdVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbmdVar.zza;
                list22.add(new zzdvc(str32, str2, this.zzb.zzb(str32), zzbmdVar.zzb ? 1 : 0, zzbmdVar.zzd, zzbmdVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzdun zzdunVar = this.zza;
                if (zzdunVar.zzt()) {
                    zzd(zzdunVar.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdvc zzdvcVar : this.zzd) {
                jSONArray.put(zzdvcVar.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdvb(this));
    }
}
