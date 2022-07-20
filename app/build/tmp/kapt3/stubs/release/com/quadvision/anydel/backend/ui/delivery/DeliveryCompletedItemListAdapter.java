package com.quadvision.anydel.backend.ui.delivery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002#$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0016\u0010!\u001a\u00020\u00142\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$PickAddressItemViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$DeliveryCompletedListItemListener;", "(Landroid/content/Context;Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$DeliveryCompletedListItemListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getListener", "()Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$DeliveryCompletedListItemListener;", "setListener", "(Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$DeliveryCompletedListItemListener;)V", "mDeliveryHistoryList", "", "Lcom/quadvision/anydel/backend/data/model/PackageInfo;", "clearList", "", "getItemCount", "", "isDeliveryStatusAfterOnTheWay", "", "packageInfo", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updatePackageInfoList", "addressList", "DeliveryCompletedListItemListener", "PickAddressItemViewHolder", "app_release"})
public final class DeliveryCompletedItemListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.PickAddressItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.DeliveryCompletedListItemListener listener;
    private java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> mDeliveryHistoryList;
    
    public DeliveryCompletedItemListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.DeliveryCompletedListItemListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.DeliveryCompletedListItemListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.DeliveryCompletedListItemListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.PickAddressItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.delivery.DeliveryCompletedItemListAdapter.PickAddressItemViewHolder holder, int position) {
    }
    
    public final void updatePackageInfoList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.quadvision.anydel.backend.data.model.PackageInfo> addressList) {
    }
    
    public final void clearList() {
    }
    
    private final boolean isDeliveryStatusAfterOnTheWay(com.quadvision.anydel.backend.data.model.PackageInfo packageInfo) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$DeliveryCompletedListItemListener;", "", "setSelectedPackage", "", "address", "Lcom/quadvision/anydel/backend/data/model/PackageInfo;", "app_release"})
    public static abstract interface DeliveryCompletedListItemListener {
        
        public abstract void setSelectedPackage(@org.jetbrains.annotations.Nullable()
        com.quadvision.anydel.backend.data.model.PackageInfo address);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter$PickAddressItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/quadvision/anydel/backend/ui/delivery/DeliveryCompletedItemListAdapter;Landroid/view/View;)V", "mDeliveryDateValueTV", "Landroidx/appcompat/widget/AppCompatTextView;", "getMDeliveryDateValueTV", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMDeliveryDateValueTV", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mDeliveryStatusValueTV", "getMDeliveryStatusValueTV", "setMDeliveryStatusValueTV", "mDeliveryTimeValueTV", "getMDeliveryTimeValueTV", "setMDeliveryTimeValueTV", "mDisableColor", "", "mEnableColor", "mMainContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMMainContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMMainContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mPackageIdTV", "getMPackageIdTV", "setMPackageIdTV", "bind", "", "position", "app_release"})
    public final class PickAddressItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.mainContainer)
        public androidx.constraintlayout.widget.ConstraintLayout mMainContainer;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_packageDetailScreen_packageIdValue)
        public androidx.appcompat.widget.AppCompatTextView mPackageIdTV;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_packageDetailScreen_deliveryDateValue)
        public androidx.appcompat.widget.AppCompatTextView mDeliveryDateValueTV;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_packageDetailScreen_deliveryTimeValue)
        public androidx.appcompat.widget.AppCompatTextView mDeliveryTimeValueTV;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_packageDetailScreen_statusValue)
        public androidx.appcompat.widget.AppCompatTextView mDeliveryStatusValueTV;
        @kotlin.jvm.JvmField()
        @butterknife.BindColor(value = com.quadvision.anydel.backend.R.color.text_secondary_color)
        public int mDisableColor = 0;
        @kotlin.jvm.JvmField()
        @butterknife.BindColor(value = com.quadvision.anydel.backend.R.color.text_primary_color)
        public int mEnableColor = 0;
        
        public PickAddressItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getMMainContainer() {
            return null;
        }
        
        public final void setMMainContainer(@org.jetbrains.annotations.NotNull()
        androidx.constraintlayout.widget.ConstraintLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMPackageIdTV() {
            return null;
        }
        
        public final void setMPackageIdTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMDeliveryDateValueTV() {
            return null;
        }
        
        public final void setMDeliveryDateValueTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMDeliveryTimeValueTV() {
            return null;
        }
        
        public final void setMDeliveryTimeValueTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMDeliveryStatusValueTV() {
            return null;
        }
        
        public final void setMDeliveryStatusValueTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        public final void bind(int position) {
        }
    }
}