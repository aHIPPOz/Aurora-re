package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzecl extends zzbti {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsj zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzeca zze;
    private String zzf;
    private String zzg;

    public zzecl(Context context, zzeca zzecaVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdsj zzdsjVar) {
        this.zzb = context;
        this.zzc = zzdsjVar;
        this.zzd = zzuVar;
        this.zze = zzecaVar;
    }

    public static /* synthetic */ void zzc(zzecl zzeclVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        zzeclVar.zze.zzc(zzeclVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeclVar.zzw(zzeclVar.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzd(zzecl zzeclVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        zzeclVar.zze.zzc(zzeclVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeclVar.zzw(zzeclVar.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzk(zzecl zzeclVar, Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzeclVar.zzw(zzeclVar.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzv.zzs().zzf(activity));
        zzeclVar.zzx();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzl(zzecl zzeclVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        zzeclVar.zze.zzc(zzeclVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeclVar.zzw(zzeclVar.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static /* synthetic */ void zzm(zzecl zzeclVar, Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzeclVar.zzw(zzeclVar.zzf, "dialog_click", hashMap);
        zzeclVar.zzy(activity, zzmVar);
    }

    public static /* synthetic */ void zzn(zzecl zzeclVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        zzeclVar.zze.zzc(zzeclVar.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeclVar.zzw(zzeclVar.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public static void zzo(Context context, zzdsj zzdsjVar, zzeca zzecaVar, String str, String str2) {
        zzp(context, zzdsjVar, zzecaVar, str, str2, new HashMap());
    }

    public static void zzp(Context context, zzdsj zzdsjVar, zzeca zzecaVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzv.zzp().zzA(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdsjVar != null) {
            zzdsi zza = zzdsjVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str4);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zze();
        } else {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzecaVar.zzd(new zzecc(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            ClipData clipData = zzfsk.zza;
            return zzfsk.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfsk.zza(context, 0, intent, 201326592);
    }

    private final AlertDialog zzs(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzr();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzL(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser zzt = zzt(R.layout.offline_ads_dialog);
        if (zzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawable = null;
            View inflate = activity.getLayoutInflater().inflate(zzt, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzu = zzu();
            if (!TextUtils.isEmpty(zzu)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzu);
            }
            zzebs zzebsVar = (zzebs) this.zza.get(this.zzf);
            if (zzebsVar != null) {
                drawable = zzebsVar.zza();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i) {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze == null) {
            return null;
        }
        try {
            return zze.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzebs zzebsVar = (zzebs) this.zza.get(this.zzf);
        return zzebsVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzebsVar.zzb();
    }

    private static String zzv(int i, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (zze != null) {
            try {
                return zze.getString(i);
            } catch (Resources.NotFoundException unused) {
                return str;
            }
        }
        return str;
    }

    private final void zzw(String str, String str2, Map map) {
        zzp(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzx() {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch: android.os.RemoteException -> L3e
            android.content.Context r0 = r7.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.ads.internal.util.zzbr r1 = com.google.android.gms.ads.internal.util.zzs.zzA(r0)     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.ads.internal.offline.buffering.zza r3 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r7.zzg     // Catch: android.os.RemoteException -> L3e
            java.lang.String r5 = r7.zzf     // Catch: android.os.RemoteException -> L3e
            java.util.Map r6 = r7.zza     // Catch: android.os.RemoteException -> L3e
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.internal.ads.zzebs r6 = (com.google.android.gms.internal.ads.zzebs) r6     // Catch: android.os.RemoteException -> L3e
            if (r6 != 0) goto L20
            java.lang.String r6 = ""
            goto L24
        L20:
            java.lang.String r6 = r6.zzc()     // Catch: android.os.RemoteException -> L3e
        L24:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L3e
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L3e
            if (r2 != 0) goto L3c
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L3a
            java.lang.String r3 = r7.zzg     // Catch: android.os.RemoteException -> L3a
            java.lang.String r4 = r7.zzf     // Catch: android.os.RemoteException -> L3a
            boolean r0 = r1.zzf(r0, r3, r4)     // Catch: android.os.RemoteException -> L3a
            goto L48
        L3a:
            r0 = move-exception
            goto L40
        L3c:
            r0 = 1
            goto L48
        L3e:
            r0 = move-exception
            r2 = 0
        L40:
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r0)
            r0 = r2
        L48:
            if (r0 != 0) goto L5c
            com.google.android.gms.internal.ads.zzeca r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzc(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfyt r2 = com.google.android.gms.internal.ads.zzfyt.zzd()
            r7.zzw(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecl.zzx():void");
    }

    private final void zzy(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.zzr();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzx();
            zzz(activity, zzmVar);
        } else if (Build.VERSION.SDK_INT < 33) {
            com.google.android.gms.ads.internal.zzv.zzr();
            AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(activity);
            zzL.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzece
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzecl.zzk(zzecl.this, activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzecl.zzc(zzecl.this, zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecg
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzecl.zzd(zzecl.this, zzmVar, dialogInterface);
                }
            });
            zzL.create().show();
            zzw(this.zzf, "rtsdi", zzfyt.zzd());
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzw(this.zzf, "asnpdi", zzfyt.zzd());
        }
    }

    private final void zzz(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog zzs = zzs(activity, zzmVar);
        zzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzeck(this, zzs, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
                return;
            }
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            Context context = this.zzb;
            boolean zzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(context);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzA) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzw(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzeca.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(concat);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzecn zzecnVar = (zzecn) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzecnVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzecnVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzx();
                    zzz(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzecn zzecnVar = (zzecn) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzecnVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzecnVar.zzb();
        this.zzf = zzecnVar.zzc();
        this.zzg = zzecnVar.zzd();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zziQ)).booleanValue()) {
            zzw(this.zzf, "dialog_impression", zzfyt.zzd());
            com.google.android.gms.ads.internal.zzv.zzr();
            AlertDialog.Builder zzL = com.google.android.gms.ads.internal.util.zzs.zzL(zza);
            zzL.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzech
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzecl.zzm(zzecl.this, zza, zzb, dialogInterface, i);
                }
            }).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeci
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzecl.zzl(zzecl.this, zzb, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecj
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzecl.zzn(zzecl.this, zzb, dialogInterface);
                }
            });
            zzL.create().show();
            return;
        }
        zzy(zza, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zze(new zzfge() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // com.google.android.gms.internal.ads.zzfge
            public final Object zza(Object obj) {
                zzeca.zzj((SQLiteDatabase) obj, com.google.android.gms.ads.internal.util.client.zzu.this);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|(1:4)(1:5)|6|(9:23|10|(2:27|13)|14|25|15|16|19|20)|11|(0)|14|25|15|16|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00db, code lost:
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbtj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.ads.internal.offline.buffering.zza r9) {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r8)
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r0 = r9.zza
            java.lang.String r1 = r9.zzb
            java.lang.String r9 = r9.zzc
            java.lang.String r2 = r7.zzu()
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzv.zzs()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.zzh(r8, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r8, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r8, r5, r1, r0)
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            r5.<init>(r8, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L46
            int r4 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r6 = "You are back online! Continue learning about %s"
            java.lang.String r4 = zzv(r4, r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r5.setContentTitle(r2)
            goto L51
        L46:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzv(r2, r4)
            r5.setContentTitle(r2)
        L51:
            r2 = 1
            androidx.core.app.NotificationCompat$Builder r2 = r5.setAutoCancel(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setDeleteIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentIntent(r3)
            android.content.pm.ApplicationInfo r2 = r8.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon(r2)
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zziR
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setPriority(r2)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zziT
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto La6
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto La6
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La6
            r0.<init>(r9)     // Catch: java.io.IOException -> La6
            java.net.URLConnection r9 = r0.openConnection()     // Catch: java.io.IOException -> La6
            java.io.InputStream r9 = r9.getInputStream()     // Catch: java.io.IOException -> La6
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch: java.io.IOException -> La6
            goto La7
        La6:
            r9 = r2
        La7:
            if (r9 == 0) goto Lc0
            androidx.core.app.NotificationCompat$Builder r0 = r5.setLargeIcon(r9)     // Catch: android.content.res.Resources.NotFoundException -> Lc0
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch: android.content.res.Resources.NotFoundException -> Lc0
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lc0
            androidx.core.app.NotificationCompat$BigPictureStyle r9 = r3.bigPicture(r9)     // Catch: android.content.res.Resources.NotFoundException -> Lc0
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: android.content.res.Resources.NotFoundException -> Lc0
            androidx.core.app.NotificationCompat$BigPictureStyle r9 = r9.bigLargeIcon(r2)     // Catch: android.content.res.Resources.NotFoundException -> Lc0
            r0.setStyle(r9)     // Catch: android.content.res.Resources.NotFoundException -> Lc0
        Lc0:
            java.lang.String r9 = "notification"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.app.Notification r0 = r5.build()     // Catch: java.lang.IllegalArgumentException -> Lda
            r2 = 54321(0xd431, float:7.612E-41)
            r8.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Lda
            java.lang.String r8 = "offline_notification_impression"
            goto Le6
        Lda:
            r8 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r8 = r8.getMessage()
            r9.put(r0, r8)
            java.lang.String r8 = "offline_notification_failed"
        Le6:
            r7.zzw(r1, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecl.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    public final void zzq(String str, zzdit zzditVar) {
        String zzx = zzditVar.zzx();
        String zzB = zzditVar.zzB();
        boolean isEmpty = TextUtils.isEmpty(zzx);
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (isEmpty) {
            zzx = zzB != null ? zzB : str2;
        }
        zzbgp zzm = zzditVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbgp zzn = zzditVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzebo(zzx, str2, drawable));
    }
}
