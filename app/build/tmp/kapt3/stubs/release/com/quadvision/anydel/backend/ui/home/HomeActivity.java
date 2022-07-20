package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0004J\b\u00109\u001a\u000204H\u0002J\b\u0010:\u001a\u000204H\u0002J\u0010\u0010;\u001a\u0002042\u0006\u00107\u001a\u000208H\u0016J\b\u0010<\u001a\u000204H\u0016J\b\u0010=\u001a\u000204H\u0016J\b\u0010>\u001a\u000204H\u0002J\b\u0010?\u001a\u000204H\u0002J\b\u0010@\u001a\u000204H\u0002J\b\u0010A\u001a\u000204H\u0016J\b\u0010B\u001a\u000204H\u0002J\"\u0010C\u001a\u0002042\u0006\u0010D\u001a\u0002062\u0006\u0010E\u001a\u0002062\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\b\u0010H\u001a\u000204H\u0016J\b\u0010I\u001a\u000204H\u0016J\u0012\u0010J\u001a\u0002042\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u000204H\u0014J\u000e\u0010N\u001a\u0002042\u0006\u0010O\u001a\u00020PJ\u000e\u0010N\u001a\u0002042\u0006\u0010O\u001a\u00020QJ-\u0010R\u001a\u0002042\u0006\u0010D\u001a\u0002062\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180T2\u0006\u0010U\u001a\u00020VH\u0016\u00a2\u0006\u0002\u0010WJ\b\u0010X\u001a\u000204H\u0014J\u0018\u0010Y\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\b\u0010Z\u001a\u000204H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/quadvision/anydel/backend/ui/home/HomeActivityListener;", "Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment$NavigationDrawerFragmentListener;", "()V", "drawerListener", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "homeViewModel", "Lcom/quadvision/anydel/backend/ui/home/HomeViewModel;", "mActionBar", "Landroidx/appcompat/app/ActionBar;", "mContext", "Landroid/content/Context;", "mHomeDrawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getMHomeDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setMHomeDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "mHomeFragment", "Lcom/quadvision/anydel/backend/ui/home/HomeFragment;", "mMobileNumber", "", "mNavigationDrawerFragment", "Lcom/quadvision/anydel/backend/ui/home/NavigationDrawerFragment;", "mNavigationDrawerIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "getMNavigationDrawerIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "setMNavigationDrawerIcon", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mToolBar", "Landroidx/appcompat/widget/Toolbar;", "getMToolBar", "()Landroidx/appcompat/widget/Toolbar;", "setMToolBar", "(Landroidx/appcompat/widget/Toolbar;)V", "mToolBarTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "getMToolBarTitle", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMToolBarTitle", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mUnBinder", "Lbutterknife/Unbinder;", "mUser", "Lcom/quadvision/anydel/backend/data/model/User;", "mUserInfo", "Lcom/quadvision/anydel/backend/data/model/UserInfo;", "addFragment", "", "containerViewId", "", "fragment", "Landroidx/fragment/app/Fragment;", "bindView", "bindViewModel", "changeFragment", "clearFragmentBackstack", "closeSideDrawer", "initializeNavigationDrawerFragment", "loadFragment", "loadUserData", "logoutUser", "observeTheUserProfileData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onBackPressedFragment", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEventMainThread", "event", "Lcom/quadvision/anydel/backend/data/model/SessionManagmentModel;", "Lcom/quadvision/anydel/backend/data/model/SessionTimeOutModel;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "replaceFragment", "setActionBar", "app_release"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity implements com.quadvision.anydel.backend.ui.home.HomeActivityListener, com.quadvision.anydel.backend.ui.home.NavigationDrawerFragment.NavigationDrawerFragmentListener {
    private butterknife.Unbinder mUnBinder;
    private android.content.Context mContext;
    private com.quadvision.anydel.backend.ui.home.NavigationDrawerFragment mNavigationDrawerFragment;
    private com.quadvision.anydel.backend.data.model.User mUser;
    private com.quadvision.anydel.backend.ui.home.HomeViewModel homeViewModel;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.drawerLayout_Home)
    public androidx.drawerlayout.widget.DrawerLayout mHomeDrawerLayout;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.toolbar)
    public androidx.appcompat.widget.Toolbar mToolBar;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_toolbarTitle)
    public androidx.appcompat.widget.AppCompatTextView mToolBarTitle;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.iv_home_navDrawerIcon)
    public androidx.appcompat.widget.AppCompatImageView mNavigationDrawerIcon;
    private com.quadvision.anydel.backend.ui.home.HomeFragment mHomeFragment;
    private com.quadvision.anydel.backend.data.model.UserInfo mUserInfo;
    private java.lang.String mMobileNumber;
    private androidx.appcompat.app.ActionBar mActionBar;
    private androidx.fragment.app.FragmentManager fragmentManager;
    private final androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.drawerlayout.widget.DrawerLayout getMHomeDrawerLayout() {
        return null;
    }
    
    public final void setMHomeDrawerLayout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getMToolBar() {
        return null;
    }
    
    public final void setMToolBar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMToolBarTitle() {
        return null;
    }
    
    public final void setMToolBarTitle(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatImageView getMNavigationDrawerIcon() {
        return null;
    }
    
    public final void setMNavigationDrawerIcon(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindView() {
    }
    
    private final void bindViewModel() {
    }
    
    private final void loadUserData() {
    }
    
    private final void loadFragment() {
    }
    
    private final void setActionBar() {
    }
    
    private final void observeTheUserProfileData() {
    }
    
    private final void initializeNavigationDrawerFragment() {
    }
    
    protected final void addFragment(int containerViewId, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    private final void replaceFragment(int containerViewId, androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void changeFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void onBackPressedFragment() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void clearFragmentBackstack() {
    }
    
    @java.lang.Override()
    public void closeSideDrawer() {
    }
    
    @java.lang.Override()
    public void logoutUser() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.SessionManagmentModel event) {
    }
    
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.SessionTimeOutModel event) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
}