package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class zzkf extends zzb implements zzkg {
    public zzkf() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzb((zzli) zzc.zza(parcel, zzli.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            zzc.zzc(parcel);
            zzc((zzlk) zzc.zza(parcel, zzlk.CREATOR));
            return true;
        }
    }
}
