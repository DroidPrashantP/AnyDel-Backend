package com.quadvision.anydel.backend.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/quadvision/anydel/backend/ui/detail/PackageWeightSizeChangeListener;", "", "onPackageSizeChange", "", "packWeight", "", "packLength", "packBreadth", "packHeight", "app_release"})
public abstract interface PackageWeightSizeChangeListener {
    
    public abstract void onPackageSizeChange(int packWeight, int packLength, int packBreadth, int packHeight);
}