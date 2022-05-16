package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recover_password_page {
    public void Rewrite(WebDriver drive)
    {
        drive.findElement(By.id("Email")).sendKeys("Yostena1@yahoo.com");
    }
    public void Rcover_button(WebDriver drive)
    {
        drive.findElement(By.name("send-email")).click();

    }

}
