package com.quadvision.anydel.backend.data.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008e\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000f\b\u0002\u0010\u000f\u001a\t\u0018\u00010\u0010\u00a2\u0006\u0002\b\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010:\u001a\t\u0018\u00010\u0010\u00a2\u0006\u0002\b\u0011H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\t\u0010A\u001a\u00020\bH\u00c6\u0003J\t\u0010B\u001a\u00020\bH\u00c6\u0003J\t\u0010C\u001a\u00020\bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ac\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000f\b\u0002\u0010\u000f\u001a\t\u0018\u00010\u0010\u00a2\u0006\u0002\b\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010F\u001a\u00020\bH\u00d6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010J\u001a\u00020\bH\u00d6\u0001J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\bH\u00d6\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R!\u0010\u000f\u001a\t\u0018\u00010\u0010\u00a2\u0006\u0002\b\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018\u00a8\u0006Q"}, d2 = {"Lcom/quadvision/anydel/backend/data/model/UpdatePackageDetailPayload;", "Landroid/os/Parcelable;", "mobileNo", "", "custMobileNo", "packId", "packChangeStatus", "packWeight", "", "packLength", "packBreadth", "packHeight", "rejectReason", "assignedTo", "assignedBy", "picList", "", "Lkotlinx/android/parcel/RawValue;", "pickContactNo", "dropContactNo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getAssignedBy", "()Ljava/lang/String;", "setAssignedBy", "(Ljava/lang/String;)V", "getAssignedTo", "setAssignedTo", "getCustMobileNo", "setCustMobileNo", "getDropContactNo", "setDropContactNo", "getMobileNo", "setMobileNo", "getPackBreadth", "()I", "setPackBreadth", "(I)V", "getPackChangeStatus", "setPackChangeStatus", "getPackHeight", "setPackHeight", "getPackId", "setPackId", "getPackLength", "setPackLength", "getPackWeight", "setPackWeight", "getPicList", "()Ljava/lang/Object;", "setPicList", "(Ljava/lang/Object;)V", "getPickContactNo", "setPickContactNo", "getRejectReason", "setRejectReason", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"})
public final class UpdatePackageDetailPayload implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mobileNo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String custMobileNo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String packChangeStatus;
    private int packWeight;
    private int packLength;
    private int packBreadth;
    private int packHeight;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rejectReason;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String assignedTo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String assignedBy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object picList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pickContactNo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dropContactNo;
    public static final android.os.Parcelable.Creator<com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload copy(@org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String custMobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String packId, @org.jetbrains.annotations.Nullable()
    java.lang.String packChangeStatus, int packWeight, int packLength, int packBreadth, int packHeight, @org.jetbrains.annotations.Nullable()
    java.lang.String rejectReason, @org.jetbrains.annotations.Nullable()
    java.lang.String assignedTo, @org.jetbrains.annotations.Nullable()
    java.lang.String assignedBy, @org.jetbrains.annotations.Nullable()
    java.lang.Object picList, @org.jetbrains.annotations.Nullable()
    java.lang.String pickContactNo, @org.jetbrains.annotations.Nullable()
    java.lang.String dropContactNo) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UpdatePackageDetailPayload(@org.jetbrains.annotations.NotNull()
    java.lang.String mobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String custMobileNo, @org.jetbrains.annotations.Nullable()
    java.lang.String packId, @org.jetbrains.annotations.Nullable()
    java.lang.String packChangeStatus, int packWeight, int packLength, int packBreadth, int packHeight, @org.jetbrains.annotations.Nullable()
    java.lang.String rejectReason, @org.jetbrains.annotations.Nullable()
    java.lang.String assignedTo, @org.jetbrains.annotations.Nullable()
    java.lang.String assignedBy, @org.jetbrains.annotations.Nullable()
    java.lang.Object picList, @org.jetbrains.annotations.Nullable()
    java.lang.String pickContactNo, @org.jetbrains.annotations.Nullable()
    java.lang.String dropContactNo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileNo() {
        return null;
    }
    
    public final void setMobileNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustMobileNo() {
        return null;
    }
    
    public final void setCustMobileNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackId() {
        return null;
    }
    
    public final void setPackId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackChangeStatus() {
        return null;
    }
    
    public final void setPackChangeStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getPackWeight() {
        return 0;
    }
    
    public final void setPackWeight(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getPackLength() {
        return 0;
    }
    
    public final void setPackLength(int p0) {
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPackBreadth() {
        return 0;
    }
    
    public final void setPackBreadth(int p0) {
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getPackHeight() {
        return 0;
    }
    
    public final void setPackHeight(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRejectReason() {
        return null;
    }
    
    public final void setRejectReason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAssignedTo() {
        return null;
    }
    
    public final void setAssignedTo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAssignedBy() {
        return null;
    }
    
    public final void setAssignedBy(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPicList() {
        return null;
    }
    
    public final void setPicList(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickContactNo() {
        return null;
    }
    
    public final void setPickContactNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDropContactNo() {
        return null;
    }
    
    public final void setDropContactNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload[] newArray(int size) {
            return null;
        }
    }
}