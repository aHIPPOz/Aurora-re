package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    public static /* bridge */ /* synthetic */ zzcj zza(zzp zzpVar) {
        Bundle bundle;
        Application application;
        Application application2;
        List list;
        zzaq zzaqVar;
        Application application3;
        Application application4;
        Application application5;
        List list2;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        long j;
        Application application9;
        zzcj zzcjVar = new zzcj();
        String zza = zzpVar.zzd.zza();
        String str = null;
        if (TextUtils.isEmpty(zza)) {
            try {
                zzn zznVar = zzpVar.zza;
                application = zznVar.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcjVar.zza = zza;
        ConsentDebugSettings consentDebugSettings = zzpVar.zzc;
        if (!consentDebugSettings.isTestDevice()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzce.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzce.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                arrayList.add(zzce.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                arrayList.add(zzce.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        }
        zzcjVar.zzi = list;
        zzn zznVar2 = zzpVar.zza;
        zzaqVar = zznVar2.zzb;
        zzcjVar.zze = zzaqVar.zzc();
        zzcjVar.zzd = Boolean.valueOf(zzpVar.zzd.isTagForUnderAgeOfConsent());
        zzcjVar.zzc = Locale.getDefault().toLanguageTag();
        zzcf zzcfVar = new zzcf();
        zzcfVar.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzcfVar.zza = Build.MODEL;
        zzcfVar.zzc = 2;
        zzcjVar.zzb = zzcfVar;
        application3 = zznVar2.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar2.zza;
        application4.getResources().getConfiguration();
        zzch zzchVar = new zzch();
        zzchVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzchVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar2.zza;
        zzchVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcg zzcgVar = new zzcg();
                        zzcgVar.zzb = Integer.valueOf(rect.left);
                        zzcgVar.zzc = Integer.valueOf(rect.right);
                        zzcgVar.zza = Integer.valueOf(rect.top);
                        zzcgVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzcgVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzchVar.zzd = list2;
        zzcjVar.zzf = zzchVar;
        application6 = zznVar2.zza;
        try {
            application9 = zznVar2.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = application6.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        application7 = zznVar3.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar3.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        if (applicationLabel != null) {
            str = applicationLabel.toString();
        }
        zzcdVar.zzb = str;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
            zzcdVar.zzc = Long.toString(j);
        }
        zzcjVar.zzg = zzcdVar;
        zzci zzciVar = new zzci();
        zzciVar.zza = "3.2.0";
        zzcjVar.zzh = zzciVar;
        return zzcjVar;
    }
}
