package stepdefination;

import io.cucumber.java.en.And;
import pages.Category_page;
public class Categories {
Category_page category=new Category_page();
    @And("user choose category")
    public void user_choose_category()
    {
        category.category(Hooks.drive);
    }
}
