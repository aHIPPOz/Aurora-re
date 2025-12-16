package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfbx extends zzbwe {
    private final zzfbn zza;
    private final zzfbd zzb;
    private final zzfco zzc;
    private zzdon zzd;
    private boolean zze = false;

    public zzfbx(zzfbn zzfbnVar, zzfbd zzfbdVar, zzfco zzfcoVar) {
        this.zza = zzfbnVar;
        this.zzb = zzfbdVar;
        this.zzc = zzfcoVar;
    }

    private final synchronized boolean zzy() {
        zzdon zzdonVar = this.zzd;
        if (zzdonVar != null) {
            if (!zzdonVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdon zzdonVar = this.zzd;
        return zzdonVar != null ? zzdonVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzc() throws RemoteException {
        zzdon zzdonVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgW)).booleanValue() && (zzdonVar = this.zzd) != null) {
            return zzdonVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized String zzd() throws RemoteException {
        zzdon zzdonVar = this.zzd;
        if (zzdonVar == null || zzdonVar.zzm() == null) {
            return null;
        }
        return zzdonVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzn().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzfN)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzbwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwj r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzfL     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L60
            if (r0 == 0) goto L2a
            goto L42
        L20:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L60
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L60
        L2a:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfN     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L60
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)
            return
        L44:
            com.google.android.gms.internal.ads.zzfbf r0 = new com.google.android.gms.internal.ads.zzfbf     // Catch: java.lang.Throwable -> L60
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r4.zzd = r1     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzfbn r1 = r4.zza     // Catch: java.lang.Throwable -> L60
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzfbv r3 = new com.google.android.gms.internal.ads.zzfbv     // Catch: java.lang.Throwable -> L60
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L60
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            return
        L60:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L60
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbx.zzg(com.google.android.gms.internal.ads.zzbwj):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final void zzl(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfbw(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final void zzo(zzbwi zzbwiVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final boolean zzt() {
        zzdon zzdonVar = this.zzd;
        return zzdonVar != null && zzdonVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwf
    public final void zzu(zzbwd zzbwdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbwdVar);
    }
}
