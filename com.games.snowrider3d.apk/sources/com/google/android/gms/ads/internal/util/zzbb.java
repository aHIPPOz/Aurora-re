package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzfwg;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    public final String zza;
    public final int zzb;

    public zzbb(String str, int i) {
        this.zza = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        this.zzb = i;
    }

    public static zzbb zzb(Throwable th) {
        String str;
        com.google.android.gms.ads.internal.client.zze zza = zzfdx.zza(th);
        if (zzfwg.zzd(th.getMessage())) {
            str = zza.zzb;
        } else {
            str = th.getMessage();
        }
        return new zzbb(str, zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
