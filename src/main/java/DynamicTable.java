import io.cucumber.java.et.Ja;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

public class DynamicTable {

    public static void main(String[] args) throws IOException, InterruptedException {

        Properties prop = new Properties();
        prop.load(Files.newInputStream(Paths.get("TestData.properties")));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("dynamicTableURl"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        Thread.sleep(1000);

        int rowNumber=1;
        int columnNumber=1;

        //row number
        while(true){

             if(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody/tr["+rowNumber+"]/td[1]")).getText().equalsIgnoreCase("chrome")){
                System.out.println("row Number: "+rowNumber);
                break;
            }

            rowNumber+=1;

        }

        List<WebElement> chromeDetails=driver.findElements(By.xpath("(//table[@class='table table-striped']//tbody/tr/td[1])["+rowNumber+"]/following-sibling::td"));

      // CPU column number

        List<WebElement>columnTotal= driver.findElements(By.xpath("//table[@class='table table-striped']//th"));

        for(int c=1;c<=columnTotal.size();c++){

           if(driver.findElement(By.xpath("//table[@class='table table-striped']//th["+c+"]")).getText().equalsIgnoreCase("CPU")){

               columnNumber=c;
               System.out.println("column Number: "+columnNumber);
               break;
           }


        }

        System.out.println("*************** CPU Details for Chrome *******************");

        System.out.println(driver.findElement(By.xpath("//table[@class='table table-striped']//tr["+rowNumber+"]/td["+columnNumber+"]")).getText());


        // Single Line Solution

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(driver.findElement(By.xpath("//td[normalize-space()='Chrome']/following-sibling::td[contains(text(),\"%\")]")).getText());


        driver.quit();

    }
}
