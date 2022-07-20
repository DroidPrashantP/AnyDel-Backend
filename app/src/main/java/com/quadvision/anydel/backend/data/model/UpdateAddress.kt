package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName

data class UpdateAddress(val status: String? = null,
                         val statusCode: Int? = null,
                         @SerializedName(value = "statusMessage", alternate = ["errorMessage"])
                         val statusMessage: String? = null,
                         @SerializedName(value = "backendResponse", alternate = ["address"])
                         val address: Address? = null)
