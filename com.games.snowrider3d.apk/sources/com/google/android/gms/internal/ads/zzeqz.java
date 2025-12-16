package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeqz implements zzeuc {
    private final Context zza;
    private final zzgdy zzb;

    public zzeqz(Context context, zzgdy zzgdyVar) {
        this.zza = context;
        this.zzb = zzgdyVar;
    }

    public static /* synthetic */ zzeqx zzc(zzeqz zzeqzVar) {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzv.zzr();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgo)).booleanValue();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String string = !booleanValue ? str : zzeqzVar.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgq)).booleanValue()) {
            str = zzeqzVar.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        Context context = zzeqzVar.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgp)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        }
        return new zzeqx(string, str, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqz.zzc(zzeqz.this);
            }
        });
    }
}
