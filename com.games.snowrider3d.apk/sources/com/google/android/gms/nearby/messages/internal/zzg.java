package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzg extends zzc {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzg(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            byte[] r6 = zzd(r6)
            byte[] r7 = zzd(r7)
            int r0 = r6.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Namespace length("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = " bytes) must be 10 bytes."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 10
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L24
            r0 = r3
            goto L25
        L24:
            r0 = r4
        L25:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            int r0 = r7.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Instance length("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = " bytes) must be 6 bytes."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 6
            if (r0 != r2) goto L40
            goto L41
        L40:
            r3 = r4
        L41:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r1)
            byte[][] r6 = new byte[][]{r6, r7}
            byte[] r6 = com.google.android.gms.common.util.ArrayUtils.concatByteArrays(r6)
            zze(r6)
            r5.<init>(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.zzg.<init>(java.lang.String, java.lang.String):void");
    }

    private static byte[] zze(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length != 10 && length != 16) {
            z = false;
        }
        Preconditions.checkArgument(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final String toString() {
        String zza = zza();
        return "EddystoneUidPrefix{bytes=" + zza + "}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(byte[] bArr) {
        super(bArr);
        zze(bArr);
    }
}
