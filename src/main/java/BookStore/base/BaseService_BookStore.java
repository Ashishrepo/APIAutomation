package BookStore.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService_BookStore {


    public static final String BASE_URL="https://demoqa.com/Account";
    RequestSpecification requestSpecification;


    public BaseService_BookStore(){
        requestSpecification= RestAssured.given().baseUri(BASE_URL);
    }


    public Response post(String payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }


}
