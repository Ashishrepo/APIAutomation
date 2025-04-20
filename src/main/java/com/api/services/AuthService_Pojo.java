package com.api.services;

import com.api.models.LoginRequest;
import com.api.models.SignUpRequest;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class AuthService_Pojo extends BaseService_Pojo {

    private static final String BASE_PATH="/api/auth/";

    public Response loginThroughPojo(LoginRequest payload){
        return postRequestThroughPojo(payload,BASE_PATH+"login");
    }

    public Response sigUp(SignUpRequest payload){
        return postRequestThroughPojo(payload,BASE_PATH+"signup");

    }

    public Response forgotPassword(String emailAddress){
        Map<String, String> payload =new HashMap<String,String>();
        payload.put("email",emailAddress);
        return postRequestThroughPojo(payload,"forgot-password");
    }

}
