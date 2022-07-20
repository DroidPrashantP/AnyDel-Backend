package com.quadvision.anydel.backend.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quadvision.anydel.backend.data.model.CitiesData
import com.quadvision.anydel.backend.data.model.FileUpload
import com.quadvision.anydel.backend.data.model.MultiPartRequestPayload
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.ProfilePayload
import com.quadvision.anydel.backend.data.model.TrackPackage
import com.quadvision.anydel.backend.data.model.UpdatePackageDetailPayload
import com.quadvision.anydel.backend.utils.RetrofitUtils
import com.quadvision.anydel.backend.utils.isNotNullAndTrue
import kotlinx.coroutines.*
import timber.log.Timber

class PackageDetailViewModel(private val homeRepository : HomeRepository) : ViewModel() {
    var job: Job? = null
    private val _pendingDeliveryResult = MutableLiveData<DataResult>()
    val pendingDeliveryResult: LiveData<DataResult> = _pendingDeliveryResult

    private val _userProfileResult = MutableLiveData<DataResult>()
    val userProfileResult: LiveData<DataResult> = _userProfileResult

    private val _userConfig = MutableLiveData<DataResult>()
    val userConfig: LiveData<DataResult> = _userConfig

    private val _fileUploadResult = MutableLiveData<DataResult>()
    val fileUploadResult: LiveData<DataResult> = _fileUploadResult

    private val _packageDetailResult = MutableLiveData<DataResult>()
    val packageDetailResult: LiveData<DataResult> = _packageDetailResult

    private val _trackPackageDetailResult = MutableLiveData<DataResult>()
    val trackPackageDetailResult: LiveData<DataResult> = _trackPackageDetailResult

    private val _submitRatingResult = MutableLiveData<DataResult>()
    val submitRatingResult: LiveData<DataResult> = _submitRatingResult

    private val _updatePackageDetailResult = MutableLiveData<DataResult>()
    val updatePackageDetailResult: LiveData<DataResult> = _updatePackageDetailResult

    fun getPackageDetail(packageDetailPayload: PackageDetailPayload) {
        viewModelScope.launch {

            try {
                // can be launched in a separate asynchronous job
                val result = homeRepository.getPackageDetail(packageDetailPayload)

                withContext(Dispatchers.Main) {
                    //update the UI
                    if (result?.isSuccessful.isNotNullAndTrue()) {
                        val packageData = result?.body()
                        _packageDetailResult.value = DataResult(
                            success = PackageDetail(
                                packageData = packageData?.packageData,
                                statusMessage = packageData?.statusMessage,
                            )
                        )
                    } else {
                        val error = RetrofitUtils.generateRestAPIError(result)
                        error?.let { err ->
                            Timber.e(err)
                            _packageDetailResult.value = DataResult(error = err)
                        }
                    }
                }
            } catch (ex : Exception){
                _packageDetailResult.value = DataResult(error = "Something went wrong")
            }

        }
    }

    fun updatePackageDetail(updatePackageDetailPayload: UpdatePackageDetailPayload) {
        viewModelScope.launch {

            try {
            // can be launched in a separate asynchronous job
            val result = homeRepository.updatePackageDetail(updatePackageDetailPayload)

                withContext(Dispatchers.Main) {
                    //update the UI
                    if (result?.isSuccessful.isNotNullAndTrue()) {
                        val packageData = result?.body()
                        _updatePackageDetailResult.value = DataResult(
                            success = PackageDetail(
                                packageData = packageData?.packageData,
                                statusMessage = packageData?.statusMessage,
                            )
                        )
                    } else {
                        val error = RetrofitUtils.generateRestAPIError(result)
                        error?.let { err ->
                            Timber.e(err)
                            _updatePackageDetailResult.value = DataResult(error = err)
                        }
                    }
                }
            } catch (ex : Exception){
                _updatePackageDetailResult.value = DataResult(error = "Something went wrong")
            }
        }
    }

    fun trackPackageDetail(packageDetailPayload: PackageDetailPayload) {
        viewModelScope.launch {
            try {
                // can be launched in a separate asynchronous job
                val result = homeRepository.trackPackageDetail(packageDetailPayload)

                withContext(Dispatchers.Main) {
                    //update the UI
                    if (result?.isSuccessful.isNotNullAndTrue()) {
                        val packageData = result?.body()
                        _trackPackageDetailResult.value = DataResult(
                            success = TrackPackage(
                                packageData = packageData?.packageData!!,
                                statusMessage = packageData.statusMessage,
                            )
                        )
                    } else {
                        val error = RetrofitUtils.generateRestAPIError(result)
                        error?.let { err ->
                            Timber.e(err)
                            _trackPackageDetailResult.value = DataResult(error = err)
                        }
                    }
                }
            }  catch (ex : Exception){
                _trackPackageDetailResult.value = DataResult(error = "Something went wrong")
        }
        }
    }

    fun getUserProfile(profilePayload: ProfilePayload) {
        viewModelScope.launch {
            // can be launched in a separate asynchronous job
            val result = homeRepository.getUserProfile(profilePayload)

            withContext(Dispatchers.Main) {
                //update the UI
                if (result?.isSuccessful.isNotNullAndTrue()) {
                    val user = result?.body()
                    _userProfileResult.value = DataResult(
                        success = User(
                            status = user?.status,
                            statusCode = user?.statusCode,
                            statusMessage = user?.statusMessage,
                            userInfo = user?.userInfo
                        )
                    )
                } else {
                    val error = RetrofitUtils.generateRestAPIError(result)
                    error?.let { err ->
                        Timber.e(err)
                        _userProfileResult.value = DataResult(error = err)
                    }
                }
            }
        }
    }

    fun getUserConfig() {
        viewModelScope.launch {
            // can be launched in a separate asynchronous job
            val result = homeRepository.getConfigList()

            withContext(Dispatchers.Main) {
                //update the UI
                if (result?.isSuccessful.isNotNullAndTrue()) {
                    val cities = result?.body()
                    _userConfig.value = DataResult(
                        success = CitiesData(0, cities?.cities)
                    )
                } else {
                    val error = RetrofitUtils.generateRestAPIError(result)
                    error?.let { err ->
                        Timber.e(err)
                        _userProfileResult.value = DataResult(error = err)
                    }
                }
            }
        }
    }


    fun getPendingDeliveryList(packageDetailPayload: PackageDetailPayload) {
        viewModelScope.launch {
            // can be launched in a separate asynchronous job
            val result = homeRepository.getPackageDetail(packageDetailPayload)

            withContext(Dispatchers.Main) {
                //update the UI
                if (result?.isSuccessful.isNotNullAndTrue()) {
                    val packageData = result?.body()
                    _pendingDeliveryResult.value = DataResult(
                        success = PackageDetail(
                            packageData = packageData?.packageData,
                            statusMessage = packageData?.statusMessage,
                        )
                    )
                } else {
                    val error = RetrofitUtils.generateRestAPIError(result)
                    error?.let { err ->
                        Timber.e(err)
                        _pendingDeliveryResult.value = DataResult(error = err)
                    }
                }
            }
        }
    }

    fun updateImageFile(multiPartRequestPayload: MultiPartRequestPayload) {
        viewModelScope.launch {
            try {
            // can be launched in a separate asynchronous job
            val result = homeRepository.uploadImage(multiPartRequestPayload)

            withContext(Dispatchers.Main) {
                //update the UI
                try {
                    if (result?.isSuccessful.isNotNullAndTrue()) {
                        val fileUpload = result?.body()
                        _fileUploadResult.value = DataResult(
                            success = FileUpload(
                                fileName = fileUpload?.fileName,
                                fileDownloadUri = fileUpload?.fileDownloadUri,
                                fileType = fileUpload?.fileType,
                            )
                        )
                    } else {
                        val error = RetrofitUtils.generateRestAPIError(result)
                        error?.let { err ->
                            Timber.e(err)
                            _fileUploadResult.value = DataResult(error = err)
                        }
                    }
                } catch (ex : Exception){
                        Timber.e("Timeout")
                        _fileUploadResult.value = DataResult(error = "Timeout")
                }

            }
            } catch (ex : Exception){
                Timber.e("Timeout")
                _fileUploadResult.value = DataResult(error = "Something went wrong!")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }

}