package com.quadvision.anydel.backend.ui.login.data;

import java.lang.System;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/quadvision/anydel/backend/ui/login/data/LoginRepository;", "", "dataSource", "Lcom/quadvision/anydel/backend/ui/login/data/LoginDataSource;", "(Lcom/quadvision/anydel/backend/ui/login/data/LoginDataSource;)V", "getDataSource", "()Lcom/quadvision/anydel/backend/ui/login/data/LoginDataSource;", "forgotPasswordOtpRequest", "Lretrofit2/Response;", "Lcom/quadvision/anydel/backend/data/model/RegisterUser;", "otpVerifyPayload", "Lcom/quadvision/anydel/backend/data/model/OtpVerifyPayload;", "(Lcom/quadvision/anydel/backend/data/model/OtpVerifyPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/quadvision/anydel/backend/data/model/User;", "loginPayload", "Lcom/quadvision/anydel/backend/data/model/LoginPayload;", "(Lcom/quadvision/anydel/backend/data/model/LoginPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class LoginRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.quadvision.anydel.backend.ui.login.data.LoginDataSource dataSource = null;
    
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.login.data.LoginDataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quadvision.anydel.backend.ui.login.data.LoginDataSource getDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.LoginPayload loginPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object forgotPasswordOtpRequest(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.OtpVerifyPayload otpVerifyPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.RegisterUser>> continuation) {
        return null;
    }
}