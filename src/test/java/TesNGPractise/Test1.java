package TesNGPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test1 {

    ChromeDriver driver;
    ChromeOptions op;

    @Test(priority = 1)
    public void setup(){
        WebDriverManager.chromedriver().setup();
        op=new ChromeOptions();
        op.addArguments("--incognito");
        driver=new ChromeDriver(op);
        driver.get("https://www.google.com/");
    }


    @Test(priority = 3)
    public void tearDown(){
        System.out.println("Inside TearDown");
        driver.close();

    }


    @Test(priority = 2)
    public void login(){
        System.out.println("Inside Login");
    }
}
