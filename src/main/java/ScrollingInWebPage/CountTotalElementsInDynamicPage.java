package ScrollingInWebPage;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.List;

public class CountTotalElementsInDynamicPage {

    public static void main(String[] args) throws InterruptedException {

        int previousCount = 0;
        int currentCount = 0;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booksbykilo.in/new-books");

        while (true) {

            List<WebElement> ls = driver.findElements(By.xpath("//div[@class='book_display']//h3"));
            currentCount = ls.size();
            System.out.println("*********** current Count =  " + currentCount);

            if (currentCount == previousCount) {
                break;
            }

            previousCount = currentCount;
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

//            Actions ac = new Actions(driver);
//            ac.sendKeys(Keys.END).perform();
            Thread.sleep(3000);
        }

        System.out.println(" Final Count ====" + currentCount);


    }
}
