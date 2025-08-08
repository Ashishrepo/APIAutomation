package DATE_PICker;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DatePicker_1 extends Base {

    static WebDriver driver;
    String date = "08";
    static String Month = "August";
    static String Year = "2025";


    public static void main(String[] args) throws IOException, InterruptedException {

        Base.intDriverChrome();

        driver = new ChromeDriver();

        Base.openURL(driver, Base.readPropertyData("datePickerURl"));

        String date = "15";
        String Month = "October";
        String Year = "2025";

        selectFutureMonthAndYear(Month, Year);

        selectDate(date);
    }

    private static void selectDate(String date) {

        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td/a[text()=" + date + "]")).click();

    }

    private static void selectFutureMonthAndYear(String Month, String Year) throws InterruptedException {

        driver.switchTo().frame(0);

        Base.waitForElement(driver, By.xpath("//input[@id='datepicker']"));
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        Thread.sleep(1000);

        while (true) {

            String monthValue = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String yearValue = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (monthValue.equals(Month) && yearValue.equals(Year)) {
                break;
            }

            // click next button
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }


    }
}
