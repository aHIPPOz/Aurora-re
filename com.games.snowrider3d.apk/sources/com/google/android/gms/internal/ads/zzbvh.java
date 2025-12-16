package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzbvh extends zzayu implements zzbvi {
    public zzbvh() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    protected final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzayv.zzd(parcel);
            zzf((ParcelFileDescriptor) zzayv.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i == 2) {
            zzayv.zzd(parcel);
            zze((com.google.android.gms.ads.internal.util.zzbb) zzayv.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzayv.zzd(parcel);
            zzg((ParcelFileDescriptor) zzayv.zza(parcel, ParcelFileDescriptor.CREATOR), (zzbvq) zzayv.zza(parcel, zzbvq.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
