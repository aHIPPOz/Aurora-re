package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgkr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgod zzd;
    private static final zzgmt zzf;
    private static final zzgoh zzc = zzgoh.zzb(new zzgof() { // from class: com.google.android.gms.internal.ads.zzgkn
        @Override // com.google.android.gms.internal.ads.zzgof
        public final zzgpb zza(zzgfm zzgfmVar) {
            return zzgkr.zzd((zzghm) zzgfmVar);
        }
    }, zzghm.class, zzgoy.class);
    private static final zzgmx zze = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgkp
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final zzgpb zza(zzgez zzgezVar, zzgfn zzgfnVar) {
            return zzgkr.zzc((zzghe) zzgezVar, zzgfnVar);
        }
    }, zzghe.class, zzgox.class);

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgob() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzgob
            public final zzgfm zza(zzgpb zzgpbVar) {
                return zzgkr.zzb((zzgoy) zzgpbVar);
            }
        }, zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgez zza(zzgpb zzgpbVar, zzgfn zzgfnVar) {
                return zzgkr.zza((zzgox) zzgpbVar, zzgfnVar);
            }
        }, zzb2, zzgox.class);
    }

    public static /* synthetic */ zzghe zza(zzgox zzgoxVar, zzgfn zzgfnVar) {
        if (!zzgoxVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgsy zzd2 = zzgsy.zzd(zzgoxVar.zze(), zzgyr.zza());
            if (zzd2.zza() == 0) {
                zzghj zzc2 = zzghm.zzc();
                zzc2.zzb(zzd2.zzf().zzd());
                zzc2.zza(12);
                zzc2.zzc(16);
                zzc2.zzd(zzf(zzgoxVar.zzc()));
                zzghm zze2 = zzc2.zze();
                zzghc zzc3 = zzghe.zzc();
                zzc3.zzc(zze2);
                zzc3.zzb(zzgxf.zzb(zzd2.zzf().zzA(), zzgfnVar));
                zzc3.zza(zzgoxVar.zzf());
                return zzc3.zzd();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgzw unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzghm zzb(zzgoy zzgoyVar) {
        if (!zzgoyVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoyVar.zzc().zzi())));
        }
        try {
            zzgtb zzf2 = zzgtb.zzf(zzgoyVar.zzc().zzh(), zzgyr.zza());
            if (zzf2.zzb() == 0) {
                zzghj zzc2 = zzghm.zzc();
                zzc2.zzb(zzf2.zza());
                zzc2.zza(12);
                zzc2.zzc(16);
                zzc2.zzd(zzf(zzgoyVar.zzc().zzg()));
                return zzc2.zze();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgzw e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgox zzc(zzghe zzgheVar, zzgfn zzgfnVar) {
        zzgsw zzb2 = zzgsy.zzb();
        byte[] zzd2 = zzgheVar.zze().zzd(zzgfnVar);
        zzb2.zza(zzgxz.zzv(zzd2, 0, zzd2.length));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgsy) zzb2.zzbr()).zzaN(), zzgtz.SYMMETRIC, zzg(zzgheVar.zzd().zzd()), zzgheVar.zzf());
    }

    public static /* synthetic */ zzgoy zzd(zzghm zzghmVar) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgsz zzc2 = zzgtb.zzc();
        zzc2.zza(zzghmVar.zzb());
        zza2.zzc(((zzgtb) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzghmVar.zzd()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgnyVar) throws GeneralSecurityException {
        zzgnyVar.zzi(zzc);
        zzgnyVar.zzh(zzd);
        zzgnyVar.zzg(zze);
        zzgnyVar.zzf(zzf);
    }

    private static zzghk zzf(zzgvf zzgvfVar) throws GeneralSecurityException {
        int ordinal = zzgvfVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return zzghk.zzc;
                }
                if (ordinal != 4) {
                    int zza2 = zzgvfVar.zza();
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
                }
            }
            return zzghk.zzb;
        }
        return zzghk.zza;
    }

    private static zzgvf zzg(zzghk zzghkVar) throws GeneralSecurityException {
        if (zzghk.zza.equals(zzghkVar)) {
            return zzgvf.TINK;
        }
        if (zzghk.zzb.equals(zzghkVar)) {
            return zzgvf.CRUNCHY;
        }
        if (!zzghk.zzc.equals(zzghkVar)) {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghkVar))));
        }
        return zzgvf.RAW;
    }
}
