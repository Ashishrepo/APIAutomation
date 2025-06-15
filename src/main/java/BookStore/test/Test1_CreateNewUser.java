package BookStore.test;

import BookStore.models.CreateNewUserResponse;
import BookStore.services.AccountService;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Test1_CreateNewUser {


    @Test
    public void createNewUser(){

        LocalTime lt = LocalTime.now();
        AccountService as = new AccountService();

        JSONObject jsonobj = new JSONObject();
        jsonobj.put("userName",String.format("Charul%d",lt.getNano()));
        jsonobj.put("password","Chaiiirul@1234");

        Response rs = as.user(jsonobj.toString());

        System.out.println(rs.asPrettyString());
        System.out.println(rs.statusCode());

        CreateNewUserResponse responseData = rs.as(CreateNewUserResponse.class);
        System.out.println(responseData.getUserID());
        System.out.println(responseData.getUsername());

    }
}
