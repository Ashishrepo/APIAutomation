package BASE;

import io.cucumber.java.et.Ja;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {


//    public static WebDriver driver;
    public static WebDriverWait wait;
    public static final Properties prop = new Properties();

    public static void intDriverChrome() {
        WebDriverManager.chromedriver().setup();

    }

    public static void openURL(WebDriver driver,String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static String readPropertyData(String key) throws IOException {
        prop.load(new FileInputStream(System.getProperty("user.dir") + "\\Data\\example.properties"));
        return prop.getProperty(key);
    }

    public static WebElement waitForElement(WebDriver driver,By locator){

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
          return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public static  void scrollToElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(
                "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});" +
                        "arguments[0].style.border='3px solid red';",  element);

    }

}
