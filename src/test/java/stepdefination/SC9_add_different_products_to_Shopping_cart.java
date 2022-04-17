package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SC9_add_different_products_to_Shopping_cart {
    @And("user choose item")
   public void user_choose_item() {
        Hooks.drive.findElement(By.xpath("//div[@class=\"details\"]//h2[@class=\"product-title\"]//a[@href=\"/adidas-consortium-campus-80s-running-shoes\"]")).click();
    }
    @And ("add to card")
    public void add_to_card()
    {
        Hooks.drive.findElement(By.id("add-to-cart-button-25")).click();
    }
    @And ("user select size")
    public void user_select_size()
    {
        Select size=new Select(Hooks.drive.findElement(By.id("product_attribute_9")));
      size.selectByIndex(1);

    }
    @Then("Ensure the item on card")
    public void Ensure_the_item_on_card()
    {
        String item_added=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(item_added.contains("has been added"));
    }
}
