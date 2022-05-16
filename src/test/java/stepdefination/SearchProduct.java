package stepdefination;
import io.cucumber.java.en.And;
import pages.Home_page;
import pages.Sub_Category_page;
import pages.Item_Page;

public class SearchProduct {
    Home_page categoy=new Home_page();
    Item_Page item=new Item_Page();
    Sub_Category_page Sub_category=new Sub_Category_page();
    @And("user choose item")
    public void user_choose_item()
    {
        Sub_category.Choose_Item(Hooks.drive);
    }
    @And ("user select size")
    public void user_select_size()
    {
        item.select_size(Hooks.drive);
    }
}
