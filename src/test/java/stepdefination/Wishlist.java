package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Wishlist {
    @And("user select WishList")
    public void select_WishList()
    {
        Hooks.drive.findElement(By.id("add-to-wishlist-button-25")).click();
    }
    @Then("message of adding to wishlist appear")
    public void message_of_adding_to_wishlist_appear()
    {
        String message=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(message.contains("The product has been added to your"));
    }
}
