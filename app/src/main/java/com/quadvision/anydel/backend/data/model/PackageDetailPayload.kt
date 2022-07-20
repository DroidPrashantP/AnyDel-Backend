package com.quadvision.anydel.backend.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PackageDetailPayload(
        var mobileNo: String,
        var packId: String?
) : Parcelable