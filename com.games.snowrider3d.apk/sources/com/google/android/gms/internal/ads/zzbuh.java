package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbuh {
    private static zzbza zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzek zzd;
    private final String zze;

    public zzbuh(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzek zzekVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzekVar;
        this.zze = str;
    }

    public static zzbza zza(Context context) {
        zzbza zzbzaVar;
        synchronized (zzbuh.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzbb.zza().zzt(context, new zzbpm());
            }
            zzbzaVar = zza;
        }
        return zzbzaVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVar;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.zzb;
        zzbza zza2 = zza(context);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzd;
        if (zzekVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzg(currentTimeMillis);
            zzmVar = zznVar.zza();
        } else {
            zzekVar.zzp(currentTimeMillis);
            zzmVar = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzekVar);
        }
        try {
            zza2.zzf(wrap, new zzbze(this.zze, this.zzc.name(), null, zzmVar, 0, null), new zzbug(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
