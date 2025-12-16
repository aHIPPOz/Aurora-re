package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.internal.zzl;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public class IBeaconId {
    public static final int LENGTH = 20;
    private final zzl zza;

    public IBeaconId(UUID uuid, short s, short s2) {
        this.zza = new zzl(uuid, Short.valueOf(s), Short.valueOf(s2));
    }

    public static IBeaconId from(Message message) {
        boolean zza = message.zza(Message.MESSAGE_TYPE_I_BEACON_ID);
        String type = message.getType();
        Preconditions.checkArgument(zza, "Message type '" + type + "' is not Message.MESSAGE_TYPE_I_BEACON_ID");
        return new IBeaconId(message.getContent());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IBeaconId) {
            return Objects.equal(this.zza, ((IBeaconId) obj).zza);
        }
        return false;
    }

    public short getMajor() {
        return this.zza.zze().shortValue();
    }

    public short getMinor() {
        return this.zza.zzf().shortValue();
    }

    public UUID getProximityUuid() {
        return this.zza.zzg();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public String toString() {
        String valueOf = String.valueOf(getProximityUuid());
        short major = getMajor();
        short minor = getMinor();
        return "IBeaconId{proximityUuid=" + valueOf + ", major=" + ((int) major) + ", minor=" + ((int) minor) + "}";
    }

    public IBeaconId(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 20, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.zza = new zzl(bArr);
    }
}
