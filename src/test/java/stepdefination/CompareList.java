package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CompareList {
    @And("user click on Add to compare list")
        public void Add_to_compare_list()
        {
            Hooks.drive.findElement(By.cssSelector("div[class=\"compare-products\"]")).click();

        }

    @Then("message of adding to compare list")
    public void adding_to_compare_list()
    {
        String item_added=Hooks.drive.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(item_added.contains("product comparison"));
    }

}
