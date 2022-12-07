package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@smoke_test",
        features = "src/test/resources/features",
        glue = "Step_Definitions",
        dryRun = false,
		publish = true,
        plugin = "json:target/cucumber.json"

)
public class CukesRunner {

}
