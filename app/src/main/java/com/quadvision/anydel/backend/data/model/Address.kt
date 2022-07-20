package com.quadvision.anydel.backend.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Address(
        var addressId: String,
        var addressName: String?,
        var houseName: String?,
        var addressLine1: String?,
        var addressLine2: String?,
        var addressLine3: String?,
        var landmark: String?,
        var city: String?,
        var state: String?,
        var country: String?,
        var pin: String?,
        var mapPlaceId: String?,
        var mapLongitude: String?,
        var mapAddrStrg: String?,
        var isdefault: String,
        var isSelected: Boolean,
        var contactNo: String,
) : Parcelable