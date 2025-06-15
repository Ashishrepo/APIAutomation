package com.api.test;

import com.api.models.SignUpRequest;
import com.api.services.AuthService_Pojo;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListeners.class)
public class Test2_NewAccountCreationTest {


    @Test(description = "User Registration Test")
    public void createAccountTest(){

        SignUpRequest signUpReq = SignUpRequest.builder()
                .username("Ash2025")
                .firstname("Ashish")
                .lastname("Jain")
                .email("ashishjainjbp2011@gmail.com")
                .password("Ash2025")
                .mobileNumber("898986547")
                .build();


        AuthService_Pojo obj = new AuthService_Pojo();
        Response res=obj.sigUp(signUpReq);

        System.out.println(res.asPrettyString());


    }
}
