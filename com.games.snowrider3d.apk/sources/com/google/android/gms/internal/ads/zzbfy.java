package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbfy extends zzayt implements IInterface {
    public zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuu zzbuuVar) throws RemoteException {
        Parcel zza = zza();
        zzayv.zzg(zza, zzbuuVar);
        zzdb(1, zza);
    }
}
