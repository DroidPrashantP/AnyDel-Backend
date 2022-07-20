package com.quadvision.anydel.backend.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class UpdatePackageDetailPayload(
        var mobileNo: String,
        var custMobileNo: String?,
        var packId: String?,
        var packChangeStatus: String?,
        var packWeight: Int,
        var packLength: Int,
        var packBreadth: Int,
        var packHeight: Int,
        var rejectReason: String?,
        var assignedTo: String?,
        var assignedBy: String?,
        var picList : @RawValue Any? = null,
        var pickContactNo: String?,
        var dropContactNo: String?

) : Parcelable