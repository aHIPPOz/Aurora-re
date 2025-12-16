package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzggf implements zzgow {
    private static final zzggf zza = new zzggf();
    private static final zzgoq zzb = zzgoq.zzb(new zzgoo() { // from class: com.google.android.gms.internal.ads.zzggb
        @Override // com.google.android.gms.internal.ads.zzgoo
        public final Object zza(zzgez zzgezVar) {
            return zzglm.zzb((zzgnd) zzgezVar);
        }
    }, zzgnd.class, zzget.class);

    zzggf() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzgnv.zza().zzd(zza);
        zzgnv.zza().zzc(zzb);
    }

    public static void zzd(zzgos zzgosVar) throws GeneralSecurityException {
        zzgosVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Class zza() {
        return zzget.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Class zzb() {
        return zzget.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final /* bridge */ /* synthetic */ Object zze(zzgmy zzgmyVar, zzgnh zzgnhVar, zzgor zzgorVar) throws GeneralSecurityException {
        zzgni zzgniVar;
        zzgni zzgniVar2;
        zzgxe zzgxeVar;
        zzgoj zzgojVar = new zzgoj();
        for (int i = 0; i < zzgmyVar.zza(); i++) {
            zzgfg zzb2 = ((zzgfi) zzgmyVar).zzb(i);
            if (zzb2.zzc().equals(zzgfb.zza)) {
                zzgez zzb3 = zzb2.zzb();
                if (zzb3 instanceof zzgfz) {
                    zzgxeVar = ((zzgfz) zzb3).zzb();
                } else if (zzb3 instanceof zzgnd) {
                    zzgxeVar = ((zzgnd) zzb3).zzc();
                } else {
                    String name = zzb3.getClass().getName();
                    String valueOf = String.valueOf(zzb3.zza());
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + name + " with parameters " + valueOf);
                }
                zzgojVar.zza(zzgxeVar, new zzggc((zzget) zzgorVar.zza(zzb2), zzb2.zza()));
            }
        }
        if (zzgnhVar.zza()) {
            zzgniVar2 = zzgnl.zza;
            zzgniVar = zzgniVar2;
        } else {
            zzgnj zza2 = zzgnt.zzb().zza();
            zzgni zza3 = zza2.zza(zzgmyVar, zzgnhVar, "aead", "encrypt");
            zzgniVar = zza2.zza(zzgmyVar, zzgnhVar, "aead", "decrypt");
            zzgniVar2 = zza3;
        }
        zzgfi zzgfiVar = (zzgfi) zzgmyVar;
        return new zzggd(new zzggc((zzget) zzgorVar.zza(zzgfiVar.zzc()), zzgfiVar.zzc().zza()), zzgojVar.zzb(), zzgniVar2, zzgniVar, null);
    }
}
