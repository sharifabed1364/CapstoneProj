package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;
import utilities.UtilizerMethods;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:feature",
		glue = "step.definition",
		tags = " @TestHomePage",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = { "pretty","html:target/site/cucumber-pretty",
			"json:target/cucumber.json"},
			
		publish = true	
		
		
		)

public class TestRunner extends UtilizerMethods{
	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
		screenShotName();
		takeScreenShot();
		
	}

	
	
	
	
	
	


}
