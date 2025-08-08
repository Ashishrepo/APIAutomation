package TABLES;

import BASE.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class OrangeHRM_DynamicTable extends Base {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) throws IOException, InterruptedException {

        Base.intDriverChrome();

        ChromeOptions cp = new ChromeOptions();
        cp.addArguments("--incognito");
        driver = new ChromeDriver(cp);

        Base.openURL(driver, Base.readPropertyData("orangeHRM_URl"));
        loginToOrangeHRM();

        navigateToAdmin();

        Thread.sleep(2000);
        findUserWithAdminRole();

    }

    private static void findUserWithAdminRole() {

        // total coloms
        int columns = driver.findElements(By.xpath("//div[@class='oxd-table-header']//div[@role='columnheader']")).size();
        System.out.println(columns);

        // total rows
        int rows = driver.findElements(By.xpath("//div[@class='oxd-table-card']//div[@role='row']")).size();
        System.out.println(rows);

        // User Role column list
        List<WebElement> userRolesList = driver.findElements(By.xpath("//div[@role='rowgroup']//div[@class=\"oxd-table-card\"]//div[@role=\"cell\"][3]"));
        int count = 0;

        if (!userRolesList.isEmpty()) {
            for (WebElement userRole : userRolesList) {
                count += 1;
                if (userRole.getText().equalsIgnoreCase("Admin")) {
                    //Emp Name column
                    String EmpName = driver.findElement(By.xpath("(//div[@role='rowgroup']//div[@class='oxd-table-card']//div[@role='cell'][4])[" + count + "]")).getText();
                    System.out.println("Emp name with Admin Role -----------> " + EmpName);
                }
            }
        }else{
            System.out.println("No user with Admin role is present");
        }
    }

    private static void navigateToAdmin() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-container']")));
    }

    public static void loginToOrangeHRM() throws IOException {


        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='username']")));

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(Base.readPropertyData("orangeHRM_Username"));
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(Base.readPropertyData("orangeHRM_Pwd"));
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
