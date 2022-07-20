package com.quadvision.anydel.backend.utils

import android.util.Log
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import retrofit2.Response

import timber.log.Timber

object RetrofitUtils {

    fun generateRestAPIError(response: okhttp3.Response): String? {
        //{"status":"Failed","statusCode":401,"errorMessage":"token is expired"}
        var message: String? = null
        try {
            val responseBody = response.peekBody(Long.MAX_VALUE)
            val errorBodyString = responseBody.string()
            if (errorBodyString.isNotNullOrEmpty()) {
                val jsonElement = getValidJson(errorBodyString)
                if (jsonElement == null) {
                    message = errorBodyString
                } else {
                    val jsonObject = jsonElement.asJsonObject
                    if (jsonObject.has("errorMessage")) {
                        message = jsonObject["errorMessage"].asString
                    }
                }
            }
        } catch (e: java.lang.Exception) {
            Timber.e("Exception caught in getErrorMessage ==>> %s ", e.message)
        }
        return message
    }

    fun generateRestAPIError(response: Response<*>?): String? {
        var resMessage: String? = "There was an application error"
        val responseBody = response?.errorBody()
        try {
            if (responseBody != null) {
                val errorBodyString = responseBody.string()
                if (errorBodyString.isNotNullOrEmpty()) {
                    val jsonElement: JsonElement? = getValidJson(errorBodyString)
                    if (jsonElement == null) {
                        resMessage = errorBodyString
                    } else {
                        val jsonObject = jsonElement.asJsonObject
                        if (jsonObject.has("errorMessage")) {
                            resMessage =
                                jsonObject["errorMessage"].asString
                        } else if (jsonObject.has("statusMessage")) {
                            resMessage =
                                jsonObject["statusMessage"].asString
                        }
                    }
                } else {
                    resMessage = response.message()

                }
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("TAG ", it) }
        }
        return resMessage
    }

    fun getValidJson(jsonString: String?): JsonElement? {
        var jsonElement: JsonElement? = null
        try {
            jsonElement = JsonParser().parse(jsonString)
        } catch (e: java.lang.Exception) {
            // Nothing to do here. We identified that JSON is not valid if any exception is occurred.
        }
        return jsonElement
    }

}