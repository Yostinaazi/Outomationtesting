package stepdefination;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SC6_different_Categories {

    @When("user choose category")
    public void user_choose_category()
    {
        Hooks.drive.findElement(By.linkText("Apparel")).click();
    }
}
