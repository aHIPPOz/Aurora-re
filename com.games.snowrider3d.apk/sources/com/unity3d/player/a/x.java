package com.unity3d.player.a;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.view.ViewCompat;
/* loaded from: classes2.dex */
public final class x implements Runnable {
    public final /* synthetic */ y a;

    public x(y yVar) {
        this.a = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(ViewCompat.MEASURED_STATE_MASK), new BitmapDrawable(this.a.b.getResources(), this.a.b.a)}));
    }
}
