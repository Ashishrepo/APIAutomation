package TABLES;

import BASE.Base;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table extends Base {

    public static void main(String[] args) {

        Base.intDriverChrome();

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://blazedemo.com/");
        driver.navigate().refresh();
//        Base.openURL(driver,"https://blazedemo.com/");

        driver.findElement(By.cssSelector("input[value='Find Flights']")).click();

        Base.waitForElement(driver, By.xpath("//th[normalize-space()='Choose']"));


        // total rows
        int row = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
        System.out.println(row);

        // total columnss

        int columns = driver.findElements(By.xpath("//table[@class='table']//th")).size();
        System.out.println(columns);


        // Print all Table data
//        for (int r = 1; r < row; r++) {
//
//            for (int c = 2; c < columns; c++) {
//                System.out.print(driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[" + c + "]")).getText() + "\t");
//            }
//            System.out.println();
//        }

        // Price of Virgin America


//        for (int r = 1; r < row; r++) {
//
//            String airlines = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[3]")).getText();
//            if (airlines.equalsIgnoreCase("Virgin America")) {
//                System.out.println(driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText());
//            }
//        }
//        System.out.println();


        // calculate Total Price

        double total=0;
        for (int r = 1; r < row; r++) {

            String price=driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
           total+=Double.parseDouble(price.replaceAll("[$]",""));

        }

        System.out.println("Total Price ---->"+total);


    }
}

