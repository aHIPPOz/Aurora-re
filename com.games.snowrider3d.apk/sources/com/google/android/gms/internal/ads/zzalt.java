package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzalt implements zzakt {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalr zzh = new zzalr(30.0f, 1, 1);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r13.equals("s") != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalr r14) throws com.google.android.gms.internal.ads.zzakp {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zzc(java.lang.String, com.google.android.gms.internal.ads.zzalr):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment zzd(String str) {
        char c;
        String zza2 = zzfuv.zza(str);
        switch (zza2.hashCode()) {
            case -1364013995:
                if (zza2.equals("center")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (zza2.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (zza2.equals("left")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (zza2.equals("right")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (zza2.equals("start")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c == 4) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return null;
    }

    private static zzalw zze(zzalw zzalwVar) {
        return zzalwVar == null ? new zzalw() : zzalwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v73 */
    private static zzalw zzf(XmlPullParser xmlPullParser, zzalw zzalwVar) {
        ?? r6;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzalw zzalwVar2 = zzalwVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r102 = -1;
            r10 = -1;
            r10 = -1;
            ?? r103 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r104 = -1;
            r10 = -1;
            r10 = -1;
            ?? r105 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        r6 = 6;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        r6 = 16;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        r6 = 3;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        r6 = 7;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r6 = 15;
                        break;
                    }
                    r6 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        r6 = 12;
                        break;
                    }
                    r6 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        r6 = 5;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r6 = 10;
                        break;
                    }
                    r6 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals(TypedValues.Custom.S_COLOR)) {
                        r6 = 2;
                        break;
                    }
                    r6 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        r6 = 14;
                        break;
                    }
                    r6 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        r6 = 9;
                        break;
                    }
                    r6 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        r6 = 4;
                        break;
                    }
                    r6 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        r6 = 13;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        r6 = 11;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        r6 = 1;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        r6 = 8;
                        break;
                    }
                    r6 = -1;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzt(attributeValue);
                        break;
                    }
                case 1:
                    zzalwVar2 = zze(zzalwVar2);
                    try {
                        zzalwVar2.zzm(zzdl.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzea.zzf("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzalwVar2 = zze(zzalwVar2);
                    try {
                        zzalwVar2.zzp(zzdl.zzb(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzea.zzf("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzq(attributeValue);
                    break;
                case 4:
                    try {
                        zzalwVar2 = zze(zzalwVar2);
                        String str = zzex.zza;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else if (length == 2) {
                            matcher = zze.matcher(split[1]);
                            zzea.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        } else {
                            throw new zzakp("Invalid number of entries for fontSize: " + length + ".");
                        }
                        if (matcher.matches()) {
                            String group = matcher.group(3);
                            if (group != null) {
                                String str2 = group;
                                int hashCode = group.hashCode();
                                if (hashCode != 37) {
                                    if (hashCode != 3240) {
                                        if (hashCode == 3592 && group.equals("px")) {
                                            r10 = 0;
                                        }
                                    } else if (group.equals("em")) {
                                        r10 = 1;
                                    }
                                } else if (group.equals("%")) {
                                    r10 = 2;
                                }
                                if (r10 == 0) {
                                    zzalwVar2.zzs(1);
                                } else if (r10 == 1) {
                                    zzalwVar2.zzs(2);
                                } else if (r10 == 2) {
                                    zzalwVar2.zzs(3);
                                } else {
                                    throw new zzakp("Invalid unit for fontSize: '" + group + "'.");
                                }
                                String group2 = matcher.group(1);
                                if (group2 == null) {
                                    throw null;
                                }
                                String str3 = group2;
                                zzalwVar2.zzr(Float.parseFloat(group2));
                                break;
                            } else {
                                throw null;
                            }
                        } else {
                            throw new zzakp("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                    } catch (zzakp unused3) {
                        zzea.zzf("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzn("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzu("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzB(zzd(attributeValue));
                    break;
                case 8:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzw(zzd(attributeValue));
                    break;
                case 9:
                    String zza2 = zzfuv.zza(attributeValue);
                    int hashCode2 = zza2.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && zza2.equals("none")) {
                            r105 = z;
                        }
                    } else if (zza2.equals("all")) {
                        r105 = 1;
                    }
                    if (r105 == 0) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzC(z);
                        break;
                    } else if (r105 == 1) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzC(true);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    String zza3 = zzfuv.zza(attributeValue);
                    switch (zza3.hashCode()) {
                        case -618561360:
                            if (zza3.equals("baseContainer")) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (zza3.equals("container")) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (zza3.equals("delimiter")) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (zza3.equals("textContainer")) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (zza3.equals("base")) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (zza3.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 == 0) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzz(1);
                        break;
                    } else if (r104 != 1 && r104 != 2) {
                        if (r104 != 3 && r104 != 4) {
                            if (r104 == 5) {
                                zzalwVar2 = zze(zzalwVar2);
                                zzalwVar2.zzz(4);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            zzalwVar2 = zze(zzalwVar2);
                            zzalwVar2.zzz(3);
                            break;
                        }
                    } else {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzz(2);
                        break;
                    }
                case 11:
                    String zza4 = zzfuv.zza(attributeValue);
                    int hashCode3 = zza4.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && zza4.equals("after")) {
                            r103 = 1;
                        }
                    } else if (zza4.equals("before")) {
                        r103 = z;
                    }
                    if (r103 == 0) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzy(1);
                        break;
                    } else if (r103 == 1) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzy(2);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 12:
                    String zza5 = zzfuv.zza(attributeValue);
                    switch (zza5.hashCode()) {
                        case -1461280213:
                            if (zza5.equals("nounderline")) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (zza5.equals("underline")) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (zza5.equals("nolinethrough")) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (zza5.equals("linethrough")) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 == 0) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzv(true);
                        break;
                    } else if (r102 == 1) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzv(z);
                        break;
                    } else if (r102 == 2) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzE(true);
                        break;
                    } else if (r102 == 3) {
                        zzalwVar2 = zze(zzalwVar2);
                        zzalwVar2.zzE(z);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzD(zzalp.zza(attributeValue));
                    break;
                case 14:
                    zzalw zze2 = zze(zzalwVar2);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (!matcher2.matches()) {
                        zzea.zzf("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    } else {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 != null) {
                                String str4 = group3;
                                f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            } else {
                                throw null;
                                break;
                            }
                        } catch (NumberFormatException e) {
                            zzea.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    }
                    zze2.zzA(f);
                    zzalwVar2 = zze2;
                    break;
                case 15:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzx(attributeValue);
                    break;
                case 16:
                    zzalwVar2 = zze(zzalwVar2);
                    zzalwVar2.zzo(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzalwVar2;
    }

    private static String[] zzg(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzex.zza;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final void zza(byte[] bArr, int i, int i2, zzaks zzaksVar, zzdn zzdnVar) {
        zzakn.zza(zzb(bArr, i, i2), zzaksVar, zzdnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(12:45|(1:(10:48|399|52|53|402|54|62|(2:65|(1:67)(4:68|408|69|(2:71|(2:73|77)(2:430|74))(2:429|75)))|64|77)(1:49))(1:50)|51|399|52|53|402|54|62|(0)|64|77) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
        com.google.android.gms.internal.ads.zzea.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0271 A[Catch: IOException -> 0x06ef, XmlPullParserException -> 0x06f8, LOOP:1: B:114:0x0271->B:264:0x0530, LOOP_START, PHI: r1 r9 
      PHI: (r1v26 java.lang.String) = (r1v11 java.lang.String), (r1v27 java.lang.String) binds: [B:113:0x026f, B:264:0x0530] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v10 java.util.ArrayDeque) = (r9v3 java.util.ArrayDeque), (r9v11 java.util.ArrayDeque) binds: [B:113:0x026f, B:264:0x0530] A[DONT_GENERATE, DONT_INLINE], TryCatch #14 {IOException -> 0x06ef, XmlPullParserException -> 0x06f8, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:18:0x008c, B:21:0x0096, B:25:0x00aa, B:27:0x00c5, B:29:0x00cf, B:30:0x00d3, B:32:0x00df, B:33:0x00e3, B:37:0x00fa, B:39:0x0106, B:41:0x0112, B:43:0x0118, B:45:0x0126, B:52:0x013d, B:54:0x0144, B:56:0x015e, B:58:0x0163, B:61:0x0168, B:62:0x0172, B:65:0x017d, B:67:0x0189, B:69:0x0194, B:71:0x019a, B:73:0x01a8, B:74:0x01b7, B:75:0x01b8, B:76:0x01b9, B:79:0x01d0, B:82:0x01e0, B:84:0x01e6, B:86:0x01ee, B:88:0x01f6, B:90:0x01fe, B:92:0x0206, B:94:0x020e, B:96:0x0214, B:98:0x021c, B:100:0x0224, B:102:0x022a, B:104:0x0230, B:106:0x0238, B:108:0x0240, B:111:0x0249, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0294, B:122:0x02a6, B:124:0x02ac, B:125:0x02b0, B:128:0x02ba, B:130:0x02c0, B:132:0x02cb, B:134:0x02d1, B:135:0x02d8, B:138:0x02e2, B:141:0x02ee, B:143:0x02f6, B:145:0x02fc, B:147:0x0304, B:149:0x030a, B:152:0x031f, B:154:0x0325, B:156:0x0335, B:157:0x033f, B:158:0x0340, B:159:0x0341, B:160:0x034b, B:163:0x0355, B:165:0x0360, B:167:0x0366, B:169:0x0374, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:173:0x0393, B:175:0x03a2, B:177:0x03ac, B:179:0x03b2, B:181:0x03ba, B:183:0x03c0, B:186:0x03d5, B:188:0x03db, B:190:0x03eb, B:191:0x03fa, B:192:0x03fb, B:193:0x03fc, B:194:0x040a, B:197:0x0412, B:199:0x0421, B:201:0x0427, B:203:0x0435, B:204:0x044c, B:205:0x044d, B:206:0x044e, B:207:0x045c, B:210:0x0473, B:212:0x047b, B:231:0x04c2, B:233:0x04ca, B:258:0x0514, B:260:0x0521, B:261:0x0526, B:266:0x0538, B:269:0x055b, B:302:0x05bf, B:305:0x05c8, B:306:0x05cf, B:309:0x05d9, B:312:0x05e4, B:313:0x05ea, B:314:0x05ef, B:315:0x05f4, B:321:0x0606, B:325:0x0610, B:329:0x0619, B:339:0x062d, B:342:0x0634, B:348:0x0644, B:350:0x0650, B:352:0x0655, B:357:0x0664, B:361:0x067d, B:363:0x068d, B:366:0x0691, B:368:0x069b, B:370:0x06a5, B:372:0x06ad, B:374:0x06b0, B:377:0x06c2, B:381:0x06ca, B:384:0x06d1, B:387:0x06e8, B:390:0x06ee), top: B:417:0x0006, inners: #1, #3, #7, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04ca A[Catch: IOException -> 0x06ef, XmlPullParserException -> 0x06f8, TRY_LEAVE, TryCatch #14 {IOException -> 0x06ef, XmlPullParserException -> 0x06f8, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:18:0x008c, B:21:0x0096, B:25:0x00aa, B:27:0x00c5, B:29:0x00cf, B:30:0x00d3, B:32:0x00df, B:33:0x00e3, B:37:0x00fa, B:39:0x0106, B:41:0x0112, B:43:0x0118, B:45:0x0126, B:52:0x013d, B:54:0x0144, B:56:0x015e, B:58:0x0163, B:61:0x0168, B:62:0x0172, B:65:0x017d, B:67:0x0189, B:69:0x0194, B:71:0x019a, B:73:0x01a8, B:74:0x01b7, B:75:0x01b8, B:76:0x01b9, B:79:0x01d0, B:82:0x01e0, B:84:0x01e6, B:86:0x01ee, B:88:0x01f6, B:90:0x01fe, B:92:0x0206, B:94:0x020e, B:96:0x0214, B:98:0x021c, B:100:0x0224, B:102:0x022a, B:104:0x0230, B:106:0x0238, B:108:0x0240, B:111:0x0249, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0294, B:122:0x02a6, B:124:0x02ac, B:125:0x02b0, B:128:0x02ba, B:130:0x02c0, B:132:0x02cb, B:134:0x02d1, B:135:0x02d8, B:138:0x02e2, B:141:0x02ee, B:143:0x02f6, B:145:0x02fc, B:147:0x0304, B:149:0x030a, B:152:0x031f, B:154:0x0325, B:156:0x0335, B:157:0x033f, B:158:0x0340, B:159:0x0341, B:160:0x034b, B:163:0x0355, B:165:0x0360, B:167:0x0366, B:169:0x0374, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:173:0x0393, B:175:0x03a2, B:177:0x03ac, B:179:0x03b2, B:181:0x03ba, B:183:0x03c0, B:186:0x03d5, B:188:0x03db, B:190:0x03eb, B:191:0x03fa, B:192:0x03fb, B:193:0x03fc, B:194:0x040a, B:197:0x0412, B:199:0x0421, B:201:0x0427, B:203:0x0435, B:204:0x044c, B:205:0x044d, B:206:0x044e, B:207:0x045c, B:210:0x0473, B:212:0x047b, B:231:0x04c2, B:233:0x04ca, B:258:0x0514, B:260:0x0521, B:261:0x0526, B:266:0x0538, B:269:0x055b, B:302:0x05bf, B:305:0x05c8, B:306:0x05cf, B:309:0x05d9, B:312:0x05e4, B:313:0x05ea, B:314:0x05ef, B:315:0x05f4, B:321:0x0606, B:325:0x0610, B:329:0x0619, B:339:0x062d, B:342:0x0634, B:348:0x0644, B:350:0x0650, B:352:0x0655, B:357:0x0664, B:361:0x067d, B:363:0x068d, B:366:0x0691, B:368:0x069b, B:370:0x06a5, B:372:0x06ad, B:374:0x06b0, B:377:0x06c2, B:381:0x06ca, B:384:0x06d1, B:387:0x06e8, B:390:0x06ee), top: B:417:0x0006, inners: #1, #3, #7, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0521 A[Catch: IOException -> 0x06ef, XmlPullParserException -> 0x06f8, TryCatch #14 {IOException -> 0x06ef, XmlPullParserException -> 0x06f8, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:18:0x008c, B:21:0x0096, B:25:0x00aa, B:27:0x00c5, B:29:0x00cf, B:30:0x00d3, B:32:0x00df, B:33:0x00e3, B:37:0x00fa, B:39:0x0106, B:41:0x0112, B:43:0x0118, B:45:0x0126, B:52:0x013d, B:54:0x0144, B:56:0x015e, B:58:0x0163, B:61:0x0168, B:62:0x0172, B:65:0x017d, B:67:0x0189, B:69:0x0194, B:71:0x019a, B:73:0x01a8, B:74:0x01b7, B:75:0x01b8, B:76:0x01b9, B:79:0x01d0, B:82:0x01e0, B:84:0x01e6, B:86:0x01ee, B:88:0x01f6, B:90:0x01fe, B:92:0x0206, B:94:0x020e, B:96:0x0214, B:98:0x021c, B:100:0x0224, B:102:0x022a, B:104:0x0230, B:106:0x0238, B:108:0x0240, B:111:0x0249, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0294, B:122:0x02a6, B:124:0x02ac, B:125:0x02b0, B:128:0x02ba, B:130:0x02c0, B:132:0x02cb, B:134:0x02d1, B:135:0x02d8, B:138:0x02e2, B:141:0x02ee, B:143:0x02f6, B:145:0x02fc, B:147:0x0304, B:149:0x030a, B:152:0x031f, B:154:0x0325, B:156:0x0335, B:157:0x033f, B:158:0x0340, B:159:0x0341, B:160:0x034b, B:163:0x0355, B:165:0x0360, B:167:0x0366, B:169:0x0374, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:173:0x0393, B:175:0x03a2, B:177:0x03ac, B:179:0x03b2, B:181:0x03ba, B:183:0x03c0, B:186:0x03d5, B:188:0x03db, B:190:0x03eb, B:191:0x03fa, B:192:0x03fb, B:193:0x03fc, B:194:0x040a, B:197:0x0412, B:199:0x0421, B:201:0x0427, B:203:0x0435, B:204:0x044c, B:205:0x044d, B:206:0x044e, B:207:0x045c, B:210:0x0473, B:212:0x047b, B:231:0x04c2, B:233:0x04ca, B:258:0x0514, B:260:0x0521, B:261:0x0526, B:266:0x0538, B:269:0x055b, B:302:0x05bf, B:305:0x05c8, B:306:0x05cf, B:309:0x05d9, B:312:0x05e4, B:313:0x05ea, B:314:0x05ef, B:315:0x05f4, B:321:0x0606, B:325:0x0610, B:329:0x0619, B:339:0x062d, B:342:0x0634, B:348:0x0644, B:350:0x0650, B:352:0x0655, B:357:0x0664, B:361:0x067d, B:363:0x068d, B:366:0x0691, B:368:0x069b, B:370:0x06a5, B:372:0x06ad, B:374:0x06b0, B:377:0x06c2, B:381:0x06ca, B:384:0x06d1, B:387:0x06e8, B:390:0x06ee), top: B:417:0x0006, inners: #1, #3, #7, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0530 A[LOOP:1: B:114:0x0271->B:264:0x0530, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0655 A[Catch: zzakp -> 0x065e, IOException -> 0x06ef, XmlPullParserException -> 0x06f8, TRY_LEAVE, TryCatch #10 {zzakp -> 0x065e, blocks: (B:350:0x0650, B:352:0x0655), top: B:410:0x0650 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x052c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d A[Catch: IOException -> 0x06ef, XmlPullParserException -> 0x06f8, TryCatch #14 {IOException -> 0x06ef, XmlPullParserException -> 0x06f8, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:18:0x008c, B:21:0x0096, B:25:0x00aa, B:27:0x00c5, B:29:0x00cf, B:30:0x00d3, B:32:0x00df, B:33:0x00e3, B:37:0x00fa, B:39:0x0106, B:41:0x0112, B:43:0x0118, B:45:0x0126, B:52:0x013d, B:54:0x0144, B:56:0x015e, B:58:0x0163, B:61:0x0168, B:62:0x0172, B:65:0x017d, B:67:0x0189, B:69:0x0194, B:71:0x019a, B:73:0x01a8, B:74:0x01b7, B:75:0x01b8, B:76:0x01b9, B:79:0x01d0, B:82:0x01e0, B:84:0x01e6, B:86:0x01ee, B:88:0x01f6, B:90:0x01fe, B:92:0x0206, B:94:0x020e, B:96:0x0214, B:98:0x021c, B:100:0x0224, B:102:0x022a, B:104:0x0230, B:106:0x0238, B:108:0x0240, B:111:0x0249, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0294, B:122:0x02a6, B:124:0x02ac, B:125:0x02b0, B:128:0x02ba, B:130:0x02c0, B:132:0x02cb, B:134:0x02d1, B:135:0x02d8, B:138:0x02e2, B:141:0x02ee, B:143:0x02f6, B:145:0x02fc, B:147:0x0304, B:149:0x030a, B:152:0x031f, B:154:0x0325, B:156:0x0335, B:157:0x033f, B:158:0x0340, B:159:0x0341, B:160:0x034b, B:163:0x0355, B:165:0x0360, B:167:0x0366, B:169:0x0374, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:173:0x0393, B:175:0x03a2, B:177:0x03ac, B:179:0x03b2, B:181:0x03ba, B:183:0x03c0, B:186:0x03d5, B:188:0x03db, B:190:0x03eb, B:191:0x03fa, B:192:0x03fb, B:193:0x03fc, B:194:0x040a, B:197:0x0412, B:199:0x0421, B:201:0x0427, B:203:0x0435, B:204:0x044c, B:205:0x044d, B:206:0x044e, B:207:0x045c, B:210:0x0473, B:212:0x047b, B:231:0x04c2, B:233:0x04ca, B:258:0x0514, B:260:0x0521, B:261:0x0526, B:266:0x0538, B:269:0x055b, B:302:0x05bf, B:305:0x05c8, B:306:0x05cf, B:309:0x05d9, B:312:0x05e4, B:313:0x05ea, B:314:0x05ef, B:315:0x05f4, B:321:0x0606, B:325:0x0610, B:329:0x0619, B:339:0x062d, B:342:0x0634, B:348:0x0644, B:350:0x0650, B:352:0x0655, B:357:0x0664, B:361:0x067d, B:363:0x068d, B:366:0x0691, B:368:0x069b, B:370:0x06a5, B:372:0x06ad, B:374:0x06b0, B:377:0x06c2, B:381:0x06ca, B:384:0x06d1, B:387:0x06e8, B:390:0x06ee), top: B:417:0x0006, inners: #1, #3, #7, #9, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e0 A[Catch: IOException -> 0x06ef, XmlPullParserException -> 0x06f8, TRY_ENTER, TryCatch #14 {IOException -> 0x06ef, XmlPullParserException -> 0x06f8, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007d, B:16:0x0085, B:18:0x008c, B:21:0x0096, B:25:0x00aa, B:27:0x00c5, B:29:0x00cf, B:30:0x00d3, B:32:0x00df, B:33:0x00e3, B:37:0x00fa, B:39:0x0106, B:41:0x0112, B:43:0x0118, B:45:0x0126, B:52:0x013d, B:54:0x0144, B:56:0x015e, B:58:0x0163, B:61:0x0168, B:62:0x0172, B:65:0x017d, B:67:0x0189, B:69:0x0194, B:71:0x019a, B:73:0x01a8, B:74:0x01b7, B:75:0x01b8, B:76:0x01b9, B:79:0x01d0, B:82:0x01e0, B:84:0x01e6, B:86:0x01ee, B:88:0x01f6, B:90:0x01fe, B:92:0x0206, B:94:0x020e, B:96:0x0214, B:98:0x021c, B:100:0x0224, B:102:0x022a, B:104:0x0230, B:106:0x0238, B:108:0x0240, B:111:0x0249, B:112:0x026b, B:114:0x0271, B:116:0x027a, B:118:0x0289, B:120:0x0294, B:122:0x02a6, B:124:0x02ac, B:125:0x02b0, B:128:0x02ba, B:130:0x02c0, B:132:0x02cb, B:134:0x02d1, B:135:0x02d8, B:138:0x02e2, B:141:0x02ee, B:143:0x02f6, B:145:0x02fc, B:147:0x0304, B:149:0x030a, B:152:0x031f, B:154:0x0325, B:156:0x0335, B:157:0x033f, B:158:0x0340, B:159:0x0341, B:160:0x034b, B:163:0x0355, B:165:0x0360, B:167:0x0366, B:169:0x0374, B:170:0x0386, B:171:0x0387, B:172:0x0388, B:173:0x0393, B:175:0x03a2, B:177:0x03ac, B:179:0x03b2, B:181:0x03ba, B:183:0x03c0, B:186:0x03d5, B:188:0x03db, B:190:0x03eb, B:191:0x03fa, B:192:0x03fb, B:193:0x03fc, B:194:0x040a, B:197:0x0412, B:199:0x0421, B:201:0x0427, B:203:0x0435, B:204:0x044c, B:205:0x044d, B:206:0x044e, B:207:0x045c, B:210:0x0473, B:212:0x047b, B:231:0x04c2, B:233:0x04ca, B:258:0x0514, B:260:0x0521, B:261:0x0526, B:266:0x0538, B:269:0x055b, B:302:0x05bf, B:305:0x05c8, B:306:0x05cf, B:309:0x05d9, B:312:0x05e4, B:313:0x05ea, B:314:0x05ef, B:315:0x05f4, B:321:0x0606, B:325:0x0610, B:329:0x0619, B:339:0x062d, B:342:0x0634, B:348:0x0644, B:350:0x0650, B:352:0x0655, B:357:0x0664, B:361:0x067d, B:363:0x068d, B:366:0x0691, B:368:0x069b, B:370:0x06a5, B:372:0x06ad, B:374:0x06b0, B:377:0x06c2, B:381:0x06ca, B:384:0x06d1, B:387:0x06e8, B:390:0x06ee), top: B:417:0x0006, inners: #1, #3, #7, #9, #13 }] */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.lang.Throwable, com.google.android.gms.internal.ads.zzalw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzako zzb(byte[] r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzako");
    }

    public zzalt() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.zzi = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
