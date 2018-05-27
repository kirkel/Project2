package com.revature.stepimpl;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.driver.DriverFactory;
import com.revature.pom.POM;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaliberGeneralGlueCode {

	static WebDriver driver;
	WebDriverWait wait;
	POM pom;
	
	@After  
	public void shutdowndriver() {
		driver.quit();
	}
	
	@Given("^a user opens a web browser to visit the Caliber website$")
	public void a_user_opens_a_web_browser_to_visit_the_Caliber_website() throws Throwable {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().window().maximize();
		
		// Need to wait for homepage to load; could be written better!
		// not supposed to have a timer or timeout, but this functions for now 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		pom = new POM (driver, true);
		assertEquals("Caliber | Performance Management", pom.getPageTitle());
	}
	
	@Then("^the user returns back to the previous page$")
	public void the_user_returns_back_to_the_previous_page() throws Throwable {
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	@Then("^the user clicks on the Revature logo$")
	public void the_user_clicks_on_the_Revature_logo() throws Throwable {
		pom.getLogoButton();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on the home button$")
	public void the_user_clicks_on_the_home_button() throws Throwable {
		pom.getHomeButton();
		Thread.sleep(1000);
	}
	
	@Then("^the user clicks on manage batch$")
	public void the_user_clicks_on_manage_batch() throws Throwable {
		pom.getManageBatchButton();
		Thread.sleep(1000);
	}
	
	
	@Then("^the user clicks on assess batch$")
	public void the_user_clicks_on_assess_batch() throws Throwable {
		pom.getAssessBatchButton();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on reports$")
	public void the_user_clicks_on_reports() throws Throwable {
		pom.getReportsButton();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on the Revature link and returns to the previous page$")
	public void the_user_clicks_on_the_Revature_link_and_returns_to_the_previous_page() throws Throwable {
		String winHandleBefore = driver.getWindowHandle();
		pom.getRevatureLink();
		Thread.sleep(2000);
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
	}
	
	@Then("^the user clicks on the phone number$")
	public void the_user_clicks_on_the_phone_number() throws Throwable {
		pom.getPhoneNumber();
		Thread.sleep(1000);
	}

	@Then("^the user clicks on the email$")
	public void the_user_clicks_on_the_email() throws Throwable {
		pom.getEmail();
		Thread.sleep(1000);
	}
	
}
