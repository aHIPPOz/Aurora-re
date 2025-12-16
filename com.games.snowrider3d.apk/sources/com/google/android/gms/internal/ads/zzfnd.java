package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfnd {
    private static UiModeManager zza;

    public static zzflr zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                return zzflr.MOBILE;
            }
            if (currentModeType == 4) {
                return zzflr.CTV;
            }
            return zzflr.OTHER;
        }
        return zzflr.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
