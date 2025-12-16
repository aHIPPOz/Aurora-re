package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzrw extends zzco {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzrw() {
        byte[] bArr = zzex.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i) {
        boolean z = true;
        int zzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        if (zzr < 0) {
            z = false;
        }
        zzdd.zzf(z);
        int i2 = this.zzd;
        return (((int) Math.min((i * 0.2f) + 0.5f, zzr)) / i2) * i2;
    }

    private final int zzr(long j) {
        return (int) ((j * this.zzb.zzb) / 1000000);
    }

    private static int zzs(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void zzt(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = this.zzk;
        int length = this.zzi.length;
        boolean z2 = true;
        if (i4 != length) {
            if (!z) {
                return;
            }
            z = true;
        }
        if (this.zzh == 0) {
            if (z) {
                zzu(i4, 3);
                i = i4;
            } else {
                zzdd.zzf(i4 >= (length >> 1));
                i = this.zzi.length >> 1;
                zzu(i, 0);
            }
            i2 = i;
        } else {
            int i5 = length >> 1;
            int i6 = i4 - i5;
            if (z) {
                int zzq = zzq(i6) + (this.zzi.length >> 1);
                zzu(zzq, 2);
                int i7 = i5 + i6;
                i2 = zzq;
                i = i7;
            } else {
                int zzq2 = zzq(i6);
                zzu(zzq2, 1);
                i2 = zzq2;
                i = i6;
            }
        }
        zzdd.zzg(i % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + i);
        if (i4 < i2) {
            z2 = false;
        }
        zzdd.zzf(z2);
        this.zzk -= i;
        int i8 = this.zzj + i;
        this.zzj = i8;
        this.zzj = i8 % this.zzi.length;
        this.zzh = this.zzh + (i2 / this.zzd);
        this.zzg += (i - i2) / i3;
    }

    private final void zzu(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        boolean z = true;
        zzdd.zzd(this.zzk >= i);
        if (i2 == 2) {
            int i4 = this.zzj;
            int i5 = this.zzk;
            int i6 = i4 + i5;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.zzl, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.zzl, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.zzl, 0, i8);
                    System.arraycopy(this.zzi, 0, this.zzl, i8, i7);
                }
            }
        } else {
            int i9 = this.zzj;
            int i10 = i9 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.zzl, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.zzl, 0, i11);
                System.arraycopy(this.zzi, 0, this.zzl, i11, i - i11);
            }
        }
        zzdd.zze(i % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + i);
        zzdd.zzf(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        String str = "byteOutput size is not aligned to frame size " + i;
        if (i % this.zzd != 0) {
            z = false;
        }
        zzdd.zze(z, str);
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int zzs = zzs(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (zzs * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        zzj(i).put(bArr3, 0, i).flip();
    }

    private static final boolean zzv(byte b, byte b2) {
        return Math.abs(zzs(b, b2)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zze(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            boolean z = true;
            if (this.zzf == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.zzi.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 >= byteBuffer.position()) {
                        if (zzv(byteBuffer.get(limit3), byteBuffer.get(limit3 - 1))) {
                            int i2 = this.zzd;
                            position = ((limit3 / i2) * i2) + i2;
                            break;
                        }
                        limit3 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                zzdd.zzf(this.zzj < this.zzi.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i3 = this.zzd;
                            limit = i3 * (position2 / i3);
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.zzj;
                int i5 = this.zzk;
                int i6 = i4 + i5;
                int length = this.zzi.length;
                if (i6 < length) {
                    i = length - i6;
                } else {
                    i6 = i5 - (length - i4);
                    i = i4 - i6;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i6, min);
                int i7 = this.zzk + min;
                this.zzk = i7;
                zzdd.zzf(i7 <= this.zzi.length);
                if (limit >= limit4 || position3 >= i) {
                    z = false;
                }
                zzt(z);
                if (z) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzcn
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    protected final zzcl zzi(zzcl zzclVar) throws zzcm {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcm("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzk() {
        if (zzg()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int i2 = this.zzd;
            int zzr = ((zzr(100000L) / 2) / i2) * i2;
            int i3 = zzr + zzr;
            if (this.zzi.length != i3) {
                this.zzi = new byte[i3];
                this.zzl = new byte[i3];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzex.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z) {
        this.zze = z;
    }
}
