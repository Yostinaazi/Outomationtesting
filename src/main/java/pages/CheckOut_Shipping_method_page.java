package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut_Shipping_method_page {
       public void Continue_buton (WebDriver drive) {
           drive.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();
       }
}
