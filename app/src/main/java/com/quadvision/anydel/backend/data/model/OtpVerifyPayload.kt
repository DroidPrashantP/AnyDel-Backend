package com.quadvision.anydel.backend.data.model

data class OtpVerifyPayload(
    var mobileNo: String,
    var otp: String?,
    var type: String?,
    var fcmToken : String?
)
