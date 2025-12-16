package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzetm implements zzeuc {
    private final zzbyo zza;
    private final zzgdy zzb;
    private final Context zzc;

    public zzetm(zzbyo zzbyoVar, zzgdy zzgdyVar, Context context) {
        this.zza = zzbyoVar;
        this.zzb = zzgdyVar;
        this.zzc = context;
    }

    public static /* synthetic */ zzetn zzc(zzetm zzetmVar) {
        zzbyo zzbyoVar = zzetmVar.zza;
        Context context = zzetmVar.zzc;
        if (!zzbyoVar.zzp(context)) {
            return new zzetn(null, null, null, null, null);
        }
        String zze = zzbyoVar.zze(context);
        String str = zze == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zze;
        String zzc = zzbyoVar.zzc(context);
        String str2 = zzc == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzc;
        String zzb = zzbyoVar.zzb(context);
        String str3 = zzb == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzb;
        boolean zzp = zzbyoVar.zzp(context);
        Long l = null;
        String str4 = true != zzp ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzaz);
        }
        return new zzetn(str, str2, str3, str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4, l);
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetm.zzc(zzetm.this);
            }
        });
    }
}
