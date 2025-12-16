package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcvt {
    public static final zzbya zza(Context context, VersionInfoParcel versionInfoParcel, zzfca zzfcaVar, zzbxw zzbxwVar) {
        zzbxx zzbxxVar = zzfcaVar.zzA;
        String str = null;
        if (zzbxxVar != null) {
            zzfcf zzfcfVar = zzfcaVar.zzs;
            if (zzfcfVar != null) {
                str = zzfcfVar.zzb;
            }
            return new zzbxv(context, versionInfoParcel, zzbxxVar, str, zzbxwVar);
        }
        return null;
    }
}
