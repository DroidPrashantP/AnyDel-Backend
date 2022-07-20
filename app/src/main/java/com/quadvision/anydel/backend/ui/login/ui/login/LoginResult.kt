package com.quadvision.anydel.backend.ui.login.ui.login

import com.quadvision.anydel.backend.data.model.User

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: User? = null,
    val error: String? = null
)