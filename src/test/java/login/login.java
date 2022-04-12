package login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver drive;

    @Given("user open chrome browser to login")
    public void user_open_chrome_browser_to_login() {
        WebDriverManager.chromedriver().setup();
        throw new io.cucumber.java.PendingException();
    }

    @And("user go to demo home page to log in")
    public void Home_page_log() {
        drive = new ChromeDriver();
        drive.navigate().to("https://demo.nopcommerce.com/");
        //drive.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        throw new io.cucumber.java.PendingException();
    }

    @And("click at login link")
    public void click_at_login_link() {
         drive.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
        throw new io.cucumber.java.PendingException();
    }
}