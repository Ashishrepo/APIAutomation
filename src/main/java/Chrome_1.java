import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_1 {

    public static void main(String[] args){


        WebDriverManager.chromedriver().setup();

        ChromeOptions cr= new ChromeOptions();
        cr.addArguments("--incognito");

        ChromeDriver driver= new ChromeDriver(cr);

        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        driver.close();




    }
}
