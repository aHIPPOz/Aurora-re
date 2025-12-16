package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class NotificationApiHelperForM {
    public static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }

    private NotificationApiHelperForM() {
    }
}
