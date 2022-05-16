package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut_Payment_method_page {
    public void Payment_continue_button(WebDriver drive)
    {
        drive.findElement(By.name("save")).click();
    }
}
