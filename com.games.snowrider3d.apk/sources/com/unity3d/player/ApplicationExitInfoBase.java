package com.unity3d.player;

import java.text.SimpleDateFormat;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class ApplicationExitInfoBase {
    public abstract int describeContents();

    public abstract int getDefiningUid();

    public abstract String getDescription();

    public abstract int getImportance();

    public abstract int getPackageUid();

    public abstract int getPid();

    public abstract String getProcessName();

    public abstract byte[] getProcessStateSummary();

    public abstract long getPss();

    public abstract int getRealUid();

    public abstract int getReason();

    public abstract long getRss();

    public abstract int getStatus();

    public abstract long getTimestamp();

    public abstract byte[] getTrace();

    public abstract String getTraceString();

    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo [");
        sb.append(hashCode()).append("]");
        sb.append(System.lineSeparator()).append("{");
        long timestamp = getTimestamp();
        sb.append(System.lineSeparator()).append("timestamp : ").append(timestamp);
        sb.append(System.lineSeparator()).append("date : ").append(new SimpleDateFormat("yyyy MM dd HH:mm:ss").format(Long.valueOf(timestamp)));
        sb.append(System.lineSeparator()).append("pid : ").append(getPid());
        sb.append(System.lineSeparator()).append("realUid : ").append(getRealUid());
        sb.append(System.lineSeparator()).append("packageUid : ").append(getPackageUid());
        sb.append(System.lineSeparator()).append("definingUid : ").append(getDefiningUid());
        sb.append(System.lineSeparator()).append("process : ").append(getProcessName());
        sb.append(System.lineSeparator()).append("reason : ").append(getReason());
        sb.append(System.lineSeparator()).append("status : ").append(getStatus());
        sb.append(System.lineSeparator()).append("importance : ").append(getImportance());
        sb.append(System.lineSeparator()).append("pss : ").append(getPss());
        sb.append(System.lineSeparator()).append("rss : ").append(getRss());
        sb.append(System.lineSeparator()).append("description : ").append(getDescription());
        byte[] processStateSummary = getProcessStateSummary();
        String str = "empty";
        sb.append(System.lineSeparator()).append("state : ").append((processStateSummary == null || processStateSummary.length == 0) ? str : Integer.toString(processStateSummary.length) + " bytes");
        byte[] trace = getTrace();
        StringBuilder append = sb.append(System.lineSeparator()).append("trace : ");
        if (trace != null) {
            str = Integer.toString(trace.length) + " bytes";
        }
        append.append(str);
        sb.append(System.lineSeparator()).append("}");
        return sb.toString();
    }

    public int hashCode() {
        int realUid = getRealUid();
        int packageUid = getPackageUid();
        int definingUid = getDefiningUid();
        int reason = getReason();
        int importance = getImportance();
        int status = getStatus();
        int hashCode = Long.hashCode(getTimestamp());
        int hashCode2 = Objects.hashCode(getProcessName());
        return Objects.hashCode(getDescription()) + ((hashCode2 + ((hashCode + ((((((status + ((importance + ((reason + ((definingUid + ((packageUid + ((realUid + (getPid() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) getPss())) * 31) + ((int) getRss())) * 31)) * 31)) * 31);
    }
}
