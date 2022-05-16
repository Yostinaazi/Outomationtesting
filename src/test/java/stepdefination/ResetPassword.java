package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
import pages.ResetPassword_page;
import pages.Recover_password_page;
public class ResetPassword {
User_Email email=new User_Email();
    ResetPassword_page reset=new ResetPassword_page();
    Recover_password_page recover=new Recover_password_page();
    @And("user writer Email")
    public void user_write_Email()
    {
      reset.fill_Email(Hooks.drive);
    }
    @And ("user click on link ForgetPassword")
    public void user_click_on_link_ForgetPassword()
    {
        reset.forget_password_link(Hooks.drive);
        Hooks.drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @And ("user Rewriter Email")
    public void rewite_email()
    {
        recover.Rewrite(Hooks.drive);
    }


    @And ("user click on Recover button")
    public void Rcover_button()
    {
recover.Rcover_button(Hooks.drive);
    }
    @Then("ensure the message of sending an email is found")
    public void Email_message()
    {
        String message=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
    Assert.assertTrue(message.contains("has been sent"));
    }


}
