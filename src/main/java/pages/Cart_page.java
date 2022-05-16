package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_page {
    public void read_terms(WebDriver drive)
    {
        drive.findElement(By.id("termsofservice")).click();

    }
    public void Check_out_button(WebDriver drive)
    {
        drive.findElement(By.id("checkout")).click();

    }
}
