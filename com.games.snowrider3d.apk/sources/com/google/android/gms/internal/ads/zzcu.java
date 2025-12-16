package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcu {
    public final CharSequence zza;
    public final Layout.Alignment zzb;
    public final Layout.Alignment zzc;
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;
    private static final String zzq = Integer.toString(0, 36);
    private static final String zzr = Integer.toString(17, 36);
    private static final String zzs = Integer.toString(1, 36);
    private static final String zzt = Integer.toString(2, 36);
    private static final String zzu = Integer.toString(18, 36);
    private static final String zzv = Integer.toString(4, 36);
    private static final String zzw = Integer.toString(5, 36);
    private static final String zzx = Integer.toString(6, 36);
    private static final String zzy = Integer.toString(7, 36);
    private static final String zzz = Integer.toString(8, 36);
    private static final String zzA = Integer.toString(9, 36);
    private static final String zzB = Integer.toString(10, 36);
    private static final String zzC = Integer.toString(11, 36);
    private static final String zzD = Integer.toString(12, 36);
    private static final String zzE = Integer.toString(13, 36);
    private static final String zzF = Integer.toString(14, 36);
    private static final String zzG = Integer.toString(15, 36);
    private static final String zzH = Integer.toString(16, 36);
    private static final String zzI = Integer.toString(19, 36);

    static {
        zzcs zzcsVar = new zzcs();
        zzcsVar.zzl(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zzcsVar.zzq();
        String str = zzex.zza;
        Integer.toString(3, 36);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcu zzcuVar = (zzcu) obj;
            if (TextUtils.equals(this.zza, zzcuVar.zza) && this.zzb == zzcuVar.zzb && this.zzc == zzcuVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcuVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcuVar.zzd == null) && this.zze == zzcuVar.zze && this.zzf == zzcuVar.zzf && this.zzg == zzcuVar.zzg && this.zzh == zzcuVar.zzh && this.zzi == zzcuVar.zzi && this.zzj == zzcuVar.zzj && this.zzk == zzcuVar.zzk && this.zzl == zzcuVar.zzl && this.zzm == zzcuVar.zzm && this.zzn == zzcuVar.zzn && this.zzo == zzcuVar.zzo && this.zzp == zzcuVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), false, Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK), Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo), Integer.valueOf(this.zzp));
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzq, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> zza = zzcx.zza((Spanned) charSequence);
                if (!zza.isEmpty()) {
                    bundle.putParcelableArrayList(zzr, zza);
                }
            }
        }
        bundle.putSerializable(zzs, this.zzb);
        bundle.putSerializable(zzt, this.zzc);
        bundle.putFloat(zzv, this.zze);
        bundle.putInt(zzw, this.zzf);
        bundle.putInt(zzx, this.zzg);
        bundle.putFloat(zzy, this.zzh);
        bundle.putInt(zzz, this.zzi);
        bundle.putInt(zzA, this.zzl);
        bundle.putFloat(zzB, this.zzm);
        bundle.putFloat(zzC, this.zzj);
        bundle.putFloat(zzD, this.zzk);
        bundle.putBoolean(zzF, false);
        bundle.putInt(zzE, ViewCompat.MEASURED_STATE_MASK);
        bundle.putInt(zzG, this.zzn);
        bundle.putFloat(zzH, this.zzo);
        bundle.putInt(zzI, this.zzp);
        Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzdd.zzf(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzu, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final zzcs zzb() {
        return new zzcs(this, null);
    }

    public /* synthetic */ zzcu(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7, zzct zzctVar) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            zzdd.zzd(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = f2;
        this.zzi = i3;
        this.zzj = f4;
        this.zzk = f5;
        this.zzl = i4;
        this.zzm = f3;
        this.zzn = i6;
        this.zzo = f6;
        this.zzp = i7;
    }
}
