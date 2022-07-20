package com.quadvision.anydel.backend.ui.delivery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0007J\b\u0010)\u001a\u00020\'H\u0002J\b\u0010*\u001a\u00020\'H\u0002J\b\u0010+\u001a\u00020\'H\u0002J\u0012\u0010,\u001a\u00020\'2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00105\u001a\u00020\'H\u0016J\b\u00106\u001a\u00020\'H\u0016J\u001a\u00107\u001a\u00020\'2\u0006\u00108\u001a\u0002002\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00109\u001a\u00020\'H\u0002J\b\u0010:\u001a\u00020\'H\u0002J\u0010\u0010;\u001a\u00020\'2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\'H\u0002J\u0010\u0010?\u001a\u00020\'2\u0006\u0010<\u001a\u00020=H\u0002J\u0016\u0010@\u001a\u00020\'2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/quadvision/anydel/backend/ui/delivery/CompletedDeliveryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mButterKnifeUnBinder", "Lbutterknife/Unbinder;", "mContext", "Landroid/content/Context;", "mDeliveryCompletedItemListAdapter", "Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter;", "mDeliveryCompletedListItemListener", "Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$DeliveryCompletedListItemListener;", "mDeliveryCompletedListRV", "Landroidx/recyclerview/widget/RecyclerView;", "getMDeliveryCompletedListRV", "()Landroidx/recyclerview/widget/RecyclerView;", "setMDeliveryCompletedListRV", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mDeliveryCompletedViewModel", "Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedViewModel;", "mEmptyContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMEmptyContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMEmptyContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mEmptyMessageTV", "Landroidx/appcompat/widget/AppCompatTextView;", "getMEmptyMessageTV", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMEmptyMessageTV", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mHomeActivityListener", "Lcom/quadvision/anydel/backend/ui/home/HomeActivityListener;", "mProgressBarContainer", "getMProgressBarContainer", "setMProgressBarContainer", "mUserInfo", "Lcom/quadvision/anydel/backend/data/model/UserInfo;", "bindViewModel", "", "clickOnHomeBtn", "loadDeliveryCompletedData", "loadUserData", "observerData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onStart", "onViewCreated", "view", "setUpTheAddressListAdapter", "setUpUI", "showHideEmptyView", "isVisible", "", "showListView", "showProgress", "updateUI", "packageData", "", "Lcom/quadvision/anydel/backend/data/model/PackageInfo;", "Companion", "app_release"})
public final class CompletedDeliveryFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.ui.delivery.CompletedDeliveryFragment.Companion Companion = null;
    private android.content.Context mContext;
    private butterknife.Unbinder mButterKnifeUnBinder;
    private com.quadvision.anydel.backend.ui.home.HomeActivityListener mHomeActivityListener;
    private com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter mDeliveryCompletedItemListAdapter;
    private com.quadvision.anydel.backend.data.model.UserInfo mUserInfo;
    private com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedViewModel mDeliveryCompletedViewModel;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.rv_deliveryCompletedScreen)
    public androidx.recyclerview.widget.RecyclerView mDeliveryCompletedListRV;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.cl_progressBarContainer)
    public androidx.constraintlayout.widget.ConstraintLayout mProgressBarContainer;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.cl_empty_container)
    public androidx.constraintlayout.widget.ConstraintLayout mEmptyContainer;
    @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_empty_message)
    public androidx.appcompat.widget.AppCompatTextView mEmptyMessageTV;
    private com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.DeliveryCompletedListItemListener mDeliveryCompletedListItemListener;
    private java.util.HashMap _$_findViewCache;
    
    public CompletedDeliveryFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getMDeliveryCompletedListRV() {
        return null;
    }
    
    public final void setMDeliveryCompletedListRV(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getMProgressBarContainer() {
        return null;
    }
    
    public final void setMProgressBarContainer(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getMEmptyContainer() {
        return null;
    }
    
    public final void setMEmptyContainer(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatTextView getMEmptyMessageTV() {
        return null;
    }
    
    public final void setMEmptyMessageTV(@org.jetbrains.annotations.NotNull()
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
    
    private final void setUpUI() {
    }
    
    private final void observerData() {
    }
    
    private final void updateUI(java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> packageData) {
    }
    
    private final void showListView() {
    }
    
    private final void loadDeliveryCompletedData() {
    }
    
    private final void showHideEmptyView(boolean isVisible) {
    }
    
    private final void showProgress(boolean isVisible) {
    }
    
    private final void setUpTheAddressListAdapter() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void loadUserData() {
    }
    
    @butterknife.OnClick(value = {2131230830})
    public final void clickOnHomeBtn() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/quadvision/anydel/backend/ui/delivery/CompletedDeliveryFragment$Companion;", "", "()V", "newInstance", "Lcom/quadvision/anydel/backend/ui/delivery/CompletedDeliveryFragment;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.quadvision.anydel.backend.ui.delivery.CompletedDeliveryFragment newInstance() {
            return null;
        }
    }
}