package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public class zzhgc implements Iterator, Closeable, zzarr {
    private static final zzarq zza = new zzhgb("eof ");
    protected zzarn zzb;
    protected zzhgd zzc;
    zzarq zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhgj.zzb(zzhgc.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzarq zzarqVar = this.zzd;
        if (zzarqVar == zza) {
            return false;
        }
        if (zzarqVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i < list.size()) {
                if (i > 0) {
                    sb.append(";");
                }
                sb.append(((zzarq) list.get(i)).toString());
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    /* renamed from: zzc */
    public final zzarq next() {
        zzarq zzb;
        zzarq zzarqVar = this.zzd;
        if (zzarqVar == null || zzarqVar == zza) {
            zzhgd zzhgdVar = this.zzc;
            if (zzhgdVar == null || this.zze >= this.zzf) {
                this.zzd = zza;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzhgdVar) {
                    this.zzc.zze(this.zze);
                    zzb = this.zzb.zzb(this.zzc, this);
                    this.zze = this.zzc.zzb();
                }
                return zzb;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zzd = null;
        return zzarqVar;
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhgi(this.zzg, this);
    }

    public final void zze(zzhgd zzhgdVar, long j, zzarn zzarnVar) throws IOException {
        this.zzc = zzhgdVar;
        this.zze = zzhgdVar.zzb();
        zzhgdVar.zze(zzhgdVar.zzb() + j);
        this.zzf = zzhgdVar.zzb();
        this.zzb = zzarnVar;
    }
}
