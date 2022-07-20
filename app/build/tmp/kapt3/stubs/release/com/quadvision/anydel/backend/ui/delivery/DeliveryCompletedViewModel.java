package com.quadvision.anydel.backend.ui.delivery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedViewModel;", "Landroidx/lifecycle/ViewModel;", "homeRepository", "Lcom/quadvision/anydel/backend/ui/home/HomeRepository;", "(Lcom/quadvision/anydel/backend/ui/home/HomeRepository;)V", "_deliveryCompletedResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/quadvision/anydel/backend/ui/home/DataResult;", "deliveryCompletedResult", "Landroidx/lifecycle/LiveData;", "getDeliveryCompletedResult", "()Landroidx/lifecycle/LiveData;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "getDeliveryCompletedList", "", "packageDetailPayload", "Lcom/quadvision/anydel/backend/data/model/PackageListDetailPayload;", "onCleared", "app_release"})
public final class DeliveryCompletedViewModel extends androidx.lifecycle.ViewModel {
    private final com.quadvision.anydel.backend.ui.home.HomeRepository homeRepository = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<com.quadvision.anydel.backend.ui.home.DataResult> _deliveryCompletedResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> deliveryCompletedResult = null;
    
    public DeliveryCompletedViewModel(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> getDeliveryCompletedResult() {
        return null;
    }
    
    public final void getDeliveryCompletedList(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.PackageListDetailPayload packageDetailPayload) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}