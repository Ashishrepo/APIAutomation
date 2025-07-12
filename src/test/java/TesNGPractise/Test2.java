package TesNGPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test(priority = 1)
    public void homePage(){
        System.out.println("Inside Home Page");
    }


    @Test(priority = 2)
    public void CustomerInfoPage(){
        System.out.println("Inside customerInfo Page");
        Assert.fail("Failing TC");
    }
}
