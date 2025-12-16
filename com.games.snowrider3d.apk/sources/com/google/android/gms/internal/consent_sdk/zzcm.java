package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public final class zzcm {
    private static String zza;

    public static synchronized String zza(Context context) {
        String str;
        synchronized (zzcm.class) {
            if (zza == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || zzcu.zza(true)) {
                    string = "emulator";
                }
                zza = zzb(string);
            }
            str = zza;
        }
        return str;
    }

    private static String zzb(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
