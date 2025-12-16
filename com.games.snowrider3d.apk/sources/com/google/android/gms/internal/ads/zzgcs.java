package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcb;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgcs extends zzgcb.zzf {
    private static final zzgco zzbg;
    private static final zzgdw zzbh = new zzgdw(zzgcs.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzgco zzgcoVar;
        try {
            zzgcoVar = new zzgcp(null);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgcoVar = new zzgcq(null);
        }
        zzbg = zzgcoVar;
        if (th != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgcs(int i) {
        this.remainingField = i;
    }

    public final int zzB() {
        return zzbg.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzw(newSetFromMap);
            zzbg.zzb(this, null, newSetFromMap);
            return (Set) Objects.requireNonNull(this.seenExceptionsField);
        }
        return set;
    }

    abstract void zzw(Set set);
}
