package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeft implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeft(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzeft zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzeft(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzefs zzb() {
        return new zzefs((Context) this.zza.zzb(), (zzdgf) this.zzb.zzb());
    }
}
