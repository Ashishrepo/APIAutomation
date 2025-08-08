import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_1 {

    public static void main(string_1[] args){


        WebDriverManager.chromedriver().setup();

        ChromeOptions co= new ChromeOptions();
        co.addArguments("--incognito");

        ChromeDriver driver= new ChromeDriver(co);

        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        driver.close();




    }
}
