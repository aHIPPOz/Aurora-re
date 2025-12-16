package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfa implements zzau {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzfa(String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        boolean z = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (i2 == 23) {
                if (bArr.length == 4) {
                    i2 = 23;
                    zzdd.zzd(z);
                } else {
                    i2 = 23;
                }
            }
            z = false;
            zzdd.zzd(z);
        } else if (c == 1 || c == 2) {
            if (i2 == 78) {
                if (bArr.length == 8) {
                    i2 = 78;
                    zzdd.zzd(z);
                } else {
                    i2 = 78;
                }
            }
            z = false;
            zzdd.zzd(z);
        } else if (c == 3) {
            zzdd.zzd(i2 != 0 ? false : z);
        } else if (c == 4) {
            if (i2 == 75) {
                if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    i2 = 75;
                    zzdd.zzd(z);
                } else {
                    i2 = 75;
                }
            }
            z = false;
            zzdd.zzd(z);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfa zzfaVar = (zzfa) obj;
            if (this.zza.equals(zzfaVar.zza) && Arrays.equals(this.zzb, zzfaVar.zzb) && this.zzc == zzfaVar.zzc && this.zzd == zzfaVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }

    public final List zzb() {
        zzdd.zzg(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[LOOP:0: B:23:0x0087->B:25:0x008a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.zzd
            r1 = 0
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 == r2) goto L50
            r2 = 23
            if (r0 == r2) goto L41
            r2 = 67
            if (r0 == r2) goto L36
            r2 = 75
            if (r0 == r2) goto L2a
            r2 = 78
            if (r0 == r2) goto L19
            goto L7c
        L19:
            byte[] r0 = r5.zzb
            com.google.android.gms.internal.ads.zzen r1 = new com.google.android.gms.internal.ads.zzen
            r1.<init>(r0)
            long r0 = r1.zzw()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lab
        L2a:
            byte[] r0 = r5.zzb
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lab
        L36:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgbt.zzd(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lab
        L41:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgbt.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lab
        L50:
            byte[] r0 = r5.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzex.zzB(r0)
            goto Lab
        L57:
            java.lang.String r0 = r5.zza
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7c
            java.util.List r0 = r5.zzb()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "track types = "
            r1.append(r2)
            java.lang.String r2 = ","
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.zzfvh.zzb(r1, r0, r2)
            java.lang.String r0 = r1.toString()
            goto Lab
        L7c:
            byte[] r0 = r5.zzb
            java.lang.String r2 = com.google.android.gms.internal.ads.zzex.zza
            int r2 = r0.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r2
            r3.<init>(r2)
        L87:
            int r2 = r0.length
            if (r1 >= r2) goto La7
            r2 = r0[r1]
            int r2 = r2 >> 4
            r2 = r2 & 15
            r4 = 16
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            r2 = r0[r1]
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            int r1 = r1 + 1
            goto L87
        La7:
            java.lang.String r0 = r3.toString()
        Lab:
            java.lang.String r1 = r5.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mdta: key="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfa.toString():java.lang.String");
    }
}
