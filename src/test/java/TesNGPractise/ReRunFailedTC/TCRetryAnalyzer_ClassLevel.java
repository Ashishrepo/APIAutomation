package TesNGPractise.ReRunFailedTC;

import TesNGPractise.TestNG_Listners.CustomListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(CustomListener.class)
public class TCRetryAnalyzer_ClassLevel {


    // retry method will be called once a test method fails

    @Test(retryAnalyzer = CustomIRetryAnalyzer.class)
    public void method1() {

        System.out.println("Inside TC 1 method 1");
        Assert.assertEquals(1,2);
    }

    @Test
    public void method2() {

        System.out.println("Inside TC 2 method 2");

    }
}
