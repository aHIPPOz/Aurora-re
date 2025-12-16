package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzck {
    private final zzfyq zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd = false;

    public zzck(zzfyq zzfyqVar) {
        this.zza = zzfyqVar;
        zzcl zzclVar = zzcl.zza;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= zzi(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzcn zzcnVar = (zzcn) list.get(i);
                    if (zzcnVar.zzh()) {
                        if (!this.zzc[i].hasRemaining() && i < zzi()) {
                            ((zzcn) list.get(i + 1)).zzd();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.zzc[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : zzcn.zza;
                        }
                        zzcnVar.zze(byteBuffer2);
                        this.zzc[i] = zzcnVar.zzb();
                        boolean z2 = true;
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzfyq zzfyqVar = this.zza;
        int size = zzfyqVar.size();
        zzfyq zzfyqVar2 = ((zzck) obj).zza;
        if (size != zzfyqVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzfyqVar.size(); i++) {
            if (zzfyqVar.get(i) != zzfyqVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcm {
        zzcl zzclVar2 = zzcl.zza;
        if (!zzclVar.equals(zzclVar2)) {
            int i = 0;
            while (true) {
                zzfyq zzfyqVar = this.zza;
                if (i >= zzfyqVar.size()) {
                    return zzclVar;
                }
                zzcn zzcnVar = (zzcn) zzfyqVar.get(i);
                zzcl zza = zzcnVar.zza(zzclVar);
                if (zzcnVar.zzg()) {
                    zzdd.zzf(!zza.equals(zzclVar2));
                    zzclVar = zza;
                }
                i++;
            }
        } else {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcn.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcn.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i = 0;
        while (true) {
            zzfyq zzfyqVar = this.zza;
            if (i >= zzfyqVar.size()) {
                break;
            }
            zzcn zzcnVar = (zzcn) zzfyqVar.get(i);
            zzcnVar.zzc();
            if (zzcnVar.zzg()) {
                list.add(zzcnVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzcn) list.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcn) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        int i = 0;
        while (true) {
            zzfyq zzfyqVar = this.zza;
            if (i < zzfyqVar.size()) {
                zzcn zzcnVar = (zzcn) zzfyqVar.get(i);
                zzcnVar.zzc();
                zzcnVar.zzf();
                i++;
            } else {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
        }
    }

    public final boolean zzg() {
        return this.zzd && ((zzcn) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
