package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbyb implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbyb(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb() {
        this.zzc.zzD(true);
        com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
    }

    private final void zzc(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzaN)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        this.zzc.zzD(z);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzgv)).booleanValue() || !z || (context = this.zza) == null) {
            return;
        }
        context.deleteDatabase("OfflineUpload.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:3:0x0002, B:6:0x0019, B:8:0x001f, B:10:0x002b, B:11:0x002e, B:13:0x0032, B:15:0x003a, B:17:0x004a, B:18:0x004d, B:20:0x0051, B:34:0x0083, B:37:0x0097, B:39:0x009b, B:41:0x00a1, B:43:0x00a7, B:45:0x00af), top: B:50:0x0002 }] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzaP     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lb5
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L51
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto L32
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb5
            int r0 = r10.zzb()     // Catch: java.lang.Throwable -> Lb5
            if (r9 == r0) goto L2e
            r8.zzb()     // Catch: java.lang.Throwable -> Lb5
        L2e:
            r10.zzA(r9)     // Catch: java.lang.Throwable -> Lb5
            return
        L32:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb4
            java.lang.String r9 = r9.getString(r10, r2)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r10.zzm()     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = java.util.Objects.equals(r9, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L4d
            r8.zzb()     // Catch: java.lang.Throwable -> Lb5
        L4d:
            r10.zzJ(r9)     // Catch: java.lang.Throwable -> Lb5
            return
        L51:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch: java.lang.Throwable -> Lb5
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> Lb5
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> Lb5
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L75
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L6d
            goto L7d
        L6d:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L7d
            r10 = r7
            goto L7e
        L75:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L7d
            r10 = 0
            goto L7e
        L7d:
            r10 = r3
        L7e:
            if (r10 == 0) goto La1
            if (r10 == r7) goto L83
            goto Lb4
        L83:
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzaN     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r10 = r0.zzb(r10)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto Lb4
            if (r9 == r3) goto Lb4
            int r10 = r8.zze     // Catch: java.lang.Throwable -> Lb5
            if (r10 == r9) goto Lb4
            r8.zze = r9     // Catch: java.lang.Throwable -> Lb5
            r8.zzc(r1, r9)     // Catch: java.lang.Throwable -> Lb5
            return
        La1:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lb5
            if (r10 != 0) goto Lb4
            java.lang.String r10 = r8.zzd     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> Lb5
            if (r10 != 0) goto Lb4
            r8.zzd = r1     // Catch: java.lang.Throwable -> Lb5
            r8.zzc(r1, r9)     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            return
        Lb5:
            r9 = move-exception
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()
            r0.zzw(r9, r10)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyb.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzaP)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
