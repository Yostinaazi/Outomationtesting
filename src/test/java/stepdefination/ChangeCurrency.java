package stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ChangeCurrency {
   // WebDriver drive=new ChromeDriver();

   Select curency;
    @When("user change currency")
    public void user_change_currency()
    {
        //curency=Select(drive.findElement(By.id("customerCurrency")));
        curency=new Select(Hooks.drive.findElement(By.cssSelector("a[class@")));
 //  curncy.selectByVisibleText("Euro");
        curency.selectByIndex(1);
    }
    @Then("website prices should be with Eruo")

    public void website_prices_should_be_with_Eruo(){
        String text= Hooks.drive.findElement(By.xpath("//span[@class=\"price actual-price\"]")).getText();
        Assert.assertTrue(text.contains("€"));
    }
}
