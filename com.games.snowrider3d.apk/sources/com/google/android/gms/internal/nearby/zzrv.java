package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzrv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrv> CREATOR = new zzrw();
    private zzqq zza;

    private zzrv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrv)) {
            return false;
        }
        return Objects.equal(this.zza, ((zzrv) obj).zza);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzqq zza() {
        return this.zza;
    }

    public zzrv(zzqq zzqqVar) {
        this.zza = zzqqVar;
    }

    public /* synthetic */ zzrv(zzru zzruVar) {
    }
}
