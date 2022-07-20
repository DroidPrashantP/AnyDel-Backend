package com.quadvision.anydel.backend.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quadvision.anydel.backend.data.model.EditProfilePayload
import com.quadvision.anydel.backend.data.model.FileUpload
import com.quadvision.anydel.backend.data.model.MultiPartRequestPayload
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.ui.home.DataResult
import com.quadvision.anydel.backend.ui.home.HomeRepository
import com.quadvision.anydel.backend.utils.RetrofitUtils
import com.quadvision.anydel.backend.utils.isNotNullAndTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class ProfileViewModel(private val homeRepository : HomeRepository) : ViewModel() {
    var job: Job? = null

    private val _editProfileResult = MutableLiveData<DataResult>()
    val editProfileResult: LiveData<DataResult> = _editProfileResult

    private val _fileUploadResult = MutableLiveData<DataResult>()
    val fileUploadResult: LiveData<DataResult> = _fileUploadResult

    fun updateImageFile(multiPartRequestPayload: MultiPartRequestPayload) {
        viewModelScope.launch {
            // can be launched in a separate asynchronous job
            val result = homeRepository.uploadImage(multiPartRequestPayload)

            withContext(Dispatchers.Main) {
                //update the UI
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
            }
        }
    }

    fun updateUserProfile(editProfilePayload: EditProfilePayload) {
        viewModelScope.launch {
            // can be launched in a separate asynchronous job
            val result = homeRepository.updateProfile(editProfilePayload)

            withContext(Dispatchers.Main) {
                //update the UI
                if (result?.isSuccessful.isNotNullAndTrue()) {
                    val result = result?.body()
                    _editProfileResult.value = DataResult(
                        success = User(
                            status = result?.status,
                            statusCode = result?.statusCode,
                            statusMessage = result?.statusMessage,
                            userInfo = result?.userInfo
                        )
                    )
                } else {
                    val error = RetrofitUtils.generateRestAPIError(result)
                    error?.let { err ->
                        Timber.e(err)
                        _editProfileResult.value = DataResult(error = err)
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