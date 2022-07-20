package com.quadvision.anydel.backend.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000402J\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000402J\f\u00104\u001a\b\u0012\u0004\u0012\u00020502R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/quadvision/anydel/backend/utils/AnyDelConstant;", "", "()V", "ABOUT_US_LINK", "", "BUILD_TYPE_DEBUG", "BUILD_TYPE_RELEASE", "BUNDLE_IMAGE_URL", "CALCULATION", "CANCELLED", "CARD_SWIPED", "CASH_COLLECTED", "COMPLETED", "COMPLETE_PAYMENT", "CONFIRM_DIMENSION", "CONFIRM_PURCHASED_AMOUNT", "DELIVERED", "DELIVERY_COMPLETED", "DELIVERY_IMAGE_UPLOADING", "DRAFT", "EMPTY", "Google_Place_API_key", "MAP", "MAX_IMAGE_SIZE_TWO_MB", "", "ON_THE_WAY", "PAYMENT_PENDING", "PAYMENT_RECEIVED", "PAYMENT_STATUS_LIST", "", "getPAYMENT_STATUS_LIST", "()[Ljava/lang/String;", "[Ljava/lang/String;", "PENDING", "PENDING_STATUS_LIST", "getPENDING_STATUS_LIST", "PREPARING_PACKAGE", "PRIVACY_LINK", "PROFILE_IMAGE_UPLOADING", "QR_CODE", "REGISTRATION", "REJECTED", "RESETPWD", "SERVICE_IMAGE_UPLOADING", "TERM_AND_COND_LINK", "TYPE_ADDRESS", "UPDATE_PURCHASE_AMOUNT", "USER_ROLE_DELIVERY_BOYS", "USER_ROLE_SUPERVISOR", "getDelBoyStatusList", "", "getStatusList", "getTrackingStepList", "Lcom/quadvision/anydel/backend/data/model/TrackStepItem;", "app_release"})
public final class AnyDelConstant {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.utils.AnyDelConstant INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ROLE_SUPERVISOR = "Supervisor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ROLE_DELIVERY_BOYS = "Delboy";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String Google_Place_API_key = "AIzaSyAGuif15sGxCpMITTAB144kTe8jRR0vw54";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ABOUT_US_LINK = "https://anydel.in/pages/AboutUs.html";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TERM_AND_COND_LINK = "https://anydel.in/pages/TermConditions.pdf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRIVACY_LINK = "https://anydel.in/pages/PrivacyPolicy.pdf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPTY = "";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_ADDRESS = "Type Address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAP = "Map";
    public static final int MAX_IMAGE_SIZE_TWO_MB = 2097152;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESETPWD = "RESETPWD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGISTRATION = "REGISTRATION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BUNDLE_IMAGE_URL = "image_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BUILD_TYPE_DEBUG = "debug";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BUILD_TYPE_RELEASE = "release";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DRAFT = "DRAFT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PENDING = "PENDING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CALCULATION = "CALCULATION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PURCHASE_AMOUNT = "UPDATE PURCHASED AMOUNT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONFIRM_DIMENSION = "CONFIRM DIMENSION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONFIRM_PURCHASED_AMOUNT = "CONFIRM PURCHASED AMOUNT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREPARING_PACKAGE = "PREPARING PACKAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_PENDING = "PAYMENT PENDING";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ON_THE_WAY = "ON THE WAY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CASH_COLLECTED = "CASH COLLECTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CARD_SWIPED = "CARD SWIPED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QR_CODE = "QR CODE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMPLETE_PAYMENT = "COMPLETE PAYMENT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_RECEIVED = "PAYMENT RECEIVED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELIVERED = "DELIVERED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELIVERY_COMPLETED = "DELIVERY COMPLETED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMPLETED = "COMPLETED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REJECTED = "REJECTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CANCELLED = "CANCELLED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELIVERY_IMAGE_UPLOADING = "Delivery";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_IMAGE_UPLOADING = "Service";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROFILE_IMAGE_UPLOADING = "Profile";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] PENDING_STATUS_LIST = {"DRAFT", "PENDING", "CALCULATION", "UPDATE PURCHASED AMOUNT", "CONFIRM DIMENSION"};
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] PAYMENT_STATUS_LIST = {"CASH COLLECTED", "CARD SWIPED", "QR CODE", "COMPLETE PAYMENT"};
    
    private AnyDelConstant() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPENDING_STATUS_LIST() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPAYMENT_STATUS_LIST() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.quadvision.anydel.backend.data.model.TrackStepItem> getTrackingStepList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getStatusList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDelBoyStatusList() {
        return null;
    }
}