package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzajj implements zzadv, zzaeu {
    private long zzA;
    private int zzB;
    private zzahm zzC;
    private final zzakr zza;
    private final int zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final zzen zzf;
    private final ArrayDeque zzg;
    private final zzajn zzh;
    private final List zzi;
    private zzfyq zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzen zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private long zzv;
    private zzady zzw;
    private zzaji[] zzx;
    private long[][] zzy;
    private int zzz;

    @Deprecated
    public zzajj() {
        this(zzakr.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzajs zzajsVar, long j) {
        int zza = zzajsVar.zza(j);
        return zza == -1 ? zzajsVar.zzb(j) : zza;
    }

    private static long zzl(zzajs zzajsVar, long j, long j2) {
        int zzk = zzk(zzajsVar, j);
        return zzk == -1 ? j2 : Math.min(zzajsVar.zzc[zzk], j2);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j) throws zzaz {
        zzav zzavVar;
        long j2;
        boolean z;
        zzaej zzaejVar;
        List list;
        ArrayDeque arrayDeque;
        int i;
        String str;
        ArrayList arrayList;
        int i2;
        zzav[] zzavVarArr;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzg;
            if (arrayDeque2.isEmpty() || ((zzfc) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzfc zzfcVar = (zzfc) arrayDeque2.pop();
            if (zzfcVar.zzd == 1836019574) {
                zzfc zza = zzfcVar.zza(1835365473);
                new ArrayList();
                zzav zzb = zza != null ? zzaix.zzb(zza) : null;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                boolean z2 = this.zzB == 1;
                zzaej zzaejVar2 = new zzaej();
                zzfd zzb2 = zzfcVar.zzb(1969517665);
                if (zzb2 != null) {
                    zzav zzc = zzaix.zzc(zzb2);
                    zzaejVar2.zzb(zzc);
                    zzavVar = zzc;
                } else {
                    zzavVar = null;
                }
                zzfd zzb3 = zzfcVar.zzb(1836476516);
                zzb3.getClass();
                zzav zzavVar2 = new zzav(-9223372036854775807L, zzaix.zzd(zzb3.zza));
                int i4 = this.zzb;
                if (1 != (i4 & 1)) {
                    j2 = -9223372036854775807L;
                    z = false;
                } else {
                    j2 = -9223372036854775807L;
                    z = true;
                }
                ArrayList arrayList3 = arrayList2;
                List zzf = zzaix.zzf(zzfcVar, zzaejVar2, -9223372036854775807L, null, z, z2, new zzfve() { // from class: com.google.android.gms.internal.ads.zzajh
                    @Override // com.google.android.gms.internal.ads.zzfve
                    public final Object apply(Object obj) {
                        return (zzajp) obj;
                    }
                });
                String zza2 = zzajg.zza(zzf);
                long j3 = j2;
                long j4 = j3;
                int i5 = 0;
                int i6 = 0;
                int i7 = -1;
                while (i5 < zzf.size()) {
                    zzajs zzajsVar = (zzajs) zzf.get(i5);
                    int i8 = i3;
                    if (zzajsVar.zzb == 0) {
                        arrayDeque = arrayDeque2;
                        list = zzf;
                        zzaejVar = zzaejVar2;
                        i = i6;
                        arrayList = arrayList3;
                        str = zza2;
                    } else {
                        zzajp zzajpVar = zzajsVar.zza;
                        zzady zzadyVar = this.zzw;
                        i = i6 + 1;
                        int i9 = zzajpVar.zzb;
                        zzaji zzajiVar = new zzaji(zzajpVar, zzajsVar, zzadyVar.zzw(i6, i9));
                        str = zza2;
                        long j5 = zzajpVar.zze;
                        if (j5 == j4) {
                            j5 = zzajsVar.zzh;
                        }
                        arrayDeque = arrayDeque2;
                        zzafb zzafbVar = zzajiVar.zzc;
                        zzafbVar.zzl(j5);
                        long max = Math.max(j3, j5);
                        zzz zzzVar = zzajpVar.zzg;
                        if ("audio/true-hd".equals(zzzVar.zzo)) {
                            i2 = zzajsVar.zze * 16;
                        } else {
                            i2 = zzajsVar.zze + 30;
                        }
                        zzx zzb4 = zzzVar.zzb();
                        zzb4.zzX(i2);
                        if (i9 == 2) {
                            int i10 = zzzVar.zzf;
                            if ((i4 & 8) != 0) {
                                i10 |= i7 == -1 ? 1 : 2;
                            }
                            zzb4.zzaf(i10);
                            i9 = 2;
                        }
                        if (i9 == 1 && zzaejVar2.zza()) {
                            zzb4.zzM(zzaejVar2.zza);
                            zzb4.zzN(zzaejVar2.zzb);
                        }
                        zzav zzavVar3 = zzzVar.zzl;
                        List list2 = this.zzi;
                        list = zzf;
                        zzav[] zzavVarArr2 = new zzav[3];
                        zzavVarArr2[i8] = list2.isEmpty() ? null : new zzav(list2);
                        zzavVarArr2[1] = zzavVar;
                        zzavVarArr2[2] = zzavVar2;
                        if (zzavVar3 != null) {
                            zzavVarArr = zzavVarArr2;
                            zzaejVar = zzaejVar2;
                        } else {
                            zzavVarArr = zzavVarArr2;
                            zzaejVar = zzaejVar2;
                            zzavVar3 = new zzav(j4, new zzau[i8]);
                        }
                        if (zzb != null) {
                            for (int i11 = 0; i11 < zzb.zza(); i11++) {
                                zzau zzb5 = zzb.zzb(i11);
                                if (zzb5 instanceof zzfa) {
                                    zzfa zzfaVar = (zzfa) zzb5;
                                    if (!zzfaVar.zza.equals("com.android.capture.fps")) {
                                        zzavVar3 = zzavVar3.zzc(zzfaVar);
                                    } else if (i9 == 2) {
                                        zzavVar3 = zzavVar3.zzc(zzfaVar);
                                    }
                                }
                            }
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            zzavVar3 = zzavVar3.zzd(zzavVarArr[i12]);
                        }
                        if (zzavVar3.zza() > 0) {
                            zzb4.zzaa(zzavVar3);
                        }
                        zzb4.zzG(str);
                        zzafbVar.zzm(zzb4.zzan());
                        if (i9 == 2 && i7 == -1) {
                            i7 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzajiVar);
                        j3 = max;
                    }
                    i5++;
                    arrayList3 = arrayList;
                    zza2 = str;
                    i6 = i;
                    arrayDeque2 = arrayDeque;
                    zzf = list;
                    zzaejVar2 = zzaejVar;
                    i3 = 0;
                    j4 = -9223372036854775807L;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.zzz = i7;
                this.zzA = j3;
                zzaji[] zzajiVarArr = (zzaji[]) arrayList3.toArray(new zzaji[0]);
                this.zzx = zzajiVarArr;
                int length = zzajiVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i13 = 0; i13 < zzajiVarArr.length; i13++) {
                    jArr[i13] = new long[zzajiVarArr[i13].zzb.zzb];
                    jArr2[i13] = zzajiVarArr[i13].zzb.zzf[0];
                }
                long j6 = 0;
                int i14 = 0;
                while (i14 < zzajiVarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i15 = -1;
                    for (int i16 = 0; i16 < zzajiVarArr.length; i16++) {
                        if (!zArr[i16]) {
                            long j8 = jArr2[i16];
                            if (j8 <= j7) {
                                i15 = i16;
                                j7 = j8;
                            }
                        }
                    }
                    int i17 = iArr[i15];
                    long[] jArr3 = jArr[i15];
                    jArr3[i17] = j6;
                    zzajs zzajsVar2 = zzajiVarArr[i15].zzb;
                    j6 += zzajsVar2.zzd[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = zzajsVar2.zzf[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.zzy = jArr;
                this.zzw.zzG();
                this.zzw.zzP(this);
                arrayDeque3.clear();
                this.zzk = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfc) arrayDeque2.peek()).zzc(zzfcVar);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final long zza() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zze(zzady zzadyVar) {
        if ((this.zzb & 16) == 0) {
            zzadyVar = new zzaku(zzadyVar, this.zza);
        }
        this.zzw = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        zzaji[] zzajiVarArr;
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = false;
        if (j == 0) {
            if (this.zzk != 3) {
                zzm();
                return;
            }
            this.zzh.zzb();
            this.zzi.clear();
            return;
        }
        for (zzaji zzajiVar : this.zzx) {
            zzajs zzajsVar = zzajiVar.zzb;
            int zza = zzajsVar.zza(j2);
            if (zza == -1) {
                zza = zzajsVar.zzb(j2);
            }
            zzajiVar.zze = zza;
            zzafc zzafcVar = zzajiVar.zzd;
            if (zzafcVar != null) {
                zzafcVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final zzaes zzg(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int zzb;
        long j6 = j;
        zzaji[] zzajiVarArr = this.zzx;
        if (zzajiVarArr.length == 0) {
            zzaev zzaevVar = zzaev.zza;
            return new zzaes(zzaevVar, zzaevVar);
        }
        int i = this.zzz;
        if (i != -1) {
            zzajs zzajsVar = zzajiVarArr[i].zzb;
            int zzk = zzk(zzajsVar, j6);
            if (zzk == -1) {
                zzaev zzaevVar2 = zzaev.zza;
                return new zzaes(zzaevVar2, zzaevVar2);
            }
            long[] jArr = zzajsVar.zzf;
            long j7 = jArr[zzk];
            long[] jArr2 = zzajsVar.zzc;
            j2 = jArr2[zzk];
            if (j7 >= j6 || zzk >= zzajsVar.zzb - 1 || (zzb = zzajsVar.zzb(j6)) == -1 || zzb == zzk) {
                j5 = -9223372036854775807L;
                j3 = -1;
            } else {
                j5 = jArr[zzb];
                j3 = jArr2[zzb];
            }
            j4 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j4 = -9223372036854775807L;
            j3 = -1;
        }
        int i2 = 0;
        while (true) {
            zzaji[] zzajiVarArr2 = this.zzx;
            if (i2 >= zzajiVarArr2.length) {
                break;
            }
            if (i2 != this.zzz) {
                zzajs zzajsVar2 = zzajiVarArr2[i2].zzb;
                long zzl = zzl(zzajsVar2, j6, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = zzl(zzajsVar2, j4, j3);
                }
                j2 = zzl;
            }
            i2++;
        }
        zzaev zzaevVar3 = new zzaev(j6, j2);
        if (j4 == -9223372036854775807L) {
            return new zzaes(zzaevVar3, zzaevVar3);
        }
        return new zzaes(zzaevVar3, new zzaev(j4, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        zzaey zzb = zzajo.zzb(zzadwVar, (this.zzb & 2) != 0);
        this.zzj = zzb != null ? zzfyq.zzo(zzb) : zzfyq.zzn();
        return zzb == null;
    }

    public zzajj(zzakr zzakrVar, int i) {
        this.zza = zzakrVar;
        this.zzb = i;
        this.zzj = zzfyq.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzajn();
        this.zzi = new ArrayList();
        this.zzf = new zzen(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzen(zzfv.zza);
        this.zzd = new zzen(6);
        this.zze = new zzen();
        this.zzp = -1;
        this.zzw = zzady.zza;
        this.zzx = new zzaji[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x044e, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r35, com.google.android.gms.internal.ads.zzaer r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajj.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }
}
