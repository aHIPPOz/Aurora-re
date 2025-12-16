package com.google.android.gms.internal.nearby;

import androidx.collection.ArraySet;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
final class zzgg extends zzkb {
    private final ListenerHolder zza;
    private final Set zzb = new ArraySet();

    public zzgg(ListenerHolder listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    public static boolean zzg(zzle zzleVar) {
        if (zzleVar.zza() != null) {
            return zzleVar.zzb() == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(zzleVar.zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzkc
    public final synchronized void zzb(zzlc zzlcVar) {
        this.zza.notifyListener(new zzgc(this, zzlcVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzkc
    public final synchronized void zzc(zzle zzleVar) {
        if (!zzg(zzleVar)) {
            this.zzb.add(zzleVar.zzb());
        }
        this.zza.notifyListener(new zzgd(this, zzleVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzkc
    public final synchronized void zzd(zzlg zzlgVar) {
        this.zzb.remove(zzlgVar.zza());
        this.zza.notifyListener(new zzge(this, zzlgVar));
    }

    public final synchronized void zze() {
        for (String str : this.zzb) {
            this.zza.notifyListener(new zzgf(this, str));
        }
        this.zzb.clear();
    }
}
