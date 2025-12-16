package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgr implements zzgi {
    private zzhj zzb;
    private String zzc;
    private boolean zzf;
    private final zzhd zza = new zzhd();
    private int zzd = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
    private int zze = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

    public final zzgr zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgr zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgr zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgr zze(zzhj zzhjVar) {
        this.zzb = zzhjVar;
        return this;
    }

    public final zzgr zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzgw zza() {
        zzgw zzgwVar = new zzgw(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhj zzhjVar = this.zzb;
        if (zzhjVar != null) {
            zzgwVar.zzf(zzhjVar);
        }
        return zzgwVar;
    }
}
