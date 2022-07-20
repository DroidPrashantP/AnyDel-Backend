package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName

data class User( val status: String? = null,
                 val statusCode: Int? = null,
                 @SerializedName(value = "statusMessage", alternate = ["errorMessage"])
                 val statusMessage: String? = null,
                 @SerializedName(value = "login", alternate = ["user", "profile"])
                 val userInfo: UserInfo? = null)
