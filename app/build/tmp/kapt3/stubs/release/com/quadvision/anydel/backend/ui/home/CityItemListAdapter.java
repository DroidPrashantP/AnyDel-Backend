package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\u001c\u0010\u0019\u001a\u00020\u00172\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0016\u0010\u001f\u001a\u00020\u00172\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityItemViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityListAdapterListener;", "(Landroid/content/Context;Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityListAdapterListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getListener", "()Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityListAdapterListener;", "setListener", "(Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityListAdapterListener;)V", "mCityList", "", "Lcom/quadvision/anydel/backend/data/model/City;", "mLastSelectedPosition", "", "mSelectedItemPos", "clearList", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "updateCityList", "cityList", "CityItemViewHolder", "CityListAdapterListener", "app_release"})
public final class CityItemListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityListAdapterListener listener;
    private java.util.List<com.quadvision.anydel.backend.data.model.City> mCityList;
    private int mSelectedItemPos = -1;
    private int mLastSelectedPosition = -1;
    
    public CityItemListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityListAdapterListener listener) {
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
    public final com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityListAdapterListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityListAdapterListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.home.CityItemListAdapter.CityItemViewHolder holder, int position) {
    }
    
    public final void clearList() {
    }
    
    public final void updateCityList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.quadvision.anydel.backend.data.model.City> cityList) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityListAdapterListener;", "", "selectCity", "", "city", "Lcom/quadvision/anydel/backend/data/model/City;", "app_release"})
    public static abstract interface CityListAdapterListener {
        
        public abstract void selectCity(@org.jetbrains.annotations.Nullable()
        com.quadvision.anydel.backend.data.model.City city);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter$CityItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/quadvision/anydel/backend/ui/home/CityItemListAdapter;Landroid/view/View;)V", "mCityNameDivider", "getMCityNameDivider", "()Landroid/view/View;", "setMCityNameDivider", "(Landroid/view/View;)V", "mCityNameTV", "Landroidx/appcompat/widget/AppCompatTextView;", "getMCityNameTV", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMCityNameTV", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mPrimaryTextColor", "", "mSelectedColor", "bind", "", "position", "app_release"})
    public final class CityItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.tv_cityNameLabel)
        public androidx.appcompat.widget.AppCompatTextView mCityNameTV;
        @butterknife.BindView(value = com.quadvision.anydel.backend.R.id.view_cityNameDivider)
        public android.view.View mCityNameDivider;
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
        public final androidx.appcompat.widget.AppCompatTextView getMCityNameTV() {
            return null;
        }
        
        public final void setMCityNameTV(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.widget.AppCompatTextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMCityNameDivider() {
            return null;
        }
        
        public final void setMCityNameDivider(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public final void bind(int position) {
        }
    }
}