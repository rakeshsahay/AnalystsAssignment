package com.qa.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;

//import cucumber.api.junit.Cucumber;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\SeleniumProject\\Assignments\\ACS_Testfinal\\src\\main\\java\\com\\qa\\Features\\",
		//features = "features"
		glue={"com\\qa\\StepDefinition"},
		monochrome=true,
		dryRun=false,
		format={"pretty",
				"html:target/cucumber-report/cucumber-pretty",
				"json:target/cucumber-report/Cucumber-TestReport.json",
				"rerun:target/cucumber-report/rerun.txt"
				},plugin= "json:target/cucumber-report/Cucumber-TestReport.json")

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }  
}
