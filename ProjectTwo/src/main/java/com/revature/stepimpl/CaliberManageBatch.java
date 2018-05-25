package com.revature.stepimpl;

import org.openqa.selenium.WebDriver;

import com.revature.driver.DriverFactory;
import com.revature.pom.ManageBatch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberManageBatch {

	WebDriver driver = DriverFactory.getDriver("chrome");
	ManageBatch manageBatch = new ManageBatch(driver);
	
	@Given("^the user creates a new batch$")
	public void the_user_creates_a_new_batch() throws Throwable {
		manageBatch.createNewBatch().click();
	}

	@Given("^has the training name \"([^\"]*)\"$")
	public void the_training_name(String arg1) throws Throwable {
		
	}

	@Given("^has the training type \"([^\"]*)\"$")
	public void the_training_type(String arg1) throws Throwable {
		
	}

	@Given("^has the skill type \"([^\"]*)\"$")
	public void the_skill_type(String arg1) throws Throwable {
		
	}

	@Given("^has the location \"([^\"]*)\"$")
	public void the_location(String arg1) throws Throwable {
		
	}

	@Given("^has the trainer \"([^\"]*)\"$")
	public void the_trainer(String arg1) throws Throwable {
		
	}

	@Given("^has the co-trainer \"([^\"]*)\"$")
	public void the_co_trainer(String arg1) throws Throwable {
		
	}

	@Given("^has the start date day (\\d+) and month (\\d+) and year (\\d+)$")
	public void the_start_date_day_and_month_and_year(int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Given("^has the end date day (\\d+) and month (\\d+) and year (\\d+)$")
	public void the_end_date_day_and_month_and_year(int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Given("^has the good grade (\\d+)$")
	public void the_good_grade(int arg1) throws Throwable {
		
	}

	@Given("^has the passing grade (\\d+)$")
	public void the_passing_grade(int arg1) throws Throwable {
		
	}

	@Then("^the user sees the new batch$")
	public void the_user_sees_the_new_batch() throws Throwable {
		
	}
}
