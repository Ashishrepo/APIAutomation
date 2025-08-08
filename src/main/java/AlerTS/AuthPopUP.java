package AlerTS;

import BASE.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AuthPopUP {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//        Base.openURL(driver,Base.readPropertyData("alertAuth"));


        Base.openURL(driver,Base.readPropertyData("alertAuthWithCredentials"));
    }
}
