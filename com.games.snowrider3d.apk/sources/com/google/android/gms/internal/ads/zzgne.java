package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgne extends zzgfm {
    private final zzgoy zza;

    public zzgne(zzgoy zzgoyVar) {
        this.zza = zzgoyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgne)) {
            return false;
        }
        zzgoy zzgoyVar = ((zzgne) obj).zza;
        zzgoy zzgoyVar2 = this.zza;
        return zzgoyVar2.zzc().zzg().equals(zzgoyVar.zzc().zzg()) && zzgoyVar2.zzc().zzi().equals(zzgoyVar.zzc().zzi()) && zzgoyVar2.zzc().zzh().equals(zzgoyVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgoy zzgoyVar = this.zza;
        return Objects.hash(zzgoyVar.zzc(), zzgoyVar.zzd());
    }

    public final String toString() {
        String str;
        zzgoy zzgoyVar = this.zza;
        String zzi = zzgoyVar.zzc().zzi();
        int ordinal = zzgoyVar.zzc().zzg().ordinal();
        if (ordinal == 1) {
            str = "TINK";
        } else if (ordinal == 2) {
            str = "LEGACY";
        } else if (ordinal != 3) {
            str = ordinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zzi, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgvf.RAW;
    }

    public final zzgoy zzb() {
        return this.zza;
    }
}
