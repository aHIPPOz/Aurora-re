package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeht implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzeht(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzeht zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzeht(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzehs zzb() {
        return new zzehs((Context) this.zza.zzb(), (zzdos) this.zzb.zzb());
    }
}
