package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdxh implements zzhgr {
    private final zzhha zza;

    private zzdxh(zzhha zzhhaVar) {
        this.zza = zzhhaVar;
    }

    public static zzdxh zza(zzhha zzhhaVar) {
        return new zzdxh(zzhhaVar);
    }

    /* renamed from: zzc */
    public final String zzb() {
        String packageName = ((zzchl) this.zza).zza().getPackageName();
        zzhgz.zzb(packageName);
        return packageName;
    }
}
