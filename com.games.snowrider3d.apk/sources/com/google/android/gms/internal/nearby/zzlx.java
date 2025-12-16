package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzlx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlx> CREATOR = new zzlu();
    private byte[] zza;
    private ParcelFileDescriptor zzb;

    private zzlx() {
        this.zza = new byte[0];
    }

    public static byte[] zzd(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } finally {
            zze(dataInputStream);
        }
    }

    private static void zze(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlx)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzlx) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final byte[] zzc() {
        return this.zza;
    }

    public zzlx(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = new byte[0];
        this.zzb = parcelFileDescriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if (r7 == null) goto L34;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00b5: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:37:0x00b5 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "ParcelByteArray"
            java.lang.String r1 = "Could not write into unlinked file. "
            java.lang.String r2 = "Could not create unlinked file. "
            byte[] r3 = r9.zza
            r4 = 0
            if (r3 == 0) goto Lbc
            android.os.ParcelFileDescriptor r5 = r9.zzb
            if (r5 == 0) goto L11
            goto Lbc
        L11:
            java.io.File r5 = com.google.android.gms.internal.nearby.zzmd.zzb()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            if (r5 == 0) goto L74
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L7c java.lang.IllegalStateException -> L96
            java.lang.String r7 = "teleporter"
            r6.<init>(r7)     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L7c java.lang.IllegalStateException -> L96
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L7c java.lang.IllegalStateException -> L96
            r6.append(r7)     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L7c java.lang.IllegalStateException -> L96
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L7c java.lang.IllegalStateException -> L96
            java.lang.String r7 = ".tmp"
            java.io.File r5 = java.io.File.createTempFile(r6, r7, r5)     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L7c java.lang.IllegalStateException -> L96
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L62 java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            r6.<init>(r5)     // Catch: java.io.FileNotFoundException -> L62 java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            r7 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r7 = android.os.ParcelFileDescriptor.open(r5, r7)     // Catch: java.io.FileNotFoundException -> L62 java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            r5.delete()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            android.util.Pair r5 = android.util.Pair.create(r6, r7)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.lang.Object r7 = r5.first     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.io.OutputStream r7 = (java.io.OutputStream) r7     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            int r6 = r3.length     // Catch: java.io.IOException -> L5e java.lang.IllegalStateException -> L60 java.lang.Throwable -> Lb4
            r7.writeInt(r6)     // Catch: java.io.IOException -> L5e java.lang.IllegalStateException -> L60 java.lang.Throwable -> Lb4
            r7.write(r3)     // Catch: java.io.IOException -> L5e java.lang.IllegalStateException -> L60 java.lang.Throwable -> Lb4
            java.lang.Object r3 = r5.second     // Catch: java.io.IOException -> L5e java.lang.IllegalStateException -> L60 java.lang.Throwable -> Lb4
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3     // Catch: java.io.IOException -> L5e java.lang.IllegalStateException -> L60 java.lang.Throwable -> Lb4
            zze(r7)
            goto Lb1
        L5e:
            r2 = move-exception
            goto L80
        L60:
            r1 = move-exception
            goto L98
        L62:
            r3 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.lang.String r6 = "Temporary file is somehow already deleted"
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            throw r5     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
        L6b:
            r3 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.lang.String r6 = "Could not create temporary file"
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            throw r5     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
        L74:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            java.lang.String r5 = "Must set temp dir before writing this object to a parcel"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
            throw r3     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e java.lang.IllegalStateException -> L96
        L7c:
            r10 = move-exception
            goto Lb6
        L7e:
            r2 = move-exception
            r7 = r4
        L80:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r2)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb4
            if (r7 == 0) goto Lb0
            goto Lad
        L96:
            r1 = move-exception
            r7 = r4
        L98:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb4
            if (r7 == 0) goto Lb0
        Lad:
            zze(r7)
        Lb0:
            r3 = r4
        Lb1:
            r9.zzb = r3
            goto Lbc
        Lb4:
            r10 = move-exception
            r4 = r7
        Lb6:
            if (r4 == 0) goto Lbb
            zze(r4)
        Lbb:
            throw r10
        Lbc:
            r0 = 1
            r11 = r11 | r0
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r10)
            android.os.ParcelFileDescriptor r2 = r9.zzb
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r10, r0, r2, r11, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r10, r1)
            r9.zzb = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzlx.writeToParcel(android.os.Parcel, int):void");
    }
}
