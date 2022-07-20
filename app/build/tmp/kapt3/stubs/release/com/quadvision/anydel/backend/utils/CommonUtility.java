package com.quadvision.anydel.backend.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u001a\u0010\u0019\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/quadvision/anydel/backend/utils/CommonUtility;", "", "()V", "fromHtml", "Landroid/text/Spanned;", "text", "", "getCompleteAddress", "address", "Lcom/quadvision/anydel/backend/data/model/Address;", "getFormattedTime", "rawTime", "getGoodMorningMsg", "getUserData", "Lcom/quadvision/anydel/backend/data/model/UserInfo;", "getUserMobileData", "hideKeyboard", "", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "isNetworkAvailable", "", "isUserSuperAdmin", "openExternalBrowser", "url", "app_release"})
public final class CommonUtility {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.utils.CommonUtility INSTANCE = null;
    
    private CommonUtility() {
        super();
    }
    
    /**
     * Function for check the network connectivity
     *
     * @return true if network Available otherwise false
     */
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quadvision.anydel.backend.data.model.UserInfo getUserData() {
        return null;
    }
    
    public final boolean isUserSuperAdmin() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserMobileData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoodMorningMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompleteAddress(@org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.data.model.Address address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedTime(@org.jetbrains.annotations.Nullable()
    java.lang.String rawTime) {
        return null;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public final void openExternalBrowser(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
}