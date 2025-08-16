package AcTIONS_MouseKeyborad;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class OpenlinkInNewTabKeys extends Base {

    public static void main(String[] args) {

        Base.intDriverChrome();
        WebDriver driver= new ChromeDriver();

        Base.openURL(driver,"https://www.amazon.in/");

        Actions act = new Actions(driver);
        WebElement element= driver.findElement(By.xpath("//a[normalize-space()='Gift Cards']"));

        // new tab
        act.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();

        List<String> windows= new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windows.size());

        System.out.println(driver.switchTo().window(windows.get(1)).getTitle());
        System.out.println(driver.switchTo().window(windows.get(0)).getTitle());

    }
}
