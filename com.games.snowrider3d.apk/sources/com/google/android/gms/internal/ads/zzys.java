package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzys extends zzyp {
    private final boolean zze;
    private final zzyi zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r1 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
        if (r1 >= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
        if (r1 >= 0.0f) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
        if (r12 >= 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0106 A[EDGE_INSN: B:139:0x0106->B:78:0x0106 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzys(int r5, com.google.android.gms.internal.ads.zzbm r6, int r7, com.google.android.gms.internal.ads.zzyi r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzys.<init>(int, com.google.android.gms.internal.ads.zzbm, int, com.google.android.gms.internal.ads.zzyi, int, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzys zzysVar, zzys zzysVar2) {
        zzgab zzgabVar;
        zzgab zzgabVar2;
        if (!zzysVar.zze || !zzysVar.zzh) {
            zzgabVar2 = zzyu.zzc;
            zzgabVar = zzgabVar2.zza();
        } else {
            zzgabVar = zzyu.zzc;
        }
        zzfyf zzj = zzfyf.zzj();
        boolean z = zzysVar.zzf.zzB;
        return zzj.zzc(Integer.valueOf(zzysVar.zzk), Integer.valueOf(zzysVar2.zzk), zzgabVar).zzc(Integer.valueOf(zzysVar.zzj), Integer.valueOf(zzysVar2.zzj), zzgabVar).zza();
    }

    public static /* synthetic */ int zzd(zzys zzysVar, zzys zzysVar2) {
        zzfyf zzc = zzfyf.zzj().zzd(zzysVar.zzh, zzysVar2.zzh).zzc(Integer.valueOf(zzysVar.zzm), Integer.valueOf(zzysVar2.zzm), zzgab.zzc().zza()).zzb(zzysVar.zzn, zzysVar2.zzn).zzb(zzysVar.zzo, zzysVar2.zzo).zzd(zzysVar.zzp, zzysVar2.zzp).zzb(zzysVar.zzq, zzysVar2.zzq).zzd(zzysVar.zzi, zzysVar2.zzi).zzd(zzysVar.zze, zzysVar2.zze).zzd(zzysVar.zzg, zzysVar2.zzg).zzc(Integer.valueOf(zzysVar.zzl), Integer.valueOf(zzysVar2.zzl), zzgab.zzc().zza());
        boolean z = zzysVar.zzs;
        zzfyf zzd = zzc.zzd(z, zzysVar2.zzs);
        boolean z2 = zzysVar.zzt;
        zzfyf zzd2 = zzd.zzd(z2, zzysVar2.zzt);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzysVar.zzu, zzysVar2.zzu);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        zzys zzysVar = (zzys) zzypVar;
        if (Objects.equals(this.zzd.zzo, zzysVar.zzd.zzo)) {
            boolean z = this.zzf.zzJ;
            return this.zzs == zzysVar.zzs && this.zzt == zzysVar.zzt;
        }
        return false;
    }
}
