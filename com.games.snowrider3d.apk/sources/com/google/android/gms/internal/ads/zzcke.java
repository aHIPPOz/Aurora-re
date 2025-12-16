package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcke extends com.google.android.gms.ads.internal.client.zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdpz zzc;
    private final zzedo zzd;
    private final zzeju zze;
    private final zzdun zzf;
    private final zzbyo zzg;
    private final zzdqe zzh;
    private final zzdvi zzi;
    private final zzbfx zzj;
    private final zzfhx zzk;
    private final zzfds zzl;
    private final zzctl zzm;
    private final zzdsj zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime());

    public zzcke(Context context, VersionInfoParcel versionInfoParcel, zzdpz zzdpzVar, zzedo zzedoVar, zzeju zzejuVar, zzdun zzdunVar, zzbyo zzbyoVar, zzdqe zzdqeVar, zzdvi zzdviVar, zzbfx zzbfxVar, zzfhx zzfhxVar, zzfds zzfdsVar, zzctl zzctlVar, zzdsj zzdsjVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdpzVar;
        this.zzd = zzedoVar;
        this.zze = zzejuVar;
        this.zzf = zzdunVar;
        this.zzg = zzbyoVar;
        this.zzh = zzdqeVar;
        this.zzi = zzdviVar;
        this.zzj = zzbfxVar;
        this.zzk = zzfhxVar;
        this.zzl = zzfdsVar;
        this.zzm = zzctlVar;
        this.zzn = zzdsjVar;
    }

    public static /* synthetic */ void zzc(zzcke zzckeVar, Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (!zzckeVar.zzc.zzd()) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (zzbpk zzbpkVar : zze.values()) {
            for (zzbpj zzbpjVar : zzbpkVar.zza) {
                String str = zzbpjVar.zzb;
                for (String str2 : zzbpjVar.zza) {
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, new ArrayList());
                    }
                    if (str != null) {
                        ((List) hashMap.get(str2)).add(str);
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            try {
                zzedp zza = zzckeVar.zzd.zza(str3, jSONObject);
                if (zza != null) {
                    zzfdu zzfduVar = (zzfdu) zza.zzb;
                    if (!zzfduVar.zzC() && zzfduVar.zzB()) {
                        zzfduVar.zzj(zzckeVar.zza, (zzefe) zza.zzc, (List) entry.getValue());
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized rewarded video mediation adapter " + str3);
                    }
                }
            } catch (zzfdd e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi() {
        this.zzf.zzq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(boolean z) throws RemoteException {
        try {
            Context context = this.zza;
            zzfsb.zza(context).zzc(z);
            if (z) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                    return;
                }
                throw new IOException("Failed to remove query_info_shared_prefs");
            } catch (IOException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzk() {
        if (this.zzo) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        Context context = this.zza;
        zzbde.zza(context);
        com.google.android.gms.ads.internal.zzv.zzp().zzu(context, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zzf();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeq)).booleanValue()) {
            this.zzh.zzf();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjE)).booleanValue()) {
            zzcaf.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjz
                @Override // java.lang.Runnable
                public final void run() {
                    zzcke.this.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzls)).booleanValue()) {
            zzcaf.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcke.this.zzj.zza(new zzbus());
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzdl)).booleanValue()) {
            zzcaf.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcka
                @Override // java.lang.Runnable
                public final void run() {
                    zzfea.zzb(zzcke.this.zza, true);
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeT)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeU)).booleanValue()) {
                zzcaf.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckb
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.internal.zzv.zzf().zzd(r0.zza, zzcke.this.zzn);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.client.zzdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzl(java.lang.String r13, com.google.android.gms.dynamic.IObjectWrapper r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.zza
            com.google.android.gms.internal.ads.zzbde.zza(r0)
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzev
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2b
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch: android.os.RemoteException -> L1f java.lang.RuntimeException -> L21
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzs.zzq(r0)     // Catch: android.os.RemoteException -> L1f java.lang.RuntimeException -> L21
            goto L2d
        L1f:
            r0 = move-exception
            goto L22
        L21:
            r0 = move-exception
        L22:
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
        L2b:
            java.lang.String r0 = ""
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L36
            r6 = r13
            goto L37
        L36:
            r6 = r0
        L37:
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 == 0) goto L3e
            goto L97
        L3e:
            com.google.android.gms.internal.ads.zzbcv r13 = com.google.android.gms.internal.ads.zzbde.zzeo
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r13 = r0.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbe
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r1.zzb(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r13 = r13 | r1
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7b
            java.lang.Object r13 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r14)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            com.google.android.gms.internal.ads.zzckd r14 = new com.google.android.gms.internal.ads.zzckd
            r14.<init>()
            goto L7d
        L7b:
            r14 = 0
            r2 = r13
        L7d:
            r7 = r14
            if (r2 == 0) goto L97
            android.content.Context r4 = r12.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r12.zzb
            com.google.android.gms.internal.ads.zzfhx r8 = r12.zzk
            com.google.android.gms.internal.ads.zzdsj r9 = r12.zzn
            java.lang.Long r10 = r12.zzp
            com.google.android.gms.internal.ads.zzdvi r13 = r12.zzi
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzv.zza()
            boolean r11 = r13.zzq()
            r3.zzc(r4, r5, r6, r7, r8, r9, r10, r11)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcke.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        this.zzi.zzh(zzdnVar, zzdvh.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbpq zzbpqVar) throws RemoteException {
        this.zzl.zzf(zzbpqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzv.zzt().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzr(String str) {
        Context context = this.zza;
        zzbde.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeo)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zza().zzc(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzq());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs(zzbmk zzbmkVar) throws RemoteException {
        this.zzf.zzs(zzbmkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjQ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(com.google.android.gms.ads.internal.client.zzfx zzfxVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzfxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzv.zzt().zze();
    }

    public final void zzx() {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
            String zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzi();
            if (com.google.android.gms.ads.internal.zzv.zzu().zzj(this.zza, zzi, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(false);
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzw(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }
}
