package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaly implements zzakt {
    private final zzen zza = new zzen();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaly(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = str;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzex.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : str;
        int i = bArr[25] * Ascii.DC4;
        this.zzg = i;
        z = (bArr[0] & 32) != 0 ? true : z;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzc(android.text.SpannableStringBuilder r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            if (r5 == r6) goto L47
            r6 = r9 | 33
            r9 = r5 & 1
            r0 = r5 & 2
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L21
            if (r0 == 0) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 3
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L2e
        L18:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            r4.setSpan(r0, r7, r8, r6)
            goto L2d
        L21:
            if (r0 == 0) goto L2d
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 2
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L2e
        L2d:
            r2 = r1
        L2e:
            r5 = r5 & 4
            if (r5 != 0) goto L3f
            if (r9 != 0) goto L47
            if (r2 != 0) goto L47
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r1)
            r4.setSpan(r5, r7, r8, r6)
            return
        L3f:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r4.setSpan(r5, r7, r8, r6)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzc(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakt
    public final void zza(byte[] bArr, int i, int i2, zzaks zzaksVar, zzdn zzdnVar) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i + i2);
        zzenVar.zzL(i);
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        zzdd.zzd(zzenVar.zza() >= 2);
        int zzq = zzenVar.zzq();
        if (zzq == 0) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            int zzc = zzenVar.zzc();
            Charset zzC = zzenVar.zzC();
            int zzc2 = zzenVar.zzc() - zzc;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            str = zzenVar.zzB(zzq - zzc2, zzC);
        }
        if (str.isEmpty()) {
            zzdnVar.zza(new zzakl(zzfyq.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i15 = this.zzc;
        zzc(spannableStringBuilder, i15, 0, 0, spannableStringBuilder.length(), 16711680);
        int i16 = i15;
        int i17 = this.zzd;
        zzb(spannableStringBuilder, i17, -1, 0, spannableStringBuilder.length(), 16711680);
        int i18 = i17;
        String str2 = this.zze;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.zzf;
        while (zzenVar.zza() >= 8) {
            int zzc3 = zzenVar.zzc();
            int zzg = zzenVar.zzg();
            int zzg2 = zzenVar.zzg();
            if (zzg2 == 1937013100) {
                zzdd.zzd(zzenVar.zza() >= i14 ? i12 : i13);
                int zzq2 = zzenVar.zzq();
                int i19 = i13;
                while (i19 < zzq2) {
                    zzdd.zzd(zzenVar.zza() >= 12 ? i12 : i13);
                    int zzq3 = zzenVar.zzq();
                    int zzq4 = zzenVar.zzq();
                    zzenVar.zzM(i14);
                    int i20 = zzq2;
                    int zzm = zzenVar.zzm();
                    zzenVar.zzM(i12);
                    int zzg3 = zzenVar.zzg();
                    if (zzq4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i6 = i16;
                        i7 = i18;
                        zzea.zzf("Tx3gParser", "Truncating styl end (" + zzq4 + ") to cueText.length() (" + length2 + ").");
                        zzq4 = spannableStringBuilder.length();
                    } else {
                        i6 = i16;
                        i7 = i18;
                    }
                    if (zzq3 >= zzq4) {
                        zzea.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + zzq4 + ").");
                        i10 = i6;
                        i9 = i19;
                        i11 = i20;
                        i8 = i7;
                    } else {
                        i11 = i20;
                        i9 = i19;
                        int i21 = i6;
                        zzc(spannableStringBuilder, zzm, i21, zzq3, zzq4, 0);
                        i10 = i21;
                        i8 = i7;
                        zzb(spannableStringBuilder, zzg3, i8, zzq3, zzq4, 0);
                    }
                    zzq2 = i11;
                    i16 = i10;
                    i18 = i8;
                    i12 = 1;
                    i14 = 2;
                    i19 = i9 + 1;
                    i13 = 0;
                }
                i5 = i16;
                i3 = i18;
                i4 = i14;
            } else {
                i5 = i16;
                i3 = i18;
                if (zzg2 != 1952608120 || !this.zzb) {
                    i4 = 2;
                } else {
                    i4 = 2;
                    zzdd.zzd(zzenVar.zza() >= 2);
                    int i22 = this.zzg;
                    String str3 = zzex.zza;
                    f = Math.max(0.0f, Math.min(zzenVar.zzq() / i22, 0.95f));
                }
            }
            zzenVar.zzL(zzc3 + zzg);
            i16 = i5;
            i14 = i4;
            i18 = i3;
            i12 = 1;
            i13 = 0;
        }
        zzcs zzcsVar = new zzcs();
        zzcsVar.zzl(spannableStringBuilder);
        zzcsVar.zze(f, 0);
        zzcsVar.zzf(0);
        zzdnVar.zza(new zzakl(zzfyq.zzo(zzcsVar.zzq()), -9223372036854775807L, -9223372036854775807L));
    }
}
