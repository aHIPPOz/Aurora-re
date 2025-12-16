package com.google.android.gms.internal.nearby;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
final class zztd extends zztg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zztd(java.lang.String r2, java.lang.String r3, @javax.annotation.CheckForNull java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.gms.internal.nearby.zztb r0 = new com.google.android.gms.internal.nearby.zztb
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.gms.internal.nearby.zztb.zze(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.gms.internal.nearby.zzsg.zzd(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zztd.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.nearby.zztg, com.google.android.gms.internal.nearby.zzth
    public final void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        appendable.getClass();
        int i3 = 0;
        zzsg.zzg(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
            appendable.append(this.zzb.zza(i5 >>> 18));
            appendable.append(this.zzb.zza((i5 >>> 12) & 63));
            appendable.append(this.zzb.zza((i5 >>> 6) & 63));
            appendable.append(this.zzb.zza(i5 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzg(appendable, bArr, i3, i2 - i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.nearby.zztg, com.google.android.gms.internal.nearby.zzth
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzte {
        bArr.getClass();
        CharSequence zzf = zzf(charSequence);
        if (this.zzb.zzc(zzf.length())) {
            int i = 0;
            int i2 = 0;
            while (i < zzf.length()) {
                int i3 = i2 + 1;
                int zzb = (this.zzb.zzb(zzf.charAt(i)) << 18) | (this.zzb.zzb(zzf.charAt(i + 1)) << 12);
                bArr[i2] = (byte) (zzb >>> 16);
                int i4 = i + 2;
                if (i4 < zzf.length()) {
                    int i5 = i + 3;
                    int zzb2 = zzb | (this.zzb.zzb(zzf.charAt(i4)) << 6);
                    int i6 = i2 + 2;
                    bArr[i3] = (byte) ((zzb2 >>> 8) & 255);
                    if (i5 < zzf.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((zzb2 | this.zzb.zzb(zzf.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i = i4;
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new zzte("Invalid input length " + zzf.length());
    }
}
