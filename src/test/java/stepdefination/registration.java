package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class registration {
    User_Email pas=new User_Email();
   // WebDriver drive;

@And("user go to demo home page")
    public void Home_page()
{

    Hooks.drive.navigate().to("https://demo.nopcommerce.com/");
   // drive.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

}

    @And("click at Register link")
    public void click_register()
    {
     Hooks.drive.findElement(By.className("ico-register")).click();

    }
    @When("user enter valid mandatory personal details")
    public void user_enter_mandatory_field()
    {
   Hooks.drive.findElement(By.cssSelector("input[id^=\"FirstName\"]")).sendKeys("yostena");
        Hooks.drive.findElement(By.cssSelector("input[id^=\"LastName\"]")).sendKeys("aziz");
      //  drive.findElement(By.cssSelector("input[id^=\"Email\"]")).sendKeys("yosu4@yahoo.com");
        pas.Email(Hooks.drive);
    }
    @And  ("user enter vaild Password")
    public void vaild_password()
    {
        Hooks.drive.findElement(By.id("Password")).sendKeys("45454545");
        Hooks.drive.findElement(By.id("ConfirmPassword")).sendKeys("45454545");

    }
    @And  ("user click in register button")
    public void register_buton()
    {
        Hooks.drive.findElement(By.id("register-button")).click();
    }
    @Then("user register with valid account")
    public void vaild_account()
    {
        SoftAssert so=new SoftAssert();
        so.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",Hooks.drive.getCurrentUrl());
       // Assert.assertEquals("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",drive.getCurrentUrl());
        so.assertAll();
    }
    @And ("user quit chrome at end")
    public void quit_driver()
    {
        Hooks.drive.quit();
    }
}
