package com.quadvision.anydel.backend.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/quadvision/anydel/backend/data/model/PackageDetail;", "", "packageData", "", "Lcom/quadvision/anydel/backend/data/model/PackageInfo;", "statusMessage", "", "(Ljava/util/List;Ljava/lang/String;)V", "getPackageData", "()Ljava/util/List;", "getStatusMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class PackageDetail {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "packages", alternate = {"package"})
    private final java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> packageData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String statusMessage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quadvision.anydel.backend.data.model.PackageDetail copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> packageData, @org.jetbrains.annotations.Nullable()
    java.lang.String statusMessage) {
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
    
    public PackageDetail(@org.jetbrains.annotations.Nullable()
    java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> packageData, @org.jetbrains.annotations.Nullable()
    java.lang.String statusMessage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> getPackageData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusMessage() {
        return null;
    }
}