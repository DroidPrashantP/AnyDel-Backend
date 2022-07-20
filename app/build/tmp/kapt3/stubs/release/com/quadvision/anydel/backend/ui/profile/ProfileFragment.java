package com.quadvision.anydel.backend.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0007J\b\u0010&\u001a\u00020#H\u0007J\b\u0010\'\u001a\u00020#H\u0002J\u0012\u0010(\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00101\u001a\u00020#H\u0016J\u001a\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/quadvision/anydel/backend/ui/profile/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mButterKnifeUnBinder", "Lbutterknife/Unbinder;", "mContext", "Landroid/content/Context;", "mHomeActivityListener", "Lcom/quadvision/anydel/backend/ui/home/HomeActivityListener;", "mProfileViewModel", "Lcom/quadvision/anydel/backend/ui/profile/ProfileViewModel;", "mTvEmailField", "Landroidx/appcompat/widget/AppCompatTextView;", "getMTvEmailField", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMTvEmailField", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mTvMobileField", "getMTvMobileField", "setMTvMobileField", "mTvNameField", "getMTvNameField", "setMTvNameField", "mTvSurnameField", "getMTvSurnameField", "setMTvSurnameField", "mUserImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getMUserImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setMUserImageView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mUserInfo", "Lcom/quadvision/anydel/backend/data/model/UserInfo;", "bindData", "", "bindViewModel", "clickOnHomeView", "clickOnImageView", "observeTheUserProfileData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "Companion", "app_release"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.ui.profile.ProfileFragment.Companion Companion = null;
    private android.content.Context mContext;
    private butterknife.Unbinder mButterKnifeUnBinder;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.iv_profileV5Header_userImage)
    public androidx.appcompat.widget.AppCompatImageView mUserImageView;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_profileScreen_nameField)
    public androidx.appcompat.widget.AppCompatTextView mTvNameField;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_profileScreen_surField)
    public androidx.appcompat.widget.AppCompatTextView mTvSurnameField;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_profileScreen_mobileField)
    public androidx.appcompat.widget.AppCompatTextView mTvMobileField;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_profileScreen_emailField)
    public androidx.appcompat.widget.AppCompatTextView mTvEmailField;
    private com.quadvision.anydel.backend.data.model.UserInfo mUserInfo;
    private com.quadvision.anydel.backend.ui.home.HomeActivityListener mHomeActivityListener;
    private com.quadvision.anydel.backend.ui.profile.ProfileViewModel mProfileViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public ProfileFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatImageView getMUserImageView() {
        return null;
    }
    
    public final void setMUserImageView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMTvNameField() {
        return null;
    }
    
    public final void setMTvNameField(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMTvSurnameField() {
        return null;
    }
    
    public final void setMTvSurnameField(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMTvMobileField() {
        return null;
    }
    
    public final void setMTvMobileField(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMTvEmailField() {
        return null;
    }
    
    public final void setMTvEmailField(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindViewModel() {
    }
    
    private final void bindData() {
    }
    
    private final void observeTheUserProfileData() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @butterknife.OnClick(value = {2131230847})
    public final void clickOnHomeView() {
    }
    
    @butterknife.OnClick(value = {2131231033})
    public final void clickOnImageView() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/quadvision/anydel/backend/ui/profile/ProfileFragment$Companion;", "", "()V", "newInstance", "Lcom/quadvision/anydel/backend/ui/profile/ProfileFragment;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.quadvision.anydel.backend.ui.profile.ProfileFragment newInstance() {
            return null;
        }
    }
}