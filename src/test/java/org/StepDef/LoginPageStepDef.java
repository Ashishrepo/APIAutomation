package org.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.DemoWebShop.PageClass_Home;
import org.DemoWebShop.PageClass_Home_PF;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageStepDef {

    private WebDriver driver;
    private PageClass_Home pgobj;
    private PageClass_Home_PF objPF;

    @Before
    public void setup(){

        driver= WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){

        if(driver!=null){
            driver.quit();
        }
    }

    @Given(": User at DemoWebShop Login Page")
    public void user_at_demo_web_shop_login_page() {
        driver.get("https://demowebshop.tricentis.com/");
        pgobj =new PageClass_Home(driver);
        objPF= new PageClass_Home_PF(driver);

    }
    @Given("User entered valid credentials")
    public void user_entered_valid_credentials() {
//        pgobj.clickLoginLink();
//        pgobj.login("selenium2025@gmail.com","selenium");
        objPF.clickLoginLink();
        objPF.enterEmail("selenium2025@gmail.com");
        objPF.enterPassword("selenium");

    }
    @When("User clicks on Login Button")
    public void user_clicks_on_login_button() {
//        pgobj.clickLoginBtn();
        objPF.clickLoginBtn();
    }
    @Then("User logged in successfully")
    public void user_logged_in_successfully() {
        Assert.assertTrue(pgobj.loginSuccessfull());
    }


}
