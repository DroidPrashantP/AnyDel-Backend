package com.quadvision.anydel.backend.data.model
/**
 * Authentication result : success (user details) or error message.
 */
data class APIDataResult(
    val success: RegisterUser? = null,
    val error: String? = null
)