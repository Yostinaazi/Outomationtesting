package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ResetPassword {
User_Email email=new User_Email();

    @And("user writer Email")
    public void user_wreite_Email() throws InterruptedException {
      //  drive=new ChromeDriver();

      email.Email(Hooks.drive);
    }
    @And ("user click on link ForgetPassword")
    public void user_click_on_link_ForgetPassword()
    {
        Hooks.drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Hooks.drive.findElement(By.linkText("Forgot password?")).click();
    }

    @And ("user click on Recover button")
    public void Rcover_button()
    {
        Hooks.drive.findElement(By.name("send-email")).click();
    }
    @Then("ensure the message of sending an email is found")
    public void Email_message()
    {

        String message=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
    Assert.assertTrue(message.contains("has been sent"));
    }


}
