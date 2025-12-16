package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcmq {
    zzbup zza;
    zzbup zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzedi zze;
    private final zzdpo zzf;
    private final zzgdy zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcmq(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzedi zzediVar, zzdpo zzdpoVar, zzgdy zzgdyVar, zzgdy zzgdyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzediVar;
        this.zzf = zzdpoVar;
        this.zzg = zzgdyVar;
        this.zzh = zzgdyVar2;
        this.zzi = scheduledExecutorService;
    }

    public static /* synthetic */ ListenableFuture zzb(zzcmq zzcmqVar, final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkH), "1");
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkG), "12");
            if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkI))) {
                buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkJ));
            }
            return (zzgde) zzgdn.zzn(zzgde.zzw(zzcmqVar.zze.zzb(buildUpon.build(), inputEvent)), new zzgcu() { // from class: com.google.android.gms.internal.ads.zzcmm
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj) {
                    zzbcv zzbcvVar = zzbde.zzkG;
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbcvVar), "12");
                    return zzgdn.zzh(builder2.toString());
                }
            }, zzcmqVar.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkG), "10");
        return zzgdn.zzh(builder.toString());
    }

    public static /* synthetic */ ListenableFuture zzd(zzcmq zzcmqVar, Uri.Builder builder, final Throwable th) {
        zzcmqVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
            @Override // java.lang.Runnable
            public final void run() {
                zzcmq.zzh(zzcmq.this, th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkG), "9");
        return zzgdn.zzh(builder.toString());
    }

    public static /* synthetic */ void zzg(zzcmq zzcmqVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkL)).booleanValue()) {
            zzbup zzc = zzbun.zzc(zzcmqVar.zzc);
            zzcmqVar.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbup zza = zzbun.zza(zzcmqVar.zzc);
        zzcmqVar.zza = zza;
        zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    public static /* synthetic */ void zzh(zzcmq zzcmqVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkL)).booleanValue()) {
            zzbup zzc = zzbun.zzc(zzcmqVar.zzc);
            zzcmqVar.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
            return;
        }
        zzbup zza = zzbun.zza(zzcmqVar.zzc);
        zzcmqVar.zza = zza;
        zza.zzh(th, "AttributionReportingSampled");
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkE));
    }

    private final ListenableFuture zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkE)) || this.zzd.zzN()) {
                return zzgdn.zzh(str);
            }
            final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkF), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent == null) {
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkG), "11");
                return zzgdn.zzh(buildUpon.toString());
            }
            return (zzgde) zzgdn.zzf((zzgde) zzgdn.zzn(zzgde.zzw(this.zze.zza()), new zzgcu() { // from class: com.google.android.gms.internal.ads.zzcmk
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj) {
                    return zzcmq.zzb(zzcmq.this, buildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.zzh), Throwable.class, new zzgcu() { // from class: com.google.android.gms.internal.ads.zzcml
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final ListenableFuture zza(Object obj) {
                    return zzcmq.zzd(zzcmq.this, buildUpon, (Throwable) obj);
                }
            }, this.zzg);
        } catch (Exception e) {
            return zzgdn.zzg(e);
        }
    }

    public final ListenableFuture zze(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgdn.zzh(str);
        }
        return zzgdn.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgcu() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // com.google.android.gms.internal.ads.zzgcu
            public final ListenableFuture zza(Object obj) {
                zzcmq zzcmqVar = zzcmq.this;
                String str2 = str;
                return zzcmqVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmq.zzg(zzcmq.this, r2);
                    }
                });
            }
        }, this.zzg);
    }

    public final void zzi(String str, zzfjy zzfjyVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ListenableFuture zzk = zzk(str, this.zzf.zza(), random);
        zzbcv zzbcvVar = zzbde.zzkK;
        zzgdn.zzr(zzgdn.zzo(zzk, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbcvVar)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmp(this, zzfjyVar, str, zzvVar), this.zzg);
    }
}
