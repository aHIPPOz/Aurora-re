package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzgpd {
    private final Class zza;
    private final zzgxe zzb;

    public /* synthetic */ zzgpd(Class cls, zzgxe zzgxeVar, zzgpf zzgpfVar) {
        this.zza = cls;
        this.zzb = zzgxeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpd)) {
            return false;
        }
        zzgpd zzgpdVar = (zzgpd) obj;
        return zzgpdVar.zza.equals(this.zza) && zzgpdVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzgxe zzgxeVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzgxeVar);
        return simpleName + ", object identifier: " + valueOf;
    }
}
