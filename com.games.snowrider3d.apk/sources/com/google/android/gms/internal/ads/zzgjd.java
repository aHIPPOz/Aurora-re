package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgjd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxe zzb;
    private static final zzgod zzd;
    private static final zzgmt zzf;
    private static final zzgoh zzc = zzgoh.zzb(new zzgof() { // from class: com.google.android.gms.internal.ads.zzgiz
        @Override // com.google.android.gms.internal.ads.zzgof
        public final zzgpb zza(zzgfm zzgfmVar) {
            return zzgjd.zzd((zzgiy) zzgfmVar);
        }
    }, zzgiy.class, zzgoy.class);
    private static final zzgmx zze = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgjb
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final zzgpb zza(zzgez zzgezVar, zzgfn zzgfnVar) {
            return zzgjd.zzc((zzgit) zzgezVar, zzgfnVar);
        }
    }, zzgit.class, zzgox.class);

    static {
        zzgxe zzb2 = zzgpj.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzd = zzgod.zzb(new zzgob() { // from class: com.google.android.gms.internal.ads.zzgja
            @Override // com.google.android.gms.internal.ads.zzgob
            public final zzgfm zza(zzgpb zzgpbVar) {
                return zzgjd.zzb((zzgoy) zzgpbVar);
            }
        }, zzb2, zzgoy.class);
        zzf = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgjc
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgez zza(zzgpb zzgpbVar, zzgfn zzgfnVar) {
                return zzgjd.zza((zzgox) zzgpbVar, zzgfnVar);
            }
        }, zzb2, zzgox.class);
    }

    public static /* synthetic */ zzgit zza(zzgox zzgoxVar, zzgfn zzgfnVar) {
        if (!zzgoxVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgvb zzd2 = zzgvb.zzd(zzgoxVar.zze(), zzgyr.zza());
            if (zzd2.zza() != 0) {
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + valueOf);
            }
            return zzgit.zzc(zzf(zzd2.zzf(), zzgoxVar.zzc()), zzgoxVar.zzf());
        } catch (zzgzw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzgiy zzb(zzgoy zzgoyVar) {
        if (!zzgoyVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgoyVar.zzc().zzi())));
        }
        try {
            return zzf(zzgve.zzf(zzgoyVar.zzc().zzh(), zzgyr.zza()), zzgoyVar.zzc().zzg());
        } catch (zzgzw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static /* synthetic */ zzgox zzc(zzgit zzgitVar, zzgfn zzgfnVar) {
        zzguz zzb2 = zzgvb.zzb();
        zzb2.zza(zzg(zzgitVar.zzd()));
        return zzgox.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgvb) zzb2.zzbr()).zzaN(), zzgtz.REMOTE, zzh(zzgitVar.zzd().zzc()), zzgitVar.zze());
    }

    public static /* synthetic */ zzgoy zzd(zzgiy zzgiyVar) {
        zzgud zza2 = zzguf.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgiyVar).zzaN());
        zza2.zza(zzh(zzgiyVar.zzc()));
        return zzgoy.zzb((zzguf) zza2.zzbr());
    }

    public static void zze(zzgny zzgnyVar) throws GeneralSecurityException {
        zzgnyVar.zzi(zzc);
        zzgnyVar.zzh(zzd);
        zzgnyVar.zzg(zze);
        zzgnyVar.zzf(zzf);
    }

    private static zzgiy zzf(zzgve zzgveVar, zzgvf zzgvfVar) throws GeneralSecurityException {
        zzgiv zzgivVar;
        zzgiw zzgiwVar;
        zzgud zza2 = zzguf.zza();
        zza2.zzb(zzgveVar.zza().zzi());
        zza2.zzc(zzgveVar.zza().zzh());
        zza2.zza(zzgvf.RAW);
        zzgfm zza3 = zzgfo.zza(((zzguf) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzghm) {
            zzgivVar = zzgiv.zza;
        } else if (zza3 instanceof zzgid) {
            zzgivVar = zzgiv.zzc;
        } else if (zza3 instanceof zzgka) {
            zzgivVar = zzgiv.zzb;
        } else if (zza3 instanceof zzggr) {
            zzgivVar = zzgiv.zzd;
        } else if (zza3 instanceof zzghb) {
            zzgivVar = zzgiv.zze;
        } else if (zza3 instanceof zzghx) {
            zzgivVar = zzgiv.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzgiu zzgiuVar = new zzgiu(null);
        int ordinal = zzgvfVar.ordinal();
        if (ordinal == 1) {
            zzgiwVar = zzgiw.zza;
        } else if (ordinal == 3) {
            zzgiwVar = zzgiw.zzb;
        } else {
            int zza4 = zzgvfVar.zza();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza4);
        }
        zzgiuVar.zzd(zzgiwVar);
        zzgiuVar.zzc(zzgveVar.zzg());
        zzgiuVar.zza((zzgga) zza3);
        zzgiuVar.zzb(zzgivVar);
        return zzgiuVar.zze();
    }

    private static zzgve zzg(zzgiy zzgiyVar) throws GeneralSecurityException {
        try {
            zzguf zzf2 = zzguf.zzf(zzgfo.zzb(zzgiyVar.zzb()), zzgyr.zza());
            zzgvc zzb2 = zzgve.zzb();
            zzb2.zzb(zzgiyVar.zzd());
            zzb2.zza(zzf2);
            return (zzgve) zzb2.zzbr();
        } catch (zzgzw e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgvf zzh(zzgiw zzgiwVar) throws GeneralSecurityException {
        if (zzgiw.zza.equals(zzgiwVar)) {
            return zzgvf.TINK;
        }
        if (!zzgiw.zzb.equals(zzgiwVar)) {
            throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgiwVar))));
        }
        return zzgvf.RAW;
    }
}
