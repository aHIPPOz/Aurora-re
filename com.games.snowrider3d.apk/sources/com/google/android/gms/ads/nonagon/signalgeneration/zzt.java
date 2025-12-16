package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzt extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    public zzt(zzv zzvVar) {
        Objects.requireNonNull(zzvVar);
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        zzv zzvVar = this.zza;
        synchronized (zzvVar) {
            int size = size();
            i = zzvVar.zza;
            boolean z = false;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzvVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
            int size2 = size();
            i2 = zzvVar.zza;
            if (size2 > i2) {
                z = true;
            }
            return z;
        }
    }
}
