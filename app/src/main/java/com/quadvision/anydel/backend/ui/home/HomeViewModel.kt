package com.quadvision.anydel.backend.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quadvision.anydel.backend.data.model.CitiesData
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.PackageListDetailPayload
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.ProfilePayload
import com.quadvision.anydel.backend.utils.RetrofitUtils
import com.quadvision.anydel.backend.utils.isNotNullAndTrue
import kotlinx.coroutines.*
import timber.log.Timber

class HomeViewModel(private val homeRepository : HomeRepository) : ViewModel() {
    var job: Job? = null
    private val _pendingDeliveryResult = MutableLiveData<DataResult>()
    val pendingDeliveryResult: LiveData<DataResult> = _pendingDeliveryResult

    private val _userProfileResult = MutableLiveData<DataResult>()
    val userProfileResult: LiveData<DataResult> = _userProfileResult

    private val _userConfig = MutableLiveData<DataResult>()
    val userConfig: LiveData<DataResult> = _userConfig

    fun getUserProfile(profilePayload: ProfilePayload) {
        viewModelScope.launch {
            try {
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
            } catch (ex : Exception){
                _userProfileResult.value = DataResult(error = "Something went wrong!")
            }
        }
    }

    fun getUserConfig() {
        viewModelScope.launch {
            try {
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
            } catch (ex : Exception){
                _userProfileResult.value = DataResult(error = "Something went wrong")
            }

        }
    }


    fun getPendingDeliveryList(packageDetailPayload: PackageListDetailPayload) {
        viewModelScope.launch {
            // can be launched in a separate asynchronous job
            val result = homeRepository.getPackageListDetail(packageDetailPayload)

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

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }

}