package com.revature.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
//		features = {"src/test/CaliberHomePage.feature", "src/test/CaliberAssessBatch.feature",
//				"src/test/CaliberManageBatch.feature", "src/test/CaliberReports.feature", },
		features = {"src/test/CaliberHomePage.feature"},
		glue= {"com.revature.stepimpl"}
	)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}