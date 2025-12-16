package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzalf implements zzakt {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf = new Canvas();
    private final zzaky zzg = new zzaky(719, 575, 0, 719, 0, 575);
    private final zzakx zzh = new zzakx(0, zzg(), zzh(), zzi());
    private final zzale zzi;
    private Bitmap zzj;

    public zzalf(List list) {
        zzen zzenVar = new zzen((byte[]) list.get(0));
        int zzq = zzenVar.zzq();
        int zzq2 = zzenVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzi = new zzale(zzq, zzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzakx zzc(zzem zzemVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 8;
        int zzd = zzemVar.zzd(8);
        zzemVar.zzn(8);
        int[] zzg = zzg();
        int[] zzh = zzh();
        int[] zzi = zzi();
        int i7 = i - 2;
        while (i7 > 0) {
            int zzd2 = zzemVar.zzd(i6);
            int zzd3 = zzemVar.zzd(i6);
            int[] iArr = (zzd3 & 128) != 0 ? zzg : (zzd3 & 64) != 0 ? zzh : zzi;
            if ((zzd3 & 1) != 0) {
                i5 = zzemVar.zzd(i6);
                i4 = zzemVar.zzd(i6);
                i3 = zzemVar.zzd(i6);
                i2 = zzemVar.zzd(i6);
                i7 -= 6;
            } else {
                int zzd4 = zzemVar.zzd(2) << 6;
                i7 -= 4;
                i3 = zzemVar.zzd(4) << 4;
                i2 = zzd4;
                i5 = zzemVar.zzd(6) << 2;
                i4 = zzemVar.zzd(4) << 4;
            }
            if (i5 == 0) {
                i2 = 255;
            }
            if (i5 == 0) {
                i3 = 0;
            }
            if (i5 == 0) {
                i4 = 0;
            }
            int i8 = i3 + RangingPosition.RSSI_UNKNOWN;
            double d = i5;
            String str = zzex.zza;
            double d2 = i4 + RangingPosition.RSSI_UNKNOWN;
            double d3 = i8;
            iArr[zzd2] = zzb((byte) (255 - (i2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzd = zzd;
            i6 = 8;
        }
        return new zzakx(zzd, zzg, zzh, zzi);
    }

    private static zzakz zzd(zzem zzemVar) {
        byte[] bArr;
        int zzd = zzemVar.zzd(16);
        zzemVar.zzn(4);
        int zzd2 = zzemVar.zzd(2);
        boolean zzp = zzemVar.zzp();
        zzemVar.zzn(1);
        byte[] bArr2 = zzex.zzb;
        if (zzd2 == 1) {
            zzemVar.zzn(zzemVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzemVar.zzd(16);
            int zzd4 = zzemVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzemVar.zzi(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzemVar.zzi(bArr, 0, zzd4);
                return new zzakz(zzd, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzakz(zzd, zzp, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fe A[LOOP:3: B:88:0x0163->B:120:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalf.zze(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzf(int i, int i2, zzem zzemVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzemVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = WorkQueueKt.MASK;
                int i6 = 1 != i4 ? 0 : 127;
                int i7 = i3 != 0 ? 127 : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzb(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = i & 2;
                int i4 = i & 4;
                int i5 = 1 != (i & 1) ? 0 : 255;
                int i6 = i3 != 0 ? 255 : 0;
                if (i4 == 0) {
                    i2 = 0;
                }
                iArr[i] = zzb(63, i5, i6, i2);
            } else {
                int i7 = i & 136;
                int i8 = 170;
                int i9 = 85;
                if (i7 == 0) {
                    int i10 = i & 16;
                    int i11 = i & 32;
                    int i12 = i & 2;
                    int i13 = i & 64;
                    int i14 = i & 4;
                    int i15 = 1 != (i & 1) ? 0 : 85;
                    int i16 = i10 != 0 ? 170 : 0;
                    int i17 = i12 != 0 ? 85 : 0;
                    int i18 = i11 != 0 ? 170 : 0;
                    if (i14 == 0) {
                        i9 = 0;
                    }
                    if (i13 == 0) {
                        i8 = 0;
                    }
                    iArr[i] = zzb(255, i15 + i16, i17 + i18, i9 + i8);
                } else if (i7 != 8) {
                    int i19 = 43;
                    if (i7 == 128) {
                        int i20 = i & 16;
                        int i21 = i & 32;
                        int i22 = i & 2;
                        int i23 = i & 64;
                        int i24 = i & 4;
                        int i25 = (1 != (i & 1) ? 0 : 43) + WorkQueueKt.MASK;
                        int i26 = i20 != 0 ? 85 : 0;
                        int i27 = (i22 != 0 ? 43 : 0) + WorkQueueKt.MASK;
                        int i28 = i21 != 0 ? 85 : 0;
                        if (i24 == 0) {
                            i19 = 0;
                        }
                        int i29 = i19 + WorkQueueKt.MASK;
                        if (i23 == 0) {
                            i9 = 0;
                        }
                        iArr[i] = zzb(255, i25 + i26, i27 + i28, i29 + i9);
                    } else if (i7 == 136) {
                        int i30 = i & 16;
                        int i31 = i & 32;
                        int i32 = i & 2;
                        int i33 = i & 64;
                        int i34 = i & 4;
                        int i35 = 1 != (i & 1) ? 0 : 43;
                        int i36 = i30 != 0 ? 85 : 0;
                        int i37 = i32 != 0 ? 43 : 0;
                        int i38 = i31 != 0 ? 85 : 0;
                        if (i34 == 0) {
                            i19 = 0;
                        }
                        if (i33 == 0) {
                            i9 = 0;
                        }
                        iArr[i] = zzb(255, i35 + i36, i37 + i38, i19 + i9);
                    }
                } else {
                    int i39 = i & 16;
                    int i40 = i & 32;
                    int i41 = i & 2;
                    int i42 = i & 64;
                    int i43 = i & 4;
                    int i44 = 1 != (i & 1) ? 0 : 85;
                    int i45 = i39 != 0 ? 170 : 0;
                    int i46 = i41 != 0 ? 85 : 0;
                    int i47 = i40 != 0 ? 170 : 0;
                    if (i43 == 0) {
                        i9 = 0;
                    }
                    if (i42 == 0) {
                        i8 = 0;
                    }
                    iArr[i] = zzb(WorkQueueKt.MASK, i44 + i45, i46 + i47, i9 + i8);
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final void zza(byte[] bArr, int i, int i2, zzaks zzaksVar, zzdn zzdnVar) {
        boolean z;
        zzakl zzaklVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i3;
        zzale zzaleVar;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        zzalc zzalcVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzem zzemVar = new zzem(bArr, i + i2);
        zzemVar.zzl(i);
        while (true) {
            z = true;
            if (zzemVar.zza() >= 48 && zzemVar.zzd(8) == 15) {
                zzale zzaleVar2 = this.zzi;
                int zzd = zzemVar.zzd(8);
                int zzd2 = zzemVar.zzd(16);
                int zzd3 = zzemVar.zzd(16);
                int zzb2 = zzemVar.zzb() + zzd3;
                if (zzd3 * 8 > zzemVar.zza()) {
                    zzea.zzf("DvbParser", "Data field length exceeds limit");
                    zzemVar.zzn(zzemVar.zza());
                } else {
                    switch (zzd) {
                        case 16:
                            if (zzd2 == zzaleVar2.zza) {
                                zzala zzalaVar = zzaleVar2.zzi;
                                int zzd4 = zzemVar.zzd(8);
                                int zzd5 = zzemVar.zzd(4);
                                int zzd6 = zzemVar.zzd(2);
                                zzemVar.zzn(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i13 = zzd3 - 2; i13 > 0; i13 -= 6) {
                                    int zzd7 = zzemVar.zzd(8);
                                    zzemVar.zzn(8);
                                    sparseArray.put(zzd7, new zzalb(zzemVar.zzd(16), zzemVar.zzd(16)));
                                }
                                zzala zzalaVar2 = new zzala(zzd4, zzd5, zzd6, sparseArray);
                                if (zzalaVar2.zzb != 0) {
                                    zzaleVar2.zzi = zzalaVar2;
                                    zzaleVar2.zzc.clear();
                                    zzaleVar2.zzd.clear();
                                    zzaleVar2.zze.clear();
                                    break;
                                } else if (zzalaVar != null) {
                                    if (zzalaVar.zza != zzalaVar2.zza) {
                                        zzaleVar2.zzi = zzalaVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzala zzalaVar3 = zzaleVar2.zzi;
                            if (zzd2 == zzaleVar2.zza && zzalaVar3 != null) {
                                int zzd8 = zzemVar.zzd(8);
                                zzemVar.zzn(4);
                                boolean zzp = zzemVar.zzp();
                                zzemVar.zzn(3);
                                int zzd9 = zzemVar.zzd(16);
                                int zzd10 = zzemVar.zzd(16);
                                int zzd11 = zzemVar.zzd(3);
                                int zzd12 = zzemVar.zzd(3);
                                zzemVar.zzn(2);
                                int zzd13 = zzemVar.zzd(8);
                                int zzd14 = zzemVar.zzd(8);
                                int zzd15 = zzemVar.zzd(4);
                                int zzd16 = zzemVar.zzd(2);
                                zzemVar.zzn(2);
                                int i14 = zzd3 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i14 > 0) {
                                    int zzd17 = zzemVar.zzd(16);
                                    int zzd18 = zzemVar.zzd(2);
                                    int zzd19 = zzemVar.zzd(2);
                                    int zzd20 = zzemVar.zzd(12);
                                    zzemVar.zzn(4);
                                    int zzd21 = zzemVar.zzd(12);
                                    int i15 = i14 - 6;
                                    if (zzd18 != 1) {
                                        if (zzd18 == 2) {
                                            zzd18 = 2;
                                        } else {
                                            i14 = i15;
                                            i8 = 0;
                                            i7 = 0;
                                            sparseArray2.put(zzd17, new zzald(zzd18, zzd19, zzd20, zzd21, i8, i7));
                                        }
                                    }
                                    i14 -= 8;
                                    i8 = zzemVar.zzd(8);
                                    i7 = zzemVar.zzd(8);
                                    sparseArray2.put(zzd17, new zzald(zzd18, zzd19, zzd20, zzd21, i8, i7));
                                }
                                zzalc zzalcVar2 = new zzalc(zzd8, zzp, zzd9, zzd10, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, sparseArray2);
                                if (zzalaVar3.zzb == 0 && (zzalcVar = (zzalc) zzaleVar2.zzc.get(zzalcVar2.zza)) != null) {
                                    int i16 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzalcVar.zzj;
                                        if (i16 < sparseArray3.size()) {
                                            zzalcVar2.zzj.put(sparseArray3.keyAt(i16), (zzald) sparseArray3.valueAt(i16));
                                            i16++;
                                        }
                                    }
                                }
                                zzaleVar2.zzc.put(zzalcVar2.zza, zzalcVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (zzd2 == zzaleVar2.zza) {
                                zzakx zzc2 = zzc(zzemVar, zzd3);
                                zzaleVar2.zzd.put(zzc2.zza, zzc2);
                                break;
                            } else if (zzd2 == zzaleVar2.zzb) {
                                zzakx zzc3 = zzc(zzemVar, zzd3);
                                zzaleVar2.zzf.put(zzc3.zza, zzc3);
                                break;
                            }
                            break;
                        case 19:
                            if (zzd2 == zzaleVar2.zza) {
                                zzakz zzd22 = zzd(zzemVar);
                                zzaleVar2.zze.put(zzd22.zza, zzd22);
                                break;
                            } else if (zzd2 == zzaleVar2.zzb) {
                                zzakz zzd23 = zzd(zzemVar);
                                zzaleVar2.zzg.put(zzd23.zza, zzd23);
                                break;
                            }
                            break;
                        case 20:
                            if (zzd2 == zzaleVar2.zza) {
                                zzemVar.zzn(4);
                                boolean zzp2 = zzemVar.zzp();
                                zzemVar.zzn(3);
                                int zzd24 = zzemVar.zzd(16);
                                int zzd25 = zzemVar.zzd(16);
                                if (zzp2) {
                                    int zzd26 = zzemVar.zzd(16);
                                    i11 = zzemVar.zzd(16);
                                    i10 = zzemVar.zzd(16);
                                    i9 = zzemVar.zzd(16);
                                    i12 = zzd26;
                                } else {
                                    i11 = zzd24;
                                    i9 = zzd25;
                                    i12 = 0;
                                    i10 = 0;
                                }
                                zzaleVar2.zzh = new zzaky(zzd24, zzd25, i12, i11, i10, i9);
                                break;
                            }
                            break;
                    }
                    zzemVar.zzo(zzb2 - zzemVar.zzb());
                }
            }
        }
        zzale zzaleVar3 = this.zzi;
        zzala zzalaVar4 = zzaleVar3.zzi;
        if (zzalaVar4 == null) {
            zzaklVar = new zzakl(zzfyq.zzn(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzaky zzakyVar = zzaleVar3.zzh;
            if (zzakyVar == null) {
                zzakyVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakyVar.zza + 1 != bitmap.getWidth() || zzakyVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakyVar.zza + 1, zzakyVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzalaVar4.zzc;
            int i17 = 0;
            while (i17 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzalb zzalbVar = (zzalb) sparseArray4.valueAt(i17);
                zzalc zzalcVar3 = (zzalc) zzaleVar3.zzc.get(sparseArray4.keyAt(i17));
                int i18 = zzalbVar.zza + zzakyVar.zzc;
                int i19 = zzalbVar.zzb + zzakyVar.zze;
                int i20 = zzalcVar3.zzc;
                int i21 = i18 + i20;
                boolean z2 = z;
                int min = Math.min(i21, zzakyVar.zzd);
                int i22 = zzalcVar3.zzd;
                int i23 = i19 + i22;
                canvas3.clipRect(i18, i19, min, Math.min(i23, zzakyVar.zzf));
                int i24 = zzalcVar3.zzf;
                zzakx zzakxVar = (zzakx) zzaleVar3.zzd.get(i24);
                if (zzakxVar == null && (zzakxVar = (zzakx) zzaleVar3.zzf.get(i24)) == null) {
                    zzakxVar = this.zzh;
                }
                SparseArray sparseArray5 = zzalcVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i25 = i17;
                int i26 = 0;
                while (i26 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i26);
                    int i27 = i26;
                    zzald zzaldVar = (zzald) sparseArray5.valueAt(i26);
                    SparseArray sparseArray7 = sparseArray5;
                    zzakz zzakzVar = (zzakz) zzaleVar3.zze.get(keyAt);
                    if (zzakzVar == null) {
                        zzakzVar = (zzakz) zzaleVar3.zzg.get(keyAt);
                    }
                    if (zzakzVar != null) {
                        Paint paint = zzakzVar.zzb ? null : this.zzd;
                        i4 = i20;
                        int i28 = zzalcVar3.zze;
                        zzaleVar = zzaleVar3;
                        int i29 = zzaldVar.zza + i18;
                        int i30 = i19 + zzaldVar.zzb;
                        if (i28 == 3) {
                            iArr = zzakxVar.zzd;
                        } else if (i28 == 2) {
                            iArr = zzakxVar.zzc;
                        } else {
                            iArr = zzakxVar.zzb;
                        }
                        canvas2 = canvas3;
                        i6 = i18;
                        int[] iArr2 = iArr;
                        i5 = i21;
                        zze(zzakzVar.zzc, iArr2, i28, i29, i30, paint, canvas2);
                        zze(zzakzVar.zzd, iArr2, i28, i29, i30 + 1, paint, canvas2);
                    } else {
                        zzaleVar = zzaleVar3;
                        canvas2 = canvas3;
                        i6 = i18;
                        i4 = i20;
                        i5 = i21;
                    }
                    i18 = i6;
                    i21 = i5;
                    i26 = i27 + 1;
                    i20 = i4;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzaleVar3 = zzaleVar;
                }
                zzale zzaleVar4 = zzaleVar3;
                Canvas canvas4 = canvas3;
                int i31 = i18;
                int i32 = i20;
                int i33 = i21;
                float f = i19;
                float f2 = i31;
                if (zzalcVar3.zzb) {
                    int i34 = zzalcVar3.zze;
                    if (i34 == 3) {
                        i3 = zzakxVar.zzd[zzalcVar3.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        if (i34 == 2) {
                            i3 = zzakxVar.zzc[zzalcVar3.zzh];
                        } else {
                            i3 = zzakxVar.zzb[zzalcVar3.zzi];
                        }
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i33;
                    c = c3;
                    c2 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i23, paint2);
                } else {
                    canvas = canvas4;
                    c2 = 3;
                    c = 2;
                }
                zzcs zzcsVar = new zzcs();
                zzcsVar.zzc(Bitmap.createBitmap(this.zzj, i31, i19, i32, i22));
                float f4 = zzakyVar.zza;
                zzcsVar.zzh(f2 / f4);
                zzcsVar.zzi(0);
                float f5 = zzakyVar.zzb;
                zzcsVar.zze(f / f5, 0);
                zzcsVar.zzf(0);
                zzcsVar.zzk(i32 / f4);
                zzcsVar.zzd(i22 / f5);
                arrayList.add(zzcsVar.zzq());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i17 = i25 + 1;
                z = z2;
                zzaleVar3 = zzaleVar4;
                sparseArray4 = sparseArray6;
            }
            zzaklVar = new zzakl(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdnVar.zza(zzaklVar);
    }
}
