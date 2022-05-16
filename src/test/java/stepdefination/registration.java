package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.Registration_page;

public class registration {
     User_Email pas=new User_Email();
     Registration_page regstration=new Registration_page();


    @And("click at Register link")
    public void click_register()
    {
     Hooks.drive.findElement(By.className("ico-register")).click();

    }
    @When("user enter valid mandatory personal details")
    public void user_enter_mandatory_field()
    {
        regstration.first_name(Hooks.drive);
        regstration.last_name(Hooks.drive);
        regstration.email(Hooks.drive);
    }
    @And  ("user enter vaild Password")
    public void vaild_password()
    {
        regstration.Pass_word(Hooks.drive);
        regstration.conferm_pass(Hooks.drive);
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
