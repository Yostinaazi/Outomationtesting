package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.Item_Page;
import pages.Cart_page;
import pages.Check_out_billing_page;
import pages.CheckOut_Shipping_method_page;
import pages.CheckOut_Payment_method_page;
import pages.CheckOut_payment_info_Page;
import pages.ChechOut_confirm_order_page;
public class successfulOrder {
    Item_Page item=new Item_Page();
    Cart_page cart_page=new Cart_page();
    Check_out_billing_page billing=new Check_out_billing_page();
    CheckOut_Shipping_method_page Shipping_method=new CheckOut_Shipping_method_page();
    CheckOut_Payment_method_page payment_method=new CheckOut_Payment_method_page();
    CheckOut_payment_info_Page payment_info=new CheckOut_payment_info_Page();
    ChechOut_confirm_order_page confirm=new ChechOut_confirm_order_page();
        @And ("go to card")
    public void go_to_card()
        {
          item.Shopping_cart(Hooks.drive);
        }
    @And ("user click on check box read terms")
    public void check_box_read_terms()
    {
        cart_page.read_terms(Hooks.drive);
    }
    @And ("user click on CHECK OUT")

    public void click_on_CHECK_OUT()
    {
        cart_page.Check_out_button(Hooks.drive);
    }
    @And  ("user fill Billing address")
    public void Billing()
    {
        billing.country(Hooks.drive);
       billing.State(Hooks.drive);
        billing.City(Hooks.drive);
        billing.address(Hooks.drive);
        billing.Zip_code(Hooks.drive);
        billing.Phone_number(Hooks.drive);
        billing.continue_button(Hooks.drive);

    }
    @And ("user choose Shipping method")
    public void Shipping_method()
    {
        Shipping_method.Continue_buton(Hooks.drive);
    }
    @And  ("user choose Payment method")
    public void Payment_method()
    {
payment_method.Payment_continue_button(Hooks.drive);
    }
   @And ("user reading Payment Info")
    public void Payment_info()
{
payment_info.payment_info_continue_button(Hooks.drive);
}
    @And ("user click on confirm")
    public void confirm()
    {
       confirm.confirm_continue_button(Hooks.drive);
    }
    @Then("message 'Your order has been successfully processed!' appear")
    public void successfully()
    {
       String success=Hooks.drive.findElement(By.cssSelector("a[href=\"/orderdetails/1031\"]")).toString();
        Assert.assertTrue(success.contains("1031"));
    }

    }


