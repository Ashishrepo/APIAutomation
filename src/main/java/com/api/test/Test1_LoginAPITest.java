package com.api.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Test1_LoginAPITest {

   @Test
    public void loginTest(){

       RestAssured.baseURI="http://64.227.160.186:8080";
       RequestSpecification x = RestAssured.given();
       RequestSpecification y = x.header("Content-Type", "application/json");
       RequestSpecification z = y.body("{\"username\": \"ashish1234\",\"password\": \"ashish1234\"}");
        Response res=z.post("api/auth/login");

       System.out.println(res.asPrettyString());


//       System.out.println(res.getHeaders());
//       System.out.println(res.getStatusCode());


    }
}
