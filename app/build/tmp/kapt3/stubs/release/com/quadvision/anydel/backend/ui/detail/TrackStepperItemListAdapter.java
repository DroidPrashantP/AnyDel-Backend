package com.quadvision.anydel.backend.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0016\u0010\u0017\u001a\u00020\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/quadvision/anydel/backend/ui/detail/TrackStepperItemListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/quadvision/anydel/backend/ui/detail/TrackStepperItemListAdapter$TrackStepperItemViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "mTrackerStepsList", "", "Lcom/quadvision/anydel/backend/data/model/TrackStepItem;", "clearList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateTrackerStepList", "trackStepList", "TrackStepperItemViewHolder", "app_release"})
public final class TrackStepperItemListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.quadvision.anydel.backend.ui.detail.TrackStepperItemListAdapter.TrackStepperItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private java.util.List<com.quadvision.anydel.backend.data.model.TrackStepItem> mTrackerStepsList;
    
    public TrackStepperItemListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.quadvision.anydel.backend.ui.detail.TrackStepperItemListAdapter.TrackStepperItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.detail.TrackStepperItemListAdapter.TrackStepperItemViewHolder holder, int position) {
    }
    
    public final void updateTrackerStepList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.quadvision.anydel.backend.data.model.TrackStepItem> trackStepList) {
    }
    
    public final void clearList() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001e\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001e\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/quadvision/anydel/backend/ui/detail/TrackStepperItemListAdapter$TrackStepperItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/quadvision/anydel/backend/ui/detail/TrackStepperItemListAdapter;Landroid/view/View;)V", "mDashViewTV", "Landroidx/appcompat/widget/AppCompatTextView;", "getMDashViewTV", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMDashViewTV", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mDisableColor", "", "mEnableColor", "mSelectedRatioBtn", "Landroid/graphics/drawable/Drawable;", "getMSelectedRatioBtn", "()Landroid/graphics/drawable/Drawable;", "setMSelectedRatioBtn", "(Landroid/graphics/drawable/Drawable;)V", "mStatusIndicatorTv", "getMStatusIndicatorTv", "setMStatusIndicatorTv", "mStatusLabel", "getMStatusLabel", "setMStatusLabel", "mStatusViewTv", "getMStatusViewTv", "()Landroid/view/View;", "setMStatusViewTv", "(Landroid/view/View;)V", "mUnSelectedRatioBtn", "getMUnSelectedRatioBtn", "setMUnSelectedRatioBtn", "bind", "", "position", "app_release"})
    public final class TrackStepperItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_trackPackageDetailScreen_statusIndicator)
        public androidx.appcompat.widget.AppCompatTextView mStatusIndicatorTv;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.view_trackPackageDetailScreen)
        public android.view.View mStatusViewTv;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_trackPackageDetailScreen_dashView)
        public androidx.appcompat.widget.AppCompatTextView mDashViewTV;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_trackPackageDetailScreen_statusLabel)
        public androidx.appcompat.widget.AppCompatTextView mStatusLabel;
        @butterknife.BindDrawable(value = com.quadvision.anydel.backend.R.drawable.ic_radion_btn_selected)
        public android.graphics.drawable.Drawable mSelectedRatioBtn;
        @butterknife.BindDrawable(value = com.quadvision.anydel.backend.R.drawable.ic_rb_btn_unselected)
        public android.graphics.drawable.Drawable mUnSelectedRatioBtn;
        @kotlin.jvm.JvmField()
        @butterknife.BindColor(value = com.quadvision.anydel.backend.R.color.text_secondary_color)
        public int mDisableColor = 0;
        @kotlin.jvm.JvmField()
        @butterknife.BindColor(value = com.quadvision.anydel.backend.R.color.primary_color)
        public int mEnableColor = 0;
        
        public TrackStepperItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMStatusIndicatorTv() {
            return null;
        }
        
        public final void setMStatusIndicatorTv(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMStatusViewTv() {
            return null;
        }
        
        public final void setMStatusViewTv(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMDashViewTV() {
            return null;
        }
        
        public final void setMDashViewTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMStatusLabel() {
            return null;
        }
        
        public final void setMStatusLabel(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.drawable.Drawable getMSelectedRatioBtn() {
            return null;
        }
        
        public final void setMSelectedRatioBtn(@org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Drawable p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.drawable.Drawable getMUnSelectedRatioBtn() {
            return null;
        }
        
        public final void setMUnSelectedRatioBtn(@org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Drawable p0) {
        }
        
        public final void bind(int position) {
        }
    }
}