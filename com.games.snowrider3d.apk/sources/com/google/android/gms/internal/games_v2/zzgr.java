package com.google.android.gms.internal.games_v2;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgr extends zzgu {
    private static final zzgr zzb = new zzgr();

    private zzgr() {
        super(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgu, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return zzc((zzgu) obj);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgu
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }

    @Override // com.google.android.gms.internal.games_v2.zzgu
    final void zza(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.games_v2.zzgu
    final void zzb(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // com.google.android.gms.internal.games_v2.zzgu
    public final int zzc(zzgu zzguVar) {
        return zzguVar == this ? 0 : 1;
    }
}
