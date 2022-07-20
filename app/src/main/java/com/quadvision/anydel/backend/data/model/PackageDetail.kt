package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName

data class PackageDetail(
    @SerializedName( value = "packages", alternate = ["package"]) val packageData: List<PackageInfo>?,
    val statusMessage: String?
)