package com.quadvision.anydel.backend.data.model

import androidx.annotation.Keep

@Keep
data class LoginPayload(
    var mobileNo: String?,
    var password: String?,
    var fcmToken: String?,
    var role: String?,

)
