package RoBOTClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UploadThroughRobot {

    public static void main(String[] args) throws IOException, InterruptedException, AWTException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Properties prop = new Properties();
        prop.load(new FileInputStream("TestData.properties"));

        driver.get(prop.getProperty("fileUploadURl"));

        driver.findElement(By.cssSelector("div.heroSection-buttonContainer_secondaryBtn__text")).click();

        Thread.sleep(2000);


//        solution #1 because DOM contains <input tag and argument Type=file
        driver.findElement(By.cssSelector("input#file-upload")).sendKeys("C:\\Users\\ashish.jain3\\Desktop\\imp.txt");


        //solution2  - if we try to click on the element with Input Tag  ---> System throws InvalidArgumentException: invalid argument

//        driver.findElement(By.cssSelector("input#file-upload")).click();


        // solution 3- use Javascriptexecutor to click on element with tag Input

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.cssSelector("input#file-upload")));

        Thread.sleep(2000);


        // FIle Upload


//        #1 Copy File Path to clipboard

        StringSelection filePath= new StringSelection(prop.get("filePath").toString());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);

        Thread.sleep(2000);


//         #2 Paste File Path in the Desktop Pop up using Robot library

           Robot rb= new Robot();
           rb.keyPress(KeyEvent.VK_CONTROL);
           rb.keyPress(KeyEvent.VK_V);
           rb.keyRelease(KeyEvent.VK_CONTROL);
           rb.keyRelease(KeyEvent.VK_CONTROL);

           rb.keyPress(KeyEvent.VK_ENTER);
           rb.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#pop_upload")).click();
        Thread.sleep(2000);

    }
}
