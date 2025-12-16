package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzmh {
    public static final zzmh zza = new zzmh(new zzmg());
    public final zzfyv zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = false;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzmh(zzmg zzmgVar) {
        zzfyv zzfyvVar;
        zzfyvVar = zzmgVar.zza;
        this.zzb = zzfyvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmh)) {
            return false;
        }
        zzmh zzmhVar = (zzmh) obj;
        if (!this.zzb.equals(zzmhVar.zzb)) {
            return false;
        }
        boolean z = zzmhVar.zzf;
        Double d = zzmhVar.zzc;
        if (!Objects.equals(null, null)) {
            return false;
        }
        Double d2 = zzmhVar.zzd;
        if (!Objects.equals(null, null)) {
            return false;
        }
        boolean z2 = zzmhVar.zze;
        boolean z3 = zzmhVar.zzg;
        boolean z4 = zzmhVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, false, true, true);
    }
}
