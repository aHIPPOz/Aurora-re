package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.common.net.HttpHeaders;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbsl extends zzbsu {
    private final Map zza;
    private final Context zzb;
    private final String zzc = zze("description");
    private final String zzf = zze("summary");
    private final long zzd = zzd("start_ticks");
    private final long zze = zzd("end_ticks");
    private final String zzg = zze("location");

    public zzbsl(zzcfg zzcfgVar, Map map) {
        super(zzcfgVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcfgVar.zzi();
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : (String) map.get(str);
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        if (!new zzbcm(context).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(context);
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        zzL.setTitle(zze != null ? zze.getString(R.string.s5) : "Create calendar event");
        zzL.setMessage(zze != null ? zze.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzL.setPositiveButton(zze != null ? zze.getString(R.string.s3) : HttpHeaders.ACCEPT, new zzbsj(this));
        zzL.setNegativeButton(zze != null ? zze.getString(R.string.s4) : "Decline", new zzbsk(this));
        zzL.create().show();
    }
}
