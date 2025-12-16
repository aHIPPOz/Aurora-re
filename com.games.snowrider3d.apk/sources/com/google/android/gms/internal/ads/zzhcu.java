package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzhcu implements zzgzn {
    static final zzgzn zza = new zzhcu();

    private zzhcu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                case PointerIconCompat.TYPE_HAND /* 1002 */:
                case PointerIconCompat.TYPE_HELP /* 1003 */:
                case PointerIconCompat.TYPE_WAIT /* 1004 */:
                case 1005:
                case PointerIconCompat.TYPE_CELL /* 1006 */:
                case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                case PointerIconCompat.TYPE_TEXT /* 1008 */:
                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
