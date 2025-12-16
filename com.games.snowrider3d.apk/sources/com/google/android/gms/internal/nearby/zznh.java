package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zznh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznh> CREATOR = new zzni();
    public static final zznh zza = new zznh(1, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null);
    final int zzb;
    private final String zzc;
    private final String zzd;

    public zznh(int i, String str, String str2) {
        this.zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.zzc = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj;
        return Objects.equal(this.zzc, zznhVar.zzc) && Objects.equal(this.zzd, zznhVar.zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, this.zzd);
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzd;
        return "NearbyDevice{handle=" + str + ", bluetoothAddress=" + str2 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
