package com.quadvision.anydel.backend.ui.login.data

import com.quadvision.anydel.backend.data.api.ApiClient
import com.quadvision.anydel.backend.data.model.LoginPayload
import com.quadvision.anydel.backend.data.model.OtpVerifyPayload
import com.quadvision.anydel.backend.data.model.RegisterUser
import com.quadvision.anydel.backend.data.model.User
import retrofit2.Response

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    suspend fun login(loginPayload: LoginPayload): Response<User> {

        return ApiClient.getDynamicUrlRetrofitBuilder("8444").login(ApiClient.dynamicPath, loginPayload)
    }

    suspend fun forgotPasswordOtpRequest(otpVerifyPayload: OtpVerifyPayload): Response<RegisterUser> {
        return ApiClient.getDynamicUrlRetrofitBuilder("8444").resendOtp(ApiClient.dynamicPath, otpVerifyPayload)
    }
}