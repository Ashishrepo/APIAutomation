package Streams_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSel_2 {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[contains(text(),\"Books\")]")).click();

        Select sc = new Select(driver.findElement(By.id("products-orderby")));
        sc.selectByVisibleText("Name: A to Z");

        // Books Name
        List<WebElement> books = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));

       //before Sort
      List<String> sort1 = books.stream().map(b -> b.getText()).collect(Collectors.toList());

      //afterSort
    List<String> sort2 = books.stream().map(b -> b.getText()).sorted().collect(Collectors.toList());

        System.out.println(sort1.equals(sort2));

    }
}
