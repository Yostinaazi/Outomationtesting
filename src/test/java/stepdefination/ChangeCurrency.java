package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.Category_page;
public class ChangeCurrency {
    Category_page Category=new Category_page();
    @When("user change currency")
    public void user_change_currency()
    {
       Category.currency(Hooks.drive);
    }
    @Then("website prices should be with Eruo")

    public void website_prices_should_be_with_Eruo(){
        String text= Hooks.drive.findElement(By.xpath("//span[@class=\"price actual-price\"]")).getText();
        Assert.assertTrue(text.contains("€"));
    }
}
