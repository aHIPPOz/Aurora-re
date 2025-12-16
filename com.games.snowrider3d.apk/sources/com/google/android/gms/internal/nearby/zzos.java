package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.PointerIconCompat;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzos extends zza implements IInterface {
    public zzos(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
    }

    public final void zzd(zznz zznzVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zznzVar);
        zzv(PointerIconCompat.TYPE_TEXT, zza);
    }

    public final void zze(zzob zzobVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzobVar);
        zzv(PointerIconCompat.TYPE_CROSSHAIR, zza);
    }

    public final void zzf(zzof zzofVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzofVar);
        zzv(PointerIconCompat.TYPE_WAIT, zza);
    }

    public final void zzg(zzoj zzojVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzojVar);
        zzv(PointerIconCompat.TYPE_HELP, zza);
    }

    public final void zzh(zzon zzonVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzonVar);
        zzv(PointerIconCompat.TYPE_HAND, zza);
    }

    public final void zzi(zzpk zzpkVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzpkVar);
        zzv(PointerIconCompat.TYPE_CONTEXT_MENU, zza);
    }

    public final void zzj(zzqe zzqeVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzqeVar);
        zzv(PointerIconCompat.TYPE_VERTICAL_TEXT, zza);
    }

    public final void zzk(zzqi zzqiVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzqiVar);
        zzv(1005, zza);
    }

    public final void zzl(zzqm zzqmVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzqmVar);
        zzv(PointerIconCompat.TYPE_CELL, zza);
    }
}
