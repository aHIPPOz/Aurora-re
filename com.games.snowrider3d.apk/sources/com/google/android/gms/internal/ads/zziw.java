package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zziw {
    final Context zza;
    zzfwh zzc;
    zzfwh zzd;
    zzfwh zze;
    zzfwh zzf;
    zzfwh zzg;
    zzfve zzh;
    boolean zzs;
    Looper zzi = zzex.zzz();
    zze zzk = zze.zza;
    int zzl = 1;
    boolean zzm = true;
    zzmi zzn = zzmi.zzb;
    zzmh zzo = zzmh.zza;
    zzig zzu = new zzig(0.97f, 1.03f, 1000, 1.0E-7f, zzex.zzs(20), zzex.zzs(500), 0.999f, null);
    zzdj zzb = zzdj.zza;
    long zzp = 500;
    long zzq = 2000;
    boolean zzr = true;
    String zzt = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    int zzj = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;

    public zziw(final Context context, zzcem zzcemVar) {
        zzip zzipVar = new zzip(zzcemVar);
        zziq zziqVar = new zziq(context);
        zzfwh zzfwhVar = new zzfwh() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object zza() {
                return new zzyu(context);
            }
        };
        zzfwh zzfwhVar2 = new zzfwh() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object zza() {
                return new zzij();
            }
        };
        zzit zzitVar = new zzit(context);
        zzfve zzfveVar = new zzfve() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                return new zzot((zzdj) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzipVar;
        this.zzd = zziqVar;
        this.zze = zzfwhVar;
        this.zzf = zzfwhVar2;
        this.zzg = zzitVar;
        this.zzh = zzfveVar;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = zzim.zza;
        }
    }

    public static /* synthetic */ zzvg zza(Context context) {
        return new zzuu(context, new zzadq());
    }
}
