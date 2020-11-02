package activitiesRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"stepDefinition"},
		tags = {"@activity2_4"},
		strict = true,
		plugin = {"json: test-reports/json-report.json"},
	    monochrome = true
)
public class Runner {

}
