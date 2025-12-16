package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfyu extends zzfyj {
    Object[] zzd;
    private int zze;

    public zzfyu() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfyj, com.google.android.gms.internal.ads.zzfyk
    public final /* bridge */ /* synthetic */ zzfyk zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfyu zzg(Object... objArr) {
        if (this.zzd == null) {
            zzd(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    public zzfyu(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzfyv.zzh(i)];
    }

    public final zzfyu zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        for (Object obj : iterable) {
            zzf(obj);
        }
        return this;
    }

    public final zzfyv zzi() {
        zzfyv zzfyvVar;
        boolean zzw;
        int i = this.zzb;
        if (i != 0) {
            if (i == 1) {
                return new zzgat(Objects.requireNonNull(this.zza[0]));
            }
            if (this.zzd == null || zzfyv.zzh(i) != this.zzd.length) {
                zzfyvVar = zzfyv.zzv(this.zzb, this.zza);
                this.zzb = zzfyvVar.size();
            } else {
                int i2 = this.zzb;
                Object[] objArr = this.zza;
                zzw = zzfyv.zzw(i2, objArr.length);
                if (zzw) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.zze;
                Object[] objArr2 = this.zzd;
                zzfyvVar = new zzgai(objArr, i3, objArr2, objArr2.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzfyvVar;
        }
        return zzgai.zza;
    }

    public final zzfyu zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfyv.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfyi.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            return this;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        return this;
                    }
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
