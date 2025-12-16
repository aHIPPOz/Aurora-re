package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzbkb implements zzbkf {
    @Override // com.google.android.gms.internal.ads.zzbkf
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfgVar = (zzcfg) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfgVar.zzdg();
        } else if (!"resume".equals(str)) {
        } else {
            zzcfgVar.zzdh();
        }
    }
}
