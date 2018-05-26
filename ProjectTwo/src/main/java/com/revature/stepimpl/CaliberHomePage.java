package com.revature.stepimpl;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.driver.DriverFactory;
import com.revature.pom.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberHomePage {

	WebDriver driver;
	WebDriverWait wait;
	HomePage home;
	
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
	
	@Then("^the user should see the home page$")
	public void the_user_should_see_the_home_page() throws Throwable {
		// The below will qualify for any given page! This is not what we want! 
		// ***** NEED MORE ROBUST TEST HERE *****
		//assertEquals("Caliber | Performance Management", home.getPageTitle());
		
		
	}
	
	@Then("^the user clicks on the Revature logo$")
	public void the_user_clicks_on_the_Revature_logo() throws Throwable {
		home.getLogoButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		wait = new WebDriverWait(driver, 10);
	}

	@Then("^the user clicks on the home button$")
	public void the_user_clicks_on_the_home_button() throws Throwable {
		home.getHomeButton();
	}

	@Then("^the user clicks on manage batch and back home$")
	public void the_user_clicks_on_manage_batch_and_back_home() throws Throwable {		
		home.getManageBatchButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		wait = new WebDriverWait(driver, 10);
		driver.navigate().back();
		// assert home
	}

	@Then("^the user clicks on assess batch and back home$")
	public void the_user_clicks_on_assess_batch_and_back_home() throws Throwable {
		
	}

	@Then("^the user clicks on reports and back home$")
	public void the_user_clicks_on_reports_and_back_home() throws Throwable {
		
	}

	@Then("^the user clicks on user guide and back home$")
	public void the_user_clicks_on_user_guide_and_back_home() throws Throwable {
		
	}
	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
	
}
