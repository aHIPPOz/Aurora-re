package com.google.android.gms.internal.nearby;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzsv extends zzsq {
    static final zzsq zza = new zzsv(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzsv(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzsg.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzsq, com.google.android.gms.internal.nearby.zzsn
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final Object[] zzg() {
        return this.zzb;
    }
}
