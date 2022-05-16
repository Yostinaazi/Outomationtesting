package stepdefination;

import io.cucumber.java.en.And;
import pages.Home_page;
public class Categories {
Home_page category=new Home_page();
    @And("user choose category")
    public void user_choose_category()
    {
        category.category(Hooks.drive);
    }
}
