package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgff {
    private final List zza = new ArrayList();
    private final zzgnh zzb = zzgnh.zza;
    private boolean zzc = false;

    public final void zzd() {
        for (zzgfd zzgfdVar : this.zza) {
            zzgfdVar.zza = false;
        }
    }

    public final zzgff zza(zzgfd zzgfdVar) {
        zzgff zzgffVar;
        boolean z;
        zzgffVar = zzgfdVar.zzf;
        if (zzgffVar != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        z = zzgfdVar.zza;
        if (z) {
            zzd();
        }
        zzgfdVar.zzf = this;
        this.zza.add(zzgfdVar);
        return this;
    }

    public final zzgfi zzb() throws GeneralSecurityException {
        zzgfe zzgfeVar;
        zzgfe zzgfeVar2;
        zzgfe zzgfeVar3;
        int i;
        zzgfm zzgfmVar;
        zzgfm zzgfmVar2;
        zzgfb zzgfbVar;
        boolean z;
        zzgfb zzgfbVar2;
        int i2;
        boolean z2;
        zzgfb zzgfbVar3;
        zzgfe zzgfeVar4;
        zzgfe zzgfeVar5;
        zzgfe zzgfeVar6;
        zzgfe zzgfeVar7;
        zzgfb unused;
        zzgfe unused2;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List<zzgfd> list = this.zza;
        zzguj zzc = zzgun.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        int i3 = 0;
        int i4 = 0;
        while (i4 < list.size() - 1) {
            int i5 = i4 + 1;
            zzgfeVar4 = ((zzgfd) list.get(i4)).zze;
            zzgfeVar5 = zzgfe.zza;
            if (zzgfeVar4 == zzgfeVar5) {
                zzgfeVar6 = ((zzgfd) list.get(i5)).zze;
                zzgfeVar7 = zzgfe.zza;
                if (zzgfeVar6 != zzgfeVar7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i4 = i5;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzgfd zzgfdVar : list) {
            unused = zzgfdVar.zzb;
            zzgfeVar = zzgfdVar.zze;
            if (zzgfeVar != null) {
                zzgfeVar2 = zzgfdVar.zze;
                zzgfeVar3 = zzgfe.zza;
                if (zzgfeVar2 == zzgfeVar3) {
                    int i6 = i3;
                    while (true) {
                        if (i6 != 0 && !hashSet.contains(Integer.valueOf(i6))) {
                            break;
                        }
                        int i7 = zzgpj.zza;
                        i6 = i3;
                        while (i6 == 0) {
                            byte[] zzb = zzgpa.zzb(4);
                            i6 = (zzb[3] & 255) | ((zzb[i3] & 255) << 24) | ((zzb[c] & 255) << 16) | ((zzb[2] & 255) << 8);
                        }
                    }
                    i = i6;
                } else {
                    unused2 = zzgfdVar.zze;
                    i = i3;
                }
                Integer valueOf = Integer.valueOf(i);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    zzgez unused3 = zzgfdVar.zzc;
                    zzgfmVar = zzgfdVar.zzd;
                    Integer num2 = c != zzgfmVar.zza() ? null : valueOf;
                    zzgno zzb2 = zzgno.zzb();
                    zzgfmVar2 = zzgfdVar.zzd;
                    zzgez zza = zzb2.zza(zzgfmVar2, num2);
                    zzgfbVar = zzgfdVar.zzb;
                    z = zzgfdVar.zza;
                    zzgfg zzgfgVar = new zzgfg(zza, zzgfbVar, i, z, null);
                    int i8 = i;
                    zzgfbVar2 = zzgfdVar.zzb;
                    zzgox zzgoxVar = (zzgox) zzgny.zzc().zzd(zza, zzgox.class, zzgfn.zza());
                    Integer zzf = zzgoxVar.zzf();
                    if (zzf == null || zzf.intValue() == i8) {
                        zzgfb zzgfbVar4 = zzgfb.zza;
                        if (zzgfbVar4.equals(zzgfbVar2)) {
                            i2 = 3;
                        } else if (zzgfb.zzb.equals(zzgfbVar2)) {
                            i2 = 4;
                        } else if (!zzgfb.zzc.equals(zzgfbVar2)) {
                            throw new IllegalStateException("Unknown key status");
                        } else {
                            i2 = 5;
                        }
                        zzguk zzc2 = zzgul.zzc();
                        zzgty zza2 = zzgub.zza();
                        zza2.zzb(zzgoxVar.zzg());
                        zza2.zzc(zzgoxVar.zze());
                        zza2.zza(zzgoxVar.zzb());
                        zzc2.zza(zza2);
                        zzc2.zzd(i2);
                        zzc2.zzb(i8);
                        zzc2.zzc(zzgoxVar.zzc());
                        zzc.zza((zzgul) zzc2.zzbr());
                        z2 = zzgfdVar.zza;
                        if (z2) {
                            if (num == null) {
                                zzgfbVar3 = zzgfdVar.zzb;
                                if (zzgfbVar3 != zzgfbVar4) {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                                num = valueOf;
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzgfgVar);
                        c = 1;
                        i3 = 0;
                    } else {
                        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                    }
                } else {
                    throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
                }
            } else {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzc.zzb(num.intValue());
        zzgun zzgunVar = (zzgun) zzc.zzbr();
        zzgfi.zzj(zzgunVar);
        return new zzgfi(zzgunVar, arrayList, this.zzb);
    }
}
