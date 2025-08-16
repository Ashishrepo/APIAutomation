package Take_SCREENshot;

import BASE.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class takeScreenshot {

    public static void main(String[] args) throws IOException {
        Base.intDriverChrome();
        WebDriver driver= new ChromeDriver();

        Base.openURL(driver,"https://www.amazon.in/");

        TakesScreenshot ts = (TakesScreenshot)driver;

        // screenshot of whole Page
       File src=  ts.getScreenshotAs(OutputType.FILE);
       File target = new File(System.getProperty("user.dir")+"/src/test/resource/ScreenshoTS/page.jpg");
       src.renameTo(target);



       // screenshot of a WebElement

        WebElement element= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        File srcElement=element.getScreenshotAs(OutputType.FILE);
        File targetElementShot=new File(System.getProperty("user.dir")+"/src/test/resource/ScreenshoTS/element.jpg");
        FileUtils.copyFile(srcElement,targetElementShot);


    }
}
