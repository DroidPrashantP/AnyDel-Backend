package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName

data class PackageSubmit(
    @SerializedName("package") val packageData: PackageInfo,
    val statusMessage: String
)