package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* renamed from: com.unity3d.player.p */
/* loaded from: classes2.dex */
public final class C0096p implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            FirebaseIdentifiersHelper.nativeOnFirebaseAppInstanceIdResult((String) task.getResult());
        } else {
            FirebaseIdentifiersHelper.nativeOnFirebaseAppInstanceIdResult(null);
        }
    }
}
