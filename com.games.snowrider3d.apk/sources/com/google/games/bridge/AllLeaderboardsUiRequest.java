package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.tasks.Task;
/* loaded from: classes2.dex */
class AllLeaderboardsUiRequest extends SimpleUiRequest {
    private static final String TAG = "AllLeaderboardsUiRequest";

    @Override // com.google.games.bridge.SimpleUiRequest
    protected Task<Intent> getIntent(Activity activity) {
        return PlayGames.getLeaderboardsClient(activity).getAllLeaderboardsIntent();
    }
}
