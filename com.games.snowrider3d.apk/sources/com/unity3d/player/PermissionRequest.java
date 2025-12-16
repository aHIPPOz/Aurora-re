package com.unity3d.player;
/* loaded from: classes2.dex */
public class PermissionRequest {
    static final int DENIED = 2;
    static final int DENIED_DONT_ASK_AGAIN = 3;
    static final int GRANTED = 1;
    private IPermissionRequestCallbacks mCallbacks;
    private String[] mPermissionNames;

    public PermissionRequest(String[] strArr, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.mPermissionNames = strArr;
        this.mCallbacks = iPermissionRequestCallbacks;
    }

    public String[] getPermissionNames() {
        return this.mPermissionNames;
    }

    public void permissionResponse(String[] strArr, int[] iArr) {
        IPermissionRequestCallbacks iPermissionRequestCallbacks = this.mCallbacks;
        if (iPermissionRequestCallbacks == null) {
            return;
        }
        iPermissionRequestCallbacks.onPermissionResult(strArr, iArr);
    }
}
