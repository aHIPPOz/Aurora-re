package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfwb implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfwe zzb;

    public zzfwb(zzfwe zzfweVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzfweVar);
        this.zzb = zzfweVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfvh.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
