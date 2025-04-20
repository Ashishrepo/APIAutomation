package org.DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Properties;


public class PageClass_Home_PF {

    @FindBy(linkText = "Log in")
    WebElement loginLinkLocator;

    @FindBy(id = "Email")
    WebElement usernameLocator;

    @FindBy(id = "Password")
    WebElement passwrdLocator;

    @FindBy(xpath = "//*[@class=\"buttons\"]/input[@type='submit']")
    WebElement signInBtnLocator;

    @FindBy(xpath = "//div[@class=\"message-error\"]//span")
    WebElement loginErrorMessage;

    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    WebDriver driver;

    public PageClass_Home_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
     }

   public void navigateDemoWebShop(){


   }

    public void clickLoginLink(){
        loginLinkLocator.click();
    }

    public void enterEmail(String email){
        usernameLocator.sendKeys(email);
   }

   public void enterPassword(String password){
        passwrdLocator.sendKeys(password);
   }
    public void clickLoginBtn(){
        signInBtnLocator.click();

    }
}
