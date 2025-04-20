package Streams_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsSel {


    public static void main(String[] args){


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        List<WebElement> links=driver.findElements(By.tagName("a"));

        // Lamda Exp
//        links.forEach(link-> System.out.println(link.getText()));

        // Streams
        long nb = links.stream().filter(link -> link.getAttribute("href") != null).count();
//        System.out.println("Non Broken Links: "+nb);


        links.stream()
                .filter(link -> link.getAttribute("href") != null)
                .filter(link->!link.getText().equals("")).map(x->x.getText())
                .forEach(linkTxt-> System.out.println(linkTxt));

       // List of Web Elements with filter

//        List<WebElement> cl = links.stream()
//                .filter(link -> link.getAttribute("href") != null)
//                .filter(link -> !link.getText().equals("")).collect(Collectors.toList());
//
//        cl.forEach(x-> System.out.println(x.getText()));



        // List of String with Filter and Map

//                List<String> cl = links.stream()
//                .filter(link -> link.getAttribute("href") != null)
//                .filter(link -> !link.getText().equals("")).map(x->x.getText()).collect(Collectors.toList());
//
//        cl.forEach(x-> System.out.println(x);

        driver.close();
    }

}
