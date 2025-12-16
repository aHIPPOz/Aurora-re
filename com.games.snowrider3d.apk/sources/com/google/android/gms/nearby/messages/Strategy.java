package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public class Strategy extends AbstractSafeParcelable {
    @Deprecated
    public static final Strategy BLE_ONLY;
    public static final Parcelable.Creator<Strategy> CREATOR = new zzf();
    public static final Strategy DEFAULT = new Builder().build();
    public static final int DISCOVERY_MODE_BROADCAST = 1;
    public static final int DISCOVERY_MODE_DEFAULT = 3;
    public static final int DISCOVERY_MODE_SCAN = 2;
    public static final int DISTANCE_TYPE_DEFAULT = 0;
    public static final int DISTANCE_TYPE_EARSHOT = 1;
    public static final int TTL_SECONDS_DEFAULT = 300;
    public static final int TTL_SECONDS_INFINITE = Integer.MAX_VALUE;
    public static final int TTL_SECONDS_MAX = 86400;
    @Deprecated
    public static final Strategy zza;
    final int zzb;
    @Deprecated
    final int zzc;
    final int zzd;
    final int zze;
    @Deprecated
    final boolean zzf;
    final int zzg;
    final int zzh;
    private final int zzi;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private int zza = 3;
        private int zzb = Strategy.TTL_SECONDS_DEFAULT;
        private int zzc = 0;
        private int zzd = -1;

        public Builder setDiscoveryMode(int i) {
            this.zza = i;
            return this;
        }

        public Builder setDistanceType(int i) {
            this.zzc = i;
            return this;
        }

        public Builder setTtlSeconds(int i) {
            boolean z = true;
            if (i != Integer.MAX_VALUE && (i <= 0 || i > 86400)) {
                z = false;
            }
            Preconditions.checkArgument(z, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), Integer.valueOf((int) Strategy.TTL_SECONDS_MAX));
            this.zzb = i;
            return this;
        }

        public final Builder zza(int i) {
            this.zzd = 2;
            return this;
        }

        public Strategy build() {
            if (this.zzd == 2 && this.zzc == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new Strategy(2, 0, this.zzb, this.zzc, false, this.zzd, this.zza, 0);
        }
    }

    static {
        Builder builder = new Builder();
        builder.zza(2);
        builder.setTtlSeconds(Integer.MAX_VALUE);
        Strategy build = builder.build();
        BLE_ONLY = build;
        zza = build;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Strategy(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            r1.zzc = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto Le
        Lb:
            r1.zzh = r8
            goto L19
        Le:
            if (r3 == r0) goto L17
            r8 = 3
            if (r3 == r8) goto L14
            goto Lb
        L14:
            r1.zzh = r0
            goto L19
        L17:
            r1.zzh = r2
        L19:
            r1.zze = r5
            r1.zzf = r6
            if (r6 == 0) goto L27
            r1.zzg = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.zzd = r2
            goto L38
        L27:
            r1.zzd = r4
            r3 = -1
            if (r7 == r3) goto L36
            if (r7 == 0) goto L36
            if (r7 == r2) goto L36
            r2 = 6
            if (r7 == r2) goto L36
            r1.zzg = r7
            goto L38
        L36:
            r1.zzg = r3
        L38:
            r1.zzi = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.zzb == strategy.zzb && this.zzh == strategy.zzh && this.zzd == strategy.zzd && this.zze == strategy.zze && this.zzg == strategy.zzg && this.zzi == strategy.zzi;
    }

    public int hashCode() {
        return (((((((((this.zzb * 31) + this.zzh) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzg) * 31) + this.zzi;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        int i = this.zzd;
        int i2 = this.zze;
        String str4 = "DEFAULT";
        if (i2 == 0) {
            str = str4;
        } else if (i2 != 1) {
            str = "UNKNOWN:" + i2;
        } else {
            str = "EARSHOT";
        }
        int i3 = this.zzg;
        if (i3 == -1) {
            str2 = str4;
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i3 & 2) > 0) {
                arrayList.add("BLE");
            }
            if (arrayList.isEmpty()) {
                str2 = "UNKNOWN:" + i3;
            } else {
                str2 = arrayList.toString();
            }
        }
        int i4 = this.zzh;
        if (i4 == 3) {
            str3 = str4;
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i4 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i4 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            if (arrayList2.isEmpty()) {
                str3 = "UNKNOWN:" + i4;
            } else {
                str3 = arrayList2.toString();
            }
        }
        int i5 = this.zzi;
        if (i5 != 0) {
            if (i5 != 1) {
                str4 = "UNKNOWN: " + i5;
            } else {
                str4 = "ALWAYS_ON";
            }
        }
        return "Strategy{ttlSeconds=" + i + ", distanceType=" + str + ", discoveryMedium=" + str2 + ", discoveryMode=" + str3 + ", backgroundScanMode=" + str4 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzc);
        SafeParcelWriter.writeInt(parcel, 2, this.zzd);
        SafeParcelWriter.writeInt(parcel, 3, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzf);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeInt(parcel, 6, this.zzh);
        SafeParcelWriter.writeInt(parcel, 7, this.zzi);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzi;
    }
}
