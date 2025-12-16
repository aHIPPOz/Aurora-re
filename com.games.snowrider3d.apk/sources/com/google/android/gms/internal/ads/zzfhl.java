package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfhl implements zzfhj {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfhz zzj = zzfhz.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzm = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfhl(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized zzfhl zzA() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        return this;
    }

    public final synchronized zzfhl zzK(int i) {
        this.zzq = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzb(zzfcm zzfcmVar) {
        zzs(zzfcmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzf(zzfhz zzfhzVar) {
        zzw(zzfhzVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzg(boolean z) {
        zzx(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzh(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final synchronized zzfhn zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzfhn(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhj
    public final /* bridge */ /* synthetic */ zzfhj zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized zzfhl zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcvr zzcvrVar = (zzcvr) iBinder;
            String zzl = zzcvrVar.zzl();
            if (!TextUtils.isEmpty(zzl)) {
                this.zzf = zzl;
            }
            String zzi = zzcvrVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfhl zzs(com.google.android.gms.internal.ads.zzfcm r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfcd r0 = r3.zzb     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto Ld
            r2.zzf = r0     // Catch: java.lang.Throwable -> L2b
        Ld:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzfca r0 = (com.google.android.gms.internal.ads.zzfca) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.zzab     // Catch: java.lang.Throwable -> L2b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L13
            r2.zzg = r0     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r2)
            return r2
        L2b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfhl.zzs(com.google.android.gms.internal.ads.zzfcm):com.google.android.gms.internal.ads.zzfhl");
    }

    public final synchronized zzfhl zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjj)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfhl zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhl zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhl zzw(zzfhz zzfhzVar) {
        this.zzj = zzfhzVar;
        return this;
    }

    public final synchronized zzfhl zzx(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfhl zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjj)).booleanValue()) {
            this.zzl = zzbun.zzf(th);
            this.zzk = (String) zzfwe.zzb(zzfva.zzc('\n')).zzd(zzbun.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfhl zzz() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzaa zzs = com.google.android.gms.ads.internal.zzv.zzs();
        Context context = this.zza;
        this.zze = zzs.zzm(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
