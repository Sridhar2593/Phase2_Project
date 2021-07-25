package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-html","json:target/cucumber.json"},
		features = "src/test/java/FeatureFiles",
		tags = {"@NegativeLogin, @PositiveLogin, @DataTable, @ProductFeature"},
		//tags = {"@DataTable, @ProductFeature"},
		glue = {"StepDefinitions"}
		)

public class TestRunnerClass {
	
	

}
