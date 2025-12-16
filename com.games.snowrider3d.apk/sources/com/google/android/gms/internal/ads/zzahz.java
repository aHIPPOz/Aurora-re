package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzahz {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzadw zzadwVar) throws IOException {
        int i;
        zzen zzenVar = this.zza;
        zzadl zzadlVar = (zzadl) zzadwVar;
        int i2 = 0;
        zzadlVar.zzm(zzenVar.zzN(), 0, 1, false);
        int i3 = zzenVar.zzN()[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while (true) {
                i = i5 + 1;
                if ((i3 & i4) != 0) {
                    break;
                }
                i4 >>= 1;
                i5 = i;
            }
            int i6 = i3 & (~i4);
            zzadlVar.zzm(zzenVar.zzN(), 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (zzenVar.zzN()[i2] & 255) + (i6 << 8);
            }
            this.zzb += i;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzadw zzadwVar) throws IOException {
        long zzb;
        int i;
        long zzd = zzadwVar.zzd();
        int i2 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && zzd <= 1024) {
            j = zzd;
        }
        zzen zzenVar = this.zza;
        zzadl zzadlVar = (zzadl) zzadwVar;
        zzadlVar.zzm(zzenVar.zzN(), 0, 4, false);
        this.zzb = 4;
        for (long zzu = zzenVar.zzu(); zzu != 440786851; zzu = ((zzu << 8) & (-256)) | (zzenVar.zzN()[0] & 255)) {
            int i3 = (int) j;
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzadlVar.zzm(zzenVar.zzN(), 0, 1, false);
        }
        long zzb2 = zzb(zzadwVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE) {
            long j3 = j2 + zzb2;
            if (i2 == 0 || j3 < zzd) {
                while (true) {
                    int i5 = (this.zzb > j3 ? 1 : (this.zzb == j3 ? 0 : -1));
                    if (i5 < 0) {
                        if (zzb(zzadwVar) == Long.MIN_VALUE || (zzb = zzb(zzadwVar)) < 0) {
                            return false;
                        }
                        if (i != 0) {
                            int i6 = (int) zzb;
                            zzadlVar.zzl(i6, false);
                            this.zzb += i6;
                        }
                    } else if (i5 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
