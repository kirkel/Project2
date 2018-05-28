package com.revature.stepimpl;

import com.revature.pom.ManageBatch;

import cucumber.api.java.en.Then;

public class CaliberManageBatch {

	ManageBatch manageBatch;
	
	@Then("^the user is on the manage batch page for the first time$")
	public void the_user_is_on_the_manage_batch_page_for_the_first_time() throws Throwable {
		manageBatch = new ManageBatch(CaliberGeneralGlueCode.driver);
	}
	
}
