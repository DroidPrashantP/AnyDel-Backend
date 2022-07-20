package com.quadvision.anydel.backend.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/quadvision/anydel/backend/utils/CameraUtils;", "", "()V", "getCameraIntentToLaunch", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getCaptureImageOutputUri", "Landroid/net/Uri;", "cameraIntent", "getPickImageChooserIntent", "openImagePickerChooser", "", "refreshGallery", "filePath", "", "startCropImageActivity", "imageUri", "app_release"})
public final class CameraUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.utils.CameraUtils INSTANCE = null;
    
    private CameraUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getCameraIntentToLaunch(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Get URI to image received from capture  by camera.
     *
     * @param context      current context
     * @param cameraIntent camera intent to launch
     * @return output uri
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getCaptureImageOutputUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent cameraIntent) {
        return null;
    }
    
    /**
     * Start crop image activity for the given image.
     */
    public final void startCropImageActivity(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri) {
    }
    
    /**
     * Refreshes gallery on adding new image/video. Gallery won't be refreshed
     * on older devices until device is rebooted
     */
    public final void refreshGallery(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String filePath) {
    }
    
    public final void openImagePickerChooser(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getPickImageChooserIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}