package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChechOut_confirm_order_page {
    public void confirm_continue_button(WebDriver drive)
    {
        drive.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]")).click();

    }
}
