package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Item_Page;
public class Wishlist {
    Item_Page item=new Item_Page();
    @And("user select WishList")
    public void select_WishList()
    {
        item.Add_to_wishlist(Hooks.drive);

    }
    @Then("message of adding to wishlist appear")
    public void message_of_adding_to_wishlist_appear()
    {
        String message=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(message.contains("The product has been added to your"));
    }
}
