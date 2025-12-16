package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhav<T> implements zzhbl<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhce.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhas zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhbx zzm;
    private final zzgys zzn;

    private zzhav(int[] iArr, Object[] objArr, int i, int i2, zzhas zzhasVar, boolean z, int[] iArr2, int i3, int i4, zzhay zzhayVar, zzhaf zzhafVar, zzhbx zzhbxVar, zzgys zzgysVar, zzhan zzhanVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhasVar instanceof zzgzh;
        boolean z2 = false;
        if (zzgysVar != null && (zzhasVar instanceof zzgzd)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzhbxVar;
        this.zzn = zzgysVar;
        this.zzg = zzhasVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhbl zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzhbl zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (!zzN(obj2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object == null) {
            throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
        }
        zzhbl zzx = zzx(i);
        if (!zzN(obj, i)) {
            if (!zzQ(object)) {
                unsafe.putObject(obj, zzu, object);
            } else {
                Object zze = zzx.zze();
                zzx.zzg(zze, object);
                unsafe.putObject(obj, zzu, zze);
            }
            zzH(obj, i);
            return;
        }
        Object object2 = unsafe.getObject(obj, zzu);
        if (!zzQ(object2)) {
            Object zze2 = zzx.zze();
            zzx.zzg(zze2, object2);
            unsafe.putObject(obj, zzu, zze2);
            object2 = zze2;
        }
        zzx.zzg(object2, object);
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (!zzR(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object == null) {
            throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
        }
        zzhbl zzx = zzx(i);
        if (!zzR(obj, i2, i)) {
            if (!zzQ(object)) {
                unsafe.putObject(obj, zzu, object);
            } else {
                Object zze = zzx.zze();
                zzx.zzg(zze, object);
                unsafe.putObject(obj, zzu, zze);
            }
            zzI(obj, i2, i);
            return;
        }
        Object object2 = unsafe.getObject(obj, zzu);
        if (!zzQ(object2)) {
            Object zze2 = zzx.zze();
            zzx.zzg(zze2, object2);
            unsafe.putObject(obj, zzu, zze2);
            object2 = zze2;
        }
        zzx.zzg(object2, object);
    }

    private final void zzG(Object obj, int i, zzhbf zzhbfVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhce.zzv(obj, j, zzhbfVar.zzs());
        } else if (!this.zzi) {
            zzhce.zzv(obj, j, zzhbfVar.zzp());
        } else {
            zzhce.zzv(obj, j, zzhbfVar.zzr());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzhce.zzt(obj, j, (1 << (zzr >>> 20)) | zzhce.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhce.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzhce.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhce.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhce.zzc(obj, j2)) != 0;
            case 2:
                return zzhce.zzf(obj, j2) != 0;
            case 3:
                return zzhce.zzf(obj, j2) != 0;
            case 4:
                return zzhce.zzd(obj, j2) != 0;
            case 5:
                return zzhce.zzf(obj, j2) != 0;
            case 6:
                return zzhce.zzd(obj, j2) != 0;
            case 7:
                return zzhce.zzz(obj, j2);
            case 8:
                Object zzh = zzhce.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (!(zzh instanceof zzgxz)) {
                    throw new IllegalArgumentException();
                } else {
                    return !zzgxz.zzb.equals(zzh);
                }
            case 9:
                return zzhce.zzh(obj, j2) != null;
            case 10:
                return !zzgxz.zzb.equals(zzhce.zzh(obj, j2));
            case 11:
                return zzhce.zzd(obj, j2) != 0;
            case 12:
                return zzhce.zzd(obj, j2) != 0;
            case 13:
                return zzhce.zzd(obj, j2) != 0;
            case 14:
                return zzhce.zzf(obj, j2) != 0;
            case 15:
                return zzhce.zzd(obj, j2) != 0;
            case 16:
                return zzhce.zzf(obj, j2) != 0;
            case 17:
                return zzhce.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhbl zzhblVar) {
        return zzhblVar.zzl(zzhce.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof zzgzh)) {
            return true;
        }
        return ((zzgzh) obj).zzcd();
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhce.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhce.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhcm zzhcmVar) throws IOException {
        if (obj instanceof String) {
            zzhcmVar.zzG(i, (String) obj);
        } else {
            zzhcmVar.zzd(i, (zzgxz) obj);
        }
    }

    static zzhby zzd(Object obj) {
        zzgzh zzgzhVar = (zzgzh) obj;
        zzhby zzhbyVar = zzgzhVar.zzt;
        if (zzhbyVar == zzhby.zzc()) {
            zzhby zzf = zzhby.zzf();
            zzgzhVar.zzt = zzf;
            return zzf;
        }
        return zzhbyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzhav zzm(java.lang.Class r32, com.google.android.gms.internal.ads.zzhap r33, com.google.android.gms.internal.ads.zzhay r34, com.google.android.gms.internal.ads.zzhaf r35, com.google.android.gms.internal.ads.zzhbx r36, com.google.android.gms.internal.ads.zzgys r37, com.google.android.gms.internal.ads.zzhan r38) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhap, com.google.android.gms.internal.ads.zzhay, com.google.android.gms.internal.ads.zzhaf, com.google.android.gms.internal.ads.zzhbx, com.google.android.gms.internal.ads.zzgys, com.google.android.gms.internal.ads.zzhan):com.google.android.gms.internal.ads.zzhav");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhce.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhce.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhce.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhce.zzh(obj, j)).longValue();
    }

    private final zzgzn zzw(int i) {
        int i2 = i / 3;
        return (zzgzn) this.zzd[i2 + i2 + 1];
    }

    private final zzhbl zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhbl zzhblVar = (zzhbl) objArr[i3];
        if (zzhblVar != null) {
            return zzhblVar;
        }
        zzhbl zzb2 = zzhbc.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhbx zzhbxVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzhce.zzh(obj, zzu(i) & 1048575);
        if (zzh == null || zzw(i) == null) {
            return obj2;
        }
        zzham zzhamVar = (zzham) zzh;
        zzhal zzhalVar = (zzhal) zzz(i);
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int zzD;
        int zzd;
        int zzD2;
        int zzh;
        int i7;
        int size;
        int zzl;
        int zzD3;
        int i8;
        int zzD4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int zzD5;
        int zzd2;
        int zzD6;
        zzhav<T> zzhavVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (true) {
            int[] iArr = zzhavVar.zzc;
            if (i16 < iArr.length) {
                int zzu = zzhavVar.zzu(i16);
                int zzt = zzt(zzu);
                int i20 = iArr[i16];
                int i21 = iArr[i16 + 2];
                int i22 = i21 & 1048575;
                if (zzt <= 17) {
                    if (i22 != i19) {
                        i17 = i22 == 1048575 ? 0 : unsafe.getInt(obj2, i22);
                        i19 = i22;
                    }
                    i = 1 << (i21 >>> 20);
                } else {
                    i = 0;
                }
                int i23 = zzu & 1048575;
                if (zzt >= zzgyx.DOUBLE_LIST_PACKED.zza()) {
                    zzgyx.SINT64_LIST_PACKED.zza();
                }
                long j = i23;
                switch (zzt) {
                    case 0:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i18 += zzgym.zzD(i20 << 3) + 8;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i3 = zzgym.zzD(i20 << 3);
                            i2 = i3 + 4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 2:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            long j2 = unsafe.getLong(obj2, j);
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzE(j2);
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 3:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            long j3 = unsafe.getLong(obj2, j);
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzE(j3);
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 4:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzE(unsafe.getInt(obj2, j));
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 5:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i6 = zzgym.zzD(i20 << 3);
                            i2 = i6 + 8;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 6:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i3 = zzgym.zzD(i20 << 3);
                            i2 = i3 + 4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 7:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i2 = zzgym.zzD(i20 << 3) + 1;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 8:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            int i24 = i20 << 3;
                            Object object = unsafe.getObject(obj2, j);
                            if (object instanceof zzgxz) {
                                zzD = zzgym.zzD(i24);
                                zzd = ((zzgxz) object).zzd();
                                zzD2 = zzgym.zzD(zzd);
                                i2 = zzD + zzD2 + zzd;
                                i18 += i2;
                            } else {
                                i5 = zzgym.zzD(i24);
                                i4 = zzgym.zzC((String) object);
                                i2 = i5 + i4;
                                i18 += i2;
                            }
                        }
                        zzhavVar = this;
                        break;
                    case 9:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            zzh = zzhbn.zzh(i20, unsafe.getObject(obj2, j), zzhavVar.zzx(i16));
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            zzD = zzgym.zzD(i20 << 3);
                            zzd = ((zzgxz) unsafe.getObject(obj2, j)).zzd();
                            zzD2 = zzgym.zzD(zzd);
                            i2 = zzD + zzD2 + zzd;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 11:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            int i25 = unsafe.getInt(obj2, j);
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzD(i25);
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 12:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzE(unsafe.getInt(obj2, j));
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 13:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i3 = zzgym.zzD(i20 << 3);
                            i2 = i3 + 4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 14:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            i6 = zzgym.zzD(i20 << 3);
                            i2 = i6 + 8;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 15:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            int i26 = unsafe.getInt(obj2, j);
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzD((i26 >> 31) ^ (i26 + i26));
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 16:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            long j4 = unsafe.getLong(obj2, j);
                            i5 = zzgym.zzD(i20 << 3);
                            i4 = zzgym.zzE((j4 >> 63) ^ (j4 + j4));
                            i2 = i5 + i4;
                            i18 += i2;
                        }
                        zzhavVar = this;
                        break;
                    case 17:
                        if (zzhavVar.zzO(obj2, i16, i19, i17, i)) {
                            zzh = zzgym.zzy(i20, (zzhas) unsafe.getObject(obj2, j), zzhavVar.zzx(i16));
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzh = zzhbn.zzd(i20, (List) unsafe.getObject(obj2, j), false);
                        i18 += zzh;
                        break;
                    case 19:
                        zzh = zzhbn.zzb(i20, (List) unsafe.getObject(obj2, j), false);
                        i18 += zzh;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(obj2, j);
                        int i27 = zzhbn.zza;
                        if (list.size() != 0) {
                            i7 = zzhbn.zzg(list) + (list.size() * zzgym.zzD(i20 << 3));
                            i18 += i7;
                            break;
                        }
                        i7 = 0;
                        i18 += i7;
                    case 21:
                        List list2 = (List) unsafe.getObject(obj2, j);
                        int i28 = zzhbn.zza;
                        size = list2.size();
                        if (size != 0) {
                            zzl = zzhbn.zzl(list2);
                            zzD3 = zzgym.zzD(i20 << 3);
                            i9 = size * zzD3;
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case 22:
                        List list3 = (List) unsafe.getObject(obj2, j);
                        int i29 = zzhbn.zza;
                        size = list3.size();
                        if (size != 0) {
                            zzl = zzhbn.zzf(list3);
                            zzD3 = zzgym.zzD(i20 << 3);
                            i9 = size * zzD3;
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case 23:
                        zzh = zzhbn.zzd(i20, (List) unsafe.getObject(obj2, j), false);
                        i18 += zzh;
                        break;
                    case 24:
                        zzh = zzhbn.zzb(i20, (List) unsafe.getObject(obj2, j), false);
                        i18 += zzh;
                        break;
                    case 25:
                        int i30 = zzhbn.zza;
                        int size2 = ((List) unsafe.getObject(obj2, j)).size();
                        if (size2 != 0) {
                            zzh = size2 * (zzgym.zzD(i20 << 3) + 1);
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case 26:
                        List list4 = (List) unsafe.getObject(obj2, j);
                        int i31 = zzhbn.zza;
                        int size3 = list4.size();
                        if (size3 != 0) {
                            i7 = zzgym.zzD(i20 << 3) * size3;
                            if (list4 instanceof zzhae) {
                                zzhae zzhaeVar = (zzhae) list4;
                                for (int i32 = 0; i32 < size3; i32++) {
                                    Object zzc = zzhaeVar.zzc();
                                    if (zzc instanceof zzgxz) {
                                        int zzd3 = ((zzgxz) zzc).zzd();
                                        i7 += zzgym.zzD(zzd3) + zzd3;
                                    } else {
                                        i7 += zzgym.zzC((String) zzc);
                                    }
                                }
                            } else {
                                for (int i33 = 0; i33 < size3; i33++) {
                                    Object obj3 = list4.get(i33);
                                    if (obj3 instanceof zzgxz) {
                                        int zzd4 = ((zzgxz) obj3).zzd();
                                        i7 += zzgym.zzD(zzd4) + zzd4;
                                    } else {
                                        i7 += zzgym.zzC((String) obj3);
                                    }
                                }
                            }
                            i18 += i7;
                            break;
                        }
                        i7 = 0;
                        i18 += i7;
                    case 27:
                        List list5 = (List) unsafe.getObject(obj2, j);
                        zzhbl zzx = zzhavVar.zzx(i16);
                        int i34 = zzhbn.zza;
                        int size4 = list5.size();
                        if (size4 == 0) {
                            i8 = 0;
                        } else {
                            i8 = zzgym.zzD(i20 << 3) * size4;
                            for (int i35 = 0; i35 < size4; i35++) {
                                Object obj4 = list5.get(i35);
                                if (obj4 instanceof zzhad) {
                                    int zza2 = ((zzhad) obj4).zza();
                                    i8 += zzgym.zzD(zza2) + zza2;
                                } else {
                                    i8 += zzgym.zzA((zzhas) obj4, zzx);
                                }
                            }
                        }
                        i18 += i8;
                        break;
                    case 28:
                        List list6 = (List) unsafe.getObject(obj2, j);
                        int i36 = zzhbn.zza;
                        int size5 = list6.size();
                        if (size5 == 0) {
                            zzD4 = 0;
                        } else {
                            zzD4 = size5 * zzgym.zzD(i20 << 3);
                            for (int i37 = 0; i37 < list6.size(); i37++) {
                                int zzd5 = ((zzgxz) list6.get(i37)).zzd();
                                zzD4 += zzgym.zzD(zzd5) + zzd5;
                            }
                        }
                        i18 += zzD4;
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        List list7 = (List) unsafe.getObject(obj2, j);
                        int i38 = zzhbn.zza;
                        size = list7.size();
                        if (size != 0) {
                            zzl = zzhbn.zzk(list7);
                            zzD3 = zzgym.zzD(i20 << 3);
                            i9 = size * zzD3;
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case 30:
                        List list8 = (List) unsafe.getObject(obj2, j);
                        int i39 = zzhbn.zza;
                        size = list8.size();
                        if (size != 0) {
                            zzl = zzhbn.zza(list8);
                            zzD3 = zzgym.zzD(i20 << 3);
                            i9 = size * zzD3;
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                        zzh = zzhbn.zzb(i20, (List) unsafe.getObject(obj2, j), false);
                        i18 += zzh;
                        break;
                    case 32:
                        zzh = zzhbn.zzd(i20, (List) unsafe.getObject(obj2, j), false);
                        i18 += zzh;
                        break;
                    case 33:
                        List list9 = (List) unsafe.getObject(obj2, j);
                        int i40 = zzhbn.zza;
                        size = list9.size();
                        if (size != 0) {
                            zzl = zzhbn.zzi(list9);
                            zzD3 = zzgym.zzD(i20 << 3);
                            i9 = size * zzD3;
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case 34:
                        List list10 = (List) unsafe.getObject(obj2, j);
                        int i41 = zzhbn.zza;
                        size = list10.size();
                        if (size != 0) {
                            zzl = zzhbn.zzj(list10);
                            zzD3 = zzgym.zzD(i20 << 3);
                            i9 = size * zzD3;
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        }
                        zzh = 0;
                        i18 += zzh;
                    case 35:
                        i12 = zzhbn.zze((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i12 = zzhbn.zzc((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i12 = zzhbn.zzg((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i12 = zzhbn.zzl((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i12 = zzhbn.zzf((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i12 = zzhbn.zze((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i12 = zzhbn.zzc((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int i42 = zzhbn.zza;
                        i12 = ((List) unsafe.getObject(obj2, j)).size();
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i12 = zzhbn.zzk((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i12 = zzhbn.zza((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i12 = zzhbn.zzc((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i12 = zzhbn.zze((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i12 = zzhbn.zzi((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        i12 = zzhbn.zzj((List) unsafe.getObject(obj2, j));
                        if (i12 > 0) {
                            i11 = zzgym.zzD(i20 << 3);
                            i10 = zzgym.zzD(i12);
                            zzD4 = i11 + i10 + i12;
                            i18 += zzD4;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        List list11 = (List) unsafe.getObject(obj2, j);
                        zzhbl zzx2 = zzhavVar.zzx(i16);
                        int i43 = zzhbn.zza;
                        int size6 = list11.size();
                        if (size6 == 0) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            for (int i44 = 0; i44 < size6; i44++) {
                                i13 += zzgym.zzy(i20, (zzhas) list11.get(i44), zzx2);
                            }
                        }
                        i18 += i13;
                        break;
                    case 50:
                        zzham zzhamVar = (zzham) unsafe.getObject(obj2, j);
                        zzhal zzhalVar = (zzhal) zzhavVar.zzz(i16);
                        if (!zzhamVar.isEmpty()) {
                            Iterator it = zzhamVar.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                            break;
                        } else {
                            continue;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            i14 = zzgym.zzD(i20 << 3);
                            zzh = i14 + 8;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            i15 = zzgym.zzD(i20 << 3);
                            zzh = i15 + 4;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            long zzv = zzv(obj2, j);
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzE(zzv);
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            long zzv2 = zzv(obj2, j);
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzE(zzv2);
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzE(zzp(obj2, j));
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            i14 = zzgym.zzD(i20 << 3);
                            zzh = i14 + 8;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            i15 = zzgym.zzD(i20 << 3);
                            zzh = i15 + 4;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            zzh = zzgym.zzD(i20 << 3) + 1;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!zzhavVar.zzR(obj2, i20, i16)) {
                            break;
                        } else {
                            int i45 = i20 << 3;
                            Object object2 = unsafe.getObject(obj2, j);
                            if (object2 instanceof zzgxz) {
                                zzD5 = zzgym.zzD(i45);
                                zzd2 = ((zzgxz) object2).zzd();
                                zzD6 = zzgym.zzD(zzd2);
                                zzh = zzD5 + zzD6 + zzd2;
                                i18 += zzh;
                                break;
                            } else {
                                zzl = zzgym.zzD(i45);
                                i9 = zzgym.zzC((String) object2);
                                zzh = zzl + i9;
                                i18 += zzh;
                            }
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            zzh = zzhbn.zzh(i20, unsafe.getObject(obj2, j), zzhavVar.zzx(i16));
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            zzD5 = zzgym.zzD(i20 << 3);
                            zzd2 = ((zzgxz) unsafe.getObject(obj2, j)).zzd();
                            zzD6 = zzgym.zzD(zzd2);
                            zzh = zzD5 + zzD6 + zzd2;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            int zzp = zzp(obj2, j);
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzD(zzp);
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzE(zzp(obj2, j));
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            i15 = zzgym.zzD(i20 << 3);
                            zzh = i15 + 4;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            i14 = zzgym.zzD(i20 << 3);
                            zzh = i14 + 8;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            int zzp2 = zzp(obj2, j);
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzD((zzp2 >> 31) ^ (zzp2 + zzp2));
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            long zzv3 = zzv(obj2, j);
                            zzl = zzgym.zzD(i20 << 3);
                            i9 = zzgym.zzE((zzv3 >> 63) ^ (zzv3 + zzv3));
                            zzh = zzl + i9;
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzhavVar.zzR(obj2, i20, i16)) {
                            zzh = zzgym.zzy(i20, (zzhas) unsafe.getObject(obj2, j), zzhavVar.zzx(i16));
                            i18 += zzh;
                            break;
                        } else {
                            break;
                        }
                }
                i16 += 3;
                obj2 = obj;
            } else {
                int zza3 = i18 + ((zzgzh) obj).zzt.zza();
                if (!zzhavVar.zzh) {
                    return zza3;
                }
                zzhbt zzhbtVar = ((zzgzd) obj).zza.zza;
                int zzc2 = zzhbtVar.zzc();
                int i46 = 0;
                for (int i47 = 0; i47 < zzc2; i47++) {
                    Map.Entry zzg = zzhbtVar.zzg(i47);
                    i46 += zzgyw.zzc((zzgyv) ((zzhbp) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry2 : zzhbtVar.zzd()) {
                    i46 += zzgyw.zzc((zzgyv) entry2.getKey(), entry2.getValue());
                }
                return zza3 + i46;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final int zzb(Object obj) {
        int i;
        int i2;
        long j;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 < iArr.length) {
                int zzu = zzu(i4);
                int i6 = 1048575 & zzu;
                int zzt = zzt(zzu);
                int i7 = iArr[i4];
                long j2 = i6;
                int i8 = 37;
                switch (zzt) {
                    case 0:
                        i2 = i5 * 53;
                        j = Double.doubleToLongBits(zzhce.zzb(obj, j2));
                        byte[] bArr = zzgzu.zzb;
                        i = (int) (j ^ (j >>> 32));
                        i5 = i2 + i;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        i = Float.floatToIntBits(zzhce.zzc(obj, j2));
                        i5 = i2 + i;
                        break;
                    case 2:
                        i2 = i5 * 53;
                        j = zzhce.zzf(obj, j2);
                        byte[] bArr2 = zzgzu.zzb;
                        i = (int) (j ^ (j >>> 32));
                        i5 = i2 + i;
                        break;
                    case 3:
                        i2 = i5 * 53;
                        j = zzhce.zzf(obj, j2);
                        byte[] bArr3 = zzgzu.zzb;
                        i = (int) (j ^ (j >>> 32));
                        i5 = i2 + i;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        i = zzhce.zzd(obj, j2);
                        i5 = i2 + i;
                        break;
                    case 5:
                        i2 = i5 * 53;
                        j = zzhce.zzf(obj, j2);
                        byte[] bArr4 = zzgzu.zzb;
                        i = (int) (j ^ (j >>> 32));
                        i5 = i2 + i;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        i = zzhce.zzd(obj, j2);
                        i5 = i2 + i;
                        break;
                    case 7:
                        i2 = i5 * 53;
                        i = zzgzu.zza(zzhce.zzz(obj, j2));
                        i5 = i2 + i;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        i = ((String) zzhce.zzh(obj, j2)).hashCode();
                        i5 = i2 + i;
                        break;
                    case 9:
                        i3 = i5 * 53;
                        Object zzh = zzhce.zzh(obj, j2);
                        if (zzh != null) {
                            i8 = zzh.hashCode();
                        }
                        i5 = i3 + i8;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        i = zzhce.zzh(obj, j2).hashCode();
                        i5 = i2 + i;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        i = zzhce.zzd(obj, j2);
                        i5 = i2 + i;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        i = zzhce.zzd(obj, j2);
                        i5 = i2 + i;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        i = zzhce.zzd(obj, j2);
                        i5 = i2 + i;
                        break;
                    case 14:
                        i2 = i5 * 53;
                        j = zzhce.zzf(obj, j2);
                        byte[] bArr5 = zzgzu.zzb;
                        i = (int) (j ^ (j >>> 32));
                        i5 = i2 + i;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        i = zzhce.zzd(obj, j2);
                        i5 = i2 + i;
                        break;
                    case 16:
                        i2 = i5 * 53;
                        j = zzhce.zzf(obj, j2);
                        byte[] bArr6 = zzgzu.zzb;
                        i = (int) (j ^ (j >>> 32));
                        i5 = i2 + i;
                        break;
                    case 17:
                        i3 = i5 * 53;
                        Object zzh2 = zzhce.zzh(obj, j2);
                        if (zzh2 != null) {
                            i8 = zzh2.hashCode();
                        }
                        i5 = i3 + i8;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    case 30:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        i2 = i5 * 53;
                        i = zzhce.zzh(obj, j2).hashCode();
                        i5 = i2 + i;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        i = zzhce.zzh(obj, j2).hashCode();
                        i5 = i2 + i;
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            j = Double.doubleToLongBits(zzn(obj, j2));
                            byte[] bArr7 = zzgzu.zzb;
                            i = (int) (j ^ (j >>> 32));
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = Float.floatToIntBits(zzo(obj, j2));
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            j = zzv(obj, j2);
                            byte[] bArr8 = zzgzu.zzb;
                            i = (int) (j ^ (j >>> 32));
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            j = zzv(obj, j2);
                            byte[] bArr9 = zzgzu.zzb;
                            i = (int) (j ^ (j >>> 32));
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzp(obj, j2);
                            i5 = i2 + i;
                            break;
                        }
                    case 56:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            j = zzv(obj, j2);
                            byte[] bArr10 = zzgzu.zzb;
                            i = (int) (j ^ (j >>> 32));
                            i5 = i2 + i;
                            break;
                        }
                    case 57:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzp(obj, j2);
                            i5 = i2 + i;
                            break;
                        }
                    case 58:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzgzu.zza(zzS(obj, j2));
                            i5 = i2 + i;
                            break;
                        }
                    case 59:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = ((String) zzhce.zzh(obj, j2)).hashCode();
                            i5 = i2 + i;
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzhce.zzh(obj, j2).hashCode();
                            i5 = i2 + i;
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzhce.zzh(obj, j2).hashCode();
                            i5 = i2 + i;
                            break;
                        }
                    case 62:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzp(obj, j2);
                            i5 = i2 + i;
                            break;
                        }
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzp(obj, j2);
                            i5 = i2 + i;
                            break;
                        }
                    case 64:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzp(obj, j2);
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            j = zzv(obj, j2);
                            byte[] bArr11 = zzgzu.zzb;
                            i = (int) (j ^ (j >>> 32));
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzp(obj, j2);
                            i5 = i2 + i;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            j = zzv(obj, j2);
                            byte[] bArr12 = zzgzu.zzb;
                            i = (int) (j ^ (j >>> 32));
                            i5 = i2 + i;
                            break;
                        }
                    case 68:
                        if (!zzR(obj, i7, i4)) {
                            break;
                        } else {
                            i2 = i5 * 53;
                            i = zzhce.zzh(obj, j2).hashCode();
                            i5 = i2 + i;
                            break;
                        }
                }
                i4 += 3;
            } else {
                int hashCode = (i5 * 53) + ((zzgzh) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzgzd) obj).zza.zza.hashCode() : hashCode;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:501:0x0bf9, code lost:
        if (r14 == r1) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0bfb, code lost:
        r10.putInt(r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0bff, code lost:
        r9 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0c04, code lost:
        if (r9 >= r0.zzl) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0c06, code lost:
        r0.zzy(r13, r0.zzj[r9], null, r0.zzm, r31);
        r9 = r9 + 1;
        r0 = r30;
        r13 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0c1e, code lost:
        if (r7 != 0) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0c20, code lost:
        if (r6 != r8) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0c28, code lost:
        throw new com.google.android.gms.internal.ads.zzgzw("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0c29, code lost:
        if (r6 > r8) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0c2b, code lost:
        if (r12 != r7) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0c2d, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0c33, code lost:
        throw new com.google.android.gms.internal.ads.zzgzw("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x0534 -> B:189:0x0535). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x05d0 -> B:224:0x05d1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.ads.zzgxn r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxn):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final Object zze() {
        return ((zzgzh) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final void zzf(Object obj) {
        if (!zzQ(obj)) {
            return;
        }
        if (obj instanceof zzgzh) {
            zzgzh zzgzhVar = (zzgzh) obj;
            zzgzhVar.zzbT();
            zzgzhVar.zzbS();
            zzgzhVar.zzbV();
        }
        int[] iArr = this.zzc;
        for (int i = 0; i < iArr.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int zzt = zzt(zzu);
            long j = i2;
            if (zzt != 9) {
                if (zzt != 60 && zzt != 68) {
                    switch (zzt) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        case 30:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            ((zzgzt) zzhce.zzh(obj, j)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzham) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzR(obj, iArr[i], i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            if (zzN(obj, i)) {
                zzx(i).zzf(zzb.getObject(obj, j));
            }
        }
        this.zzm.zzi(obj);
        if (!this.zzh) {
            return;
        }
        this.zzn.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i < iArr.length) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                int i3 = iArr[i];
                long j = i2;
                switch (zzt) {
                    case 0:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzr(obj, j, zzhce.zzb(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 1:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzs(obj, j, zzhce.zzc(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 2:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 3:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 4:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 5:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 6:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 7:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzp(obj, j, zzhce.zzz(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 8:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 9:
                        zzE(obj, obj2, i);
                        break;
                    case 10:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 11:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 12:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 13:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 14:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 15:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzt(obj, j, zzhce.zzd(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 16:
                        if (!zzN(obj2, i)) {
                            break;
                        } else {
                            zzhce.zzu(obj, j, zzhce.zzf(obj2, j));
                            zzH(obj, i);
                            break;
                        }
                    case 17:
                        zzE(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    case 30:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zzgzt zzgztVar = (zzgzt) zzhce.zzh(obj, j);
                        zzgzt zzgztVar2 = (zzgzt) zzhce.zzh(obj2, j);
                        int size = zzgztVar.size();
                        int size2 = zzgztVar2.size();
                        if (size > 0 && size2 > 0) {
                            if (!zzgztVar.zzc()) {
                                zzgztVar = zzgztVar.zzf(size2 + size);
                            }
                            zzgztVar.addAll(zzgztVar2);
                        }
                        if (size > 0) {
                            zzgztVar2 = zzgztVar;
                        }
                        zzhce.zzv(obj, j, zzgztVar2);
                        break;
                    case 50:
                        int i4 = zzhbn.zza;
                        zzhce.zzv(obj, j, zzhan.zzb(zzhce.zzh(obj, j), zzhce.zzh(obj2, j)));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzR(obj2, i3, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzI(obj, i3, i);
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        zzF(obj, obj2, i);
                        break;
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 62:
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    case 64:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (!zzR(obj2, i3, i)) {
                            break;
                        } else {
                            zzhce.zzv(obj, j, zzhce.zzh(obj2, j));
                            zzI(obj, i3, i);
                            break;
                        }
                    case 68:
                        zzF(obj, obj2, i);
                        break;
                }
                i += 3;
            } else {
                zzhbn.zzq(this.zzm, obj, obj2);
                if (!this.zzh) {
                    return;
                }
                zzhbn.zzp(this.zzn, obj, obj2);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x05cc A[Catch: all -> 0x05c3, TRY_ENTER, TryCatch #1 {all -> 0x05c3, blocks: (B:165:0x05ab, B:177:0x05cc, B:178:0x05d0), top: B:203:0x05ab }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05ff A[LOOP:4: B:195:0x05fb->B:197:0x05ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r12, com.google.android.gms.internal.ads.zzhbf r13, com.google.android.gms.internal.ads.zzgyr r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhbf, com.google.android.gms.internal.ads.zzgyr):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxn zzgxnVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgxnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04bb  */
    @Override // com.google.android.gms.internal.ads.zzhbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r22, com.google.android.gms.internal.ads.zzhcm r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhav.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhcm):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final boolean zzk(Object obj, Object obj2) {
        boolean z;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzhce.zzb(obj, j)) == Double.doubleToLongBits(zzhce.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzhce.zzc(obj, j)) == Float.floatToIntBits(zzhce.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzhce.zzz(obj, j) == zzhce.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzhce.zzd(obj, j) == zzhce.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzhce.zzf(obj, j) == zzhce.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    z = zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j));
                    break;
                case 50:
                    z = zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 68:
                    long zzr = zzr(i) & 1048575;
                    if (zzhce.zzd(obj, zzr) == zzhce.zzd(obj2, zzr) && zzhbn.zzJ(zzhce.zzh(obj, j), zzhce.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!((zzgzh) obj).zzt.equals(((zzgzh) obj2).zzt)) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        return ((zzgzd) obj).zza.equals(((zzgzd) obj2).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzu = zzu(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i3 = i7;
                i = i4;
                i2 = i10;
            } else {
                int i12 = i4;
                i2 = i6;
                i3 = i7;
                i = i12;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i3, i2, i, i11)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i8, i3) && !zzP(obj, zzu, zzx(i3))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzham) zzhce.zzh(obj, zzu & 1048575)).isEmpty()) {
                            zzhal zzhalVar = (zzhal) zzz(i3);
                            throw null;
                        }
                    }
                }
                List list = (List) zzhce.zzh(obj, zzu & 1048575);
                if (!list.isEmpty()) {
                    zzhbl zzx = zzx(i3);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzx.zzl(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzO(obj, i3, i2, i, i11) && !zzP(obj, zzu, zzx(i3))) {
                return false;
            }
            i5++;
            i6 = i2;
            i4 = i;
        }
        return !this.zzh || ((zzgzd) obj).zza.zzi();
    }
}
