package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbso extends zzbsu {
    private String zza = "top-right";
    private boolean zzb = true;
    private int zzc = 0;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = -1;
    private final Object zzi = new Object();
    private final zzcfg zzj;
    private final Activity zzk;
    private zzchd zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsv zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbso(zzcfg zzcfgVar, zzbsv zzbsvVar) {
        super(zzcfgVar, "resize");
        this.zzj = zzcfgVar;
        this.zzk = zzcfgVar.zzi();
        this.zzo = zzbsvVar;
    }

    public final void zzm(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlm)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzln)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlo)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcfg zzcfgVar = this.zzj;
                    viewGroup2.addView((View) zzcfgVar);
                    zzcfgVar.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcfg zzcfgVar2 = this.zzj;
                viewGroup3.addView((View) zzcfgVar2);
                zzcfgVar2.zzaj(this.zzl);
            }
        }
        if (z) {
            zzl("default");
            zzbsv zzbsvVar = this.zzo;
            if (zzbsvVar != null) {
                zzbsvVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzll)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzm(z);
                } else {
                    zzcaf.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbso.this.zzm(z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0278, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0296 A[Catch: all -> 0x0472, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ac, B:36:0x00bd, B:38:0x00cb, B:39:0x00d9, B:41:0x00e7, B:42:0x00e9, B:44:0x00ed, B:46:0x00f1, B:48:0x00f7, B:51:0x00ff, B:55:0x0124, B:61:0x0130, B:62:0x013b, B:64:0x013f, B:93:0x01a2, B:94:0x01ad, B:95:0x01b8, B:96:0x01c3, B:97:0x01c6, B:98:0x01ce, B:99:0x01d3, B:100:0x01e7, B:101:0x01f2, B:102:0x01f5, B:103:0x01fd, B:105:0x0200, B:107:0x0204, B:109:0x0208, B:112:0x020f, B:113:0x021e, B:116:0x023f, B:118:0x0245, B:120:0x0248, B:123:0x024e, B:125:0x0256, B:126:0x0258, B:127:0x025d, B:128:0x0267, B:130:0x0272, B:131:0x0277, B:133:0x0279, B:135:0x0296, B:137:0x02a2, B:138:0x02d8, B:139:0x02db, B:169:0x038d, B:170:0x0394, B:171:0x039b, B:172:0x03a2, B:173:0x03a9, B:174:0x03af, B:175:0x03b6, B:176:0x03bc, B:177:0x03d4, B:178:0x03f0, B:180:0x03f8, B:181:0x03ff, B:182:0x0425, B:185:0x0428, B:187:0x0449, B:188:0x045b, B:190:0x045d, B:191:0x0462, B:193:0x0464, B:194:0x0469, B:196:0x046b, B:197:0x0470), top: B:202:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045d A[Catch: all -> 0x0472, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:9:0x0014, B:11:0x001c, B:12:0x0021, B:14:0x0023, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003a, B:22:0x003f, B:24:0x0041, B:26:0x004f, B:27:0x0060, B:29:0x006e, B:30:0x007f, B:32:0x008d, B:33:0x009e, B:35:0x00ac, B:36:0x00bd, B:38:0x00cb, B:39:0x00d9, B:41:0x00e7, B:42:0x00e9, B:44:0x00ed, B:46:0x00f1, B:48:0x00f7, B:51:0x00ff, B:55:0x0124, B:61:0x0130, B:62:0x013b, B:64:0x013f, B:93:0x01a2, B:94:0x01ad, B:95:0x01b8, B:96:0x01c3, B:97:0x01c6, B:98:0x01ce, B:99:0x01d3, B:100:0x01e7, B:101:0x01f2, B:102:0x01f5, B:103:0x01fd, B:105:0x0200, B:107:0x0204, B:109:0x0208, B:112:0x020f, B:113:0x021e, B:116:0x023f, B:118:0x0245, B:120:0x0248, B:123:0x024e, B:125:0x0256, B:126:0x0258, B:127:0x025d, B:128:0x0267, B:130:0x0272, B:131:0x0277, B:133:0x0279, B:135:0x0296, B:137:0x02a2, B:138:0x02d8, B:139:0x02db, B:169:0x038d, B:170:0x0394, B:171:0x039b, B:172:0x03a2, B:173:0x03a9, B:174:0x03af, B:175:0x03b6, B:176:0x03bc, B:177:0x03d4, B:178:0x03f0, B:180:0x03f8, B:181:0x03ff, B:182:0x0425, B:185:0x0428, B:187:0x0449, B:188:0x045b, B:190:0x045d, B:191:0x0462, B:193:0x0464, B:194:0x0469, B:196:0x046b, B:197:0x0470), top: B:202:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbso.zzc(java.util.Map):void");
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }
}
