package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.work.WorkRequest;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zztp extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private zzti zzA;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzI;
    private ByteBuffer zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private boolean zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzag;
    private boolean zzah;
    private boolean zzai;
    private zzsi zzal;
    private zzsi zzam;
    private final zztd zzc;
    private final zztr zzd;
    private final float zze;
    private final zzsw zzi;
    private zzz zzm;
    private zzz zzn;
    private zzlz zzo;
    private MediaCrypto zzp;
    private zztf zzt;
    private zzz zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private ArrayDeque zzy;
    private zztl zzz;
    private final zzhs zzf = new zzhs(0, 0);
    private final zzhs zzg = new zzhs(0, 0);
    private final zzhs zzh = new zzhs(2, 0);
    private final MediaCodec.BufferInfo zzj = new MediaCodec.BufferInfo();
    private float zzr = 1.0f;
    private float zzs = 1.0f;
    private long zzq = -9223372036854775807L;
    private final ArrayDeque zzk = new ArrayDeque();
    private zztn zzae = zztn.zza;
    private final zzrv zzl = new zzrv();
    private float zzx = -1.0f;
    private int zzB = 0;
    private int zzT = 0;
    private int zzK = -1;
    private int zzL = -1;
    private long zzJ = -9223372036854775807L;
    private long zzZ = -9223372036854775807L;
    private long zzaa = -9223372036854775807L;
    private long zzaf = -9223372036854775807L;
    private long zzH = -9223372036854775807L;
    private int zzU = 0;
    private int zzV = 0;
    protected zzid zza = new zzid();
    private long zzaj = -9223372036854775807L;
    private long zzak = -9223372036854775807L;

    public zztp(int i, zztd zztdVar, zztr zztrVar, boolean z, float f) {
        super(i);
        this.zzc = zztdVar;
        zztrVar.getClass();
        this.zzd = zztrVar;
        this.zze = f;
        zzsw zzswVar = new zzsw();
        this.zzi = zzswVar;
        zzswVar.zzj(0);
        zzswVar.zzc.order(ByteOrder.nativeOrder());
    }

    public static boolean zzaY(zzz zzzVar) {
        return zzzVar.zzN == 0;
    }

    private final void zzaf() {
        this.zzP = false;
        zzal();
    }

    private final void zzag() throws zzin {
        if (this.zzW) {
            this.zzU = 1;
            this.zzV = 3;
            return;
        }
        zzaM();
        zzaJ();
    }

    private final void zzah() {
        try {
            zztf zztfVar = this.zzt;
            zzdd.zzb(zztfVar);
            zztf zztfVar2 = zztfVar;
            zztfVar.zzj();
        } finally {
            zzaN();
        }
    }

    private final void zzal() {
        zzam();
        this.zzR = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzQ = false;
        this.zzl.zzb();
    }

    private final void zzam() {
        this.zzZ = -9223372036854775807L;
        this.zzaa = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
    }

    private final void zzas() {
        this.zzK = -1;
        this.zzg.zzc = null;
    }

    private final void zzba() {
        this.zzL = -1;
        this.zzM = null;
    }

    private final void zzbb(zztn zztnVar) {
        this.zzae = zztnVar;
        if (zztnVar.zzd != -9223372036854775807L) {
            this.zzag = true;
        }
    }

    private final boolean zzbd() throws zzin {
        if (this.zzW) {
            this.zzU = 1;
            if (this.zzD) {
                this.zzV = 3;
                return false;
            }
            this.zzV = 2;
        } else {
            zzbc();
        }
        return true;
    }

    private final boolean zzbe() {
        if (this.zzt == null) {
            return false;
        }
        if (zzaX()) {
            zzaM();
            return true;
        } else if (zzaV()) {
            zzah();
            return false;
        } else {
            long j = this.zzak;
            if (j == -9223372036854775807L || zzcW() > j || this.zzaf >= j) {
                return false;
            }
            this.zzai = true;
            this.zzak = -9223372036854775807L;
            return false;
        }
    }

    private final boolean zzbf() {
        return this.zzL >= 0;
    }

    private final boolean zzbg(long j, long j2) {
        if (j2 < j) {
            zzz zzzVar = this.zzn;
            return zzzVar == null || !Objects.equals(zzzVar.zzo, "audio/opus") || !zzaeq.zzf(j, j2);
        }
        return false;
    }

    private final boolean zzbh(int i) throws zzin {
        zzkv zzl = zzl();
        zzhs zzhsVar = this.zzf;
        zzhsVar.zzb();
        int zzcV = zzcV(zzl, zzhsVar, i | 4);
        if (zzcV == -5) {
            zzae(zzl);
            return true;
        } else if (zzcV != -4 || !zzhsVar.zzf()) {
            return false;
        } else {
            this.zzab = true;
            zzai();
            return false;
        }
    }

    private final boolean zzbi(long j) {
        return this.zzq == -9223372036854775807L || zzcX().zzb() - j < this.zzq;
    }

    private final boolean zzbj(zzz zzzVar) throws zzin {
        if (this.zzt != null && this.zzV != 3 && zzcU() != 0) {
            float f = this.zzs;
            zzzVar.getClass();
            float zzaa = zzaa(f, zzzVar, zzU());
            float f2 = this.zzx;
            if (f2 != zzaa) {
                if (zzaa == -1.0f) {
                    zzag();
                    return false;
                } else if (f2 != -1.0f || zzaa > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzaa);
                    zztf zztfVar = this.zzt;
                    zztfVar.getClass();
                    zztfVar.zzq(bundle);
                    this.zzx = zzaa;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzA(long j, boolean z) throws zzin {
        this.zzab = false;
        this.zzac = false;
        if (this.zzP) {
            zzal();
        } else {
            zzaP();
        }
        zzet zzetVar = this.zzae.zze;
        if (zzetVar.zza() > 0) {
            this.zzad = true;
        }
        zzetVar.zze();
        this.zzk.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzD() {
        try {
            zzaf();
            zzaM();
        } finally {
            this.zzam = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzG(com.google.android.gms.internal.ads.zzz[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzvh r17) throws com.google.android.gms.internal.ads.zzin {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zztn r12 = r11.zzae
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zztn r4 = new com.google.android.gms.internal.ads.zztn
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbb(r4)
            boolean r12 = r11.zzah
            if (r12 == 0) goto L56
            r11.zzat()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzZ
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzaf
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zztn r4 = new com.google.android.gms.internal.ads.zztn
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbb(r4)
            com.google.android.gms.internal.ads.zztn r12 = r11.zzae
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzat()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zztn r0 = new com.google.android.gms.internal.ads.zztn
            long r1 = r11.zzZ
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzG(com.google.android.gms.internal.ads.zzz[], long, long, com.google.android.gms.internal.ads.zzvh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public void zzN(float f, float f2) throws zzin {
        this.zzr = f;
        this.zzs = f2;
        zzbj(this.zzu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x02b3, code lost:
        if (r21.zzn != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x036a, code lost:
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x055a, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ef A[Catch: IllegalStateException -> 0x057d, CryptoException -> 0x05ca, TryCatch #3 {CryptoException -> 0x05ca, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x000b, B:9:0x0010, B:11:0x0016, B:17:0x0032, B:19:0x0051, B:21:0x0062, B:24:0x0071, B:31:0x007c, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009e, B:48:0x00af, B:49:0x00be, B:53:0x00cb, B:55:0x00d1, B:56:0x00d7, B:58:0x00dd, B:59:0x00e5, B:61:0x00f5, B:63:0x00fd, B:64:0x00ff, B:67:0x0105, B:69:0x0109, B:71:0x0116, B:73:0x0120, B:74:0x013d, B:75:0x0145, B:76:0x0146, B:78:0x014d, B:80:0x0155, B:82:0x015b, B:83:0x0162, B:85:0x016e, B:86:0x0177, B:89:0x017e, B:91:0x0192, B:93:0x0198, B:94:0x019b, B:95:0x019e, B:97:0x01a4, B:98:0x01a7, B:100:0x01ad, B:102:0x01b1, B:105:0x01b6, B:113:0x01cb, B:115:0x01d2, B:116:0x01e0, B:118:0x01e4, B:120:0x01f2, B:124:0x01fd, B:126:0x0203, B:128:0x020e, B:130:0x0218, B:132:0x0220, B:133:0x0223, B:134:0x0228, B:135:0x0229, B:137:0x022d, B:139:0x0231, B:141:0x0235, B:142:0x0238, B:144:0x023e, B:146:0x024d, B:148:0x0254, B:150:0x0258, B:152:0x0261, B:154:0x0265, B:156:0x026b, B:157:0x026f, B:159:0x0279, B:160:0x0288, B:162:0x0296, B:164:0x029a, B:166:0x029e, B:168:0x02aa, B:169:0x02ad, B:171:0x02b1, B:173:0x02b5, B:175:0x02b9, B:176:0x02c6, B:177:0x02c7, B:181:0x02d6, B:183:0x02de, B:188:0x02e9, B:190:0x02ef, B:192:0x02f5, B:194:0x02fd, B:195:0x0302, B:196:0x030a, B:198:0x031c, B:200:0x0328, B:202:0x032e, B:207:0x033e, B:209:0x0342, B:211:0x0346, B:212:0x0350, B:214:0x0355, B:216:0x035b, B:221:0x036c, B:223:0x0370, B:225:0x0375, B:228:0x037b, B:230:0x0382, B:232:0x038a, B:233:0x0395, B:236:0x039a, B:238:0x039e, B:239:0x03ad, B:240:0x03b1, B:242:0x03b5, B:244:0x03be, B:245:0x03d8, B:246:0x03d9, B:249:0x03df, B:251:0x03e3, B:253:0x03ee, B:255:0x03fe, B:256:0x0407, B:257:0x0408, B:258:0x040b, B:259:0x040c, B:261:0x0412, B:262:0x041d, B:265:0x0424, B:267:0x042a, B:270:0x0433, B:272:0x0437, B:273:0x043e, B:274:0x0443, B:276:0x044b, B:278:0x0453, B:279:0x0458, B:281:0x045e, B:282:0x0463, B:284:0x0467, B:285:0x0478, B:287:0x047c, B:289:0x0482, B:291:0x0489, B:292:0x048d, B:294:0x0493, B:296:0x0499, B:297:0x049e, B:299:0x04a4, B:301:0x04ac, B:303:0x04b8, B:304:0x04bf, B:305:0x04c0, B:307:0x04c8, B:308:0x04ce, B:309:0x04d1, B:310:0x04d2, B:312:0x04e0, B:314:0x04e6, B:315:0x04e8, B:317:0x04f1, B:318:0x04f4, B:320:0x0501, B:322:0x0505, B:324:0x0514, B:325:0x0520, B:327:0x0529, B:328:0x0534, B:329:0x0544, B:331:0x0546, B:332:0x0550, B:335:0x0558, B:337:0x055a, B:339:0x0561, B:341:0x0565, B:342:0x0566, B:343:0x0575), top: B:377:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031c A[Catch: IllegalStateException -> 0x057d, CryptoException -> 0x05ca, TRY_LEAVE, TryCatch #3 {CryptoException -> 0x05ca, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x000b, B:9:0x0010, B:11:0x0016, B:17:0x0032, B:19:0x0051, B:21:0x0062, B:24:0x0071, B:31:0x007c, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009e, B:48:0x00af, B:49:0x00be, B:53:0x00cb, B:55:0x00d1, B:56:0x00d7, B:58:0x00dd, B:59:0x00e5, B:61:0x00f5, B:63:0x00fd, B:64:0x00ff, B:67:0x0105, B:69:0x0109, B:71:0x0116, B:73:0x0120, B:74:0x013d, B:75:0x0145, B:76:0x0146, B:78:0x014d, B:80:0x0155, B:82:0x015b, B:83:0x0162, B:85:0x016e, B:86:0x0177, B:89:0x017e, B:91:0x0192, B:93:0x0198, B:94:0x019b, B:95:0x019e, B:97:0x01a4, B:98:0x01a7, B:100:0x01ad, B:102:0x01b1, B:105:0x01b6, B:113:0x01cb, B:115:0x01d2, B:116:0x01e0, B:118:0x01e4, B:120:0x01f2, B:124:0x01fd, B:126:0x0203, B:128:0x020e, B:130:0x0218, B:132:0x0220, B:133:0x0223, B:134:0x0228, B:135:0x0229, B:137:0x022d, B:139:0x0231, B:141:0x0235, B:142:0x0238, B:144:0x023e, B:146:0x024d, B:148:0x0254, B:150:0x0258, B:152:0x0261, B:154:0x0265, B:156:0x026b, B:157:0x026f, B:159:0x0279, B:160:0x0288, B:162:0x0296, B:164:0x029a, B:166:0x029e, B:168:0x02aa, B:169:0x02ad, B:171:0x02b1, B:173:0x02b5, B:175:0x02b9, B:176:0x02c6, B:177:0x02c7, B:181:0x02d6, B:183:0x02de, B:188:0x02e9, B:190:0x02ef, B:192:0x02f5, B:194:0x02fd, B:195:0x0302, B:196:0x030a, B:198:0x031c, B:200:0x0328, B:202:0x032e, B:207:0x033e, B:209:0x0342, B:211:0x0346, B:212:0x0350, B:214:0x0355, B:216:0x035b, B:221:0x036c, B:223:0x0370, B:225:0x0375, B:228:0x037b, B:230:0x0382, B:232:0x038a, B:233:0x0395, B:236:0x039a, B:238:0x039e, B:239:0x03ad, B:240:0x03b1, B:242:0x03b5, B:244:0x03be, B:245:0x03d8, B:246:0x03d9, B:249:0x03df, B:251:0x03e3, B:253:0x03ee, B:255:0x03fe, B:256:0x0407, B:257:0x0408, B:258:0x040b, B:259:0x040c, B:261:0x0412, B:262:0x041d, B:265:0x0424, B:267:0x042a, B:270:0x0433, B:272:0x0437, B:273:0x043e, B:274:0x0443, B:276:0x044b, B:278:0x0453, B:279:0x0458, B:281:0x045e, B:282:0x0463, B:284:0x0467, B:285:0x0478, B:287:0x047c, B:289:0x0482, B:291:0x0489, B:292:0x048d, B:294:0x0493, B:296:0x0499, B:297:0x049e, B:299:0x04a4, B:301:0x04ac, B:303:0x04b8, B:304:0x04bf, B:305:0x04c0, B:307:0x04c8, B:308:0x04ce, B:309:0x04d1, B:310:0x04d2, B:312:0x04e0, B:314:0x04e6, B:315:0x04e8, B:317:0x04f1, B:318:0x04f4, B:320:0x0501, B:322:0x0505, B:324:0x0514, B:325:0x0520, B:327:0x0529, B:328:0x0534, B:329:0x0544, B:331:0x0546, B:332:0x0550, B:335:0x0558, B:337:0x055a, B:339:0x0561, B:341:0x0565, B:342:0x0566, B:343:0x0575), top: B:377:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0362 A[LOOP:2: B:116:0x01e0->B:219:0x0362, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x055e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Throwable, android.media.MediaFormat] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.google.android.gms.internal.ads.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzW(long r22, long r24) throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzW(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public boolean zzX() {
        return this.zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public boolean zzY() {
        if (this.zzm != null) {
            if (zzT() || zzbf()) {
                return true;
            }
            return this.zzJ != -9223372036854775807L && zzcX().zzb() < this.zzJ;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final int zzZ(zzz zzzVar) throws zzin {
        try {
            return zzab(this.zzd, zzzVar);
        } catch (zztw e) {
            throw zzk(e, zzzVar, false, 4002);
        }
    }

    public final long zzaA() {
        return this.zzae.zzd;
    }

    public final long zzaB() {
        return this.zzae.zzc;
    }

    public final MediaFormat zzaC() {
        return this.zzv;
    }

    public final zzlz zzaE() {
        return this.zzo;
    }

    public final zztf zzaF() {
        return this.zzt;
    }

    protected zzth zzaG(Throwable th, zzti zztiVar) {
        return new zzth(th, zztiVar);
    }

    public final zzti zzaH() {
        return this.zzA;
    }

    public final void zzaI() {
        this.zzah = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04f7 A[Catch: Exception -> 0x0524, TryCatch #6 {Exception -> 0x0524, blocks: (B:64:0x0147, B:66:0x0170, B:67:0x0178, B:69:0x017d, B:70:0x0185, B:72:0x0189, B:73:0x0191, B:75:0x0195, B:76:0x019d, B:78:0x01a1, B:80:0x01b1, B:82:0x01b9, B:84:0x01c1, B:85:0x01c7, B:87:0x01cf, B:88:0x01d5, B:90:0x01dd, B:91:0x01e3, B:93:0x01eb, B:94:0x01f1, B:95:0x0210, B:96:0x0215, B:98:0x0225, B:101:0x022c, B:103:0x0230, B:104:0x023e, B:106:0x0243, B:108:0x0247, B:109:0x0255, B:113:0x0275, B:115:0x027b, B:117:0x0281, B:118:0x029b, B:120:0x029f, B:122:0x02a5, B:124:0x02ab, B:125:0x02b7, B:127:0x02bd, B:128:0x02c5, B:130:0x02ca, B:131:0x02d2, B:133:0x02d7, B:134:0x02df, B:136:0x02e4, B:137:0x02ec, B:139:0x02f0, B:140:0x02f8, B:143:0x0302, B:144:0x0316, B:146:0x031a, B:148:0x032a, B:149:0x032f, B:151:0x0333, B:152:0x0338, B:153:0x033e, B:155:0x0342, B:157:0x0352, B:159:0x035e, B:161:0x0362, B:162:0x0367, B:164:0x036b, B:165:0x0370, B:167:0x0374, B:168:0x0379, B:170:0x037d, B:171:0x0382, B:173:0x0386, B:174:0x038b, B:176:0x038f, B:177:0x0394, B:179:0x0398, B:180:0x039d, B:182:0x03a1, B:183:0x03a6, B:185:0x03aa, B:186:0x03af, B:188:0x03b3, B:189:0x03b8, B:191:0x03bc, B:192:0x03c1, B:194:0x03c5, B:195:0x03ca, B:197:0x03ce, B:198:0x03d3, B:200:0x03d7, B:201:0x03dc, B:203:0x03e0, B:204:0x03e5, B:206:0x03ef, B:208:0x03f3, B:219:0x040d, B:220:0x0414, B:225:0x0420, B:226:0x0423, B:228:0x043d, B:230:0x0447, B:232:0x044f, B:234:0x0459, B:236:0x0463, B:238:0x046d, B:242:0x047a, B:244:0x0482, B:248:0x048d, B:250:0x0498, B:254:0x04a3, B:256:0x04a7, B:258:0x04af, B:260:0x04b7, B:262:0x04bf, B:264:0x04c7, B:266:0x04cf, B:268:0x04d7, B:270:0x04e1, B:272:0x04eb, B:276:0x04f1, B:278:0x04f7, B:280:0x0500, B:281:0x050d), top: B:323:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0557 A[Catch: zztl -> 0x0586, TryCatch #0 {zztl -> 0x0586, blocks: (B:24:0x0057, B:26:0x005c, B:28:0x0063, B:30:0x0079, B:31:0x0084, B:33:0x0088, B:34:0x0090, B:35:0x0091, B:37:0x0099, B:39:0x009d, B:40:0x00a0, B:42:0x00a4, B:44:0x00ad, B:293:0x053c, B:295:0x0557, B:296:0x055a, B:297:0x0560, B:300:0x056d, B:301:0x056f, B:303:0x0572, B:304:0x0573, B:306:0x0578, B:307:0x0579, B:308:0x0583, B:310:0x0585), top: B:315:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x055a A[Catch: zztl -> 0x0586, TryCatch #0 {zztl -> 0x0586, blocks: (B:24:0x0057, B:26:0x005c, B:28:0x0063, B:30:0x0079, B:31:0x0084, B:33:0x0088, B:34:0x0090, B:35:0x0091, B:37:0x0099, B:39:0x009d, B:40:0x00a0, B:42:0x00a4, B:44:0x00ad, B:293:0x053c, B:295:0x0557, B:296:0x055a, B:297:0x0560, B:300:0x056d, B:301:0x056f, B:303:0x0572, B:304:0x0573, B:306:0x0578, B:307:0x0579, B:308:0x0583, B:310:0x0585), top: B:315:0x0057, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0521 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x056d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.android.gms.internal.ads.zzto, android.media.MediaCrypto] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzaJ() throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzaJ():void");
    }

    public void zzaK(long j) {
        this.zzaf = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j < ((zztn) arrayDeque.peek()).zzb) {
                return;
            }
            zztn zztnVar = (zztn) arrayDeque.poll();
            zztnVar.getClass();
            zzbb(zztnVar);
            zzat();
        }
    }

    protected void zzaL(zzhs zzhsVar) throws zzin {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsi, com.google.android.gms.internal.ads.zztf] */
    public final void zzaM() {
        try {
            zztf zztfVar = this.zzt;
            if (zztfVar != null) {
                zztfVar.zzm();
                this.zza.zzb++;
                zzti zztiVar = this.zzA;
                if (zztiVar != null) {
                    zzti zztiVar2 = zztiVar;
                    zzaq(zztiVar.zza);
                } else {
                    throw null;
                }
            }
        } finally {
            this.zzt = null;
            this.zzp = null;
            this.zzal = null;
            zzaO();
        }
    }

    public void zzaN() {
        zzas();
        zzba();
        zzam();
        this.zzJ = -9223372036854775807L;
        this.zzX = false;
        this.zzH = -9223372036854775807L;
        this.zzW = false;
        this.zzE = false;
        this.zzF = false;
        this.zzN = false;
        this.zzO = false;
        this.zzU = 0;
        this.zzV = 0;
        this.zzT = this.zzS ? 1 : 0;
        this.zzai = false;
        this.zzaj = -9223372036854775807L;
        this.zzak = -9223372036854775807L;
    }

    protected final void zzaO() {
        zzaN();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzY = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzI = false;
        this.zzS = false;
        this.zzT = 0;
    }

    public final boolean zzaP() throws zzin {
        boolean zzbe = zzbe();
        if (zzbe) {
            zzaJ();
        }
        return zzbe;
    }

    public final boolean zzaQ() {
        return this.zzai;
    }

    public final boolean zzaR() {
        return this.zzP;
    }

    public final boolean zzaS(zzz zzzVar) {
        return this.zzam == null && zzaw(zzzVar);
    }

    protected boolean zzaT(zzz zzzVar) throws zzin {
        return true;
    }

    protected boolean zzaU(zzhs zzhsVar) {
        return false;
    }

    protected boolean zzaV() {
        return true;
    }

    protected boolean zzaW(zzti zztiVar) {
        return true;
    }

    public boolean zzaX() {
        int i = this.zzV;
        if (i == 3 || ((this.zzC && !this.zzY) || (this.zzD && this.zzX))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbc();
            return false;
        } catch (zzin e) {
            zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public final boolean zzaZ() throws zzin {
        return zzbj(this.zzu);
    }

    protected float zzaa(float f, zzz zzzVar, zzz[] zzzVarArr) {
        throw null;
    }

    protected abstract int zzab(zztr zztrVar, zzz zzzVar) throws zztw;

    protected long zzac(long j, long j2, boolean z) {
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    protected zzie zzad(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (zzbd() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (zzbd() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        if (zzbd() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzie zzae(com.google.android.gms.internal.ads.zzkv r13) throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzae(com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzie");
    }

    protected abstract zztc zzaj(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzak(zztr zztrVar, zzz zzzVar, boolean z) throws zztw;

    protected void zzan(zzhs zzhsVar) throws zzin {
        throw null;
    }

    protected void zzao(Exception exc) {
        throw null;
    }

    protected void zzap(String str, zztc zztcVar, long j, long j2) {
        throw null;
    }

    protected void zzaq(String str) {
        throw null;
    }

    protected void zzar(zzz zzzVar, MediaFormat mediaFormat) throws zzin {
        throw null;
    }

    protected void zzat() {
    }

    protected void zzau() throws zzin {
        throw null;
    }

    protected abstract boolean zzav(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzz zzzVar) throws zzin;

    protected boolean zzaw(zzz zzzVar) {
        return false;
    }

    public final float zzax() {
        return this.zzr;
    }

    public int zzay(zzhs zzhsVar) {
        return 0;
    }

    public final long zzaz() {
        return this.zzaa;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzmd
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final long zzf(long j, long j2) {
        return zzac(j, j2, this.zzI);
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public void zzv(int i, Object obj) throws zzin {
        if (i == 11) {
            zzlz zzlzVar = (zzlz) obj;
            zzlzVar.getClass();
            this.zzo = zzlzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzy() {
        this.zzm = null;
        zzbb(zztn.zza);
        this.zzk.clear();
        if (this.zzP) {
            zzaf();
        } else {
            zzbe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzz(boolean z, boolean z2) throws zzin {
        this.zza = new zzid();
    }

    private final void zzbc() throws zzin {
        zzsi zzsiVar = this.zzam;
        zzsiVar.getClass();
        this.zzal = zzsiVar;
        this.zzU = 0;
        this.zzV = 0;
    }

    private final void zzai() throws zzin {
        int i = this.zzV;
        if (i == 1) {
            zzah();
        } else if (i == 2) {
            zzah();
            zzbc();
        } else if (i != 3) {
            this.zzac = true;
            zzau();
        } else {
            zzaM();
            zzaJ();
        }
    }
}
