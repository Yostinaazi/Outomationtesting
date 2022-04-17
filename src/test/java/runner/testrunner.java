package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\fear",
        glue ="stepdefination",
        plugin = { "pretty" , "html:target/cucumber-reports" },
        monochrome = true,
        tags = "@project"

)

public class testrunner {

}
