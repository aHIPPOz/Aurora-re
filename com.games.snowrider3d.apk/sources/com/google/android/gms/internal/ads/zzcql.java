package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcql implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcql(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzcql zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzcql(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzcqk zzb() {
        return new zzcqk(((zzcpq) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
