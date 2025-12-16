package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzanq {
    public static zzano zza(zzem zzemVar) throws zzaz {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int i5;
        int zzd = zzemVar.zzd(8);
        int i6 = 5;
        int zzd2 = zzemVar.zzd(5);
        if (zzd2 != 31) {
            switch (zzd2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzaz.zzc("Unsupported sampling rate index " + zzd2);
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = 20000;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        } else {
            i = zzemVar.zzd(24);
        }
        int zzd3 = zzemVar.zzd(3);
        int i7 = 1;
        if (zzd3 == 0) {
            i2 = 768;
        } else if (zzd3 == 1) {
            i2 = 1024;
        } else if (zzd3 == 2 || zzd3 == 3) {
            i2 = 2048;
        } else if (zzd3 != 4) {
            throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
        } else {
            i2 = 4096;
        }
        if (zzd3 == 0 || zzd3 == 1) {
            c = 0;
        } else if (zzd3 == 2) {
            c = 2;
        } else if (zzd3 == 3) {
            c = 3;
        } else if (zzd3 != 4) {
            throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
        } else {
            c = 1;
        }
        zzemVar.zzn(2);
        zze(zzemVar);
        int zzd4 = zzemVar.zzd(5);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 16;
            if (i8 < zzd4 + 1) {
                int zzd5 = zzemVar.zzd(3);
                i9 += zzc(zzemVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzemVar.zzp()) {
                    zze(zzemVar);
                }
                i8++;
            } else {
                int zzc = zzc(zzemVar, 4, 8, 16) + 1;
                zzemVar.zzm();
                int i11 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i11 < zzc) {
                        int zzd6 = zzemVar.zzd(2);
                        if (zzd6 == 0) {
                            i4 = zzd;
                            i3 = i7;
                            zzf(zzemVar);
                            if (c > 0) {
                                zzd(zzemVar);
                            }
                        } else if (zzd6 == i7) {
                            i3 = i7;
                            if (zzf(zzemVar)) {
                                zzemVar.zzm();
                            }
                            if (c > 0) {
                                zzd(zzemVar);
                                i5 = zzemVar.zzd(2);
                                c2 = c;
                            } else {
                                i5 = 0;
                                c2 = 0;
                            }
                            if (i5 > 0) {
                                zzemVar.zzn(6);
                                int zzd7 = zzemVar.zzd(2);
                                zzemVar.zzn(4);
                                if (zzemVar.zzp()) {
                                    zzemVar.zzn(i6);
                                }
                                if (i5 == 2 || i5 == 3) {
                                    zzemVar.zzn(6);
                                }
                                if (zzd7 == 2) {
                                    zzemVar.zzm();
                                }
                            }
                            i4 = zzd;
                            int floor = ((int) Math.floor(Math.log(i9 - 1) / Math.log(2.0d))) + 1;
                            int zzd8 = zzemVar.zzd(2);
                            if (zzd8 > 0 && zzemVar.zzp()) {
                                zzemVar.zzn(floor);
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(floor);
                            }
                            if (c2 == 0 && zzd8 == 0) {
                                zzemVar.zzm();
                            }
                        } else if (zzd6 != 3) {
                            i4 = zzd;
                            i3 = i7;
                        } else {
                            zzc(zzemVar, 4, 8, i10);
                            int zzc2 = zzc(zzemVar, 4, 8, i10);
                            i3 = i7;
                            if (zzemVar.zzp()) {
                                zzc(zzemVar, 8, i10, 0);
                            }
                            zzemVar.zzm();
                            if (zzc2 > 0) {
                                zzemVar.zzn(zzc2 * 8);
                            }
                            i4 = zzd;
                        }
                        i11++;
                        zzd = i4;
                        i7 = i3;
                        i6 = 5;
                        i10 = 16;
                    } else {
                        int i12 = zzd;
                        byte[] bArr = null;
                        if (zzemVar.zzp()) {
                            int zzc3 = zzc(zzemVar, 2, 4, 8) + 1;
                            for (int i13 = 0; i13 < zzc3; i13++) {
                                int zzc4 = zzc(zzemVar, 4, 8, 16);
                                int zzc5 = zzc(zzemVar, 4, 8, 16);
                                if (zzc4 == 7) {
                                    int zzd9 = zzemVar.zzd(4) + 1;
                                    zzemVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd9];
                                    for (int i14 = 0; i14 < zzd9; i14++) {
                                        bArr2[i14] = (byte) zzemVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzemVar.zzn(zzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw zzaz.zzc("Unsupported sampling rate " + i);
                        }
                        return new zzano(i12, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzem r18, com.google.android.gms.internal.ads.zzann r19) throws com.google.android.gms.internal.ads.zzaz {
        /*
            r0 = r18
            r1 = r19
            r0.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc4
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzdd.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgbo.zza(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgbo.zza(r14, r10)
            int r6 = r0.zza()
            r10 = -1
            if (r6 >= r2) goto L46
        L44:
            r14 = r10
            goto L6f
        L46:
            long r14 = r0.zze(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6f
            int r6 = r0.zza()
            if (r6 >= r3) goto L55
            goto L44
        L55:
            long r14 = r0.zze(r3)
            long r16 = r14 + r16
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r0.zza()
            if (r3 >= r7) goto L66
            goto L44
        L66:
            long r6 = r0.zze(r7)
            long r14 = r16 + r6
            goto L6f
        L6d:
            r14 = r16
        L6f:
            r1.zzb = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L76
            return r4
        L76:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lb1
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La3
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L9c
            if (r3 == r2) goto L95
            r2 = 17
            if (r3 == r2) goto L8e
            goto La3
        L8e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r6)
            throw r0
        L95:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r6)
            throw r0
        L9c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zza(r0, r6)
            throw r0
        La3:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto Lb0
            return r9
        Lb0:
            return r4
        Lb1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzaz r0 = com.google.android.gms.internal.ads.zzaz.zzc(r0)
            throw r0
        Lc4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanq.zzb(com.google.android.gms.internal.ads.zzem, com.google.android.gms.internal.ads.zzann):boolean");
    }

    private static int zzc(zzem zzemVar, int i, int i2, int i3) {
        zzdd.zzd(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        zzgbm.zza(zzgbm.zza(i4, i5), 1 << i3);
        if (zzemVar.zza() < i) {
            return -1;
        }
        int zzd = zzemVar.zzd(i);
        if (zzd != i4) {
            return zzd;
        }
        if (zzemVar.zza() < i2) {
            return -1;
        }
        int zzd2 = zzemVar.zzd(i2);
        int i6 = zzd + zzd2;
        if (zzd2 != i5) {
            return i6;
        }
        if (zzemVar.zza() >= i3) {
            return i6 + zzemVar.zzd(i3);
        }
        return -1;
    }

    private static void zzd(zzem zzemVar) {
        zzemVar.zzn(3);
        zzemVar.zzn(8);
        boolean zzp = zzemVar.zzp();
        boolean zzp2 = zzemVar.zzp();
        if (zzp) {
            zzemVar.zzn(5);
        }
        if (zzp2) {
            zzemVar.zzn(6);
        }
    }

    private static void zze(zzem zzemVar) {
        int i;
        int zzd = zzemVar.zzd(2);
        int i2 = 6;
        if (zzd == 0) {
            zzemVar.zzn(6);
            return;
        }
        int i3 = 5;
        int zzc = zzc(zzemVar, 5, 8, 16) + 1;
        if (zzd == 1) {
            zzemVar.zzn(zzc * 7);
        } else if (zzd != 2) {
        } else {
            boolean zzp = zzemVar.zzp();
            int i4 = true != zzp ? 5 : 1;
            if (true == zzp) {
                i3 = 7;
            }
            if (true == zzp) {
                i2 = 8;
            }
            int i5 = 0;
            while (i5 < zzc) {
                if (zzemVar.zzp()) {
                    zzemVar.zzn(7);
                    i = 0;
                } else {
                    if (zzemVar.zzd(2) == 3 && zzemVar.zzd(i3) * i4 != 0) {
                        zzemVar.zzm();
                    }
                    i = zzemVar.zzd(i2) * i4;
                    if (i != 0 && i != 180) {
                        zzemVar.zzm();
                    }
                    zzemVar.zzm();
                }
                if (i != 0 && i != 180 && zzemVar.zzp()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    private static boolean zzf(zzem zzemVar) {
        zzemVar.zzn(3);
        boolean zzp = zzemVar.zzp();
        if (zzp) {
            zzemVar.zzn(13);
        }
        return zzp;
    }
}
