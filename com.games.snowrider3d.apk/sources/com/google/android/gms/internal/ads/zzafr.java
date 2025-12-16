package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzafr implements zzafj {
    public final zzfyq zza;
    private final int zzb;

    private zzafr(int i, zzfyq zzfyqVar) {
        this.zzb = i;
        this.zza = zzfyqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzafr zzc(int i, zzen zzenVar) {
        zzafj zzafjVar;
        String str;
        String str2;
        zzfyn zzfynVar = new zzfyn();
        int zzd = zzenVar.zzd();
        int i2 = -2;
        while (zzenVar.zza() > 8) {
            int zzi = zzenVar.zzi();
            int zzc = zzenVar.zzc() + zzenVar.zzi();
            zzenVar.zzK(zzc);
            if (zzi != 1414744396) {
                zzafs zzafsVar = null;
                switch (zzi) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzenVar.zzM(4);
                            int zzi2 = zzenVar.zzi();
                            int zzi3 = zzenVar.zzi();
                            zzenVar.zzM(4);
                            int zzi4 = zzenVar.zzi();
                            switch (zzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                zzea.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzi4);
                            } else {
                                zzx zzxVar = new zzx();
                                zzxVar.zzam(zzi2);
                                zzxVar.zzQ(zzi3);
                                zzxVar.zzah(str2);
                                zzafsVar = new zzafs(zzxVar.zzan());
                            }
                        } else if (i2 == 1) {
                            int zzk = zzenVar.zzk();
                            if (zzk == 1) {
                                str = "audio/raw";
                            } else if (zzk == 85) {
                                str = "audio/mpeg";
                            } else if (zzk == 255) {
                                str = "audio/mp4a-latm";
                            } else if (zzk != 8192) {
                                str = zzk != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str == null) {
                                zzea.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzk);
                            } else {
                                int zzk2 = zzenVar.zzk();
                                int zzi5 = zzenVar.zzi();
                                zzenVar.zzM(6);
                                int zzn = zzex.zzn(zzenVar.zzk(), ByteOrder.LITTLE_ENDIAN);
                                int zzk3 = zzenVar.zza() > 0 ? zzenVar.zzk() : 0;
                                zzx zzxVar2 = new zzx();
                                zzxVar2.zzah(str);
                                zzxVar2.zzD(zzk2);
                                zzxVar2.zzai(zzi5);
                                if (str.equals("audio/raw") && zzn != 0) {
                                    zzxVar2.zzab(zzn);
                                }
                                if (str.equals("audio/mp4a-latm") && zzk3 > 0) {
                                    byte[] bArr = new byte[zzk3];
                                    zzenVar.zzH(bArr, 0, zzk3);
                                    zzxVar2.zzT(zzfyq.zzo(bArr));
                                }
                                zzafjVar = new zzafs(zzxVar2.zzan());
                                break;
                            }
                        } else {
                            zzea.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzex.zzD(i2)));
                        }
                        zzafjVar = zzafsVar;
                        break;
                    case 1751742049:
                        zzafjVar = zzafo.zzb(zzenVar);
                        break;
                    case 1752331379:
                        zzafjVar = zzafp.zzd(zzenVar);
                        break;
                    case 1852994675:
                        zzafjVar = zzaft.zzb(zzenVar);
                        break;
                    default:
                        zzafjVar = zzafsVar;
                        break;
                }
            } else {
                zzafjVar = zzc(zzenVar.zzi(), zzenVar);
            }
            if (zzafjVar != null) {
                if (zzafjVar.zza() == 1752331379) {
                    i2 = ((zzafp) zzafjVar).zzb();
                }
                zzfynVar.zzf(zzafjVar);
            }
            zzenVar.zzL(zzc);
            zzenVar.zzK(zzd);
        }
        return new zzafr(i, zzfynVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final int zza() {
        return this.zzb;
    }

    public final zzafj zzb(Class cls) {
        zzfyq zzfyqVar = this.zza;
        int size = zzfyqVar.size();
        int i = 0;
        while (i < size) {
            zzafj zzafjVar = (zzafj) zzfyqVar.get(i);
            i++;
            if (zzafjVar.getClass() == cls) {
                return zzafjVar;
            }
        }
        return null;
    }
}
