package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes.dex */
public final class zzad extends zza {
    private final TaskCompletionSource zza;

    public zzad(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zzh(DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 0 || statusCode == 3) {
            PlayerBuffer playerBuffer = new PlayerBuffer(dataHolder);
            try {
                boolean z = false;
                PlayerEntity playerEntity = playerBuffer.getCount() > 0 ? new PlayerEntity(playerBuffer.get(0)) : null;
                if (statusCode == 3) {
                    z = true;
                }
                this.zza.setResult(new AnnotatedData(playerEntity, z));
                return;
            } finally {
                playerBuffer.release();
            }
        }
        GamesStatusUtils.zzb(this.zza, statusCode);
        dataHolder.close();
    }
}
