package com.revature.testNG.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
//		format = {"pretty"},
//		features = {"src/test/CaliberHomePage.feature", "src/test/CaliberAssessBatch.feature",
//				"src/test/CaliberManageBatch.feature", "src/test/CaliberReports.feature", },
		// TODO Enter feature files.
		features = {"src/main/test/AngularTestNG.feature"},
		glue= {"com.revature.testNG.stepImpl"}
	)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}