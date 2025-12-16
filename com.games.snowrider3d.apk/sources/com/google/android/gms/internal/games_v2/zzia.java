package com.google.android.gms.internal.games_v2;

import java.util.AbstractMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
final class zzia extends zzhd {
    final /* synthetic */ zzib zza;

    public zzia(zzib zzibVar) {
        Objects.requireNonNull(zzibVar);
        this.zza = zzibVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzib zzibVar = this.zza;
        zzfu.zzb(i, zzibVar.zzl(), "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzibVar.zzk()[i2]), Objects.requireNonNull(zzibVar.zzk()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzl();
    }
}
