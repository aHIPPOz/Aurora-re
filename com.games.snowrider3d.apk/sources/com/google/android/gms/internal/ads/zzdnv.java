package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdnv implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdsj zzc;
    private final zzeca zzd;
    private final Executor zze;
    private final zzavu zzf;
    private final VersionInfoParcel zzg;
    private final zzfjy zzh;
    private final zzecl zzi;
    private final zzfda zzj;

    public zzdnv(Context context, Executor executor, zzavu zzavuVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcft zzcftVar, zzeca zzecaVar, zzfjy zzfjyVar, zzdsj zzdsjVar, zzecl zzeclVar, zzfda zzfdaVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavuVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzecaVar;
        this.zzh = zzfjyVar;
        this.zzc = zzdsjVar;
        this.zzi = zzeclVar;
        this.zzj = zzfdaVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdnv zzdnvVar) {
        return zzdnvVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzavu zzb(zzdnv zzdnvVar) {
        return zzdnvVar.zzf;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdnv zzdnvVar) {
        return zzdnvVar.zza;
    }

    public static /* bridge */ /* synthetic */ VersionInfoParcel zzd(zzdnv zzdnvVar) {
        return zzdnvVar.zzg;
    }

    public static /* bridge */ /* synthetic */ zzdsj zze(zzdnv zzdnvVar) {
        return zzdnvVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzeca zzf(zzdnv zzdnvVar) {
        return zzdnvVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzecl zzg(zzdnv zzdnvVar) {
        return zzdnvVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfda zzh(zzdnv zzdnvVar) {
        return zzdnvVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfjy zzi(zzdnv zzdnvVar) {
        return zzdnvVar.zzh;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdnv zzdnvVar) {
        return zzdnvVar.zze;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdny zzdnyVar = new zzdny(this);
        zzdnyVar.zzk();
        return zzdnyVar;
    }
}
