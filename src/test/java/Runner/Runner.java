package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/build/test-report/cucumber.json" , "html:target/build/test-report/reports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@UC_LOGIN_AND_REGISTER"
		)
public class Runner {
}

