package TesNGPractise.TestNG_Listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class TCListner_ClassLevel {

    @Test
    public void method1() {

        System.out.println("Inside TC 1 method 1");
    }

    @Test
    public void method2() {

        System.out.println("Inside TC 2 method 2");

    }
}
