package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.common.util.Hex;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzng {
    private static final ParcelUuid zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int zzb;
    private final List zzc;
    private final SparseArray zzd;
    private final Map zze;
    private final int zzf;
    private final String zzg;
    private final byte[] zzh;

    private zzng(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.zzc = list;
        this.zzd = sparseArray;
        this.zze = map;
        this.zzg = str;
        this.zzb = i;
        this.zzf = i2;
        this.zzh = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.nearby.zzng zza(byte[] r15) {
        /*
            r1 = 0
            if (r15 != 0) goto L4
            return r1
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r7 = r6
            r6 = r2
            r2 = r7
            r8 = r1
            r7 = r3
        L1c:
            int r3 = r15.length     // Catch: java.lang.Exception -> L9d
            if (r2 >= r3) goto L8a
            int r3 = r2 + 1
            r9 = r15[r2]     // Catch: java.lang.Exception -> L9d
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            if (r9 != 0) goto L29
            goto L8a
        L29:
            int r11 = r9 + (-1)
            int r12 = r2 + 2
            r3 = r15[r3]     // Catch: java.lang.Exception -> L9d
            r3 = r3 & r10
            r13 = 22
            r14 = 2
            if (r3 == r13) goto L74
            if (r3 == r10) goto L5d
            switch(r3) {
                case 1: goto L58;
                case 2: goto L54;
                case 3: goto L54;
                case 4: goto L4f;
                case 5: goto L4f;
                case 6: goto L49;
                case 7: goto L49;
                case 8: goto L3f;
                case 9: goto L3f;
                case 10: goto L3b;
                default: goto L3a;
            }     // Catch: java.lang.Exception -> L9d
        L3a:
            goto L87
        L3b:
            r2 = r15[r12]     // Catch: java.lang.Exception -> L9d
            r7 = r2
            goto L87
        L3f:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Exception -> L9d
            byte[] r2 = zzd(r15, r12, r11)     // Catch: java.lang.Exception -> L9d
            r8.<init>(r2)     // Catch: java.lang.Exception -> L9d
            goto L87
        L49:
            r2 = 16
            zzb(r15, r12, r11, r2, r0)     // Catch: java.lang.Exception -> L9d
            goto L87
        L4f:
            r2 = 4
            zzb(r15, r12, r11, r2, r0)     // Catch: java.lang.Exception -> L9d
            goto L87
        L54:
            zzb(r15, r12, r11, r14, r0)     // Catch: java.lang.Exception -> L9d
            goto L87
        L58:
            r2 = r15[r12]     // Catch: java.lang.Exception -> L9d
            r2 = r2 & r10
            r6 = r2
            goto L87
        L5d:
            int r3 = r2 + 3
            r3 = r15[r3]     // Catch: java.lang.Exception -> L9d
            r3 = r3 & r10
            r13 = r15[r12]     // Catch: java.lang.Exception -> L9d
            int r3 = r3 << 8
            r10 = r10 & r13
            int r2 = r2 + 4
            int r9 = r9 + (-3)
            byte[] r2 = zzd(r15, r2, r9)     // Catch: java.lang.Exception -> L9d
            int r3 = r3 + r10
            r4.put(r3, r2)     // Catch: java.lang.Exception -> L9d
            goto L87
        L74:
            byte[] r3 = zzd(r15, r12, r14)     // Catch: java.lang.Exception -> L9d
            android.os.ParcelUuid r3 = zzc(r3)     // Catch: java.lang.Exception -> L9d
            int r2 = r2 + 4
            int r9 = r9 + (-3)
            byte[] r2 = zzd(r15, r2, r9)     // Catch: java.lang.Exception -> L9d
            r5.put(r3, r2)     // Catch: java.lang.Exception -> L9d
        L87:
            int r2 = r12 + r11
            goto L1c
        L8a:
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L9d
            r3 = 1
            if (r3 == r2) goto L93
            r3 = r0
            goto L94
        L93:
            r3 = r1
        L94:
            com.google.android.gms.internal.nearby.zzng r2 = new com.google.android.gms.internal.nearby.zzng     // Catch: java.lang.Exception -> L9d
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L9b
            return r2
        L9b:
            r0 = move-exception
            goto L9f
        L9d:
            r0 = move-exception
            r9 = r15
        L9f:
            java.lang.String r15 = java.util.Arrays.toString(r9)
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r2 = "BleRecord"
            java.lang.String r3 = "Unable to parse scan record: "
            java.lang.String r15 = r3.concat(r15)
            android.util.Log.w(r2, r15, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzng.zza(byte[]):com.google.android.gms.internal.nearby.zzng");
    }

    private static int zzb(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(zzc(zzd(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static ParcelUuid zzc(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
            } else {
                j = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
            }
            ParcelUuid parcelUuid = zza;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    private static byte[] zzd(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzng) {
            return Arrays.equals(this.zzh, ((zzng) obj).zzh);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str;
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        SparseArray sparseArray = this.zzd;
        StringBuilder sb = new StringBuilder();
        String str2 = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            str = str2;
        } else {
            sb.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb.append(keyAt);
                sb.append('=');
                sb.append(bArr == null ? null : Hex.bytesToStringUppercase(bArr));
            }
            sb.append('}');
            str = sb.toString();
        }
        Map map = this.zze;
        StringBuilder sb2 = new StringBuilder();
        if (!map.keySet().isEmpty()) {
            sb2.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                sb2.append(bArr2 == null ? null : Hex.bytesToStringUppercase(bArr2));
                i2++;
            }
            sb2.append('}');
            str2 = sb2.toString();
        }
        return "BleRecord [mAdvertiseFlags=" + i + ", mServiceUuids=" + valueOf + ", mManufacturerSpecificData=" + str + ", mServiceData=" + str2 + ", mTxPowerLevel=" + this.zzf + ", mDeviceName=" + this.zzg + "]";
    }
}
