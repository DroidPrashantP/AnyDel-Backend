package com.quadvision.anydel.backend.data.model

import com.google.gson.annotations.SerializedName

data class FileUpload(
    @SerializedName("fileName") val fileName: String?,
    @SerializedName("fileDownloadUri") val fileDownloadUri: String?,
    @SerializedName("fileType") val fileType: String?
)
