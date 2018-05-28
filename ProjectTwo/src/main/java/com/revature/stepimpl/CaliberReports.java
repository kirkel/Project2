package com.revature.stepimpl;

import com.revature.pom.Reports;

import cucumber.api.java.en.Then;

public class CaliberReports {

	Reports reports;
	
	@Then("^the user is on the reports page for the first time$")
	public void the_user_is_on_the_reports_page_for_the_first_time() throws Throwable {
		reports = new Reports(CaliberGeneralGlueCode.driver);
	}
}
