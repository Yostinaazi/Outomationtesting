package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut_Payment_method_page {
    public void Payment_continue_button(WebDriver drive)
    {
        drive.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]")).click();
    }
}
