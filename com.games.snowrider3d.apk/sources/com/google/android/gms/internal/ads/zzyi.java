package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzyi extends zzbr {
    public static final zzyi zzF = new zzyi(new zzyh());
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    private final SparseArray zzV;
    private final SparseBooleanArray zzW;

    static {
        String str = zzex.zza;
        Integer.toString(1000, 36);
        Integer.toString(PointerIconCompat.TYPE_CONTEXT_MENU, 36);
        Integer.toString(PointerIconCompat.TYPE_HAND, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
    }

    public zzyi(zzyh zzyhVar) {
        super(zzyhVar);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = zzyhVar.zza;
        this.zzG = z;
        this.zzH = false;
        z2 = zzyhVar.zzb;
        this.zzI = z2;
        this.zzJ = false;
        z3 = zzyhVar.zzc;
        this.zzK = z3;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        z4 = zzyhVar.zzd;
        this.zzP = z4;
        z5 = zzyhVar.zze;
        this.zzQ = z5;
        z6 = zzyhVar.zzf;
        this.zzR = z6;
        this.zzS = false;
        z7 = zzyhVar.zzg;
        this.zzT = z7;
        this.zzU = false;
        sparseArray = zzyhVar.zzh;
        this.zzV = sparseArray;
        sparseBooleanArray = zzyhVar.zzi;
        this.zzW = sparseBooleanArray;
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyi zzyiVar = (zzyi) obj;
            if (super.equals(zzyiVar) && this.zzG == zzyiVar.zzG && this.zzI == zzyiVar.zzI && this.zzK == zzyiVar.zzK && this.zzP == zzyiVar.zzP && this.zzQ == zzyiVar.zzQ && this.zzR == zzyiVar.zzR && this.zzT == zzyiVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzW;
                SparseBooleanArray sparseBooleanArray2 = zzyiVar.zzW;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.zzV;
                            SparseArray sparseArray2 = zzyiVar.zzV;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxk zzxkVar = (zzxk) entry.getKey();
                                                if (map2.containsKey(zzxkVar)) {
                                                    if (!Objects.equals(entry.getValue(), map2.get(zzxkVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzyh zzc() {
        return new zzyh(this, null);
    }

    @Deprecated
    public final zzyj zzd(int i, zzxk zzxkVar) {
        Map map = (Map) this.zzV.get(i);
        if (map != null) {
            return (zzyj) map.get(zzxkVar);
        }
        return null;
    }

    public final boolean zze(int i) {
        return this.zzW.get(i);
    }

    @Deprecated
    public final boolean zzf(int i, zzxk zzxkVar) {
        Map map = (Map) this.zzV.get(i);
        return map != null && map.containsKey(zzxkVar);
    }
}
