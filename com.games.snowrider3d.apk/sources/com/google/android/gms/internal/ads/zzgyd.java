package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgyd extends zzgyf {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzf;
    private final long zzg;
    private long zzh;
    private long zzi;
    private final long zzj;
    private int zzk;
    private int zzl;
    private int zzm = Integer.MAX_VALUE;

    public /* synthetic */ zzgyd(ByteBuffer byteBuffer, boolean z, zzgye zzgyeVar) {
        super(null);
        this.zzf = byteBuffer.duplicate();
        long zze = zzhce.zze(byteBuffer);
        this.zzg = zze;
        this.zzh = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzi = position;
        this.zzj = position;
    }

    private final int zzC() {
        return (int) (this.zzh - this.zzi);
    }

    private final void zzI() {
        long j = this.zzh + this.zzk;
        this.zzh = j;
        int i = (int) (j - this.zzj);
        int i2 = this.zzm;
        if (i <= i2) {
            this.zzk = 0;
            return;
        }
        int i3 = i - i2;
        this.zzk = i3;
        this.zzh = j - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final boolean zzB() throws IOException {
        return zzq() != 0;
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
        return (int) (this.zzi - this.zzj);
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
        long j = this.zzi;
        if (this.zzh - j >= 4) {
            this.zzi = 4 + j;
            int zza2 = (zzhce.zza(1 + j) & 255) << 8;
            return ((zzhce.zza(j + 3) & 255) << 24) | zza2 | (zzhce.zza(j) & 255) | ((zzhce.zza(2 + j) & 255) << 16);
        }
        throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
            this.zzl = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzl = zzi;
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
        long j = this.zzi;
        if (this.zzh - j >= 8) {
            this.zzi = 8 + j;
            long zza2 = zzhce.zza(6 + j);
            return ((zzhce.zza(j + 7) & 255) << 56) | (zzhce.zza(j) & 255) | ((zzhce.zza(1 + j) & 255) << 8) | ((zzhce.zza(2 + j) & 255) << 16) | ((zzhce.zza(3 + j) & 255) << 24) | ((zzhce.zza(4 + j) & 255) << 32) | ((zzhce.zza(5 + j) & 255) << 40) | ((zza2 & 255) << 48);
        }
        throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return zzgxz.zzb;
            }
            if (zzi >= 0) {
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[zzi];
        long j = zzi;
        zzhce.zzo(this.zzi, bArr, 0L, j);
        this.zzi += j;
        zzgxz zzgxzVar = zzgxz.zzb;
        return new zzgxw(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (zzi >= 0) {
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArr = new byte[zzi];
        long j = zzi;
        zzhce.zzo(this.zzi, bArr, 0L, j);
        String str = new String(bArr, zzgzu.zza);
        this.zzi += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzhcj.zzg(this.zzf, (int) (this.zzi - this.zzg), zzi);
            this.zzi += zzi;
            return zzg;
        } else if (zzi == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            if (zzi > 0) {
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final void zzy(int i) throws zzgzw {
        if (this.zzl == i) {
            return;
        }
        throw new zzgzw("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final void zzz(int i) {
        this.zzm = i;
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgyf
    public final int zzd(int i) throws zzgzw {
        if (i >= 0) {
            int zzc = i + zzc();
            int i2 = this.zzm;
            if (zzc <= i2) {
                this.zzm = zzc;
                zzI();
                return i2;
            }
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    final long zzr() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.zzi;
            if (j2 != this.zzh) {
                this.zzi = 1 + j2;
                byte zza2 = zzhce.zza(j2);
                j |= (zza2 & Byte.MAX_VALUE) << i;
                if ((zza2 & 128) == 0) {
                    return j;
                }
            } else {
                throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new zzgzw("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (com.google.android.gms.internal.ads.zzhce.zza(r3) >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzi() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzi
            long r2 = r9.zzh
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhce.zza(r0)
            if (r4 < 0) goto L16
            r9.zzi = r2
            return r4
        L16:
            long r5 = r9.zzh
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzhce.zza(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhce.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhce.zza(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.zzi = r5
            return r0
        L92:
            long r0 = r9.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyd.zzi():int");
    }

    public final long zzq() throws IOException {
        long j;
        long j2;
        int i;
        long j3 = this.zzi;
        if (this.zzh != j3) {
            long j4 = 1 + j3;
            byte zza2 = zzhce.zza(j3);
            if (zza2 >= 0) {
                this.zzi = j4;
                return zza2;
            } else if (this.zzh - j4 >= 9) {
                long j5 = 2 + j3;
                int zza3 = (zzhce.zza(j4) << 7) ^ zza2;
                if (zza3 >= 0) {
                    long j6 = 3 + j3;
                    int zza4 = zza3 ^ (zzhce.zza(j5) << Ascii.SO);
                    if (zza4 >= 0) {
                        j = zza4 ^ 16256;
                    } else {
                        j5 = 4 + j3;
                        int zza5 = zza4 ^ (zzhce.zza(j6) << Ascii.NAK);
                        if (zza5 < 0) {
                            i = (-2080896) ^ zza5;
                        } else {
                            j6 = 5 + j3;
                            long zza6 = (zzhce.zza(j5) << 28) ^ zza5;
                            if (zza6 < 0) {
                                long j7 = 6 + j3;
                                long zza7 = (zzhce.zza(j6) << 35) ^ zza6;
                                if (zza7 >= 0) {
                                    j5 = j3 + 7;
                                    long zza8 = zza7 ^ (zzhce.zza(j7) << 42);
                                    if (zza8 >= 0) {
                                        j = 4363953127296L ^ zza8;
                                    } else {
                                        j7 = 8 + j3;
                                        zza7 = zza8 ^ (zzhce.zza(j5) << 49);
                                        if (zza7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j5 = j3 + 9;
                                            long zza9 = (zza7 ^ (zzhce.zza(j7) << 56)) ^ 71499008037633920L;
                                            if (zza9 < 0) {
                                                long j8 = j3 + 10;
                                                if (zzhce.zza(j5) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                            j = zza9;
                                        }
                                    }
                                    this.zzi = j5;
                                    return j;
                                }
                                j2 = -34093383808L;
                                j = j2 ^ zza7;
                                j5 = j7;
                                this.zzi = j5;
                                return j;
                            }
                            j = 266354560 ^ zza6;
                        }
                    }
                    j5 = j6;
                    this.zzi = j5;
                    return j;
                }
                i = zza3 ^ RangingPosition.RSSI_UNKNOWN;
                j = i;
                this.zzi = j5;
                return j;
            }
        }
        return zzr();
    }
}
