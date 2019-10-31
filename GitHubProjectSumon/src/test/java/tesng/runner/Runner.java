package tesng.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="cucumber/cucumber.feature",
		glue="com.stepdef"
		
		
		
		)

public class Runner extends AbstractTestNGCucumberTests {

}
