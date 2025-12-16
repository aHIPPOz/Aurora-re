package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzahw {
    public byte[] zzO;
    public zzafc zzU;
    public boolean zzV;
    public zzafb zzX;
    public int zzY;
    private int zzZ;
    public boolean zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzafa zzj;
    public byte[] zzk;
    public zzs zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzW = true;
    private String zzaa = "eng";

    private static Pair zzf(zzen zzenVar) throws zzaz {
        try {
            zzenVar.zzM(16);
            long zzs = zzenVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs != 826496599) {
                zzea.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzenVar.zzc() + 20;
            byte[] zzN = zzenVar.zzN();
            while (true) {
                int length = zzN.length;
                if (zzc < length - 4) {
                    int i = zzc + 1;
                    if (zzN[zzc] == 0 && zzN[i] == 0 && zzN[zzc + 2] == 1 && zzN[zzc + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzN, zzc, length)));
                    }
                    zzc = i;
                } else {
                    throw zzaz.zza("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzaz {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    int i5 = bArr[i4];
                    i4++;
                    i = i5 & 255;
                    if (i != 255) {
                        break;
                    }
                    i3 += 255;
                }
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    int i8 = bArr[i4];
                    i4++;
                    i2 = i8 & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                }
                int i9 = i7 + i2;
                if (bArr[i4] != 1) {
                    throw zzaz.zza("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i4, bArr2, 0, i6);
                int i10 = i4 + i6;
                if (bArr[i10] != 3) {
                    throw zzaz.zza("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] == 5) {
                    int length = bArr.length - i11;
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr, i11, bArr3, 0, length);
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(bArr2);
                    arrayList.add(bArr3);
                    return arrayList;
                }
                throw zzaz.zza("Error parsing vorbis codec private", null);
            }
            throw zzaz.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzen zzenVar) throws zzaz {
        UUID uuid;
        UUID uuid2;
        try {
            int zzk = zzenVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzenVar.zzL(24);
                long zzt = zzenVar.zzt();
                uuid = zzahy.zze;
                if (zzt == uuid.getMostSignificantBits()) {
                    long zzt2 = zzenVar.zzt();
                    uuid2 = zzahy.zze;
                    if (zzt2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaz.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzaz {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzaz.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzady zzadyVar, int i) throws zzaz {
        char c;
        String str;
        List list;
        int i2;
        int i3;
        Map map;
        int i4;
        zzk zzkVar;
        Map map2;
        Map map3;
        byte[] bArr;
        int i5;
        zzez zza;
        List zzo;
        String str2;
        int i6;
        List list2;
        byte[] bArr2;
        String str3 = this.zzc;
        int i7 = 4;
        int i8 = 0;
        int i9 = -1;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 738614379:
                if (str3.equals("S_TEXT/SSA")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str3.equals("S_TEXT/WEBVTT")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str4 = "audio/raw";
        switch (c) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 1:
                byte[] bArr3 = this.zzk;
                zzo = bArr3 == null ? null : zzfyq.zzo(bArr3);
                str4 = "video/x-vnd.on2.vp9";
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            case 2:
                byte[] bArr4 = this.zzk;
                zzo = bArr4 == null ? null : zzfyq.zzo(bArr4);
                str4 = "video/av01";
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            case 3:
                str4 = "video/mpeg2";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.zzk;
                zzo = bArr5 == null ? null : Collections.singletonList(bArr5);
                str4 = "video/mp4v-es";
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            case 7:
                zzacz zza2 = zzacz.zza(new zzen(zzi(this.zzc)));
                list = zza2.zza;
                this.zzY = zza2.zzb;
                str2 = zza2.zzl;
                str4 = "video/avc";
                str = str2;
                i2 = -1;
                i7 = -1;
                break;
            case '\b':
                zzaek zza3 = zzaek.zza(new zzen(zzi(this.zzc)));
                list = zza3.zza;
                this.zzY = zza3.zzb;
                str2 = zza3.zzn;
                str4 = "video/hevc";
                str = str2;
                i2 = -1;
                i7 = -1;
                break;
            case '\t':
                Pair zzf = zzf(new zzen(zzi(this.zzc)));
                str4 = (String) zzf.first;
                zzo = (List) zzf.second;
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            case '\n':
                str4 = "video/x-unknown";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 11:
                list2 = zzg(zzi(str3));
                i6 = 8192;
                str4 = "audio/vorbis";
                list = list2;
                i7 = -1;
                i2 = i6;
                str = null;
                break;
            case '\f':
                list2 = new ArrayList(3);
                list2.add(zzi(this.zzc));
                list2.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                list2.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzT).array());
                i6 = 5760;
                str4 = "audio/opus";
                list = list2;
                i7 = -1;
                i2 = i6;
                str = null;
                break;
            case '\r':
                List singletonList = Collections.singletonList(zzi(str3));
                zzacp zza4 = zzacr.zza(this.zzk);
                this.zzR = zza4.zza;
                this.zzP = zza4.zzb;
                str4 = "audio/mp4a-latm";
                str = zza4.zzc;
                i7 = -1;
                list = singletonList;
                i2 = -1;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                i7 = -1;
                i2 = 4096;
                list = null;
                str = null;
                break;
            case 15:
                str4 = "audio/mpeg";
                i7 = -1;
                i2 = 4096;
                list = null;
                str = null;
                break;
            case 16:
                str4 = "audio/ac3";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 17:
                str4 = "audio/eac3";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 18:
                this.zzU = new zzafc();
                str4 = "audio/true-hd";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 21:
                str4 = "audio/vnd.dts.hd";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case 22:
                zzo = Collections.singletonList(zzi(str3));
                str4 = "audio/flac";
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            case 23:
                if (zzh(new zzen(zzi(this.zzc)))) {
                    i7 = zzex.zzn(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (i7 == 0) {
                        zzea.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzQ + ". Setting mimeType to audio/x-unknown");
                    }
                    i2 = -1;
                    list = null;
                    str = null;
                    break;
                } else {
                    zzea.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                i2 = -1;
                i7 = -1;
                str4 = "audio/x-unknown";
                list = null;
                str = null;
            case 24:
                i7 = zzex.zzn(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (i7 == 0) {
                    zzea.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzQ + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    i7 = -1;
                    str4 = "audio/x-unknown";
                    list = null;
                    str = null;
                    break;
                }
                i2 = -1;
                list = null;
                str = null;
            case 25:
                int i10 = this.zzQ;
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 24) {
                            if (i10 != 32) {
                                zzea.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i10 + ". Setting mimeType to audio/x-unknown");
                                i2 = -1;
                                i7 = -1;
                                str4 = "audio/x-unknown";
                                list = null;
                                str = null;
                                break;
                            } else {
                                i7 = 1610612736;
                            }
                        } else {
                            i7 = 1342177280;
                        }
                    } else {
                        i7 = 268435456;
                    }
                } else {
                    i7 = 3;
                }
                i2 = -1;
                list = null;
                str = null;
            case 26:
                int i11 = this.zzQ;
                if (i11 != 32) {
                    zzea.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i11 + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    i7 = -1;
                    str4 = "audio/x-unknown";
                    list = null;
                    str = null;
                    break;
                }
                i2 = -1;
                list = null;
                str = null;
            case 27:
                i2 = -1;
                i7 = -1;
                str4 = "application/x-subrip";
                list = null;
                str = null;
                break;
            case 28:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                bArr2 = zzahy.zzb;
                list = zzfyq.zzp(bArr2, zzi(this.zzc));
                i2 = -1;
                i7 = -1;
                str4 = "text/x-ssa";
                str = null;
                break;
            case 30:
                str4 = "text/vtt";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                zzo = zzfyq.zzo(zzi(str3));
                str4 = "application/vobsub";
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            case ' ':
                str4 = "application/pgs";
                i2 = -1;
                i7 = -1;
                list = null;
                str = null;
                break;
            case '!':
                byte[] bArr6 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr6, 0, 4);
                zzo = zzfyq.zzo(bArr6);
                str4 = "application/dvbsubs";
                list = zzo;
                i2 = -1;
                i7 = -1;
                str = null;
                break;
            default:
                throw zzaz.zza("Unrecognized codec identifier.", null);
        }
        if (this.zzO != null && (zza = zzez.zza(new zzen(this.zzO))) != null) {
            str = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        int i12 = (this.zzW ? 1 : 0) | (true != this.zzV ? 0 : 2);
        zzx zzxVar = new zzx();
        if (zzay.zzh(str5)) {
            zzxVar.zzD(this.zzP);
            zzxVar.zzai(this.zzR);
            zzxVar.zzab(i7);
            i3 = 1;
        } else if (zzay.zzj(str5)) {
            if (this.zzr == 0) {
                int i13 = this.zzp;
                if (i13 == -1) {
                    i13 = this.zzm;
                }
                this.zzp = i13;
                int i14 = this.zzq;
                if (i14 == -1) {
                    i14 = this.zzn;
                }
                this.zzq = i14;
            }
            float f = (this.zzp == -1 || (i5 = this.zzq) == -1) ? -1.0f : (this.zzn * i4) / (this.zzm * i5);
            if (this.zzy) {
                if (this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzM + 0.5f));
                    order.putShort((short) (this.zzN + 0.5f));
                    order.putShort((short) this.zzC);
                    order.putShort((short) this.zzD);
                }
                zzi zziVar = new zzi();
                zziVar.zzc(this.zzz);
                zziVar.zzb(this.zzB);
                zziVar.zzd(this.zzA);
                zziVar.zze(bArr);
                zziVar.zzf(this.zzo);
                zziVar.zza(this.zzo);
                zzkVar = zziVar.zzg();
            } else {
                zzkVar = null;
            }
            if (this.zzb != null) {
                map2 = zzahy.zzf;
                if (map2.containsKey(this.zzb)) {
                    map3 = zzahy.zzf;
                    i9 = ((Integer) map3.get(this.zzb)).intValue();
                }
            }
            if (this.zzs == 0 && Float.compare(this.zzt, 0.0f) == 0 && Float.compare(this.zzu, 0.0f) == 0) {
                if (Float.compare(this.zzv, 0.0f) != 0) {
                    if (Float.compare(this.zzv, 90.0f) == 0) {
                        i8 = 90;
                    } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                        i8 = 180;
                    } else if (Float.compare(this.zzv, -90.0f) == 0) {
                        i8 = 270;
                    }
                }
                zzxVar.zzam(this.zzm);
                zzxVar.zzQ(this.zzn);
                zzxVar.zzad(f);
                zzxVar.zzag(i8);
                zzxVar.zzae(this.zzw);
                zzxVar.zzak(this.zzx);
                zzxVar.zzF(zzkVar);
                i3 = 2;
            }
            i8 = i9;
            zzxVar.zzam(this.zzm);
            zzxVar.zzQ(this.zzn);
            zzxVar.zzad(f);
            zzxVar.zzag(i8);
            zzxVar.zzae(this.zzw);
            zzxVar.zzak(this.zzx);
            zzxVar.zzF(zzkVar);
            i3 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzaz.zza("Unexpected MIME type.", null);
        } else {
            i3 = 3;
        }
        if (this.zzb != null) {
            map = zzahy.zzf;
            if (!map.containsKey(this.zzb)) {
                zzxVar.zzU(this.zzb);
            }
        }
        zzxVar.zzR(i);
        zzxVar.zzG(true != this.zza ? "video/x-matroska" : "video/webm");
        zzxVar.zzah(str5);
        zzxVar.zzX(i2);
        zzxVar.zzW(this.zzaa);
        zzxVar.zzaj(i12);
        zzxVar.zzT(list);
        zzxVar.zzE(str);
        zzxVar.zzL(this.zzl);
        zzz zzan = zzxVar.zzan();
        zzafb zzw = zzadyVar.zzw(this.zzd, i3);
        this.zzX = zzw;
        zzw.zzm(zzan);
    }
}
