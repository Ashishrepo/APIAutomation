package AlerTS;


import BASE.Base;
import BASE.Base.*;
import com.beust.ah.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Alerts_POP_Up extends Base {

;

    public static void main(String[] args) throws IOException, InterruptedException {

    Base.intDriverChrome();
    WebDriver driver=new ChromeDriver();

    Base.openURL(driver,Base.readPropertyData("alterJS"));

    By jsPromptBtn= By.xpath("//button[@onclick='jsPrompt()']");
    Base.waitForElement(driver,jsPromptBtn).click();

    Thread.sleep(1000);

    // Alert
    Alert alt = driver.switchTo().alert();

    System.out.println(alt.getText());
    alt.accept();

//    alt.sendKeys("Ashish Jain");





    }
}
