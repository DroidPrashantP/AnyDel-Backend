package com.quadvision.anydel.backend.data.api;

import com.quadvision.anydel.backend.BuildConfig;
import com.quadvision.anydel.backend.utils.AnyDelConstant;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class BasicAuthInterceptor implements Interceptor {

    private String credentials;

    public BasicAuthInterceptor() {
        String user;
        String password;

        if(BuildConfig.BUILD_TYPE.equalsIgnoreCase(AnyDelConstant.BUILD_TYPE_DEBUG)){
            user = "admin";
            password = "admintest";
        }else {
            user = "appdelusr";
            password = "Custadlapp@09";
        }
        this.credentials = Credentials.basic(user, password);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request authenticatedRequest = request.newBuilder()
            .header("Authorization", credentials).build();
        return chain.proceed(authenticatedRequest);
    }

}