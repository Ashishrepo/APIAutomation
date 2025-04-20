package com.api.test;

import com.api.services.AuthService_Pojo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test3_forgotPasswordTest {


    @Test(description = "Forgot Password Test")
    public void forgotPassword(){

        AuthService_Pojo ap = new AuthService_Pojo();
        Response rs=ap.forgotPassword("ashishjainjbp2011@gmail.com");

        System.out.println(rs.asPrettyString());
        System.out.println(rs.getStatusCode());

    }
}
