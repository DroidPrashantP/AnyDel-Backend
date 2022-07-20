package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/HomeActivityListener;", "", "changeFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "clearFragmentBackstack", "onBackPressedFragment", "app_release"})
public abstract interface HomeActivityListener {
    
    public abstract void changeFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment);
    
    public abstract void onBackPressedFragment();
    
    public abstract void clearFragmentBackstack();
}