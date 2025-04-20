package com.api.test;

import com.api.services.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class LoginTEstAPI_Real {

    @Test
    public void loginTest(){

       AuthService ar = new AuthService();

       // Login
        Response rs = ar.login("{\"username\": \"ashish1234\",\"password\": \"ashish1234\"}");

        System.out.println(rs.asPrettyString());


    }
}
