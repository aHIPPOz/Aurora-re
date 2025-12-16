package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbsy extends NativeAd.Image {
    private final zzbgp zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARN: Can't wrap try/catch for region: R(20:2|(2:41|3)|(17:5|9|35|10|13|33|14|17|31|18|21|39|22|25|(2:37|27)|28|29)|8|9|35|10|13|33|14|17|31|18|21|39|22|25|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r5);
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r2);
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbsy(com.google.android.gms.internal.ads.zzbgp r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            r4.zzb = r5
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r5 = r5.zzf()     // Catch: android.os.RemoteException -> L15
            if (r5 == 0) goto L19
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5     // Catch: android.os.RemoteException -> L15
            goto L1a
        L15:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r5)
        L19:
            r5 = r1
        L1a:
            r4.zzc = r5
            com.google.android.gms.internal.ads.zzbgp r5 = r4.zzb     // Catch: android.os.RemoteException -> L23
            android.net.Uri r5 = r5.zze()     // Catch: android.os.RemoteException -> L23
            goto L28
        L23:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r5)
            r5 = r1
        L28:
            r4.zzd = r5
            com.google.android.gms.internal.ads.zzbgp r5 = r4.zzb     // Catch: android.os.RemoteException -> L31
            double r2 = r5.zzb()     // Catch: android.os.RemoteException -> L31
            goto L37
        L31:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r5)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L37:
            r4.zze = r2
            r5 = -1
            com.google.android.gms.internal.ads.zzbgp r2 = r4.zzb     // Catch: android.os.RemoteException -> L41
            int r2 = r2.zzd()     // Catch: android.os.RemoteException -> L41
            goto L46
        L41:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r2)
            r2 = r5
        L46:
            r4.zzf = r2
            com.google.android.gms.internal.ads.zzbgp r2 = r4.zzb     // Catch: android.os.RemoteException -> L4f
            int r5 = r2.zzc()     // Catch: android.os.RemoteException -> L4f
            goto L53
        L4f:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r2)
        L53:
            r4.zzg = r5
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzek
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r0.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L6d
            com.google.android.gms.internal.ads.zzbgp r5 = r4.zzb     // Catch: android.os.RemoteException -> L6d
            java.util.Map r1 = r5.zzg()     // Catch: android.os.RemoteException -> L6d
        L6d:
            r4.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsy.<init>(com.google.android.gms.internal.ads.zzbgp):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zzf;
    }
}
