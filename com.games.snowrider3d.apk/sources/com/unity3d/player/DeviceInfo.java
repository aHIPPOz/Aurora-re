package com.unity3d.player;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import java.io.File;
import java.util.Locale;
/* loaded from: classes2.dex */
class DeviceInfo {
    DeviceInfo() {
    }

    public static String getSystemLanguage() {
        return Locale.getDefault().toString();
    }

    public static String getLocaleList(Context context) {
        int i = 0;
        if (PlatformSupport.NOUGAT_SUPPORT) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            StringBuilder sb = new StringBuilder();
            while (i < locales.size()) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(locales.get(i).toString());
                i++;
            }
            return sb.toString();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        StringBuilder sb2 = new StringBuilder();
        while (i < availableLocales.length) {
            if (i > 0) {
                sb2.append(",");
            }
            sb2.append(availableLocales[i].toString());
            i++;
        }
        return sb2.toString();
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static long getTotalSpace(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || !cacheDir.exists()) {
            return -1L;
        }
        return Math.round((float) (cacheDir.getTotalSpace() / 1024));
    }

    public static long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }
}
