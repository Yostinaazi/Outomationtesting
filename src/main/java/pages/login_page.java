package pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class login_page {
    user_email emil=new user_email();

    public void Email(WebDriver drive)
    {
    emil.email(drive);
    }
    public void Password(WebDriver drive)
    {

        drive.findElement(By.id("Password")).sendKeys("45454545");
    }
    public void loginbutton(WebDriver drive)
    {
        drive.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();
    }
}
