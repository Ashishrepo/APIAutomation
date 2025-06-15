package com.api.pojo;

import com.api.models.LoginRequest;
import com.api.models.LoginResponse;
import com.api.services.AuthService_Pojo;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class Test1_LoginTEstAPI_Pojo {

    @Test
    public void loginTest(){


        //Pojo Class
        LoginRequest lr = new LoginRequest("ashish1234","ashish1234");
       AuthService_Pojo ar = new AuthService_Pojo();
       Response response = ar.loginThroughPojo(lr);

        System.out.println(response.asPrettyString());


        // Deserialize (JSON to JAVA)
        LoginResponse ls= response.as(LoginResponse.class);
        System.out.println(ls.getToken());
        System.out.println(ls.getId());
        System.out.println(ls.getEmail());
        System.out.println(ls.getUsername());



    }
}