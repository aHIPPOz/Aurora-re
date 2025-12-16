package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlw {
    private static final Class zza;
    private static final zzml zzb;
    private static final zzml zzc;
    private static final zzml zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmn();
    }

    public static zzml zzA() {
        return zzc;
    }

    public static zzml zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzkg zzkgVar, Object obj, zzml zzmlVar) {
        if (zzkgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzkgVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzmlVar);
                }
            }
            if (i2 == size) {
                return obj;
            }
            list.subList(i2, size).clear();
            return obj;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!zzkgVar.zza(intValue2)) {
                obj = zzD(i, intValue2, obj, zzmlVar);
                it.remove();
            }
        }
        return obj;
    }

    static Object zzD(int i, int i2, Object obj, zzml zzmlVar) {
        if (obj == null) {
            obj = zzmlVar.zze();
        }
        zzmlVar.zzf(obj, i, i2);
        return obj;
    }

    public static void zzE(zzjp zzjpVar, Object obj, Object obj2) {
        zzjpVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzml zzmlVar, Object obj, Object obj2) {
        zzmlVar.zzh(obj, zzmlVar.zzd(zzmlVar.zzc(obj), zzmlVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (zzkc.class.isAssignableFrom(cls) || (cls2 = zza) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public static void zzH(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzc(i, list, z);
    }

    public static void zzI(int i, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zze(i, list);
    }

    public static void zzJ(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzg(i, list, z);
    }

    public static void zzK(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzj(i, list, z);
    }

    public static void zzL(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzl(i, list, z);
    }

    public static void zzM(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzn(i, list, z);
    }

    public static void zzN(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzp(i, list, z);
    }

    public static void zzO(int i, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzjk) zzndVar).zzq(i, list.get(i2), zzluVar);
        }
    }

    public static void zzP(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzs(i, list, z);
    }

    public static void zzQ(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzu(i, list, z);
    }

    public static void zzR(int i, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzjk) zzndVar).zzv(i, list.get(i2), zzluVar);
        }
    }

    public static void zzS(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzx(i, list, z);
    }

    public static void zzT(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzz(i, list, z);
    }

    public static void zzU(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzB(i, list, z);
    }

    public static void zzV(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzD(i, list, z);
    }

    public static void zzW(int i, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzG(i, list);
    }

    public static void zzX(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzI(i, list, z);
    }

    public static void zzY(int i, List list, zznd zzndVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzK(i, list, z);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i << 3) + 1);
    }

    public static void zzaa(zzle zzleVar, Object obj, Object obj2, long j) {
        zzmv.zzs(obj, j, zzle.zzb(zzmv.zzf(obj, j), zzmv.zzf(obj2, j)));
    }

    private static zzml zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzml) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzjj.zzz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzz += zzjj.zzt((zzjb) list.get(i2));
        }
        return zzz;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjj.zzz(i));
    }

    public static int zze(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjj.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzkd zzkdVar = (zzkd) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjj.zzv(zzkdVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i << 3) + 4);
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i << 3) + 8);
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzlu zzluVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzjj.zzu(i, (zzlj) list.get(i3), zzluVar);
            }
            return i2;
        }
        return 0;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzjj.zzz(i));
    }

    public static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjj.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzkd zzkdVar = (zzkd) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjj.zzv(zzkdVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzjj.zzz(i));
    }

    public static int zzn(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjj.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzky zzkyVar = (zzky) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjj.zzB(zzkyVar.zza(i));
            i++;
        }
        return i3;
    }

    public static int zzo(int i, Object obj, zzlu zzluVar) {
        if (obj instanceof zzkp) {
            int zzA = zzjj.zzA(i << 3);
            int zza2 = ((zzkp) obj).zza();
            return zzA + zzjj.zzA(zza2) + zza2;
        }
        return zzjj.zzA(i << 3) + zzjj.zzx((zzlj) obj, zzluVar);
    }

    public static int zzp(int i, List list, zzlu zzluVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzkp) {
                i2 = zzjj.zzw((zzkp) obj);
            } else {
                i2 = zzjj.zzx((zzlj) obj, zzluVar);
            }
            zzz += i2;
        }
        return zzz;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzjj.zzz(i));
    }

    public static int zzr(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzjj.zzA((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzkd zzkdVar = (zzkd) list;
        int i3 = 0;
        while (i < size) {
            int zze = zzkdVar.zze(i);
            i3 += zzjj.zzA((zze >> 31) ^ (zze + zze));
            i++;
        }
        return i3;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzjj.zzz(i));
    }

    public static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzjj.zzB((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzky zzkyVar = (zzky) list;
        int i3 = 0;
        while (i < size) {
            long zza2 = zzkyVar.zza(i);
            i3 += zzjj.zzB((zza2 >> 63) ^ (zza2 + zza2));
            i++;
        }
        return i3;
    }

    public static int zzu(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i) * size;
        if (!(list instanceof zzkr)) {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzjb) {
                    i2 = zzjj.zzt((zzjb) obj);
                } else {
                    i2 = zzjj.zzy((String) obj);
                }
                zzz += i2;
                i4++;
            }
            return zzz;
        }
        zzkr zzkrVar = (zzkr) list;
        while (i4 < size) {
            Object zzf = zzkrVar.zzf(i4);
            if (zzf instanceof zzjb) {
                i3 = zzjj.zzt((zzjb) zzf);
            } else {
                i3 = zzjj.zzy((String) zzf);
            }
            zzz += i3;
            i4++;
        }
        return zzz;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzjj.zzz(i));
    }

    public static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkd)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjj.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzkd zzkdVar = (zzkd) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjj.zzA(zzkdVar.zze(i));
            i++;
        }
        return i3;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzjj.zzz(i));
    }

    public static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzky)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjj.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzky zzkyVar = (zzky) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjj.zzB(zzkyVar.zza(i));
            i++;
        }
        return i3;
    }

    public static zzml zzz() {
        return zzb;
    }
}
