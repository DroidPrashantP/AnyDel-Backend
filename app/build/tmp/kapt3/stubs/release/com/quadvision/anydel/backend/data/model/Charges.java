package com.quadvision.anydel.backend.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006&"}, d2 = {"Lcom/quadvision/anydel/backend/data/model/Charges;", "", "basicDelAmt", "", "basicKm", "", "discountAmt", "extraDelAmt", "extraKm", "finalDelAmt", "tax", "totalKm", "(DLjava/lang/String;DDLjava/lang/String;DDLjava/lang/String;)V", "getBasicDelAmt", "()D", "getBasicKm", "()Ljava/lang/String;", "getDiscountAmt", "getExtraDelAmt", "getExtraKm", "getFinalDelAmt", "getTax", "getTotalKm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class Charges {
    private final double basicDelAmt = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String basicKm = null;
    private final double discountAmt = 0.0;
    private final double extraDelAmt = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String extraKm = null;
    private final double finalDelAmt = 0.0;
    private final double tax = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String totalKm = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quadvision.anydel.backend.data.model.Charges copy(double basicDelAmt, @org.jetbrains.annotations.NotNull()
    java.lang.String basicKm, double discountAmt, double extraDelAmt, @org.jetbrains.annotations.NotNull()
    java.lang.String extraKm, double finalDelAmt, double tax, @org.jetbrains.annotations.NotNull()
    java.lang.String totalKm) {
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
    
    public Charges(double basicDelAmt, @org.jetbrains.annotations.NotNull()
    java.lang.String basicKm, double discountAmt, double extraDelAmt, @org.jetbrains.annotations.NotNull()
    java.lang.String extraKm, double finalDelAmt, double tax, @org.jetbrains.annotations.NotNull()
    java.lang.String totalKm) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getBasicDelAmt() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBasicKm() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getDiscountAmt() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getExtraDelAmt() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExtraKm() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getFinalDelAmt() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getTax() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalKm() {
        return null;
    }
}