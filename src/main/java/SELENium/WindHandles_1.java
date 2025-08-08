package SELENium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class WindHandles_1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(2000);

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
        System.out.println(links.size());

        links.stream().forEach(x-> System.out.println(x.getText()));

        // clicking on Each hyperlink
        links.stream().forEach(x -> x.click());

        // getTitle of Each tab
        Set<String> windowsSet = driver.getWindowHandles();
        List<String>windowList = new ArrayList<>(windowsSet);

        System.out.println("*****************************************************");
        windowList.stream().forEach(x-> System.out.println(driver.switchTo().window(x).getTitle()));


        // close few tabs

        windowList.stream().filter(x-> Objects.requireNonNull(driver.switchTo().window(x).getTitle()).equalsIgnoreCase("Selenium dioxide - Wikipedia"))
                .forEach(y->driver.close());

        driver.switchTo().defaultContent();


    }
}
