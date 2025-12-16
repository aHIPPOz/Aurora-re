package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfwl {
    public static zzfwh zza(zzfwh zzfwhVar) {
        if ((zzfwhVar instanceof zzfwk) || (zzfwhVar instanceof zzfwi)) {
            return zzfwhVar;
        }
        if (zzfwhVar instanceof Serializable) {
            return new zzfwi(zzfwhVar);
        }
        return new zzfwk(zzfwhVar);
    }
}
