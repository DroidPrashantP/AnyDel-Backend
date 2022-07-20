package com.quadvision.anydel.backend.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fJ6\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/quadvision/anydel/backend/data/model/DeliveryPayload;", "", "()V", "mDeliverySubmitPayload", "Lcom/quadvision/anydel/backend/data/model/DeliverySubmitPayload;", "getInstance", "submitAddressInfo", "", "pickAddress", "Lcom/quadvision/anydel/backend/data/model/Address;", "dropAddress", "pickAddressMobileNo", "", "dropAddressMobileNo", "submitPackageInfo", "packType", "packDescription", "customerComment", "mAttachedImagesList", "Ljava/util/ArrayList;", "LPicList;", "Lkotlin/collections/ArrayList;", "packageWeightField", "packageLengthField", "packageBreadthField", "packageHeightField", "submitSlotAndPaymentInfo", "bookDate", "bookTime", "deliveryDate", "deliveryTime", "paymentMode", "deliveryCharges", "", "app_release"})
public final class DeliveryPayload {
    @org.jetbrains.annotations.NotNull()
    public static final com.quadvision.anydel.backend.data.model.DeliveryPayload INSTANCE = null;
    private static com.quadvision.anydel.backend.data.model.DeliverySubmitPayload mDeliverySubmitPayload;
    
    private DeliveryPayload() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quadvision.anydel.backend.data.model.DeliverySubmitPayload getInstance() {
        return null;
    }
    
    public final void submitAddressInfo(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.Address pickAddress, @org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.Address dropAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String pickAddressMobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.String dropAddressMobileNo) {
    }
    
    public final void submitPackageInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String packType, @org.jetbrains.annotations.NotNull()
    java.lang.String packDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String customerComment, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<PicList> mAttachedImagesList, @org.jetbrains.annotations.NotNull()
    java.lang.String packageWeightField, @org.jetbrains.annotations.NotNull()
    java.lang.String packageLengthField, @org.jetbrains.annotations.NotNull()
    java.lang.String packageBreadthField, @org.jetbrains.annotations.NotNull()
    java.lang.String packageHeightField) {
    }
    
    public final void submitSlotAndPaymentInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String bookDate, @org.jetbrains.annotations.NotNull()
    java.lang.String bookTime, @org.jetbrains.annotations.NotNull()
    java.lang.String deliveryDate, @org.jetbrains.annotations.NotNull()
    java.lang.String deliveryTime, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMode, double deliveryCharges) {
    }
}