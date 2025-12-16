package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArraySet;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzgy extends GmsClient {
    private long zze;
    private final Set zzf = new ArraySet();
    private final Set zzg = new ArraySet();
    private final Set zzh = new ArraySet();
    private final Set zzi = new ArraySet();
    private final Set zzj = new ArraySet();
    private zzlt zzk;

    protected zzgy(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zzmd.zzc(context.getCacheDir());
    }

    public static Status zzG(int i) {
        return new Status(i, ConnectionsStatusCodes.getStatusCodeString(i));
    }

    private final void zzH() {
        for (zzgg zzggVar : this.zzf) {
            zzggVar.zze();
        }
        for (zzgk zzgkVar : this.zzg) {
            zzgkVar.zzf();
        }
        for (zzgk zzgkVar2 : this.zzh) {
            zzgkVar2.zzf();
        }
        for (zzgk zzgkVar3 : this.zzi) {
            zzgkVar3.zzf();
        }
        for (zzgk zzgkVar4 : this.zzj) {
            zzgkVar4.zzf();
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzh.clear();
        this.zzi.clear();
        this.zzj.clear();
        zzlt zzltVar = this.zzk;
        if (zzltVar != null) {
            zzltVar.zzd();
            this.zzk = null;
        }
    }

    public static /* bridge */ /* synthetic */ Status zzp(int i) {
        return zzG(i);
    }

    public static zzgy zzq(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzgy zzgyVar = new zzgy(context, looper, clientSettings, connectionsOptions, connectionCallbacks, onConnectionFailedListener);
        zzgyVar.zze = zzgyVar.hashCode();
        return zzgyVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return queryLocalInterface instanceof zzkd ? (zzkd) queryLocalInterface : new zzkd(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzkd) getService()).zzf(new zzfp());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        zzH();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.zzf, com.google.android.gms.nearby.zza.zzD, com.google.android.gms.nearby.zza.zzH, com.google.android.gms.nearby.zza.zzF, com.google.android.gms.nearby.zza.zzI, com.google.android.gms.nearby.zza.zzE, com.google.android.gms.nearby.zza.zzg, com.google.android.gms.nearby.zza.zzG};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.zze);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        super.onConnectedLocked((zzkd) iInterface);
        this.zzk = new zzlt();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            zzH();
            i = 1;
        }
        super.onConnectionSuspended(i);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.zzi.add(zzfxVar);
        zzmq zzmqVar = new zzmq();
        zzmqVar.zzg(new zzgx(resultHolder));
        zzmqVar.zze(str);
        zzmqVar.zzh(str2);
        zzmqVar.zzf(advertisingOptions);
        zzmqVar.zzb(zzfxVar);
        ((zzkd) getService()).zzk(zzmqVar.zzi());
    }

    public final void zzB(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.zzi.add(zzfxVar);
        zzmq zzmqVar = new zzmq();
        zzmqVar.zzg(new zzgx(resultHolder));
        zzmqVar.zzd(bArr);
        zzmqVar.zzh(str);
        zzmqVar.zzf(advertisingOptions);
        zzmqVar.zzb(zzfxVar);
        ((zzkd) getService()).zzk(zzmqVar.zzi());
    }

    public final void zzC(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) throws RemoteException {
        zzgg zzggVar = new zzgg(listenerHolder);
        this.zzf.add(zzggVar);
        zzmu zzmuVar = new zzmu();
        zzmuVar.zzd(new zzgv(resultHolder));
        zzmuVar.zze(str);
        zzmuVar.zzc(discoveryOptions);
        zzmuVar.zza(zzggVar);
        ((zzkd) getService()).zzl(zzmuVar.zzf());
    }

    public final void zzD() throws RemoteException {
        ((zzkd) getService()).zzm(new zzmy());
    }

    public final void zzE() throws RemoteException {
        ((zzkd) getService()).zzn(new zzna());
    }

    public final void zzF() throws RemoteException {
        ((zzkd) getService()).zzo(new zznc());
    }

    public final void zzr(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzgu zzguVar = new zzgu(getContext(), listenerHolder, this.zzk);
        this.zzg.add(zzguVar);
        zzfh zzfhVar = new zzfh();
        zzfhVar.zze(new zzgv(resultHolder));
        zzfhVar.zzd(str);
        zzfhVar.zzc(zzguVar);
        ((zzkd) getService()).zzd(zzfhVar.zzf());
    }

    public final void zzs(BaseImplementation.ResultHolder resultHolder, long j) throws RemoteException {
        zzfl zzflVar = new zzfl();
        zzflVar.zzb(new zzgv(resultHolder));
        zzflVar.zza(j);
        ((zzkd) getService()).zze(zzflVar.zzc());
    }

    public final void zzt(String str) throws RemoteException {
        zzjj zzjjVar = new zzjj();
        zzjjVar.zza(str);
        ((zzkd) getService()).zzg(zzjjVar.zzb());
    }

    public final void zzu(BaseImplementation.ResultHolder resultHolder, String str) throws RemoteException {
        zzme zzmeVar = new zzme();
        zzmeVar.zzb(new zzgv(resultHolder));
        zzmeVar.zza(str);
        ((zzkd) getService()).zzh(zzmeVar.zzc());
    }

    public final void zzv(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.zzi.add(zzfxVar);
        zzmi zzmiVar = new zzmi();
        zzmiVar.zzi(new zzgv(resultHolder));
        zzmiVar.zzf(str);
        zzmiVar.zzh(str2);
        zzmiVar.zzb(zzfxVar);
        ((zzkd) getService()).zzi(zzmiVar.zzj());
    }

    public final void zzw(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.zzi.add(zzfxVar);
        zzmi zzmiVar = new zzmi();
        zzmiVar.zzi(new zzgv(resultHolder));
        zzmiVar.zzd(bArr);
        zzmiVar.zzh(str);
        zzmiVar.zzb(zzfxVar);
        ((zzkd) getService()).zzi(zzmiVar.zzj());
    }

    public final void zzx(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.zzi.add(zzfxVar);
        zzmi zzmiVar = new zzmi();
        zzmiVar.zzi(new zzgv(resultHolder));
        zzmiVar.zzf(str);
        zzmiVar.zzh(str2);
        zzmiVar.zzb(zzfxVar);
        zzmiVar.zzg(connectionOptions);
        ((zzkd) getService()).zzi(zzmiVar.zzj());
    }

    public final void zzy(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) throws RemoteException {
        zzfx zzfxVar = new zzfx(listenerHolder);
        this.zzi.add(zzfxVar);
        zzmi zzmiVar = new zzmi();
        zzmiVar.zzi(new zzgv(resultHolder));
        zzmiVar.zzd(bArr);
        zzmiVar.zzh(str);
        zzmiVar.zzb(zzfxVar);
        zzmiVar.zzg(connectionOptions);
        ((zzkd) getService()).zzi(zzmiVar.zzj());
    }

    public final void zzz(BaseImplementation.ResultHolder resultHolder, String[] strArr, Payload payload, boolean z) throws RemoteException {
        Pair pair;
        try {
            int type = payload.getType();
            if (type == 1) {
                zzlz zzlzVar = new zzlz();
                zzlzVar.zzd(payload.getId());
                zzlzVar.zzm(payload.getType());
                byte[] asBytes = payload.asBytes();
                if (asBytes == null || asBytes.length <= 32768) {
                    zzlzVar.zza(asBytes);
                } else {
                    zzlv zzlvVar = new zzlv();
                    zzlvVar.zza(asBytes);
                    zzlzVar.zzk(zzlvVar.zzb());
                    zzlzVar.zza(Arrays.copyOf(asBytes, 32768));
                }
                pair = Pair.create(zzlzVar.zzn(), zzsc.zzc());
            } else if (type == 2) {
                Payload.File asFile = payload.asFile();
                zzsg.zzc(asFile, "File cannot be null for Payload.Type.FILE");
                File asJavaFile = asFile.asJavaFile();
                String absolutePath = asJavaFile == null ? null : asJavaFile.getAbsolutePath();
                zzlz zzlzVar2 = new zzlz();
                zzlzVar2.zzd(payload.getId());
                zzlzVar2.zzm(payload.getType());
                zzlzVar2.zzb(asFile.asParcelFileDescriptor());
                zzlzVar2.zzf(absolutePath);
                zzlzVar2.zzg(asFile.getSize());
                zzlzVar2.zzh(payload.getOffset());
                zzlzVar2.zze(payload.zzf());
                zzlzVar2.zzj(0L);
                zzlzVar2.zzc(payload.zzd());
                zzlzVar2.zzi(payload.zze());
                pair = Pair.create(zzlzVar2.zzn(), zzsc.zzc());
            } else if (type == 3) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                    zzlz zzlzVar3 = new zzlz();
                    zzlzVar3.zzd(payload.getId());
                    zzlzVar3.zzm(payload.getType());
                    zzlzVar3.zzb(createPipe[0]);
                    zzlzVar3.zzl(createPipe2[0]);
                    zzlzVar3.zzh(payload.getOffset());
                    zzlzVar3.zzj(0L);
                    pair = Pair.create(zzlzVar3.zzn(), zzsc.zzd(Pair.create(createPipe[1], createPipe2[1])));
                } catch (IOException e) {
                    Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(payload.getId())), e);
                    throw e;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(payload.getId()), Integer.valueOf(payload.getType())));
                Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                throw illegalArgumentException;
            }
            zzmm zzmmVar = new zzmm();
            zzmmVar.zzc(new zzgv(resultHolder));
            zzmmVar.zzb(strArr);
            zzmmVar.zza((zzmb) pair.first);
            ((zzkd) getService()).zzj(zzmmVar.zzd());
            if (!((zzsc) pair.second).zzb()) {
                return;
            }
            Object zza = ((zzsc) pair.second).zza();
            zzlt zzltVar = this.zzk;
            if (zzltVar == null) {
                return;
            }
            Pair pair2 = (Pair) zza;
            zzltVar.zzc(((Payload.Stream) Preconditions.checkNotNull(payload.asStream())).asInputStream(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.second), (zzmb) pair.first, payload.getId());
        } catch (IOException e2) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
            resultHolder.setResult(zzG(ConnectionsStatusCodes.STATUS_PAYLOAD_IO_ERROR));
        }
    }
}
