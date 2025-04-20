package com.api.test;

import com.api.models.LoginRequest;
import com.api.models.LoginResponse;
import com.api.models.UpdateProfileResponse;
import com.api.services.AuthService_Pojo;
import com.api.services.UserProfileManagementService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test4_getProfileInfoTest {

    @Test
    public void getProfileInfo(){

        // get Token
        AuthService_Pojo au = new AuthService_Pojo();
        Response response=au.loginThroughPojo(new LoginRequest("ashish1234","ashish1234"));
        LoginResponse lr=response.as(LoginResponse.class);
        System.out.println(lr.getToken());

        UserProfileManagementService us = new UserProfileManagementService();
        response=us.getUserProfile(lr.getToken());

        System.out.println(response.asPrettyString());

        UpdateProfileResponse rf = response.as(UpdateProfileResponse.class);
        System.out.println(rf.getFirstName());
        System.out.println(rf.getEmail());
        System.out.println(rf.getMobileNumber());


    }





}
