package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeti implements zzeuc {
    public static final /* synthetic */ int zzb = 0;
    private static final zzetj zzc = new zzetj(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgdy zzd;
    private final ScheduledExecutorService zze;
    private final zzeju zzf;
    private final Context zzg;
    private final zzfcw zzh;
    private final zzejq zzi;
    private final zzdpz zzj;
    private final zzdup zzk;
    private final int zzl;

    public zzeti(zzgdy zzgdyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeju zzejuVar, Context context, zzfcw zzfcwVar, zzejq zzejqVar, zzdpz zzdpzVar, zzdup zzdupVar, int i) {
        this.zzd = zzgdyVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzejuVar;
        this.zzg = context;
        this.zzh = zzfcwVar;
        this.zzi = zzejqVar;
        this.zzj = zzdpzVar;
        this.zzk = zzdupVar;
        this.zzl = i;
    }

    public static /* synthetic */ ListenableFuture zzc(zzeti zzetiVar) {
        String str;
        final Bundle bundle;
        zzeti zzetiVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlq)).booleanValue()) {
            str = zzetiVar.zzh.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzetiVar.zzh.zzf;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbP)).booleanValue()) {
            bundle = zzetiVar.zzk.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbY)).booleanValue()) {
            zzeju zzejuVar = zzetiVar.zzf;
            for (Map.Entry entry : ((zzfyt) zzejuVar.zzb(zzetiVar.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                zzeti zzetiVar3 = zzetiVar;
                arrayList.add(zzetiVar3.zzg(str2, (List) entry.getValue(), zzetiVar.zzf(str2), true, true));
                zzetiVar = zzetiVar3;
            }
            zzetiVar2 = zzetiVar;
            zzetiVar2.zzi(arrayList, zzejuVar.zzc());
        } else {
            zzetiVar2 = zzetiVar;
            zzetiVar2.zzi(arrayList, zzetiVar2.zzf.zza(zzetiVar2.zza, str));
        }
        return zzgdn.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = zzeti.zzb;
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzetj(jSONArray.toString(), bundle);
            }
        }, zzetiVar2.zzd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(2:4|(3:6|7|(2:12|(2:14|28)(1:15))(3:16|(1:18)|(2:20|(2:22|29)(2:23|30))(2:24|25))))|26|8|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r0);
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzeti r7, java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) {
        /*
            com.google.android.gms.internal.ads.zzcak r3 = new com.google.android.gms.internal.ads.zzcak
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbcv r12 = com.google.android.gms.internal.ads.zzbde.zzbQ
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzejq r12 = r7.zzi
            r12.zzb(r8)
            com.google.android.gms.internal.ads.zzbrp r12 = r12.zza(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdpz r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbrp r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zzbG
            com.google.android.gms.internal.ads.zzbdc r9 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r7 = r9.zzb(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4d
            com.google.android.gms.internal.ads.zzejx.zzb(r8, r3)
            goto Lbc
        L4d:
            throw r1
        L4e:
            com.google.android.gms.internal.ads.zzejx r0 = new com.google.android.gms.internal.ads.zzejx
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzv.zzD()
            long r4 = r12.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbcv r8 = com.google.android.gms.internal.ads.zzbde.zzbL
            com.google.android.gms.internal.ads.zzbdc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r12.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzeth r12 = new com.google.android.gms.internal.ads.zzeth
            r12.<init>()
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzbE
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8d:
            if (r11 == 0) goto Lb9
            com.google.android.gms.internal.ads.zzbcv r8 = com.google.android.gms.internal.ads.zzbde.zzbS
            com.google.android.gms.internal.ads.zzbdc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r11.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzgdy r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzete r0 = new com.google.android.gms.internal.ads.zzete
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lbc
        Lb2:
            r1 = r7
            r4 = r9
            r7 = r10
            r1.zzh(r2, r7, r4, r0)
            goto Lbc
        Lb9:
            r0.zzd()
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzd(com.google.android.gms.internal.ads.zzeti, java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    public static /* synthetic */ void zze(zzeti zzetiVar, zzbrp zzbrpVar, Bundle bundle, List list, zzejx zzejxVar, zzcak zzcakVar) {
        try {
            zzetiVar.zzh(zzbrpVar, bundle, list, zzejxVar);
        } catch (RemoteException e) {
            zzcakVar.zzd(e);
        }
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgde zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgct zzgctVar = new zzgct() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // com.google.android.gms.internal.ads.zzgct
            public final ListenableFuture zza() {
                return zzeti.zzd(zzeti.this, str, list, bundle, z, z2);
            }
        };
        zzgdy zzgdyVar = this.zzd;
        zzgde zzw = zzgde.zzw(zzgdn.zzk(zzgctVar, zzgdyVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbL)).booleanValue()) {
            zzw = (zzgde) zzgdn.zzo(zzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbE)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgde) zzgdn.zze(zzw, Throwable.class, new zzfve() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i = zzeti.zzb;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznu)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgdyVar);
    }

    private final void zzh(zzbrp zzbrpVar, Bundle bundle, List list, zzejx zzejxVar) throws RemoteException {
        zzbrpVar.zzh(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzejxVar);
    }

    private final void zzi(List list, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzejy zzejyVar = (zzejy) entry.getValue();
            String str = zzejyVar.zza;
            list.add(zzg(str, Collections.singletonList(zzejyVar.zze), zzf(str), zzejyVar.zzb, zzejyVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        if (this.zzl == 2) {
            return zzgdn.zzh(zzc);
        }
        zzfcw zzfcwVar = this.zzh;
        if (zzfcwVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzbR)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcwVar.zzd)))) {
                return zzgdn.zzh(zzc);
            }
        }
        return zzgdn.zzk(new zzgct() { // from class: com.google.android.gms.internal.ads.zzetc
            @Override // com.google.android.gms.internal.ads.zzgct
            public final ListenableFuture zza() {
                return zzeti.zzc(zzeti.this);
            }
        }, this.zzd);
    }
}
