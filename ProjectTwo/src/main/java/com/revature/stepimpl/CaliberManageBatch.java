package com.revature.stepimpl;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.revature.driver.DriverFactory;
import com.revature.pom.HomePage;
import com.revature.pom.ManageBatch;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaliberManageBatch {

	WebDriver driver = DriverFactory.getDriver("chrome");
	ManageBatch manageBatch = new ManageBatch(driver);
	HomePage home;

	@When("^the user sees the Manage Batch Page$")
	public void the_user_sees_the_Manage_Batch_Page() throws Throwable {
		assertEquals(driver.findElement(By.id("manage")), driver.findElement(By.xpath("//*[@id=\"manage\"]")));
	}
	
	@Given("^the user creates a new batch$")
	public void the_user_creates_a_new_batch() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"manage\"]/div[1]/div/div/ul/li[3]")).click();
	}

	@Given("^has the training name \"([^\"]*)\"$")
	public void has_the_training_name(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"trainingName\"]"));
	}

	@Given("^has the start date day (\\d+) and month (\\d+) and year (\\d+)$")
	public void has_the_start_date_day_and_month_and_year(int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Given("^has the end date day (\\d+) and month (\\d+) and year (\\d+)$")
	public void has_the_end_date_day_and_month_and_year(int arg1, int arg2, int arg3) throws Throwable {
		
	}

	@Given("^has the good grade (\\d+)$")
	public void has_the_good_grade(int arg1) throws Throwable {
		
	}

	@Given("^has the passing grade (\\d+)$")
	public void has_the_passing_grade(int arg1) throws Throwable {
		
	}

	@Then("^the user sees the new batch$")
	public void the_user_sees_the_new_batch() throws Throwable {
	}


	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
}
