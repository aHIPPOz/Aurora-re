package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzbkc implements zzbkf {
    @Override // com.google.android.gms.internal.ads.zzbkf
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfgVar = (zzcfg) obj;
        if (map.containsKey("start")) {
            zzcfgVar.zzN().zzp();
        } else if (map.containsKey("stop")) {
            zzcfgVar.zzN().zzq();
        } else if (!map.containsKey("cancel")) {
        } else {
            zzcfgVar.zzN().zzo();
        }
    }
}
