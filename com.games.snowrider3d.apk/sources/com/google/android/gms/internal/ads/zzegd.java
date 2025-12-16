package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzegd implements zzeds {
    private final Context zza;
    private final zzdhb zzb;
    private final Executor zzc;

    public zzegd(Context context, zzdhb zzdhbVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhbVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcn zzfcnVar, int i) {
        return zzfcnVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeds
    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcnVar, zzfca zzfcaVar, zzedp zzedpVar) throws zzfdd, zzehf {
        zzdit zzditVar;
        zzfdu zzfduVar = (zzfdu) zzedpVar.zzb;
        zzbqb zzD = zzfduVar.zzD();
        zzbqc zzE = zzfduVar.zzE();
        zzbqf zzd = zzfduVar.zzd();
        if (zzd == null || !zzc(zzfcnVar, 6)) {
            if (zzD == null || !zzc(zzfcnVar, 6)) {
                if (zzD == null || !zzc(zzfcnVar, 2)) {
                    if (zzE == null || !zzc(zzfcnVar, 6)) {
                        if (zzE == null || !zzc(zzfcnVar, 1)) {
                            throw new zzehf(1, "No native ad mappers");
                        }
                        zzditVar = zzdit.zzah(zzE);
                    } else {
                        zzditVar = zzdit.zzaj(zzE);
                    }
                } else {
                    zzditVar = zzdit.zzag(zzD);
                }
            } else {
                zzditVar = zzdit.zzai(zzD);
            }
        } else {
            zzditVar = zzdit.zzt(zzd);
        }
        if (zzditVar != null) {
            zzfcw zzfcwVar = zzfcnVar.zza.zza;
            if (zzfcwVar.zzg.contains(Integer.toString(zzditVar.zzc()))) {
                zzdiv zze = this.zzb.zze(new zzcrq(zzfcnVar, zzfcaVar, zzedpVar.zza), new zzdjf(zzditVar), new zzdky(zzE, zzD, zzd));
                ((zzefd) zzedpVar.zzc).zzc(zze.zzk());
                zze.zzd().zzo(new zzcmg(zzfduVar), this.zzc);
                return zze.zza();
            }
        }
        throw new zzehf(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzeds
    public final void zzb(zzfcn zzfcnVar, zzfca zzfcaVar, zzedp zzedpVar) throws zzfdd {
        zzfdu zzfduVar = (zzfdu) zzedpVar.zzb;
        zzfcw zzfcwVar = zzfcnVar.zza.zza;
        String jSONObject = zzfcaVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfcaVar.zzs);
        zzbge zzbgeVar = zzfcwVar.zzi;
        ArrayList arrayList = zzfcwVar.zzg;
        zzfduVar.zzp(this.zza, zzfcwVar.zzd, jSONObject, zzm, (zzbpw) zzedpVar.zzc, zzbgeVar, arrayList);
    }
}
