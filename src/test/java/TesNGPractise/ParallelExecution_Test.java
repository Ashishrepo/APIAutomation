package TesNGPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class ParallelExecution_Test {

    WebDriver driver;
    @BeforeMethod
    @Parameters({"url","browser"})
    public void setup(String url,String browser){


        switch (browser){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser ");
        }

        driver.get(url);


    }

    @Test(priority = 1)
    public void getDetails() throws InterruptedException {

        List< WebElement> ls=driver.findElements(By.xpath("//h5[text()='About Us']/following-sibling::ul/li/a"));
        ls.stream().map(x->x.getText()).forEach(n-> System.out.println(n));
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void getCustomerDetails(){
        System.out.println("Getting Customer details");
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
