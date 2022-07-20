package com.quadvision.anydel.backend.data.model

data class UpdateAddressPayload(
    var mobileNo: String,
    var addressId: Int,
    var action: String,
    var addressName: String,
    var houseName: String?,
    var addressLine1: String?,
    var addressLine2: String?,
    var addressLine3: String?,
    var landmark: String?,
    var city: String?,
    var state: String?,
    var country: String?,
    var pin: String?,
    var isdefault: String?,
    var mapPlaceId: String?,
    var mapLattitude: String?,
    var mapAddrStrg: String?,
    var contactNo: String?
)
