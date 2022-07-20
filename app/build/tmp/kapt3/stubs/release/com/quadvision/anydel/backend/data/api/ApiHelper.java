package com.quadvision.anydel.backend.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00e0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ+\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\"H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020%H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J+\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020)H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J+\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020.H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J+\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u000203H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J+\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00106\u001a\u000207H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J+\u00109\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u00020:H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J+\u0010<\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00102\u001a\u000203H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J?\u0010=\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020.2\b\b\u0001\u0010>\u001a\u00020?2\b\b\u0001\u0010@\u001a\u00020?H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ+\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020EH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ+\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010H\u001a\u00020IH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ+\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J+\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010O\u001a\u00020PH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ+\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010S\u001a\u00020TH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010U\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006V"}, d2 = {"Lcom/quadvision/anydel/backend/data/api/ApiHelper;", "", "addAddress", "Lretrofit2/Response;", "Lcom/quadvision/anydel/backend/data/model/ApiResponse;", "path", "", "addAddressPayload", "Lcom/quadvision/anydel/backend/data/model/AddAddressPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/AddAddressPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfile", "Lcom/quadvision/anydel/backend/data/model/User;", "profilePayload", "Lcom/quadvision/anydel/backend/data/model/EditProfilePayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/EditProfilePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressList", "Lcom/quadvision/anydel/backend/data/model/AddressListModel;", "addressListPayload", "Lcom/quadvision/anydel/backend/data/model/AddressListPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/AddressListPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfigList", "Lcom/quadvision/anydel/backend/data/model/CitiesData;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeliveryCharges", "Lcom/quadvision/anydel/backend/data/model/DeliveryCharges;", "delChargesPayload", "Lcom/quadvision/anydel/backend/data/model/DelChargesPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/DelChargesPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPackageDetail", "Lcom/quadvision/anydel/backend/data/model/PackageDetail;", "packageDetailPayload", "Lcom/quadvision/anydel/backend/data/model/PackageDetailPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/PackageDetailPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPackageListDetail", "Lcom/quadvision/anydel/backend/data/model/PackageListDetailPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/PackageListDetailPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfile", "Lcom/quadvision/anydel/backend/data/model/ProfilePayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/ProfilePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "loginPayload", "Lcom/quadvision/anydel/backend/data/model/LoginPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/LoginPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "multipleUploadImage", "Lcom/quadvision/anydel/backend/data/model/FileUpload;", "multiPartRequestPayload", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "otpVerify", "Lcom/quadvision/anydel/backend/data/model/RegisterUser;", "registrationPayload", "Lcom/quadvision/anydel/backend/data/model/OtpVerifyPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/OtpVerifyPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "passwordUpdateRequest", "passwordUpdatePayload", "Lcom/quadvision/anydel/backend/data/model/PasswordUpdatePayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/PasswordUpdatePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/quadvision/anydel/backend/data/model/RegistrationPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/RegistrationPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendOtp", "singleUploadImage", "mobileNo", "Lokhttp3/RequestBody;", "type", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitDelivery", "Lcom/quadvision/anydel/backend/data/model/PackageSubmit;", "deliverySubmitPayload", "Lcom/quadvision/anydel/backend/data/model/DeliverySubmitPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/DeliverySubmitPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitRatingRequest", "submitRatingPayload", "Lcom/quadvision/anydel/backend/data/model/SubmitRatingPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/SubmitRatingPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackPackageDetail", "Lcom/quadvision/anydel/backend/data/model/TrackPackage;", "updateAddress", "Lcom/quadvision/anydel/backend/data/model/UpdateAddress;", "updateAddressPayload", "Lcom/quadvision/anydel/backend/data/model/UpdateAddressPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/UpdateAddressPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePackageDetail", "updatePackageDetailPayload", "Lcom/quadvision/anydel/backend/data/model/UpdatePackageDetailPayload;", "(Ljava/lang/String;Lcom/quadvision/anydel/backend/data/model/UpdatePackageDetailPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface ApiHelper {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/doRegister/v1")
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.RegistrationPayload registrationPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.RegisterUser>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/registration/verify/v1")
    public abstract java.lang.Object otpVerify(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.OtpVerifyPayload registrationPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.RegisterUser>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/otp/send/v1")
    public abstract java.lang.Object resendOtp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.OtpVerifyPayload registrationPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.RegisterUser>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/password/update/v1")
    public abstract java.lang.Object passwordUpdateRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.PasswordUpdatePayload passwordUpdatePayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.RegisterUser>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/login/v1")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.LoginPayload loginPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/getProfile/v1")
    public abstract java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.ProfilePayload profilePayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/updateprofile/v1")
    public abstract java.lang.Object editProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.EditProfilePayload profilePayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.User>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/addAddress/v1")
    public abstract java.lang.Object addAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.AddAddressPayload addAddressPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.ApiResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/updateAddress/v1")
    public abstract java.lang.Object updateAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.UpdateAddressPayload updateAddressPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.UpdateAddress>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/getAddress/v1")
    public abstract java.lang.Object getAddressList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.AddressListPayload addressListPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.AddressListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/{path}/config/v1")
    public abstract java.lang.Object getConfigList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.CitiesData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/file/upload/v1")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object singleUploadImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part multiPartRequestPayload, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "mobileNo")
    okhttp3.RequestBody mobileNo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "type")
    okhttp3.RequestBody type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.FileUpload>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/multiplefiles/upload/v1")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object multipleUploadImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part multiPartRequestPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.FileUpload>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/delivery/charges/get/v1")
    public abstract java.lang.Object getDeliveryCharges(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.DelChargesPayload delChargesPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.DeliveryCharges>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/submit/v1")
    public abstract java.lang.Object submitDelivery(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.DeliverySubmitPayload deliverySubmitPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageSubmit>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/details/retrieve/v1")
    public abstract java.lang.Object getPackageDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.PackageDetailPayload packageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageDetail>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/track/v1")
    public abstract java.lang.Object getPackageListDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.PackageListDetailPayload packageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageDetail>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/track/v1")
    public abstract java.lang.Object trackPackageDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.PackageDetailPayload packageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.TrackPackage>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/details/update/v1")
    public abstract java.lang.Object updatePackageDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload updatePackageDetailPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.PackageDetail>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/{path}/customer/package/rating/submit/v1")
    public abstract java.lang.Object submitRatingRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "path", encoded = true)
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.quadvision.anydel.backend.data.model.SubmitRatingPayload submitRatingPayload, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.quadvision.anydel.backend.data.model.ApiResponse>> continuation);
}