package LTI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class JavaWithAPI {

    public static void main(String[] args) throws IOException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<String>urlList= new ArrayList<>();
        System.out.println(links.size());

        // return link text and not the actual links
//        links.stream().map(n->n.getText()).forEach(System.out::println);

        // return actual links address
        long srtTime=System.currentTimeMillis();
         for(WebElement f:links){

             String url=f.getDomAttribute("href");
             urlList.add(url);
//             findBrokenLink(url);
         }

         // for faster execution use parallel streams
         urlList.parallelStream().forEach(e-> {
             try {
                 findBrokenLink(e);
             } catch (IOException ex) {
                 throw new RuntimeException(ex);
             }
         });

         long endTime= System.currentTimeMillis();
        System.out.println("Total time "+ (endTime-srtTime));
        driver.quit();

    }

    public static void findBrokenLink(String url) throws IOException {
        try {
            URL urlLink = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect(); // establish connection or make request

            if (connection.getResponseCode() >= 400) {
                System.out.println("Broken Link: " + url);
            } else if (connection.getResponseCode() >= 200 && connection.getResponseCode() < 400) {
                System.out.println("Valid Link " + url);
            }

        }catch (Exception e){
            System.out.println("Caught Exception: "+e.getMessage());
        }


    }
}
