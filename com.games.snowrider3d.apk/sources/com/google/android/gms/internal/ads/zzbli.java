package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbli extends zzayt implements zzblk {
    public zzbli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final zzblh zze(IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, int i, zzble zzbleVar) throws RemoteException {
        zzblh zzblhVar;
        Parcel zza = zza();
        zzayv.zzg(zza, iObjectWrapper);
        zzayv.zzg(zza, zzbpqVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayv.zzg(zza, zzbleVar);
        Parcel zzda = zzda(1, zza);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzblhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzblhVar = queryLocalInterface instanceof zzblh ? (zzblh) queryLocalInterface : new zzblf(readStrongBinder);
        }
        zzda.recycle();
        return zzblhVar;
    }
}
