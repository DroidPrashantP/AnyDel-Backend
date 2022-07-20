package com.quadvision.anydel.backend.ui.login.data;

import java.lang.System;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/quadvision/anydel/backend/ui/login/data/LoginDataSource;", "", "()V", "forgotPasswordOtpRequest", "Lretrofit2/Response;", "Lcom/quadvision/anydel/backend/data/model/RegisterUser;", "otpVerifyPayload", "Lcom/quadvision/anydel/backend/data/model/OtpVerifyPayload;", "(Lcom/quadvision/anydel/backend/data/model/OtpVerifyPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/quadvision/anydel/backend/data/model/User;", "loginPayload", "Lcom/quadvision/anydel/backend/data/model/LoginPayload;", "(Lcom/quadvision/anydel/backend/data/model/LoginPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class LoginDataSource {
    
    public LoginDataSource() {
        super();
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