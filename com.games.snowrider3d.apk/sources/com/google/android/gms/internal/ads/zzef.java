package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzef extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzel zza;

    public zzef(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        zzel zzelVar = this.zza;
        if (true == z) {
            i = 10;
        }
        zzelVar.zzh(i);
    }
}
