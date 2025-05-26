package LTI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ResponseScreenTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private HashMap<String,Dimension> mp = new HashMap<String,Dimension>(){

        {
            put("Iphone 12 Pro",new Dimension(390, 844));
            put("ipad mini",new Dimension(768, 1024));

        }

    };

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        wait =new WebDriverWait(driver, Duration.ofSeconds(120L));

    }

    @Test
    public void responseTest(){

        for(Map.Entry<String,Dimension> m:mp.entrySet()){
            System.out.println(m.getKey()+ " - "+m.getValue());

            if(m.getKey().equalsIgnoreCase("Iphone 12 Pro")){
                driver.manage().window().setSize(m.getValue());
                System.out.println("Test for Iphone 12 Pro");
                WebElement hb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-hamburger-menu")));
                Assert.assertTrue(hb.isDisplayed());

            } else if (m.getKey().equalsIgnoreCase("ipad mini")) {
                driver.manage().window().setSize(m.getValue());
                System.out.println("Test for IPAD MINI");

            }


        }


    }
}
