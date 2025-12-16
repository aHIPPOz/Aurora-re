package com.unity3d.player;

import android.os.Build;
/* loaded from: classes2.dex */
public class PlatformSupport {
    static final boolean NOUGAT_SUPPORT = true;
    static final boolean OREO_SUPPORT;
    static final boolean PIE_SUPPORT;
    static final boolean QUINCE_TART_SUPPORT;
    static final boolean RED_VELVET_CAKE_SUPPORT;
    static final boolean SNOW_CONE_SUPPORT;
    static final boolean TIRAMISU_SUPPORT;
    static final boolean UPSIDE_DOWN_CAKE_SUPPORT;
    static final boolean VANILLA_ICE_CREAM_SUPPORT;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        OREO_SUPPORT = i >= 26;
        PIE_SUPPORT = i >= 28;
        QUINCE_TART_SUPPORT = i >= 29;
        RED_VELVET_CAKE_SUPPORT = i >= 30;
        SNOW_CONE_SUPPORT = i >= 31;
        TIRAMISU_SUPPORT = i >= 33;
        UPSIDE_DOWN_CAKE_SUPPORT = i >= 34;
        if (i < 35) {
            z = false;
        }
        VANILLA_ICE_CREAM_SUPPORT = z;
    }
}
