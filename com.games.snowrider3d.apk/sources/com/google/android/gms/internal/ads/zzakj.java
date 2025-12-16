package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzakj extends zzakh {
    private zzaki zza;
    private int zzb;
    private boolean zzc;
    private zzafg zzd;
    private zzafe zze;

    @Override // com.google.android.gms.internal.ads.zzakh
    protected final long zza(zzen zzenVar) {
        int i = 0;
        if ((zzenVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzenVar.zzN()[0];
        zzaki zzakiVar = this.zza;
        zzdd.zzb(zzakiVar);
        int i2 = !zzakiVar.zzd[(b >> 1) & (255 >>> (8 - zzakiVar.zze))].zza ? zzakiVar.zza.zze : zzakiVar.zza.zzf;
        if (this.zzc) {
            i = (this.zzb + i2) / 4;
        }
        if (zzenVar.zzb() < zzenVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd() + 4);
            zzenVar.zzJ(copyOf, copyOf.length);
        } else {
            zzenVar.zzK(zzenVar.zzd() + 4);
        }
        long j = i;
        byte[] zzN = zzenVar.zzN();
        zzN[zzenVar.zzd() - 4] = (byte) (j & 255);
        zzN[zzenVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzN[zzenVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzN[zzenVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i2;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zzi(long j) {
        super.zzi(j);
        int i = 0;
        this.zzc = j != 0;
        zzafg zzafgVar = this.zzd;
        if (zzafgVar != null) {
            i = zzafgVar.zze;
        }
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzen zzenVar, long j, zzake zzakeVar) throws IOException {
        zzaki zzakiVar;
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        long j2;
        if (this.zza == null) {
            zzafg zzafgVar = this.zzd;
            int i5 = 1;
            if (zzafgVar == null) {
                zzafh.zzd(1, zzenVar, false);
                int zzj = zzenVar.zzj();
                int zzm = zzenVar.zzm();
                int zzj2 = zzenVar.zzj();
                int zzi = zzenVar.zzi();
                int i6 = zzi <= 0 ? -1 : zzi;
                int zzi2 = zzenVar.zzi();
                int i7 = zzi2 <= 0 ? -1 : zzi2;
                int zzi3 = zzenVar.zzi();
                int i8 = zzi3 <= 0 ? -1 : zzi3;
                int zzm2 = zzenVar.zzm();
                this.zzd = new zzafg(zzj, zzm, zzj2, i6, i7, i8, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzenVar.zzm() & 1), Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd()));
            } else {
                int i9 = 4;
                zzafe zzafeVar = this.zze;
                if (zzafeVar == null) {
                    this.zze = zzafh.zzc(zzenVar, true, true);
                } else {
                    byte[] bArr = new byte[zzenVar.zzd()];
                    System.arraycopy(zzenVar.zzN(), 0, bArr, 0, zzenVar.zzd());
                    int i10 = zzafgVar.zza;
                    int i11 = 5;
                    zzafh.zzd(5, zzenVar, false);
                    int zzm3 = zzenVar.zzm() + 1;
                    zzafd zzafdVar = new zzafd(zzenVar.zzN());
                    zzafdVar.zzc(zzenVar.zzc() * 8);
                    int i12 = 0;
                    while (true) {
                        int i13 = 2;
                        int i14 = 16;
                        if (i12 < zzm3) {
                            if (zzafdVar.zzb(24) != 5653314) {
                                throw zzaz.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzafdVar.zza(), null);
                            }
                            int zzb = zzafdVar.zzb(16);
                            int zzb2 = zzafdVar.zzb(24);
                            if (!zzafdVar.zzd()) {
                                boolean zzd = zzafdVar.zzd();
                                for (int i15 = 0; i15 < zzb2; i15++) {
                                    if (zzd) {
                                        if (zzafdVar.zzd()) {
                                            zzafdVar.zzc(i11);
                                        }
                                    } else {
                                        zzafdVar.zzc(i11);
                                    }
                                }
                            } else {
                                zzafdVar.zzc(i11);
                                for (int i16 = 0; i16 < zzb2; i16 += zzafdVar.zzb(zzafh.zza(zzb2 - i16))) {
                                }
                            }
                            int i17 = i9;
                            int zzb3 = zzafdVar.zzb(i17);
                            if (zzb3 > 2) {
                                throw zzaz.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                            if (zzb3 == i5) {
                                i13 = zzb3;
                            } else if (zzb3 != 2) {
                                i4 = i5;
                                i12++;
                                i5 = i4;
                                i9 = 4;
                                i11 = 5;
                            }
                            zzafdVar.zzc(32);
                            zzafdVar.zzc(32);
                            int zzb4 = zzafdVar.zzb(i17) + i5;
                            zzafdVar.zzc(i5);
                            if (i13 != i5) {
                                i4 = i5;
                                j2 = zzb * zzb2;
                            } else if (zzb != 0) {
                                i4 = i5;
                                j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                            } else {
                                i4 = i5;
                                j2 = 0;
                            }
                            zzafdVar.zzc((int) (j2 * zzb4));
                            i12++;
                            i5 = i4;
                            i9 = 4;
                            i11 = 5;
                        } else {
                            int i18 = i5;
                            int i19 = 6;
                            int zzb5 = zzafdVar.zzb(6) + i18;
                            for (int i20 = 0; i20 < zzb5; i20++) {
                                if (zzafdVar.zzb(16) != 0) {
                                    throw zzaz.zza("placeholder of time domain transforms not zeroed out", null);
                                }
                            }
                            int zzb6 = zzafdVar.zzb(6) + i18;
                            int i21 = 0;
                            while (true) {
                                int i22 = 3;
                                if (i21 < zzb6) {
                                    int zzb7 = zzafdVar.zzb(i14);
                                    if (zzb7 == 0) {
                                        int i23 = 8;
                                        zzafdVar.zzc(8);
                                        zzafdVar.zzc(16);
                                        zzafdVar.zzc(16);
                                        zzafdVar.zzc(6);
                                        zzafdVar.zzc(8);
                                        int zzb8 = zzafdVar.zzb(4) + 1;
                                        int i24 = 0;
                                        while (i24 < zzb8) {
                                            zzafdVar.zzc(i23);
                                            i24++;
                                            i23 = 8;
                                        }
                                    } else if (zzb7 != i18) {
                                        throw zzaz.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                    } else {
                                        int zzb9 = zzafdVar.zzb(5);
                                        int[] iArr2 = new int[zzb9];
                                        int i25 = -1;
                                        for (int i26 = 0; i26 < zzb9; i26++) {
                                            int zzb10 = zzafdVar.zzb(4);
                                            iArr2[i26] = zzb10;
                                            if (zzb10 > i25) {
                                                i25 = zzb10;
                                            }
                                        }
                                        int i27 = i25 + 1;
                                        int[] iArr3 = new int[i27];
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            int i29 = 1;
                                            iArr3[i28] = zzafdVar.zzb(i22) + 1;
                                            int zzb11 = zzafdVar.zzb(2);
                                            if (zzb11 > 0) {
                                                i3 = 8;
                                                zzafdVar.zzc(8);
                                            } else {
                                                i3 = 8;
                                            }
                                            int i30 = i27;
                                            int i31 = 0;
                                            while (true) {
                                                int i32 = i29 << zzb11;
                                                iArr = iArr2;
                                                if (i31 < i32) {
                                                    zzafdVar.zzc(i3);
                                                    i31++;
                                                    iArr2 = iArr;
                                                    i3 = 8;
                                                    i29 = 1;
                                                }
                                            }
                                            i28++;
                                            iArr2 = iArr;
                                            i27 = i30;
                                            i22 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        zzafdVar.zzc(2);
                                        int zzb12 = zzafdVar.zzb(4);
                                        int i33 = 0;
                                        int i34 = 0;
                                        for (int i35 = 0; i35 < zzb9; i35++) {
                                            i33 += iArr3[iArr4[i35]];
                                            while (i34 < i33) {
                                                zzafdVar.zzc(zzb12);
                                                i34++;
                                            }
                                        }
                                    }
                                    i21++;
                                    i19 = 6;
                                    i14 = 16;
                                    i18 = 1;
                                } else {
                                    int i36 = 1;
                                    int zzb13 = zzafdVar.zzb(i19) + 1;
                                    int i37 = 0;
                                    while (i37 < zzb13) {
                                        if (zzafdVar.zzb(16) <= 2) {
                                            zzafdVar.zzc(24);
                                            zzafdVar.zzc(24);
                                            zzafdVar.zzc(24);
                                            int zzb14 = zzafdVar.zzb(i19) + i36;
                                            int i38 = 8;
                                            zzafdVar.zzc(8);
                                            int[] iArr5 = new int[zzb14];
                                            for (int i39 = 0; i39 < zzb14; i39++) {
                                                iArr5[i39] = ((zzafdVar.zzd() ? zzafdVar.zzb(5) : 0) * 8) + zzafdVar.zzb(3);
                                            }
                                            int i40 = 0;
                                            while (i40 < zzb14) {
                                                int i41 = 0;
                                                while (i41 < i38) {
                                                    if ((iArr5[i40] & (1 << i41)) != 0) {
                                                        zzafdVar.zzc(i38);
                                                    }
                                                    i41++;
                                                    i38 = 8;
                                                }
                                                i40++;
                                                i38 = 8;
                                            }
                                            i37++;
                                            i19 = 6;
                                            i36 = 1;
                                        } else {
                                            throw zzaz.zza("residueType greater than 2 is not decodable", null);
                                        }
                                    }
                                    int zzb15 = zzafdVar.zzb(i19) + 1;
                                    for (int i42 = 0; i42 < zzb15; i42++) {
                                        int zzb16 = zzafdVar.zzb(16);
                                        if (zzb16 != 0) {
                                            zzea.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb16);
                                        } else {
                                            if (zzafdVar.zzd()) {
                                                i = 1;
                                                i2 = zzafdVar.zzb(4) + 1;
                                            } else {
                                                i = 1;
                                                i2 = 1;
                                            }
                                            if (zzafdVar.zzd()) {
                                                int zzb17 = zzafdVar.zzb(8) + i;
                                                for (int i43 = 0; i43 < zzb17; i43++) {
                                                    int i44 = i10 - 1;
                                                    zzafdVar.zzc(zzafh.zza(i44));
                                                    zzafdVar.zzc(zzafh.zza(i44));
                                                }
                                            }
                                            if (zzafdVar.zzb(2) != 0) {
                                                throw zzaz.zza("to reserved bits must be zero after mapping coupling steps", null);
                                            }
                                            if (i2 > 1) {
                                                for (int i45 = 0; i45 < i10; i45++) {
                                                    zzafdVar.zzc(4);
                                                }
                                            }
                                            for (int i46 = 0; i46 < i2; i46++) {
                                                zzafdVar.zzc(8);
                                                zzafdVar.zzc(8);
                                                zzafdVar.zzc(8);
                                            }
                                        }
                                    }
                                    int zzb18 = zzafdVar.zzb(6);
                                    int i47 = zzb18 + 1;
                                    zzaff[] zzaffVarArr = new zzaff[i47];
                                    for (int i48 = 0; i48 < i47; i48++) {
                                        zzaffVarArr[i48] = new zzaff(zzafdVar.zzd(), zzafdVar.zzb(16), zzafdVar.zzb(16), zzafdVar.zzb(8));
                                    }
                                    if (!zzafdVar.zzd()) {
                                        throw zzaz.zza("framing bit after modes not set as expected", null);
                                    }
                                    zzakiVar = new zzaki(zzafgVar, zzafeVar, bArr, zzaffVarArr, zzafh.zza(zzb18));
                                }
                            }
                        }
                    }
                }
            }
            zzakiVar = null;
            this.zza = zzakiVar;
            if (zzakiVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzafg zzafgVar2 = zzakiVar.zza;
            arrayList.add(zzafgVar2.zzg);
            arrayList.add(zzakiVar.zzc);
            zzav zzb19 = zzafh.zzb(zzfyq.zzm(zzakiVar.zzb.zza));
            zzx zzxVar = new zzx();
            zzxVar.zzG("audio/ogg");
            zzxVar.zzah("audio/vorbis");
            zzxVar.zzC(zzafgVar2.zzd);
            zzxVar.zzac(zzafgVar2.zzc);
            zzxVar.zzD(zzafgVar2.zza);
            zzxVar.zzai(zzafgVar2.zzb);
            zzxVar.zzT(arrayList);
            zzxVar.zzaa(zzb19);
            zzakeVar.zza = zzxVar.zzan();
            return true;
        }
        zzakeVar.zza.getClass();
        return false;
    }
}
