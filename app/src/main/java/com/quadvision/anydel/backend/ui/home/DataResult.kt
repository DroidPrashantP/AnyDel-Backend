package com.quadvision.anydel.backend.ui.home

/**
 * Authentication result : success (user details) or error message.
 */
data class DataResult(
    val success: Any? = null,
    val error: String? = null
)