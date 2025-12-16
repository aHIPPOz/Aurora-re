package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcdy extends zzgc implements zzhe {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final int zzd;
    private final int zze;
    private final String zzf;
    private zzgo zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final SSLSocketFactory zzc = new zzcdx(this);
    private final Set zzr = new HashSet();
    private final zzhd zzg = new zzhd();

    public zzcdy(String str, zzhj zzhjVar, int i, int i2, int i3) {
        super(true);
        zzdd.zzc(str);
        this.zzf = str;
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzhjVar != null) {
            zzf(zzhjVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
        if (r2 == r16) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0026, B:6:0x002c, B:8:0x0036, B:10:0x0043, B:11:0x005b, B:13:0x0061, B:20:0x0085, B:22:0x009f, B:23:0x00b1, B:24:0x00b6, B:26:0x00bf, B:27:0x00c6, B:40:0x00ed, B:92:0x0232, B:94:0x023d, B:96:0x024e, B:99:0x0257, B:100:0x0266, B:102:0x026d, B:103:0x0274, B:104:0x0275, B:105:0x028b), top: B:117:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023d A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0026, B:6:0x002c, B:8:0x0036, B:10:0x0043, B:11:0x005b, B:13:0x0061, B:20:0x0085, B:22:0x009f, B:23:0x00b1, B:24:0x00b6, B:26:0x00bf, B:27:0x00c6, B:40:0x00ed, B:92:0x0232, B:94:0x023d, B:96:0x024e, B:99:0x0257, B:100:0x0266, B:102:0x026d, B:103:0x0274, B:104:0x0275, B:105:0x028b), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgo r21) throws com.google.android.gms.internal.ads.zzha {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdy.zzb(com.google.android.gms.internal.ads.zzgo):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzha {
        try {
            if (this.zzj != null) {
                String str = zzex.zza;
                try {
                    this.zzj.close();
                } catch (IOException e) {
                    throw new zzha(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzha {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j != j2) {
                        int read = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzo += read;
                            zzg(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        atomicReference.set(bArr2);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j4);
            }
            int read2 = this.zzj.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn != -1) {
                    throw new EOFException();
                }
                return -1;
            }
            this.zzp += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzha(e, this.zzh, 2000, 2);
        }
    }
}
