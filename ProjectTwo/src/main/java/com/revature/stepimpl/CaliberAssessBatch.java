package com.revature.stepimpl;

import com.revature.logs.LogHere;
import com.revature.pom.AssessBatch;

import cucumber.api.java.en.Then;

public class CaliberAssessBatch {

	AssessBatch assessBatch;
	
	@Then("^the user is on the assess batch page for the first time$")
	public void the_user_is_on_the_assess_batch_page_for_the_first_time() throws Throwable {
		assessBatch = new AssessBatch(CaliberGeneralGlueCode.driver);
		LogHere.warn("Neat");
	}
	
	
	
}
