package org.DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageClass_Home {

    private final WebDriver driver;

    By loginLinkLocator= By.linkText("Log in");
    By usernameLocator= By.id("Email");
    By passwrdLocator= By.id("Password");
    By signInBtnLocator= By.xpath("//*[@class=\"buttons\"]/input[@type='submit']");
    By loginErrorMessage=By.xpath("//div[@class=\"message-error\"]//span");
    By logoutLink=By.linkText("Log out");

    public PageClass_Home(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink(){
       driver.findElement(loginLinkLocator).click();
    }

    public void enterEmail(String email){
        WebElement emailInput= driver.findElement(usernameLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password){
         WebElement pwd= driver.findElement(passwrdLocator);
         pwd.sendKeys(password);

    }

    public void clickLoginBtn(){
           driver.findElement(signInBtnLocator).click();

    }

    public boolean loginErrorMessage(){
        WebElement msg=driver.findElement(loginErrorMessage);
        return msg.isDisplayed();
    }

    public void login(String email,String password){
        enterEmail(email);
        enterPassword(password);
    }

    public boolean loginSuccessfull(){
          return  driver.findElement(logoutLink).isDisplayed();

    }
}
