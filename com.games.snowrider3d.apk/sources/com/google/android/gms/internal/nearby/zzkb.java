package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class zzkb extends zzb implements zzkc {
    public zzkb() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzc((zzle) zzc.zza(parcel, zzle.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.zzc(parcel);
            zzd((zzlg) zzc.zza(parcel, zzlg.CREATOR));
            return true;
        } else if (i == 4) {
            zzlq zzlqVar = (zzlq) zzc.zza(parcel, zzlq.CREATOR);
            zzc.zzc(parcel);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            zzc.zzc(parcel);
            zzb((zzlc) zzc.zza(parcel, zzlc.CREATOR));
            return true;
        }
    }
}
