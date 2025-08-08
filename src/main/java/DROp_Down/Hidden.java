package DROp_Down;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hidden extends Base {

    public static void main(String[] args) throws InterruptedException {

        Base.intDriverChrome();

        WebDriver driver= new ChromeDriver();
        Base.openURL(driver,"https://www.flipkart.com/");

           driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("i");
           Thread.sleep(3000);

           List<WebElement> ls= driver.findElements(By.xpath("//div[@class='_3NorZ0 _3jeYYh']//ul/li//div[@class='YGcVZO _2VHNef']"));
           System.out.println(ls.size());

     ls.stream().forEach(x-> System.out.println(x.getText()));

    }
}
