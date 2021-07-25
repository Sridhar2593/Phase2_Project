package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-html","json:target/cucumber.json"},
		features = "src/test/java/FeatureFiles",
		//tags = {"@DataTable"},
		tags = {"@NegativeLogin, @PositiveLogin, @DataTable, @ProductFeature"},//or condition and ~ symbol to exclude a tag
		glue = {"StepDefinitions"}
		)

public class TestRunnerClass {
	
	

}
