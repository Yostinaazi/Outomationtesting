package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver drive;
    @Before
    public  static void open_browser()
    {
        WebDriverManager.chromedriver().setup();
        drive=new ChromeDriver();
        drive.navigate().to("https://demo.nopcommerce.com/");
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
//    @After
//    public static void Quit()
//    {
//        drive.quit();
//    }

}
