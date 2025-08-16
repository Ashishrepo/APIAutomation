package DATE_PICker;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class DummyTickets {

    static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {

        Base.intDriverChrome();
        driver = new ChromeDriver();

        Base.openURL(driver,Base.readPropertyData("dummyticketsURl"));

        selectToAndFrom();
        selectDates();
    }

    private static void selectDates() {

        driver.findElement(By.xpath("//div[@id=\"multicitymain\"]//input[@name=\"departure[]\"]")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]")));
        select.selectByVisibleText("Dec");


        Select select1 = new Select(driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]")));
        select1.selectByVisibleText("2026");

        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td/a[text()='15']")).click();
    }

    private static void selectToAndFrom() throws InterruptedException {

        driver.findElement(By.xpath("//input[@value='multicitymain']")).click();

        driver.findElement(By.xpath("(//input[@name='source[]'])[3]")).sendKeys("DEL");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='source[]'])[3]")).sendKeys("HI");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='suggestions-list']//li")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//input[@name='destination[]'])[3]")).sendKeys("pu");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='destination[]'])[3]")).sendKeys("ne");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//ul[@class='suggestions-list']//li)[2]")).click();
    }
}
