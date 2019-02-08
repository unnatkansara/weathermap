package TestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "D:\\weathermap\\weathermap\\src\\main\\java\\Features\\weathermapFeatures.feature",
			glue={"stepDefinitions"}, 
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, 
			strict = true, 
			dryRun = false 
			)
	 
	public class TestRunner {
	 
	}
	
