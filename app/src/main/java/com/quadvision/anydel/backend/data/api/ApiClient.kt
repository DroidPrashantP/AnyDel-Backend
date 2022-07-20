package com.quadvision.anydel.backend.data.api

import com.quadvision.anydel.AnyDelBackendApplication
import com.quadvision.anydel.backend.BuildConfig
import com.quadvision.anydel.backend.utils.AnyDelConstant
import com.quadvision.anydel.backend.utils.CustomTrust
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {

    private var serverUrl = "https://quadvisionllp.com"
    private var RELEASE_PORT_PREFIX = "8"
    private var DEBUG_PORT_PREFIX = "8"
    var RELEASE_DYNAMIC_PATH = "adl"
    var DEBUG_DYNAMIC_PATH = "adl"

    val retrofitClient: Retrofit.Builder by lazy {
        val customTrust = CustomTrust(AnyDelBackendApplication.mApplication)
        val okhttpClient = customTrust.client

        Retrofit.Builder()
                .baseUrl(serverUrl)
                .client(okhttpClient)
                .addConverterFactory(GsonConverterFactory.create())
    }

    fun getDynamicUrlRetrofitBuilder(port: String): ApiHelper {

        val newUrl = serverUrl.plus(":").plus(port).plus("/")
        val retrofit = Retrofit.Builder().apply {
            val customTrust = CustomTrust(AnyDelBackendApplication.mApplication)
            val okhttpClient = customTrust.client
            baseUrl(newUrl)
            client(okhttpClient)
            addConverterFactory(GsonConverterFactory.create())
        }

        return retrofit.build().create(ApiHelper::class.java)
    }

    var dynamicPath = RELEASE_DYNAMIC_PATH
}