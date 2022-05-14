package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registration_page {

   public void first_name(WebDriver drive)
    {   drive.findElement(By.cssSelector("input[id^=\"FirstName\"]")).sendKeys("yostena");
    }
    public void last_name(WebDriver drive)
    {
     drive.findElement(By.cssSelector("input[id^=\"LastName\"]")).sendKeys("aziz");
    }
    public void email(WebDriver drive)
    {
     drive.findElement((By.id("Email"))).sendKeys("Yoste454361iz@yahoo.com");
    }
    public void Pass_word(WebDriver drive)
    {
     drive.findElement(By.id("Password")).sendKeys("45454545");

    }
    public void conferm_pass(WebDriver drive)
    {
     drive.findElement(By.id("ConfirmPassword")).sendKeys("45454545");

    }



}
