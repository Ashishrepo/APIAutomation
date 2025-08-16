package BROKEN_Links;

import BASE.Base;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Broken_LINKS {

    public static void main(String[] args) throws IOException {

        Base.intDriverChrome();
        WebDriver driver = new ChromeDriver();

        Base.openURL(driver, Base.readPropertyData("brokenLink"));
        int count = 0;

        List<WebElement> links = driver.findElements(By.tagName("a"));

       try{
        for (WebElement link : links) {

            String hrefValue = link.getAttribute("href");

            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("Link has no #HREF");
                continue;
            }

            URL url = new URL(hrefValue); // convert href from String to URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();


            if (conn.getResponseCode() >= 400) {
                System.out.println(conn.getURL() + "-->Broken Link");
                count++;
            } else {
                System.out.println(conn.getURL() + "---->Not a Broken Link");
            }

        }

        System.out.println("Total Number of broken Links------>"+count);

    }catch (ExecuteException e){
           System.out.println(e.getMessage());
       }
}
}
