package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzkh extends zzg implements zziy {
    public static final /* synthetic */ int zzd = 0;
    private final zzdi zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzmh zzE;
    private zzmi zzF;
    private zzix zzG;
    private zzbd zzH;
    private zzat zzI;
    private Object zzJ;
    private Surface zzK;
    private int zzL;
    private zzeo zzM;
    private zze zzN;
    private float zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzat zzT;
    private zzls zzU;
    private int zzV;
    private long zzW;
    private final zzjj zzX;
    private zzxc zzY;
    final zzze zzb;
    final zzbd zzc;
    private final zzdm zze = new zzdm(zzdj.zza);
    private final Context zzf;
    private final zzbh zzg;
    private final zzma[] zzh;
    private final zzma[] zzi;
    private final zzzd zzj;
    private final zzdt zzk;
    private final zzkt zzl;
    private final zzdz zzm;
    private final CopyOnWriteArraySet zzn;
    private final zzbj zzo;
    private final List zzp;
    private final boolean zzq;
    private final zzmo zzr;
    private final Looper zzs;
    private final zzzl zzt;
    private final zzdj zzu;
    private final zzkd zzv;
    private final zzke zzw;
    private final zzmm zzx;
    private final zzmn zzy;
    private final long zzz;

    static {
        zzaq.zzb("media3.exoplayer");
    }

    public zzkh(zziw zziwVar, zzbh zzbhVar) {
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + zzex.zza + "]");
            this.zzf = zziwVar.zza.getApplicationContext();
            this.zzr = (zzmo) zziwVar.zzh.apply(zziwVar.zzb);
            this.zzS = zziwVar.zzj;
            this.zzN = zziwVar.zzk;
            this.zzL = zziwVar.zzl;
            this.zzP = false;
            this.zzz = zziwVar.zzq;
            zzkd zzkdVar = new zzkd(this, null);
            this.zzv = zzkdVar;
            this.zzw = new zzke(null);
            Handler handler = new Handler(zziwVar.zzi);
            zzcem zzcemVar = ((zzip) zziwVar.zzc).zza;
            zzcem zzcemVar2 = zzcemVar;
            zzma[] zzac = zzceo.zzac(zzcemVar.zza, handler, zzkdVar, zzkdVar, zzkdVar, zzkdVar);
            this.zzh = zzac;
            int length = zzac.length;
            this.zzi = new zzma[2];
            int i = 0;
            while (true) {
                zzma[] zzmaVarArr = this.zzi;
                int length2 = zzmaVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzma zzmaVar = this.zzh[i];
                zzmaVarArr[i] = null;
                i++;
            }
            zzzd zzzdVar = (zzzd) zziwVar.zze.zza();
            this.zzj = zzzdVar;
            zziw.zza(((zziq) zziwVar.zzd).zza);
            zzzp zzh = zzzp.zzh(((zzit) zziwVar.zzg).zza);
            this.zzt = zzh;
            this.zzq = zziwVar.zzm;
            this.zzF = zziwVar.zzn;
            this.zzE = zziwVar.zzo;
            Looper looper = zziwVar.zzi;
            this.zzs = looper;
            zzdj zzdjVar = zziwVar.zzb;
            this.zzu = zzdjVar;
            this.zzg = zzbhVar;
            zzdz zzdzVar = new zzdz(looper, zzdjVar, new zzdx(this) { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzdx
                public final void zza(Object obj, zzv zzvVar) {
                    zzbe zzbeVar = (zzbe) obj;
                }
            });
            this.zzm = zzdzVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzn = copyOnWriteArraySet;
            this.zzp = new ArrayList();
            this.zzY = new zzxc(0);
            this.zzG = zzix.zza;
            int length3 = this.zzh.length;
            zzze zzzeVar = new zzze(new zzme[2], new zzyw[2], zzbt.zza, null);
            this.zzb = zzzeVar;
            this.zzo = new zzbj();
            zzbc zzbcVar = new zzbc();
            zzbcVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzdVar.zzn();
            zzbcVar.zzd(29, true);
            zzbcVar.zzd(23, false);
            zzbcVar.zzd(25, false);
            zzbcVar.zzd(33, false);
            zzbcVar.zzd(26, false);
            zzbcVar.zzd(34, false);
            zzbd zze = zzbcVar.zze();
            this.zzc = zze;
            zzbc zzbcVar2 = new zzbc();
            zzbcVar2.zzb(zze);
            zzbcVar2.zza(4);
            zzbcVar2.zza(10);
            this.zzH = zzbcVar2.zze();
            this.zzk = zzdjVar.zzd(looper, null);
            zzjj zzjjVar = new zzjj(this);
            this.zzX = zzjjVar;
            this.zzU = zzls.zzh(zzzeVar);
            this.zzr.zzT(zzbhVar, looper);
            final zzph zzphVar = new zzph(zziwVar.zzt);
            zzkt zzktVar = new zzkt(this.zzf, this.zzh, this.zzi, zzzdVar, zzzeVar, (zzkx) zziwVar.zzf.zza(), zzh, 0, false, this.zzr, this.zzF, zziwVar.zzu, zziwVar.zzp, false, false, looper, zzdjVar, zzjjVar, zzphVar, null, this.zzG, this.zzw);
            this.zzl = zzktVar;
            Looper zze2 = zzktVar.zze();
            this.zzO = 1.0f;
            zzat zzatVar = zzat.zza;
            this.zzI = zzatVar;
            this.zzT = zzatVar;
            this.zzV = -1;
            int i2 = zzcw.zza;
            this.zzQ = true;
            zzmo zzmoVar = this.zzr;
            if (zzmoVar != null) {
                zzdzVar.zzb(zzmoVar);
                zzh.zzf(new Handler(looper), this.zzr);
                copyOnWriteArraySet.add(this.zzv);
                if (Build.VERSION.SDK_INT >= 31) {
                    final Context context = this.zzf;
                    final boolean z = zziwVar.zzr;
                    zzdjVar.zzd(zzktVar.zze(), null).zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzpd zzb = zzpd.zzb(context);
                            if (zzb == null) {
                                zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                this.zzz(zzb);
                            }
                            zzphVar.zzb(zzb.zza());
                        }
                    });
                }
                zzdi zzdiVar = new zzdi(0, zze2, looper, zzdjVar, new zzjk(this));
                this.zzA = zzdiVar;
                zzdiVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzkh.zzJ(zzkh.this);
                    }
                });
                new zzhx(zziwVar.zza, zze2, zziwVar.zzi, this.zzv, zzdjVar);
                this.zzx = new zzmm(zziwVar.zza, zze2, zzdjVar);
                this.zzy = new zzmn(zziwVar.zza, zze2, zzdjVar);
                int i3 = zzo.zza;
                zzcd zzcdVar = zzcd.zza;
                this.zzM = zzeo.zza;
                zzktVar.zzs(this.zzE);
                zzktVar.zzq(this.zzN, false);
                zzad(1, 3, this.zzN);
                zzad(2, 4, Integer.valueOf(this.zzL));
                zzad(2, 5, 0);
                zzad(1, 9, Boolean.valueOf(this.zzP));
                zzad(6, 8, this.zzw);
                zzad(-1, 16, Integer.valueOf(this.zzS));
                return;
            }
            throw null;
        } finally {
            this.zze.zzf();
        }
    }

    public static /* synthetic */ void zzJ(zzkh zzkhVar) {
        String str = zzex.zza;
        zzkhVar.zzA.zze(Integer.valueOf(zzcj.zzc(zzkhVar.zzf).generateAudioSessionId()));
    }

    public static /* synthetic */ void zzK(zzkh zzkhVar, zzkq zzkqVar) {
        boolean z;
        int i = zzkhVar.zzB - zzkqVar.zzb;
        zzkhVar.zzB = i;
        boolean z2 = true;
        if (zzkqVar.zzc) {
            zzkhVar.zzC = zzkqVar.zzd;
            zzkhVar.zzD = true;
        }
        if (i == 0) {
            zzbl zzblVar = zzkqVar.zza.zza;
            if (!zzkhVar.zzU.zza.zzo() && zzblVar.zzo()) {
                zzkhVar.zzV = -1;
                zzkhVar.zzW = 0L;
            }
            if (!zzblVar.zzo()) {
                List zzw = ((zzly) zzblVar).zzw();
                int size = zzw.size();
                List list = zzkhVar.zzp;
                zzdd.zzf(size == list.size());
                for (int i2 = 0; i2 < zzw.size(); i2++) {
                    ((zzkf) list.get(i2)).zzc((zzbl) zzw.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (zzkhVar.zzD) {
                if (zzkqVar.zza.zzb.equals(zzkhVar.zzU.zzb) && zzkqVar.zza.zzd == zzkhVar.zzU.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (zzblVar.zzo() || zzkqVar.zza.zzb.zzb()) {
                        j = zzkqVar.zza.zzd;
                    } else {
                        zzls zzlsVar = zzkqVar.zza;
                        zzvh zzvhVar = zzlsVar.zzb;
                        long j2 = zzlsVar.zzd;
                        zzkhVar.zzW(zzblVar, zzvhVar, j2);
                        j = j2;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            zzkhVar.zzD = false;
            zzkhVar.zzag(zzkqVar.zza, 1, z, zzkhVar.zzC, j, -1, false);
        }
    }

    public static /* synthetic */ void zzL(zzkh zzkhVar, int i, final int i2) {
        zzkhVar.zzai();
        Integer valueOf = Integer.valueOf(i2);
        zzkhVar.zzad(1, 10, valueOf);
        zzkhVar.zzad(2, 10, valueOf);
        zzdw zzdwVar = new zzdw() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i3 = zzkh.zzd;
                ((zzbe) obj).zza(i2);
            }
        };
        zzdz zzdzVar = zzkhVar.zzm;
        zzdzVar.zzd(21, zzdwVar);
        zzdzVar.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkh zzkhVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkhVar.zzae(surface);
        zzkhVar.zzK = surface;
    }

    private final int zzS(zzls zzlsVar) {
        zzbl zzblVar = zzlsVar.zza;
        return zzblVar.zzo() ? this.zzV : zzblVar.zzn(zzlsVar.zzb.zza, this.zzo).zzc;
    }

    private final long zzT(zzls zzlsVar) {
        zzvh zzvhVar = zzlsVar.zzb;
        if (zzvhVar.zzb()) {
            zzbl zzblVar = zzlsVar.zza;
            zzblVar.zzn(zzvhVar.zza, this.zzo);
            long j = zzlsVar.zzc;
            if (j != -9223372036854775807L) {
                return zzex.zzv(0L) + zzex.zzv(j);
            }
            long j2 = zzblVar.zze(zzS(zzlsVar), this.zza, 0L).zzl;
            return zzex.zzv(0L);
        }
        return zzex.zzv(zzU(zzlsVar));
    }

    private final long zzU(zzls zzlsVar) {
        zzbl zzblVar = zzlsVar.zza;
        if (zzblVar.zzo()) {
            return zzex.zzs(this.zzW);
        }
        boolean z = zzlsVar.zzp;
        long j = zzlsVar.zzs;
        zzvh zzvhVar = zzlsVar.zzb;
        if (zzvhVar.zzb()) {
            return j;
        }
        zzW(zzblVar, zzvhVar, j);
        return j;
    }

    private static long zzV(zzls zzlsVar) {
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        zzbl zzblVar = zzlsVar.zza;
        zzblVar.zzn(zzlsVar.zzb.zza, zzbjVar);
        long j = zzlsVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L).zzl;
            return 0L;
        }
        return j;
    }

    private final long zzW(zzbl zzblVar, zzvh zzvhVar, long j) {
        zzblVar.zzn(zzvhVar.zza, this.zzo);
        return j;
    }

    private final Pair zzX(zzbl zzblVar, int i, long j) {
        if (zzblVar.zzo()) {
            this.zzV = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzW = j;
            return null;
        }
        if (i == -1 || i >= zzblVar.zzc()) {
            i = zzblVar.zzg(false);
            long j2 = zzblVar.zze(i, this.zza, 0L).zzl;
            j = zzex.zzv(0L);
        }
        return zzblVar.zzl(this.zza, this.zzo, i, zzex.zzs(j));
    }

    private static zzls zzY(zzls zzlsVar, int i) {
        zzls zzf = zzlsVar.zzf(i);
        return (i == 1 || i == 4) ? zzf.zza(false) : zzf;
    }

    private final zzls zzZ(zzls zzlsVar, zzbl zzblVar, Pair pair) {
        int i;
        zzdd.zzd(zzblVar.zzo() || pair != null);
        zzbl zzblVar2 = zzlsVar.zza;
        long zzT = zzT(zzlsVar);
        zzls zzg = zzlsVar.zzg(zzblVar);
        if (zzblVar.zzo()) {
            zzvh zzi = zzls.zzi();
            long zzs = zzex.zzs(this.zzW);
            zzls zzb = zzg.zzc(zzi, zzs, zzs, zzs, 0L, zzxk.zza, this.zzb, zzfyq.zzn()).zzb(zzi);
            zzb.zzq = zzb.zzs;
            return zzb;
        }
        zzvh zzvhVar = zzg.zzb;
        Object obj = zzvhVar.zza;
        String str = zzex.zza;
        boolean equals = obj.equals(pair.first);
        zzvh zzvhVar2 = !equals ? new zzvh(pair.first, -1L) : zzvhVar;
        long longValue = ((Long) pair.second).longValue();
        long zzs2 = zzex.zzs(zzT);
        if (!zzblVar2.zzo()) {
            zzblVar2.zzn(obj, this.zzo);
        }
        if (!equals || longValue < zzs2) {
            zzvh zzvhVar3 = zzvhVar2;
            zzdd.zzf(!zzvhVar3.zzb());
            zzls zzb2 = zzg.zzc(zzvhVar3, longValue, longValue, longValue, 0L, !equals ? zzxk.zza : zzg.zzh, !equals ? this.zzb : zzg.zzi, !equals ? zzfyq.zzn() : zzg.zzj).zzb(zzvhVar3);
            zzb2.zzq = longValue;
            return zzb2;
        } else if (i != 0) {
            zzvh zzvhVar4 = zzvhVar2;
            zzdd.zzf(!zzvhVar4.zzb());
            long max = Math.max(0L, zzg.zzr - (longValue - zzs2));
            long j = zzg.zzq;
            if (zzg.zzk.equals(zzvhVar)) {
                j = longValue + max;
            }
            zzls zzc = zzg.zzc(zzvhVar4, longValue, longValue, longValue, max, zzg.zzh, zzg.zzi, zzg.zzj);
            zzc.zzq = j;
            return zzc;
        } else {
            int zza = zzblVar.zza(zzg.zzk.zza);
            if (zza != -1) {
                zzbj zzbjVar = this.zzo;
                if (zzblVar.zzd(zza, zzbjVar, false).zzc == zzblVar.zzn(zzvhVar2.zza, zzbjVar).zzc) {
                    return zzg;
                }
            }
            Object obj2 = zzvhVar2.zza;
            zzbj zzbjVar2 = this.zzo;
            zzblVar.zzn(obj2, zzbjVar2);
            long zzf = zzvhVar2.zzb() ? zzbjVar2.zzf(zzvhVar2.zzb, zzvhVar2.zzc) : zzbjVar2.zzd;
            zzvh zzvhVar5 = zzvhVar2;
            zzls zzb3 = zzg.zzc(zzvhVar5, zzg.zzs, zzg.zzs, zzg.zzd, zzf - zzg.zzs, zzg.zzh, zzg.zzi, zzg.zzj).zzb(zzvhVar5);
            zzb3.zzq = zzf;
            return zzb3;
        }
    }

    private final zzlw zzaa(zzlv zzlvVar) {
        int zzS = zzS(this.zzU);
        zzbl zzblVar = this.zzU.zza;
        if (zzS == -1) {
            zzS = 0;
        }
        zzdj zzdjVar = this.zzu;
        zzkt zzktVar = this.zzl;
        return new zzlw(zzktVar, zzlvVar, zzblVar, zzS, zzdjVar, zzktVar.zze());
    }

    public final /* synthetic */ void zzab(final zzkq zzkqVar) {
        this.zzk.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // java.lang.Runnable
            public final void run() {
                zzkh.zzK(zzkh.this, zzkqVar);
            }
        });
    }

    public final void zzac(final int i, final int i2) {
        if (i == this.zzM.zzb() && i2 == this.zzM.zza()) {
            return;
        }
        this.zzM = new zzeo(i, i2);
        zzdz zzdzVar = this.zzm;
        zzdzVar.zzd(24, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i3 = zzkh.zzd;
                ((zzbe) obj).zzp(i, i2);
            }
        });
        zzdzVar.zzc();
        zzad(2, 14, new zzeo(i, i2));
    }

    private final void zzad(int i, int i2, Object obj) {
        zzma[] zzmaVarArr = this.zzh;
        int length = zzmaVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzma zzmaVar = zzmaVarArr[i3];
            if (i == -1 || zzmaVar.zzb() == i) {
                zzlw zzaa = zzaa(zzmaVar);
                zzaa.zzf(i2);
                zzaa.zze(obj);
                zzaa.zzd();
            }
        }
        zzma[] zzmaVarArr2 = this.zzi;
        int length2 = zzmaVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzma zzmaVar2 = zzmaVarArr2[i4];
            if (zzmaVar2 != null && (i == -1 || zzmaVar2.zzb() == i)) {
                zzlw zzaa2 = zzaa(zzmaVar2);
                zzaa2.zzf(i2);
                zzaa2.zze(obj);
                zzaa2.zzd();
            }
        }
    }

    public final void zzae(Object obj) {
        Object obj2 = this.zzJ;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zzx = this.zzl.zzx(obj, z ? this.zzz : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzJ;
            Surface surface = this.zzK;
            if (obj3 == surface) {
                surface.release();
                this.zzK = null;
            }
        }
        this.zzJ = obj;
        if (!zzx) {
            zzaf(zzin.zzd(new zzku(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzaf(zzin zzinVar) {
        zzls zzlsVar = this.zzU;
        zzls zzb = zzlsVar.zzb(zzlsVar.zzb);
        zzb.zzq = zzb.zzs;
        zzb.zzr = 0L;
        zzls zzY = zzY(zzb, 1);
        if (zzinVar != null) {
            zzY = zzY.zze(zzinVar);
        }
        this.zzB++;
        this.zzl.zzu();
        zzag(zzY, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzag(final com.google.android.gms.internal.ads.zzls r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzag(com.google.android.gms.internal.ads.zzls, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int zzg = zzg();
        if (zzg == 2 || zzg == 3) {
            zzai();
            boolean z = this.zzU.zzp;
            this.zzx.zza(zzv());
            this.zzy.zza(zzv());
            return;
        }
        this.zzx.zza(false);
        this.zzy.zza(false);
    }

    private final void zzai() {
        this.zze.zzb();
        Looper looper = this.zzs;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzex.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzQ) {
                throw new IllegalStateException(format);
            }
            zzea.zzg("ExoPlayerImpl", format, this.zzR ? null : new IllegalStateException());
            this.zzR = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzex.zza;
        String zza = zzaq.zza();
        zzea.zze("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.8.0-alpha01] [" + str + "] [" + zza + "]");
        zzai();
        this.zzx.zza(false);
        this.zzy.zza(false);
        if (!this.zzl.zzw()) {
            zzdz zzdzVar = this.zzm;
            zzdzVar.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    int i = zzkh.zzd;
                    ((zzbe) obj).zzk(zzin.zzd(new zzku(1), PointerIconCompat.TYPE_HELP));
                }
            });
            zzdzVar.zzc();
        }
        this.zzm.zze();
        this.zzk.zzf(null);
        zzzl zzzlVar = this.zzt;
        zzmo zzmoVar = this.zzr;
        zzzlVar.zzg(zzmoVar);
        boolean z = this.zzU.zzp;
        zzls zzY = zzY(this.zzU, 1);
        this.zzU = zzY;
        zzls zzb = zzY.zzb(zzY.zzb);
        this.zzU = zzb;
        zzb.zzq = zzb.zzs;
        this.zzU.zzr = 0L;
        zzmoVar.zzR();
        Surface surface = this.zzK;
        if (surface != null) {
            surface.release();
            this.zzK = null;
        }
        int i = zzcw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzB(zzmr zzmrVar) {
        zzai();
        this.zzr.zzS(zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzC(zzvj zzvjVar) {
        zzai();
        List singletonList = Collections.singletonList(zzvjVar);
        zzai();
        zzai();
        zzS(this.zzU);
        zzl();
        boolean z = true;
        this.zzB++;
        List list = this.zzp;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                list.remove(i);
            }
            this.zzY = this.zzY.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzlp zzlpVar = new zzlp((zzvj) singletonList.get(i2), this.zzq);
            arrayList.add(zzlpVar);
            list.add(i2, new zzkf(zzlpVar.zzb, zzlpVar.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzly zzlyVar = new zzly(list, this.zzY);
        if (zzlyVar.zzo() || zzlyVar.zzc() >= 0) {
            int zzg = zzlyVar.zzg(false);
            zzls zzZ = zzZ(this.zzU, zzlyVar, zzX(zzlyVar, zzg, -9223372036854775807L));
            int i3 = zzZ.zze;
            if (zzg != -1 && i3 != 1) {
                i3 = 4;
                if (!zzlyVar.zzo() && zzg < zzlyVar.zzc()) {
                    i3 = 2;
                }
            }
            zzls zzY = zzY(zzZ, i3);
            this.zzl.zzy(arrayList, zzg, zzex.zzs(-9223372036854775807L), this.zzY);
            if (this.zzU.zzb.zza.equals(zzY.zzb.zza) || this.zzU.zza.zzo()) {
                z = false;
            }
            zzag(zzY, 0, z, 4, zzU(zzY), -1, false);
            return;
        }
        throw new zzaa(zzlyVar, -1, -9223372036854775807L);
    }

    public final zzin zzF() {
        zzai();
        return this.zzU.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zzb(int i, long j, int i2, boolean z) {
        zzai();
        if (i == -1) {
            return;
        }
        zzdd.zzd(i >= 0);
        zzbl zzblVar = this.zzU.zza;
        if (!zzblVar.zzo() && i >= zzblVar.zzc()) {
            return;
        }
        this.zzr.zzv();
        this.zzB++;
        if (zzx()) {
            zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzkq zzkqVar = new zzkq(this.zzU);
            zzkqVar.zza(1);
            this.zzX.zza.zzab(zzkqVar);
            return;
        }
        zzls zzlsVar = this.zzU;
        int i3 = zzlsVar.zze;
        if (i3 == 3 || (i3 == 4 && !zzblVar.zzo())) {
            zzlsVar = zzY(this.zzU, 2);
        }
        int zze = zze();
        zzls zzZ = zzZ(zzlsVar, zzblVar, zzX(zzblVar, i, j));
        this.zzl.zzo(zzblVar, i, zzex.zzs(j));
        zzag(zzZ, 0, true, 1, zzU(zzZ), zze, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzc() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzd() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zze() {
        zzai();
        int zzS = zzS(this.zzU);
        if (zzS == -1) {
            return 0;
        }
        return zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzf() {
        zzai();
        if (this.zzU.zza.zzo()) {
            return 0;
        }
        zzls zzlsVar = this.zzU;
        return zzlsVar.zza.zza(zzlsVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzg() {
        zzai();
        return this.zzU.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzh() {
        zzai();
        return this.zzU.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzi() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzj() {
        zzai();
        if (!zzx()) {
            zzai();
            if (this.zzU.zza.zzo()) {
                return this.zzW;
            }
            zzls zzlsVar = this.zzU;
            long j = 0;
            if (zzlsVar.zzk.zzd != zzlsVar.zzb.zzd) {
                return zzex.zzv(zzlsVar.zza.zze(zze(), this.zza, 0L).zzm);
            }
            long j2 = zzlsVar.zzq;
            if (this.zzU.zzk.zzb()) {
                zzls zzlsVar2 = this.zzU;
                zzlsVar2.zza.zzn(zzlsVar2.zzk.zza, this.zzo).zzg(this.zzU.zzk.zzb);
            } else {
                j = j2;
            }
            zzls zzlsVar3 = this.zzU;
            zzW(zzlsVar3.zza, zzlsVar3.zzk, j);
            return zzex.zzv(j);
        }
        zzls zzlsVar4 = this.zzU;
        if (zzlsVar4.zzk.equals(zzlsVar4.zzb)) {
            return zzex.zzv(this.zzU.zzq);
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzk() {
        zzai();
        return zzT(this.zzU);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzl() {
        zzai();
        return zzex.zzv(zzU(this.zzU));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzm() {
        zzai();
        if (!zzx()) {
            zzbl zzo = zzo();
            if (!zzo.zzo()) {
                return zzex.zzv(zzo.zze(zze(), this.zza, 0L).zzm);
            }
            return -9223372036854775807L;
        }
        zzls zzlsVar = this.zzU;
        zzvh zzvhVar = zzlsVar.zzb;
        zzbl zzblVar = zzlsVar.zza;
        Object obj = zzvhVar.zza;
        zzbj zzbjVar = this.zzo;
        zzblVar.zzn(obj, zzbjVar);
        return zzex.zzv(zzbjVar.zzf(zzvhVar.zzb, zzvhVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzn() {
        zzai();
        return zzex.zzv(this.zzU.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbl zzo() {
        zzai();
        return this.zzU.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbt zzp() {
        zzai();
        return this.zzU.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzq() {
        zzai();
        zzls zzlsVar = this.zzU;
        if (zzlsVar.zze != 1) {
            return;
        }
        zzls zze = zzlsVar.zze(null);
        zzls zzY = zzY(zze, true != zze.zza.zzo() ? 2 : 4);
        this.zzB++;
        this.zzl.zzn();
        zzag(zzY, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzr(boolean z) {
        zzai();
        zzls zzlsVar = this.zzU;
        int i = zzlsVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (!z) {
                i = 1;
                i2 = 1;
            } else {
                i = 1;
            }
        }
        if (zzlsVar.zzl == z && i == i2 && zzlsVar.zzm == 1) {
            return;
        }
        this.zzB++;
        boolean z2 = zzlsVar.zzp;
        zzls zzd2 = zzlsVar.zzd(z, 1, i2);
        this.zzl.zzr(z, 1, i2);
        zzag(zzd2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzs(Surface surface) {
        zzai();
        zzae(surface);
        int i = surface == null ? 0 : -1;
        zzac(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzt(float f) {
        zzai();
        String str = zzex.zza;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzO == max) {
            return;
        }
        this.zzO = max;
        this.zzl.zzt(max);
        zzdz zzdzVar = this.zzm;
        zzdzVar.zzd(22, new zzdw() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i = zzkh.zzd;
                ((zzbe) obj).zzt(max);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzu() {
        zzai();
        zzaf(null);
        new zzcw(zzfyq.zzn(), this.zzU.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzv() {
        zzai();
        return this.zzU.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzw() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzx() {
        zzai();
        return this.zzU.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzy() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzz(zzmr zzmrVar) {
        this.zzr.zzu(zzmrVar);
    }
}
