
package stepdefination;
import pages.login_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


public class login {

  // User_Email mail=new User_Email();
   login_page loginpom=new login_page();


    @And("user click in login")
        public void user_click_in_login()
        {
            Hooks.drive.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        }
    @When("user enter valid email and Password")
    public void user_enter_valid_email_and_Password()
    {

        loginpom.Email(Hooks.drive);
        loginpom.Password(Hooks.drive);
    }
    @And ("user click on button log in")
    public void user_click_on_button_log_in()
    {
        loginpom.loginbutton(Hooks.drive);
    }
    @Then("user log in succefuly")
    public void user_log_in_succefuly()
    {
        SoftAssert so=new SoftAssert();
        so.assertEquals("https://demo.nopcommerce.com/",Hooks.drive.getCurrentUrl());

        so.assertAll();
    }

}