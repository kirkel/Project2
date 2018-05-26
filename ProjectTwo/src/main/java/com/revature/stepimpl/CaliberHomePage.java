package com.revature.stepimpl;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.driver.DriverFactory;
import com.revature.pom.HomePage;
import com.revature.pom.ManageBatch;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CaliberHomePage {

	WebDriver driver;
	WebDriverWait wait;
	HomePage home;
	ManageBatch manageBatch;
	
	@Given("^a user opens a web browser$")
	public void a_user_opens_a_web_browser() throws Throwable {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().window().maximize();
		
		// Need to wait for homepage to load; could be written better!
		// not supposed to have a timer or timeout, but this functions for now 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Given("^navigates to the Caliber website$")
	public void navigates_to_the_Caliber_website() throws Throwable {
		home = new HomePage(driver);
		assertEquals("Caliber | Performance Management", home.getPageTitle());
	}
	
	@When("^a user clicks on the Manage Batch button$")
	public void a_user_clicks_on_the_Manage_Batch_button() throws Throwable {
		home.getManageBatchButton();
	}
	
	
	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
	
}
