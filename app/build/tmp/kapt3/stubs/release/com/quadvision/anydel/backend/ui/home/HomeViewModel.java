package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u0015\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0019H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeRepository", "Lcom/quadvision/anydel/backend/ui/home/HomeRepository;", "(Lcom/quadvision/anydel/backend/ui/home/HomeRepository;)V", "_pendingDeliveryResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/quadvision/anydel/backend/ui/home/DataResult;", "_userConfig", "_userProfileResult", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "pendingDeliveryResult", "Landroidx/lifecycle/LiveData;", "getPendingDeliveryResult", "()Landroidx/lifecycle/LiveData;", "userConfig", "getUserConfig", "userProfileResult", "getUserProfileResult", "getPendingDeliveryList", "", "packageDetailPayload", "Lcom/quadvision/anydel/backend/data/model/PackageListDetailPayload;", "getUserProfile", "profilePayload", "Lcom/quadvision/anydel/backend/data/model/ProfilePayload;", "onCleared", "app_release"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.quadvision.anydel.backend.ui.home.HomeRepository homeRepository = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<com.quadvision.anydel.backend.ui.home.DataResult> _pendingDeliveryResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> pendingDeliveryResult = null;
    private final androidx.lifecycle.MutableLiveData<com.quadvision.anydel.backend.ui.home.DataResult> _userProfileResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> userProfileResult = null;
    private final androidx.lifecycle.MutableLiveData<com.quadvision.anydel.backend.ui.home.DataResult> _userConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> userConfig = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.home.HomeRepository homeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> getPendingDeliveryResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> getUserProfileResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> getUserConfig() {
        return null;
    }
    
    public final void getUserProfile(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.ProfilePayload profilePayload) {
    }
    
    public final void getUserConfig() {
    }
    
    public final void getPendingDeliveryList(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.PackageListDetailPayload packageDetailPayload) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}