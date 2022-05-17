package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recover_password_page {
    user_email mail=new user_email();
    public void Rewrite(WebDriver drive)
    {
        mail.email(drive);
    }
    public void Rcover_button(WebDriver drive)
    {
        drive.findElement(By.name("send-email")).click();

    }

}
