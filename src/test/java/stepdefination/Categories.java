package stepdefination;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;

public class Categories {

    @And("user choose category")
    public void user_choose_category()
    {
        Hooks.drive.findElement(By.linkText("Apparel")).click();
    }
}
