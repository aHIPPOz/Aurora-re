package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzafi implements zzadv {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc = "#!AMR\n".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzd = "#!AMR-WB\n".getBytes(StandardCharsets.UTF_8);
    private final byte[] zze;
    private final zzafb zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzady zzn;
    private zzafb zzo;
    private zzafb zzp;
    private zzaeu zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzex.zza;
    }

    public zzafi() {
        throw null;
    }

    public zzafi(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzadr zzadrVar = new zzadr();
        this.zzf = zzadrVar;
        this.zzp = zzadrVar;
    }

    private static boolean zzg(zzadw zzadwVar, byte[] bArr) throws IOException {
        zzadwVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzadwVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzadw zzadwVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzadwVar, bArr)) {
            this.zzg = false;
            zzadwVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzadwVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzadwVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final int zzb(zzadw zzadwVar, zzaer zzaerVar) throws IOException {
        zzdd.zzb(this.zzo);
        String str = zzex.zza;
        if (zzadwVar.zzf() != 0 || zzh(zzadwVar)) {
            if (!this.zzs) {
                this.zzs = true;
                boolean z = this.zzg;
                String str2 = "audio/amr-wb";
                String str3 = true != z ? "audio/amr" : str2;
                if (true != z) {
                    str2 = "audio/3gpp";
                }
                int i = true != z ? ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED : 16000;
                int i2 = z ? zzb[8] : zza[7];
                zzafb zzafbVar = this.zzo;
                zzx zzxVar = new zzx();
                zzxVar.zzG(str3);
                zzxVar.zzah(str2);
                zzxVar.zzX(i2);
                zzxVar.zzD(1);
                zzxVar.zzai(i);
                zzafbVar.zzm(zzxVar.zzan());
            }
            int zza2 = zza(zzadwVar);
            if (this.zzq == null) {
                zzaet zzaetVar = new zzaet(-9223372036854775807L, 0L);
                this.zzq = zzaetVar;
                this.zzn.zzP(zzaetVar);
            }
            return zza2 == -1 ? -1 : 0;
        }
        throw zzaz.zza("Could not find AMR header.", null);
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
        this.zzn = zzadyVar;
        zzafb zzw = zzadyVar.zzw(0, 1);
        this.zzo = zzw;
        this.zzp = zzw;
        zzadyVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        return zzh(zzadwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x00ab, TryCatch #0 {EOFException -> 0x00ab, blocks: (B:4:0x000c, B:6:0x001b, B:20:0x0039, B:21:0x003e, B:22:0x0042, B:39:0x0081, B:40:0x0099, B:41:0x009a, B:42:0x00aa), top: B:44:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x00ab, TryCatch #0 {EOFException -> 0x00ab, blocks: (B:4:0x000c, B:6:0x001b, B:20:0x0039, B:21:0x003e, B:22:0x0042, B:39:0x0081, B:40:0x0099, B:41:0x009a, B:42:0x00aa), top: B:44:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(com.google.android.gms.internal.ads.zzadw r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r11.zzj
            r3 = 0
            r4 = -1
            r5 = 1
            if (r2 == 0) goto Lc
            goto L55
        Lc:
            r12.zzj()     // Catch: java.io.EOFException -> Lab
            byte[] r2 = r11.zze     // Catch: java.io.EOFException -> Lab
            r12.zzh(r2, r3, r5)     // Catch: java.io.EOFException -> Lab
            r2 = r2[r3]     // Catch: java.io.EOFException -> Lab
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L9a
            int r1 = r2 >> 3
            boolean r2 = r11.zzg     // Catch: java.io.EOFException -> Lab
            r1 = r1 & 15
            if (r2 == 0) goto L2c
            r6 = 10
            if (r1 < r6) goto L37
            r6 = 13
            if (r1 <= r6) goto L2c
            goto L37
        L2c:
            if (r2 != 0) goto L7a
            r6 = 12
            if (r1 < r6) goto L37
            r6 = 14
            if (r1 > r6) goto L37
            goto L7a
        L37:
            if (r2 == 0) goto L3e
            int[] r0 = com.google.android.gms.internal.ads.zzafi.zzb     // Catch: java.io.EOFException -> Lab
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lab
            goto L42
        L3e:
            int[] r0 = com.google.android.gms.internal.ads.zzafi.zza     // Catch: java.io.EOFException -> Lab
            r0 = r0[r1]     // Catch: java.io.EOFException -> Lab
        L42:
            r2 = r0
            r11.zzi = r2     // Catch: java.io.EOFException -> Lab
            r11.zzj = r2
            int r0 = r11.zzk
            if (r0 != r4) goto L4e
            r11.zzk = r2
            r0 = r2
        L4e:
            if (r0 != r2) goto L55
            int r0 = r11.zzl
            int r0 = r0 + r5
            r11.zzl = r0
        L55:
            com.google.android.gms.internal.ads.zzafb r0 = r11.zzp
            int r12 = r0.zzf(r12, r2, r5)
            if (r12 != r4) goto L5e
            return r4
        L5e:
            int r0 = r11.zzj
            int r0 = r0 - r12
            r11.zzj = r0
            if (r0 <= 0) goto L66
            return r3
        L66:
            com.google.android.gms.internal.ads.zzafb r4 = r11.zzp
            long r5 = r11.zzh
            int r8 = r11.zzi
            r9 = 0
            r10 = 0
            r7 = 1
            r4.zzt(r5, r7, r8, r9, r10)
            long r0 = r11.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzh = r0
            return r3
        L7a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r5 == r2) goto L81
            r12 = r3
        L81:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lab
            r2.<init>(r0)     // Catch: java.io.EOFException -> Lab
            r2.append(r12)     // Catch: java.io.EOFException -> Lab
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> Lab
            r2.append(r1)     // Catch: java.io.EOFException -> Lab
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> Lab
            com.google.android.gms.internal.ads.zzaz r12 = com.google.android.gms.internal.ads.zzaz.zza(r12, r7)     // Catch: java.io.EOFException -> Lab
            throw r12     // Catch: java.io.EOFException -> Lab
        L9a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> Lab
            r12.<init>(r1)     // Catch: java.io.EOFException -> Lab
            r12.append(r2)     // Catch: java.io.EOFException -> Lab
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> Lab
            com.google.android.gms.internal.ads.zzaz r12 = com.google.android.gms.internal.ads.zzaz.zza(r12, r7)     // Catch: java.io.EOFException -> Lab
            throw r12     // Catch: java.io.EOFException -> Lab
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafi.zza(com.google.android.gms.internal.ads.zzadw):int");
    }
}
