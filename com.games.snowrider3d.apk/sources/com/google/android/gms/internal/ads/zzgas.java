package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgas {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static zzgaq zzb(Set set, Set set2) {
        zzfvp.zzc(set, "set1");
        zzfvp.zzc(set2, "set2");
        return new zzgam(set, set2);
    }

    public static Set zzc(Set set, zzfvq zzfvqVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof zzgan) {
                zzgan zzganVar = (zzgan) set;
                return new zzgan((Set) zzganVar.zza, zzfvt.zza(zzganVar.zzb, zzfvqVar));
            }
            set.getClass();
            return new zzgan(set, zzfvqVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzgan) {
            zzgan zzganVar2 = (zzgan) sortedSet;
            return new zzgao((SortedSet) zzganVar2.zza, zzfvt.zza(zzganVar2.zzb, zzfvqVar));
        }
        sortedSet.getClass();
        return new zzgao(sortedSet, zzfvqVar);
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfzy) {
            collection = ((zzfzy) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
