package com.google.android.gms.internal.nearby;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzsr extends zzsl {
    public zzsr() {
        super(4);
    }

    public final zzsr zzb(Object obj) {
        obj.getClass();
        super.zza(obj);
        return this;
    }

    public final zzss zzc() {
        zzss zzl;
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                zzl = zzss.zzl(i, this.zza);
                this.zzb = zzl.size();
                this.zzc = true;
                return zzl;
            }
            Object obj = this.zza[0];
            obj.getClass();
            return new zzsx(obj);
        }
        return zzsw.zza;
    }
}
