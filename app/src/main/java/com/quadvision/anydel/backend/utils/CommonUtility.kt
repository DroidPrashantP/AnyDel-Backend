package com.quadvision.anydel.backend.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Build
import android.text.Html
import android.text.Spanned
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import com.google.gson.Gson
import com.quadvision.anydel.backend.BuildConfig
import com.quadvision.anydel.backend.data.model.Address
import com.quadvision.anydel.backend.data.model.UserInfo
import timber.log.Timber
import java.util.*


object CommonUtility {

    /**
     * Function for check the network connectivity
     *
     * @return true if network Available otherwise false
     */
    fun isNetworkAvailable(context: Context): Boolean {
        if (context.checkCallingOrSelfPermission(Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            return false
        }
        val connMgr = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = connMgr.activeNetworkInfo
        return netInfo != null && netInfo.isConnected
    }

    @Suppress("DEPRECATION")
    fun fromHtml(text: String?): Spanned? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(text)
        }
    }

    fun hideKeyboard(activity: Activity) {
        val imm: InputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view: View? = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun getUserData() : UserInfo?{
        var userInfo: UserInfo? = null
        try {
            var userInfoJsonData =  SecuredSharePreferenceUtil.getStringData(SecuredSharePreferenceUtil.USER_DATA, AnyDelConstant.EMPTY)
            userInfo = Gson().fromJson(userInfoJsonData, UserInfo::class.java)
        } catch (ex: Exception){
           Timber.e("Exception caught in getUserData method : ${ex.message}")
        }
        return userInfo
    }

    fun isUserSuperAdmin() : Boolean{
        var isSupervisor: Boolean = false
        try {
            var userInfoJsonData =  SecuredSharePreferenceUtil.getStringData(SecuredSharePreferenceUtil.USER_DATA, AnyDelConstant.EMPTY)
            var userInfo = Gson().fromJson(userInfoJsonData, UserInfo::class.java)
            if(AnyDelConstant.USER_ROLE_SUPERVISOR.equals(userInfo.role, true)){
                isSupervisor = true
            }
        } catch (ex: Exception){
            Timber.e("Exception caught in isUserSuperAdmin method : ${ex.message}")
        }
        return isSupervisor
    }


    fun getUserMobileData() : String?{
        var mobile: String? = null
        try {
            mobile =  SecuredSharePreferenceUtil.getStringData(SecuredSharePreferenceUtil.BUNDLE_MOBILE_NUMBER, AnyDelConstant.EMPTY)
        } catch (ex: Exception){
            Timber.e("Exception caught in getUserMobileData method : ${ex.message}")
        }
        return mobile
    }

    fun getGoodMorningMsg() : String? {
        var message : String ?=  null
        val c: Calendar = Calendar.getInstance()
        when (c.get(Calendar.HOUR_OF_DAY)) {
            in 0..11 -> {
                message = "Good Morning"
            }
            in 12..15 -> {
                message =  "Good Afternoon"
            }
            in 16..20 -> {
                message =  "Good Evening"
            }
            in 21..23 -> {
                message = "Good Night"
            }
        }
        return message
    }


    fun getCompleteAddress(address: Address?) : String? {

        var completeAddress : String ?=  null
        address?.let {
            completeAddress = address.houseName.plus(" ")
                .plus(address.addressLine1).plus(" ").plus(address.addressLine2).plus(" ")
                .plus(address.addressLine3).plus(" ").plus(address.landmark)
                .plus(" ").plus(address.city).plus(" ").plus(address.pin)
        }

        return completeAddress
    }

    fun getFormattedTime(rawTime : String?) : String{
        var formattedTime = AnyDelConstant.EMPTY
        rawTime?.let {
            if(it.length == 4){
                var hour = it.substring(0, 2).toInt()
                var minutes = it.substring(2, 4).toInt()

                var timeSet = ""
                if (hour > 12) {
                    hour -= 12
                    timeSet = "PM"
                } else if (hour === 0) {
                    hour += 12
                    timeSet = "AM"
                } else if (hour === 12) {
                    timeSet = "PM"
                } else {
                    timeSet = "AM"
                }
                formattedTime = "${hour.toString().appendZeroToHourOrMinute()} : ${minutes.toString().appendZeroToHourOrMinute()} $timeSet"
            }
        }

        return formattedTime
    }

    fun hideKeyboard(context: Context?) {
        if (context is Activity) context.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }
    fun openExternalBrowser(context: Context?, url : String?){
        try {
            context?.let {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                it.startActivity(intent)
            }

        }catch (ex : Exception){
            if (BuildConfig.DEBUG){
                Timber.e("Exception caught in : ${ex.localizedMessage}")
            }
        }
    }

//    /**
//     * Adds a [Fragment] to this activity's layout.
//     *
//     * @param containerViewId The container view to where add the fragment.
//     * @param fragment        The fragment to be added
//     */
//    protected fun addFragment(context : Context, containerViewId: Int, fragment: Fragment) {
//        val fragmentTransaction: FragmentTransaction =
//            context?.getSupportFragmentManager().beginTransaction()
//        fragmentTransaction.add(containerViewId, fragment)
//        fragmentTransaction.commitAllowingStateLoss()
//    }
//
//    protected fun replaceFragment(containerViewId: Int, fragment: Fragment) {
//        val fragmentTransaction: FragmentTransaction =
//            getSupportFragmentManager().beginTransaction()
//        fragmentTransaction.replace(containerViewId, fragment)
//        fragmentTransaction.commitAllowingStateLoss()
//    }
}