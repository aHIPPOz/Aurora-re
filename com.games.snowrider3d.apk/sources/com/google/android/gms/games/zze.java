package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes.dex */
final class zze extends zzf {
    @Override // com.google.android.gms.games.zzf, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.zzf
    public final GameEntity zza(Parcel parcel) {
        Integer unparcelClientVersion;
        boolean zzp;
        boolean canUnparcelSafely;
        boolean z;
        unparcelClientVersion = GameEntity.getUnparcelClientVersion();
        zzp = GameEntity.zzp(unparcelClientVersion);
        if (!zzp) {
            canUnparcelSafely = GameEntity.canUnparcelSafely(GameEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                Uri uri = null;
                Uri parse = readString7 == null ? null : Uri.parse(readString7);
                String readString8 = parcel.readString();
                Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
                String readString9 = parcel.readString();
                if (readString9 != null) {
                    uri = Uri.parse(readString9);
                }
                Uri uri2 = uri;
                boolean z2 = false;
                if (parcel.readInt() > 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new GameEntity(readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, uri2, z2, parcel.readInt() > 0 ? true : z, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false, false);
            }
        }
        return super.createFromParcel(parcel);
    }
}
