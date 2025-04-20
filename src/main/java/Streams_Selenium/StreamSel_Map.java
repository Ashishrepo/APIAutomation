package Streams_Selenium;

import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamSel_Map {

    public static void main(String[] args){


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();


        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        By title = By.xpath("//h2[@class=\"product-title\"]");
        List<WebElement> bookTitles = driver.findElements(title);

        By price= By.xpath("//span[@class=\"price actual-price\"]");
        List<WebElement> bookPrices = driver.findElements(price);

        //Map
        Map<String, Double> mp= new HashMap<String,Double>();

        for(int i=0;i<bookPrices.size();i++){

            mp.put(bookTitles.get(i).getText(),Double.parseDouble(bookPrices.get(i).getText()));

        }

        //for Each
//         mp.forEach((s,d)-> System.out.println(s+" :"+d));

        // map

        System.out.println(mp.entrySet().stream().filter(e->e.getValue()>800).count());
        mp.entrySet().stream().filter(e->e.getValue()>800).forEach((s)-> System.out.println(s.getKey()+" :"+s.getValue()));

        driver.close();


    }
}
