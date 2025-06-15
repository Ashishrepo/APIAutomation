package BookStore.sample;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.time.LocalTime;

public class T1 {


    public static void main(String[] args) {

//      JSONObject jsonobj = new JSONObject();
//      jsonobj.put("userName","Jain");
//      jsonobj.put("password","Jain@1234");
//
//      Response rs=given().baseUri("https://demoqa.com/Account")
//              .header("Content-Type", "application/json")
//              .body(jsonobj.toString())
//              .post("v1/User");
//
//        System.out.println(rs.asPrettyString());
//        System.out.println(rs.getStatusCode());
//
//    }

        LocalTime lt = LocalTime.now();
        String name= String.format("Charul %d",lt.getNano());
        System.out.println(name);
}}
