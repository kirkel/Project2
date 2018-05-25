package com.revature.tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.revature.driver.DriverFactory;

public class CaliberSiteNavigationTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeSuite
	public void beforeSuite() {
		driver = DriverFactory.getDriver("Chrome");
		
		// for any element, wait 3 seconds before determining a fail 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// configure our drivers explicit wait as soon as it is instantiated 
		// for a specific action, wait 4 seconds before determining a fail 
		wait = new WebDriverWait(driver, 4);
	}
	
	@Test(priority=1)
	public void navigateToCaliber() {
		driver.get("https://dev-caliber.revature.tech/");
	}

	@Test(priority=2)
	public void validateSuccessfulNavigationToCaliber() {
		assertEquals("Caliber | Performance Management", driver.getTitle());
	}
	
	
	
	
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
