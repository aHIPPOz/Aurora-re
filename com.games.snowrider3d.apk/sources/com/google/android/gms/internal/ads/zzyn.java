package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzyn extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzyn(int i, zzbm zzbmVar, int i2, zzyi zzyiVar, int i3, String str, String str2) {
        super(i, zzbmVar, i2);
        zzfyq zzfyqVar;
        int i4;
        int i5;
        int i6 = 0;
        this.zzf = zzmb.zza(i3, false);
        int i7 = this.zzd.zze;
        int i8 = zzyiVar.zzy;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        if (str2 != null) {
            zzfyqVar = zzfyq.zzo(str2);
        } else if (zzyiVar.zzv.isEmpty()) {
            zzfyqVar = zzfyq.zzo(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            zzfyqVar = zzyiVar.zzv;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= zzfyqVar.size()) {
                i9 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzyiVar.zzz;
            i4 = zzyu.zzc(this.zzd, (String) zzfyqVar.get(i9), false);
            if (i4 > 0) {
                break;
            }
            i9++;
        }
        this.zzi = i9;
        this.zzj = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i10 = zzyiVar.zzw;
            i5 = 0;
        }
        int zzb = zzyu.zzb(this.zzd.zzf, i5);
        this.zzk = zzb;
        this.zzm = (1088 & this.zzd.zzf) != 0;
        int zzc = zzyu.zzc(this.zzd, str, zzyu.zzh(str) == null);
        this.zzl = zzc;
        boolean z2 = i4 > 0 || (zzyiVar.zzv.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzmb.zza(i3, zzyiVar.zzR) && z2) {
            i6 = 1;
        }
        this.zze = i6;
    }

    /* renamed from: zza */
    public final int compareTo(zzyn zzynVar) {
        zzfyf zzc = zzfyf.zzj().zzd(this.zzf, zzynVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzynVar.zzi), zzgab.zzc().zza());
        int i = this.zzj;
        zzfyf zzb = zzc.zzb(i, zzynVar.zzj);
        int i2 = this.zzk;
        zzfyf zzb2 = zzb.zzb(i2, zzynVar.zzk).zzd(this.zzg, zzynVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzynVar.zzh), i == 0 ? zzgab.zzc() : zzgab.zzc().zza()).zzb(this.zzl, zzynVar.zzl);
        if (i2 == 0) {
            zzb2 = zzb2.zze(this.zzm, zzynVar.zzm);
        }
        return zzb2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        zzyn zzynVar = (zzyn) zzypVar;
        return false;
    }
}
