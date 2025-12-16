package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzceb extends zzgc {
    private final Context zza;
    private final zzgj zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbo zzi;
    private final zzcel zzq;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private long zzn = 0;
    private final AtomicLong zzp = new AtomicLong(-1);
    private ListenableFuture zzo = null;
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzcc)).booleanValue();

    public zzceb(Context context, zzgj zzgjVar, String str, int i, zzhj zzhjVar, zzcel zzcelVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgjVar;
        this.zzq = zzcelVar;
        this.zzc = str;
        this.zzd = i;
        zzf(zzhjVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeG)).booleanValue() && !this.zzl) {
            return true;
        }
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzeH)).booleanValue() && !this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            i3 = inputStream.read(bArr, i, i2);
        } else {
            i3 = this.zzb.zza(bArr, i, i2);
        }
        if (this.zze && this.zzf == null) {
            return i3;
        }
        zzg(i3);
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.zzgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgo r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceb.zzb(com.google.android.gms.internal.ads.zzgo):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws IOException {
        if (this.zzg) {
            boolean z = false;
            this.zzg = false;
            this.zzh = null;
            if (!this.zze || this.zzf != null) {
                z = true;
            }
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                IOUtils.closeQuietly(inputStream);
                this.zzf = null;
            } else {
                this.zzb.zzd();
            }
            if (!z) {
                return;
            }
            zzh();
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            AtomicLong atomicLong = this.zzp;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcaf.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcea
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Long valueOf;
                            valueOf = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzc().zza(zzceb.this.zzi));
                            return valueOf;
                        }
                    });
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
