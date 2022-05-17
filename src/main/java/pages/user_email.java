package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class user_email {
    public void email(WebDriver drive)
    {
        drive.findElement(By.id("Email")).sendKeys("Yo15896na13@yahoo.com");

    }
}
