package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u001c\u0010\u0019\u001a\u00020\u00172\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u0016\u0010\u001f\u001a\u00020\u00172\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$CityItemViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$PackageStatusAdapterListener;", "(Landroid/content/Context;Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$PackageStatusAdapterListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getListener", "()Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$PackageStatusAdapterListener;", "setListener", "(Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$PackageStatusAdapterListener;)V", "mLastSelectedPosition", "", "mSelectedItemPos", "mStatusList", "", "", "clearList", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "updateStatusList", "statusList", "CityItemViewHolder", "PackageStatusAdapterListener", "app_release"})
public final class PackageStatusItemListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.CityItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.PackageStatusAdapterListener listener;
    private java.util.List<java.lang.String> mStatusList;
    private int mSelectedItemPos = -1;
    private int mLastSelectedPosition = -1;
    
    public PackageStatusItemListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.PackageStatusAdapterListener listener) {
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
    public final com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.PackageStatusAdapterListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.PackageStatusAdapterListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.CityItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.home.PackageStatusItemListAdapter.CityItemViewHolder holder, int position) {
    }
    
    public final void clearList() {
    }
    
    public final void updateStatusList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> statusList) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$PackageStatusAdapterListener;", "", "selectStatus", "", "status", "", "app_release"})
    public static abstract interface PackageStatusAdapterListener {
        
        public abstract void selectStatus(@org.jetbrains.annotations.Nullable()
        java.lang.String status);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter$CityItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/quadvision/anydel/backend/ui/home/PackageStatusItemListAdapter;Landroid/view/View;)V", "mPrimaryTextColor", "", "mSelectedColor", "mStatusDivider", "getMStatusDivider", "()Landroid/view/View;", "setMStatusDivider", "(Landroid/view/View;)V", "mStatusNameTV", "Landroidx/appcompat/widget/AppCompatTextView;", "getMStatusNameTV", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMStatusNameTV", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "bind", "", "position", "app_release"})
    public final class CityItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_statusNameLabel)
        public androidx.appcompat.widget.AppCompatTextView mStatusNameTV;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.view_statusDivider)
        public android.view.View mStatusDivider;
        @kotlin.jvm.JvmField()
        @butterknife.BindColor(value = com.quadvision.anydel.backend.R.color.primary_color)
        public int mSelectedColor = 0;
        @kotlin.jvm.JvmField()
        @butterknife.BindColor(value = com.quadvision.anydel.backend.R.color.text_primary_color)
        public int mPrimaryTextColor = 0;
        
        public CityItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.appcompat.widget.AppCompatTextView getMStatusNameTV() {
            return null;
        }
        
        public final void setMStatusNameTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMStatusDivider() {
            return null;
        }
        
        public final void setMStatusDivider(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public final void bind(int position) {
        }
    }
}