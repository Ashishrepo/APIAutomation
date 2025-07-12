package TesNGPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_TestNG {


    WebDriver driver;

    @BeforeMethod
    @Parameters({"browser","url"})
    void setup(String browser, String url){

//        System.out.println("Browser name  =>"+browser);
        switch (browser){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid Browser");
        }

        driver.get(url);

    }

    @Test
    void login(){
        System.out.println("Inside login");
    }


    @AfterMethod
    void tearDown(){
//           driver.close();
    }
}
