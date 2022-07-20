package com.quadvision.anydel.backend.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/quadvision/anydel/backend/utils/PermissionUtil;", "", "()V", "COARSE_LOCATION_PERMISSION_REQUEST_CODE", "", "PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION", "PERMISSIONS_REQUEST_CAMERA", "PERMISSIONS_REQUEST_EXTERNAL_STORAGE", "PERMISSIONS_REQUEST_PHONE_CALL", "requestCameraPermission", "", "activity", "Landroid/app/Activity;", "requestExternalStoragePermission", "requestPermissionForCoarseLocation", "requestPermissionForFineLocation", "app_release"})
public final class PermissionUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.utils.PermissionUtil INSTANCE = null;
    public static final int COARSE_LOCATION_PERMISSION_REQUEST_CODE = 7;
    public static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    public static final int PERMISSIONS_REQUEST_CAMERA = 2;
    public static final int PERMISSIONS_REQUEST_EXTERNAL_STORAGE = 3;
    public static final int PERMISSIONS_REQUEST_PHONE_CALL = 4;
    
    private PermissionUtil() {
        super();
    }
    
    public final void requestPermissionForCoarseLocation(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final void requestPermissionForFineLocation(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final void requestExternalStoragePermission(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public final void requestCameraPermission(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
}