package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DifferentTags {
    @When("click on tags")
    public void click_on_tags()
    {
        Hooks.drive.findElement(By.cssSelector("a[href=\"/cool\"]")).click();
    }
    @Then("site open selected tag")
    public void site_open_selected_tag()
    {
        Assert.assertEquals(Hooks.drive.getCurrentUrl(),"https://demo.nopcommerce.com/cool");
    }
}
