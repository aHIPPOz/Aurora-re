package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcdt extends zzcdn implements zzhj {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcca zzf;
    private boolean zzg;
    private ByteBuffer zzj;
    private boolean zzk;
    private final String zzm;
    private final int zzn;
    private boolean zzo;
    private final zzcds zzh = new zzcds();
    private final zzccx zzi = new zzccx();
    private final Object zzl = new Object();

    public zzcdt(zzccb zzccbVar, zzcca zzccaVar) {
        super(zzccbVar);
        this.zzf = zzccaVar;
        this.zzm = (String) zzfvn.zzd(zzccbVar != null ? zzccbVar.zzr() : null).zzb(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.zzn = zzccbVar != null ? zzccbVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzk(str)));
    }

    private final void zzx() {
        int zza = (int) this.zzh.zza();
        int zza2 = (int) this.zzi.zza(this.zzj);
        int position = this.zzj.position();
        int round = Math.round(zza2 * (position / zza));
        int zzs = zzcbs.zzs();
        int zzu = zzcbs.zzu();
        String str = this.zze;
        zzn(str, zzv(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zza(zzgj zzgjVar, zzgo zzgoVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzb(zzgj zzgjVar, zzgo zzgoVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzc(zzgj zzgjVar, zzgo zzgoVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd(zzgj zzgjVar, zzgo zzgoVar, boolean z) {
        if (zzgjVar instanceof zzgw) {
            this.zzh.zzb((zzgw) zzgjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            ByteBuffer byteBuffer = this.zzj;
            if (byteBuffer != null && !this.zzk) {
                byteBuffer.flip();
                this.zzk = true;
            }
            this.zzg = true;
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a6, code lost:
        r23.zzo = true;
        zzj(r24, r4, (int) r23.zzi.zza(r23.zzj));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:? -> B:43:0x0143). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcdn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdt.zzt(java.lang.String):boolean");
    }
}
