package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020\u0019H\u0007J\b\u0010(\u001a\u00020\u0019H\u0007J\b\u0010)\u001a\u00020\u0019H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010.H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014\u00a8\u00061"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mButterKnifeUnBinder", "Lbutterknife/Unbinder;", "mContext", "Landroid/content/Context;", "mNavigationDrawerFragmentListener", "Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment$NavigationDrawerFragmentListener;", "mUserImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getMUserImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setMUserImageView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mUserMobileTV", "Landroidx/appcompat/widget/AppCompatTextView;", "getMUserMobileTV", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMUserMobileTV", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mUserNameTV", "getMUserNameTV", "setMUserNameTV", "onAboutUsClick", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onEventMainThread", "updateProfileEvent", "Lcom/quadvision/anydel/backend/data/model/UpdateProfileEvent;", "onLogoutClick", "onNotificationClick", "onStart", "onViewCreated", "view", "setUpUI", "userInfo", "Lcom/quadvision/anydel/backend/data/model/UserInfo;", "Companion", "NavigationDrawerFragmentListener", "app_release"})
public final class NavigationDrawerFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.ui.home.NavigationDrawerFragment.Companion Companion = null;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.iv_navigationDrawer_userImage)
    public androidx.appcompat.widget.AppCompatImageView mUserImageView;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_navigationDrawer_username)
    public androidx.appcompat.widget.AppCompatTextView mUserNameTV;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_navigationDrawer_mobile)
    public androidx.appcompat.widget.AppCompatTextView mUserMobileTV;
    private android.content.Context mContext;
    private butterknife.Unbinder mButterKnifeUnBinder;
    private com.quadvision.anydel.backend.ui.home.NavigationDrawerFragment.NavigationDrawerFragmentListener mNavigationDrawerFragmentListener;
    private java.util.HashMap _$_findViewCache;
    
    public NavigationDrawerFragment() {
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
    public final androidx.appcompat.widget.AppCompatTextView getMUserNameTV() {
        return null;
    }
    
    public final void setMUserNameTV(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMUserMobileTV() {
        return null;
    }
    
    public final void setMUserMobileTV(@org.jetbrains.annotations.NotNull()
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
    
    private final void setUpUI(com.quadvision.anydel.backend.data.model.UserInfo userInfo) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @butterknife.OnClick(value = {2131231349})
    public final void onLogoutClick() {
    }
    
    @butterknife.OnClick(value = {2131231348})
    public final void onAboutUsClick() {
    }
    
    @butterknife.OnClick(value = {2131231351})
    public final void onNotificationClick() {
    }
    
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.UpdateProfileEvent updateProfileEvent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment$NavigationDrawerFragmentListener;", "", "closeSideDrawer", "", "logoutUser", "app_release"})
    public static abstract interface NavigationDrawerFragmentListener {
        
        public abstract void closeSideDrawer();
        
        public abstract void logoutUser();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment$Companion;", "", "()V", "newInstance", "Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.quadvision.anydel.backend.ui.home.NavigationDrawerFragment newInstance() {
            return null;
        }
    }
}