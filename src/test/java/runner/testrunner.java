package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src\\main\\resources\\fear",
        glue ="stepdefination",
        plugin = { "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cukes.xml",
        "rerun:target/rerun.txt"},
        dryRun  = false,
        tags = "@project"

)

public class testrunner {

}
