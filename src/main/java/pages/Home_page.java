package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Home_page {
    Select curency;
    public void category(WebDriver drive)
    {
        drive.findElement(By.linkText("Apparel")).click();
    }
    public void currency(WebDriver drive)
    {
        curency=new Select(drive.findElement(By.id("customerCurrency")));
        curency.selectByIndex(1);
    }
}
