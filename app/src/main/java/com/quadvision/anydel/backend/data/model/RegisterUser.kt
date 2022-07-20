package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName
import com.quadvision.anydel.backend.data.model.UserInfo

data class RegisterUser(
    val status: String? = null,
    val statusCode: Int? = null,
    @SerializedName(value = "statusMessage", alternate = ["errorMessage"])
    val statusMessage: String? = null,
    @SerializedName(value = "register", alternate = ["user"])
    val userInfo: UserInfo? = null
)
