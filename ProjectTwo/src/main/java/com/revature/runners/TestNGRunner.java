package com.revature.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/Caliber1HomePage.feature", "src/test/Caliber3AssessBatch.feature", 
				"src/test/Caliber2ManageBatch.feature", "src/test/Caliber4Reports.feature", },
		glue= {"com.revature.stepimpl"},
		plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true
	)
public class TestNGRunner extends AbstractTestNGCucumberTests{}