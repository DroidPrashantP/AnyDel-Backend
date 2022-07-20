package com.quadvision.anydel.backend.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/quadvision/anydel/backend/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "homeRepository", "Lcom/quadvision/anydel/backend/ui/home/HomeRepository;", "(Lcom/quadvision/anydel/backend/ui/home/HomeRepository;)V", "_editProfileResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/quadvision/anydel/backend/ui/home/DataResult;", "_fileUploadResult", "editProfileResult", "Landroidx/lifecycle/LiveData;", "getEditProfileResult", "()Landroidx/lifecycle/LiveData;", "fileUploadResult", "getFileUploadResult", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "onCleared", "", "updateImageFile", "multiPartRequestPayload", "Lcom/quadvision/anydel/backend/data/model/MultiPartRequestPayload;", "updateUserProfile", "editProfilePayload", "Lcom/quadvision/anydel/backend/data/model/EditProfilePayload;", "app_release"})
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    private final com.quadvision.anydel.backend.ui.home.HomeRepository homeRepository = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job job;
    private final androidx.lifecycle.MutableLiveData<com.quadvision.anydel.backend.ui.home.DataResult> _editProfileResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> editProfileResult = null;
    private final androidx.lifecycle.MutableLiveData<com.quadvision.anydel.backend.ui.home.DataResult> _fileUploadResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> fileUploadResult = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> getEditProfileResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.quadvision.anydel.backend.ui.home.DataResult> getFileUploadResult() {
        return null;
    }
    
    public final void updateImageFile(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.MultiPartRequestPayload multiPartRequestPayload) {
    }
    
    public final void updateUserProfile(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.EditProfilePayload editProfilePayload) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}