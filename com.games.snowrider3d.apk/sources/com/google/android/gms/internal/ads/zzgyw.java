package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgyw {
    private static final zzgyw zzb = new zzgyw(true);
    final zzhbt zza = new zzhbo();
    private boolean zzc;
    private boolean zzd;

    private zzgyw() {
    }

    static int zza(zzhck zzhckVar, int i, Object obj) {
        int zzD = zzgym.zzD(i << 3);
        if (zzhckVar == zzhck.GROUP) {
            zzhas zzhasVar = (zzhas) obj;
            byte[] bArr = zzgzu.zzb;
            if (zzhasVar instanceof zzgxj) {
                zzgxj zzgxjVar = (zzgxj) zzhasVar;
                throw null;
            }
            zzD += zzD;
        }
        return zzD + zzb(zzhckVar, obj);
    }

    static int zzb(zzhck zzhckVar, Object obj) {
        int zzd;
        int zzD;
        zzhck zzhckVar2 = zzhck.DOUBLE;
        zzhcl zzhclVar = zzhcl.INT;
        switch (zzhckVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = zzgym.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = zzgym.zzf;
                return 4;
            case 2:
                return zzgym.zzE(((Long) obj).longValue());
            case 3:
                return zzgym.zzE(((Long) obj).longValue());
            case 4:
                return zzgym.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = zzgym.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = zzgym.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = zzgym.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgxz) {
                    int i6 = zzgym.zzf;
                    zzd = ((zzgxz) obj).zzd();
                    zzD = zzgym.zzD(zzd);
                    break;
                } else {
                    return zzgym.zzC((String) obj);
                }
            case 9:
                return ((zzhas) obj).zzaY();
            case 10:
                if (obj instanceof zzhac) {
                    int i7 = zzgym.zzf;
                    zzd = ((zzhac) obj).zza();
                    zzD = zzgym.zzD(zzd);
                    break;
                } else {
                    return zzgym.zzz((zzhas) obj);
                }
            case 11:
                if (obj instanceof zzgxz) {
                    int i8 = zzgym.zzf;
                    zzd = ((zzgxz) obj).zzd();
                    zzD = zzgym.zzD(zzd);
                    break;
                } else {
                    int i9 = zzgym.zzf;
                    zzd = ((byte[]) obj).length;
                    zzD = zzgym.zzD(zzd);
                    break;
                }
            case 12:
                return zzgym.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgzl) {
                    return zzgym.zzE(((zzgzl) obj).zza());
                }
                return zzgym.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i10 = zzgym.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i11 = zzgym.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgym.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgym.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd;
    }

    public static int zzc(zzgyv zzgyvVar, Object obj) {
        zzhck zzb2 = zzgyvVar.zzb();
        int zza = zzgyvVar.zza();
        if (zzgyvVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (!zzgyvVar.zzd()) {
                int i2 = 0;
                while (i < size) {
                    i2 += zza(zzb2, zza, list.get(i));
                    i++;
                }
                return i2;
            } else if (list.isEmpty()) {
                return 0;
            } else {
                int i3 = 0;
                while (i < size) {
                    i3 += zzb(zzb2, list.get(i));
                    i++;
                }
                return zzgym.zzD(zza << 3) + i3 + zzgym.zzD(i3);
            }
        }
        return zza(zzb2, zza, obj);
    }

    public static zzgyw zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgyv zzgyvVar = (zzgyv) entry.getKey();
        if (zzgyvVar.zzc() == zzhcl.MESSAGE) {
            if (zzgyvVar.zze()) {
                List list = (List) entry.getValue();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!zzk(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return zzk(entry.getValue());
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzhat) {
            return ((zzhat) obj).zzbw();
        }
        if (!(obj instanceof zzhac)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int zzD;
        int zzD2;
        zzgyv zzgyvVar = (zzgyv) entry.getKey();
        Object value = entry.getValue();
        if (zzgyvVar.zzc() != zzhcl.MESSAGE || zzgyvVar.zze() || zzgyvVar.zzd()) {
            return zzc(zzgyvVar, value);
        }
        if (value instanceof zzhac) {
            int zza = ((zzgyv) entry.getKey()).zza();
            int zzD3 = zzgym.zzD(8);
            i = zzD3 + zzD3;
            zzD = zzgym.zzD(16) + zzgym.zzD(zza);
            int zzD4 = zzgym.zzD(24);
            int zza2 = ((zzhac) value).zza();
            zzD2 = zzD4 + zzgym.zzD(zza2) + zza2;
        } else {
            int zza3 = ((zzgyv) entry.getKey()).zza();
            int zzD5 = zzgym.zzD(8);
            i = zzD5 + zzD5;
            zzD = zzgym.zzD(16) + zzgym.zzD(zza3);
            zzD2 = zzgym.zzD(24) + zzgym.zzz((zzhas) value);
        }
        return i + zzD + zzD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzm(com.google.android.gms.internal.ads.zzgyv r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzhck r0 = r2.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzgzu.zzb
            r3.getClass()
            com.google.android.gms.internal.ads.zzhck r1 = com.google.android.gms.internal.ads.zzhck.DOUBLE
            com.google.android.gms.internal.ads.zzhcl r1 = com.google.android.gms.internal.ads.zzhcl.INT
            com.google.android.gms.internal.ads.zzhcl r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhas
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhac
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgzl
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgxz
            if (r0 != 0) goto L47
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r3 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r3 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r3 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r3 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r3 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zzhck r2 = r2.zzb()
            com.google.android.gms.internal.ads.zzhcl r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyw.zzm(com.google.android.gms.internal.ads.zzgyv, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgyw zzgywVar = new zzgyw();
        zzhbt zzhbtVar = this.zza;
        int zzc = zzhbtVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzg = zzhbtVar.zzg(i);
            zzgywVar.zzh((zzgyv) ((zzhbp) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zzhbtVar.zzd()) {
            zzgywVar.zzh((zzgyv) entry.getKey(), entry.getValue());
        }
        zzgywVar.zzd = this.zzd;
        return zzgywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgyw) {
            return this.zza.equals(((zzgyw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzhbt zzhbtVar = this.zza;
        int zzc = zzhbtVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzl(zzhbtVar.zzg(i2));
        }
        for (Map.Entry entry : zzhbtVar.zzd()) {
            i += zzl(entry);
        }
        return i;
    }

    public final Iterator zzf() {
        zzhbt zzhbtVar = this.zza;
        if (zzhbtVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzhaa(zzhbtVar.entrySet().iterator());
        }
        return zzhbtVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        zzhbt zzhbtVar = this.zza;
        int zzc = zzhbtVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzhbtVar.zzg(i).getValue();
            if (value instanceof zzgzh) {
                ((zzgzh) value).zzbU();
            }
        }
        for (Map.Entry entry : zzhbtVar.zzd()) {
            Object value2 = entry.getValue();
            if (value2 instanceof zzgzh) {
                ((zzgzh) value2).zzbU();
            }
        }
        zzhbtVar.zza();
        this.zzc = true;
    }

    public final void zzh(zzgyv zzgyvVar, Object obj) {
        if (zzgyvVar.zze()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzm(zzgyvVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            zzm(zzgyvVar, obj);
        }
        if (obj instanceof zzhac) {
            this.zzd = true;
        }
        this.zza.put(zzgyvVar, obj);
    }

    public final boolean zzi() {
        zzhbt zzhbtVar = this.zza;
        int zzc = zzhbtVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzj(zzhbtVar.zzg(i))) {
                return false;
            }
        }
        for (Map.Entry entry : zzhbtVar.zzd()) {
            if (!zzj(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzgyw(boolean z) {
        zzg();
        zzg();
    }
}
