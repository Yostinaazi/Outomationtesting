package stepdefination;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class successfulOrder {
    Select cuntry;
    Select StateC;
        @And ("go to card")
    public void go_to_card() {
            Hooks.drive.findElement(By.id("topcartlink")).click();
        }
    @And ("user click on check box read terms")
    public void check_box_read_terms()
    {
        Hooks.drive.findElement(By.id("termsofservice")).click();
    }
    @And ("user click on CHECK OUT")

    public void click_on_CHECK_OUT()
    {
        Hooks.drive.findElement(By.id("checkout")).click();
    }
    @And  ("user fill Billing address")
    public void Billing_address()
    {
        cuntry =  new Select(Hooks.drive.findElement(By.id("BillingNewAddress_CountryId")));
        cuntry.selectByIndex(1);
        StateC =  new Select(Hooks.drive.findElement(By.id("BillingNewAddress_CountryId")));
        StateC.selectByIndex(5);
        Hooks.drive.findElement(By.id("BillingNewAddress_City")).sendKeys("kintaky");
        Hooks.drive.findElement(By.id("BillingNewAddress_Address1")).sendKeys("30 time street");
        Hooks.drive.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("03");
        Hooks.drive.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0960656565");
        Hooks.drive.findElement(By.name("save")).click();
    }
    @And ("user choose Shipping method")
    public void Shipping_method()
    {
        Hooks.drive.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();
    }
    @And  ("user choose Payment method")
    public void Payment_method()
    {
        Hooks.drive.findElement(By.name("save")).click();
    }

    public void re()
{
    Hooks.drive.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]")).click();

    Hooks.drive.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
}

    }


