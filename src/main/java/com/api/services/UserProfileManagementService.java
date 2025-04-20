package com.api.services;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService_Pojo{


    private static final String BASE_PATH="/api/users/";

       public Response getUserProfile(String token){
         setToken(token);
         return getRequest(BASE_PATH+"profile");
     }


     public Response updateUserProfile(Object payload,String token){
           setToken(token);
           return putRequest(payload,BASE_PATH+"profile");
     }
}
