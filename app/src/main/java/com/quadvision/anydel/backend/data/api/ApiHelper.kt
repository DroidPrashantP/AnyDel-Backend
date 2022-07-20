package com.quadvision.anydel.backend.data.api

import com.quadvision.anydel.backend.data.model.AddressListModel
import com.quadvision.anydel.backend.data.model.ApiResponse
import com.quadvision.anydel.backend.data.model.CitiesData
import com.quadvision.anydel.backend.data.model.DelChargesPayload
import com.quadvision.anydel.backend.data.model.DeliveryCharges
import com.quadvision.anydel.backend.data.model.DeliverySubmitPayload
import com.quadvision.anydel.backend.data.model.EditProfilePayload
import com.quadvision.anydel.backend.data.model.FileUpload
import com.quadvision.anydel.backend.data.model.LoginPayload
import com.quadvision.anydel.backend.data.model.OtpVerifyPayload
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.PackageSubmit
import com.quadvision.anydel.backend.data.model.RegistrationPayload
import com.quadvision.anydel.backend.data.model.SubmitRatingPayload
import com.quadvision.anydel.backend.data.model.TrackPackage
import com.quadvision.anydel.backend.data.model.UpdateAddress
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.AddAddressPayload
import com.quadvision.anydel.backend.data.model.AddressListPayload
import com.quadvision.anydel.backend.data.model.PackageListDetailPayload
import com.quadvision.anydel.backend.data.model.PasswordUpdatePayload
import com.quadvision.anydel.backend.data.model.UpdateAddressPayload
import com.quadvision.anydel.backend.data.model.ProfilePayload
import com.quadvision.anydel.backend.data.model.RegisterUser
import com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiHelper {

    @POST("/{path}/customer/doRegister/v1")
    suspend fun register(@Path("path", encoded = true) path : String, @Body registrationPayload: RegistrationPayload): Response<RegisterUser>

    @POST("/{path}/customer/registration/verify/v1")
    suspend fun otpVerify(@Path("path", encoded = true) path : String, @Body registrationPayload: OtpVerifyPayload): Response<RegisterUser>

    @POST("/{path}/otp/send/v1")
    suspend fun resendOtp(@Path("path", encoded = true) path : String, @Body registrationPayload: OtpVerifyPayload): Response<RegisterUser>

    @POST("/{path}/password/update/v1")
    suspend fun passwordUpdateRequest(@Path("path", encoded = true) path : String, @Body passwordUpdatePayload : PasswordUpdatePayload): Response<RegisterUser>

    @POST("/{path}/customer/login/v1")
    suspend fun login(@Path("path", encoded = true) path : String, @Body loginPayload: LoginPayload): Response<User>

    @POST("/{path}/customer/getProfile/v1")
    suspend fun getUserProfile(@Path("path", encoded = true) path : String, @Body profilePayload: ProfilePayload): Response<User>

    @POST("/{path}/customer/updateprofile/v1")
    suspend fun editProfile(@Path("path", encoded = true) path : String, @Body profilePayload: EditProfilePayload): Response<User>

    @POST("/{path}/customer/addAddress/v1")
    suspend fun addAddress(@Path("path", encoded = true) path : String, @Body addAddressPayload: AddAddressPayload): Response<ApiResponse>

    @POST("/{path}/customer/updateAddress/v1")
    suspend fun updateAddress(@Path("path", encoded = true) path : String, @Body updateAddressPayload: UpdateAddressPayload): Response<UpdateAddress>

    @POST("/{path}/customer/getAddress/v1")
    suspend fun getAddressList(@Path("path", encoded = true) path : String, @Body addressListPayload: AddressListPayload): Response<AddressListModel>

    @GET("/{path}/config/v1")
    suspend fun getConfigList(@Path("path", encoded = true) path : String): Response<CitiesData>

//    @Multipart
//    @POST("/{path}/customer/file/upload/v1")
//    suspend fun singleUploadImage(@Path("path", encoded = true) path : String, @Part multiPartRequestPayload: MultipartBody.Part): Response<FileUpload>

    @Multipart
    @POST("/{path}/customer/file/upload/v1")
    suspend fun singleUploadImage(@Path("path", encoded = true) path : String, @Part multiPartRequestPayload: MultipartBody.Part, @Part("mobileNo") mobileNo : RequestBody, @Part("type") type : RequestBody): Response<FileUpload>

    @Multipart
    @POST("/{path}/customer/multiplefiles/upload/v1")
    suspend fun multipleUploadImage(@Path("path", encoded = true) path : String, @Part multiPartRequestPayload: MultipartBody.Part): Response<FileUpload>

    @POST("/{path}/customer/package/delivery/charges/get/v1")
    suspend fun getDeliveryCharges(@Path("path", encoded = true) path : String, @Body delChargesPayload: DelChargesPayload): Response<DeliveryCharges>

    @POST("/{path}/customer/package/submit/v1")
    suspend fun submitDelivery(@Path("path", encoded = true) path : String, @Body deliverySubmitPayload: DeliverySubmitPayload): Response<PackageSubmit>

    @POST("/{path}/customer/package/details/retrieve/v1")
    suspend fun getPackageDetail(@Path("path", encoded = true) path : String, @Body packageDetailPayload: PackageDetailPayload): Response<PackageDetail>

    @POST("/{path}/customer/package/track/v1")
    suspend fun getPackageListDetail(@Path("path", encoded = true) path : String, @Body packageDetailPayload: PackageListDetailPayload): Response<PackageDetail>

    @POST("/{path}/customer/package/track/v1")
    suspend fun trackPackageDetail(@Path("path", encoded = true) path : String, @Body packageDetailPayload: PackageDetailPayload): Response<TrackPackage>

    @POST("/{path}/customer/package/details/update/v1")
    suspend fun updatePackageDetail(@Path("path", encoded = true) path : String, @Body updatePackageDetailPayload: UpdatePackageDetailPayload): Response<PackageDetail>

    @POST("/{path}/customer/package/rating/submit/v1")
    suspend fun submitRatingRequest(@Path("path", encoded = true) path : String, @Body submitRatingPayload: SubmitRatingPayload): Response<ApiResponse>
}