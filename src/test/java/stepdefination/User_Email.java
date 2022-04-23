package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User_Email {
    WebDriver driv;

        public void Email(WebDriver driv)
        {
             driv.findElement(By.id("Email")).sendKeys("Yostena47ziz@yahoo.com");
        }

    }

