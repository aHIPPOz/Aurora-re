package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzezj implements zzfve {
    final /* synthetic */ zzezn zza;

    public zzezj(zzezn zzeznVar) {
        Objects.requireNonNull(zzeznVar);
        this.zza = zzeznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfet zze;
        zzezl zzezlVar;
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (zzdyx) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezn zzeznVar = this.zza;
        zze = zzeznVar.zze();
        zzeznVar.zzd = new zzezl(null, zze, null);
        zzezlVar = zzeznVar.zzd;
        return zzezlVar;
    }
}
