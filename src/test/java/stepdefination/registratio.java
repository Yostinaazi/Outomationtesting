package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class registratio {
    WebDriver drive;
@Given("user open chrome browser")
    public void open_browser()
{
    WebDriverManager.chromedriver().setup();

}
@And("user go to demo home page to login")
    public void Home_page()
{
    drive=new ChromeDriver();
    drive.navigate().to("https://demo.nopcommerce.com/");
   // drive.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

}

    @And("click at Register link")
    public void click_register()
    {
     drive.findElement(By.className("ico-register")).click();

    }
    @When("user enter valid mandatory personal details")
    public void user_enter_mandatory_field()
    {
   drive.findElement(By.cssSelector("input[id^=\"FirstName\"]")).sendKeys("yostena");
        drive.findElement(By.cssSelector("input[id^=\"LastName\"]")).sendKeys("aziz");
        drive.findElement(By.cssSelector("input[id^=\"Email\"]")).sendKeys("yostena8@yahoo.com");
    }
    @And  ("user enter vaild Password")
    public void vaild_password()
    {
        drive.findElement(By.id("Password")).sendKeys("45454545");
        drive.findElement(By.id("ConfirmPassword")).sendKeys("45454545");

    }
    @And  ("user click in register button")
    public void register_buton()
    {
        drive.findElement(By.id("register-button")).click();
    }
    @Then("user register with valid account")
    public void vaild_account()
    {
        SoftAssert so=new SoftAssert();
        so.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",drive.getCurrentUrl());
       // Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",drive.getCurrentUrl());
        so.assertAll();
    }
    @And ("user quit chrome at end")
    public void quit_driver()
    {
      //  drive.quit();
    }
}
