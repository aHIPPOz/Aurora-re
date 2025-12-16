package com.unity3d.player.a;

import android.util.Log;
/* renamed from: com.unity3d.player.a.q */
/* loaded from: classes2.dex */
public abstract class AbstractC0061q {
    public static boolean a = false;

    public static void Log(int i, String str) {
        if (a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i != 5) {
            return;
        }
        Log.w("Unity", str);
    }
}
