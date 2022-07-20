package com.quadvision.anydel.backend.ui.delivery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quadvision.anydel.backend.data.model.PackageDetail
import com.quadvision.anydel.backend.data.model.PackageDetailPayload
import com.quadvision.anydel.backend.data.model.PackageListDetailPayload
import com.quadvision.anydel.backend.ui.home.DataResult
import com.quadvision.anydel.backend.ui.home.HomeRepository
import com.quadvision.anydel.backend.utils.RetrofitUtils
import com.quadvision.anydel.backend.utils.isNotNullAndTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class DeliveryCompletedViewModel (private val homeRepository : HomeRepository) : ViewModel()  {

    var job: Job? = null
    private val _deliveryCompletedResult = MutableLiveData<DataResult>()
    val deliveryCompletedResult: LiveData<DataResult> = _deliveryCompletedResult

    fun getDeliveryCompletedList(packageDetailPayload: PackageListDetailPayload) {
        viewModelScope.launch {
            try {
                // can be launched in a separate asynchronous job
                val result = homeRepository.getPackageListDetail(packageDetailPayload)

                withContext(Dispatchers.Main) {
                    //update the UI
                    if (result?.isSuccessful.isNotNullAndTrue()) {
                        val packageData = result?.body()
                        _deliveryCompletedResult.value = DataResult(
                            success = PackageDetail(
                                packageData = packageData?.packageData,
                                statusMessage = packageData?.statusMessage,
                            )
                        )
                    } else {
                        val error = RetrofitUtils.generateRestAPIError(result)
                        error?.let { err ->
                            Timber.e(err)
                            _deliveryCompletedResult.value = DataResult(error = err)
                        }
                    }
                }
            } catch (ex : Exception){
                _deliveryCompletedResult.value = DataResult(error = "Something went wrong!")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }

}