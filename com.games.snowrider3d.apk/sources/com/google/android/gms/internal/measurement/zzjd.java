package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzjd extends zzjf {
    private final byte[] zzb;
    private int zzd;
    private int zze = Integer.MAX_VALUE;
    private int zzc = 0;

    public /* synthetic */ zzjd(byte[] bArr, int i, int i2, boolean z, zzjc zzjcVar) {
        super(null);
        this.zzb = bArr;
    }

    public final int zza(int i) throws zzkm {
        int i2 = this.zze;
        this.zze = 0;
        int i3 = this.zzc + this.zzd;
        this.zzc = i3;
        if (i3 <= 0) {
            this.zzd = 0;
            return i2;
        }
        this.zzd = i3;
        this.zzc = 0;
        return i2;
    }
}
