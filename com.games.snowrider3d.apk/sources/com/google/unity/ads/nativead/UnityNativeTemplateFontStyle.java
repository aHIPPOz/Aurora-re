package com.google.unity.ads.nativead;

import android.graphics.Typeface;
import android.util.Log;
import com.google.unity.ads.PluginUtils;
/* loaded from: classes2.dex */
public enum UnityNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static UnityNativeTemplateFontStyle fromIntValue(int value) {
        if (value >= 0 && value < values().length) {
            return values()[value];
        }
        Log.w(PluginUtils.LOGTAG, "Invalid index for NativeTemplateFontStyle: " + value);
        return NORMAL;
    }

    public Typeface getTypeface() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Typeface.DEFAULT_BOLD;
            }
            if (ordinal == 2) {
                return Typeface.defaultFromStyle(2);
            }
            if (ordinal == 3) {
                return Typeface.MONOSPACE;
            }
            return Typeface.DEFAULT;
        }
        return Typeface.DEFAULT;
    }
}
