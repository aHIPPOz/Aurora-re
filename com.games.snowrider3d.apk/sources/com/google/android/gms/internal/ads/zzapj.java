package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzapj {
    public static X509Certificate[][] zza(String str) throws zzapf, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzapk.zzc(randomAccessFile);
            if (zzc != null) {
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j = longValue - 20;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzapf("ZIP64 APK not supported");
                    }
                }
                long zza = zzapk.zza(byteBuffer);
                if (zza >= longValue) {
                    throw new zzapf("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                } else if (zzapk.zzb(byteBuffer) + zza != longValue) {
                    throw new zzapf("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else {
                    if (zza < 32) {
                        throw new zzapf("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(zza - allocate.capacity());
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                        throw new zzapf("No APK Signing Block before ZIP Central Directory");
                    }
                    int i = 0;
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        throw new zzapf("APK Signing Block size out of range: " + j2);
                    }
                    int i2 = (int) (8 + j2);
                    long j3 = zza - i2;
                    if (j3 < 0) {
                        throw new zzapf("APK Signing Block offset out of range: " + j3);
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        throw new zzapf("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == ByteOrder.LITTLE_ENDIAN) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        byteBuffer2.position(0);
                        byteBuffer2.limit(capacity);
                        byteBuffer2.position(8);
                        ByteBuffer slice = byteBuffer2.slice();
                        slice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(limit);
                        byteBuffer2.position(position);
                        while (slice.hasRemaining()) {
                            i++;
                            if (slice.remaining() >= 8) {
                                long j5 = slice.getLong();
                                if (j5 >= 4 && j5 <= 2147483647L) {
                                    int i3 = (int) j5;
                                    int position2 = slice.position() + i3;
                                    if (i3 <= slice.remaining()) {
                                        if (slice.getInt() != 1896449818) {
                                            long j6 = zza;
                                            long j7 = longValue;
                                            slice.position(position2);
                                            longValue = j7;
                                            zza = j6;
                                        } else {
                                            X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzape(zze(slice, i3 - 4), longValue2, zza, longValue, byteBuffer, null));
                                            randomAccessFile.close();
                                            return zzl;
                                        }
                                    } else {
                                        throw new zzapf("APK Signing Block entry #" + i + " size out of range: " + i3 + ", available: " + slice.remaining());
                                    }
                                } else {
                                    throw new zzapf("APK Signing Block entry #" + i + " size out of range: " + j5);
                                }
                            } else {
                                throw new zzapf("Insufficient data to read size of APK Signing Block entry #" + i);
                            }
                        }
                        throw new zzapf("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
            }
            throw new zzapf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i == 514) {
                return 2;
            }
            if (i == 769) {
                return 1;
            }
            switch (i) {
                case 257:
                case 259:
                    return 1;
                case 258:
                case 260:
                    return 2;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining);
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining2);
        }
        return zze(byteBuffer, i);
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzapd zzapdVar = new zzapd(fileChannel, 0L, j);
            zzapd zzapdVar2 = new zzapd(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzapk.zzd(duplicate, j);
            zzapb zzapbVar = new zzapb(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzapc[]{zzapdVar, zzapdVar2, zzapbVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapj.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzapc[] zzapcVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        String str;
        int i3 = 0;
        int i4 = 0;
        long j2 = 0;
        while (true) {
            j = 1048576;
            i = 3;
            if (i4 >= 3) {
                break;
            }
            j2 += (zzapcVarArr[i4].zza() + 1048575) / 1048576;
            i4++;
        }
        if (j2 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i5 = 0;
            while (true) {
                length = iArr.length;
                c = 5;
                i2 = 1;
                if (i5 >= length) {
                    break;
                }
                int i6 = (int) j2;
                byte[] bArr2 = new byte[(zzb(iArr[i5]) * i6) + 5];
                bArr2[0] = 90;
                zzg(i6, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i7 = 0;
            while (true) {
                str = " digest not supported";
                if (i7 >= iArr.length) {
                    break;
                }
                String zzd = zzd(iArr[i7]);
                try {
                    messageDigestArr[i7] = MessageDigest.getInstance(zzd);
                    i7++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(str), e);
                }
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < i) {
                zzapc zzapcVar = zzapcVarArr[i8];
                int i10 = i8;
                long zza = zzapcVar.zza();
                byte[][] bArr4 = bArr;
                long j3 = 0;
                while (zza > 0) {
                    int i11 = i9;
                    String str2 = str;
                    int min = (int) Math.min(zza, j);
                    zzg(min, bArr3, i2);
                    for (int i12 = 0; i12 < length; i12++) {
                        messageDigestArr[i12].update(bArr3);
                    }
                    try {
                        zzapcVar.zzb(messageDigestArr, j3, min);
                        int i13 = 0;
                        while (i13 < iArr.length) {
                            int i14 = iArr[i13];
                            byte[] bArr5 = bArr4[i13];
                            int zzb = zzb(i14);
                            char c2 = c;
                            MessageDigest messageDigest = messageDigestArr[i13];
                            int digest = messageDigest.digest(bArr5, (i11 * zzb) + 5, zzb);
                            if (digest != zzb) {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                            i13++;
                            c = c2;
                        }
                        long j4 = min;
                        j3 += j4;
                        zza -= j4;
                        i9 = i11 + 1;
                        str = str2;
                        j = 1048576;
                        i2 = 1;
                    } catch (IOException e2) {
                        throw new DigestException("Failed to digest chunk #" + i11 + " of section #" + i3, e2);
                    }
                }
                i3++;
                i8 = i10 + 1;
                bArr = bArr4;
                j = 1048576;
                i = 3;
                i2 = 1;
            }
            byte[][] bArr6 = bArr;
            String str3 = str;
            byte[][] bArr7 = new byte[iArr.length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                int i16 = iArr[i15];
                byte[] bArr8 = bArr6[i15];
                String zzd2 = zzd(i16);
                try {
                    bArr7[i15] = MessageDigest.getInstance(zzd2).digest(bArr8);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(str3), e3);
                }
            }
            return bArr7;
        }
        throw new DigestException("Too many chunks: " + j2);
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzape zzapeVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzapeVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    j = zzapeVar.zzb;
                    j2 = zzapeVar.zzc;
                    j3 = zzapeVar.zzd;
                    byteBuffer2 = zzapeVar.zze;
                    zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
