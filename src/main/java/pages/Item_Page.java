package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Item_Page {
    public void Add_to_copmparelist(WebDriver drive)
    {
        drive.findElement(By.cssSelector("div[class=\"compare-products\"]")).click();

    }
    public void Add_to_card(WebDriver drive)
    {
        drive.findElement(By.id("add-to-cart-button-25")).click();
    }
    public void Add_to_wishlist(WebDriver drive)
    {
        drive.findElement(By.id("add-to-wishlist-button-25")).click();
    }
    public void select_size(WebDriver drive)
    {
        Select size=new Select(drive.findElement(By.id("product_attribute_9")));
        size.selectByIndex(1);
    }
    public void Shopping_cart(WebDriver drive)
    {
        drive.findElement(By.id("topcartlink")).click();
    }
}
