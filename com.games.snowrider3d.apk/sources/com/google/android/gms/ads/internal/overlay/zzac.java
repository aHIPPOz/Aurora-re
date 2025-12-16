package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzded;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzac extends zzbtp implements zzazw {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private final boolean zzf;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private boolean zzg = false;
    private boolean zzh = false;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzfe)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzac(android.app.Activity r3, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzc = r0
            r2.zzd = r0
            r2.zze = r0
            r2.zzg = r0
            r2.zzh = r0
            r2.zza = r4
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzeZ
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzfa
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzfe
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L79
        L48:
            com.google.android.gms.ads.internal.overlay.zzc r3 = r4.zza
            if (r3 == 0) goto L79
            boolean r3 = r3.zzj
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MANUFACTURER
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzfc
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r1.zzb(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzfd
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r1.zzb(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            r0 = 1
        L79:
            r2.zzf = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzac.<init>(android.app.Activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel):void");
    }

    public static /* synthetic */ void zzb(zzac zzacVar) {
        if (zzacVar.zzg) {
            zzacVar.zzb.finish();
        }
    }

    private final synchronized void zzc() {
        if (!this.zzd) {
            zzr zzrVar = this.zza.zzc;
            if (zzrVar != null) {
                zzrVar.zzdw(4);
            }
            this.zzd = true;
            if (this.zzf) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzfe)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzb().zze(this);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final boolean zzH() throws RemoteException {
        return ((Boolean) zzbd.zzc().zzb(zzbde.zzfa)).booleanValue() && this.zzf && this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final void zza(boolean z) {
        if (!z) {
            this.zzh = true;
        } else if (!this.zzh) {
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzh(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzl(Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjn)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
        } else if (z) {
            this.zzb.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzded zzdedVar = adOverlayInfoParcel.zzu;
                if (zzdedVar != null) {
                    zzdedVar.zzdf();
                }
                Activity activity = this.zzb;
                if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                    zzrVar.zzdt();
                }
            }
            if (this.zzf) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzfe)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzb().zzc(this);
                }
            }
            Activity activity2 = this.zzb;
            zzc zzcVar = adOverlayInfoParcel.zza;
            zzad zzadVar = adOverlayInfoParcel.zzi;
            com.google.android.gms.ads.internal.zzv.zzi();
            if (zza.zzb(activity2, zzcVar, zzadVar, zzcVar.zzi, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                return;
            }
            activity2.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzm() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzo() throws RemoteException {
        this.zzg = false;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdk();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzp(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzr() throws RemoteException {
        if (this.zzc) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzd();
        }
        if (!this.zzf) {
            return;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzeZ)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
            @Override // java.lang.Runnable
            public final void run() {
                zzac.zzb(zzac.this);
            }
        }, ((Integer) zzbd.zzc().zzb(zzbde.zzfb)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzs(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzt() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzu() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzv() throws RemoteException {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}
