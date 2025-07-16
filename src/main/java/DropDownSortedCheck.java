import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class DropDownSortedCheck {

    public static void main(String[] args) throws IOException, InterruptedException {

        Properties prop = new Properties();
        prop.load(Files.newInputStream(Paths.get("TestData.properties")));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("fileUploadURl"));

        driver.findElement(By.xpath("(//div[@class='search-item-inner'])[3]")).click();
        Thread.sleep(3000);

        List<WebElement> ddOptions= driver.findElements(By.cssSelector("span.modal-ref-class"));

//        ddOptions.stream().map(WebElement::getText).forEach(System.out::println);

        List<String> orignalList= new ArrayList<>();
        List<String> sortedList= new ArrayList<>();

       orignalList= ddOptions.stream().map(WebElement::getText).collect(Collectors.toList());
       sortedList= ddOptions.stream().map(WebElement::getText).collect(Collectors.toList());

        Collections.sort(sortedList);

        System.out.println("Orignal List "+orignalList);
        System.out.println("Sorted List "+sortedList);

        if(orignalList.equals(sortedList)){
            System.out.println("List Are already Sorted***********");
        }else{
            System.out.println("List does not match");
        }






    }
}
