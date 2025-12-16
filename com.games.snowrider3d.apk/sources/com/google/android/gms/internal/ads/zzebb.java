package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzebb implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzebb(zzhha zzhhaVar, zzhha zzhhaVar2) {
        this.zza = zzhhaVar;
        this.zzb = zzhhaVar2;
    }

    public static zzebb zzc(zzhha zzhhaVar, zzhha zzhhaVar2) {
        return new zzebb(zzhhaVar, zzhhaVar2);
    }

    /* renamed from: zza */
    public final zzeba zzb() {
        return new zzeba(((zzeat) this.zza).zzb(), ((zzchi) this.zzb).zzb());
    }
}
