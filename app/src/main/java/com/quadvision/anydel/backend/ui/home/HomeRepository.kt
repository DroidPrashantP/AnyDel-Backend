package com.quadvision.anydel.backend.ui.home

import com.quadvision.anydel.backend.data.api.ApiClient
import com.quadvision.anydel.backend.data.model.*
import com.quadvision.anydel.backend.data.model.AddAddressPayload
import com.quadvision.anydel.backend.data.model.AddressListPayload
import com.quadvision.anydel.backend.data.model.UpdateAddressPayload
import com.quadvision.anydel.backend.data.model.ProfilePayload
import retrofit2.Response


class HomeRepository(private val homeDataSource : HomeDataSource) {

    suspend fun getUserProfile(loginPayload: ProfilePayload): Response<User> {
        return homeDataSource.getUserProfile(loginPayload)
    }

    suspend fun updateProfile(editProfilePayload: EditProfilePayload): Response<User> {
        return homeDataSource.updateProfile(editProfilePayload)
    }


    suspend fun addAddress(addAddressPayload: AddAddressPayload): Response<ApiResponse> {
        return homeDataSource.addAddress(addAddressPayload)
    }

    suspend fun updateAddress(updateAddressPayload: UpdateAddressPayload): Response<UpdateAddress> {
        return homeDataSource.updateAddress(updateAddressPayload)
    }

    suspend fun getAddressList(addressListPayload: AddressListPayload): Response<AddressListModel> {
        return homeDataSource.getAddressList(addressListPayload)
    }

    suspend fun getConfigList(): Response<CitiesData> {
        return homeDataSource.getConfigList()
    }

    suspend fun uploadImage(multiPartRequestPayload: MultiPartRequestPayload): Response<FileUpload>? {
        return homeDataSource.uploadImage(multiPartRequestPayload)
    }

    suspend fun getDeliveryCharges(delChargesPayload: DelChargesPayload): Response<DeliveryCharges> {
        return homeDataSource.getDeliveryCharges(delChargesPayload)
    }

    suspend fun submitDelivery(deliverySubmitPayload: DeliverySubmitPayload): Response<PackageSubmit> {
        return homeDataSource.submitDelivery(deliverySubmitPayload)
    }

    suspend fun getPackageDetail(packageDetailPayload: PackageDetailPayload): Response<PackageDetail> {
        return homeDataSource.getPackageDetail(packageDetailPayload)
    }

    suspend fun getPackageListDetail(packageDetailPayload: PackageListDetailPayload): Response<PackageDetail> {
        return homeDataSource.getPackageListDetail(packageDetailPayload)
    }

    suspend fun trackPackageDetail(packageDetailPayload: PackageDetailPayload): Response<TrackPackage> {
        return homeDataSource.trackPackageDetail(packageDetailPayload)
    }

    suspend fun updatePackageDetail(updatePackageDetailPayload: UpdatePackageDetailPayload): Response<PackageDetail> {
        return homeDataSource.updatePackageDetail(updatePackageDetailPayload)
    }

    suspend fun submitRatingRequest(submitRatingPayload: SubmitRatingPayload): Response<ApiResponse> {
        return homeDataSource.submitRatingRequest(submitRatingPayload)
    }
}