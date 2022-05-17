package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Category_page;
import pages.Sub_Category_page;

public class FilterColor {
    Sub_Category_page SubCategory=new Sub_Category_page();
    @And("user choose Sub_category")
    public  void user_choose_Sub_category()
    {
        SubCategory.choose_sub_category(Hooks.drive);
    }
    @And ("user filter with color")
    public void filter_with_color()
    {
        SubCategory.Filter_color(Hooks.drive);

    }


    @Then("filtered items will appear")
    public void user_can_choose_his_favorite_color()
    {
        String color= Hooks.drive.findElement(By.cssSelector("a[title=\"Show details for adidas Consortium Campus 80s Running Shoes\"]")).toString();
        Assert.assertTrue(color.contains("Show details for adidas Consortium Campus 80s Running Shoes"));
    }
}
