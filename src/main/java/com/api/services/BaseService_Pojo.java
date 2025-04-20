package com.api.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService_Pojo {


    private static final String BASE_URL="http://64.227.160.186:8080";
    RequestSpecification requestSpecification;

    BaseService_Pojo(){
        requestSpecification = RestAssured.given().baseUri(BASE_URL);

    }

    public Response postRequestThroughPojo(Object payload, String endPoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);

    }

    protected Response getRequest(String endpoint){
        return requestSpecification.get(endpoint);

    }

    protected void setToken(String token){
        requestSpecification.header("Authorization","Bearer "+token);
    }

    protected  Response putRequest(Object payload,String endpoint){
       return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
    }


}
