package Streams_Selenium;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValuefromTable extends Base {


    public static void main(String[] args) throws IOException, InterruptedException {


    Base.intDriverChrome();
    WebDriver driver= new ChromeDriver();

    Base.openURL(driver,Base.readPropertyData("testAutomationPractise"));

    WebElement element = driver.findElement(By.xpath("//a[normalize-space()='1']"));
    Actions actions = new Actions(driver);
    actions.scrollToElement(element).perform();

    Thread.sleep(2000);

    List<WebElement> priceList= driver.findElements(By.xpath("//table[@id='productTable']//tr/td[3]"));


    // stream
    // Map 1 to transform - to remove $ from elements
//        Map 2 to convert String to Double
    List<Double> lsPrices=priceList.stream().map(x->x.getText().replaceAll("[^0-9.]","")).map(x->Double.parseDouble(x)).collect(Collectors.toList());


        System.out.println(lsPrices.stream().max(

                (v1,v2) ->{  return v1.compareTo(v2);  }


    ).get());


    }


}
