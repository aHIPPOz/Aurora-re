package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfju {
    private final zzehb zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfco zzf;
    private final zzfcp zzg;
    private final Clock zzh;
    private final zzavu zzi;

    public zzfju(zzehb zzehbVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfco zzfcoVar, zzfcp zzfcpVar, Clock clock, zzavu zzavuVar) {
        this.zza = zzehbVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcoVar;
        this.zzg = zzfcpVar;
        this.zzh = clock;
        this.zzi = zzavuVar;
    }

    public static String zzc(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return str.replaceAll(str2, str3);
    }

    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : com.google.android.gms.ads.internal.util.client.zzl.zzk() ? "fakeForAdDebugLog" : str;
    }

    public final List zzd(zzfcn zzfcnVar, zzfca zzfcaVar, List list) {
        return zze(zzfcnVar, zzfcaVar, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, list, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
        if (r2 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfcn r11, com.google.android.gms.internal.ads.zzfca r12, boolean r13, java.lang.String r14, java.lang.String r15, java.util.List r16, com.google.android.gms.internal.ads.zzcuu r17) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfju.zze(com.google.android.gms.internal.ads.zzfcn, com.google.android.gms.internal.ads.zzfca, boolean, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.ads.zzcuu):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzf(com.google.android.gms.internal.ads.zzfca r11, java.util.List r12, com.google.android.gms.internal.ads.zzbwc r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb0
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb0
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzdP
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzfcp r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfvn r4 = com.google.android.gms.internal.ads.zzfvn.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzfco r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzfco r4 = r10.zzf
        L37:
            com.google.android.gms.internal.ads.zzfvn r4 = com.google.android.gms.internal.ads.zzfvn.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfjs r5 = new com.google.android.gms.internal.ads.zzfjs
            r5.<init>()
            com.google.android.gms.internal.ads.zzfvn r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfjt r7 = new com.google.android.gms.internal.ads.zzfjt
            r7.<init>()
            com.google.android.gms.internal.ads.zzfvn r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5f:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzc(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzc(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzc(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyq.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L5f
        Laf:
            return r0
        Lb0:
            r11 = move-exception
            int r12 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r12 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfju.zzf(com.google.android.gms.internal.ads.zzfca, java.util.List, com.google.android.gms.internal.ads.zzbwc):java.util.List");
    }
}
