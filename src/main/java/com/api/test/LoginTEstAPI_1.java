package com.api.test;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginTEstAPI_1 {

    @Test
    public void loginTest(){

        Response rs = given()
                .baseUri("http://64.227.160.186:8080")
                .header("Content-Type", "application/json")
                .body("{\"username\": \"ashish1234\",\"password\": \"ashish1234\"}")
                .post("api/auth/login");

        System.out.println(rs.asPrettyString());


    }
}
