package TesNGPractise;

import org.testng.annotations.Test;

public class DataProviders_DifferentClass {

    @Test(dataProvider = "DataProviderName",dataProviderClass = DataProviders_SameClass.class)
    public void testData1(String email, String user){
        System.out.println(email);
        System.out.println(user);
    }
}
