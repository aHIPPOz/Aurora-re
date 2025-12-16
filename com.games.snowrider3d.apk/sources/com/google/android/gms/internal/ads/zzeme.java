package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeme implements zzeub {
    final zzfcw zza;
    private final long zzb;

    public zzeme(zzfcw zzfcwVar, long j) {
        this.zza = zzfcwVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeub
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcva) obj).zzb;
        zzfcw zzfcwVar = this.zza;
        bundle.putString("slotname", zzfcwVar.zzf);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcwVar.zzd;
        boolean z = true;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        zzfdk.zze(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i2 = zzmVar.zzt;
            if (i2 == -1) {
                z = false;
            }
            zzfdk.zze(bundle, "tag_for_under_age_of_consent", i2, z);
        }
        zzfdk.zzc(bundle, ImagesContract.URL, zzmVar.zzl);
        zzfdk.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = zzmVar.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhP)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdk.zzb(bundle, "extras", bundle3);
    }

    @Override // com.google.android.gms.internal.ads.zzeub
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcva) obj).zza;
        zzfcw zzfcwVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcwVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfcwVar.zzf);
        int i = zzfcwVar.zzo.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        boolean z = true;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfdk.zzg(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfdk.zzf(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = zzmVar.zzb;
        zzfdk.zzf(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        zzfdk.zzb(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        zzfdk.zze(bundle, "cust_gender", i3, i3 != -1);
        zzfdk.zzd(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        zzfdk.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzfdk.zze(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfdk.zzf(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
            bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
            bundle2.putLong("long", (long) (1.0E7d * location.getLongitude()));
            bundle2.putLong("time", location.getTime() * 1000);
            bundle.putBundle("uule", bundle2);
        }
        zzfdk.zzc(bundle, ImagesContract.URL, zzmVar.zzl);
        zzfdk.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfdk.zzb(bundle, "custom_targeting", zzmVar.zzn);
        zzfdk.zzd(bundle, "category_exclusions", zzmVar.zzo);
        zzfdk.zzc(bundle, "request_agent", zzmVar.zzp);
        zzfdk.zzc(bundle, "request_pkg", zzmVar.zzq);
        zzfdk.zzg(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 < 8) {
            return;
        }
        int i6 = zzmVar.zzt;
        if (i6 == -1) {
            z = false;
        }
        zzfdk.zze(bundle, "tag_for_under_age_of_consent", i6, z);
        zzfdk.zzc(bundle, "max_ad_content_rating", zzmVar.zzu);
    }
}
