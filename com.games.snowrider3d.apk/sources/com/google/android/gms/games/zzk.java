package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes.dex */
final class zzk extends zzl {
    @Override // com.google.android.gms.games.zzl, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.zzl
    public final PlayerEntity zza(Parcel parcel) {
        Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        unparcelClientVersion = PlayerEntity.getUnparcelClientVersion();
        zzp = PlayerEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = PlayerEntity.canUnparcelSafely(PlayerEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                long readLong = parcel.readLong();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Uri uri = null;
                Uri parse = readString3 == null ? null : Uri.parse(readString3);
                if (readString4 != null) {
                    uri = Uri.parse(readString4);
                }
                return new PlayerEntity(readString, readString2, parse, uri, readLong, -1, -1L, null, null, null, null, null, true, false, readString5, readString6, null, null, null, null, -1L, null, null, false, null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
