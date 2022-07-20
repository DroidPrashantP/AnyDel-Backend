package com.quadvision.anydel.backend.ui.home

import com.quadvision.anydel.backend.data.api.ApiClient
import com.quadvision.anydel.backend.data.model.AddressListModel
import com.quadvision.anydel.backend.data.model.ApiResponse
import com.quadvision.anydel.backend.data.model.CitiesData
import com.quadvision.anydel.backend.data.model.DelChargesPayload
import com.quadvision.anydel.backend.data.model.DeliveryCharges
import com.quadvision.anydel.backend.data.model.DeliverySubmitPayload
import com.quadvision.anydel.backend.data.model.EditProfilePayload
import com.quadvision.anydel.backend.data.model.FileUpload
import com.quadvision.anydel.backend.data.model.MultiPartRequestPayload
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.PackageSubmit
import com.quadvision.anydel.backend.data.model.SubmitRatingPayload
import com.quadvision.anydel.backend.data.model.TrackPackage
import com.quadvision.anydel.backend.data.model.UpdateAddress
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.AddAddressPayload
import com.quadvision.anydel.backend.data.model.AddressListPayload
import com.quadvision.anydel.backend.data.model.PackageListDetailPayload
import com.quadvision.anydel.backend.data.model.UpdateAddressPayload
import com.quadvision.anydel.backend.data.model.ProfilePayload
import com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Response
import java.io.File

class HomeDataSource {

    suspend fun getUserProfile(loginPayload: ProfilePayload): Response<User> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8443").getUserProfile(ApiClient.dynamicPath, loginPayload)
    }

    suspend fun updateProfile(editProfilePayload: EditProfilePayload): Response<User> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8443").editProfile(ApiClient.dynamicPath, editProfilePayload)
    }

    suspend fun addAddress(addAddressPayload: AddAddressPayload): Response<ApiResponse> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8443").addAddress(ApiClient.dynamicPath, addAddressPayload)
    }

    suspend fun updateAddress(updateAddressPayload: UpdateAddressPayload): Response<UpdateAddress> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8443").updateAddress(ApiClient.dynamicPath, updateAddressPayload)
    }

    suspend fun getAddressList(addressListPayload: AddressListPayload): Response<AddressListModel> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8443").getAddressList(ApiClient.dynamicPath, addressListPayload)
    }

    suspend fun getConfigList(): Response<CitiesData> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8447").getConfigList(ApiClient.dynamicPath)
    }

    suspend fun uploadImage(multiPartRequestPayload: MultiPartRequestPayload): Response<FileUpload>? {
        var mobileNo = multiPartRequestPayload.mobileNo?.toRequestBody("multipart/form-data".toMediaTypeOrNull())
        var type = multiPartRequestPayload.type?.toRequestBody("multipart/form-data".toMediaTypeOrNull())

        return ApiClient.getDynamicUrlRetrofitBuilder("8450").singleUploadImage(ApiClient.dynamicPath, getMultiPartData(multiPartRequestPayload), mobileNo!!, type!!)
    }

    suspend fun getMultiPartData(multiPartRequestPayload: MultiPartRequestPayload): MultipartBody.Part {
        val file = File(multiPartRequestPayload.file)
        val requestImageFile = file.asRequestBody("image/*".toMediaTypeOrNull())
        return MultipartBody.Part.createFormData("file", file.name, requestImageFile)
    }

    suspend fun getDeliveryCharges(delChargesPayload: DelChargesPayload): Response<DeliveryCharges> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8445").getDeliveryCharges(ApiClient.dynamicPath, delChargesPayload)
    }

    suspend fun submitDelivery(deliverySubmitPayload: DeliverySubmitPayload): Response<PackageSubmit> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8445").submitDelivery(ApiClient.dynamicPath, deliverySubmitPayload)
    }

    suspend fun getPackageDetail(packageDetailPayload: PackageDetailPayload): Response<PackageDetail> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8446").getPackageDetail(ApiClient.dynamicPath, packageDetailPayload)
    }

    suspend fun getPackageListDetail(packageDetailPayload: PackageListDetailPayload): Response<PackageDetail> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8446").getPackageListDetail(ApiClient.dynamicPath, packageDetailPayload)
    }

    suspend fun trackPackageDetail(packageDetailPayload: PackageDetailPayload): Response<TrackPackage> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8446").trackPackageDetail(ApiClient.dynamicPath, packageDetailPayload)
    }

    suspend fun updatePackageDetail(updatePackageDetailPayload: UpdatePackageDetailPayload): Response<PackageDetail> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8446").updatePackageDetail(ApiClient.dynamicPath, updatePackageDetailPayload)
    }

    suspend fun submitRatingRequest(submitRatingPayload: SubmitRatingPayload): Response<ApiResponse> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8445").submitRatingRequest(ApiClient.dynamicPath, submitRatingPayload)
    }

}