package com.quadvision.anydel.backend.ui.login.ui.login

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.data.model.LoginPayload
import com.quadvision.anydel.backend.data.model.User
import com.quadvision.anydel.backend.data.model.UserInfo
import com.quadvision.anydel.backend.ui.login.data.LoginRepository
import com.quadvision.anydel.backend.utils.RetrofitUtils
import com.quadvision.anydel.backend.utils.isNotNullAndTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber


class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {

    private val _loginForm = MutableLiveData<LoginFormState>()
    val loginFormState: LiveData<LoginFormState> = _loginForm

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult


    fun login(loginPayload: LoginPayload) {

        viewModelScope.launch {
            try {
                // can be launched in a separate asynchronous job
                val result = loginRepository.login(loginPayload)

                withContext(Dispatchers.Main) {
                    //update the UI
                    if (result.isSuccessful.isNotNullAndTrue()) {
                        var user = result.body()
                        _loginResult.value = LoginResult(
                                success = User(
                                        status = user?.status,
                                        statusCode = user?.statusCode,
                                        statusMessage = user?.statusMessage,
                                         userInfo =  user?.userInfo
                                )
                        )
                    } else {
                        var error = RetrofitUtils.generateRestAPIError(result)
                        error?.let { err ->
                            Timber.e(err)
                            _loginResult.value = LoginResult(error = err)
                        }
                    }
                }
            } catch (exception: Exception) {
                Timber.d("Exception in Login Api : ${exception.message}")
                _loginResult.value = LoginResult(error = "Something went wrong!")
            }
        }
    }

    private fun mapUserInfo(user: User?): UserInfo? {
        var userInfo = UserInfo()
        user?.userInfo?.let {
            userInfo.mobileNo = it.mobileNo
            userInfo.name = it.name
            userInfo.role = it.role
            userInfo.resposibility = it.resposibility
            userInfo.verified = it.verified
            userInfo.firstName = it.firstName
            userInfo.lastName = it.lastName
            userInfo.emailId = it.emailId
            userInfo.deviceId = it.deviceId
            userInfo.latitude = it.latitude
            userInfo.longitude = it.longitude
            userInfo.token = it.token
        }
        return userInfo
    }

    fun loginDataChanged(username: String, password: String) {
        if (!isUserNameValid(username)) {
            _loginForm.value = LoginFormState(usernameError = R.string.invalid_username)
        } else if (!isPasswordValid(password)) {
            _loginForm.value = LoginFormState(passwordError = R.string.invalid_password)
        } else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }

    // A placeholder username validation check
    private fun isUserNameValid(username: String): Boolean {
        return if (username.contains('@')) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }

    // A placeholder password validation check
    private fun isPasswordValid(password: String): Boolean {
        return password.length > 5
    }
}