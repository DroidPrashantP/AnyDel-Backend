package com.quadvision.anydel.backend.ui.login.data

import com.quadvision.anydel.backend.data.model.LoginPayload
import com.quadvision.anydel.backend.data.model.OtpVerifyPayload
import com.quadvision.anydel.backend.data.model.RegisterUser
import com.quadvision.anydel.backend.data.model.User
import retrofit2.Response

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class LoginRepository(val dataSource: LoginDataSource) {


    suspend fun login(loginPayload: LoginPayload): Response<User> {
        val result = dataSource.login(loginPayload)
        return result
    }

    suspend fun forgotPasswordOtpRequest(otpVerifyPayload: OtpVerifyPayload): Response<RegisterUser> {
        return dataSource.forgotPasswordOtpRequest(otpVerifyPayload)
    }
}