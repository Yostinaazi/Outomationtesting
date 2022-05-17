package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut_payment_info_Page {
    public void payment_info_continue_button(WebDriver drive)
    {
        drive.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]")).click();

    }
}
