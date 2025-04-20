package Streams_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class PopUps {


    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();

         List<String> ls = driver.getWindowHandles().stream().map(h -> driver.switchTo().window(h).getTitle()).collect(Collectors.toList());
        System.out.println(ls);
    }
}
