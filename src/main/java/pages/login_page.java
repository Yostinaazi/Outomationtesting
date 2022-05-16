package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class login_page {

    public void Email(WebDriver drive)
    {
        drive.findElement(By.id("Email")).sendKeys("Yostena1@yahoo.com");

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
