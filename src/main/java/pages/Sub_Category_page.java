package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Sub_Category_page {

    public void Sub_category(WebDriver drive)
    {
        drive.findElement(By.cssSelector("img[alt=\"Picture for category Shoes\"][title=\"Show products in category Shoes\"]")).click();
    }

}
