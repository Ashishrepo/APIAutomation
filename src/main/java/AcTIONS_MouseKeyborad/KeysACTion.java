package AcTIONS_MouseKeyborad;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.page.model.WebAppManifest;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class KeysACTion extends Base {

    public static void main(String[] args) {

        Base.intDriverChrome();

        WebDriver driver = new ChromeDriver();
        Base.openURL(driver,"https://text-compare.com/");

        Actions act = new Actions(driver);

        WebElement inputArea = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement outputArea=driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        inputArea.sendKeys("WELCome");

        //Ctrl+A

        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Ctrl+C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //TAB
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //Ctrl+V

        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        //Ctrl +Sift+A
//        act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();


    }
}
