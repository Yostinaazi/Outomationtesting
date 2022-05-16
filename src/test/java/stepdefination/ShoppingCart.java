package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.Item_Page;
import pages.Sub_Category_page;
public class ShoppingCart {
    Item_Page item=new Item_Page();

    @And ("add to card")
    public void add_to_card()
    {
        item.Add_to_card(Hooks.drive);
    }

    @Then("Ensure the item on card")
    public void Ensure_the_item_on_card()
    {
        String item_added=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(item_added.contains("has been added"));
    }
}
