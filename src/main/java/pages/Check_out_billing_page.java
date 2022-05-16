package pages;

import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_out_billing_page {
    Select cuntry;
    Select StateC;
    public void country(WebDriver drive)
    {
        cuntry =  new Select(drive.findElement(By.id("BillingNewAddress_CountryId")));
        cuntry.selectByIndex(1);
    }
    public void State(WebDriver drive)
    {
        StateC =  new Select(drive.findElement(By.cssSelector("select[id=\"BillingNewAddress_CountryId\"]")));
        StateC.selectByIndex(2);
    }
    public void City(WebDriver drive)
    {
        drive.findElement(By.id("BillingNewAddress_City")).sendKeys("kintaky");
    }
    public void address(WebDriver drive)
    {
        drive.findElement(By.id("BillingNewAddress_Address1")).sendKeys("30 time street");

    }
    public void Zip_code(WebDriver drive)
    {
        drive.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("03");
    }
    public void Phone_number(WebDriver drive)
    {
        drive.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0960656565");
    }
    public void continue_button(WebDriver drive)
    {
        drive.findElement(By.name("save")).click();
    }

}
