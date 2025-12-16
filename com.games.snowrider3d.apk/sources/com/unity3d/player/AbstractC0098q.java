package com.unity3d.player;

import android.view.inputmethod.InputMethodSubtype;
/* renamed from: com.unity3d.player.q */
/* loaded from: classes2.dex */
public abstract class AbstractC0098q {
    public static String a(InputMethodSubtype inputMethodSubtype) {
        if (PlatformSupport.NOUGAT_SUPPORT) {
            return inputMethodSubtype.getLanguageTag();
        }
        return inputMethodSubtype.getLocale();
    }
}
