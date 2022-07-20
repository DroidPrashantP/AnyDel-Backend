package com.quadvision.anydel.backend.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/quadvision/anydel/backend/data/api/ApiClient;", "", "()V", "DEBUG_DYNAMIC_PATH", "", "getDEBUG_DYNAMIC_PATH", "()Ljava/lang/String;", "setDEBUG_DYNAMIC_PATH", "(Ljava/lang/String;)V", "DEBUG_PORT_PREFIX", "RELEASE_DYNAMIC_PATH", "getRELEASE_DYNAMIC_PATH", "setRELEASE_DYNAMIC_PATH", "RELEASE_PORT_PREFIX", "dynamicPath", "getDynamicPath", "setDynamicPath", "retrofitClient", "Lretrofit2/Retrofit$Builder;", "getRetrofitClient", "()Lretrofit2/Retrofit$Builder;", "retrofitClient$delegate", "Lkotlin/Lazy;", "serverUrl", "getDynamicUrlRetrofitBuilder", "Lcom/quadvision/anydel/backend/data/api/ApiHelper;", "port", "app_release"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.data.api.ApiClient INSTANCE = null;
    private static java.lang.String serverUrl = "https://quadvisionllp.com";
    private static java.lang.String RELEASE_PORT_PREFIX = "8";
    private static java.lang.String DEBUG_PORT_PREFIX = "8";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String RELEASE_DYNAMIC_PATH = "adl";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String DEBUG_DYNAMIC_PATH = "adl";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy retrofitClient$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String dynamicPath;
    
    private ApiClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRELEASE_DYNAMIC_PATH() {
        return null;
    }
    
    public final void setRELEASE_DYNAMIC_PATH(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDEBUG_DYNAMIC_PATH() {
        return null;
    }
    
    public final void setDEBUG_DYNAMIC_PATH(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit.Builder getRetrofitClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quadvision.anydel.backend.data.api.ApiHelper getDynamicUrlRetrofitBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String port) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDynamicPath() {
        return null;
    }
    
    public final void setDynamicPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}