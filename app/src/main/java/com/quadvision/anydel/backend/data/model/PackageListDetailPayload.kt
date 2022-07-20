package com.quadvision.anydel.backend.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PackageListDetailPayload(
        var mobileNo: String,
        var status: String?
) : Parcelable