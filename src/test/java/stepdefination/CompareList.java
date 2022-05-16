package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Sub_Category_page;
import pages.Item_Page;
public class CompareList {
    Sub_Category_page Sub_category= new Sub_Category_page();
    Item_Page item=new Item_Page();
    @And("user click on Add to compare list")
        public void Add_to_compare_list()
        {
            item.Add_to_copmparelist(Hooks.drive);
        }

    @Then("message of adding to compare list")
    public void adding_to_compare_list()
    {
        String item_added=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(item_added.contains("product comparison"));
    }

}
