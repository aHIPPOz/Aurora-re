package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfcf {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfcf(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzi = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
        this.zzd = zzi;
        this.zza = zzi.optString("ad_html", null);
        this.zzb = zzi.optString("ad_base_url", null);
        this.zzc = zzi.optJSONObject("ad_json");
    }
}
