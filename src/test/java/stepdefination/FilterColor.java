package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FilterColor {
    @And("user choose Sub_category")
    public  void user_choose_Sub_category() throws InterruptedException {
//        Hooks.drive.findElement(By.cssSelector("div[class=\"sublist-toggle\"]"));
//
//        Hooks.drive.findElement(By.cssSelector("div[class=\"picture\"]")).click();
Hooks.drive.findElement(By.cssSelector("img[alt=\"Picture for category Shoes\"][title=\"Show products in category Shoes\"]")).click();
    }
    @Then("user can choose his favorite color")
    public void user_can_choose_his_favorite_color()
    {
        Assert.assertEquals("8a97a8",Hooks.drive.findElement(By.cssSelector("span[style=\"background-color:#8a97a8\"]")));
    }
}
