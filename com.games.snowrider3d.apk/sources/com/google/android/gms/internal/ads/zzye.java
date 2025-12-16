package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzye extends zzyp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzyi zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARN: Removed duplicated region for block: B:109:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139 A[EDGE_INSN: B:111:0x0139->B:78:0x0139 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6 A[LOOP:1: B:59:0x00f3->B:61:0x00f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzye(int r7, com.google.android.gms.internal.ads.zzbm r8, int r9, com.google.android.gms.internal.ads.zzyi r10, int r11, boolean r12, com.google.android.gms.internal.ads.zzfvq r13, int r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzye.<init>(int, com.google.android.gms.internal.ads.zzbm, int, com.google.android.gms.internal.ads.zzyi, int, boolean, com.google.android.gms.internal.ads.zzfvq, int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ boolean zzc(zzyp zzypVar) {
        String str;
        zzyi zzyiVar = this.zzh;
        zzye zzyeVar = (zzye) zzypVar;
        boolean z = zzyiVar.zzN;
        zzz zzzVar = this.zzd;
        int i = zzzVar.zzG;
        if (i != -1) {
            zzz zzzVar2 = zzyeVar.zzd;
            if (i != zzzVar2.zzG || (str = zzzVar.zzo) == null || !TextUtils.equals(str, zzzVar2.zzo)) {
                return false;
            }
            boolean z2 = zzyiVar.zzM;
            int i2 = zzzVar.zzH;
            if (i2 == -1 || i2 != zzzVar2.zzH) {
                return false;
            }
            boolean z3 = zzyiVar.zzO;
            return this.zzu == zzyeVar.zzu && this.zzv == zzyeVar.zzv;
        }
        return false;
    }

    /* renamed from: zza */
    public final int compareTo(zzye zzyeVar) {
        zzgab zzgabVar;
        zzgab zzgabVar2;
        boolean z = this.zzf;
        if (!z || !this.zzi) {
            zzgabVar2 = zzyu.zzc;
            zzgabVar = zzgabVar2.zza();
        } else {
            zzgabVar = zzyu.zzc;
        }
        zzfyf zzc = zzfyf.zzj().zzd(this.zzi, zzyeVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzyeVar.zzk), zzgab.zzc().zza()).zzb(this.zzj, zzyeVar.zzj).zzb(this.zzl, zzyeVar.zzl).zzd(this.zzp, zzyeVar.zzp).zzd(this.zzm, zzyeVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzyeVar.zzn), zzgab.zzc().zza()).zzb(this.zzo, zzyeVar.zzo).zzd(z, zzyeVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzyeVar.zzt), zzgab.zzc().zza());
        boolean z2 = this.zzh.zzB;
        zzfyf zzc2 = zzc.zzd(this.zzu, zzyeVar.zzu).zzd(this.zzv, zzyeVar.zzv).zzd(this.zzw, zzyeVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzyeVar.zzq), zzgabVar).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzyeVar.zzr), zzgabVar);
        if (Objects.equals(this.zzg, zzyeVar.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzyeVar.zzs), zzgabVar);
        }
        return zzc2.zza();
    }
}
