package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzgnb extends zzgfm {
    private final String zza;
    private final zzgvf zzb;

    public /* synthetic */ zzgnb(String str, zzgvf zzgvfVar, zzgnc zzgncVar) {
        this.zza = str;
        this.zzb = zzgvfVar;
    }

    public final String toString() {
        String str;
        String str2 = this.zza;
        int ordinal = this.zzb.ordinal();
        if (ordinal == 1) {
            str = "TINK";
        } else if (ordinal == 2) {
            str = "LEGACY";
        } else if (ordinal != 3) {
            str = ordinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final boolean zza() {
        return this.zzb != zzgvf.RAW;
    }
}
