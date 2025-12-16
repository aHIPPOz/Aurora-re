package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzmw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmw> CREATOR = new zzmx();
    private zzkj zza;
    private String zzb;
    private long zzc;
    private DiscoveryOptions zzd;
    private zzkc zze;
    private zzjz zzf;

    private zzmw() {
    }

    public static /* bridge */ /* synthetic */ void zza(zzmw zzmwVar, zzkc zzkcVar) {
        zzmwVar.zze = zzkcVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzmw zzmwVar, long j) {
        zzmwVar.zzc = j;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzmw zzmwVar, DiscoveryOptions discoveryOptions) {
        zzmwVar.zzd = discoveryOptions;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzmw zzmwVar, zzkj zzkjVar) {
        zzmwVar.zza = zzkjVar;
    }

    public static /* bridge */ /* synthetic */ void zze(zzmw zzmwVar, String str) {
        zzmwVar.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmw) {
            zzmw zzmwVar = (zzmw) obj;
            if (Objects.equal(this.zza, zzmwVar.zza) && Objects.equal(this.zzf, zzmwVar.zzf) && Objects.equal(this.zzb, zzmwVar.zzb) && Objects.equal(Long.valueOf(this.zzc), Long.valueOf(zzmwVar.zzc)) && Objects.equal(this.zzd, zzmwVar.zzd) && Objects.equal(this.zze, zzmwVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzf, this.zzb, Long.valueOf(this.zzc), this.zzd, this.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkj zzkjVar = this.zza;
        IBinder iBinder = null;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkjVar == null ? null : zzkjVar.asBinder(), false);
        zzjz zzjzVar = this.zzf;
        SafeParcelWriter.writeIBinder(parcel, 2, zzjzVar == null ? null : zzjzVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        zzkc zzkcVar = this.zze;
        if (zzkcVar != null) {
            iBinder = zzkcVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzmw(IBinder iBinder, IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions, IBinder iBinder3) {
        zzkj zzkjVar;
        zzjz zzjzVar;
        zzkc zzkcVar = null;
        if (iBinder == null) {
            zzkjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkjVar = queryLocalInterface instanceof zzkj ? (zzkj) queryLocalInterface : new zzkh(iBinder);
        }
        if (iBinder2 == null) {
            zzjzVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            zzjzVar = queryLocalInterface2 instanceof zzjz ? (zzjz) queryLocalInterface2 : new zzjz(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            zzkcVar = queryLocalInterface3 instanceof zzkc ? (zzkc) queryLocalInterface3 : new zzka(iBinder3);
        }
        this.zza = zzkjVar;
        this.zzf = zzjzVar;
        this.zzb = str;
        this.zzc = j;
        this.zzd = discoveryOptions;
        this.zze = zzkcVar;
    }

    public /* synthetic */ zzmw(zzmv zzmvVar) {
    }
}
