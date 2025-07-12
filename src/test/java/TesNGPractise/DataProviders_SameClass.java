package TesNGPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_SameClass {

    @DataProvider(name = "DataProviderName")
    public Object [][] dataBank(){

        Object [][] d={{"abc@gmail.com","user1"},{"ddd@yahoo.com","user2"}};
        return d;

    }

    @Test(dataProvider ="DataProviderName" )
    public void testData(String email, String user){

        System.out.println(email);
        System.out.println(user);


    }
}
