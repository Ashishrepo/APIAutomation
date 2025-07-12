package ScrollingInWebPage;

import io.cucumber.java.et.Ja;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Optional;

public class Scroll {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.booksbykilo.in/new-books");

//        WebElement book= driver.findElement(By.xpath("//div[@class='book_display']//h3[text()='Peter Pan']"));

        //Actions
//        Actions ac= new Actions(driver);
//        ac.scrollToElement(book).perform();


        //javascript
//        JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",book);
//        System.out.println(book.getText());

        boolean found =false;

        while(!found){

            List<WebElement> ls= driver.findElements(By.xpath("//div[@class='book_display']//h3"));


             if(ls.stream().map(d->d.getText()).anyMatch(q->q.equalsIgnoreCase("Peter Pan"))){
                 System.out.println("********** Found **************");
                 found=true;
                 break;
             }


            //Javascript

//            JavascriptExecutor js =(JavascriptExecutor)driver;
//             js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

            Actions ac= new Actions(driver);
            ac.sendKeys(Keys.END).perform();


        }


    }

}
