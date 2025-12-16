package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class zzde extends zzb implements zzdf {
    public zzde() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc.zzc(parcel);
            zzb((Status) zzc.zza(parcel, Status.CREATOR), (ExposureSummary) zzc.zza(parcel, ExposureSummary.CREATOR));
            return true;
        }
        return false;
    }
}
