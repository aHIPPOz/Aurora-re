package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzahy implements zzadv {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzc = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zzd = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID zze = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map zzf;
    private long zzA;
    private boolean zzB;
    private zzahw zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzeb zzK;
    private zzeb zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzady zzaj;
    private final zzaht zzak;
    private final zzaia zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakr zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzex.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahy() {
        this(new zzaht(), 2, zzakr.zza);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzadw zzadwVar, zzahw zzahwVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahwVar.zzc)) {
            zzx(zzadwVar, zza, i);
            int i3 = this.zzab;
            zzw();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzahwVar.zzc) || "S_TEXT/SSA".equals(zzahwVar.zzc)) {
            zzx(zzadwVar, zzc, i);
            int i4 = this.zzab;
            zzw();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzahwVar.zzc)) {
            zzx(zzadwVar, zzd, i);
            int i5 = this.zzab;
            zzw();
            return i5;
        } else {
            zzafb zzafbVar = zzahwVar.zzX;
            boolean z2 = true;
            if (!this.zzad) {
                if (zzahwVar.zzh) {
                    this.zzW &= -1073741825;
                    int i6 = 128;
                    if (!this.zzae) {
                        zzen zzenVar = this.zzn;
                        zzadwVar.zzi(zzenVar.zzN(), 0, 1);
                        this.zzaa++;
                        if ((zzenVar.zzN()[0] & 128) == 128) {
                            throw zzaz.zza("Extension bit is set in signal byte", null);
                        }
                        this.zzah = zzenVar.zzN()[0];
                        this.zzae = true;
                    }
                    byte b = this.zzah;
                    if ((b & 1) == 1) {
                        int i7 = b & 2;
                        this.zzW |= 1073741824;
                        if (!this.zzai) {
                            zzen zzenVar2 = this.zzs;
                            zzadwVar.zzi(zzenVar2.zzN(), 0, 8);
                            this.zzaa += 8;
                            this.zzai = true;
                            zzen zzenVar3 = this.zzn;
                            if (i7 != 2) {
                                i6 = 0;
                            }
                            zzenVar3.zzN()[0] = (byte) (i6 | 8);
                            zzenVar3.zzL(0);
                            zzafbVar.zzs(zzenVar3, 1, 1);
                            this.zzab++;
                            zzenVar2.zzL(0);
                            zzafbVar.zzs(zzenVar2, 8, 1);
                            this.zzab += 8;
                        }
                        if (i7 == 2) {
                            if (!this.zzaf) {
                                zzen zzenVar4 = this.zzn;
                                zzadwVar.zzi(zzenVar4.zzN(), 0, 1);
                                this.zzaa++;
                                zzenVar4.zzL(0);
                                this.zzag = zzenVar4.zzm();
                                this.zzaf = true;
                            }
                            int i8 = this.zzag * 4;
                            zzen zzenVar5 = this.zzn;
                            zzenVar5.zzI(i8);
                            zzadwVar.zzi(zzenVar5.zzN(), 0, i8);
                            this.zzaa += i8;
                            int i9 = (this.zzag >> 1) + 1;
                            int i10 = (i9 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i10) {
                                this.zzv = ByteBuffer.allocate(i10);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i9);
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                i2 = this.zzag;
                                if (i11 >= i2) {
                                    break;
                                }
                                int zzp = zzenVar5.zzp();
                                int i13 = zzp - i12;
                                if (i11 % 2 == 0) {
                                    this.zzv.putShort((short) i13);
                                } else {
                                    this.zzv.putInt(i13);
                                }
                                i11++;
                                i12 = zzp;
                            }
                            int i14 = (i - this.zzaa) - i12;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i14);
                            } else {
                                this.zzv.putShort((short) i14);
                                this.zzv.putInt(0);
                            }
                            zzen zzenVar6 = this.zzt;
                            zzenVar6.zzJ(this.zzv.array(), i10);
                            zzafbVar.zzs(zzenVar6, i10, 1);
                            this.zzab += i10;
                        }
                    }
                } else {
                    byte[] bArr = zzahwVar.zzi;
                    if (bArr != null) {
                        this.zzq.zzJ(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzahwVar.zzc) ? zzahwVar.zzg > 0 : z) {
                    this.zzW |= 268435456;
                    this.zzu.zzI(0);
                    int zzd2 = (this.zzq.zzd() + i) - this.zzaa;
                    zzen zzenVar7 = this.zzn;
                    zzenVar7.zzI(4);
                    zzenVar7.zzN()[0] = (byte) ((zzd2 >> 24) & 255);
                    zzenVar7.zzN()[1] = (byte) ((zzd2 >> 16) & 255);
                    zzenVar7.zzN()[2] = (byte) ((zzd2 >> 8) & 255);
                    zzenVar7.zzN()[3] = (byte) (zzd2 & 255);
                    zzafbVar.zzs(zzenVar7, 4, 2);
                    this.zzab += 4;
                }
                this.zzad = true;
            }
            zzen zzenVar8 = this.zzq;
            int zzd3 = i + zzenVar8.zzd();
            if ("V_MPEG4/ISO/AVC".equals(zzahwVar.zzc) || "V_MPEGH/ISO/HEVC".equals(zzahwVar.zzc)) {
                zzen zzenVar9 = this.zzm;
                byte[] zzN = zzenVar9.zzN();
                zzN[0] = 0;
                zzN[1] = 0;
                zzN[2] = 0;
                int i15 = zzahwVar.zzY;
                int i16 = 4 - i15;
                while (this.zzaa < zzd3) {
                    int i17 = this.zzac;
                    if (i17 == 0) {
                        int min = Math.min(i15, zzenVar8.zza());
                        zzadwVar.zzi(zzN, i16 + min, i15 - min);
                        if (min > 0) {
                            zzenVar8.zzH(zzN, i16, min);
                        }
                        this.zzaa += i15;
                        zzenVar9.zzL(0);
                        this.zzac = zzenVar9.zzp();
                        zzen zzenVar10 = this.zzl;
                        zzenVar10.zzL(0);
                        zzafbVar.zzr(zzenVar10, 4);
                        this.zzab += 4;
                    } else {
                        int zzq = zzq(zzadwVar, zzafbVar, i17);
                        this.zzaa += zzq;
                        this.zzab += zzq;
                        this.zzac -= zzq;
                    }
                }
            } else {
                if (zzahwVar.zzU != null) {
                    if (zzenVar8.zzd() != 0) {
                        z2 = false;
                    }
                    zzdd.zzf(z2);
                    zzahwVar.zzU.zzd(zzadwVar);
                }
                while (true) {
                    int i18 = this.zzaa;
                    if (i18 >= zzd3) {
                        break;
                    }
                    int zzq2 = zzq(zzadwVar, zzafbVar, zzd3 - i18);
                    this.zzaa += zzq2;
                    this.zzab += zzq2;
                }
            }
            if ("A_VORBIS".equals(zzahwVar.zzc)) {
                zzen zzenVar11 = this.zzo;
                zzenVar11.zzL(0);
                zzafbVar.zzr(zzenVar11, 4);
                this.zzab += 4;
            }
            int i19 = this.zzab;
            zzw();
            return i19;
        }
    }

    private final int zzq(zzadw zzadwVar, zzafb zzafbVar, int i) throws IOException {
        zzen zzenVar = this.zzq;
        int zza2 = zzenVar.zza();
        if (zza2 > 0) {
            int min = Math.min(i, zza2);
            zzafbVar.zzr(zzenVar, min);
            return min;
        }
        return zzafbVar.zzf(zzadwVar, i, false);
    }

    private final long zzr(long j) throws zzaz {
        long j2 = this.zzy;
        if (j2 == -9223372036854775807L) {
            throw zzaz.zza("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return zzex.zzu(j, j2, 1000L, RoundingMode.DOWN);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws zzaz {
        if (this.zzK == null || this.zzL == null) {
            throw zzaz.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws zzaz {
        if (this.zzC != null) {
            return;
        }
        throw zzaz.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu(com.google.android.gms.internal.ads.zzahw r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzu(com.google.android.gms.internal.ads.zzahw, long, int, int, int):void");
    }

    private final void zzv(zzadw zzadwVar, int i) throws IOException {
        zzen zzenVar = this.zzn;
        if (zzenVar.zzd() >= i) {
            return;
        }
        if (zzenVar.zzb() < i) {
            int zzb2 = zzenVar.zzb();
            zzenVar.zzF(Math.max(zzb2 + zzb2, i));
        }
        zzadwVar.zzi(zzenVar.zzN(), zzenVar.zzd(), i - zzenVar.zzd());
        zzenVar.zzK(i);
    }

    private final void zzw() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzadw zzadwVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        zzen zzenVar = this.zzr;
        if (zzenVar.zzb() < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzenVar.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzenVar.zzN(), 0, length);
        }
        zzadwVar.zzi(zzenVar.zzN(), length, i);
        zzenVar.zzL(0);
        zzenVar.zzK(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzdd.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = zzex.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r7 = r6.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r0 >= r7.size()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        r7 = (com.google.android.gms.internal.ads.zzahw) r7.valueAt(r0);
        r7.zzX.getClass();
        r8 = r7.zzU;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r8 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r8.zza(r7.zzX, r7.zzj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r7, com.google.android.gms.internal.ads.zzaer r8) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r6.zzN = r0
        L3:
            boolean r1 = r6.zzN
            if (r1 != 0) goto L53
            com.google.android.gms.internal.ads.zzaht r1 = r6.zzak
            boolean r1 = r1.zzc(r7)
            if (r1 == 0) goto L32
            long r1 = r7.zzf()
            boolean r3 = r6.zzG
            if (r3 == 0) goto L20
            r6.zzI = r1
            long r1 = r6.zzH
            r8.zza = r1
            r6.zzG = r0
            goto L30
        L20:
            boolean r1 = r6.zzD
            if (r1 == 0) goto L3
            long r1 = r6.zzI
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3
            r8.zza = r1
            r6.zzI = r3
        L30:
            r7 = 1
            return r7
        L32:
            android.util.SparseArray r7 = r6.zzh
            int r8 = r7.size()
            if (r0 >= r8) goto L51
            java.lang.Object r7 = r7.valueAt(r0)
            com.google.android.gms.internal.ads.zzahw r7 = (com.google.android.gms.internal.ads.zzahw) r7
            com.google.android.gms.internal.ads.zzahw.zzd(r7)
            com.google.android.gms.internal.ads.zzafc r8 = r7.zzU
            if (r8 == 0) goto L4e
            com.google.android.gms.internal.ads.zzafb r1 = r7.zzX
            com.google.android.gms.internal.ads.zzafa r7 = r7.zzj
            r8.zza(r1, r7)
        L4e:
            int r0 = r0 + 1
            goto L32
        L51:
            r7 = -1
            return r7
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zze(zzady zzadyVar) {
        if (this.zzj) {
            zzadyVar = new zzaku(zzadyVar, this.zzk);
        }
        this.zzaj = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        this.zzJ = -9223372036854775807L;
        int i = 0;
        this.zzO = 0;
        this.zzak.zzb();
        this.zzg.zze();
        zzw();
        while (true) {
            SparseArray sparseArray = this.zzh;
            if (i < sparseArray.size()) {
                zzafc zzafcVar = ((zzahw) sparseArray.valueAt(i)).zzU;
                if (zzafcVar != null) {
                    zzafcVar.zzb();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        return new zzahz().zza(zzadwVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01de, code lost:
        if (r2.equals("V_MPEGH/ISO/HEVC") != false) goto L190;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(int r21) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zzj(int):void");
    }

    public final void zzm(int i, long j, long j2) throws zzaz {
        zzdd.zzb(this.zzaj);
        if (i == 160) {
            this.zzY = false;
            this.zzZ = 0L;
        } else if (i == 174) {
            zzahw zzahwVar = new zzahw();
            this.zzC = zzahwVar;
            zzahwVar.zza = this.zzB;
        } else if (i == 187) {
            this.zzM = false;
        } else if (i == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
        } else if (i == 20533) {
            zzt(i);
            this.zzC.zzh = true;
        } else if (i == 21968) {
            zzt(i);
            this.zzC.zzy = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzaz.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
        } else if (i != 475249515) {
            if (i != 524531317 || this.zzD) {
                return;
            }
            if (this.zzi && this.zzH != -1) {
                this.zzG = true;
                return;
            }
            this.zzaj.zzP(new zzaet(this.zzA, 0L));
            this.zzD = true;
        } else {
            this.zzK = new zzeb(32);
            this.zzL = new zzeb(32);
        }
    }

    zzahy(zzaht zzahtVar, int i, zzakr zzakrVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzak = zzahtVar;
        zzahtVar.zza(new zzahv(this, null));
        this.zzk = zzakrVar;
        boolean z = false;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0 ? true : z;
        this.zzg = new zzaia();
        this.zzh = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzfv.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzT = new int[1];
    }

    public final void zzn(int i, String str) throws zzaz {
        if (i == 134) {
            zzt(i);
            this.zzC.zzc = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzB = Objects.equals(str, "webm");
                return;
            }
            throw zzaz.zza("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            zzt(i);
            this.zzC.zzb = str;
        } else if (i != 2274716) {
        } else {
            zzt(i);
            this.zzC.zzaa = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(int i, int i2, zzadw zzadwVar) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i;
        int i15 = 1;
        int i16 = 0;
        if (i14 != 161 && i14 != 163) {
            if (i14 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzahw zzahwVar = (zzahw) this.zzh.get(this.zzU);
                if (this.zzX != 4 || !"V_VP9".equals(zzahwVar.zzc)) {
                    zzadwVar.zzk(i2);
                    return;
                }
                zzen zzenVar = this.zzu;
                zzenVar.zzI(i2);
                zzadwVar.zzi(zzenVar.zzN(), 0, i2);
                return;
            } else if (i14 == 16877) {
                zzt(i);
                zzahw zzahwVar2 = this.zzC;
                i12 = zzahwVar2.zzZ;
                if (i12 != 1685485123) {
                    i13 = zzahwVar2.zzZ;
                    if (i13 != 1685480259) {
                        zzadwVar.zzk(i2);
                        return;
                    }
                }
                zzahwVar2.zzO = new byte[i2];
                zzadwVar.zzi(zzahwVar2.zzO, 0, i2);
                return;
            } else if (i14 == 16981) {
                zzt(i);
                zzahw zzahwVar3 = this.zzC;
                zzahwVar3.zzi = new byte[i2];
                zzadwVar.zzi(zzahwVar3.zzi, 0, i2);
                return;
            } else if (i14 == 18402) {
                byte[] bArr = new byte[i2];
                zzadwVar.zzi(bArr, 0, i2);
                zzt(i);
                this.zzC.zzj = new zzafa(1, bArr, 0, 0);
                return;
            } else if (i14 == 21419) {
                zzen zzenVar2 = this.zzp;
                Arrays.fill(zzenVar2.zzN(), (byte) 0);
                zzadwVar.zzi(zzenVar2.zzN(), 4 - i2, i2);
                zzenVar2.zzL(0);
                this.zzE = (int) zzenVar2.zzu();
                return;
            } else if (i14 == 25506) {
                zzt(i);
                zzahw zzahwVar4 = this.zzC;
                zzahwVar4.zzk = new byte[i2];
                zzadwVar.zzi(zzahwVar4.zzk, 0, i2);
                return;
            } else if (i14 == 30322) {
                zzt(i);
                zzahw zzahwVar5 = this.zzC;
                zzahwVar5.zzw = new byte[i2];
                zzadwVar.zzi(zzahwVar5.zzw, 0, i2);
                return;
            } else {
                throw zzaz.zza("Unexpected id: " + i14, null);
            }
        }
        int i17 = 8;
        if (this.zzO == 0) {
            zzaia zzaiaVar = this.zzg;
            this.zzU = (int) zzaiaVar.zzd(zzadwVar, false, true, 8);
            this.zzV = zzaiaVar.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzn.zzI(0);
        }
        zzahw zzahwVar6 = (zzahw) this.zzh.get(this.zzU);
        if (zzahwVar6 != null) {
            zzahwVar6.zzX.getClass();
            if (this.zzO == 1) {
                zzv(zzadwVar, 3);
                zzen zzenVar3 = this.zzn;
                int i18 = (zzenVar3.zzN()[2] & 6) >> 1;
                if (i18 == 0) {
                    this.zzS = 1;
                    int[] zzz = zzz(this.zzT, 1);
                    this.zzT = zzz;
                    zzz[0] = (i2 - this.zzV) - 3;
                } else {
                    zzv(zzadwVar, 4);
                    int i19 = (zzenVar3.zzN()[3] & 255) + 1;
                    this.zzS = i19;
                    int[] zzz2 = zzz(this.zzT, i19);
                    this.zzT = zzz2;
                    if (i18 == 2) {
                        int i20 = this.zzS;
                        Arrays.fill(zzz2, 0, i20, ((i2 - this.zzV) - 4) / i20);
                    } else if (i18 != 1) {
                        if (i18 == 3) {
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 4;
                            while (true) {
                                int i24 = this.zzS - 1;
                                if (i21 < i24) {
                                    this.zzT[i21] = i16;
                                    int i25 = i23 + 1;
                                    zzv(zzadwVar, i25);
                                    if (zzenVar3.zzN()[i23] == 0) {
                                        throw zzaz.zza("No valid varint length mask found", null);
                                    }
                                    int i26 = i15;
                                    int i27 = i16;
                                    while (true) {
                                        if (i27 >= i17) {
                                            i7 = i16;
                                            i8 = i17;
                                            j = 0;
                                            break;
                                        }
                                        i8 = i17;
                                        int i28 = i26 << (7 - i27);
                                        if ((zzenVar3.zzN()[i23] & i28) != 0) {
                                            i25 += i27;
                                            zzv(zzadwVar, i25);
                                            i7 = i16;
                                            j = zzenVar3.zzN()[i23] & 255 & (~i28);
                                            int i29 = i23 + 1;
                                            while (i29 < i25) {
                                                j = (j << i8) | (zzenVar3.zzN()[i29] & 255);
                                                i29++;
                                                i27 = i27;
                                            }
                                            int i30 = i27;
                                            if (i21 > 0) {
                                                j -= (1 << ((i30 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i27++;
                                            i17 = i8;
                                        }
                                    }
                                    i23 = i25;
                                    if (j < -2147483648L || j > 2147483647L) {
                                        break;
                                    }
                                    int[] iArr = this.zzT;
                                    int i31 = (int) j;
                                    if (i21 != 0) {
                                        i31 += iArr[i21 - 1];
                                    }
                                    iArr[i21] = i31;
                                    i22 += i31;
                                    i21++;
                                    i15 = i26;
                                    i16 = i7;
                                    i17 = i8;
                                } else {
                                    i3 = i15;
                                    i5 = i16;
                                    this.zzT[i24] = ((i2 - this.zzV) - i23) - i22;
                                    break;
                                }
                            }
                            throw zzaz.zza("EBML lacing sample size out of range.", null);
                        }
                        throw zzaz.zza("Unexpected lacing value: 2", null);
                    } else {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            i9 = this.zzS - 1;
                            if (i32 >= i9) {
                                break;
                            }
                            this.zzT[i32] = 0;
                            while (true) {
                                i10 = i34 + 1;
                                zzv(zzadwVar, i10);
                                int i35 = zzenVar3.zzN()[i34] & 255;
                                int[] iArr2 = this.zzT;
                                i11 = iArr2[i32] + i35;
                                iArr2[i32] = i11;
                                if (i35 != 255) {
                                    break;
                                }
                                i34 = i10;
                            }
                            i33 += i11;
                            i32++;
                            i34 = i10;
                        }
                        this.zzT[i9] = ((i2 - this.zzV) - i34) - i33;
                    }
                }
                i3 = 1;
                i5 = 0;
                this.zzP = this.zzJ + zzr((zzenVar3.zzN()[i5] << 8) | (zzenVar3.zzN()[i3] & 255));
                if (zzahwVar6.zze == 2) {
                    i6 = i3;
                } else if (i14 == 163) {
                    i6 = (zzenVar3.zzN()[2] & 128) == 128 ? i3 : i5;
                    i14 = 163;
                } else {
                    i6 = i5;
                }
                this.zzW = i6;
                this.zzO = 2;
                this.zzR = i5;
                i4 = 163;
            } else {
                i3 = 1;
                i4 = 163;
            }
            if (i14 == i4) {
                while (true) {
                    int i36 = this.zzR;
                    if (i36 >= this.zzS) {
                        this.zzO = 0;
                        return;
                    }
                    int zzp = zzp(zzadwVar, zzahwVar6, this.zzT[i36], false);
                    zzahw zzahwVar7 = zzahwVar6;
                    zzu(zzahwVar7, this.zzP + ((this.zzR * zzahwVar6.zzf) / 1000), this.zzW, zzp, 0);
                    this.zzR++;
                    zzahwVar6 = zzahwVar7;
                }
            } else {
                while (true) {
                    int i37 = this.zzR;
                    if (i37 >= this.zzS) {
                        return;
                    }
                    int[] iArr3 = this.zzT;
                    boolean z = i3;
                    iArr3[i37] = zzp(zzadwVar, zzahwVar6, iArr3[i37], z);
                    this.zzR += z ? 1 : 0;
                }
            }
        } else {
            zzadwVar.zzk(i2 - this.zzV);
            this.zzO = 0;
        }
    }

    public zzahy(zzakr zzakrVar, int i) {
        this(new zzaht(), 0, zzakrVar);
    }

    public final void zzk(int i, double d) throws zzaz {
        if (i == 181) {
            zzt(i);
            this.zzC.zzR = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzt(i);
                    this.zzC.zzE = (float) d;
                    return;
                case 21970:
                    zzt(i);
                    this.zzC.zzF = (float) d;
                    return;
                case 21971:
                    zzt(i);
                    this.zzC.zzG = (float) d;
                    return;
                case 21972:
                    zzt(i);
                    this.zzC.zzH = (float) d;
                    return;
                case 21973:
                    zzt(i);
                    this.zzC.zzI = (float) d;
                    return;
                case 21974:
                    zzt(i);
                    this.zzC.zzJ = (float) d;
                    return;
                case 21975:
                    zzt(i);
                    this.zzC.zzK = (float) d;
                    return;
                case 21976:
                    zzt(i);
                    this.zzC.zzL = (float) d;
                    return;
                case 21977:
                    zzt(i);
                    this.zzC.zzM = (float) d;
                    return;
                case 21978:
                    zzt(i);
                    this.zzC.zzN = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzt(i);
                            this.zzC.zzt = (float) d;
                            return;
                        case 30324:
                            zzt(i);
                            this.zzC.zzu = (float) d;
                            return;
                        case 30325:
                            zzt(i);
                            this.zzC.zzv = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d;
        }
    }

    public final void zzl(int i, long j) throws zzaz {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzaz.zza("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzaz.zza("ContentEncodingScope " + j + " not supported", null);
        } else {
            boolean z = false;
            switch (i) {
                case 131:
                    zzt(i);
                    this.zzC.zze = (int) j;
                    return;
                case 136:
                    if (j == 1) {
                        z = true;
                    }
                    zzt(i);
                    this.zzC.zzW = z;
                    return;
                case 155:
                    this.zzQ = zzr(j);
                    return;
                case 159:
                    zzt(i);
                    this.zzC.zzP = (int) j;
                    return;
                case 176:
                    zzt(i);
                    this.zzC.zzm = (int) j;
                    return;
                case 179:
                    zzs(i);
                    this.zzK.zzc(zzr(j));
                    return;
                case 186:
                    zzt(i);
                    this.zzC.zzn = (int) j;
                    return;
                case 215:
                    zzt(i);
                    this.zzC.zzd = (int) j;
                    return;
                case 231:
                    this.zzJ = zzr(j);
                    return;
                case 238:
                    this.zzX = (int) j;
                    return;
                case 241:
                    if (this.zzM) {
                        return;
                    }
                    zzs(i);
                    this.zzL.zzc(j);
                    this.zzM = true;
                    return;
                case 251:
                    this.zzY = true;
                    return;
                case 16871:
                    zzt(i);
                    this.zzC.zzZ = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw zzaz.zza("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j >= 1 && j <= 2) {
                        return;
                    }
                    throw zzaz.zza("DocTypeReadVersion " + j + " not supported", null);
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw zzaz.zza("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw zzaz.zza("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw zzaz.zza("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.zzF = j + this.zzx;
                    return;
                case 21432:
                    int i2 = (int) j;
                    zzt(i);
                    if (i2 == 0) {
                        this.zzC.zzx = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzC.zzx = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzC.zzx = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzC.zzx = 3;
                        return;
                    }
                case 21680:
                    zzt(i);
                    this.zzC.zzp = (int) j;
                    return;
                case 21682:
                    zzt(i);
                    this.zzC.zzr = (int) j;
                    return;
                case 21690:
                    zzt(i);
                    this.zzC.zzq = (int) j;
                    return;
                case 21930:
                    if (j == 1) {
                        z = true;
                    }
                    zzt(i);
                    this.zzC.zzV = z;
                    return;
                case 21938:
                    zzt(i);
                    zzahw zzahwVar = this.zzC;
                    zzahwVar.zzy = true;
                    zzahwVar.zzo = (int) j;
                    return;
                case 21998:
                    zzt(i);
                    this.zzC.zzg = (int) j;
                    return;
                case 22186:
                    zzt(i);
                    this.zzC.zzS = j;
                    return;
                case 22203:
                    zzt(i);
                    this.zzC.zzT = j;
                    return;
                case 25188:
                    zzt(i);
                    this.zzC.zzQ = (int) j;
                    return;
                case 30114:
                    this.zzZ = j;
                    return;
                case 30321:
                    int i3 = (int) j;
                    zzt(i);
                    if (i3 == 0) {
                        this.zzC.zzs = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzC.zzs = 1;
                        return;
                    } else if (i3 == 2) {
                        this.zzC.zzs = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.zzC.zzs = 3;
                        return;
                    }
                case 2352003:
                    zzt(i);
                    this.zzC.zzf = (int) j;
                    return;
                case 2807729:
                    this.zzy = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i4 = (int) j;
                            zzt(i);
                            if (i4 == 1) {
                                this.zzC.zzB = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzC.zzB = 1;
                                return;
                            }
                        case 21946:
                            zzt(i);
                            int zzb2 = zzk.zzb((int) j);
                            if (zzb2 == -1) {
                                return;
                            }
                            this.zzC.zzA = zzb2;
                            return;
                        case 21947:
                            zzt(i);
                            this.zzC.zzy = true;
                            int zza2 = zzk.zza((int) j);
                            if (zza2 == -1) {
                                return;
                            }
                            this.zzC.zzz = zza2;
                            return;
                        case 21948:
                            zzt(i);
                            this.zzC.zzC = (int) j;
                            return;
                        case 21949:
                            zzt(i);
                            this.zzC.zzD = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }
}
