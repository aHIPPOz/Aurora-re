package com.google.android.gms.internal.games_v2;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzie extends zzhg {
    static final zzhg zza = new zzie(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzie(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    public static zzie zzf(int i, Object[] objArr, zzhf zzhfVar) {
        int i2;
        char c;
        int i3;
        short[] sArr;
        byte[] bArr;
        char c2;
        int i4 = i;
        Object[] objArr2 = objArr;
        if (i4 == 0) {
            return (zzie) zza;
        }
        Object obj = null;
        char c3 = 0;
        int i5 = 1;
        if (i4 == 1) {
            zzgn.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            return new zzie(null, objArr2, 1);
        }
        zzfu.zzc(i4, objArr2.length >> 1, "index");
        int zzf = zzhk.zzf(i4);
        if (i4 == 1) {
            zzgn.zza(Objects.requireNonNull(objArr2[0]), Objects.requireNonNull(objArr2[1]));
            c = 0;
            i4 = 1;
            i2 = 1;
        } else {
            int i6 = zzf - 1;
            if (zzf <= 128) {
                byte[] bArr2 = new byte[zzf];
                Arrays.fill(bArr2, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object requireNonNull = Objects.requireNonNull(objArr2[i10]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr2[i10 ^ 1]);
                    zzgn.zza(requireNonNull, requireNonNull2);
                    int zza2 = zzgv.zza(requireNonNull.hashCode());
                    while (true) {
                        int i11 = zza2 & i6;
                        c2 = c3;
                        int i12 = bArr2[i11] & 255;
                        if (i12 != 255) {
                            if (requireNonNull.equals(objArr2[i12])) {
                                int i13 = i12 ^ 1;
                                zzhe zzheVar = new zzhe(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr2[i13]));
                                objArr2[i13] = requireNonNull2;
                                obj = zzheVar;
                                break;
                            }
                            zza2 = i11 + 1;
                            c3 = c2;
                        } else {
                            bArr2[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArr2[i9] = requireNonNull;
                                objArr2[i9 ^ 1] = requireNonNull2;
                            }
                            i8++;
                        }
                    }
                    i7++;
                    c3 = c2;
                }
                c = c3;
                bArr = bArr2;
                if (i8 != i4) {
                    sArr = new Object[3];
                    sArr[c] = bArr2;
                    sArr[1] = Integer.valueOf(i8);
                    sArr[2] = obj;
                    obj = sArr;
                    i2 = 1;
                }
                i2 = 1;
                obj = bArr;
            } else {
                c = 0;
                if (zzf <= 32768) {
                    sArr = new short[zzf];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object requireNonNull3 = Objects.requireNonNull(objArr2[i17]);
                        Object requireNonNull4 = Objects.requireNonNull(objArr2[i17 ^ 1]);
                        zzgn.zza(requireNonNull3, requireNonNull4);
                        int zza3 = zzgv.zza(requireNonNull3.hashCode());
                        while (true) {
                            int i18 = zza3 & i6;
                            char c4 = (char) sArr[i18];
                            if (c4 != 65535) {
                                if (requireNonNull3.equals(objArr2[c4])) {
                                    int i19 = c4 ^ 1;
                                    zzhe zzheVar2 = new zzhe(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr2[i19]));
                                    objArr2[i19] = requireNonNull4;
                                    obj = zzheVar2;
                                    break;
                                }
                                zza3 = i18 + 1;
                            } else {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArr2[i16] = requireNonNull3;
                                    objArr2[i16 ^ 1] = requireNonNull4;
                                }
                                i14++;
                            }
                        }
                    }
                    if (i14 != i4) {
                        bArr = new Object[]{sArr, Integer.valueOf(i14), obj};
                        i2 = 1;
                        obj = bArr;
                    }
                    obj = sArr;
                    i2 = 1;
                } else {
                    int[] iArr = new int[zzf];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object requireNonNull5 = Objects.requireNonNull(objArr2[i23]);
                        Object requireNonNull6 = Objects.requireNonNull(objArr2[i23 ^ i5]);
                        zzgn.zza(requireNonNull5, requireNonNull6);
                        int zza4 = zzgv.zza(requireNonNull5.hashCode());
                        while (true) {
                            int i24 = zza4 & i6;
                            int i25 = iArr[i24];
                            if (i25 != -1) {
                                i3 = i5;
                                if (requireNonNull5.equals(objArr2[i25])) {
                                    int i26 = i25 ^ 1;
                                    zzhe zzheVar3 = new zzhe(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr2[i26]));
                                    objArr2[i26] = requireNonNull6;
                                    obj = zzheVar3;
                                    break;
                                }
                                zza4 = i24 + 1;
                                i5 = i3;
                            } else {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArr2[i22] = requireNonNull5;
                                    objArr2[i22 ^ 1] = requireNonNull6;
                                }
                                i21++;
                                i3 = i5;
                            }
                        }
                        i20++;
                        i5 = i3;
                    }
                    i2 = i5;
                    if (i21 == i4) {
                        obj = iArr;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[i2] = Integer.valueOf(i21);
                        objArr3[2] = obj;
                        obj = objArr3;
                    }
                }
            }
        }
        boolean z = obj instanceof Object[];
        Object obj2 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            zzhfVar.zzc = (zzhe) objArr4[2];
            Object obj3 = objArr4[c];
            int intValue = ((Integer) objArr4[i2]).intValue();
            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
            obj2 = obj3;
            i4 = intValue;
        }
        return new zzie(obj2, objArr2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.games_v2.zzhg, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9e
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L22
            r1 = 0
            r1 = r2[r1]
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.lang.Object r10 = java.util.Objects.requireNonNull(r10)
            goto L9e
        L22:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L27
            goto L3
        L27:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L53
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.games_v2.zzgv.zza(r1)
        L3a:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L43
            goto L3
        L43:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L50
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9e
        L50:
            int r1 = r1 + 1
            goto L3a
        L53:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7f
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.games_v2.zzgv.zza(r1)
        L65:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6f
            goto L3
        L6f:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7c
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9e
        L7c:
            int r1 = r1 + 1
            goto L65
        L7f:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.games_v2.zzgv.zza(r6)
        L8b:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L92
            goto L3
        L92:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La2
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9e:
            if (r10 != 0) goto La1
            return r0
        La1:
            return r10
        La2:
            int r6 = r6 + 1
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.games_v2.zzie.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhg
    final zzhk zzb() {
        return new zzib(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhg
    final zzhk zzc() {
        return new zzic(this, new zzid(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.games_v2.zzhg
    final zzgy zze() {
        return new zzid(this.zzb, 1, this.zzd);
    }
}
