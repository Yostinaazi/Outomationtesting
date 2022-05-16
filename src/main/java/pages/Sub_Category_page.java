package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sub_Category_page
{
    public void Filter_color(WebDriver drive)
    {
        drive.findElement(By.cssSelector("img[alt=\"Picture for category Shoes\"][title=\"Show products in category Shoes\"]")).click();
    }
    public void Choose_Item(WebDriver drive)
    {
        drive.findElement(By.xpath("//div[@class=\"details\"]//h2[@class=\"product-title\"]//a[@href=\"/adidas-consortium-campus-80s-running-shoes\"]")).click();

    }

}
