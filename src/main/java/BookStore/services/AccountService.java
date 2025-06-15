package BookStore.services;

import BookStore.base.BaseService_BookStore;
import io.restassured.response.Response;

public class AccountService extends BaseService_BookStore {

   private static final String BASE_PATH="v1/USer/";

           public Response user(String Payload){
                 return post(Payload,BASE_PATH);
           }




}
