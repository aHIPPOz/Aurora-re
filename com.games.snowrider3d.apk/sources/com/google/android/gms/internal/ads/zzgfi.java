package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgfi implements zzgmy {
    private final zzgun zza;
    private final List zzb;
    private final zzgnh zzc;

    public zzgfi(zzgun zzgunVar, List list, zzgnh zzgnhVar) throws GeneralSecurityException {
        this.zza = zzgunVar;
        this.zzb = list;
        this.zzc = zzgnhVar;
        if (zzgme.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzgul zzgulVar : zzgunVar.zzh()) {
                if (!hashSet.contains(Integer.valueOf(zzgulVar.zza()))) {
                    hashSet.add(Integer.valueOf(zzgulVar.zza()));
                } else {
                    int zza = zzgulVar.zza();
                    throw new GeneralSecurityException("KeyID " + zza + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzgunVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    public static final zzgfi zzd(zzgun zzgunVar) throws GeneralSecurityException {
        zzj(zzgunVar);
        return new zzgfi(zzgunVar, zzi(zzgunVar), zzgnh.zza);
    }

    public static final zzgfi zze(zzgfm zzgfmVar) throws GeneralSecurityException {
        zzgff zzgffVar = new zzgff();
        zzgfd zzgfdVar = new zzgfd(zzgfmVar, null);
        zzgfdVar.zzd();
        zzgfdVar.zzc();
        zzgffVar.zza(zzgfdVar);
        return zzgffVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzgun zzgunVar) {
        zzj(zzgunVar);
    }

    private static List zzi(zzgun zzgunVar) throws GeneralSecurityException {
        zzgez zzgezVar;
        zzgfb zzgfbVar;
        ArrayList arrayList = new ArrayList(zzgunVar.zza());
        for (zzgul zzgulVar : zzgunVar.zzh()) {
            int zza = zzgulVar.zza();
            try {
                zzgox zza2 = zzgox.zza(zzgulVar.zzb().zzg(), zzgulVar.zzb().zzf(), zzgulVar.zzb().zzb(), zzgulVar.zzf(), zzgulVar.zzf() == zzgvf.RAW ? null : Integer.valueOf(zzgulVar.zza()));
                zzgny zzc = zzgny.zzc();
                zzgfn zza3 = zzgfn.zza();
                if (!zzc.zzj(zza2)) {
                    zzgezVar = new zzgnd(zza2, zza3);
                } else {
                    zzgezVar = zzc.zza(zza2, zza3);
                }
                int zzk = zzgulVar.zzk() - 2;
                boolean z = true;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzgfbVar = zzgfb.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgfbVar = zzgfb.zzb;
                    }
                } else {
                    zzgfbVar = zzgfb.zza;
                }
                if (zza != zzgunVar.zzb()) {
                    z = false;
                }
                arrayList.add(new zzgfg(zzgezVar, zzgfbVar, zza, z, null));
            } catch (GeneralSecurityException e) {
                if (!zzgme.zza.zza()) {
                    arrayList.add(null);
                } else {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzj(zzgun zzgunVar) throws GeneralSecurityException {
        if (zzgunVar == null || zzgunVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzgfp.zza;
        zzguo zza = zzgus.zza();
        zzgun zzgunVar = this.zza;
        zza.zzb(zzgunVar.zzb());
        for (zzgul zzgulVar : zzgunVar.zzh()) {
            zzgup zza2 = zzguq.zza();
            zza2.zzc(zzgulVar.zzb().zzg());
            zza2.zzd(zzgulVar.zzk());
            zza2.zzb(zzgulVar.zzf());
            zza2.zza(zzgulVar.zza());
            zza.zza((zzguq) zza2.zzbr());
        }
        return ((zzgus) zza.zzbr()).toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgmy
    public final int zza() {
        return this.zzb.size();
    }

    public final zzgfg zzb(int i) {
        if (i < 0 || i >= zza()) {
            int zza = zza();
            throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + zza);
        }
        List list = this.zzb;
        if (list.get(i) == null) {
            throw new IllegalStateException("Keyset-Entry at position " + i + " has wrong status or key parsing failed");
        }
        return (zzgfg) list.get(i);
    }

    public final zzgfg zzc() {
        for (zzgfg zzgfgVar : this.zzb) {
            if (zzgfgVar != null && zzgfgVar.zzd()) {
                if (zzgfgVar.zzc() != zzgfb.zza) {
                    throw new IllegalStateException("Keyset has primary which isn't enabled");
                }
                return zzgfgVar;
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzgun zzf() {
        return this.zza;
    }

    public final Object zzg(zzgex zzgexVar, Class cls) throws GeneralSecurityException {
        if (!(zzgexVar instanceof zzgmo)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzgmo zzgmoVar = (zzgmo) zzgexVar;
        zzgun zzgunVar = this.zza;
        int i = zzgfp.zza;
        int zzb = zzgunVar.zzb();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzgul zzgulVar : zzgunVar.zzh()) {
            if (zzgulVar.zzk() == 3) {
                if (zzgulVar.zzj()) {
                    if (zzgulVar.zzf() != zzgvf.UNKNOWN_PREFIX) {
                        if (zzgulVar.zzk() != 2) {
                            if (zzgulVar.zza() == zzb) {
                                if (z2) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z2 = true;
                            }
                            z &= zzgulVar.zzb().zzb() == zzgtz.ASYMMETRIC_PUBLIC;
                            i2++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgulVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgulVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgulVar.zza())));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (z2 || z) {
            for (int i3 = 0; i3 < zza(); i3++) {
                if (this.zzb.get(i3) == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzgunVar.zzd(i3).zzb().zzg() + " failed, unable to get primitive");
                }
            }
            return zzgmoVar.zza(this, this.zzc, cls);
        }
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
    }
}
