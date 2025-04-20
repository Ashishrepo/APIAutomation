package com.api.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {


    private static final String BASE_URL="http://64.227.160.186:8080";
    RequestSpecification requestSpecification;

    BaseService(){
        requestSpecification = RestAssured.given().baseUri(BASE_URL);

    }

    protected Response postRequest(String payload, String endPoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);

    }







}
