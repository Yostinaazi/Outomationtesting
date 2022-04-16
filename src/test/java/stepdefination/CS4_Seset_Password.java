package stepdefination;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CS4_Seset_Password {

    @And("user writer Email")
    public void user_wreite_Email() throws InterruptedException {
      //  drive=new ChromeDriver();
       Hooks.drive.findElement(By.id("Email")).sendKeys("yosuc4ena8");
    }
    @And ("user click on link ForgetPassword")
    public void user_click_on_link_ForgetPassword()
    {
        Hooks.drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Hooks.drive.findElement(By.linkText("Forgot password?")).click();
    }



}
