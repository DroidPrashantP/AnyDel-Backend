package com.quadvision.anydel.backend.data.api

import com.quadvision.anydel.backend.data.model.SessionManagmentModel
import com.quadvision.anydel.backend.data.model.SessionTimeOutModel
import com.quadvision.anydel.backend.utils.RetrofitUtils
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import de.greenrobot.event.EventBus
import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import timber.log.Timber
import java.io.IOException
import java.net.UnknownHostException

class DefaultInterceptor : Interceptor {

    @Throws(IOException::class, UnknownHostException::class)
    override fun intercept(chain: Interceptor.Chain): Response  {
        var response: Response?
        try {
            var request = chain.request()
            val headerBuilder = Headers.Builder()
            headerBuilder["Content-Type"] = "application/json"
            headerBuilder["X-COM-API-KEY"] = "QuadAdlaPP2021api#"
            headerBuilder["Authorization"] = "Basic YXBwZGVsdXNyOkN1c3RhZGxhcHBAMDk="


            var apiToken = SecuredSharePreferenceUtil.getStringData(
                SecuredSharePreferenceUtil.API_TOKEN,
                null
            )
            if (apiToken.isNotNullOrEmpty()) {
                headerBuilder["X-COM-TOKEN-KEY"] = apiToken!!
            }

            val requestBuilder: Request.Builder = request.newBuilder()
            requestBuilder.headers(headerBuilder.build())
            request = requestBuilder.build()
            response = chain.proceed(request)
            val responseCode = response.code
            if (responseCode == 401) {
                var error = RetrofitUtils.generateRestAPIError(response)
                Timber.e("Error :${error}")
                EventBus.getDefault().post(SessionManagmentModel(isLogout = true))

//                chain.call().cancel()
            } else if (responseCode == 500) {
                var error = RetrofitUtils.generateRestAPIError(response)
                Timber.e("Error :${error}")

                EventBus.getDefault().post(SessionTimeOutModel(error))

//                chain.call().cancel()
            }
        } catch (ex: Exception) {
            Timber.e("Exception caught in DefaultInterceptor intercept ==>> %s ", ex.message)
            throw UnknownHostException()
        }
        return response
    }
}