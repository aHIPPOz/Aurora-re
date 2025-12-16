package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzps {
    public static final zzps zza = new zzpq().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzps(zzpq zzpqVar, zzpr zzprVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzpqVar.zza;
        this.zzb = z;
        z2 = zzpqVar.zzb;
        this.zzc = z2;
        z3 = zzpqVar.zzc;
        this.zzd = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzps zzpsVar = (zzps) obj;
            if (this.zzb == zzpsVar.zzb && this.zzc == zzpsVar.zzc && this.zzd == zzpsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.zzb;
        ?? r1 = this.zzc;
        return ((z ? 1 : 0) << 2) + (r1 == true ? 1 : 0) + r1 + (this.zzd ? 1 : 0);
    }
}
