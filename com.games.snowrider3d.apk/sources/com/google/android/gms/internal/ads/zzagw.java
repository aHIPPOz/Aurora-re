package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzagw extends zzahf {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzagw(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagw zzagwVar = (zzagw) obj;
            if (this.zzc == zzagwVar.zzc && Objects.equals(this.zza, zzagwVar.zza) && Objects.equals(this.zzb, zzagwVar.zzb) && Arrays.equals(this.zzd, zzagwVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.zzc;
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((i2 + 527) * 31) + hashCode) * 31) + i) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahf, com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzd, this.zzc);
    }
}
