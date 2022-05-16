package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword_page {

public void fill_Email(WebDriver drive)
{
drive.findElement(By.id("Email")).sendKeys("Yostena1@yahoo.com");
}
public void forget_password_link(WebDriver drive)
{
    drive.findElement(By.linkText("Forgot password?")).click();
}

}
