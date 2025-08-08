package SELENium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class WaiTS {

    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();
        prop.load(new FileInputStream(System.getProperty("user.dir")+"\\Data\\example.properties"));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(prop.getProperty("urlMyntra"));
        driver.manage().window().maximize();

//        driver.findElement(By.cssSelector("span.product-discountedPrice")).click();

       //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.product-discountedPrice"))).click();

        Set<String>windows=driver.getWindowHandles();

        for(String window:windows){

            driver.switchTo().window(window);
            if(Objects.equals(driver.getTitle(), "Buy Claura Women Floral Printed")){
                driver.close();
                break;
            }
        }

//        driver.close();
    }

}
