package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzevc implements zzeuc {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzj zzg;

    public zzevc(zzbzj zzbzjVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbzjVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzdt)).booleanValue() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzdu)).booleanValue() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzevd zzc(com.google.android.gms.internal.ads.zzevc r7, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            com.google.android.gms.internal.ads.zzfsa r0 = new com.google.android.gms.internal.ads.zzfsa
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzdt
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L72
        L1c:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzdu
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L72
        L2f:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            com.google.android.gms.internal.ads.zzfse r1 = com.google.android.gms.internal.ads.zzfse.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.Object r2 = java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r2     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.String r2 = r2.getId()     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzdz     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.Object r0 = r4.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            com.google.android.gms.internal.ads.zzfsa r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L60 java.io.IOException -> L62
            goto L72
        L60:
            r0 = move-exception
            goto L63
        L62:
            r0 = move-exception
        L63:
            r7 = r0
            java.lang.String r0 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzbzs r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r7, r0)
            com.google.android.gms.internal.ads.zzfsa r0 = new com.google.android.gms.internal.ads.zzfsa
            r0.<init>()
        L72:
            com.google.android.gms.internal.ads.zzevd r7 = new com.google.android.gms.internal.ads.zzevd
            r1 = 0
            r7.<init>(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevc.zzc(com.google.android.gms.internal.ads.zzevc, com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzevd");
    }

    public static /* synthetic */ zzevd zzd(zzevc zzevcVar, Throwable th) {
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        ContentResolver contentResolver = zzevcVar.zza.getContentResolver();
        return new zzevd(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfsa());
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        zzgde zzw = zzgde.zzw(this.zzg.zza(this.zza, this.zzd));
        zzfve zzfveVar = new zzfve() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                return zzevc.zzc(zzevc.this, (AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgde) zzgdn.zze((zzgde) zzgdn.zzo((zzgde) zzgdn.zzm(zzw, zzfveVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbi)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfve() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                return zzevc.zzd(zzevc.this, (Throwable) obj);
            }
        }, executor);
    }
}
