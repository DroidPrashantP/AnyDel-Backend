package com.quadvision.anydel.backend.data.model;

import java.lang.System;

/**
 * Authentication result : success (user details) or error message.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/quadvision/anydel/backend/data/model/APIDataResult;", "", "success", "Lcom/quadvision/anydel/backend/data/model/RegisterUser;", "error", "", "(Lcom/quadvision/anydel/backend/data/model/RegisterUser;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getSuccess", "()Lcom/quadvision/anydel/backend/data/model/RegisterUser;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class APIDataResult {
    @org.jetbrains.annotations.Nullable()
    private final com.quadvision.anydel.backend.data.model.RegisterUser success = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    /**
     * Authentication result : success (user details) or error message.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.quadvision.anydel.backend.data.model.APIDataResult copy(@org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.data.model.RegisterUser success, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    /**
     * Authentication result : success (user details) or error message.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Authentication result : success (user details) or error message.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Authentication result : success (user details) or error message.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public APIDataResult() {
        super();
    }
    
    public APIDataResult(@org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.data.model.RegisterUser success, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quadvision.anydel.backend.data.model.RegisterUser component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quadvision.anydel.backend.data.model.RegisterUser getSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
}