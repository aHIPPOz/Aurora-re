package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
final class zzgyt extends zzgys {
    @Override // com.google.android.gms.internal.ads.zzgys
    public final void zza(Object obj) {
        ((zzgzd) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgys
    public final void zzb(zzhcm zzhcmVar, Map.Entry entry) throws IOException {
        zzgze zzgzeVar = (zzgze) entry.getKey();
        if (zzgzeVar.zzc) {
            zzhck zzhckVar = zzhck.DOUBLE;
            switch (zzgzeVar.zzb.ordinal()) {
                case 0:
                    zzhbn.zzt(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 1:
                    zzhbn.zzx(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 2:
                    zzhbn.zzA(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 3:
                    zzhbn.zzI(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 4:
                    zzhbn.zzz(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 5:
                    zzhbn.zzw(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 6:
                    zzhbn.zzv(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 7:
                    zzhbn.zzr(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 8:
                    zzhbn.zzG(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    zzhbn.zzy(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzhbc.zza().zzb(list.get(0).getClass()));
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    zzhbn.zzB(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzhbc.zza().zzb(list2.get(0).getClass()));
                    return;
                case 11:
                    zzhbn.zzs(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar);
                    return;
                case 12:
                    zzhbn.zzH(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 13:
                    zzhbn.zzz(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 14:
                    zzhbn.zzC(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 15:
                    zzhbn.zzD(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 16:
                    zzhbn.zzE(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                case 17:
                    zzhbn.zzF(zzgzeVar.zza, (List) entry.getValue(), zzhcmVar, zzgzeVar.zzd);
                    return;
                default:
                    return;
            }
        }
        zzhck zzhckVar2 = zzhck.DOUBLE;
        switch (zzgzeVar.zzb.ordinal()) {
            case 0:
                zzhcmVar.zzf(zzgzeVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhcmVar.zzo(zzgzeVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhcmVar.zzt(zzgzeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhcmVar.zzK(zzgzeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhcmVar.zzr(zzgzeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhcmVar.zzm(zzgzeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhcmVar.zzk(zzgzeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhcmVar.zzb(zzgzeVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhcmVar.zzG(zzgzeVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzhcmVar.zzq(zzgzeVar.zza, entry.getValue(), zzhbc.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzhcmVar.zzv(zzgzeVar.zza, entry.getValue(), zzhbc.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzhcmVar.zzd(zzgzeVar.zza, (zzgxz) entry.getValue());
                return;
            case 12:
                zzhcmVar.zzI(zzgzeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhcmVar.zzr(zzgzeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhcmVar.zzx(zzgzeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhcmVar.zzz(zzgzeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzhcmVar.zzB(zzgzeVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhcmVar.zzD(zzgzeVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
