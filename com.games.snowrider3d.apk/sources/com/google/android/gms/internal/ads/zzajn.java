package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzajn {
    private static final zzfwe zza = zzfwe.zzb(zzfva.zzc(':'));
    private static final zzfwe zzb = zzfwe.zzb(zzfva.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzadw zzadwVar, zzaer zzaerVar, List list) throws IOException {
        int i;
        boolean z;
        char c;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzd = zzadwVar.zzd();
            zzaerVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c2 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 == 2) {
                long zzd2 = zzadwVar.zzd();
                int i4 = this.zze - 20;
                zzen zzenVar = new zzen(i4);
                zzadwVar.zzi(zzenVar.zzN(), 0, i4);
                int i5 = 0;
                while (i5 < i4 / 12) {
                    zzenVar.zzM(i3);
                    short zzD = zzenVar.zzD();
                    if (zzD == s3 || zzD == s2 || zzD == s || zzD == 2819 || zzD == 2820) {
                        i = i4;
                        this.zzc.add(new zzajm(zzD, (zzd2 - this.zze) - zzenVar.zzi(), zzenVar.zzi()));
                    } else {
                        zzenVar.zzM(8);
                        i = i4;
                    }
                    i5++;
                    i4 = i;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                List list2 = this.zzc;
                if (list2.isEmpty()) {
                    zzaerVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzaerVar.zza = ((zzajm) list2.get(0)).zza;
                }
            } else {
                long zzf = zzadwVar.zzf();
                int zzd3 = (int) ((zzadwVar.zzd() - zzadwVar.zzf()) - this.zze);
                zzen zzenVar2 = new zzen(zzd3);
                zzadwVar.zzi(zzenVar2.zzN(), 0, zzd3);
                int i6 = 0;
                while (true) {
                    List list3 = this.zzc;
                    if (i6 >= list3.size()) {
                        zzaerVar.zza = 0L;
                        return 1;
                    }
                    zzajm zzajmVar = (zzajm) list3.get(i6);
                    zzenVar2.zzL((int) (zzajmVar.zza - zzf));
                    zzenVar2.zzM(4);
                    int zzi = zzenVar2.zzi();
                    String zzB = zzenVar2.zzB(zzi, StandardCharsets.UTF_8);
                    switch (zzB.hashCode()) {
                        case -1711564334:
                            if (zzB.equals("SlowMotion_Data")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case -1332107749:
                            if (zzB.equals("Super_SlowMotion_Edit_Data")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case -1251387154:
                            if (zzB.equals("Super_SlowMotion_Data")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case -830665521:
                            if (zzB.equals("Super_SlowMotion_Deflickering_On")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1760745220:
                            if (zzB.equals("Super_SlowMotion_BGM")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    if (!z) {
                        c = 2192;
                    } else if (z) {
                        c = 2816;
                    } else if (z) {
                        c = 2817;
                    } else if (z) {
                        c = c2;
                    } else if (!z) {
                        throw zzaz.zza("Invalid SEF name", null);
                    } else {
                        c = 2820;
                    }
                    int i7 = zzajmVar.zzb - (zzi + 8);
                    if (c == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzf2 = zzb.zzf(zzenVar2.zzB(i7, StandardCharsets.UTF_8));
                        for (int i8 = 0; i8 < zzf2.size(); i8++) {
                            List zzf3 = zza.zzf((CharSequence) zzf2.get(i8));
                            if (zzf3.size() == 3) {
                                try {
                                    arrayList.add(new zzahn(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                                } catch (NumberFormatException e) {
                                    throw zzaz.zza(null, e);
                                }
                            } else {
                                throw zzaz.zza(null, null);
                            }
                        }
                        list.add(new zzaho(arrayList));
                    } else if (c != 2816 && c != 2817 && c != c2 && c != 2820) {
                        throw new IllegalStateException();
                    }
                    i6++;
                    c2 = 2819;
                }
            }
        } else {
            zzen zzenVar3 = new zzen(8);
            zzadwVar.zzi(zzenVar3.zzN(), 0, 8);
            this.zze = zzenVar3.zzi() + 8;
            if (zzenVar3.zzg() != 1397048916) {
                zzaerVar.zza = 0L;
            } else {
                zzaerVar.zza = zzadwVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
