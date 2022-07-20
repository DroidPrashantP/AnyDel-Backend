package com.quadvision.anydel.backend.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006J(\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001eJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010!JN\u0010\"\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&J\u001a\u0010*\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010$\u001a\u0004\u0018\u00010\u001cJ\"\u0010+\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\u001cR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/quadvision/anydel/backend/utils/DialogUtils;", "", "()V", "mProgressDialog", "Landroid/app/Dialog;", "editPackageSizeAndWeight", "", "context", "Landroid/content/Context;", "packageInfo", "Lcom/quadvision/anydel/backend/data/model/PackageInfo;", "packageWeightSizeChangeListener", "Lcom/quadvision/anydel/backend/ui/detail/PackageWeightSizeChangeListener;", "hideProgressDialog", "selectCityDialog", "cityList", "", "Lcom/quadvision/anydel/backend/data/model/City;", "cityListener", "Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityListAdapterListener;", "setTheAssignedToOptions", "optionList", "", "Lcom/quadvision/anydel/backend/data/model/UserType;", "assignedToOptionListListener", "Lcom/quadvision/anydel/backend/ui/detail/AssignedToOptionListAdapter$AssignedToOptionListListener;", "setThePackageStatus", "statusList", "", "packageStatusListener", "Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$PackageStatusAdapterListener;", "showContactNumberDialog", "dialogActionListener", "Lcom/quadvision/anydel/backend/ui/login/DialogActionListener;", "showCustomDialog", "title", "message", "isPositiveAction", "", "isCancelable", "showImage", "isCancelBtnRequired", "showProgressDialog", "showRatingDialog", "Lcom/quadvision/anydel/backend/ui/login/DialogSubmitRatingActionListener;", "packId", "app_release"})
public final class DialogUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.utils.DialogUtils INSTANCE = null;
    private static android.app.Dialog mProgressDialog;
    
    private DialogUtils() {
        super();
    }
    
    public final void showCustomDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, boolean isPositiveAction, boolean isCancelable, @org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.login.DialogActionListener dialogActionListener, boolean showImage, boolean isCancelBtnRequired) {
    }
    
    public final void showRatingDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.login.DialogSubmitRatingActionListener dialogActionListener, @org.jetbrains.annotations.NotNull()
    java.lang.String packId) {
    }
    
    public final void showContactNumberDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.login.DialogActionListener dialogActionListener) {
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void selectCityDialog(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<com.quadvision.anydel.backend.data.model.City> cityList, @org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityListAdapterListener cityListener) {
    }
    
    public final void setThePackageStatus(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> statusList, @org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.PackageStatusAdapterListener packageStatusListener) {
    }
    
    public final void setTheAssignedToOptions(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.quadvision.anydel.backend.data.model.UserType> optionList, @org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.detail.AssignedToOptionListAdapter.AssignedToOptionListListener assignedToOptionListListener) {
    }
    
    public final void editPackageSizeAndWeight(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.PackageInfo packageInfo, @org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.detail.PackageWeightSizeChangeListener packageWeightSizeChangeListener) {
    }
}