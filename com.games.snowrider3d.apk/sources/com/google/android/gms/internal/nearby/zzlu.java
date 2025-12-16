package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
final class zzlu extends zzly {
    @Override // com.google.android.gms.internal.nearby.zzly, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.internal.nearby.zzly
    public final zzlx zza(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        zzlx createFromParcel = super.createFromParcel(parcel);
        parcelFileDescriptor = createFromParcel.zzb;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor2 = createFromParcel.zzb;
            createFromParcel.zza = zzlx.zzd(parcelFileDescriptor2);
        }
        return createFromParcel;
    }
}
