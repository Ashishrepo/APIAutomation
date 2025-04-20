package com.api.test;

import com.api.models.LoginRequest;
import com.api.models.LoginResponse;
import com.api.models.UpdateProfileRequest;
import com.api.services.AuthService_Pojo;
import com.api.services.UserProfileManagementService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test5_UpdateProfileTest {

    @Test
    public void updateProfileTest(){

        AuthService_Pojo ap = new AuthService_Pojo();
        Response response=ap.loginThroughPojo(new LoginRequest("ashish1234","ashish1234"));
        LoginResponse lr=response.as(LoginResponse.class);
        System.out.println(lr.getToken());


        System.out.println("----------------------------------------------------------");

        UpdateProfileRequest updateProfileRequest=new UpdateProfileRequest.Builder()
                .firstName("ayush1234")
                .lastName("ayush1234")
                .email("ayush1234@gmail.com")
                .mobileNumber("7777777771")
                .build();

        UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
        response=userProfileManagementService.updateUserProfile(updateProfileRequest, lr.getToken());
        System.out.println(response.asPrettyString());






    }


}
