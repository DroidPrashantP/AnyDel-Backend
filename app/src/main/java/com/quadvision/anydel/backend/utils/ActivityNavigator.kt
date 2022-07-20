package com.quadvision.anydel.backend.utils

import android.content.Context
import android.content.Intent
import com.quadvision.anydel.backend.LauncherActivity
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.ui.login.ui.login.LoginActivity

object ActivityNavigator {

    fun navigateToLauncherActivity(context: Context) {
        val intent = Intent(context, LauncherActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToLoginActivity(context: Context) {
        val intent = Intent(context, LoginActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToHomeActivity(context: Context?) {
        val intent = Intent(context, HomeActivity::class.java)
        context?.startActivity(intent)
    }
}