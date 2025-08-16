package JavaScripTExeCUTER;

import BASE.Base;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

    public static void main(String[] args) throws InterruptedException {
        Base.intDriverChrome();
        WebDriver driver= new ChromeDriver();

        Base.openURL(driver,"https://www.amazon.in/");


        JavascriptExecutor js = (JavascriptExecutor) driver;

        // method 1 --> Scroll down
        js.executeScript("window.scrollBy(0,750)");
        Thread.sleep(2000);

        // method 2 --> Scroll Up
        js.executeScript("window.scrollBy(0,-750)");
        Thread.sleep(2000);

        // method 3
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);

        // method 4  - Scroll Up
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        Thread.sleep(2000);

        //method 5

        WebElement element=driver.findElement(By.cssSelector("div.navFooterBackToTop"));
        js.executeScript("arguments[0].scrollIntoView()",element);



    }


}
