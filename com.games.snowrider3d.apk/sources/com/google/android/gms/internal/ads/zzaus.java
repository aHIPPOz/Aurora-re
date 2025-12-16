package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaus {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzaug zza(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector zzc2 = zzc(bArr, 255);
        if (zzc2 == null || zzc2.isEmpty()) {
            return null;
        }
        zzaug zza2 = zzauh.zza();
        int size = zzc2.size();
        for (int i = 0; i < size; i++) {
            zza2.zza(zzgxz.zzv(zzh((byte[]) zzc2.get(i), str, false), 0, 256));
        }
        byte[] zzf2 = zzf(bArr);
        zzgxz zzgxzVar = zzgxz.zzb;
        zza2.zzb(zzgxz.zzv(zzf2, 0, zzf2.length));
        return zza2;
    }

    public static String zzb(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr2;
        zzaug zza2 = zza(bArr, str);
        if (zza2 == null) {
            bArr2 = zzh(zzg(4096).zzaV(), str, true);
        } else {
            bArr2 = ((zzauh) zza2.zzbr()).zzaV();
        }
        return zzaul.zza(bArr2, true);
    }

    static Vector zzc(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zze() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzauq(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzaus.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] zzf(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaus.zze
            monitor-enter(r0)
            zze()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzaus.zzb     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzaus.zzd     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzaus.zzd     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaus.zzf(byte[]):byte[]");
    }

    static zzatq zzg(int i) {
        zzast zza2 = zzatq.zza();
        zza2.zzB(4096L);
        return (zzatq) zza2.zzbr();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzg(4096).zzaV();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr3 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(zzf(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        zzaut[] zzautVarArr = new zzavh().zzcG;
        int length3 = zzautVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzautVarArr[i3].zza(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzauj(str.getBytes("UTF-8")).zza(bArr4);
        }
        return bArr4;
    }
}
