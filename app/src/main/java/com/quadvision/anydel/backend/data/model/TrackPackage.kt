package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName

data class TrackPackage(
    @SerializedName("package") val packageData: List<PackageInfo>,
    val statusMessage: String
)