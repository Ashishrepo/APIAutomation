package DATE_PICker;

import BASE.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class DatePicker_2_MonthClass {

    static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {

        String requiredYear = "2027";
        String requiredMonth = "Dec";
        String requiredDate="25";

        Base.intDriverChrome();
        driver = new ChromeDriver();
        Base.openURL(driver, Base.readPropertyData("testAutomationPractise"));

        Base.scrollToElement(driver, driver.findElement(By.xpath("//input[@id='txtDate']")));
        Thread.sleep(1000);


        driver.findElement(By.xpath("//input[@id='txtDate']")).click();

        selectMonthAndYear(requiredYear, requiredMonth);
        selectDate(requiredDate);

    }

    private static void selectDate(String requiredDate) {

        driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='"+requiredDate+"']")).click();
    }

    public static void selectMonthAndYear(String requiredYear, String requiredMonth) {


        // Year
        WebElement yearValue = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select = new Select(yearValue);
        select.selectByVisibleText(requiredYear);


        while (true) {

            WebElement monthValue = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
            Select select1 = new Select(monthValue);
            String currentMonthValue = select1.getFirstSelectedOption().getText();

            Month cm = converMonth(currentMonthValue);
            Month rm = converMonth(requiredMonth);

            int result = cm.compareTo(rm);

            if (result > 0) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

            } else if (result < 0) {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            } else {
                break;
            }

        }

    }

    private static Month converMonth(String currentMonthValue) {

        Map<String, Month> mp = new HashMap<String, Month>();
        mp.put("Jan", Month.JANUARY);
        mp.put("Feb", Month.FEBRUARY);
        mp.put("Mar", Month.MARCH);
        mp.put("Apr", Month.APRIL);
        mp.put("May", Month.MAY);
        mp.put("Jun", Month.JUNE);
        mp.put("Jul", Month.JULY);
        mp.put("Aug", Month.AUGUST);
        mp.put("Sep", Month.SEPTEMBER);
        mp.put("Oct", Month.OCTOBER);
        mp.put("Nov", Month.NOVEMBER);
        mp.put("Dec", Month.DECEMBER);


        Month mt = mp.get(currentMonthValue);
        if (mt == null) {
            throw new NullPointerException("Invalid month ");
        }

        return mt;


    }
}
