package com.unity3d.player.a;

import android.app.Activity;
import android.os.Build;
import com.unity3d.player.UnityPlayer;
import java.lang.Thread;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class N implements Thread.UncaughtExceptionHandler {
    public volatile Thread.UncaughtExceptionHandler a;
    public String b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            String name = thread.getName();
            StringBuilder append = sb.append("FATAL EXCEPTION [" + name + "]\n").append("Unity version     : 6000.2.10f1\n");
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            StringBuilder append2 = append.append("Device model      : " + str2 + " " + str3 + "\n");
            String str4 = Build.FINGERPRINT;
            StringBuilder sb2 = new StringBuilder("Device fingerprint: ");
            sb2.append(str4);
            sb2.append("\n");
            StringBuilder append3 = append2.append(sb2.toString());
            String arrays = Arrays.toString(Build.SUPPORTED_ABIS);
            StringBuilder append4 = append3.append("CPU supported ABI : " + arrays + "\n").append("Build Type        : Release\nScripting Backend : IL2CPP\n");
            String str5 = this.b;
            StringBuilder append5 = append4.append("Libs loaded from  : " + str5 + "\n");
            try {
                Activity activity = UnityPlayer.currentActivity;
                str = String.valueOf(activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.getBoolean("unity.strip-engine-code"));
            } catch (Exception unused) {
                str = "Undefined";
            }
            Error error = new Error(append5.append("Strip Engine Code : " + str + "\n").toString());
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.a.uncaughtException(thread, error);
        } catch (Throwable unused2) {
            this.a.uncaughtException(thread, th);
        }
    }
}
