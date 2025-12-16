package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgyc extends zzgyf {
    private final InputStream zza;
    private int zzh;
    private int zzj;
    private int zzl = Integer.MAX_VALUE;
    private final byte[] zzf = new byte[4096];
    private int zzg = 0;
    private int zzi = 0;
    private int zzk = 0;

    public /* synthetic */ zzgyc(InputStream inputStream, int i, zzgye zzgyeVar) {
        super(null);
        byte[] bArr = zzgzu.zzb;
        this.zza = inputStream;
    }

    private final List zzI(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zza.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.zzk += read;
                    i2 += read;
                } else {
                    throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk + i;
        int i3 = this.zzl;
        if (i2 <= i3) {
            this.zzh = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzh = i4;
        this.zzg = i - i4;
    }

    private final void zzK(int i) throws IOException {
        if (!zzL(i)) {
            if (i <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
    }

    private final boolean zzL(int i) throws IOException {
        int i2 = this.zzi;
        int i3 = i2 + i;
        int i4 = this.zzg;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.zzk;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.zzl) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.zzk + i2;
            this.zzk = i5;
            i4 = this.zzg - i2;
            this.zzg = i4;
            this.zzi = 0;
        }
        try {
            int read = this.zza.read(this.zzf, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.zzg += read;
                zzJ();
                return this.zzg >= i || zzL(i);
            }
            throw new IllegalStateException(String.valueOf(this.zza.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
        } catch (zzgzw e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzM(int i, boolean z) throws IOException {
        byte[] zzN = zzN(i);
        if (zzN != null) {
            return zzN;
        }
        int i2 = this.zzi;
        int i3 = this.zzg;
        int i4 = i3 - i2;
        this.zzk += i3;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i) throws IOException {
        if (i == 0) {
            return zzgzu.zzb;
        }
        int i2 = this.zzk;
        int i3 = this.zzi;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 <= 0) {
            int i5 = this.zzl;
            if (i4 > i5) {
                zzC((i5 - i2) - i3);
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            int i6 = this.zzg - i3;
            int i7 = i - i6;
            if (i7 >= 4096) {
                try {
                    if (i7 > this.zza.available()) {
                        return null;
                    }
                } catch (zzgzw e) {
                    e.zza();
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.zzf, this.zzi, bArr, 0, i6);
            this.zzk += this.zzg;
            this.zzi = 0;
            this.zzg = 0;
            while (i6 < i) {
                try {
                    int read = this.zza.read(bArr, i6, i - i6);
                    if (read != -1) {
                        this.zzk += read;
                        i6 += read;
                    } else {
                        throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                } catch (zzgzw e2) {
                    e2.zza();
                    throw e2;
                }
            }
            return bArr;
        }
        throw new zzgzw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    public final void zzC(int i) throws IOException {
        int i2 = this.zzg;
        int i3 = this.zzi;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzi = i3 + i;
        } else if (i >= 0) {
            int i5 = this.zzk;
            int i6 = i5 + i3;
            int i7 = this.zzl;
            if (i6 + i > i7) {
                zzC((i7 - i5) - i3);
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzk = i6;
            this.zzg = 0;
            this.zzi = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.zza.skip(j);
                        int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.zza.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (zzgzw e) {
                        e.zza();
                        throw e;
                    }
                } finally {
                    this.zzk += i4;
                    zzJ();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i9 = this.zzg;
            int i10 = i9 - this.zzi;
            this.zzi = i9;
            zzK(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.zzg;
                if (i11 <= i12) {
                    this.zzi = i11;
                    return;
                }
                i10 += i12;
                this.zzi = i12;
                zzK(1);
            }
        } else {
            throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzK(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzk() throws IOException {
        return zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzj = zzi;
        if ((zzi >>> 3) == 0) {
            throw new zzgzw("Protocol message contained an invalid tag (zero).");
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzK(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        long j = bArr[i + 2];
        long j2 = bArr[i + 3];
        long j3 = bArr[i + 4];
        long j4 = bArr[i + 5];
        return ((bArr[i + 6] & 255) << 48) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((j & 255) << 16) | ((j2 & 255) << 24) | ((j3 & 255) << 32) | ((j4 & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    final long zzr() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i2 = this.zzi;
            this.zzi = i2 + 1;
            byte b = bArr[i2];
            j |= (b & Byte.MAX_VALUE) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new zzgzw("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final long zzt() throws IOException {
        return zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final zzgxz zzv() throws IOException {
        int zzi = zzi();
        int i = this.zzg;
        int i2 = this.zzi;
        if (zzi <= i - i2 && zzi > 0) {
            zzgxz zzv = zzgxz.zzv(this.zzf, i2, zzi);
            this.zzi += zzi;
            return zzv;
        } else if (zzi == 0) {
            return zzgxz.zzb;
        } else {
            if (zzi < 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            byte[] zzN = zzN(zzi);
            if (zzN != null) {
                return zzgxz.zzv(zzN, 0, zzN.length);
            }
            int i3 = this.zzi;
            int i4 = this.zzg;
            int i5 = i4 - i3;
            this.zzk += i4;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzI = zzI(zzi - i5);
            byte[] bArr = new byte[zzi];
            System.arraycopy(this.zzf, i3, bArr, 0, i5);
            for (byte[] bArr2 : zzI) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            zzgxz zzgxzVar = zzgxz.zzb;
            return new zzgxw(bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzi <= i - i2) {
                String str = new String(this.zzf, i2, zzi, zzgzu.zza);
                this.zzi += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzi >= 0) {
            if (zzi <= this.zzg) {
                zzK(zzi);
                String str2 = new String(this.zzf, this.zzi, zzi, zzgzu.zza);
                this.zzi += zzi;
                return str2;
            }
            return new String(zzM(zzi, false), zzgzu.zza);
        }
        throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final String zzx() throws IOException {
        byte[] bArr;
        int zzi = zzi();
        int i = this.zzi;
        int i2 = this.zzg;
        if (zzi <= i2 - i && zzi > 0) {
            bArr = this.zzf;
            this.zzi = i + zzi;
        } else if (zzi == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            if (zzi < 0) {
                throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (zzi <= i2) {
                zzK(zzi);
                bArr = this.zzf;
                this.zzi = zzi;
            } else {
                bArr = zzM(zzi, false);
            }
        }
        return zzhcj.zzh(bArr, i, zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final void zzy(int i) throws zzgzw {
        if (this.zzj == i) {
            return;
        }
        throw new zzgzw("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final void zzz(int i) {
        this.zzl = i;
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzd(int i) throws zzgzw {
        if (i >= 0) {
            int i2 = i + this.zzk + this.zzi;
            if (i2 >= 0) {
                int i3 = this.zzl;
                if (i2 <= i3) {
                    this.zzl = i2;
                    zzJ();
                    return i3;
                }
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzw("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int zzi() throws IOException {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ RangingPosition.RSSI_UNKNOWN;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << Ascii.FS)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzr();
    }

    public final long zzq() throws IOException {
        long j;
        long j2;
        int i = this.zzi;
        int i2 = this.zzg;
        if (i2 != i) {
            byte[] bArr = this.zzf;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzi = i3;
                return b;
            } else if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ RangingPosition.RSSI_UNKNOWN;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << Ascii.SO) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            i6 = i + 5;
                            long j3 = (bArr[i8] << 28) ^ i9;
                            if (j3 >= 0) {
                                j = j3 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j4 = (bArr[i6] << 35) ^ j3;
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j5 = j4 ^ (bArr[i4] << 42);
                                    if (j5 >= 0) {
                                        j = j5 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (bArr[i10] << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j6 = (j4 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j6;
                                                }
                                            } else {
                                                j = j6;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j4 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzi = i4;
                return j;
            }
        }
        return zzr();
    }
}
