package com.google.android.gms.internal.games_v2;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgu implements Comparable, Serializable {
    final Comparable zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public zzgu(Comparable comparable) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgu) {
            try {
                if (compareTo((zzgu) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    public abstract void zza(StringBuilder sb);

    public abstract void zzb(StringBuilder sb);

    /* renamed from: zzc */
    public int compareTo(zzgu zzguVar) {
        zzgt zzgtVar;
        zzgr zzgrVar;
        zzgtVar = zzgt.zzb;
        if (zzguVar != zzgtVar) {
            zzgrVar = zzgr.zzb;
            if (zzguVar == zzgrVar) {
                return -1;
            }
            Comparable comparable = zzguVar.zza;
            int i = zzhw.zzc;
            int compareTo = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.compareTo(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return compareTo != 0 ? compareTo : Boolean.compare(this instanceof zzgs, zzguVar instanceof zzgs);
        }
        return 1;
    }
}
