package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaml {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zza(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaml.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzcs zzb(String str) {
        zzamj zzamjVar = new zzamj();
        zzh(str, zzamjVar);
        return zzamjVar.zza();
    }

    public static zzame zzc(zzen zzenVar, List list) {
        String zzz = zzenVar.zzz(StandardCharsets.UTF_8);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (!matcher.matches()) {
                String zzz2 = zzenVar.zzz(StandardCharsets.UTF_8);
                if (zzz2 != null) {
                    Matcher matcher2 = pattern.matcher(zzz2);
                    if (matcher2.matches()) {
                        return zze(zzz.trim(), matcher2, zzenVar, list);
                    }
                }
            } else {
                return zze(null, matcher, zzenVar, list);
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamh zzamhVar) {
        List zzf = zzf(list, str, zzamhVar);
        for (int i = 0; i < zzf.size(); i++) {
            zzamd zzamdVar = ((zzami) zzf.get(i)).zzb;
            if (zzamdVar.zze() != -1) {
                return zzamdVar.zze();
            }
        }
        return -1;
    }

    private static zzame zze(String str, Matcher matcher, zzen zzenVar, List list) {
        zzamj zzamjVar = new zzamj();
        try {
            String group = matcher.group(1);
            if (group != null) {
                String str2 = group;
                zzamjVar.zza = zzamn.zzb(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    String str3 = group2;
                    zzamjVar.zzb = zzamn.zzb(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    zzh(group3, zzamjVar);
                    StringBuilder sb = new StringBuilder();
                    String zzz = zzenVar.zzz(StandardCharsets.UTF_8);
                    while (!TextUtils.isEmpty(zzz)) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(zzz.trim());
                        zzz = zzenVar.zzz(StandardCharsets.UTF_8);
                    }
                    zzamjVar.zzc = zza(str, sb.toString(), list);
                    return new zzame(zzamjVar.zza().zzq(), zzamjVar.zza, zzamjVar.zzb);
                }
                throw null;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamh zzamhVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzamd zzamdVar = (zzamd) list.get(i);
            int zzf = zzamdVar.zzf(str, zzamhVar.zza, zzamhVar.zzd, zzamhVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzami(zzf, zzamdVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzamh zzamhVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        Comparator comparator;
        zzamh zzamhVar2;
        zzamh zzamhVar3;
        zzamh zzamhVar4;
        int i;
        int i2 = zzamhVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzamhVar.zza;
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode == 0) {
            if (str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c = 6;
            }
            c = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c = 5;
            }
            c = 65535;
        } else {
            if (str2.equals("u")) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzamhVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzamg.zza;
                Collections.sort(arrayList, comparator);
                int i4 = i2;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    zzamhVar2 = ((zzamg) arrayList.get(i5)).zzb;
                    if ("rt".equals(zzamhVar2.zza)) {
                        zzamg zzamgVar = (zzamg) arrayList.get(i5);
                        zzamhVar3 = zzamgVar.zzb;
                        int zzd3 = zzd(list2, str, zzamhVar3);
                        if (zzd3 == i3) {
                            zzd3 = zzd2 != i3 ? zzd2 : 1;
                        }
                        zzamhVar4 = zzamgVar.zzb;
                        int i7 = zzamhVar4.zzb - i6;
                        i = zzamgVar.zzc;
                        int i8 = i - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new zzcz(subSequence.toString(), zzd3), i4, i7, 33);
                        i6 += subSequence.length();
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 4:
                for (String str3 : zzamhVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdc(zzamhVar.zzc), i2, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzamhVar);
        for (int i9 = 0; i9 < zzf.size(); i9++) {
            zzamd zzamdVar = ((zzami) zzf.get(i9)).zzb;
            if (zzamdVar != null) {
                if (zzamdVar.zzg() != -1) {
                    zzda.zzb(spannableStringBuilder, new StyleSpan(zzamdVar.zzg()), i2, length, 33);
                }
                if (zzamdVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (zzamdVar.zzy()) {
                    zzda.zzb(spannableStringBuilder, new ForegroundColorSpan(zzamdVar.zzc()), i2, length, 33);
                }
                if (zzamdVar.zzx()) {
                    zzda.zzb(spannableStringBuilder, new BackgroundColorSpan(zzamdVar.zzb()), i2, length, 33);
                }
                if (zzamdVar.zzr() != null) {
                    zzda.zzb(spannableStringBuilder, new TypefaceSpan(zzamdVar.zzr()), i2, length, 33);
                }
                int zzd4 = zzamdVar.zzd();
                if (zzd4 == 1) {
                    zzda.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzamdVar.zza(), true), i2, length, 33);
                } else if (zzd4 == 2) {
                    zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzamdVar.zza()), i2, length, 33);
                } else if (zzd4 == 3) {
                    zzda.zzb(spannableStringBuilder, new RelativeSizeSpan(zzamdVar.zza() / 100.0f), i2, length, 33);
                }
                if (zzamdVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcy(), i2, length, 33);
                }
            }
        }
    }

    private static void zzh(String str, zzamj zzamjVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzamjVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzamjVar.zze = zzamn.zza(group2);
                        zzamjVar.zzf = 0;
                    } else {
                        zzamjVar.zze = Integer.parseInt(group2);
                        zzamjVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2 && c != 3) {
                                if (c != 4) {
                                    i = 5;
                                    if (c != 5) {
                                        zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                    }
                                } else {
                                    i = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzamjVar.zzd = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (c != 2 && c != 3) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzamjVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzamjVar.zzh = zzamn.zza(group2);
                } else if ("size".equals(group)) {
                    zzamjVar.zzj = zzamn.zza(group2);
                } else if (!"vertical".equals(group)) {
                    zzea.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                } else {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzamjVar.zzk = i;
                }
            } catch (NumberFormatException unused) {
                zzea.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
