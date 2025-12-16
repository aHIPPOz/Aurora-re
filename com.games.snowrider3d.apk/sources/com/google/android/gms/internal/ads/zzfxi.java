package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfxi extends zzfxl implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfxi(Map map) {
        zzfvp.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfxi zzfxiVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfxiVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfxiVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    final Collection zzf() {
        return new zzfxk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final Iterator zzg() {
        return new zzfws(this);
    }

    public final List zzh(Object obj, List list, zzfxf zzfxfVar) {
        if (list instanceof RandomAccess) {
            return new zzfxb(this, obj, list, zzfxfVar);
        }
        return new zzfxh(this, obj, list, zzfxfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfwz(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfxc(this, (SortedMap) map);
        }
        return new zzfwv(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfxa(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfxd(this, (SortedMap) map);
        }
        return new zzfwy(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    public final void zzp() {
        Map map = this.zza;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl, com.google.android.gms.internal.ads.zzfzo
    public final boolean zzq(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                map.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.zzb++;
            return true;
        }
    }
}
