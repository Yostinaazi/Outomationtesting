package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword_page {
user_email emil=new user_email();
public void fill_Email(WebDriver drive)
{
emil.email(drive);}
public void forget_password_link(WebDriver drive)
{
    drive.findElement(By.linkText("Forgot password?")).click();
}

}
