package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcer extends zzgc implements zzhe {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private zzgo zzf;
    private HttpURLConnection zzg;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;
    private final zzhd zze = new zzhd();
    private final Queue zzh = new ArrayDeque();

    public zzcer(String str, zzhj zzhjVar, int i, int i2, long j, long j2) {
        super(true);
        zzdd.zzc(str);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzq = j;
        this.zzr = j2;
        if (zzhjVar != null) {
            zzf(zzhjVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (!queue.isEmpty()) {
                try {
                    ((HttpURLConnection) queue.remove()).disconnect();
                } catch (Exception e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
                }
            } else {
                this.zzg = null;
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzha {
        long j;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzl;
            long j3 = this.zzm;
            if (j2 - j3 == 0) {
                return -1;
            }
            long j4 = this.zzn + j3;
            long j5 = i2;
            long j6 = j4 + j5 + this.zzr;
            long j7 = this.zzp;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.zzo;
                if (j7 < j9) {
                    long min = Math.min(j9, Math.max(((this.zzq + j8) - j) - 1, (j8 + j5) - 1));
                    zzk(j8, min, 2);
                    this.zzp = min;
                    j7 = min;
                }
            }
            int read = this.zzi.read(bArr, i, (int) Math.min(j5, ((j7 + 1) - this.zzn) - this.zzm));
            if (read != -1) {
                this.zzm += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new zzha(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws zzha {
        this.zzf = zzgoVar;
        this.zzm = 0L;
        long j = zzgoVar.zze;
        long j2 = zzgoVar.zzf;
        long min = j2 == -1 ? this.zzq : Math.min(this.zzq, j2);
        this.zzn = j;
        HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField(HttpHeaders.CONTENT_RANGE);
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j3 = zzgoVar.zzf;
                    if (j3 != -1) {
                        this.zzl = j3;
                        this.zzo = Math.max(parseLong, (this.zzn + j3) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzj(zzgoVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcep(headerField, zzgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzha {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzha(e, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j, long j2, int i) throws zzha {
        int i2;
        IOException iOException;
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e) {
                    iOException = e;
                    i2 = i;
                    String valueOf = String.valueOf(uri);
                    throw new zzha("Unable to connect to ".concat(valueOf), iOException, this.zzf, 2000, i2);
                }
            }
            httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzceq(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e2) {
                    zzl();
                    throw new zzha(e2, this.zzf, 2000, i);
                }
            } catch (IOException e3) {
                zzl();
                String valueOf2 = String.valueOf(uri2);
                throw new zzha("Unable to connect to ".concat(valueOf2), e3, this.zzf, 2000, i);
            }
        } catch (IOException e4) {
            i2 = i;
            iOException = e4;
        }
    }
}
