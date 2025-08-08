package SELENium;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class windOWHANDLEs {

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();

        prop.load(new FileInputStream(System.getProperty("user.dir")+"\\Data\\example.properties"));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(prop.getProperty("urlMyntra"));
        driver.manage().window().maximize();


        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.product-discountedPrice"))).click();

        Set<String> windowHandles= driver.getWindowHandles();

        // convert set to List
        List<String> wd = new ArrayList<>(windowHandles);

   //  get title of both windows
        wd.stream().map(x->driver.switchTo().window(x).getTitle()).forEach(System.out::println);



        // title of each Page using filter and Map
        wd.stream().filter(x-> Objects.requireNonNull(driver.switchTo().window(x).getTitle()).contains("Buy Claura Women")).
                map(y->driver.switchTo().window(y).getTitle()).forEach(System.out::println);


//         using for each
        List<String> wd1 = new ArrayList<>(windowHandles);
        for(String w:wd1){

            if(Objects.requireNonNull(driver.switchTo().window(w).getTitle()).contains("Buy Claura Women")){
                driver.close();
            }
        }

        // close with filter - Method 1

        wd.stream().filter(x-> Objects.requireNonNull(driver.switchTo().window(x).getTitle()).contains("Buy Claura Women")).forEach(y->driver.close());


        // close with filter - Method 2

        wd.stream().filter(x->
        {
            String title=driver.switchTo().window(x).getTitle();
            return title != null && title.contains("Buy Claura Women");
        }).forEach(x->driver.close());

    }
}
