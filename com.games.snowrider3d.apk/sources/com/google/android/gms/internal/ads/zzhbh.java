package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhbh {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhbh() {
    }

    public static /* bridge */ /* synthetic */ zzgxz zza(zzhbh zzhbhVar, zzgxz zzgxzVar, zzgxz zzgxzVar2) {
        zzhbhVar.zzb(zzgxzVar);
        zzhbhVar.zzb(zzgxzVar2);
        ArrayDeque arrayDeque = zzhbhVar.zza;
        zzgxz zzgxzVar3 = (zzgxz) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzgxzVar3 = new zzhbk((zzgxz) arrayDeque.pop(), zzgxzVar3);
        }
        return zzgxzVar3;
    }

    private final void zzb(zzgxz zzgxzVar) {
        zzgxz zzgxzVar2;
        zzgxz zzgxzVar3;
        if (zzgxzVar.zzh()) {
            int zzc = zzc(zzgxzVar.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzhbk.zzc(zzc + 1);
            if (arrayDeque.isEmpty() || ((zzgxz) arrayDeque.peek()).zzd() >= zzc2) {
                arrayDeque.push(zzgxzVar);
                return;
            }
            int zzc3 = zzhbk.zzc(zzc);
            zzgxz zzgxzVar4 = (zzgxz) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((zzgxz) arrayDeque.peek()).zzd() < zzc3) {
                zzgxzVar4 = new zzhbk((zzgxz) arrayDeque.pop(), zzgxzVar4);
            }
            zzhbk zzhbkVar = new zzhbk(zzgxzVar4, zzgxzVar);
            while (!arrayDeque.isEmpty()) {
                if (((zzgxz) arrayDeque.peek()).zzd() >= zzhbk.zzc(zzc(zzhbkVar.zzd()) + 1)) {
                    break;
                }
                zzhbkVar = new zzhbk((zzgxz) arrayDeque.pop(), zzhbkVar);
            }
            arrayDeque.push(zzhbkVar);
        } else if (!(zzgxzVar instanceof zzhbk)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgxzVar.getClass()))));
        } else {
            zzhbk zzhbkVar2 = (zzhbk) zzgxzVar;
            zzgxzVar2 = zzhbkVar2.zzd;
            zzb(zzgxzVar2);
            zzgxzVar3 = zzhbkVar2.zze;
            zzb(zzgxzVar3);
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzhbk.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzhbh(zzhbj zzhbjVar) {
    }
}
