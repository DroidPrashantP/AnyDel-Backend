package com.quadvision.anydel.backend.data.model

data class PasswordUpdatePayload(
    var mobileNo: String,
    var password: String?,
    var otp: String?
)
