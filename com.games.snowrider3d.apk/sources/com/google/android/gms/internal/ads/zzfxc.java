package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public class zzfxc extends zzfwv implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfxi zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxc(zzfxi zzfxiVar, SortedMap sortedMap) {
        super(zzfxiVar, sortedMap);
        Objects.requireNonNull(zzfxiVar);
        this.zze = zzfxiVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfxc(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfxc(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfxc(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    /* renamed from: zzg */
    public SortedSet zze() {
        return new zzfxd(this.zze, zzf());
    }

    /* renamed from: zzh */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zze = zze();
            this.zzd = zze;
            return zze;
        }
        return sortedSet;
    }
}
