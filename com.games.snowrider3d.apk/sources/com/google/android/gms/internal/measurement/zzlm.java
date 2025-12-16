package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzlj zzljVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i) {
        int i2 = i / 3;
        return (zzkg) this.zzd[i2 + i2 + 1];
    }

    private final zzlu zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        if (!zzO(obj2, i)) {
            return;
        }
        Object zzf = zzmv.zzf(obj, zzB);
        Object zzf2 = zzmv.zzf(obj2, zzB);
        if (zzf != null && zzf2 != null) {
            zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
            zzJ(obj, i);
        } else if (zzf2 == null) {
        } else {
            zzmv.zzs(obj, zzB, zzf2);
            zzJ(obj, i);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = zzB & 1048575;
        if (!zzR(obj2, i2, i)) {
            return;
        }
        Object zzf = zzR(obj, i2, i) ? zzmv.zzf(obj, j) : null;
        Object zzf2 = zzmv.zzf(obj2, j);
        if (zzf != null && zzf2 != null) {
            zzmv.zzs(obj, j, zzkk.zzg(zzf, zzf2));
            zzK(obj, i2, i);
        } else if (zzf2 == null) {
        } else {
            zzmv.zzs(obj, j, zzf2);
            zzK(obj, i2, i);
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmv.zzq(obj, zzy(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzB & i2;
            switch (zzA) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i6, zzmv.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i6, zzmv.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i6, zzmv.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z = false;
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    z = false;
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    z = false;
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    z = false;
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    z = false;
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    z = false;
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzlw.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 50:
                    zzM(zzndVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzb(i6, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i4)) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzlc zzlcVar = (zzlc) zzF(i2);
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j2)) != 0;
            case 2:
                return zzmv.zzd(obj, j2) != 0;
            case 3:
                return zzmv.zzd(obj, j2) != 0;
            case 4:
                return zzmv.zzc(obj, j2) != 0;
            case 5:
                return zzmv.zzd(obj, j2) != 0;
            case 6:
                return zzmv.zzc(obj, j2) != 0;
            case 7:
                return zzmv.zzw(obj, j2);
            case 8:
                Object zzf = zzmv.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (!(zzf instanceof zzjb)) {
                    throw new IllegalArgumentException();
                } else {
                    return !zzjb.zzb.equals(zzf);
                }
            case 9:
                return zzmv.zzf(obj, j2) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j2));
            case 11:
                return zzmv.zzc(obj, j2) != 0;
            case 12:
                return zzmv.zzc(obj, j2) != 0;
            case 13:
                return zzmv.zzc(obj, j2) != 0;
            case 14:
                return zzmv.zzd(obj, j2) != 0;
            case 15:
                return zzmv.zzc(obj, j2) != 0;
            case 16:
                return zzmv.zzd(obj, j2) != 0;
            case 17:
                return zzmv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmv.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i, (String) obj);
        } else {
            zzndVar.zzd(i, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar == zzmm.zzc()) {
            zzmm zze = zzmm.zze();
            zzkcVar.zzc = zze;
            return zze;
        }
        return zzmmVar;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        zzmi zzmiVar = (zzmi) zzlgVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.zzlm zzm(com.google.android.gms.internal.measurement.zzlt r34, com.google.android.gms.internal.measurement.zzlo r35, com.google.android.gms.internal.measurement.zzkx r36, com.google.android.gms.internal.measurement.zzml r37, com.google.android.gms.internal.measurement.zzjp r38, com.google.android.gms.internal.measurement.zzle r39) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzm(com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlo, com.google.android.gms.internal.measurement.zzkx, com.google.android.gms.internal.measurement.zzml, com.google.android.gms.internal.measurement.zzjp, com.google.android.gms.internal.measurement.zzle):com.google.android.gms.internal.measurement.zzlm");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzA;
        int zzd;
        int zzA2;
        int i11;
        int i12;
        Unsafe unsafe = zzb;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        for (int i16 = 0; i16 < this.zzc.length; i16 += 3) {
            int zzB = zzB(i16);
            int[] iArr = this.zzc;
            int i17 = iArr[i16];
            int zzA3 = zzA(zzB);
            if (zzA3 <= 17) {
                int i18 = iArr[i16 + 2];
                int i19 = i18 & 1048575;
                i = 1 << (i18 >>> 20);
                if (i19 != i15) {
                    i14 = unsafe.getInt(obj, i19);
                    i15 = i19;
                }
            } else {
                i = 0;
            }
            long j = zzB & 1048575;
            switch (zzA3) {
                case 0:
                    if ((i14 & i) != 0) {
                        i2 = zzjj.zzA(i17 << 3);
                        i3 = i2 + 8;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i14 & i) != 0) {
                        i4 = zzjj.zzA(i17 << 3);
                        i3 = i4 + 4;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i14 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        i5 = zzjj.zzA(i17 << 3);
                        i6 = zzjj.zzB(j2);
                        i13 += i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i14 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        i5 = zzjj.zzA(i17 << 3);
                        i6 = zzjj.zzB(j3);
                        i13 += i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i14 & i) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzv(i20);
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i14 & i) != 0) {
                        i2 = zzjj.zzA(i17 << 3);
                        i3 = i2 + 8;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i14 & i) != 0) {
                        i4 = zzjj.zzA(i17 << 3);
                        i3 = i4 + 4;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i14 & i) != 0) {
                        i10 = zzjj.zzA(i17 << 3);
                        i3 = i10 + 1;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i14 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            zzA = zzjj.zzA(i17 << 3);
                            zzd = ((zzjb) object).zzd();
                            zzA2 = zzjj.zzA(zzd);
                            i7 = zzA + zzA2 + zzd;
                            i13 += i7;
                            break;
                        } else {
                            i8 = zzjj.zzA(i17 << 3);
                            i9 = zzjj.zzy((String) object);
                            i7 = i8 + i9;
                            i13 += i7;
                        }
                    }
                case 9:
                    if ((i14 & i) != 0) {
                        i3 = zzlw.zzo(i17, unsafe.getObject(obj, j), zzE(i16));
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i14 & i) != 0) {
                        zzA = zzjj.zzA(i17 << 3);
                        zzd = ((zzjb) unsafe.getObject(obj, j)).zzd();
                        zzA2 = zzjj.zzA(zzd);
                        i7 = zzA + zzA2 + zzd;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i14 & i) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzA(i21);
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i14 & i) != 0) {
                        int i22 = unsafe.getInt(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzv(i22);
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i14 & i) != 0) {
                        i4 = zzjj.zzA(i17 << 3);
                        i3 = i4 + 4;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i14 & i) != 0) {
                        i2 = zzjj.zzA(i17 << 3);
                        i3 = i2 + 8;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i14 & i) != 0) {
                        int i23 = unsafe.getInt(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzA((i23 >> 31) ^ (i23 + i23));
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i14) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzB((j4 >> 63) ^ (j4 + j4));
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i14 & i) != 0) {
                        i3 = zzjj.zzu(i17, (zzlj) unsafe.getObject(obj, j), zzE(i16));
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 19:
                    i3 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 20:
                    i3 = zzlw.zzm(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 21:
                    i3 = zzlw.zzx(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 22:
                    i3 = zzlw.zzk(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 23:
                    i3 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 24:
                    i3 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 25:
                    i3 = zzlw.zza(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 26:
                    i3 = zzlw.zzu(i17, (List) unsafe.getObject(obj, j));
                    i13 += i3;
                    break;
                case 27:
                    i3 = zzlw.zzp(i17, (List) unsafe.getObject(obj, j), zzE(i16));
                    i13 += i3;
                    break;
                case 28:
                    i3 = zzlw.zzc(i17, (List) unsafe.getObject(obj, j));
                    i13 += i3;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    i3 = zzlw.zzv(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 30:
                    i3 = zzlw.zzd(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    i3 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 32:
                    i3 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 33:
                    i3 = zzlw.zzq(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 34:
                    i3 = zzlw.zzs(i17, (List) unsafe.getObject(obj, j), false);
                    i13 += i3;
                    break;
                case 35:
                    i9 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i9 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i9 = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i9 = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i9 = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i9 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i9 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i9 = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i9 = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i9 = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i9 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i9 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i9 = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    i9 = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (i9 > 0) {
                        i12 = zzjj.zzz(i17);
                        i11 = zzjj.zzA(i9);
                        i8 = i12 + i11;
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i3 = zzlw.zzj(i17, (List) unsafe.getObject(obj, j), zzE(i16));
                    i13 += i3;
                    break;
                case 50:
                    zzle.zza(i17, unsafe.getObject(obj, j), zzF(i16));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i17, i16)) {
                        i2 = zzjj.zzA(i17 << 3);
                        i3 = i2 + 8;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i17, i16)) {
                        i4 = zzjj.zzA(i17 << 3);
                        i3 = i4 + 4;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i17, i16)) {
                        long zzC = zzC(obj, j);
                        i5 = zzjj.zzA(i17 << 3);
                        i6 = zzjj.zzB(zzC);
                        i13 += i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i17, i16)) {
                        long zzC2 = zzC(obj, j);
                        i5 = zzjj.zzA(i17 << 3);
                        i6 = zzjj.zzB(zzC2);
                        i13 += i5 + i6;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i17, i16)) {
                        int zzr = zzr(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzv(zzr);
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i17, i16)) {
                        i2 = zzjj.zzA(i17 << 3);
                        i3 = i2 + 8;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i17, i16)) {
                        i4 = zzjj.zzA(i17 << 3);
                        i3 = i4 + 4;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i17, i16)) {
                        i10 = zzjj.zzA(i17 << 3);
                        i3 = i10 + 1;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i17, i16)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            zzA = zzjj.zzA(i17 << 3);
                            zzd = ((zzjb) object2).zzd();
                            zzA2 = zzjj.zzA(zzd);
                            i7 = zzA + zzA2 + zzd;
                            i13 += i7;
                            break;
                        } else {
                            i8 = zzjj.zzA(i17 << 3);
                            i9 = zzjj.zzy((String) object2);
                            i7 = i8 + i9;
                            i13 += i7;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i17, i16)) {
                        i3 = zzlw.zzo(i17, unsafe.getObject(obj, j), zzE(i16));
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i17, i16)) {
                        zzA = zzjj.zzA(i17 << 3);
                        zzd = ((zzjb) unsafe.getObject(obj, j)).zzd();
                        zzA2 = zzjj.zzA(zzd);
                        i7 = zzA + zzA2 + zzd;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i17, i16)) {
                        int zzr2 = zzr(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzA(zzr2);
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i17, i16)) {
                        int zzr3 = zzr(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzv(zzr3);
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i17, i16)) {
                        i4 = zzjj.zzA(i17 << 3);
                        i3 = i4 + 4;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i17, i16)) {
                        i2 = zzjj.zzA(i17 << 3);
                        i3 = i2 + 8;
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i17, i16)) {
                        int zzr4 = zzr(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i17, i16)) {
                        long zzC3 = zzC(obj, j);
                        i8 = zzjj.zzA(i17 << 3);
                        i9 = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i7 = i8 + i9;
                        i13 += i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i17, i16)) {
                        i3 = zzjj.zzu(i17, (zzlj) unsafe.getObject(obj, j), zzE(i16));
                        i13 += i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i13 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int zzA;
        int zzd;
        int zzA2;
        int i10;
        int i11;
        Unsafe unsafe = zzb;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzB = zzB(i13);
            int zzA3 = zzA(zzB);
            int i14 = this.zzc[i13];
            long j = zzB & 1048575;
            if (zzA3 >= zzju.DOUBLE_LIST_PACKED.zza() && zzA3 <= zzju.SINT64_LIST_PACKED.zza()) {
                int i15 = this.zzc[i13 + 2];
            }
            switch (zzA3) {
                case 0:
                    if (zzO(obj, i13)) {
                        i = zzjj.zzA(i14 << 3);
                        i2 = i + 8;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i13)) {
                        i3 = zzjj.zzA(i14 << 3);
                        i2 = i3 + 4;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i13)) {
                        long zzd2 = zzmv.zzd(obj, j);
                        i4 = zzjj.zzA(i14 << 3);
                        i5 = zzjj.zzB(zzd2);
                        i12 += i4 + i5;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i13)) {
                        long zzd3 = zzmv.zzd(obj, j);
                        i4 = zzjj.zzA(i14 << 3);
                        i5 = zzjj.zzB(zzd3);
                        i12 += i4 + i5;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i13)) {
                        int zzc = zzmv.zzc(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzv(zzc);
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i13)) {
                        i = zzjj.zzA(i14 << 3);
                        i2 = i + 8;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i13)) {
                        i3 = zzjj.zzA(i14 << 3);
                        i2 = i3 + 4;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i13)) {
                        i9 = zzjj.zzA(i14 << 3);
                        i2 = i9 + 1;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i13)) {
                        break;
                    } else {
                        Object zzf = zzmv.zzf(obj, j);
                        if (zzf instanceof zzjb) {
                            zzA = zzjj.zzA(i14 << 3);
                            zzd = ((zzjb) zzf).zzd();
                            zzA2 = zzjj.zzA(zzd);
                            i6 = zzA + zzA2 + zzd;
                            i12 += i6;
                            break;
                        } else {
                            i7 = zzjj.zzA(i14 << 3);
                            i8 = zzjj.zzy((String) zzf);
                            i6 = i7 + i8;
                            i12 += i6;
                        }
                    }
                case 9:
                    if (zzO(obj, i13)) {
                        i2 = zzlw.zzo(i14, zzmv.zzf(obj, j), zzE(i13));
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i13)) {
                        zzA = zzjj.zzA(i14 << 3);
                        zzd = ((zzjb) zzmv.zzf(obj, j)).zzd();
                        zzA2 = zzjj.zzA(zzd);
                        i6 = zzA + zzA2 + zzd;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i13)) {
                        int zzc2 = zzmv.zzc(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzA(zzc2);
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i13)) {
                        int zzc3 = zzmv.zzc(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzv(zzc3);
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i13)) {
                        i3 = zzjj.zzA(i14 << 3);
                        i2 = i3 + 4;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i13)) {
                        i = zzjj.zzA(i14 << 3);
                        i2 = i + 8;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i13)) {
                        int zzc4 = zzmv.zzc(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i13)) {
                        long zzd4 = zzmv.zzd(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i13)) {
                        i2 = zzjj.zzu(i14, (zzlj) zzmv.zzf(obj, j), zzE(i13));
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = zzlw.zzh(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 19:
                    i2 = zzlw.zzf(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 20:
                    i2 = zzlw.zzm(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 21:
                    i2 = zzlw.zzx(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 22:
                    i2 = zzlw.zzk(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 23:
                    i2 = zzlw.zzh(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 24:
                    i2 = zzlw.zzf(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 25:
                    i2 = zzlw.zza(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 26:
                    i2 = zzlw.zzu(i14, (List) zzmv.zzf(obj, j));
                    i12 += i2;
                    break;
                case 27:
                    i2 = zzlw.zzp(i14, (List) zzmv.zzf(obj, j), zzE(i13));
                    i12 += i2;
                    break;
                case 28:
                    i2 = zzlw.zzc(i14, (List) zzmv.zzf(obj, j));
                    i12 += i2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    i2 = zzlw.zzv(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 30:
                    i2 = zzlw.zzd(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    i2 = zzlw.zzf(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 32:
                    i2 = zzlw.zzh(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 33:
                    i2 = zzlw.zzq(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 34:
                    i2 = zzlw.zzs(i14, (List) zzmv.zzf(obj, j), false);
                    i12 += i2;
                    break;
                case 35:
                    i8 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i8 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i8 = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i8 = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i8 = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i8 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i8 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i8 = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i8 = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i8 = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i8 = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i8 = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i8 = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    i8 = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (i8 > 0) {
                        i11 = zzjj.zzz(i14);
                        i10 = zzjj.zzA(i8);
                        i7 = i11 + i10;
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i2 = zzlw.zzj(i14, (List) zzmv.zzf(obj, j), zzE(i13));
                    i12 += i2;
                    break;
                case 50:
                    zzle.zza(i14, zzmv.zzf(obj, j), zzF(i13));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i14, i13)) {
                        i = zzjj.zzA(i14 << 3);
                        i2 = i + 8;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i14, i13)) {
                        i3 = zzjj.zzA(i14 << 3);
                        i2 = i3 + 4;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i14, i13)) {
                        long zzC = zzC(obj, j);
                        i4 = zzjj.zzA(i14 << 3);
                        i5 = zzjj.zzB(zzC);
                        i12 += i4 + i5;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i14, i13)) {
                        long zzC2 = zzC(obj, j);
                        i4 = zzjj.zzA(i14 << 3);
                        i5 = zzjj.zzB(zzC2);
                        i12 += i4 + i5;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i14, i13)) {
                        int zzr = zzr(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzv(zzr);
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i14, i13)) {
                        i = zzjj.zzA(i14 << 3);
                        i2 = i + 8;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i14, i13)) {
                        i3 = zzjj.zzA(i14 << 3);
                        i2 = i3 + 4;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i14, i13)) {
                        i9 = zzjj.zzA(i14 << 3);
                        i2 = i9 + 1;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i14, i13)) {
                        break;
                    } else {
                        Object zzf2 = zzmv.zzf(obj, j);
                        if (zzf2 instanceof zzjb) {
                            zzA = zzjj.zzA(i14 << 3);
                            zzd = ((zzjb) zzf2).zzd();
                            zzA2 = zzjj.zzA(zzd);
                            i6 = zzA + zzA2 + zzd;
                            i12 += i6;
                            break;
                        } else {
                            i7 = zzjj.zzA(i14 << 3);
                            i8 = zzjj.zzy((String) zzf2);
                            i6 = i7 + i8;
                            i12 += i6;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i14, i13)) {
                        i2 = zzlw.zzo(i14, zzmv.zzf(obj, j), zzE(i13));
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i14, i13)) {
                        zzA = zzjj.zzA(i14 << 3);
                        zzd = ((zzjb) zzmv.zzf(obj, j)).zzd();
                        zzA2 = zzjj.zzA(zzd);
                        i6 = zzA + zzA2 + zzd;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i14, i13)) {
                        int zzr2 = zzr(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzA(zzr2);
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i14, i13)) {
                        int zzr3 = zzr(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzv(zzr3);
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i14, i13)) {
                        i3 = zzjj.zzA(i14 << 3);
                        i2 = i3 + 4;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i14, i13)) {
                        i = zzjj.zzA(i14 << 3);
                        i2 = i + 8;
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i14, i13)) {
                        int zzr4 = zzr(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i14, i13)) {
                        long zzC3 = zzC(obj, j);
                        i7 = zzjj.zzA(i14 << 3);
                        i8 = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i6 = i7 + i8;
                        i12 += i6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i14, i13)) {
                        i2 = zzjj.zzu(i14, (zzlj) zzmv.zzf(obj, j), zzE(i13));
                        i12 += i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i12 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzlc zzlcVar = (zzlc) zzF;
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        Object obj2 = null;
        boolean z = true;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int zzm = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return zzm;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int zzj = zzip.zzj(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j2, i4);
                return zzj;
            case 56:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int zzm2 = zzip.zzm(bArr, i, zzioVar);
                if (zzioVar.zzb == 0) {
                    z = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z));
                unsafe.putInt(obj, j2, i4);
                return zzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int zzj2 = zzip.zzj(bArr, i, zzioVar);
                int i9 = zzioVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                } else if ((i6 & 536870912) == 0 || zzna.zzf(bArr, zzj2, zzj2 + i9)) {
                    unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzkk.zzb));
                    zzj2 += i9;
                } else {
                    throw zzkm.zzc();
                }
                unsafe.putInt(obj, j2, i4);
                return zzj2;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int zzd = zzip.zzd(zzE(i8), bArr, i, i2, zzioVar);
                if (unsafe.getInt(obj, j2) == i4) {
                    obj2 = unsafe.getObject(obj, j);
                }
                if (obj2 == null) {
                    unsafe.putObject(obj, j, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkk.zzg(obj2, zzioVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return zzd;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int zza2 = zzip.zza(bArr, i, zzioVar);
                unsafe.putObject(obj, j, zzioVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return zza2;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int zzj3 = zzip.zzj(bArr, i, zzioVar);
                int i10 = zzioVar.zza;
                zzkg zzD = zzD(i8);
                if (zzD == null || zzD.zza(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                    return zzj3;
                }
                zzd(obj).zzh(i3, Long.valueOf(i10));
                return zzj3;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                int zzj4 = zzip.zzj(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return zzj4;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                int zzm3 = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return zzm3;
            case 68:
                if (i5 == 3) {
                    int zzc = zzip.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzioVar);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(obj2, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        int i3;
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzlm<T> zzlmVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i15 = -1;
        int i16 = i;
        int i17 = -1;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        while (i16 < i14) {
            int i21 = i16 + 1;
            int i22 = bArr2[i16];
            if (i22 < 0) {
                i21 = zzip.zzk(i22, bArr2, i21, zzioVar2);
                i22 = zzioVar2.zza;
            }
            int i23 = i21;
            int i24 = i22 >>> 3;
            int i25 = i22 & 7;
            if (i24 > i17) {
                i3 = zzlmVar.zzx(i24, i18 / 3);
            } else {
                i3 = zzlmVar.zzw(i24);
            }
            if (i3 == i15) {
                unsafe = unsafe2;
                i4 = i22;
                i5 = i15;
                i6 = i24;
                i7 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i26 = iArr[i3 + 1];
                int zzA = zzA(i26);
                int i27 = i22;
                int i28 = i3;
                long j = i26 & 1048575;
                if (zzA <= 17) {
                    int i29 = iArr[i28 + 2];
                    int i30 = 1 << (i29 >>> 20);
                    int i31 = i29 & 1048575;
                    if (i31 != i20) {
                        int i32 = 1048575;
                        if (i20 != 1048575) {
                            unsafe2.putInt(obj3, i20, i19);
                            i32 = 1048575;
                        }
                        if (i31 != i32) {
                            i19 = unsafe2.getInt(obj3, i31);
                        }
                        i20 = i31;
                    }
                    switch (zzA) {
                        case 0:
                            i13 = i28;
                            if (i25 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                zzmv.zzo(obj3, j, Double.longBitsToDouble(zzip.zzn(bArr2, i23)));
                                i16 = i23 + 8;
                                i19 |= i30;
                                i14 = i2;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 1:
                            i13 = i28;
                            if (i25 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                zzmv.zzp(obj3, j, Float.intBitsToFloat(zzip.zzb(bArr2, i23)));
                                i16 = i23 + 4;
                                i19 |= i30;
                                i14 = i2;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i13 = i28;
                            if (i25 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                int zzm = zzip.zzm(bArr2, i23, zzioVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j, zzioVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i19 |= i30;
                                i16 = zzm;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                i14 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            i13 = i28;
                            if (i25 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                int zzj = zzip.zzj(bArr2, i23, zzioVar2);
                                unsafe2.putInt(obj3, j, zzioVar2.zza);
                                i19 |= i30;
                                i14 = i2;
                                i16 = zzj;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i13 = i28;
                            if (i25 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j, zzip.zzn(bArr2, i23));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                i16 = i23 + 8;
                                i19 |= i30;
                                i14 = i2;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i13 = i28;
                            if (i25 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j, zzip.zzb(bArr2, i23));
                                i16 = i23 + 4;
                                i19 |= i30;
                                i14 = i2;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 7:
                            i13 = i28;
                            if (i25 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                i16 = zzip.zzm(bArr2, i23, zzioVar2);
                                zzmv.zzm(obj3, j, zzioVar2.zzb != 0);
                                i19 |= i30;
                                i14 = i2;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 8:
                            i13 = i28;
                            if (i25 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                if ((536870912 & i26) == 0) {
                                    i16 = zzip.zzg(bArr2, i23, zzioVar2);
                                } else {
                                    i16 = zzip.zzh(bArr2, i23, zzioVar2);
                                }
                                unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                i19 |= i30;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 9:
                            i13 = i28;
                            if (i25 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                i16 = zzip.zzd(zzlmVar.zzE(i13), bArr2, i23, i14, zzioVar2);
                                Object object = unsafe2.getObject(obj3, j);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i19 |= i30;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 10:
                            i13 = i28;
                            if (i25 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                i16 = zzip.zza(bArr2, i23, zzioVar2);
                                unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                i19 |= i30;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 12:
                            i13 = i28;
                            if (i25 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                i16 = zzip.zzj(bArr2, i23, zzioVar2);
                                unsafe2.putInt(obj3, j, zzioVar2.zza);
                                i19 |= i30;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 15:
                            i13 = i28;
                            if (i25 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                i16 = zzip.zzj(bArr2, i23, zzioVar2);
                                unsafe2.putInt(obj3, j, zzjf.zzb(zzioVar2.zza));
                                i19 |= i30;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        case 16:
                            if (i25 != 0) {
                                i13 = i28;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i6 = i24;
                                i7 = i13;
                                i5 = -1;
                                i4 = i27;
                                break;
                            } else {
                                int zzm2 = zzip.zzm(bArr2, i23, zzioVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i13 = i28;
                                unsafe5.putLong(obj6, j, zzjf.zzc(zzioVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i19 |= i30;
                                i16 = zzm2;
                                i17 = i24;
                                i18 = i13;
                                i15 = -1;
                                break;
                            }
                        default:
                            i13 = i28;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i6 = i24;
                            i7 = i13;
                            i5 = -1;
                            i4 = i27;
                            break;
                    }
                } else {
                    i7 = i28;
                    if (zzA != 27) {
                        i12 = i23;
                        Unsafe unsafe6 = unsafe2;
                        if (zzA <= 49) {
                            i8 = i19;
                            unsafe = unsafe6;
                            i5 = -1;
                            i9 = i20;
                            int zzv = zzlmVar.zzv(obj, bArr, i12, i2, i27, i24, i25, i7, i26, zzA, j, zzioVar);
                            i10 = i27;
                            i11 = i24;
                            if (zzv != i12) {
                                zzlmVar = this;
                                obj3 = obj;
                                zzioVar2 = zzioVar;
                                i16 = zzv;
                                i18 = i7;
                                i17 = i11;
                                i20 = i9;
                                i15 = i5;
                                i19 = i8;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i14 = i2;
                            } else {
                                obj2 = obj;
                                i23 = zzv;
                                i6 = i11;
                                i4 = i10;
                            }
                        } else {
                            i8 = i19;
                            unsafe = unsafe6;
                            i5 = -1;
                            i10 = i27;
                            i9 = i20;
                            i11 = i24;
                            if (zzA != 50) {
                                i6 = i11;
                                int zzt = zzt(obj, bArr, i12, i2, i10, i6, i25, i26, zzA, j, i7, zzioVar);
                                obj2 = obj;
                                i4 = i10;
                                i7 = i7;
                                if (zzt != i12) {
                                    zzlmVar = this;
                                    zzioVar2 = zzioVar;
                                    i17 = i6;
                                    i16 = zzt;
                                    i18 = i7;
                                    obj3 = obj2;
                                    i20 = i9;
                                    i15 = i5;
                                    i19 = i8;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i14 = i2;
                                } else {
                                    i23 = zzt;
                                }
                            } else if (i25 == 2) {
                                int zzs = zzs(obj, bArr, i12, i2, i7, j, zzioVar);
                                i7 = i7;
                                if (zzs != i12) {
                                    zzlmVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzioVar2 = zzioVar;
                                    i16 = zzs;
                                    i18 = i7;
                                    i17 = i11;
                                    i20 = i9;
                                    i15 = -1;
                                    i19 = i8;
                                    unsafe2 = unsafe;
                                    i14 = i2;
                                } else {
                                    obj2 = obj;
                                    i23 = zzs;
                                    i6 = i11;
                                    i4 = i10;
                                }
                            } else {
                                i7 = i7;
                                obj2 = obj;
                                i23 = i12;
                                i6 = i11;
                                i4 = i10;
                            }
                        }
                    } else if (i25 == 2) {
                        zzkj zzkjVar = (zzkj) unsafe2.getObject(obj3, j);
                        if (!zzkjVar.zzc()) {
                            int size = zzkjVar.size();
                            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j, zzkjVar);
                        }
                        int zze = zzip.zze(zzlmVar.zzE(i7), i27, bArr2, i23, i2, zzkjVar, zzioVar2);
                        bArr2 = bArr;
                        zzioVar2 = zzioVar;
                        i16 = zze;
                        i18 = i7;
                        unsafe2 = unsafe2;
                        i17 = i24;
                        i15 = -1;
                        obj3 = obj;
                        i14 = i2;
                    } else {
                        i12 = i23;
                        i9 = i20;
                        i8 = i19;
                        unsafe = unsafe2;
                        i11 = i24;
                        i5 = -1;
                        i10 = i27;
                        obj2 = obj;
                        i23 = i12;
                        i6 = i11;
                        i4 = i10;
                    }
                    i20 = i9;
                    i19 = i8;
                }
            }
            int zzi = zzip.zzi(i4, bArr, i23, i2, zzd(obj2), zzioVar);
            bArr2 = bArr;
            zzioVar2 = zzioVar;
            i17 = i6;
            i18 = i7;
            obj3 = obj2;
            i15 = i5;
            unsafe2 = unsafe;
            i14 = i2;
            i16 = zzi;
            zzlmVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i33 = i14;
        int i34 = i20;
        int i35 = i19;
        if (i34 != 1048575) {
            unsafe7.putInt(obj7, i34, i35);
        }
        if (i16 == i33) {
            return i16;
        }
        throw zzkm.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x020c -> B:117:0x020d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0140 -> B:65:0x0141). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01bd -> B:96:0x01be). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzv(java.lang.Object r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, com.google.android.gms.internal.measurement.zzio r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzio):int");
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i;
        int i2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzB = zzB(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzB;
            int i6 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i2 = i3 * 53;
                    i = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i3 = i2 + i;
                    break;
                case 1:
                    i2 = i3 * 53;
                    i = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i3 = i2 + i;
                    break;
                case 2:
                    i2 = i3 * 53;
                    i = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = i2 + i;
                    break;
                case 3:
                    i2 = i3 * 53;
                    i = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = i2 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    i = zzmv.zzc(obj, j);
                    i3 = i2 + i;
                    break;
                case 5:
                    i2 = i3 * 53;
                    i = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = i2 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    i = zzmv.zzc(obj, j);
                    i3 = i2 + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    i = zzkk.zza(zzmv.zzw(obj, j));
                    i3 = i2 + i;
                    break;
                case 8:
                    i2 = i3 * 53;
                    i = ((String) zzmv.zzf(obj, j)).hashCode();
                    i3 = i2 + i;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    i = zzmv.zzf(obj, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    i = zzmv.zzc(obj, j);
                    i3 = i2 + i;
                    break;
                case 12:
                    i2 = i3 * 53;
                    i = zzmv.zzc(obj, j);
                    i3 = i2 + i;
                    break;
                case 13:
                    i2 = i3 * 53;
                    i = zzmv.zzc(obj, j);
                    i3 = i2 + i;
                    break;
                case 14:
                    i2 = i3 * 53;
                    i = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = i2 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    i = zzmv.zzc(obj, j);
                    i3 = i2 + i;
                    break;
                case 16:
                    i2 = i3 * 53;
                    i = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = i2 + i;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j);
                    if (zzf2 != null) {
                        i6 = zzf2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
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
                    i2 = i3 * 53;
                    i = zzmv.zzf(obj, j).hashCode();
                    i3 = i2 + i;
                    break;
                case 50:
                    i2 = i3 * 53;
                    i = zzmv.zzf(obj, j).hashCode();
                    i3 = i2 + i;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = Float.floatToIntBits(zzo(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zzc(zzC(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zzc(zzC(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzr(obj, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zzc(zzC(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzr(obj, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zza(zzS(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = ((String) zzmv.zzf(obj, j)).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzmv.zzf(obj, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzmv.zzf(obj, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzr(obj, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzr(obj, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzr(obj, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zzc(zzC(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzr(obj, j);
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzkk.zzc(zzC(obj, j));
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        i = zzmv.zzf(obj, j).hashCode();
                        i3 = i2 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzio zzioVar) throws IOException {
        zzlm<T> zzlmVar;
        int i4;
        int i5;
        Object obj2;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c;
        Object obj3;
        int i16;
        int zzm;
        int i17;
        zzio zzioVar2;
        int i18;
        int i19;
        zzlm<T> zzlmVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i20 = i2;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i21 = i;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1;
        int i26 = 1048575;
        while (true) {
            if (i21 < i20) {
                int i27 = i21 + 1;
                int i28 = bArr2[i21];
                if (i28 < 0) {
                    i27 = zzip.zzk(i28, bArr2, i27, zzioVar3);
                    i28 = zzioVar3.zza;
                }
                int i29 = i28;
                int i30 = i27;
                int i31 = i29 >>> 3;
                int i32 = i29 & 7;
                if (i31 > i25) {
                    i7 = zzlmVar2.zzx(i31, i23 / 3);
                } else {
                    i7 = zzlmVar2.zzw(i31);
                }
                if (i7 == -1) {
                    i5 = i3;
                    zzlmVar = zzlmVar2;
                    obj2 = obj4;
                    unsafe = unsafe2;
                    i8 = i30;
                    i9 = i29;
                    i10 = 0;
                    i6 = 1048575;
                    i11 = i31;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i33 = iArr[i7 + 1];
                    int zzA = zzA(i33);
                    int i34 = i7;
                    long j = i33 & 1048575;
                    if (zzA <= 17) {
                        int i35 = iArr[i34 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i26) {
                            i6 = 1048575;
                            if (i26 != 1048575) {
                                unsafe2.putInt(obj4, i26, i24);
                            }
                            i24 = unsafe2.getInt(obj4, i37);
                            i26 = i37;
                        } else {
                            i6 = 1048575;
                        }
                        switch (zzA) {
                            case 0:
                                bArr2 = bArr;
                                i15 = i26;
                                i10 = i34;
                                c = 65535;
                                i16 = i30;
                                if (i32 == 1) {
                                    zzmv.zzo(obj4, j, Double.longBitsToDouble(zzip.zzn(bArr2, i16)));
                                    i21 = i16 + 8;
                                    i24 |= i36;
                                    i26 = i15;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i30 = i16;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe3 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe3;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i15 = i26;
                                i10 = i34;
                                c = 65535;
                                i16 = i30;
                                if (i32 == 5) {
                                    zzmv.zzp(obj4, j, Float.intBitsToFloat(zzip.zzb(bArr2, i16)));
                                    i21 = i16 + 4;
                                    i24 |= i36;
                                    i26 = i15;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i30 = i16;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe32 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe32;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i15 = i26;
                                i10 = i34;
                                c = 65535;
                                i16 = i30;
                                if (i32 == 0) {
                                    zzm = zzip.zzm(bArr2, i16, zzioVar3);
                                    Unsafe unsafe4 = unsafe2;
                                    Object obj5 = obj4;
                                    unsafe4.putLong(obj5, j, zzioVar3.zzb);
                                    unsafe2 = unsafe4;
                                    obj4 = obj5;
                                    i24 |= i36;
                                    i26 = i15;
                                    i21 = zzm;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i30 = i16;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe322 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe322;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i15 = i26;
                                i10 = i34;
                                c = 65535;
                                i16 = i30;
                                if (i32 == 0) {
                                    int zzj = zzip.zzj(bArr2, i16, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzioVar3.zza);
                                    i24 |= i36;
                                    i26 = i15;
                                    i21 = zzj;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i30 = i16;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe3222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe3222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i15 = i26;
                                c = 65535;
                                if (i32 == 1) {
                                    Unsafe unsafe5 = unsafe2;
                                    Object obj6 = obj4;
                                    i16 = i30;
                                    i10 = i34;
                                    unsafe5.putLong(obj6, j, zzip.zzn(bArr2, i30));
                                    unsafe2 = unsafe5;
                                    obj4 = obj6;
                                    i21 = i16 + 8;
                                    i24 |= i36;
                                    i26 = i15;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    i10 = i34;
                                    obj3 = obj4;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe32222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe32222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i15 = i26;
                                c = 65535;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj4, j, zzip.zzb(bArr2, i30));
                                    i21 = i30 + 4;
                                    i24 |= i36;
                                    i26 = i15;
                                    i22 = i29;
                                    i25 = i31;
                                    i23 = i34;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    i10 = i34;
                                    Unsafe unsafe322222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe322222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                c = 65535;
                                if (i32 == 0) {
                                    i21 = zzip.zzm(bArr2, i30, zzioVar3);
                                    zzmv.zzm(obj4, j, zzioVar3.zzb != 0);
                                    i24 |= i36;
                                    i22 = i29;
                                    i25 = i31;
                                    i23 = i34;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    i10 = i34;
                                    Unsafe unsafe3222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe3222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                c = 65535;
                                if (i32 == 2) {
                                    if ((536870912 & i33) == 0) {
                                        i21 = zzip.zzg(bArr2, i30, zzioVar3);
                                    } else {
                                        i21 = zzip.zzh(bArr2, i30, zzioVar3);
                                    }
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i24 |= i36;
                                    i22 = i29;
                                    i25 = i31;
                                    i23 = i34;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    i10 = i34;
                                    Unsafe unsafe32222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe32222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i10 = i34;
                                c = 65535;
                                if (i32 == 2) {
                                    i21 = zzip.zzd(zzlmVar2.zzE(i10), bArr2, i30, i20, zzioVar3);
                                    if ((i24 & i36) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i24 |= i36;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe322222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe322222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i10 = i34;
                                c = 65535;
                                if (i32 == 2) {
                                    i21 = zzip.zza(bArr2, i30, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i24 |= i36;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe3222222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe3222222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i10 = i34;
                                c = 65535;
                                if (i32 != 0) {
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe32222222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe32222222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                } else {
                                    i21 = zzip.zzj(bArr2, i30, zzioVar3);
                                    int i38 = zzioVar3.zza;
                                    zzkg zzD = zzlmVar2.zzD(i10);
                                    if (zzD == null || zzD.zza(i38)) {
                                        unsafe2.putInt(obj4, j, i38);
                                        i24 |= i36;
                                        i23 = i10;
                                        i22 = i29;
                                        i25 = i31;
                                        break;
                                    } else {
                                        zzd(obj4).zzh(i29, Long.valueOf(i38));
                                        i23 = i10;
                                        i22 = i29;
                                        i25 = i31;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i10 = i34;
                                c = 65535;
                                if (i32 == 0) {
                                    i21 = zzip.zzj(bArr2, i30, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzjf.zzb(zzioVar3.zza));
                                    i24 |= i36;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe322222222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe322222222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            case 16:
                                if (i32 == 0) {
                                    bArr2 = bArr;
                                    zzm = zzip.zzm(bArr2, i30, zzioVar3);
                                    Unsafe unsafe6 = unsafe2;
                                    Object obj7 = obj4;
                                    i10 = i34;
                                    unsafe6.putLong(obj7, j, zzjf.zzc(zzioVar3.zzb));
                                    unsafe2 = unsafe6;
                                    obj4 = obj7;
                                    i24 |= i36;
                                    i21 = zzm;
                                    i23 = i10;
                                    i22 = i29;
                                    i25 = i31;
                                    break;
                                } else {
                                    c = 65535;
                                    obj3 = obj4;
                                    i15 = i26;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    i10 = i34;
                                    Unsafe unsafe3222222222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe3222222222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                            default:
                                i15 = i26;
                                i10 = i34;
                                c = 65535;
                                i16 = i30;
                                if (i32 == 3) {
                                    zzio zzioVar4 = zzioVar3;
                                    Unsafe unsafe7 = unsafe2;
                                    int i39 = i24;
                                    i21 = zzip.zzc(zzlmVar2.zzE(i10), bArr, i16, i20, (i31 << 3) | 4, zzioVar4);
                                    if ((i39 & i36) == 0) {
                                        unsafe7.putObject(obj, j, zzioVar4.zzc);
                                    } else {
                                        unsafe7.putObject(obj, j, zzkk.zzg(unsafe7.getObject(obj, j), zzioVar4.zzc));
                                    }
                                    i24 = i39 | i36;
                                    bArr2 = bArr;
                                    i26 = i15;
                                    obj4 = obj;
                                    i23 = i10;
                                    unsafe2 = unsafe7;
                                    i22 = i29;
                                    i20 = i2;
                                    zzioVar3 = zzioVar4;
                                    i25 = i31;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    i30 = i16;
                                    i17 = i24;
                                    zzioVar2 = zzioVar3;
                                    Unsafe unsafe32222222222222 = unsafe2;
                                    i26 = i15;
                                    i8 = i30;
                                    i24 = i17;
                                    obj2 = obj3;
                                    i11 = i31;
                                    i5 = i3;
                                    zzlmVar = zzlmVar2;
                                    unsafe = unsafe32222222222222;
                                    zzioVar3 = zzioVar2;
                                    i9 = i29;
                                    break;
                                }
                        }
                    } else {
                        Object obj8 = obj4;
                        zzio zzioVar5 = zzioVar3;
                        i6 = 1048575;
                        Unsafe unsafe8 = unsafe2;
                        int i40 = i26;
                        int i41 = i24;
                        if (zzA == 27) {
                            if (i32 == 2) {
                                zzkj zzkjVar = (zzkj) unsafe8.getObject(obj8, j);
                                if (!zzkjVar.zzc()) {
                                    int size = zzkjVar.size();
                                    zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                    unsafe8.putObject(obj8, j, zzkjVar);
                                }
                                bArr2 = bArr;
                                i21 = zzip.zze(zzlmVar2.zzE(i34), i29, bArr, i30, i2, zzkjVar, zzioVar5);
                                i22 = i29;
                                obj4 = obj8;
                                unsafe2 = unsafe8;
                                i23 = i34;
                                i26 = i40;
                                i25 = i31;
                                i24 = i41;
                                i20 = i2;
                                zzioVar3 = zzioVar;
                            } else {
                                i10 = i34;
                                i18 = i31;
                                unsafe = unsafe8;
                                i19 = i29;
                                zzlmVar = this;
                                obj2 = obj;
                                i5 = i3;
                                i8 = i30;
                                i11 = i18;
                                i9 = i19;
                                i26 = i40;
                                i24 = i41;
                                zzioVar3 = zzioVar;
                            }
                        } else if (zzA <= 49) {
                            unsafe = unsafe8;
                            int zzv = zzlmVar2.zzv(obj8, bArr, i30, i2, i29, i31, i32, i34, i33, zzA, j, zzioVar);
                            if (zzv != i30) {
                                zzlmVar2 = this;
                                obj4 = obj;
                                i20 = i2;
                                zzioVar3 = zzioVar;
                                i21 = zzv;
                                i22 = i29;
                                i25 = i31;
                                i23 = i34;
                                i26 = i40;
                                unsafe2 = unsafe;
                                i24 = i41;
                                bArr2 = bArr;
                            } else {
                                zzlmVar = this;
                                zzioVar3 = zzioVar;
                                i8 = zzv;
                                i9 = i29;
                                i11 = i31;
                                i10 = i34;
                                i26 = i40;
                                i24 = i41;
                                obj2 = obj;
                                i5 = i3;
                            }
                        } else {
                            i19 = i29;
                            i18 = i31;
                            unsafe = unsafe8;
                            if (zzA != 50) {
                                i11 = i18;
                                i9 = i19;
                                zzioVar3 = zzioVar;
                                int zzt = zzt(obj, bArr, i30, i2, i9, i11, i32, i33, zzA, j, i34, zzioVar3);
                                zzlmVar = this;
                                obj2 = obj;
                                i10 = i34;
                                if (zzt != i30) {
                                    i22 = i9;
                                    i25 = i11;
                                    i21 = zzt;
                                    zzlmVar2 = zzlmVar;
                                    obj4 = obj2;
                                    i23 = i10;
                                    i26 = i40;
                                    unsafe2 = unsafe;
                                    i24 = i41;
                                    bArr2 = bArr;
                                    i20 = i2;
                                } else {
                                    i8 = zzt;
                                    i26 = i40;
                                    i24 = i41;
                                    i5 = i3;
                                }
                            } else if (i32 == 2) {
                                int zzs = zzs(obj, bArr, i30, i2, i34, j, zzioVar);
                                i10 = i34;
                                if (zzs != i30) {
                                    zzlmVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i21 = zzs;
                                    i23 = i10;
                                    i25 = i18;
                                    i22 = i19;
                                    i26 = i40;
                                    unsafe2 = unsafe;
                                    i24 = i41;
                                    zzioVar3 = zzioVar;
                                } else {
                                    zzlmVar = this;
                                    obj2 = obj;
                                    i5 = i3;
                                    i8 = zzs;
                                    i11 = i18;
                                    i9 = i19;
                                    i26 = i40;
                                    i24 = i41;
                                    zzioVar3 = zzioVar;
                                }
                            } else {
                                i10 = i34;
                                zzlmVar = this;
                                obj2 = obj;
                                i5 = i3;
                                i8 = i30;
                                i11 = i18;
                                i9 = i19;
                                i26 = i40;
                                i24 = i41;
                                zzioVar3 = zzioVar;
                            }
                        }
                    }
                }
                if (i9 != i5 || i5 == 0) {
                    if (!zzlmVar.zzh || zzioVar3.zzd == zzjo.zza()) {
                        int i42 = i9;
                        i13 = zzip.zzi(i42, bArr, i8, i2, zzd(obj2), zzioVar);
                        i12 = i42;
                        i14 = i2;
                    } else if (zzioVar3.zzd.zzc(zzlmVar.zzg, i11) == null) {
                        int i43 = i9;
                        i13 = zzip.zzi(i43, bArr, i8, i2, zzd(obj2), zzioVar3);
                        i12 = i43;
                        i14 = i2;
                    } else {
                        zzjz zzjzVar = (zzjz) obj2;
                        throw null;
                    }
                    i21 = i13;
                    zzlm<T> zzlmVar3 = zzlmVar;
                    i20 = i14;
                    zzlmVar2 = zzlmVar3;
                    bArr2 = bArr;
                    zzioVar3 = zzioVar;
                    i22 = i12;
                    i25 = i11;
                    obj4 = obj2;
                    i23 = i10;
                    unsafe2 = unsafe;
                } else {
                    i4 = i2;
                    i21 = i8;
                    i22 = i9;
                }
            } else {
                int i44 = i20;
                zzlmVar = zzlmVar2;
                i4 = i44;
                i5 = i3;
                obj2 = obj4;
                unsafe = unsafe2;
                i6 = 1048575;
            }
        }
        if (i26 != i6) {
            unsafe.putInt(obj2, i26, i24);
        }
        for (int i45 = zzlmVar.zzk; i45 < zzlmVar.zzl; i45++) {
            int i46 = zzlmVar.zzj[i45];
            int i47 = zzlmVar.zzc[i46];
            Object zzf = zzmv.zzf(obj2, zzlmVar.zzB(i46) & i6);
            if (zzf != null && zzlmVar.zzD(i46) != null) {
                zzld zzldVar = (zzld) zzf;
                zzlc zzlcVar = (zzlc) zzlmVar.zzF(i46);
                throw null;
            }
        }
        if (i5 == 0) {
            if (i21 != i4) {
                throw zzkm.zze();
            }
        } else if (i21 > i4 || i22 != i5) {
            throw zzkm.zze();
        }
        return i21;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzB = zzB(this.zzj[i2]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzioVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                int i2 = this.zzc[i];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzO(obj, i)) {
                            zzndVar.zzf(i2, zzmv.zza(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(obj, i)) {
                            zzndVar.zzo(i2, zzmv.zzb(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(obj, i)) {
                            zzndVar.zzt(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(obj, i)) {
                            zzndVar.zzJ(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(obj, i)) {
                            zzndVar.zzr(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(obj, i)) {
                            zzndVar.zzm(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(obj, i)) {
                            zzndVar.zzk(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(obj, i)) {
                            zzndVar.zzb(i2, zzmv.zzw(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(obj, i)) {
                            zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(obj, i)) {
                            zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(obj, i)) {
                            zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(obj, i)) {
                            zzndVar.zzH(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(obj, i)) {
                            zzndVar.zzi(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(obj, i)) {
                            zzndVar.zzw(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(obj, i)) {
                            zzndVar.zzy(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(obj, i)) {
                            zzndVar.zzA(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(obj, i)) {
                            zzndVar.zzC(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(obj, i)) {
                            zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 19:
                        zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 20:
                        zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 21:
                        zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 22:
                        zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 23:
                        zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 24:
                        zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 25:
                        zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 26:
                        zzlw.zzW(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    case 27:
                        zzlw.zzR(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                        break;
                    case 28:
                        zzlw.zzI(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 30:
                        zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                        zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 32:
                        zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 33:
                        zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 34:
                        zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 35:
                        zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 36:
                        zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 37:
                        zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 38:
                        zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 39:
                        zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 40:
                        zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 41:
                        zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 42:
                        zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 43:
                        zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 44:
                        zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 45:
                        zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 46:
                        zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 47:
                        zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zzlw.zzO(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                        break;
                    case 50:
                        zzM(zzndVar, i2, zzmv.zzf(obj, zzB & 1048575), i);
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzf(i2, zzn(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzo(i2, zzo(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzt(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzJ(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzr(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzm(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzk(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzb(i2, zzS(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzR(obj, i2, i)) {
                            zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzH(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzi(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzw(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzy(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzA(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzC(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzml zzmlVar = this.zzn;
            zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i) && Double.doubleToLongBits(zzmv.zza(obj, j)) == Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i) && Float.floatToIntBits(zzmv.zzb(obj, j)) == Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i) && zzmv.zzw(obj, j) == zzmv.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
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
                    z = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    z = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int zzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i3 = i7;
                i = i5;
                i2 = i10;
            } else {
                int i12 = i5;
                i2 = i4;
                i3 = i7;
                i = i12;
            }
            if ((268435456 & zzB) != 0 && !zzP(obj, i3, i2, i, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i8, i3) && !zzQ(obj, zzB, zzE(i3))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzlc zzlcVar = (zzlc) zzF(i3);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (!list.isEmpty()) {
                    zzlu zzE = zzE(i3);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzE.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzP(obj, i3, i2, i, i11) && !zzQ(obj, zzB, zzE(i3))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzI(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }
}
