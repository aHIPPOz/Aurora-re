package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzctl implements zzcza, zzdep {
    private zzbvk zza;
    private final Context zzc;
    private final zzfhx zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzctl(Context context, zzfhx zzfhxVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfhxVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    public static /* synthetic */ void zzc(zzctl zzctlVar) {
        zzbco.zze(zzctlVar.zzc);
        zzctlVar.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfe.zzj
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfe.zzk
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfe.zzi
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            com.google.android.gms.internal.ads.zzbzm r0 = r0.zzg()
            java.lang.String r0 = r0.zzc()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzfhx r2 = r5.zzd
            com.google.android.gms.internal.ads.zzbon r3 = com.google.android.gms.ads.internal.zzv.zzg()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbow r0 = r3.zzb(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.zzc
            com.google.android.gms.internal.ads.zzfhx r2 = r5.zzd
            com.google.android.gms.internal.ads.zzbon r3 = com.google.android.gms.ads.internal.zzv.zzg()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbow r0 = r3.zza(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzboq r3 = com.google.android.gms.internal.ads.zzbot.zza
            com.google.android.gms.internal.ads.zzbom r0 = r0.zza(r2, r3, r3)
            android.content.Context r2 = r5.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r5.zze
            com.google.android.gms.internal.ads.zzbvm r4 = new com.google.android.gms.internal.ads.zzbvm
            r4.<init>(r2, r0, r3)
            r5.zza = r4
            r5.zzg = r1
        La5:
            boolean r0 = r5.zzg
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.zzbvk r0 = r5.zza
            if (r0 == 0) goto Ld3
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza()
            boolean r1 = r5.zzh
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.zzbeo r1 = com.google.android.gms.internal.ads.zzbew.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.zzctk r1 = new com.google.android.gms.internal.ads.zzctk
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.zzf
            r0.addListener(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzcai.zza(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzctl.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzcza
    public final void zzdn(zzbvq zzbvqVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcza
    public final void zzdo(zzfcn zzfcnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdep
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdep
    public final void zzf(String str) {
        zzd();
    }
}
