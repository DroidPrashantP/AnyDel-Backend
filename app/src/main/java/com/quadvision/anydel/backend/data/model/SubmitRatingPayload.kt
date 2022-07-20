package com.quadvision.anydel.backend.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SubmitRatingPayload(
        var mobileNo: String,
        var packId: String?,
        var packRating: Int = 0,
        var packDelboyRating: Int = 0,
        var comment: String?,
) : Parcelable