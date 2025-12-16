package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzck extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzck> CREATOR = new zzcl();
    private zzdp zza;

    private zzck() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        return Objects.equal(this.zza, ((zzck) obj).zza);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzck(IBinder iBinder) {
        zzdp zzdpVar;
        if (iBinder == null) {
            zzdpVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ILongCallback");
            zzdpVar = queryLocalInterface instanceof zzdp ? (zzdp) queryLocalInterface : new zzdn(iBinder);
        }
        this.zza = zzdpVar;
    }

    public /* synthetic */ zzck(zzcj zzcjVar) {
    }
}
