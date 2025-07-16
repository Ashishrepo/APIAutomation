package ScrollingInWebPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

public class Myntra {

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        prop.load(Files.newInputStream(Paths.get("TestData.properties")));


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("myntraURl"));


        List<WebElement> ls = driver.findElements(By.xpath("//div[@id=\"desktopSearchResults\"]//ul[@class=\"results-base\"]/li//div[@class=\"product-price\"]"));

        System.out.println(ls.size());

    }
}
