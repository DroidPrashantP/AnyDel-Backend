package com.quadvision.anydel.backend

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.quadvision.anydel.backend.utils.ActivityNavigator
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class LauncherActivity : AppCompatActivity(), CoroutineScope {
    private lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        setContentView(R.layout.activity_launcher)


        launch {
            delay(2000)
            withContext(Dispatchers.Main) {
                val isUserLogin = SecuredSharePreferenceUtil.getBooleanData(SecuredSharePreferenceUtil.PREF_IS_LOGIN, false)
                if (isUserLogin) {
                    ActivityNavigator.navigateToHomeActivity(mContext)
                    finish()
                } else {
                    ActivityNavigator.navigateToLoginActivity(mContext)
                    finish()
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + Job()
}