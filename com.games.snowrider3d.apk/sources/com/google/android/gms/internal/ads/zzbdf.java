package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbdf {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbeo.zzc("gad:dynamite_module:experiment_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
        zzc(arrayList, zzbfb.zza);
        zzc(arrayList, zzbfb.zzb);
        zzc(arrayList, zzbfb.zzc);
        zzc(arrayList, zzbfb.zzd);
        zzc(arrayList, zzbfb.zze);
        zzc(arrayList, zzbfb.zzu);
        zzc(arrayList, zzbfb.zzf);
        zzc(arrayList, zzbfb.zzm);
        zzc(arrayList, zzbfb.zzn);
        zzc(arrayList, zzbfb.zzo);
        zzc(arrayList, zzbfb.zzp);
        zzc(arrayList, zzbfb.zzq);
        zzc(arrayList, zzbfb.zzr);
        zzc(arrayList, zzbfb.zzs);
        zzc(arrayList, zzbfb.zzt);
        zzc(arrayList, zzbfb.zzg);
        zzc(arrayList, zzbfb.zzh);
        zzc(arrayList, zzbfb.zzi);
        zzc(arrayList, zzbfb.zzj);
        zzc(arrayList, zzbfb.zzk);
        zzc(arrayList, zzbfb.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbfp.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbeo zzbeoVar) {
        String str = (String) zzbeoVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
