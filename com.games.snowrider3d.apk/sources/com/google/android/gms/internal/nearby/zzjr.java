package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class zzjr extends zzb implements zzjs {
    public zzjr() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzd((zzli) zzc.zza(parcel, zzli.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.zzc(parcel);
            zzc((zzla) zzc.zza(parcel, zzla.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            zzlk zzlkVar = (zzlk) zzc.zza(parcel, zzlk.CREATOR);
            zzc.zzc(parcel);
            return true;
        }
    }
}
