package Browser_PopUps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Brower_Notifications {


    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        HashMap<String,Integer> contentSetting = new HashMap<String,Integer>();
        HashMap<String,Object> profile = new HashMap<String,Object>();
        HashMap<String,Object> prefs = new HashMap<String,Object>();

        // camera and mic
        contentSetting.put("media_stream",2);

        // Location permission
//        contentSetting.put("geolocation",1);

        //Notify permission
//        contentSetting.put("notification",1);
        profile.put("managed_default_content_settings",contentSetting);
        prefs.put("profile",profile);
        options.setExperimentalOption("prefs",prefs);

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);

        driver.get("https://mictests.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("button#mic-launcher")).click();





    }
}
