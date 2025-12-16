package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zztl extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzti zzc;
    public final String zzd;

    public zztl(zzz zzzVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzzVar.toString(), th, zzzVar.zzo, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    public static /* bridge */ /* synthetic */ zztl zza(zztl zztlVar, zztl zztlVar2) {
        return new zztl(zztlVar.getMessage(), zztlVar.getCause(), zztlVar.zza, false, zztlVar.zzc, zztlVar.zzd, zztlVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zztl(com.google.android.gms.internal.ads.zzz r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzti r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Decoder init failed: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzo
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L2a
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            goto L2b
        L2a:
            r11 = 0
        L2b:
            r8 = r11
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztl.<init>(com.google.android.gms.internal.ads.zzz, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzti):void");
    }

    private zztl(String str, Throwable th, String str2, boolean z, zzti zztiVar, String str3, zztl zztlVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zztiVar;
        this.zzd = str3;
    }
}
