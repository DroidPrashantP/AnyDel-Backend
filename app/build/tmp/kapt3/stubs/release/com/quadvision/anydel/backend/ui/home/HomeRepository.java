package com.quadvision.anydel.backend.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001a\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00062\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00062\u0006\u0010\'\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010+\u001a\u00020,H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00062\u0006\u00102\u001a\u000203H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u00106\u001a\u000207H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020!0\u00062\u0006\u0010:\u001a\u00020;H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J!\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\u00062\u0006\u0010?\u001a\u00020@H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006B"}, d2 = {"Lcom/quadvision/anydel/backend/ui/home/HomeRepository;", "", "homeDataSource", "Lcom/quadvision/anydel/backend/ui/home/HomeDataSource;", "(Lcom/quadvision/anydel/backend/ui/home/HomeDataSource;)V", "addAddress", "Lretrofit2/Response;", "Lcom/quadvision/anydel/backend/data/model/ApiResponse;", "addAddressPayload", "Lcom/quadvision/anydel/backend/data/model/AddAddressPayload;", "(Lcom/quadvision/anydel/backend/data/model/AddAddressPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressList", "Lcom/quadvision/anydel/backend/data/model/AddressListModel;", "addressListPayload", "Lcom/quadvision/anydel/backend/data/model/AddressListPayload;", "(Lcom/quadvision/anydel/backend/data/model/AddressListPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfigList", "Lcom/quadvision/anydel/backend/data/model/CitiesData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeliveryCharges", "Lcom/quadvision/anydel/backend/data/model/DeliveryCharges;", "delChargesPayload", "Lcom/quadvision/anydel/backend/data/model/DelChargesPayload;", "(Lcom/quadvision/anydel/backend/data/model/DelChargesPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPackageDetail", "Lcom/quadvision/anydel/backend/data/model/PackageDetail;", "packageDetailPayload", "Lcom/quadvision/anydel/backend/data/model/PackageDetailPayload;", "(Lcom/quadvision/anydel/backend/data/model/PackageDetailPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPackageListDetail", "Lcom/quadvision/anydel/backend/data/model/PackageListDetailPayload;", "(Lcom/quadvision/anydel/backend/data/model/PackageListDetailPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfile", "Lcom/quadvision/anydel/backend/data/model/User;", "loginPayload", "Lcom/quadvision/anydel/backend/data/model/ProfilePayload;", "(Lcom/quadvision/anydel/backend/data/model/ProfilePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitDelivery", "Lcom/quadvision/anydel/backend/data/model/PackageSubmit;", "deliverySubmitPayload", "Lcom/quadvision/anydel/backend/data/model/DeliverySubmitPayload;", "(Lcom/quadvision/anydel/backend/data/model/DeliverySubmitPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitRatingRequest", "submitRatingPayload", "Lcom/quadvision/anydel/backend/data/model/SubmitRatingPayload;", "(Lcom/quadvision/anydel/backend/data/model/SubmitRatingPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackPackageDetail", "Lcom/quadvision/anydel/backend/data/model/TrackPackage;", "updateAddress", "Lcom/quadvision/anydel/backend/data/model/UpdateAddress;", "updateAddressPayload", "Lcom/quadvision/anydel/backend/data/model/UpdateAddressPayload;", "(Lcom/quadvision/anydel/backend/data/model/UpdateAddressPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePackageDetail", "updatePackageDetailPayload", "Lcom/quadvision/anydel/backend/data/model/UpdatePackageDetailPayload;", "(Lcom/quadvision/anydel/backend/data/model/UpdatePackageDetailPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "editProfilePayload", "Lcom/quadvision/anydel/backend/data/model/EditProfilePayload;", "(Lcom/quadvision/anydel/backend/data/model/EditProfilePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "Lcom/quadvision/anydel/backend/data/model/FileUpload;", "multiPartRequestPayload", "Lcom/quadvision/anydel/backend/data/model/MultiPartRequestPayload;", "(Lcom/quadvision/anydel/backend/data/model/MultiPartRequestPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class HomeRepository {
    private final com.quadvision.anydel.backend.ui.home.HomeDataSource homeDataSource = null;
    
    public HomeRepository(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.ui.home.HomeDataSource homeDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.ProfilePayload loginPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.EditProfilePayload editProfilePayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addAddress(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.AddAddressPayload addAddressPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.ApiResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAddress(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.UpdateAddressPayload updateAddressPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.UpdateAddress>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAddressList(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.AddressListPayload addressListPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.AddressListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getConfigList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.CitiesData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.MultiPartRequestPayload multiPartRequestPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.FileUpload>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDeliveryCharges(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.DelChargesPayload delChargesPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.DeliveryCharges>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object submitDelivery(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.DeliverySubmitPayload deliverySubmitPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageSubmit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPackageDetail(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.PackageDetailPayload packageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageDetail>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPackageListDetail(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.PackageListDetailPayload packageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageDetail>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object trackPackageDetail(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.PackageDetailPayload packageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.TrackPackage>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updatePackageDetail(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload updatePackageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageDetail>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object submitRatingRequest(@org.jetbrains.annotations.NotNull()
    com.quadvision.anydel.backend.data.model.SubmitRatingPayload submitRatingPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.ApiResponse>> continuation) {
        return null;
    }
}