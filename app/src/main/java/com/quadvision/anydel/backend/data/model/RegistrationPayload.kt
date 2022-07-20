package com.quadvision.anydel.backend.data.model

data class RegistrationPayload(
    var firstName: String,
    var lastName: String?,
    var mobileNo: String,
    var emailId: String?,
    var deviceId : String,
    var password : String,
    var latitude : String?,
    var longitude : String?,
    var termCondAccepted : String?,
    var privacyAccepted : String?
)
