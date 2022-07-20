package com.quadvision.anydel.backend.utils

import android.content.SharedPreferences
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.quadvision.anydel.AnyDelBackendApplication


object SecuredSharePreferenceUtil {

    var SECURED_PREFERENCES = "SecuredPreferences"
    var USER_DATA = "userData"
    var CITIES_DATA = "citiesData"
    var PREF_CURRENT_CITY = "city"
    var FCM_TOKEN = "fcm_token"
    @JvmField
    var API_TOKEN = "api_token"
    val PREF_CURRENT_LOCATION = "pref_current_location"
    val PREF_IS_LOGIN = "is_user_login"
    val BUNDLE_MOBILE_NUMBER : String = "mobile_number_bundle"
    val BUNDLE_VERIFICATION_TYPE : String = "verifitcation_type"
    val BUNDLE_FORGOT_PASSWORD: String = "forgot_password"
    val MOBILE_CHANGE_VERIFY = "mobile_number_change"
    val REG_MOBILE_VERIFY = "register_number_change"
    val FORGOT_PASSWORD_FLOW = "forgot_password_flow"



    private var masterKey: MasterKey? = null
    private var sharedPreferences: SharedPreferences? = null


    init {
        try {
            // Step 1: Create or retrieve the Master Key for encryption/decryption
            masterKey = AnyDelBackendApplication.mApplication?.let {
                MasterKey.Builder(it)
                        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                        .build()
            }

            // Step 2: Initialize/open an instance of EncryptedSharedPreferences
            masterKey?.let {
                sharedPreferences = AnyDelBackendApplication.mApplication?.let { it1 ->
                    EncryptedSharedPreferences.create(
                            it1,
                            SecuredSharePreferenceUtil.SECURED_PREFERENCES,
                            it,
                            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
                    )
                }

            }
        } catch (ex: Exception) {
            ex.message?.let { Log.e("ExceptionPreferenceUtil" , it) }
        }

    }

    // Step 3: Save data to the EncryptedSharedPreferences as usual
    @JvmStatic
    fun putData(key: String, value: String?) {
        try {
            sharedPreferences?.let {
                it.edit()
                        .putString(key, value)
                        .apply()
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("Exception#putData" , it) }
        }
    }

    @JvmStatic
    fun putUserData(key: String, userInfo: String?) {
        try {
            sharedPreferences?.let {
                it.edit()
                    .putString(key, userInfo)
                    .apply()
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("Exception#putData" , it) }
        }
    }

    // Step 3: Read data from EncryptedSharedPreferences as usual
    @JvmStatic
    fun getStringData(key: String, defaultValue: String?): String? {
        return sharedPreferences?.let {
            it.getString(key, defaultValue)
        } ?: defaultValue
    }

    @JvmStatic
    fun getBooleanData(key: String, defaultValue: Boolean): Boolean {
        return sharedPreferences?.getBoolean(key, defaultValue) ?: defaultValue
    }

    @JvmStatic
    fun putStringData(key: String, defaultValue: String?) {
        sharedPreferences?.let {
            it.edit().putString(key, defaultValue).apply()
        }
    }

    @JvmStatic
    fun putBooleanData(key: String, value: Boolean) {
        sharedPreferences?.edit()?.putBoolean(key, value)?.apply()
    }

    // Step 3: Read data from EncryptedSharedPreferences as usual
    @JvmStatic
    fun getLongData(key: String, value: Long): Long {
        return sharedPreferences?.let {
            it.getLong(key, value)
        } ?: value
    }

    @JvmStatic
    fun putLongData(key: String, value: Long) {
        sharedPreferences?.let {
            it.edit().putLong(key, value).apply()
        }
    }

    @JvmStatic
    fun clearAllData() {
        sharedPreferences?.edit()?.clear()?.apply()
    }

}