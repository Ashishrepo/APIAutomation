package Streams_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSel_1 {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in/");

        Set<String> winH = driver.getWindowHandles();

        //lamda
        winH.forEach(wID-> System.out.println(driver.switchTo().window(wID).getTitle()));

        // Streams-map
        List<String> lst = winH.stream().map(wID -> driver.switchTo().window(wID).getTitle()).collect(Collectors.toList());
//        System.out.println(lst);

//        System.out.println(driver.getWindowHandles().stream()
//                        .map(x->driver.switchTo().window(x).getTitle())
//                                .filter(y->y.contains("India")).findFirst()
//                        .orElse("sdsdf"));
//
        driver.quit();

    }
}
