package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbm {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzz[] zzd;
    private int zze;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbm(String str, zzz... zzzVarArr) {
        int length = zzzVarArr.length;
        int i = 1;
        zzdd.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzzVarArr;
        this.zza = length;
        int zzb = zzay.zzb(zzzVarArr[0].zzo);
        this.zzc = zzb == -1 ? zzay.zzb(zzzVarArr[0].zzn) : zzb;
        String zzc = zzc(zzzVarArr[0].zzd);
        int i2 = zzzVarArr[0].zzf | 16384;
        while (true) {
            zzz[] zzzVarArr2 = this.zzd;
            if (i < zzzVarArr2.length) {
                if (zzc.equals(zzc(zzzVarArr2[i].zzd))) {
                    zzz[] zzzVarArr3 = this.zzd;
                    if (i2 != (zzzVarArr3[i].zzf | 16384)) {
                        zzd("role flags", Integer.toBinaryString(zzzVarArr3[0].zzf), Integer.toBinaryString(this.zzd[i].zzf), i);
                        return;
                    }
                    i++;
                } else {
                    zzz[] zzzVarArr4 = this.zzd;
                    zzd("languages", zzzVarArr4[0].zzd, zzzVarArr4[i].zzd, i);
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
    }

    private static void zzd(String str, String str2, String str3, int i) {
        zzea.zzd("TrackGroup", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.zzb.equals(zzbmVar.zzb) && Arrays.equals(this.zzd, zzbmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = ((this.zzb.hashCode() + 527) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzd);
        return this.zzb + ": " + arrays;
    }

    public final int zza(zzz zzzVar) {
        int i = 0;
        while (true) {
            zzz[] zzzVarArr = this.zzd;
            if (i < zzzVarArr.length) {
                if (zzzVar == zzzVarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final zzz zzb(int i) {
        return this.zzd[i];
    }
}
