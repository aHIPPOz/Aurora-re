package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzecm;
import com.google.android.gms.internal.ads.zzecn;
import com.google.android.gms.internal.ads.zzedf;
import com.google.android.gms.internal.ads.zzedh;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfwg;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public class zzm extends zzbtp implements zzah {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcfg zzd;
    zzi zze;
    zzu zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzh zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzf(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        zzedh zzQ;
        zzedf zzP;
        zzcfg zzcfgVar = this.zzd;
        if (zzcfgVar == null) {
            return;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() || (zzP = zzcfgVar.zzP()) == null) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfB)).booleanValue() || (zzQ = zzcfgVar.zzQ()) == null || !zzQ.zzb()) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzC().zzg(zzQ.zza(), view);
            return;
        }
        zzP.zza(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzaU)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzaT)).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzK(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzaa r4 = com.google.android.gms.ads.internal.zzv.zzs()
            boolean r6 = r4.zzd(r3, r6)
            boolean r4 = r5.zzk
            if (r4 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzaU
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r4.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzaT
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r0.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = r2
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzl r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.view.Window r6 = r3.getWindow()
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbr
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7b
            if (r2 == 0) goto L78
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7d
        L78:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7d
        L7b:
            r0 = 256(0x100, float:3.59E-43)
        L7d:
            r6.setSystemUiVisibility(r0)
            return
        L81:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L99
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L98
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L98:
            return
        L99:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzK(android.content.res.Configuration):void");
    }

    private static final void zzL(zzedh zzedhVar, View view) {
        if (zzedhVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfB)).booleanValue() && zzedhVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzC().zzj(zzedhVar.zza(), view);
    }

    public final void zzA(int i) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzb(zzbde.zzgk)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzb(zzbde.zzgl)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzbd.zzc().zzb(zzbde.zzgm)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzbd.zzc().zzb(zzbde.zzgn)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzD(boolean r42) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzD(boolean):void");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzr = true;
            if (this.zzq != null) {
                zzfrw zzfrwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfrwVar.removeCallbacks(this.zzq);
                zzfrwVar.post(this.zzq);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        zzcfg zzcfgVar = this.zzd;
        if (zzcfgVar != null) {
            zzcfgVar.zzZ(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzr && this.zzd.zzaC()) {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzfn)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzds();
                    }
                    this.zzq = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzm.this.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzq, ((Long) zzbd.zzc().zzb(zzbde.zzbk)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() || !this.zzd.canGoBack()) {
            boolean zzaH = this.zzd.zzaH();
            if (!zzaH) {
                this.zzd.zzd("onbackblocked", Collections.emptyMap());
            }
            return zzaH;
        }
        this.zzd.goBack();
        return false;
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcfg zzcfgVar = this.zzd;
        if (zzcfgVar == null) {
            return;
        }
        zzcfgVar.zzai(null);
    }

    public final void zzc() {
        zzcfg zzcfgVar;
        zzr zzrVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        zzcfg zzcfgVar2 = this.zzd;
        if (zzcfgVar2 != null) {
            this.zzl.removeView(zzcfgVar2.zzF());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzan(zziVar.zzd);
                this.zzd.zzaq(false);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zznc)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzi zziVar2 = this.zze;
                viewGroup.addView(zzF, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzan(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcfgVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcfgVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzecn zzecnVar) throws zzg, RemoteException {
        zzbtj zzbtjVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbtjVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbtjVar.zzg(ObjectWrapper.wrap(zzecnVar));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzh(int i, int i2, Intent intent) {
        zzdsj zze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbcv zzbcvVar = zzbde.zzny;
            if (!((Boolean) zzbd.zzc().zzb(zzbcvVar)).booleanValue()) {
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
            zzcfg zzcfgVar = this.zzd;
            if (zzcfgVar == null || zzcfgVar.zzN() == null || (zze = zzcfgVar.zzN().zze()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzb(zzbcvVar)).booleanValue()) {
                return;
            }
            zzdsi zza2 = zze.zza();
            zza2.zzb("action", "hilca");
            zza2.zzb("gqi", zzfwg.zzc(adOverlayInfoParcel.zzq));
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            zza2.zzb("hilr", sb.toString());
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("callerPackage");
                String stringExtra2 = intent.getStringExtra("loadingStage");
                if (stringExtra != null) {
                    zza2.zzb("hilcp", stringExtra);
                }
                if (stringExtra2 != null) {
                    zza2.zzb("hills", stringExtra2);
                }
            }
            zza2.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzK((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: zzg -> 0x010a, TryCatch #0 {zzg -> 0x010a, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:20:0x0040, B:22:0x004b, B:23:0x004d, B:25:0x0053, B:26:0x005f, B:28:0x0066, B:31:0x006d, B:33:0x0071, B:34:0x0073, B:36:0x0077, B:38:0x007c, B:39:0x0086, B:41:0x008a, B:43:0x008e, B:45:0x0094, B:46:0x0097, B:48:0x009d, B:49:0x00a0, B:51:0x00a6, B:53:0x00aa, B:54:0x00ad, B:56:0x00b3, B:57:0x00b6, B:64:0x00e1, B:66:0x00e5, B:67:0x00ec, B:68:0x00ed, B:70:0x00f1, B:72:0x00fe, B:74:0x0102, B:75:0x0109), top: B:79:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe A[Catch: zzg -> 0x010a, TryCatch #0 {zzg -> 0x010a, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:20:0x0040, B:22:0x004b, B:23:0x004d, B:25:0x0053, B:26:0x005f, B:28:0x0066, B:31:0x006d, B:33:0x0071, B:34:0x0073, B:36:0x0077, B:38:0x007c, B:39:0x0086, B:41:0x008a, B:43:0x008e, B:45:0x0094, B:46:0x0097, B:48:0x009d, B:49:0x00a0, B:51:0x00a6, B:53:0x00aa, B:54:0x00ad, B:56:0x00b3, B:57:0x00b6, B:64:0x00e1, B:66:0x00e5, B:67:0x00ec, B:68:0x00ed, B:70:0x00f1, B:72:0x00fe, B:74:0x0102, B:75:0x0109), top: B:79:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbtq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzm() {
        zzcfg zzcfgVar = this.zzd;
        if (zzcfgVar != null) {
            try {
                this.zzl.removeView(zzcfgVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzo() {
        zzr zzrVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdk();
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzecm zze = zzecn.zze();
            zze.zza(activity);
            zze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzr() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzd();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue()) {
            zzcfg zzcfgVar = this.zzd;
            if (zzcfgVar == null || zzcfgVar.zzaE()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
                return;
            }
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzt() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue()) {
            zzcfg zzcfgVar = this.zzd;
            if (zzcfgVar == null || zzcfgVar.zzaE()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
                return;
            }
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzu() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfp)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzv() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    public final void zzw(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((Integer) zzbd.zzc().zzb(zzbde.zzfs)).intValue();
        int i = 0;
        boolean z2 = ((Boolean) zzbd.zzc().zzb(zzbde.zzbn)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : intValue;
        if (true != z2) {
            i = intValue;
        }
        zztVar.zzb = i;
        zztVar.zzc = intValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbd.zzc().zzb(zzbde.zzbl)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzbd.zzc().zzb(zzbde.zzbm)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbsu(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
