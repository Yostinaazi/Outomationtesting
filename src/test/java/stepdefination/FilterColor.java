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
    public  void user_choose_Sub_category() throws InterruptedException
    {
        SubCategory.Filter_color(Hooks.drive);
    }
    @Then("user can choose his favorite color")
    public void user_can_choose_his_favorite_color()
    {
        Assert.assertEquals("8a97a8",Hooks.drive.findElement(By.cssSelector("span[style=\"background-color:#8a97a8\"]")));
    }
}
